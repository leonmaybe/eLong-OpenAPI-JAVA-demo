//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 09:56:03 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelGiftDateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HotelGiftDateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CheckinDate"/>
 *     &lt;enumeration value="BookingDate"/>
 *     &lt;enumeration value="StayDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HotelGiftDateTypeEnum")
@XmlEnum
public enum HotelGiftDateTypeEnum {

    @XmlEnumValue("CheckinDate")
    CheckinDate("CheckinDate"),
    @XmlEnumValue("BookingDate")
    BookingDate("BookingDate"),
    @XmlEnumValue("StayDate")
    StayDate("StayDate");
    private final String value;

    HotelGiftDateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelGiftDateTypeEnum fromValue(String v) {
        for (HotelGiftDateTypeEnum c: HotelGiftDateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
