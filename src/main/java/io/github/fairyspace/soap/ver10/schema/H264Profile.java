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

/**
 * <pre>
 * <simpleType name="H264Profile">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Baseline"/>
 *     <enumeration value="Main"/>
 *     <enumeration value="Extended"/>
 *     <enumeration value="High"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 *
 */


@XmlType(name = "H264Profile")
@XmlEnum
public enum H264Profile {
    @XmlEnumValue("Baseline")
    BASELINE("Baseline"), @XmlEnumValue("Main")
    MAIN("Main"), @XmlEnumValue("Extended")
    EXTENDED("Extended"), @XmlEnumValue("High")
    HIGH("High");
    private final String value;
    H264Profile(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static H264Profile fromValue(String v) {
        for (H264Profile c : H264Profile.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
