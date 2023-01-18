package io.github.fairyspace.api;

import io.github.fairyspace.bean.OnvifDevice;
import io.github.fairyspace.util.AuthUtil;
import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;

import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import java.net.ConnectException;

@Slf4j
public class SOAP {
    public Object createSOAPDeviceRequest(Object soapRequestElem, Object soapResponseElem, String requestUri, boolean needsAuthentification, OnvifDevice onvifDevice) throws SOAPException,
            ConnectException {
        return createSOAPRequest(soapRequestElem, soapResponseElem, requestUri, needsAuthentification,onvifDevice);
    }

    public Object createSOAPPtzRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification,OnvifDevice onvifDevice) throws SOAPException, ConnectException {
        return createSOAPRequest(soapRequestElem, soapResponseElem, "getPtzUri", needsAuthentification, onvifDevice);
    }

    public Object createSOAPMediaRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification,OnvifDevice onvifDevice) throws SOAPException, ConnectException {
        return createSOAPRequest(soapRequestElem, soapResponseElem, "getMediaUri", needsAuthentification, onvifDevice);
    }

    public Object createSOAPImagingRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification,OnvifDevice onvifDevice) throws SOAPException,
            ConnectException {
        return createSOAPRequest(soapRequestElem, soapResponseElem, "getImagingUri", needsAuthentification, onvifDevice);
    }

    public Object createSOAPEventsRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification,OnvifDevice onvifDevice) throws SOAPException,
            ConnectException {
        return createSOAPRequest(soapRequestElem, soapResponseElem, "getEventsUri", needsAuthentification, onvifDevice);
    }

    /**
     * @param soapResponseElem Answer object for SOAP request
     * @param onvifDevice
     * @return SOAP Response Element
     * @throws SOAPException
     * @throws ConnectException
     */
    public Object createSOAPRequest(Object soapRequestElem, Object soapResponseElem, String soapUri, boolean needsAuthentification, OnvifDevice onvifDevice) throws ConnectException,
            SOAPException {
        SOAPConnection soapConnection = null;
        SOAPMessage soapResponse = null;
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();

        try {
            // Create SOAP Connection
            soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage soapMessage = createSoapMessage(soapRequestElem, needsAuthentification,onvifDevice);
            soapResponse = soapConnection.call(soapMessage, soapUri);

            if (soapResponseElem == null) {
                throw new NullPointerException("Improper SOAP Response Element given (is null).");
            }

            Unmarshaller unmarshaller = JAXBContext.newInstance(soapResponseElem.getClass()).createUnmarshaller();
            try {
                try {
                    soapResponseElem = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
                } catch (SOAPException e) {
                    // Second try for SOAP 1.2
                    // Sorry, I don't know why it works, it just does o.o
                    soapResponseElem = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
                }
            } catch (UnmarshalException e) {
                // Fault soapFault = (Fault)
                // unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());

                // throw new SOAPFaultException(soapFault);
            }

            return soapResponseElem;
        } catch (SOAPException e) {
            log.error("Unexpected response. Response should be from class " + soapResponseElem.getClass() + ", but response is: " + soapResponse);
            throw e;
        } catch (ParserConfigurationException | JAXBException e) {
            log.error("Unhandled exception: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            try {
                soapConnection.close();
            } catch (SOAPException e) {
            }
        }
    }

    protected SOAPMessage createSoapMessage(Object soapRequestElem, boolean needAuthentification, OnvifDevice onvifDevice) throws SOAPException, ParserConfigurationException,
            JAXBException {
        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SOAPMessage soapMessage = messageFactory.createMessage();

        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Marshaller marshaller = JAXBContext.newInstance(soapRequestElem.getClass()).createMarshaller();
        marshaller.marshal(soapRequestElem, document);
        soapMessage.getSOAPBody().addDocument(document);

        // if (needAuthentification)
        createSoapHeader(soapMessage, onvifDevice.getUsername(), onvifDevice.getPassword());
        soapMessage.saveChanges();
        return soapMessage;
    }

    protected void createSoapHeader(SOAPMessage soapMessage, String userName, String password) throws SOAPException {
        String nonce = AuthUtil.createNonce();
        String encrypedPassword = AuthUtil.encryptPassword(password,nonce);
        String encryptedNonce = AuthUtil.getEncryptedNonce(nonce);
        String utcTime = AuthUtil.getUTCTime();

        if (encrypedPassword != null && userName != null) {
            SOAPPart sp = soapMessage.getSOAPPart();
            SOAPEnvelope se = sp.getEnvelope();
            SOAPHeader header = soapMessage.getSOAPHeader();
            se.addNamespaceDeclaration("wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
            se.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

            SOAPElement securityElem = header.addChildElement("Security", "wsse");
            // securityElem.setAttribute("SOAP-ENV:mustUnderstand", "1");

            SOAPElement usernameTokenElem = securityElem.addChildElement("UsernameToken", "wsse");

            SOAPElement usernameElem = usernameTokenElem.addChildElement("Username", "wsse");
            usernameElem.setTextContent(userName);

            SOAPElement passwordElem = usernameTokenElem.addChildElement("Password", "wsse");
            passwordElem.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
            passwordElem.setTextContent(encrypedPassword);

            SOAPElement nonceElem = usernameTokenElem.addChildElement("Nonce", "wsse");
            nonceElem.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
            nonceElem.setTextContent(encryptedNonce);

            SOAPElement createdElem = usernameTokenElem.addChildElement("Created", "wsu");
            createdElem.setTextContent(utcTime);
        }
    }


}
