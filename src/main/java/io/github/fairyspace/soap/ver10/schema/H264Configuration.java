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
 * <complexType name="H264Configuration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="H264Profile" type="{http://www.onvif.org/ver10/schema}H264Profile"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "H264Configuration", propOrder = { "govLength", "h264Profile" })
public class H264Configuration {
    @XmlElement(name = "GovLength")
    protected int govLength;
    @XmlElement(name = "H264Profile", required = true)
    protected H264Profile h264Profile;

    public int getGovLength() {
        return govLength;
    }

    public void setGovLength(int value) {
        this.govLength = value;
    }

    public H264Profile getH264Profile() {
        return h264Profile;
    }

    public void setH264Profile(H264Profile value) {
        this.h264Profile = value;
    }

}
