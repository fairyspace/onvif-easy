package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/1
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/

/**
 * <pre>
 * <complexType name="PanTiltLimits">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Range" type="{http://www.onvif.org/ver10/schema}Space2DDescription"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanTiltLimits", propOrder = { "range" })
public class PanTiltLimits {

    @XmlElement(name = "Range", required = true)
    protected Space2DDescription range;

    public Space2DDescription getRange() {
        return range;
    }

    public void setRange(Space2DDescription value) {
        this.range = value;
    }

}
