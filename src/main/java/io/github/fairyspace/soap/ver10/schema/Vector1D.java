package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.*;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/1
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vector1D")
public class Vector1D {

    @XmlAttribute(name = "x", required = true)
    protected float x;
    @XmlAttribute(name = "space")
    @XmlSchemaType(name = "anyURI")
    protected String space;

    public float getX() {
        return x;
    }

    public void setX(float value) {
        this.x = value;
    }

    public String getSpace() {
        return space;
    }


    public void setSpace(String value) {
        this.space = value;
    }

}
