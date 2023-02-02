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
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * <complexType name="PTControlDirection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EFlip" type="{http://www.onvif.org/ver10/schema}EFlip" minOccurs="0"/>
 *         <element name="Reverse" type="{http://www.onvif.org/ver10/schema}Reverse" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTControlDirectionExtension" minOccurs="0"/>
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
@XmlType(name = "PTControlDirection", propOrder = { "eFlip", "reverse", "extension" })
public class PTControlDirection {

    @XmlElement(name = "EFlip")
    protected EFlip eFlip;
    @XmlElement(name = "Reverse")
    protected Reverse reverse;
    @XmlElement(name = "Extension")
    protected PTControlDirectionExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public EFlip getEFlip() {
        return eFlip;
    }


    public void setEFlip(EFlip value) {
        this.eFlip = value;
    }


    public Reverse getReverse() {
        return reverse;
    }


    public void setReverse(Reverse value) {
        this.reverse = value;
    }


    public PTControlDirectionExtension getExtension() {
        return extension;
    }


    public void setExtension(PTControlDirectionExtension value) {
        this.extension = value;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
