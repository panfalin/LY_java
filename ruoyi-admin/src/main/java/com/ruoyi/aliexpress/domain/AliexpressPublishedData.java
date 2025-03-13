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
 * 速卖通刊登数据对象 aliexpress_published_data
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
public class AliexpressPublishedData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品ID */
    @Excel(name = "商品ID")
    private String commodityId;
    /** 店铺名 */
    @Excel(name = "店铺名")
    private String shopName;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String personName;


    /** 统计时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statisticalTime;

    /** 支付转化率 */
    @Excel(name = "支付转化率")
    private BigDecimal paymentConversion;
    private BigDecimal paymentConversionContrast;

    /** 搜索曝光 */
    @Excel(name = "搜索曝光")
    private BigDecimal searchExposure;
    private BigDecimal searchExposureContrast;

    /** 成功退款 */
    @Excel(name = "成功退款")
    private BigDecimal successfulRefund;
    private BigDecimal successfulRefundContrast;

    /** 访客数 */
    @Excel(name = "访客数")
    private BigDecimal visitors;
    private BigDecimal visitorsContrast;

    /** 商品加购 */
    @Excel(name = "商品加购")
    private BigDecimal goodsAdditional;
    private BigDecimal goodsAdditionalContrast;

    /** 商品收藏 */
    @Excel(name = "商品收藏")
    private BigDecimal goodsCollection;
    private BigDecimal goodsCollectionContrast;

    /** 搜索点击率 */
    @Excel(name = "搜索点击率")
    private BigDecimal searchClicks;
    private BigDecimal searchClicksContrast;

    /** 成交金额 */
    @Excel(name = "成交金额")
    private BigDecimal transactionAmount;
    private BigDecimal transactionAmountContrast;

    /** 支付件单价 */
    @Excel(name = "支付件单价")
    private BigDecimal pricePay;
    private BigDecimal pricePayContrast;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate beginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTime;


    /** 支付件单价 */
    @Excel(name = "支付主订单数")
    private BigDecimal mainOrdersPaid;
    private BigDecimal mainOrdersPaidContrast;

    /** 支付件单价 */
    @Excel(name = "浏览量")
    private BigDecimal views;
    private BigDecimal viewsContrast;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate conBeginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate conEndTime;

    public LocalDate getConBeginTime() {
        return conBeginTime;
    }

    public void setConBeginTime(LocalDate conBeginTime) {
        this.conBeginTime = conBeginTime;
    }

    public LocalDate getConEndTime() {
        return conEndTime;
    }

    public void setConEndTime(LocalDate conEndTime) {
        this.conEndTime = conEndTime;
    }

    public BigDecimal getPaymentConversionContrast() {
        return paymentConversionContrast;
    }

    public void setPaymentConversionContrast(BigDecimal paymentConversionContrast) {
        this.paymentConversionContrast = paymentConversionContrast;
    }

    public BigDecimal getSearchExposureContrast() {
        return searchExposureContrast;
    }

    public void setSearchExposureContrast(BigDecimal searchExposureContrast) {
        this.searchExposureContrast = searchExposureContrast;
    }



    public BigDecimal getSuccessfulRefundContrast() {
        return successfulRefundContrast;
    }

    public void setSuccessfulRefundContrast(BigDecimal successfulRefundContrast) {
        this.successfulRefundContrast = successfulRefundContrast;
    }

    public BigDecimal getVisitorsContrast() {
        return visitorsContrast;
    }

    public void setVisitorsContrast(BigDecimal visitorsContrast) {
        this.visitorsContrast = visitorsContrast;
    }

    public BigDecimal getGoodsAdditionalContrast() {
        return goodsAdditionalContrast;
    }

    public void setGoodsAdditionalContrast(BigDecimal goodsAdditionalContrast) {
        this.goodsAdditionalContrast = goodsAdditionalContrast;
    }

    public BigDecimal getGoodsCollectionContrast() {
        return goodsCollectionContrast;
    }

    public void setGoodsCollectionContrast(BigDecimal goodsCollectionContrast) {
        this.goodsCollectionContrast = goodsCollectionContrast;
    }

    public BigDecimal getSearchClicksContrast() {
        return searchClicksContrast;
    }

    public void setSearchClicksContrast(BigDecimal searchClicksContrast) {
        this.searchClicksContrast = searchClicksContrast;
    }

    public BigDecimal getTransactionAmountContrast() {
        return transactionAmountContrast;
    }

    public void setTransactionAmountContrast(BigDecimal transactionAmountContrast) {
        this.transactionAmountContrast = transactionAmountContrast;
    }

    public BigDecimal getPricePayContrast() {
        return pricePayContrast;
    }

    public void setPricePayContrast(BigDecimal pricePayContrast) {
        this.pricePayContrast = pricePayContrast;
    }

    public BigDecimal getMainOrdersPaidContrast() {
        return mainOrdersPaidContrast;
    }

    public void setMainOrdersPaidContrast(BigDecimal mainOrdersPaidContrast) {
        this.mainOrdersPaidContrast = mainOrdersPaidContrast;
    }

    public BigDecimal getViewsContrast() {
        return viewsContrast;
    }

    public void setViewsContrast(BigDecimal viewsContrast) {
        this.viewsContrast = viewsContrast;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public BigDecimal getMainOrdersPaid() {
        return mainOrdersPaid;
    }

    public void setMainOrdersPaid(BigDecimal mainOrdersPaid) {
        this.mainOrdersPaid = mainOrdersPaid;
    }

    public BigDecimal getViews() {
        return views;
    }

    public void setViews(BigDecimal views) {
        this.views = views;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Date getStatisticalTime() {
        return statisticalTime;
    }

    public void setStatisticalTime(Date statisticalTime) {
        this.statisticalTime = statisticalTime;
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

    public BigDecimal getSuccessfulRefund() {
        return successfulRefund;
    }

    public void setSuccessfulRefund(BigDecimal successfulRefund) {
        this.successfulRefund = successfulRefund;
    }

    public BigDecimal getVisitors() {
        return visitors;
    }

    public void setVisitors(BigDecimal visitors) {
        this.visitors = visitors;
    }

    public BigDecimal getGoodsAdditional() {
        return goodsAdditional;
    }

    public void setGoodsAdditional(BigDecimal goodsAdditional) {
        this.goodsAdditional = goodsAdditional;
    }

    public BigDecimal getGoodsCollection() {
        return goodsCollection;
    }

    public void setGoodsCollection(BigDecimal goodsCollection) {
        this.goodsCollection = goodsCollection;
    }

    public BigDecimal getSearchClicks() {
        return searchClicks;
    }

    public void setSearchClicks(BigDecimal searchClicks) {
        this.searchClicks = searchClicks;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getPricePay() {
        return pricePay;
    }

    public void setPricePay(BigDecimal pricePay) {
        this.pricePay = pricePay;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("commodityId", getCommodityId())
            .append("statisticalTime", getStatisticalTime())
            .append("paymentConversion", getPaymentConversion())
            .append("searchExposure", getSearchExposure())
            .append("successfulRefund", getSuccessfulRefund())
            .append("visitors", getVisitors())
            .append("goodsAdditional", getGoodsAdditional())
            .append("goodsCollection", getGoodsCollection())
            .append("searchClicks", getSearchClicks())
            .append("transactionAmount", getTransactionAmount())
            .append("pricePay", getPricePay())
            .toString();
    }
}
