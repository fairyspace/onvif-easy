package io.github.fairyspace.soap.ver10.schema;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: onvif-easy
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/2/1
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/

import javax.xml.bind.annotation.*;

/**
 * Base type defining the common properties of a configuration.
 *
 * <pre>
 * <complexType name="ConfigurationEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         <element name="UseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationEntity", propOrder = { "name", "useCount" })
@XmlSeeAlso({ AudioSourceConfiguration.class, PTZConfiguration.class, VideoSourceConfiguration.class, AudioEncoderConfiguration.class,
        VideoEncoderConfiguration.class, AudioDecoderConfiguration.class, VideoAnalyticsConfiguration.class, AudioOutputConfiguration.class,
        MetadataConfiguration.class, AnalyticsEngineInput.class, AnalyticsEngineControl.class, AnalyticsEngine.class, VideoOutputConfiguration.class })
public class ConfigurationEntity {
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "UseCount")
    protected int useCount;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
    }
    public int getUseCount() {
        return useCount;
    }
    public void setUseCount(int value) {
        this.useCount = value;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String value) {
        this.token = value;
    }

}

