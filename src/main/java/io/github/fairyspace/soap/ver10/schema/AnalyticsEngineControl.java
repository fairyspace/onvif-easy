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
 * 🍁 Create: 2023/2/2
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsEngineControl", propOrder = { "engineToken", "engineConfigToken", "inputToken", "receiverToken", "multicast", "subscription", "mode",
        "any" })
public class AnalyticsEngineControl extends ConfigurationEntity {

    @XmlElement(name = "EngineToken", required = true)
    protected String engineToken;
    @XmlElement(name = "EngineConfigToken", required = true)
    protected String engineConfigToken;
    @XmlElement(name = "InputToken", required = true)
    protected List<String> inputToken;
    @XmlElement(name = "ReceiverToken", required = true)
    protected List<String> receiverToken;
    @XmlElement(name = "Multicast")
    protected MulticastConfiguration multicast;
    @XmlElement(name = "Subscription", required = true)
    protected Config subscription;
    @XmlElement(name = "Mode", required = true)
    protected ModeOfOperation mode;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public String getEngineToken() {
        return engineToken;
    }


    public void setEngineToken(String value) {
        this.engineToken = value;
    }


    public String getEngineConfigToken() {
        return engineConfigToken;
    }


    public void setEngineConfigToken(String value) {
        this.engineConfigToken = value;
    }


    public List<String> getInputToken() {
        if (inputToken == null) {
            inputToken = new ArrayList<String>();
        }
        return this.inputToken;
    }


    public List<String> getReceiverToken() {
        if (receiverToken == null) {
            receiverToken = new ArrayList<String>();
        }
        return this.receiverToken;
    }


    public MulticastConfiguration getMulticast() {
        return multicast;
    }


    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }


    public Config getSubscription() {
        return subscription;
    }


    public void setSubscription(Config value) {
        this.subscription = value;
    }


    public ModeOfOperation getMode() {
        return mode;
    }


    public void setMode(ModeOfOperation value) {
        this.mode = value;
    }


    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
