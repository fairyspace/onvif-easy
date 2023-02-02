package io.github.fairyspace.soap.ver10.schema;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: onvif-easy
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/2/1
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioOutputConfiguration", propOrder = { "outputToken", "sendPrimacy", "outputLevel", "any" })
public class AudioOutputConfiguration extends ConfigurationEntity {

    @XmlElement(name = "OutputToken", required = true)
    protected String outputToken;
    @XmlElement(name = "SendPrimacy")
    @XmlSchemaType(name = "anyURI")
    protected String sendPrimacy;
    @XmlElement(name = "OutputLevel")
    protected int outputLevel;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public String getOutputToken() {
        return outputToken;
    }


    public void setOutputToken(String value) {
        this.outputToken = value;
    }


    public String getSendPrimacy() {
        return sendPrimacy;
    }

    public void setSendPrimacy(String value) {
        this.sendPrimacy = value;
    }


    public int getOutputLevel() {
        return outputLevel;
    }


    public void setOutputLevel(int value) {
        this.outputLevel = value;
    }


    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}