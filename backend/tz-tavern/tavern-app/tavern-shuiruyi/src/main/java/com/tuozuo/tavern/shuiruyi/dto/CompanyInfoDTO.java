package com.tuozuo.tavern.shuiruyi.dto;

import java.math.BigDecimal;

/**
 * Code Monkey: 何彪 <br>
 * Dev Time: 2019/08/10 <br>
 */
public class CompanyInfoDTO {
    private String companyName;
    private String companyStatus;
    private BigDecimal tax;
    private String address;
    private String companyType;
    private int totalInvoiceNum;
    private int invoicedNum;
    private BigDecimal totalInvoiceAmt;
    private int freeDeliveryCnt;
    private String includeCancel;
    private String beginDate;
    private String endDate;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public int getTotalInvoiceNum() {
        return totalInvoiceNum;
    }

    public void setTotalInvoiceNum(int totalInvoiceNum) {
        this.totalInvoiceNum = totalInvoiceNum;
    }

    public int getInvoicedNum() {
        return invoicedNum;
    }

    public void setInvoicedNum(int invoicedNum) {
        this.invoicedNum = invoicedNum;
    }

    public BigDecimal getTotalInvoiceAmt() {
        return totalInvoiceAmt;
    }

    public void setTotalInvoiceAmt(BigDecimal totalInvoiceAmt) {
        this.totalInvoiceAmt = totalInvoiceAmt;
    }

    public int getFreeDeliveryCnt() {
        return freeDeliveryCnt;
    }

    public void setFreeDeliveryCnt(int freeDeliveryCnt) {
        this.freeDeliveryCnt = freeDeliveryCnt;
    }

    public String getIncludeCancel() {
        return includeCancel;
    }

    public void setIncludeCancel(String includeCancel) {
        this.includeCancel = includeCancel;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}