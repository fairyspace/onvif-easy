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
@XmlType(name = "EFlipMode")
@XmlEnum
public enum EFlipMode {

    OFF("OFF"), ON("ON"), @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    EFlipMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EFlipMode fromValue(String v) {
        for (EFlipMode c : EFlipMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
