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
 * <p>Java class for PrepayRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepayRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BasePrepayRule">
 *       &lt;sequence>
 *         &lt;element name="PrepayRuleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepayRule", propOrder = {
    "prepayRuleId"
})
public class PrepayRule
    extends BasePrepayRule
{

    @JSONField(name = "PrepayRuleId")
    protected int prepayRuleId;

    /**
     * Gets the value of the prepayRuleId property.
     * 
     */
    public int getPrepayRuleId() {
        return prepayRuleId;
    }

    /**
     * Sets the value of the prepayRuleId property.
     * 
     */
    public void setPrepayRuleId(int value) {
        this.prepayRuleId = value;
    }

}
