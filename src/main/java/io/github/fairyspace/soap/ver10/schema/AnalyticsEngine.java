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
@XmlType(name = "AnalyticsEngine", propOrder = { "analyticsEngineConfiguration", "any" })
public class AnalyticsEngine extends ConfigurationEntity {

    @XmlElement(name = "AnalyticsEngineConfiguration", required = true)
    protected AnalyticsDeviceEngineConfiguration analyticsEngineConfiguration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public AnalyticsDeviceEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }


    public void setAnalyticsEngineConfiguration(AnalyticsDeviceEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
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
