package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: onvif-easy
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/2/1
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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
