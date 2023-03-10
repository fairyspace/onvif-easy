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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationExtension", propOrder = { "rotate", "extension" })
public class VideoSourceConfigurationExtension {

    @XmlElement(name = "Rotate")
    protected Rotate rotate;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationExtension2 extension;


    public Rotate getRotate() {
        return rotate;
    }


    public void setRotate(Rotate value) {
        this.rotate = value;
    }


    public VideoSourceConfigurationExtension2 getExtension() {
        return extension;
    }


    public void setExtension(VideoSourceConfigurationExtension2 value) {
        this.extension = value;
    }

}
