package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
     * sku
     */
    @Excel(name = "子sku")
    private String skuChildren;

    // 子 SKU 列表
    private List<SubSkuDTO> children;


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

    /**
     * 支付转化率
     */
    @Excel(name = "支付转化率")
    private BigDecimal paymentConversion;

    /**
     * 搜索曝光
     */
    @Excel(name = "搜索曝光")
    private BigDecimal searchExposure;

    /**
     * 访客数
     */
    @Excel(name = "访客数")
    private BigDecimal visitors;
    /**
     * 搜索点击率
     */
    @Excel(name = "搜索点击率")
    private BigDecimal searchClicks;
    /**
     * 支付件单价
     */
    @Excel(name = "浏览量")
    private BigDecimal views;

    public BigDecimal getPaymentConversion() {
        return paymentConversion;
    }

    public void setPaymentConversion(BigDecimal paymentConversion) {
        this.paymentConversion = paymentConversion;
    }

    public BigDecimal getSearchExposure() {
        return searchExposure;
    }

    public void setSearchExposure(BigDecimal searchExposure) {
        this.searchExposure = searchExposure;
    }

    public BigDecimal getSearchClicks() {
        return searchClicks;
    }

    public void setSearchClicks(BigDecimal searchClicks) {
        this.searchClicks = searchClicks;
    }

    public BigDecimal getVisitors() {
        return visitors;
    }

    public void setVisitors(BigDecimal visitors) {
        this.visitors = visitors;
    }

    public BigDecimal getViews() {
        return views;
    }

    public void setViews(BigDecimal views) {
        this.views = views;
    }

    public String getSkuChildren() {
        return skuChildren;
    }

    public void setSkuChildren(String skuChildren) {
        this.skuChildren = skuChildren;
    }

    public List<SubSkuDTO> getChildren() {
        return children;
    }

    public void setChildren(List<SubSkuDTO> children) {
        this.children = children;
    }

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
