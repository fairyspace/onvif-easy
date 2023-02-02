package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: onvif-easy
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/2/1
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/

/*
 * <pre>
 * <complexType name="Config">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Parameters" type="{http://www.onvif.org/ver10/schema}ItemList"/>
 *       </sequence>
 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Config", propOrder = { "parameters" })
public class Config {

    @XmlElement(name = "Parameters", required = true)
    protected ItemList parameters;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Type", required = true)
    protected QName type;


    public ItemList getParameters() {
        return parameters;
    }

    public void setParameters(ItemList value) {
        this.parameters = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public QName getType() {
        return type;
    }

    public void setType(QName value) {
        this.type = value;
    }

}
