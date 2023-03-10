package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/2
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsEngineInputInfo", propOrder = { "inputInfo", "extension" })
public class AnalyticsEngineInputInfo {

    @XmlElement(name = "InputInfo")
    protected Config inputInfo;
    @XmlElement(name = "Extension")
    protected AnalyticsEngineInputInfoExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public Config getInputInfo() {
        return inputInfo;
    }


    public void setInputInfo(Config value) {
        this.inputInfo = value;
    }


    public AnalyticsEngineInputInfoExtension getExtension() {
        return extension;
    }


    public void setExtension(AnalyticsEngineInputInfoExtension value) {
        this.extension = value;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
