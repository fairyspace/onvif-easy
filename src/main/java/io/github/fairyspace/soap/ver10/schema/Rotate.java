package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/1
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rotate", propOrder = { "mode", "degree", "extension" })
public class Rotate {

    @XmlElement(name = "Mode", required = true)
    protected RotateMode mode;
    @XmlElement(name = "Degree")
    protected Integer degree;
    @XmlElement(name = "Extension")
    protected RotateExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public RotateMode getMode() {
        return mode;
    }


    public void setMode(RotateMode value) {
        this.mode = value;
    }


    public Integer getDegree() {
        return degree;
    }


    public void setDegree(Integer value) {
        this.degree = value;
    }


    public RotateExtension getExtension() {
        return extension;
    }


    public void setExtension(RotateExtension value) {
        this.extension = value;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
