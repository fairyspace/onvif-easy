package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/1
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
@XmlType(name = "ReverseMode")
@XmlEnum
public enum ReverseMode {

    OFF("OFF"), ON("ON"), AUTO("AUTO"), @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    ReverseMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReverseMode fromValue(String v) {
        for (ReverseMode c : ReverseMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
