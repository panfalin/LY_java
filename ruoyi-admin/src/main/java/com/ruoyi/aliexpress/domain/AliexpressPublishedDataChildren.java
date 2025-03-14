package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 速卖通刊登子数据对象 aliexpress_published_data_children
 *
 * @author ruoyi
 * @date 2025-03-14
 */
public class AliexpressPublishedDataChildren extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @Excel(name = "商品ID")
    private String commodityId;

    /**
     * sku
     */
    @Excel(name = "sku")
    private String sku;

    /**
     * 统计时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statisticalTime;

    /**
     * 属性
     */
    @Excel(name = "属性")
    private String attribute;

    /**
     * 支付金额
     */
    @Excel(name = "支付金额")
    private BigDecimal paymentAmount;

    /**
     * SKU支付买家数
     */
    @Excel(name = "SKU支付买家数")
    private Long paymentVisitors;

    /**
     * 支付件数
     */
    @Excel(name = "支付件数")
    private Long paymentNumber;

    /**
     * sku加购人数
     */
    @Excel(name = "sku加购人数")
    private Long skuAdditionalPeople;

    /**
     * sku加购件数
     */
    @Excel(name = "sku加购件数")
    private String skuAdditionalPiece;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate beginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTime;

    public LocalDate getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDate beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setStatisticalTime(Date statisticalTime) {
        this.statisticalTime = statisticalTime;
    }

    public Date getStatisticalTime() {
        return statisticalTime;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentVisitors(Long paymentVisitors) {
        this.paymentVisitors = paymentVisitors;
    }

    public Long getPaymentVisitors() {
        return paymentVisitors;
    }

    public void setPaymentNumber(Long paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public Long getPaymentNumber() {
        return paymentNumber;
    }

    public void setSkuAdditionalPeople(Long skuAdditionalPeople) {
        this.skuAdditionalPeople = skuAdditionalPeople;
    }

    public Long getSkuAdditionalPeople() {
        return skuAdditionalPeople;
    }

    public void setSkuAdditionalPiece(String skuAdditionalPiece) {
        this.skuAdditionalPiece = skuAdditionalPiece;
    }

    public String getSkuAdditionalPiece() {
        return skuAdditionalPiece;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("commodityId", getCommodityId())
                .append("sku", getSku())
                .append("statisticalTime", getStatisticalTime())
                .append("attribute", getAttribute())
                .append("paymentAmount", getPaymentAmount())
                .append("paymentVisitors", getPaymentVisitors())
                .append("paymentNumber", getPaymentNumber())
                .append("skuAdditionalPeople", getSkuAdditionalPeople())
                .append("skuAdditionalPiece", getSkuAdditionalPiece())
                .toString();
    }
}
