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

/**
 * <pre>
 * <complexType name="VideoAnalyticsConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="AnalyticsEngineConfiguration" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineConfiguration"/>
 *         <element name="RuleEngineConfiguration" type="{http://www.onvif.org/ver10/schema}RuleEngineConfiguration"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAnalyticsConfiguration", propOrder = { "analyticsEngineConfiguration", "ruleEngineConfiguration", "any" })
public class VideoAnalyticsConfiguration extends ConfigurationEntity {

    @XmlElement(name = "AnalyticsEngineConfiguration", required = true)
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
    @XmlElement(name = "RuleEngineConfiguration", required = true)
    protected RuleEngineConfiguration ruleEngineConfiguration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }


    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }


    public RuleEngineConfiguration getRuleEngineConfiguration() {
        return ruleEngineConfiguration;
    }


    public void setRuleEngineConfiguration(RuleEngineConfiguration value) {
        this.ruleEngineConfiguration = value;
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

