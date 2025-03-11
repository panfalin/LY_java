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
    /** 商品ID */
    @Excel(name = "店铺名")
    private String shopName;

    /** 统计时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statisticalTime;

    /** 支付转化率 */
    @Excel(name = "支付转化率")
    private BigDecimal paymentConversion;

    /** 搜索曝光 */
    @Excel(name = "搜索曝光")
    private String searchExposure;

    /** 成功退款 */
    @Excel(name = "成功退款")
    private BigDecimal successfulRefund;

    /** 访客数 */
    @Excel(name = "访客数")
    private String visitors;

    /** 商品加购 */
    @Excel(name = "商品加购")
    private String goodsAdditional;

    /** 商品收藏 */
    @Excel(name = "商品收藏")
    private String goodsCollection;

    /** 搜索点击率 */
    @Excel(name = "搜索点击率")
    private BigDecimal searchClicks;

    /** 成交金额 */
    @Excel(name = "成交金额")
    private BigDecimal transactionAmount;

    /** 支付件单价 */
    @Excel(name = "支付件单价")
    private BigDecimal pricePay;


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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setCommodityId(String commodityId)
    {
        this.commodityId = commodityId;
    }

    public String getCommodityId() 
    {
        return commodityId;
    }
    public void setStatisticalTime(Date statisticalTime) 
    {
        this.statisticalTime = statisticalTime;
    }

    public Date getStatisticalTime() 
    {
        return statisticalTime;
    }
    public void setPaymentConversion(BigDecimal paymentConversion) 
    {
        this.paymentConversion = paymentConversion;
    }

    public BigDecimal getPaymentConversion() 
    {
        return paymentConversion;
    }
    public void setSearchExposure(String searchExposure) 
    {
        this.searchExposure = searchExposure;
    }

    public String getSearchExposure() 
    {
        return searchExposure;
    }
    public void setSuccessfulRefund(BigDecimal successfulRefund) 
    {
        this.successfulRefund = successfulRefund;
    }

    public BigDecimal getSuccessfulRefund() 
    {
        return successfulRefund;
    }
    public void setVisitors(String visitors) 
    {
        this.visitors = visitors;
    }

    public String getVisitors() 
    {
        return visitors;
    }
    public void setGoodsAdditional(String goodsAdditional) 
    {
        this.goodsAdditional = goodsAdditional;
    }

    public String getGoodsAdditional() 
    {
        return goodsAdditional;
    }
    public void setGoodsCollection(String goodsCollection) 
    {
        this.goodsCollection = goodsCollection;
    }

    public String getGoodsCollection() 
    {
        return goodsCollection;
    }
    public void setSearchClicks(BigDecimal searchClicks) 
    {
        this.searchClicks = searchClicks;
    }

    public BigDecimal getSearchClicks() 
    {
        return searchClicks;
    }
    public void setTransactionAmount(BigDecimal transactionAmount) 
    {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getTransactionAmount() 
    {
        return transactionAmount;
    }
    public void setPricePay(BigDecimal pricePay) 
    {
        this.pricePay = pricePay;
    }

    public BigDecimal getPricePay() 
    {
        return pricePay;
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
