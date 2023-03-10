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
@XmlType(name = "AudioEncoding")
@XmlEnum
public enum AudioEncoding {

    /*
     * <simpleType name="AudioEncoding">
     *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     <enumeration value="G711"/>
     *     <enumeration value="G726"/>
     *     <enumeration value="AAC"/>
     *   </restriction>
     * </simpleType>
     * </pre>
     *
     */

    @XmlEnumValue("G711") G_711("G711"),
    @XmlEnumValue("G726") G_726("G726"),
    @XmlEnumValue("AAC")  AAC("AAC");



    private final String value;
    AudioEncoding(String v) {
        value = v;
    }
    public String value() {
        return value;
    }

    public static AudioEncoding fromValue(String v) {
        for (AudioEncoding c : AudioEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
