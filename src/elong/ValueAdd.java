//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 09:56:03 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueAdd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueAdd">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseValueAddRule">
 *       &lt;sequence>
 *         &lt;element name="ValueAddId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueAdd", propOrder = {
    "valueAddId"
})
public class ValueAdd
    extends BaseValueAddRule
{

    @JSONField(name = "ValueAddId")
    protected String valueAddId;

    /**
     * Gets the value of the valueAddId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddId() {
        return valueAddId;
    }

    /**
     * Sets the value of the valueAddId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddId(String value) {
        this.valueAddId = value;
    }

}
