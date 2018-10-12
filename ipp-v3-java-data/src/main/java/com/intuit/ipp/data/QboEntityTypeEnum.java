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
 * <p>Java class for QboEntityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QboEntityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="VENDOR"/>
 *     &lt;enumeration value="EMPLOYEE"/>
 *     &lt;enumeration value="CREDIT_CARD"/>
 *     &lt;enumeration value="CHECK"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="RECEIVED_PAYMENT"/>
 *     &lt;enumeration value="GENERAL_JOURNAL"/>
 *     &lt;enumeration value="BILL"/>
 *     &lt;enumeration value="CREDIT_CARD_CREDIT"/>
 *     &lt;enumeration value="BILL_CREDIT"/>
 *     &lt;enumeration value="CHARGE_CREDIT"/>
 *     &lt;enumeration value="BILL_CHECK"/>
 *     &lt;enumeration value="BILL_CREDIT_CARD"/>
 *     &lt;enumeration value="CHARGE"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="RECEIVED_MONEY"/>
 *     &lt;enumeration value="STATEMENT"/>
 *     &lt;enumeration value="REIMB_CHARGE"/>
 *     &lt;enumeration value="CASH_PURCHASE"/>
 *     &lt;enumeration value="CASH_SALE"/>
 *     &lt;enumeration value="CREDIT_MEMO"/>
 *     &lt;enumeration value="CREDIT_REFUND"/>
 *     &lt;enumeration value="ESTIMATE"/>
 *     &lt;enumeration value="INVENTORY_QUANTITY_ADJUSTMENT"/>
 *     &lt;enumeration value="PURCHASE_ORDER"/>
 *     &lt;enumeration value="PAYROLL_CHECK"/>
 *     &lt;enumeration value="TAX_PAYMENT"/>
 *     &lt;enumeration value="PAYROLL_ADJUSTMENT_V2"/>
 *     &lt;enumeration value="PAYROLL_REFUND"/>
 *     &lt;enumeration value="GLOBAL_TAX_PAYMENT"/>
 *     &lt;enumeration value="GLOBAL_TAX_ADJUSTMENT"/>
 *     &lt;enumeration value="JOB_INVOICE"/>
 *     &lt;enumeration value="ITEM"/>
 *     &lt;enumeration value="GENERIC_EXPENSE"/>
 *     &lt;enumeration value="TIME_ACTIVITY"/>
 *     &lt;enumeration value="DEPARTMENT"/>
 *     &lt;enumeration value="USERS"/>
 *     &lt;enumeration value="KLASS"/>
 *     &lt;enumeration value="PAYMENT_METHOD"/>
 *     &lt;enumeration value="MEMORIZED_TRANSACTION"/>
 *     &lt;enumeration value="TERM"/>
 *     &lt;enumeration value="BUDGET"/>
 *     &lt;enumeration value="TAX_CODE"/>
 *     &lt;enumeration value="TAX_CODE_RATE"/>
 *     &lt;enumeration value="TAX_AGENCY"/>
 *     &lt;enumeration value="ATTACHABLE"/>
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="PREFERENCES"/>
 *     &lt;enumeration value="JOURNAL_CODE"/>
 *     &lt;enumeration value="DISCOUNT_RATE"/>
 *     &lt;enumeration value="BANKING_TRANSACTIONS"/>
 *     &lt;enumeration value="BUSINESS_TERMS"/>
 *     &lt;enumeration value="LIABILITY_CHECK"/>
 *     &lt;enumeration value="LIABILITY_CREDIT_CARD"/>
 *     &lt;enumeration value="LIABILITY_REFUND"/>
 *     &lt;enumeration value="PRIOR_LIABILITY_PAYMENTS"/>
 *     &lt;enumeration value="LIABILITY_EPAY"/>
 *     &lt;enumeration value="LIABILITY_MMAP"/>
 *     &lt;enumeration value="TAX_CREDIT_UTILISE"/>
 *     &lt;enumeration value="TAX_CREDIT_DEFER"/>
 *     &lt;enumeration value="TAX_CREDIT_REVERSE"/>
 *     &lt;enumeration value="TAX_CREDIT_REFUND"/>
 *     &lt;enumeration value="GROSS_ADJUSTMENT"/>
 *     &lt;enumeration value="REVERSE_CHARGE"/>
 *     &lt;enumeration value="DD_CHECK"/>
 *     &lt;enumeration value="PAYCHECK"/>
 *     &lt;enumeration value="PAYROLL_ADJUSTMENT"/>
 *     &lt;enumeration value="PAYROLL_YTD"/>
 *     &lt;enumeration value="SDK_USERS"/>
 *     &lt;enumeration value="PAYROLL_ITEMS"/>
 *     &lt;enumeration value="PAY_GROUPS"/>
 *     &lt;enumeration value="PAID_TIME_OFF_ENTRIES"/>
 *     &lt;enumeration value="TAX_JURISDICTIONS"/>
 *     &lt;enumeration value="MEMORIZED_REPORTS"/>
 *     &lt;enumeration value="OLB_FINANCIAL_INSTITUTIONS"/>
 *     &lt;enumeration value="DIRECT_DEPOSIT_BANK_INFO"/>
 *     &lt;enumeration value="REMINDERS"/>
 *     &lt;enumeration value="PAYROLL_FORMS"/>
 *     &lt;enumeration value="EPAY_BANK_ACCOUNT_INFO"/>
 *     &lt;enumeration value="EPAY_AGENCY_CREDENTIALS"/>
 *     &lt;enumeration value="EFILE_ENROLLMENT"/>
 *     &lt;enumeration value="TAXRETURNLINES"/>
 *     &lt;enumeration value="NOTES"/>
 *     &lt;enumeration value="PRINT_PREF"/>
 *     &lt;enumeration value="MANAGEMENT_REPORT"/>
 *     &lt;enumeration value="OLB_RULES"/>
 *     &lt;enumeration value="DESKTOPIMPORT_SEED_QOH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QboEntityTypeEnum")
