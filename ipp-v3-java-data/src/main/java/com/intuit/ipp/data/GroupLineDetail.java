//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.10 at 11:31:49 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Detail for a group item
 * 				line, including the lines expanded from the group item.
 * 			
 * 
 * <p>Java class for GroupLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupLineDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UOMRef" type="{http://schema.intuit.com/finance/v3}UOMRef" minOccurs="0"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://schema.intuit.com/finance/v3}Line" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupLineDetail", propOrder = {
    "groupItemRef",
    "quantity",
    "uomRef",
    "serviceDate",
    "line",
    "groupLineDetailEx"
})
public class GroupLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GroupItemRef", required = true)
    protected ReferenceType groupItemRef;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "UOMRef")
    protected UOMRef uomRef;
    @XmlElement(name = "ServiceDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date serviceDate;
    @XmlElement(name = "Line")
    protected List<Line> line;
    @XmlElement(name = "GroupLineDetailEx")
    protected IntuitAnyType groupLineDetailEx;

    /**
     * Gets the value of the groupItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGroupItemRef() {
        return groupItemRef;
    }

    /**
     * Sets the value of the groupItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGroupItemRef(ReferenceType value) {
        this.groupItemRef = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the uomRef property.
     * 
     * @return
     *     possible object is
     *     {@link UOMRef }
     *     
     */
    public UOMRef getUOMRef() {
        return uomRef;
    }

    /**
     * Sets the value of the uomRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMRef }
     *     
     */
    public void setUOMRef(UOMRef value) {
        this.uomRef = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(Date value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * 
     * 
     */
    public List<Line> getLine() {
        if (line == null) {
            line = new ArrayList<Line>();
        }
        return this.line;
    }

    /**
     * Gets the value of the groupLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getGroupLineDetailEx() {
        return groupLineDetailEx;
    }

    /**
     * Sets the value of the groupLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setGroupLineDetailEx(IntuitAnyType value) {
        this.groupLineDetailEx = value;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param line
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(List<Line> line) {
        this.line = line;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GroupLineDetail that = ((GroupLineDetail) object);
        {
            ReferenceType lhsGroupItemRef;
            lhsGroupItemRef = this.getGroupItemRef();
            ReferenceType rhsGroupItemRef;
            rhsGroupItemRef = that.getGroupItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupItemRef", lhsGroupItemRef), LocatorUtils.property(thatLocator, "groupItemRef", rhsGroupItemRef), lhsGroupItemRef, rhsGroupItemRef, (this.groupItemRef!= null), (that.groupItemRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsQuantity;
            lhsQuantity = this.getQuantity();
            BigDecimal rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            UOMRef lhsUOMRef;
            lhsUOMRef = this.getUOMRef();
            UOMRef rhsUOMRef;
            rhsUOMRef = that.getUOMRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomRef", lhsUOMRef), LocatorUtils.property(thatLocator, "uomRef", rhsUOMRef), lhsUOMRef, rhsUOMRef, (this.uomRef!= null), (that.uomRef!= null))) {
                return false;
            }
        }
        {
            Date lhsServiceDate;
            lhsServiceDate = this.getServiceDate();
            Date rhsServiceDate;
            rhsServiceDate = that.getServiceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDate", lhsServiceDate), LocatorUtils.property(thatLocator, "serviceDate", rhsServiceDate), lhsServiceDate, rhsServiceDate, (this.serviceDate!= null), (that.serviceDate!= null))) {
                return false;
            }
        }
        {
            List<Line> lhsLine;
            lhsLine = (((this.line!= null)&&(!this.line.isEmpty()))?this.getLine():null);
            List<Line> rhsLine;
            rhsLine = (((that.line!= null)&&(!that.line.isEmpty()))?that.getLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line", lhsLine), LocatorUtils.property(thatLocator, "line", rhsLine), lhsLine, rhsLine, ((this.line!= null)&&(!this.line.isEmpty())), ((that.line!= null)&&(!that.line.isEmpty())))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsGroupLineDetailEx;
            lhsGroupLineDetailEx = this.getGroupLineDetailEx();
            IntuitAnyType rhsGroupLineDetailEx;
            rhsGroupLineDetailEx = that.getGroupLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupLineDetailEx", lhsGroupLineDetailEx), LocatorUtils.property(thatLocator, "groupLineDetailEx", rhsGroupLineDetailEx), lhsGroupLineDetailEx, rhsGroupLineDetailEx, (this.groupLineDetailEx!= null), (that.groupLineDetailEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ReferenceType theGroupItemRef;
            theGroupItemRef = this.getGroupItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupItemRef", theGroupItemRef), currentHashCode, theGroupItemRef, (this.groupItemRef!= null));
        }
        {
            BigDecimal theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            UOMRef theUOMRef;
            theUOMRef = this.getUOMRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomRef", theUOMRef), currentHashCode, theUOMRef, (this.uomRef!= null));
        }
        {
            Date theServiceDate;
            theServiceDate = this.getServiceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDate", theServiceDate), currentHashCode, theServiceDate, (this.serviceDate!= null));
        }
        {
            List<Line> theLine;
            theLine = (((this.line!= null)&&(!this.line.isEmpty()))?this.getLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line", theLine), currentHashCode, theLine, ((this.line!= null)&&(!this.line.isEmpty())));
        }
        {
            IntuitAnyType theGroupLineDetailEx;
            theGroupLineDetailEx = this.getGroupLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupLineDetailEx", theGroupLineDetailEx), currentHashCode, theGroupLineDetailEx, (this.groupLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
