//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.23 at 05:20:41 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncrStateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncrStateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="States" type="{}ArrayOfState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncrStateResult", propOrder = {
    "states"
})
public class IncrStateResult {

    @JSONField(name = "States")
    protected List<State> states;

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link List<State> }
     *     
     */
    public List<State> getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<State> }
     *     
     */
    public void setStates(List<State> value) {
        this.states = value;
    }

}
