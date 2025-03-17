package com.ruoyi.aliexpress.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigDecimal;

public class AliexpressPublishedDataAutoStatistics  extends BaseEntity {

    /**
     * 搜索曝光总计
     */
    private BigDecimal totalSearchExposure;
    /**
     * 搜索曝光平均
     */
    private BigDecimal avgSearchExposure;

    /**
     * 访客总计
     */
    private BigDecimal totalVisitors;

    /**
     * 访客平均
     */
    private BigDecimal avgVisitors;

    /**
     * 商品加购件数总数
     */
    private BigDecimal totalGoodsAdditionalPrice;

    /**
     * 商品加购件数平均
     */
    private BigDecimal avgGoodsAdditionalPrice;

    /**
     * 商品加购人数总数
     */
    private BigDecimal totalGoodsAdditional;

    /**
     * 商品加购人数平均
     */
    private BigDecimal avgGoodsAdditional;

    /**
     * 商品收藏人数总数
     */
    private BigDecimal totalGoodsCollection;

    /**
     * 商品收藏人数平均
     */
    private BigDecimal avgGoodsCollection;

    /**
     * 支付买家数总数
     */
    private BigDecimal totalBuyerPaid;

    /**
     * 支付买家数平均
     */
    private BigDecimal avgBuyerPaid;

    /**
     * 支付件数总数
     */
    private BigDecimal totalGoodsPaid;

    /**
     * 支付件数平均
     */
    private BigDecimal avgGoodsPaid;

    /**
     * 商品浏览量总数
     */
    private BigDecimal totalViews;

    /**
     * 商品浏览量平均
     */
    private BigDecimal avgViews;

    /**
     * 支付订单数总数
     */
    private BigDecimal totalMainOrdersPaid;

    /**
     * 支付订单数平均
     */
    private BigDecimal avgMainOrdersPaid;


    /**
     * 近30天子单总数
     */
    private BigDecimal totalNearlyOrder;

    /**
     * 近30天子单平均数
     */
    private BigDecimal avgNearlyOrder;

    public BigDecimal getAvgSearchExposure() {
        return avgSearchExposure;
    }

    public void setAvgSearchExposure(BigDecimal avgSearchExposure) {
        this.avgSearchExposure = avgSearchExposure;
    }

    public BigDecimal getTotalVisitors() {
        return totalVisitors;
    }

    public void setTotalVisitors(BigDecimal totalVisitors) {
        this.totalVisitors = totalVisitors;
    }

    public BigDecimal getTotalSearchExposure() {
        return totalSearchExposure;
    }

    public void setTotalSearchExposure(BigDecimal totalSearchExposure) {
        this.totalSearchExposure = totalSearchExposure;
    }

    public BigDecimal getAvgVisitors() {
        return avgVisitors;
    }

    public void setAvgVisitors(BigDecimal avgVisitors) {
        this.avgVisitors = avgVisitors;
    }

    public BigDecimal getTotalGoodsAdditionalPrice() {
        return totalGoodsAdditionalPrice;
    }

    public void setTotalGoodsAdditionalPrice(BigDecimal totalGoodsAdditionalPrice) {
        this.totalGoodsAdditionalPrice = totalGoodsAdditionalPrice;
    }

    public BigDecimal getAvgGoodsAdditionalPrice() {
        return avgGoodsAdditionalPrice;
    }

    public void setAvgGoodsAdditionalPrice(BigDecimal avgGoodsAdditionalPrice) {
        this.avgGoodsAdditionalPrice = avgGoodsAdditionalPrice;
    }

    public BigDecimal getTotalGoodsAdditional() {
        return totalGoodsAdditional;
    }

    public void setTotalGoodsAdditional(BigDecimal totalGoodsAdditional) {
        this.totalGoodsAdditional = totalGoodsAdditional;
    }

    public BigDecimal getAvgGoodsAdditional() {
        return avgGoodsAdditional;
    }

    public void setAvgGoodsAdditional(BigDecimal avgGoodsAdditional) {
        this.avgGoodsAdditional = avgGoodsAdditional;
    }

    public BigDecimal getTotalGoodsCollection() {
        return totalGoodsCollection;
    }

    public void setTotalGoodsCollection(BigDecimal totalGoodsCollection) {
        this.totalGoodsCollection = totalGoodsCollection;
    }

    public BigDecimal getAvgGoodsCollection() {
        return avgGoodsCollection;
    }

    public void setAvgGoodsCollection(BigDecimal avgGoodsCollection) {
        this.avgGoodsCollection = avgGoodsCollection;
    }

    public BigDecimal getAvgBuyerPaid() {
        return avgBuyerPaid;
    }

    public void setAvgBuyerPaid(BigDecimal avgBuyerPaid) {
        this.avgBuyerPaid = avgBuyerPaid;
    }

    public BigDecimal getTotalBuyerPaid() {
        return totalBuyerPaid;
    }

    public void setTotalBuyerPaid(BigDecimal totalBuyerPaid) {
        this.totalBuyerPaid = totalBuyerPaid;
    }

    public BigDecimal getTotalGoodsPaid() {
        return totalGoodsPaid;
    }

    public void setTotalGoodsPaid(BigDecimal totalGoodsPaid) {
        this.totalGoodsPaid = totalGoodsPaid;
    }

    public BigDecimal getAvgGoodsPaid() {
        return avgGoodsPaid;
    }

    public void setAvgGoodsPaid(BigDecimal avgGoodsPaid) {
        this.avgGoodsPaid = avgGoodsPaid;
    }

    public BigDecimal getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(BigDecimal totalViews) {
        this.totalViews = totalViews;
    }

    public BigDecimal getAvgViews() {
        return avgViews;
    }

    public void setAvgViews(BigDecimal avgViews) {
        this.avgViews = avgViews;
    }

    public BigDecimal getTotalMainOrdersPaid() {
        return totalMainOrdersPaid;
    }

    public void setTotalMainOrdersPaid(BigDecimal totalMainOrdersPaid) {
        this.totalMainOrdersPaid = totalMainOrdersPaid;
    }

    public BigDecimal getAvgMainOrdersPaid() {
        return avgMainOrdersPaid;
    }

    public void setAvgMainOrdersPaid(BigDecimal avgMainOrdersPaid) {
        this.avgMainOrdersPaid = avgMainOrdersPaid;
    }

    public BigDecimal getTotalNearlyOrder() {
        return totalNearlyOrder;
    }

    public void setTotalNearlyOrder(BigDecimal totalNearlyOrder) {
        this.totalNearlyOrder = totalNearlyOrder;
    }

    public BigDecimal getAvgNearlyOrder() {
        return avgNearlyOrder;
    }

    public void setAvgNearlyOrder(BigDecimal avgNearlyOrder) {
        this.avgNearlyOrder = avgNearlyOrder;
    }
}
