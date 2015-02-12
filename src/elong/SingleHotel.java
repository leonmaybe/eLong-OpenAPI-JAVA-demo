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
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleHotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleHotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Detail" type="{}HotelBaseInfo" minOccurs="0"/>
 *         &lt;element name="Rooms" type="{}ArrayOfHotelRoom" minOccurs="0"/>
 *         &lt;element name="Images" type="{}ArrayOfHotelImg" minOccurs="0"/>
 *         &lt;element name="Review" type="{}Review" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleHotel", propOrder = {
    "detail",
    "rooms",
    "images",
    "review"
})
public class SingleHotel {

    @JSONField(name = "Detail")
    protected HotelBaseInfo detail;
    @JSONField(name = "Rooms")
    protected List<HotelRoom> rooms;
    @JSONField(name = "Images")
    protected List<HotelImg> images;
    @JSONField(name = "Review")
    protected Review review;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link HotelBaseInfo }
     *     
     */
    public HotelBaseInfo getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelBaseInfo }
     *     
     */
    public void setDetail(HotelBaseInfo value) {
        this.detail = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link List<HotelRoom> }
     *     
     */
    public List<HotelRoom> getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HotelRoom> }
     *     
     */
    public void setRooms(List<HotelRoom> value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link List<HotelImg> }
     *     
     */
    public List<HotelImg> getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HotelImg> }
     *     
     */
    public void setImages(List<HotelImg> value) {
        this.images = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * @return
     *     possible object is
     *     {@link Review }
     *     
     */
    public Review getReview() {
        return review;
    }

    /**
     * Sets the value of the review property.
     * 
     * @param value
     *     allowed object is
     *     {@link Review }
     *     
     */
    public void setReview(Review value) {
        this.review = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
