package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/2
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
@XmlType(name = "ModeOfOperation")
@XmlEnum
public enum ModeOfOperation {

    @XmlEnumValue("Idle")
    IDLE("Idle"), @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * This case should never happen.
     *
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ModeOfOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModeOfOperation fromValue(String v) {
        for (ModeOfOperation c : ModeOfOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
