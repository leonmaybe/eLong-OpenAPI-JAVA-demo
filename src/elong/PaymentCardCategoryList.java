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
 * <p>Java class for PaymentCardCategoryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardCategoryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardCategoryList" type="{}ArrayOfPaymentCardCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardCategoryList", propOrder = {
    "cardCategoryList"
})
public class PaymentCardCategoryList {

    @JSONField(name = "CardCategoryList")
    protected List<PaymentCardCategory> cardCategoryList;

    /**
     * Gets the value of the cardCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link List<PaymentCardCategory> }
     *     
     */
    public List<PaymentCardCategory> getCardCategoryList() {
        return cardCategoryList;
    }

    /**
     * Sets the value of the cardCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<PaymentCardCategory> }
     *     
     */
    public void setCardCategoryList(List<PaymentCardCategory> value) {
        this.cardCategoryList = value;
    }

}
