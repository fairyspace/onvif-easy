package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <complexType name="PTZSpeed">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PanTilt" type="{http://www.onvif.org/ver10/schema}Vector2D" minOccurs="0"/>
 *         <element name="Zoom" type="{http://www.onvif.org/ver10/schema}Vector1D" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpeed", propOrder = { "panTilt", "zoom" })
public class PTZSpeed {

    @XmlElement(name = "PanTilt")
    protected Vector2D panTilt;
    @XmlElement(name = "Zoom")
    protected Vector1D zoom;


    public Vector2D getPanTilt() {
        return panTilt;
    }


    public void setPanTilt(Vector2D value) {
        this.panTilt = value;
    }


    public Vector1D getZoom() {
        return zoom;
    }


    public void setZoom(Vector1D value) {
        this.zoom = value;
    }

}
