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

/**
 * <pre>
 * <complexType name="VideoEncoderConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="Encoding" type="{http://www.onvif.org/ver10/schema}VideoEncoding"/>
 *         <element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/>
 *         <element name="Quality" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="RateControl" type="{http://www.onvif.org/ver10/schema}VideoRateControl" minOccurs="0"/>
 *         <element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Configuration" minOccurs="0"/>
 *         <element name="H264" type="{http://www.onvif.org/ver10/schema}H264Configuration" minOccurs="0"/>
 *         <element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/>
 *         <element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
@XmlType(name = "VideoEncoderConfiguration", propOrder = { "encoding", "resolution", "quality", "rateControl", "mpeg4", "h264", "multicast", "sessionTimeout",
        "any" })
public class VideoEncoderConfiguration extends ConfigurationEntity {

    @XmlElement(name = "Encoding", required = true)
    protected VideoEncoding encoding;
    @XmlElement(name = "Resolution", required = true)
    protected VideoResolution resolution;
    @XmlElement(name = "Quality")
    protected float quality;
    @XmlElement(name = "RateControl")
    protected VideoRateControl rateControl;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Configuration mpeg4;
    @XmlElement(name = "H264")
    protected H264Configuration h264;
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public VideoEncoding getEncoding() {
        return encoding;
    }

    public void setEncoding(VideoEncoding value) {
        this.encoding = value;
    }


    public VideoResolution getResolution() {
        return resolution;
    }


    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }


    public float getQuality() {
        return quality;
    }


    public void setQuality(float value) {
        this.quality = value;
    }


    public VideoRateControl getRateControl() {
        return rateControl;
    }


    public void setRateControl(VideoRateControl value) {
        this.rateControl = value;
    }


    public Mpeg4Configuration getMPEG4() {
        return mpeg4;
    }


    public void setMPEG4(Mpeg4Configuration value) {
        this.mpeg4 = value;
    }


    public H264Configuration getH264() {
        return h264;
    }


    public void setH264(H264Configuration value) {
        this.h264 = value;
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

    /**
     * Gets the value of the any property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
     *
     *
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
