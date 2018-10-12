//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.10 at 11:31:49 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OLBTxnStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OLBTxnStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OLBTxnStatusEnum")
@XmlEnum
public enum OLBTxnStatusEnum {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    OLBTxnStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OLBTxnStatusEnum fromValue(String v) {
        for (OLBTxnStatusEnum c: OLBTxnStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
