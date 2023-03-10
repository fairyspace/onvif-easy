package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
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
 * <simpleType name="Mpeg4Profile">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SP"/>
 *     <enumeration value="ASP"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 *
 */

@XmlType(name = "Mpeg4Profile")
@XmlEnum
public enum Mpeg4Profile {
    SP, ASP;
    public String value() {
        return name();
    }
    public static Mpeg4Profile fromValue(String v) {
        return valueOf(v);
    }

}
