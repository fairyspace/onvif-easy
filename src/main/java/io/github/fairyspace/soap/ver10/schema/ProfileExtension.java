package io.github.fairyspace.soap.ver10.schema;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/2/1
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileExtension", propOrder = { "any", "audioOutputConfiguration", "audioDecoderConfiguration", "extension" })
public class ProfileExtension {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "AudioOutputConfiguration")
    protected AudioOutputConfiguration audioOutputConfiguration;
    @XmlElement(name = "AudioDecoderConfiguration")
    protected AudioDecoderConfiguration audioDecoderConfiguration;
    @XmlElement(name = "Extension")
    protected ProfileExtension2 extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    public AudioOutputConfiguration getAudioOutputConfiguration() {
        return audioOutputConfiguration;
    }


    public void setAudioOutputConfiguration(AudioOutputConfiguration value) {
        this.audioOutputConfiguration = value;
    }


    public AudioDecoderConfiguration getAudioDecoderConfiguration() {
        return audioDecoderConfiguration;
    }


    public void setAudioDecoderConfiguration(AudioDecoderConfiguration value) {
        this.audioDecoderConfiguration = value;
    }


    public ProfileExtension2 getExtension() {
        return extension;
    }


    public void setExtension(ProfileExtension2 value) {
        this.extension = value;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
