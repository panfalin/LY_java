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
    private BigDecimal paymentConversion;

    /** 搜索曝光量 */
    @Excel(name = "搜索曝光量")
    private Long searchExposure;

    /** 商品访客数 */
    @Excel(name = "商品访客数")
    private Long visitors;

    /** 商品加购件数 */
    @Excel(name = "商品加购件数")
    private Long goodsAdditionalPrice;

    /** 商品加购人数 */
    @Excel(name = "商品加购人数")
    private Long goodsAdditional;

    /** 商品收藏人数 */
    @Excel(name = "商品收藏人数")
    private Long goodsCollection;

    /** $column.columnComment */
    private Long sId;

    /** 支付买家数 */
    @Excel(name = "支付买家数")
    private Long buyerPaid;

    /** 支付件数 */
    @Excel(name = "支付件数")
    private Long goodsPaid;

    /** 商品浏览量 */
    @Excel(name = "商品浏览量")
    private Long views;

    /** 支付订单数 */
    @Excel(name = "支付订单数")
    private Long mainOrdersPaid;

    /** 排名百分比 */
    @Excel(name = "排名百分比")
    private BigDecimal rankingPercentage;

    /** 是否仓发 */
    @Excel(name = "是否仓发")
    private String ifWarehouseDelivery;

    /** 近30天子单数 */
    @Excel(name = "近30天子单数")
    private Long nearlyOrder;

    /** 是否更新 */
    @Excel(name = "是否更新")
    private String ifUpdate;

    public void setCommodityId(String commodityId) 
    {
        this.commodityId = commodityId;
    }

    public String getCommodityId() 
    {
        return commodityId;
    }
    public void setPersonName(String personName) 
    {
        this.personName = personName;
    }

    public String getPersonName() 
    {
        return personName;
    }
    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
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
    public void setSearchExposure(Long searchExposure) 
    {
        this.searchExposure = searchExposure;
    }

    public Long getSearchExposure() 
    {
        return searchExposure;
    }
    public void setVisitors(Long visitors) 
    {
        this.visitors = visitors;
    }

    public Long getVisitors() 
    {
        return visitors;
    }
    public void setGoodsAdditionalPrice(Long goodsAdditionalPrice) 
    {
        this.goodsAdditionalPrice = goodsAdditionalPrice;
    }

    public Long getGoodsAdditionalPrice() 
    {
        return goodsAdditionalPrice;
    }
    public void setGoodsAdditional(Long goodsAdditional) 
    {
        this.goodsAdditional = goodsAdditional;
    }

    public Long getGoodsAdditional() 
    {
        return goodsAdditional;
    }
    public void setGoodsCollection(Long goodsCollection) 
    {
        this.goodsCollection = goodsCollection;
    }

    public Long getGoodsCollection() 
    {
        return goodsCollection;
    }
    public void setsId(Long sId) 
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }
    public void setBuyerPaid(Long buyerPaid) 
    {
        this.buyerPaid = buyerPaid;
    }

    public Long getBuyerPaid() 
    {
        return buyerPaid;
    }
    public void setGoodsPaid(Long goodsPaid) 
    {
        this.goodsPaid = goodsPaid;
    }

    public Long getGoodsPaid() 
    {
        return goodsPaid;
    }
    public void setViews(Long views) 
    {
        this.views = views;
    }

    public Long getViews() 
    {
        return views;
    }
    public void setMainOrdersPaid(Long mainOrdersPaid) 
    {
        this.mainOrdersPaid = mainOrdersPaid;
    }

    public Long getMainOrdersPaid() 
    {
        return mainOrdersPaid;
    }
    public void setRankingPercentage(BigDecimal rankingPercentage) 
    {
        this.rankingPercentage = rankingPercentage;
    }

    public BigDecimal getRankingPercentage() 
    {
        return rankingPercentage;
    }
    public void setIfWarehouseDelivery(String ifWarehouseDelivery) 
    {
        this.ifWarehouseDelivery = ifWarehouseDelivery;
    }

    public String getIfWarehouseDelivery() 
    {
        return ifWarehouseDelivery;
    }
    public void setNearlyOrder(Long nearlyOrder) 
    {
        this.nearlyOrder = nearlyOrder;
    }

    public Long getNearlyOrder() 
    {
        return nearlyOrder;
    }
    public void setIfUpdate(String ifUpdate) 
    {
        this.ifUpdate = ifUpdate;
    }

    public String getIfUpdate() 
    {
        return ifUpdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("commodityId", getCommodityId())
            .append("personName", getPersonName())
            .append("shopName", getShopName())
            .append("statisticalTime", getStatisticalTime())
            .append("paymentConversion", getPaymentConversion())
            .append("searchExposure", getSearchExposure())
            .append("visitors", getVisitors())
            .append("goodsAdditionalPrice", getGoodsAdditionalPrice())
            .append("goodsAdditional", getGoodsAdditional())
            .append("goodsCollection", getGoodsCollection())
            .append("sId", getsId())
            .append("buyerPaid", getBuyerPaid())
            .append("goodsPaid", getGoodsPaid())
            .append("views", getViews())
            .append("mainOrdersPaid", getMainOrdersPaid())
            .append("rankingPercentage", getRankingPercentage())
            .append("ifWarehouseDelivery", getIfWarehouseDelivery())
            .append("nearlyOrder", getNearlyOrder())
            .append("ifUpdate", getIfUpdate())
            .toString();
    }
}
