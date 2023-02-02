package io.github.fairyspace.soap.ver10.schema;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
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
@XmlType(name = "MetadataConfiguration", propOrder = { "ptzStatus", "events", "analytics", "multicast", "sessionTimeout", "any",
        "analyticsEngineConfiguration", "extension" })
public class MetadataConfiguration extends ConfigurationEntity {

    @XmlElement(name = "PTZStatus")
    protected PTZFilter ptzStatus;
    @XmlElement(name = "Events")
    protected EventSubscription events;
    @XmlElement(name = "Analytics")
    protected Boolean analytics;
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "AnalyticsEngineConfiguration")
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
    @XmlElement(name = "Extension")
    protected MetadataConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public PTZFilter getPTZStatus() {
        return ptzStatus;
    }


    public void setPTZStatus(PTZFilter value) {
        this.ptzStatus = value;
    }


    public EventSubscription getEvents() {
        return events;
    }


    public void setEvents(EventSubscription value) {
        this.events = value;
    }


    public Boolean isAnalytics() {
        return analytics;
    }


    public void setAnalytics(Boolean value) {
        this.analytics = value;
    }


    public MulticastConfiguration getMulticast() {
        return multicast;
    }


    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }


    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
    }


    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }


    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }


    public MetadataConfigurationExtension getExtension() {
        return extension;
    }


    public void setExtension(MetadataConfigurationExtension value) {
        this.extension = value;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}