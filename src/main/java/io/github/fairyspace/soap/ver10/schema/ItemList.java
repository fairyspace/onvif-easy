package io.github.fairyspace.soap.ver10.schema;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: onvif-easy
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/2/1
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/

/*
 * <complexType name="ItemList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SimpleItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ElementItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any/>
 *                 </sequence>
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ItemListExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemList", propOrder = { "simpleItem", "elementItem", "extension" })
public class ItemList {

    @XmlElement(name = "SimpleItem")
    protected List<SimpleItem> simpleItem;
    @XmlElement(name = "ElementItem")
    protected List<ItemList.ElementItem> elementItem;
    @XmlElement(name = "Extension")
    protected ItemListExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the simpleItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSimpleItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ItemList.SimpleItem }
     *
     *
     */
    public List<ItemList.SimpleItem> getSimpleItem() {
        if (simpleItem == null) {
            simpleItem = new ArrayList<SimpleItem>();
        }
        return this.simpleItem;
    }

    /**
     * Gets the value of the elementItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getElementItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ItemList.ElementItem }
     *
     *
     */
    public List<ItemList.ElementItem> getElementItem() {
        if (elementItem == null) {
            elementItem = new ArrayList<ItemList.ElementItem>();
        }
        return this.elementItem;
    }


    public ItemListExtension getExtension() {
        return extension;
    }


    public void setExtension(ItemListExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    /**
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <any/>
     *       </sequence>
     *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "any" })
    public static class ElementItem {
        @XmlAnyElement(lax = true)
        protected java.lang.Object any;
        @XmlAttribute(name = "Name", required = true)
        protected String name;

        public java.lang.Object getAny() {
            return any;
        }

        public void setAny(java.lang.Object value) {
            this.any = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

    }

    /**
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SimpleItem {
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Value", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String value;
        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

}