@XmlEnum
public enum QboEntityTypeEnum {

    CUSTOMER("CUSTOMER"),
    VENDOR("VENDOR"),
    EMPLOYEE("EMPLOYEE"),
    CREDIT_CARD("CREDIT_CARD"),
    CHECK("CHECK"),
    INVOICE("INVOICE"),
    RECEIVED_PAYMENT("RECEIVED_PAYMENT"),
    GENERAL_JOURNAL("GENERAL_JOURNAL"),
    BILL("BILL"),
    CREDIT_CARD_CREDIT("CREDIT_CARD_CREDIT"),
    BILL_CREDIT("BILL_CREDIT"),
    CHARGE_CREDIT("CHARGE_CREDIT"),
    BILL_CHECK("BILL_CHECK"),
    BILL_CREDIT_CARD("BILL_CREDIT_CARD"),
    CHARGE("CHARGE"),
    TRANSFER("TRANSFER"),
    RECEIVED_MONEY("RECEIVED_MONEY"),
    STATEMENT("STATEMENT"),
    REIMB_CHARGE("REIMB_CHARGE"),
    CASH_PURCHASE("CASH_PURCHASE"),
    CASH_SALE("CASH_SALE"),
    CREDIT_MEMO("CREDIT_MEMO"),
    CREDIT_REFUND("CREDIT_REFUND"),
    ESTIMATE("ESTIMATE"),
    INVENTORY_QUANTITY_ADJUSTMENT("INVENTORY_QUANTITY_ADJUSTMENT"),
    PURCHASE_ORDER("PURCHASE_ORDER"),
    PAYROLL_CHECK("PAYROLL_CHECK"),
    TAX_PAYMENT("TAX_PAYMENT"),
    @XmlEnumValue("PAYROLL_ADJUSTMENT_V2")
    PAYROLL_ADJUSTMENT_V_2("PAYROLL_ADJUSTMENT_V2"),
    PAYROLL_REFUND("PAYROLL_REFUND"),
    GLOBAL_TAX_PAYMENT("GLOBAL_TAX_PAYMENT"),
    GLOBAL_TAX_ADJUSTMENT("GLOBAL_TAX_ADJUSTMENT"),
    JOB_INVOICE("JOB_INVOICE"),
    ITEM("ITEM"),
    GENERIC_EXPENSE("GENERIC_EXPENSE"),
    TIME_ACTIVITY("TIME_ACTIVITY"),
    DEPARTMENT("DEPARTMENT"),
    USERS("USERS"),
    KLASS("KLASS"),
    PAYMENT_METHOD("PAYMENT_METHOD"),
    MEMORIZED_TRANSACTION("MEMORIZED_TRANSACTION"),
    TERM("TERM"),
    BUDGET("BUDGET"),
    TAX_CODE("TAX_CODE"),
    TAX_CODE_RATE("TAX_CODE_RATE"),
    TAX_AGENCY("TAX_AGENCY"),
    ATTACHABLE("ATTACHABLE"),
    ACCOUNT("ACCOUNT"),
    PREFERENCES("PREFERENCES"),
    JOURNAL_CODE("JOURNAL_CODE"),
    DISCOUNT_RATE("DISCOUNT_RATE"),
    BANKING_TRANSACTIONS("BANKING_TRANSACTIONS"),
    BUSINESS_TERMS("BUSINESS_TERMS"),
    LIABILITY_CHECK("LIABILITY_CHECK"),
    LIABILITY_CREDIT_CARD("LIABILITY_CREDIT_CARD"),
    LIABILITY_REFUND("LIABILITY_REFUND"),
    PRIOR_LIABILITY_PAYMENTS("PRIOR_LIABILITY_PAYMENTS"),
    LIABILITY_EPAY("LIABILITY_EPAY"),
    LIABILITY_MMAP("LIABILITY_MMAP"),
    TAX_CREDIT_UTILISE("TAX_CREDIT_UTILISE"),
    TAX_CREDIT_DEFER("TAX_CREDIT_DEFER"),
    TAX_CREDIT_REVERSE("TAX_CREDIT_REVERSE"),
    TAX_CREDIT_REFUND("TAX_CREDIT_REFUND"),
    GROSS_ADJUSTMENT("GROSS_ADJUSTMENT"),
    REVERSE_CHARGE("REVERSE_CHARGE"),
    DD_CHECK("DD_CHECK"),
    PAYCHECK("PAYCHECK"),
    PAYROLL_ADJUSTMENT("PAYROLL_ADJUSTMENT"),
    PAYROLL_YTD("PAYROLL_YTD"),
    SDK_USERS("SDK_USERS"),
    PAYROLL_ITEMS("PAYROLL_ITEMS"),
    PAY_GROUPS("PAY_GROUPS"),
    PAID_TIME_OFF_ENTRIES("PAID_TIME_OFF_ENTRIES"),
    TAX_JURISDICTIONS("TAX_JURISDICTIONS"),
    MEMORIZED_REPORTS("MEMORIZED_REPORTS"),
    OLB_FINANCIAL_INSTITUTIONS("OLB_FINANCIAL_INSTITUTIONS"),
    DIRECT_DEPOSIT_BANK_INFO("DIRECT_DEPOSIT_BANK_INFO"),
    REMINDERS("REMINDERS"),
    PAYROLL_FORMS("PAYROLL_FORMS"),
    EPAY_BANK_ACCOUNT_INFO("EPAY_BANK_ACCOUNT_INFO"),
    EPAY_AGENCY_CREDENTIALS("EPAY_AGENCY_CREDENTIALS"),
    EFILE_ENROLLMENT("EFILE_ENROLLMENT"),
    TAXRETURNLINES("TAXRETURNLINES"),
    NOTES("NOTES"),
    PRINT_PREF("PRINT_PREF"),
    MANAGEMENT_REPORT("MANAGEMENT_REPORT"),
    OLB_RULES("OLB_RULES"),
    DESKTOPIMPORT_SEED_QOH("DESKTOPIMPORT_SEED_QOH");
    private final String value;

    QboEntityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QboEntityTypeEnum fromValue(String v) {
        for (QboEntityTypeEnum c: QboEntityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
