package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/2
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsDeviceEngineConfiguration", propOrder = { "engineConfiguration", "extension" })
public class AnalyticsDeviceEngineConfiguration {

    @XmlElement(name = "EngineConfiguration", required = true)
    protected List<EngineConfiguration> engineConfiguration;
    @XmlElement(name = "Extension")
    protected AnalyticsDeviceEngineConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public List<EngineConfiguration> getEngineConfiguration() {
        if (engineConfiguration == null) {
            engineConfiguration = new ArrayList<EngineConfiguration>();
        }
        return this.engineConfiguration;
    }


    public AnalyticsDeviceEngineConfigurationExtension getExtension() {
        return extension;
    }


    public void setExtension(AnalyticsDeviceEngineConfigurationExtension value) {
        this.extension = value;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
