package io.github.fairyspace.api;

import io.github.fairyspace.bean.OnvifDevice;
import io.github.fairyspace.soap.ver10.device.GetDeviceInformation;
import io.github.fairyspace.soap.ver10.device.GetDeviceInformationResponse;

import javax.xml.soap.SOAPException;
import java.net.ConnectException;


public class ONVIF {
    public static GetDeviceInformationResponse getDeviceInformation(String host, String userName, String password) {
        SOAP soap = new SOAP();
        OnvifDevice onvifDevice = new OnvifDevice(host,userName,password);
        String requestUri = String.format("http://%s/onvif/device_service", host);
        GetDeviceInformation getDeviceInformation = new GetDeviceInformation();
        GetDeviceInformationResponse response = new GetDeviceInformationResponse();
        try {
            response = (GetDeviceInformationResponse) soap.createSOAPDeviceRequest(getDeviceInformation, response, requestUri,true,onvifDevice);
        } catch (SOAPException | ConnectException e) {
            e.printStackTrace();
            return null;
        }
        return response;
    }


    public static void main(String[] args) {
        GetDeviceInformationResponse deviceInformation = getDeviceInformation("192.168.101.111", "admin", "admin123");
        System.err.println(deviceInformation);
    }

}
