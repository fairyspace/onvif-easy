package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <complexType name="FloatRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Min" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Max" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatRange", propOrder = { "min", "max" })
public class FloatRange {

    @XmlElement(name = "Min")
    protected float min;
    @XmlElement(name = "Max")
    protected float max;

    public float getMin() {
        return min;
    }


    public void setMin(float value) {
        this.min = value;
    }

    public float getMax() {
        return max;
    }


    public void setMax(float value) {
        this.max = value;
    }

}