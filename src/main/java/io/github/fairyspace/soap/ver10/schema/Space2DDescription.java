package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.*;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: onvif-easy
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/2/1
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Space2DDescription", propOrder = { "uri", "xRange", "yRange" })
public class Space2DDescription {

    @XmlElement(name = "URI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "XRange", required = true)
    protected FloatRange xRange;
    @XmlElement(name = "YRange", required = true)
    protected FloatRange yRange;


    public String getURI() {
        return uri;
    }


    public void setURI(String value) {
        this.uri = value;
    }


    public FloatRange getXRange() {
        return xRange;
    }


    public void setXRange(FloatRange value) {
        this.xRange = value;
    }


    public FloatRange getYRange() {
        return yRange;
    }


    public void setYRange(FloatRange value) {
        this.yRange = value;
    }

}
