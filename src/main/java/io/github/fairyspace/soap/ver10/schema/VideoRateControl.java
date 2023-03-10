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
 * <p>
 * <pre>
 * <complexType name="VideoRateControl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = { "frameRateLimit", "encodingInterval", "bitrateLimit" })
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;


    public int getFrameRateLimit() {
        return frameRateLimit;
    }


    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }


    public int getEncodingInterval() {
        return encodingInterval;
    }


    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }


    public int getBitrateLimit() {
        return bitrateLimit;
    }

    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
    }

}