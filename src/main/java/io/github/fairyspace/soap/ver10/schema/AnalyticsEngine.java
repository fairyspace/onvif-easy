package io.github.fairyspace.soap.ver10.schema;

import org.w3c.dom.Element;

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
