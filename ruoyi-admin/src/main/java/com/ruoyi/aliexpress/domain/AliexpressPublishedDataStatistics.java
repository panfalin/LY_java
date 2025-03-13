package com.ruoyi.aliexpress.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class AliexpressPublishedDataStatistics extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 搜索曝光总计
     */
    private BigDecimal totalSearchExposure;

    /**
     * 搜索曝光平均
     */
    private BigDecimal avgSearchExposure;

    /**
     * 成功退款总计
     */
    private BigDecimal totalSuccessfulRefund;

    /**
     * 成功退款平均
     */
    private BigDecimal avgSuccessfulRefund;

    /**
     * 访客数总计
     */
    private BigDecimal totalVisitors;

    /**
     * 访客数平均
     */
    private BigDecimal avgVisitors;

    /**
     * 商品加购总计
     */
    private BigDecimal totalGoodsAdditional;

    /**
     * 商品加购平均
     */
    private BigDecimal avgGoodsAdditional;

    /**
     * 商品收藏总计
     */
    private BigDecimal totalGoodsCollection;

    /**
     * 商品收藏平均
     */
    private BigDecimal avgGoodsCollection;


    /**
     * 成交金额总计
     */
    private BigDecimal totalTransactionAmount;

    /**
     * 成交金额平均
     */
    private BigDecimal avgTransactionAmount;

    /**
     * 支付主订单数总计
     */
    private BigDecimal totalMainOrdersPaid;

    /**
     * 支付主订单数平均
     */
    private BigDecimal avgMainOrdersPaid;

    /**
     * 浏览总数
     */
    private BigDecimal totalViews;

    /**
     * 浏览平均
     */
    private BigDecimal avgViews;

    public BigDecimal getTotalSearchExposure() {
        return totalSearchExposure;
    }

    public void setTotalSearchExposure(BigDecimal totalSearchExposure) {
        this.totalSearchExposure = totalSearchExposure;
    }

    public BigDecimal getAvgSearchExposure() {
        return avgSearchExposure;
    }

    public void setAvgSearchExposure(BigDecimal avgSearchExposure) {
        this.avgSearchExposure = avgSearchExposure;
    }

    public BigDecimal getTotalSuccessfulRefund() {
        return totalSuccessfulRefund;
    }

    public void setTotalSuccessfulRefund(BigDecimal totalSuccessfulRefund) {
        this.totalSuccessfulRefund = totalSuccessfulRefund;
    }

    public BigDecimal getAvgSuccessfulRefund() {
        return avgSuccessfulRefund;
    }

    public void setAvgSuccessfulRefund(BigDecimal avgSuccessfulRefund) {
        this.avgSuccessfulRefund = avgSuccessfulRefund;
    }

    public BigDecimal getTotalVisitors() {
        return totalVisitors;
    }

    public void setTotalVisitors(BigDecimal totalVisitors) {
        this.totalVisitors = totalVisitors;
    }

    public BigDecimal getTotalGoodsAdditional() {
        return totalGoodsAdditional;
    }

    public void setTotalGoodsAdditional(BigDecimal totalGoodsAdditional) {
        this.totalGoodsAdditional = totalGoodsAdditional;
    }

    public BigDecimal getAvgVisitors() {
        return avgVisitors;
    }

    public void setAvgVisitors(BigDecimal avgVisitors) {
        this.avgVisitors = avgVisitors;
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

    public BigDecimal getTotalTransactionAmount() {
        return totalTransactionAmount;
    }

    public void setTotalTransactionAmount(BigDecimal totalTransactionAmount) {
        this.totalTransactionAmount = totalTransactionAmount;
    }

    public BigDecimal getAvgTransactionAmount() {
        return avgTransactionAmount;
    }

    public void setAvgTransactionAmount(BigDecimal avgTransactionAmount) {
        this.avgTransactionAmount = avgTransactionAmount;
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
}
