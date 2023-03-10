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
 * π Create: 2023/2/1
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/

/**
 *
 * <pre>
 * <complexType name="MulticastConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{http://www.onvif.org/ver10/schema}IPAddress"/>
 *         <element name="Port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TTL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AutoStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MulticastConfiguration", propOrder = { "address", "port", "ttl", "autoStart", "any" })
public class MulticastConfiguration {

    @XmlElement(name = "Address", required = true)
    protected IPAddress address;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "TTL")
    protected int ttl;
    @XmlElement(name = "AutoStart")
    protected boolean autoStart;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
    public IPAddress getAddress() {
        return address;
    }

    public void setAddress(IPAddress value) {
        this.address = value;
    }

    public int getPort() {
        return port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public int getTTL() {
        return ttl;
    }


    public void setTTL(int value) {
        this.ttl = value;
    }


    public boolean isAutoStart() {
        return autoStart;
    }


    public void setAutoStart(boolean value) {
        this.autoStart = value;
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