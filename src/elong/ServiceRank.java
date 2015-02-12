//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 09:56:03 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SummaryScore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InstantConfirmScore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingSuccessScore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ComplaintScore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SummaryRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InstantConfirmRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingSuccessRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ComplaintRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRank")
public class ServiceRank {

    @XmlAttribute(name = "SummaryScore")
    protected String summaryScore;
    @XmlAttribute(name = "InstantConfirmScore")
    protected String instantConfirmScore;
    @XmlAttribute(name = "BookingSuccessScore")
    protected String bookingSuccessScore;
    @XmlAttribute(name = "ComplaintScore")
    protected String complaintScore;
    @XmlAttribute(name = "SummaryRate")
    protected String summaryRate;
    @XmlAttribute(name = "InstantConfirmRate")
    protected String instantConfirmRate;
    @XmlAttribute(name = "BookingSuccessRate")
    protected String bookingSuccessRate;
    @XmlAttribute(name = "ComplaintRate")
    protected String complaintRate;

    /**
     * Gets the value of the summaryScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryScore() {
        return summaryScore;
    }

    /**
     * Sets the value of the summaryScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryScore(String value) {
        this.summaryScore = value;
    }

    /**
     * Gets the value of the instantConfirmScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantConfirmScore() {
        return instantConfirmScore;
    }

    /**
     * Sets the value of the instantConfirmScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantConfirmScore(String value) {
        this.instantConfirmScore = value;
    }

    /**
     * Gets the value of the bookingSuccessScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingSuccessScore() {
        return bookingSuccessScore;
    }

    /**
     * Sets the value of the bookingSuccessScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingSuccessScore(String value) {
        this.bookingSuccessScore = value;
    }

    /**
     * Gets the value of the complaintScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintScore() {
        return complaintScore;
    }

    /**
     * Sets the value of the complaintScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintScore(String value) {
        this.complaintScore = value;
    }

    /**
     * Gets the value of the summaryRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryRate() {
        return summaryRate;
    }

    /**
     * Sets the value of the summaryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryRate(String value) {
        this.summaryRate = value;
    }

    /**
     * Gets the value of the instantConfirmRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantConfirmRate() {
        return instantConfirmRate;
    }

    /**
     * Sets the value of the instantConfirmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantConfirmRate(String value) {
        this.instantConfirmRate = value;
    }

    /**
     * Gets the value of the bookingSuccessRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingSuccessRate() {
        return bookingSuccessRate;
    }

    /**
     * Sets the value of the bookingSuccessRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingSuccessRate(String value) {
        this.bookingSuccessRate = value;
    }

    /**
     * Gets the value of the complaintRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintRate() {
        return complaintRate;
    }

    /**
     * Sets the value of the complaintRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintRate(String value) {
        this.complaintRate = value;
    }

}
