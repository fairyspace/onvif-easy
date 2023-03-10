package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
@XmlType(name = "IntRectangle")
public class IntRectangle {

    @XmlAttribute(name = "x", required = true)
    protected int x;
    @XmlAttribute(name = "y", required = true)
    protected int y;
    @XmlAttribute(name = "width", required = true)
    protected int width;
    @XmlAttribute(name = "height", required = true)
    protected int height;


    public int getX() {
        return x;
    }


    public void setX(int value) {
        this.x = value;
    }


    public int getY() {
        return y;
    }


    public void setY(int value) {
        this.y = value;
    }


    public int getWidth() {
        return width;
    }


    public void setWidth(int value) {
        this.width = value;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int value) {
        this.height = value;
    }

}
