package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;

public class AliexpressPublishedDataChildrenStatistics {
    /*
       商品数
     */
    private BigDecimal commodityNumber;
    /*
     搜索曝光
   */
    private BigDecimal searchExposure;
    /*
     访客数
   */
    private BigDecimal visitors;
    /*
     浏览量
   */
    private BigDecimal views;
    /*
     支付金额
   */
    private BigDecimal paymentAmount;
    /*
     支付买家数
   */
    private BigDecimal paymentVisitors;
    /*
     支付件数
   */
    private BigDecimal paymentNumber;
    /*
     加购人数
   */
    private BigDecimal skuAdditionalPeople;
    /*
     加购件数
   */
    private BigDecimal skuAdditionalPiece;

    public BigDecimal getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(BigDecimal commodityNumber) {
        this.commodityNumber = commodityNumber;
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

    public BigDecimal getViews() {
        return views;
    }

    public void setViews(BigDecimal views) {
        this.views = views;
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
}
