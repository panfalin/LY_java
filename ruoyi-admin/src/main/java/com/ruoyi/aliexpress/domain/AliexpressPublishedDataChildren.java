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
     * 商品ID
     */
    @Excel(name = "商品ID列表")
    private List<String> commodityIds;



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
    private BigDecimal paymentVisitors;

    /**
     * 支付件数
     */
    @Excel(name = "支付件数")
    private BigDecimal paymentNumber;

    /**
     * sku加购人数
     */
    @Excel(name = "sku加购人数")
    private BigDecimal skuAdditionalPeople;

    /**
     * sku加购件数
     */
    @Excel(name = "sku加购件数")
    private BigDecimal skuAdditionalPiece;


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

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public List<String> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<String> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public Date getStatisticalTime() {
        return statisticalTime;
    }

    public void setStatisticalTime(Date statisticalTime) {
        this.statisticalTime = statisticalTime;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getPaymentVisitors() {
        return paymentVisitors;
    }

    public void setPaymentVisitors(BigDecimal paymentVisitors) {
        this.paymentVisitors = paymentVisitors;
    }

    public BigDecimal getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(BigDecimal paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public BigDecimal getSkuAdditionalPeople() {
        return skuAdditionalPeople;
    }

    public void setSkuAdditionalPeople(BigDecimal skuAdditionalPeople) {
        this.skuAdditionalPeople = skuAdditionalPeople;
    }

    public BigDecimal getSkuAdditionalPiece() {
        return skuAdditionalPiece;
    }

    public void setSkuAdditionalPiece(BigDecimal skuAdditionalPiece) {
        this.skuAdditionalPiece = skuAdditionalPiece;
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

    public BigDecimal getVisitors() {
        return visitors;
    }

    public void setVisitors(BigDecimal visitors) {
        this.visitors = visitors;
    }

    public BigDecimal getSearchClicks() {
        return searchClicks;
    }

    public void setSearchClicks(BigDecimal searchClicks) {
        this.searchClicks = searchClicks;
    }

    public BigDecimal getViews() {
        return views;
    }

    public void setViews(BigDecimal views) {
        this.views = views;
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
