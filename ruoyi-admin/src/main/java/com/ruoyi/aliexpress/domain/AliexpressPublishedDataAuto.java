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
 * 刊登数据-全托管对象 aliexpress_published_data_auto
 * 
 * @author ruoyi
 * @date 2025-03-17
 */
public class AliexpressPublishedDataAuto extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品ID */
    @Excel(name = "商品ID")
    private String commodityId;

    /** 店铺负责人 */
    @Excel(name = "店铺负责人")
    private String personName;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String shopName;

    /** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statisticalTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate beginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTime;

    /** 支付转化率 */
    @Excel(name = "支付转化率")
    private BigDecimal paymentConversionContrast;
    private BigDecimal paymentConversion;

    /** 搜索曝光量 */
    @Excel(name = "搜索曝光量")
    private BigDecimal searchExposure;
    private BigDecimal searchExposureContrast;

    /** 商品访客数 */
    @Excel(name = "商品访客数")
    private BigDecimal visitors;
    private BigDecimal visitorsContrast;

    /** 商品加购件数 */
    @Excel(name = "商品加购件数")
    private BigDecimal goodsAdditionalPrice;
    private BigDecimal goodsAdditionalPriceContrast;

    /** 商品加购人数 */
    @Excel(name = "商品加购人数")
    private BigDecimal goodsAdditional;
    private BigDecimal goodsAdditionalContrast;

    /** 商品收藏人数 */
    @Excel(name = "商品收藏人数")
    private BigDecimal goodsCollection;
    private BigDecimal goodsCollectionContrast;

    /** $column.columnComment */
    private BigDecimal sId;

    /** 支付买家数 */
    @Excel(name = "支付买家数")
    private BigDecimal buyerPaid;
    private BigDecimal buyerPaidContrast;

    /** 支付件数 */
    @Excel(name = "支付件数")
    private BigDecimal goodsPaid;
    private BigDecimal goodsPaidContrast;

    /** 商品浏览量 */
    @Excel(name = "商品浏览量")
    private BigDecimal views;
    private BigDecimal viewsContrast;

    /** 支付订单数 */
    @Excel(name = "支付订单数")
    private BigDecimal mainOrdersPaid;
    private BigDecimal mainOrdersPaidContrast;

    /** 排名百分比 */
    @Excel(name = "排名百分比")
    private BigDecimal rankingPercentage;
    private BigDecimal rankingPercentageContrast;

    /** 是否仓发 */
    @Excel(name = "是否仓发")
    private String ifWarehouseDelivery;

    /** 近30天子单数 */
    @Excel(name = "近30天子单数")
    private BigDecimal nearlyOrder;
    private BigDecimal nearlyOrderContrast;

    /** 是否更新 */
    @Excel(name = "是否更新")
    private String ifUpdate;



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

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Date getStatisticalTime() {
        return statisticalTime;
    }

    public void setStatisticalTime(Date statisticalTime) {
        this.statisticalTime = statisticalTime;
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

    public BigDecimal getPaymentConversionContrast() {
        return paymentConversionContrast;
    }

    public void setPaymentConversionContrast(BigDecimal paymentConversionContrast) {
        this.paymentConversionContrast = paymentConversionContrast;
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

    public BigDecimal getSearchExposureContrast() {
        return searchExposureContrast;
    }

    public void setSearchExposureContrast(BigDecimal searchExposureContrast) {
        this.searchExposureContrast = searchExposureContrast;
    }

    public BigDecimal getVisitors() {
        return visitors;
    }

    public void setVisitors(BigDecimal visitors) {
        this.visitors = visitors;
    }

    public BigDecimal getVisitorsContrast() {
        return visitorsContrast;
    }

    public void setVisitorsContrast(BigDecimal visitorsContrast) {
        this.visitorsContrast = visitorsContrast;
    }

    public BigDecimal getGoodsAdditionalPrice() {
        return goodsAdditionalPrice;
    }

    public void setGoodsAdditionalPrice(BigDecimal goodsAdditionalPrice) {
        this.goodsAdditionalPrice = goodsAdditionalPrice;
    }

    public BigDecimal getGoodsAdditionalPriceContrast() {
        return goodsAdditionalPriceContrast;
    }

    public void setGoodsAdditionalPriceContrast(BigDecimal goodsAdditionalPriceContrast) {
        this.goodsAdditionalPriceContrast = goodsAdditionalPriceContrast;
    }

    public BigDecimal getGoodsAdditional() {
        return goodsAdditional;
    }

    public void setGoodsAdditional(BigDecimal goodsAdditional) {
        this.goodsAdditional = goodsAdditional;
    }

    public BigDecimal getGoodsAdditionalContrast() {
        return goodsAdditionalContrast;
    }

    public void setGoodsAdditionalContrast(BigDecimal goodsAdditionalContrast) {
        this.goodsAdditionalContrast = goodsAdditionalContrast;
    }

    public BigDecimal getGoodsCollection() {
        return goodsCollection;
    }

    public void setGoodsCollection(BigDecimal goodsCollection) {
        this.goodsCollection = goodsCollection;
    }

    public BigDecimal getGoodsCollectionContrast() {
        return goodsCollectionContrast;
    }

    public void setGoodsCollectionContrast(BigDecimal goodsCollectionContrast) {
        this.goodsCollectionContrast = goodsCollectionContrast;
    }

    public BigDecimal getsId() {
        return sId;
    }

    public void setsId(BigDecimal sId) {
        this.sId = sId;
    }

    public BigDecimal getBuyerPaid() {
        return buyerPaid;
    }

    public void setBuyerPaid(BigDecimal buyerPaid) {
        this.buyerPaid = buyerPaid;
    }

    public BigDecimal getBuyerPaidContrast() {
        return buyerPaidContrast;
    }

    public void setBuyerPaidContrast(BigDecimal buyerPaidContrast) {
        this.buyerPaidContrast = buyerPaidContrast;
    }

    public BigDecimal getGoodsPaid() {
        return goodsPaid;
    }

    public void setGoodsPaid(BigDecimal goodsPaid) {
        this.goodsPaid = goodsPaid;
    }

    public BigDecimal getGoodsPaidContrast() {
        return goodsPaidContrast;
    }

    public void setGoodsPaidContrast(BigDecimal goodsPaidContrast) {
        this.goodsPaidContrast = goodsPaidContrast;
    }

    public BigDecimal getViews() {
        return views;
    }

    public void setViews(BigDecimal views) {
        this.views = views;
    }

    public BigDecimal getViewsContrast() {
        return viewsContrast;
    }

    public void setViewsContrast(BigDecimal viewsContrast) {
        this.viewsContrast = viewsContrast;
    }

    public BigDecimal getMainOrdersPaid() {
        return mainOrdersPaid;
    }

    public void setMainOrdersPaid(BigDecimal mainOrdersPaid) {
        this.mainOrdersPaid = mainOrdersPaid;
    }

    public BigDecimal getMainOrdersPaidContrast() {
        return mainOrdersPaidContrast;
    }

    public void setMainOrdersPaidContrast(BigDecimal mainOrdersPaidContrast) {
        this.mainOrdersPaidContrast = mainOrdersPaidContrast;
    }

    public BigDecimal getRankingPercentage() {
        return rankingPercentage;
    }

    public void setRankingPercentage(BigDecimal rankingPercentage) {
        this.rankingPercentage = rankingPercentage;
    }

    public BigDecimal getRankingPercentageContrast() {
        return rankingPercentageContrast;
    }

    public void setRankingPercentageContrast(BigDecimal rankingPercentageContrast) {
        this.rankingPercentageContrast = rankingPercentageContrast;
    }

    public String getIfWarehouseDelivery() {
        return ifWarehouseDelivery;
    }

    public void setIfWarehouseDelivery(String ifWarehouseDelivery) {
        this.ifWarehouseDelivery = ifWarehouseDelivery;
    }

    public BigDecimal getNearlyOrder() {
        return nearlyOrder;
    }

    public void setNearlyOrder(BigDecimal nearlyOrder) {
        this.nearlyOrder = nearlyOrder;
    }

    public BigDecimal getNearlyOrderContrast() {
        return nearlyOrderContrast;
    }

    public void setNearlyOrderContrast(BigDecimal nearlyOrderContrast) {
        this.nearlyOrderContrast = nearlyOrderContrast;
    }

    public String getIfUpdate() {
        return ifUpdate;
    }

    public void setIfUpdate(String ifUpdate) {
        this.ifUpdate = ifUpdate;
    }
}
