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
 *
 * <pre>
 * <simpleType name="VideoEncoding">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="JPEG"/>
 *     <enumeration value="MPEG4"/>
 *     <enumeration value="H264"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 *
 */

@XmlType(name = "VideoEncoding")
@XmlEnum
public enum VideoEncoding {

    JPEG("JPEG"), @XmlEnumValue("MPEG4")
    MPEG_4("MPEG4"), @XmlEnumValue("H264")
    H_264("H264");


    private final String value;

    VideoEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncoding fromValue(String v) {
        for (VideoEncoding c : VideoEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
