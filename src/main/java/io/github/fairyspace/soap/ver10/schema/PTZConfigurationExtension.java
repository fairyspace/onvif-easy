package io.github.fairyspace.soap.ver10.schema;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/1
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <complexType name="PTZConfigurationExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PTControlDirection" type="{http://www.onvif.org/ver10/schema}PTControlDirection" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfigurationExtension", propOrder = { "any", "ptControlDirection", "extension" })
public class PTZConfigurationExtension {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "PTControlDirection")
    protected PTControlDirection ptControlDirection;
    @XmlElement(name = "Extension")
    protected PTZConfigurationExtension2 extension;

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


    public PTControlDirection getPTControlDirection() {
        return ptControlDirection;
    }


    public void setPTControlDirection(PTControlDirection value) {
        this.ptControlDirection = value;
    }


    public PTZConfigurationExtension2 getExtension() {
        return extension;
    }


    public void setExtension(PTZConfigurationExtension2 value) {
        this.extension = value;
    }

}
