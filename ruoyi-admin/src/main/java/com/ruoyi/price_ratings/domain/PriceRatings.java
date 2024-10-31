package com.ruoyi.price_ratings.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 价格和评分信息对象 price_ratings
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
public class PriceRatings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 产品标题 */
    @Excel(name = "产品标题")
    private String title;

    /** 小图URL */
    @Excel(name = "小图URL")
    private String smallImg;

    /** 中图URL */
    @Excel(name = "中图URL")
    private String middleImg;

    /** 大图URL */
    @Excel(name = "大图URL")
    private String largerImg;

    /** 原价 */
    @Excel(name = "原价")
    private String originalPrice;

    /** 促销价 */
    @Excel(name = "促销价")
    private String promotionPrice;

    /** 货币符号 */
    @Excel(name = "货币符号")
    private String currency;

    /** 促销折扣百分比 */
    @Excel(name = "促销折扣百分比")
    private Long promotionDiscount;

    /** 订单数量 */
    @Excel(name = "订单数量")
    private Long orders;

    /** 销售数量 */
    @Excel(name = "销售数量")
    private String sales;

    /** 平均评分 */
    @Excel(name = "平均评分")
    private BigDecimal averageStar;

    /** 反馈数量 */
    @Excel(name = "反馈数量")
    private Long feedbacks;

    /** 是否有促销 */
    @Excel(name = "是否有促销")
    private Integer isPromotion;

    /** 是否是大促产品 */
    @Excel(name = "是否是大促产品")
    private Integer isBigSaleProduct;

    /** 详情页URL */
    @Excel(name = "详情页URL")
    private String detailUrl;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** 上架时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上架时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date listingTime;

    public Date getListingTime() {
        return listingTime;
    }

    public void setListingTime(Date listingTime) {
        this.listingTime = listingTime;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setSmallImg(String smallImg) 
    {
        this.smallImg = smallImg;
    }

    public String getSmallImg() 
    {
        return smallImg;
    }
    public void setMiddleImg(String middleImg) 
    {
        this.middleImg = middleImg;
    }

    public String getMiddleImg() 
    {
        return middleImg;
    }
    public void setLargerImg(String largerImg) 
    {
        this.largerImg = largerImg;
    }

    public String getLargerImg() 
    {
        return largerImg;
    }
    public void setOriginalPrice(String originalPrice) 
    {
        this.originalPrice = originalPrice;
    }

    public String getOriginalPrice() 
    {
        return originalPrice;
    }
    public void setPromotionPrice(String promotionPrice) 
    {
        this.promotionPrice = promotionPrice;
    }

    public String getPromotionPrice() 
    {
        return promotionPrice;
    }
    public void setCurrency(String currency) 
    {
        this.currency = currency;
    }

    public String getCurrency() 
    {
        return currency;
    }
    public void setPromotionDiscount(Long promotionDiscount) 
    {
        this.promotionDiscount = promotionDiscount;
    }

    public Long getPromotionDiscount() 
    {
        return promotionDiscount;
    }
    public void setOrders(Long orders) 
    {
        this.orders = orders;
    }

    public Long getOrders() 
    {
        return orders;
    }
    public void setSales(String sales) 
    {
        this.sales = sales;
    }

    public String getSales() 
    {
        return sales;
    }
    public void setAverageStar(BigDecimal averageStar) 
    {
        this.averageStar = averageStar;
    }

    public BigDecimal getAverageStar() 
    {
        return averageStar;
    }
    public void setFeedbacks(Long feedbacks) 
    {
        this.feedbacks = feedbacks;
    }

    public Long getFeedbacks() 
    {
        return feedbacks;
    }
    public void setIsPromotion(Integer isPromotion) 
    {
        this.isPromotion = isPromotion;
    }

    public Integer getIsPromotion() 
    {
        return isPromotion;
    }
    public void setIsBigSaleProduct(Integer isBigSaleProduct) 
    {
        this.isBigSaleProduct = isBigSaleProduct;
    }

    public Integer getIsBigSaleProduct() 
    {
        return isBigSaleProduct;
    }
    public void setDetailUrl(String detailUrl) 
    {
        this.detailUrl = detailUrl;
    }

    public String getDetailUrl() 
    {
        return detailUrl;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("smallImg", getSmallImg())
            .append("middleImg", getMiddleImg())
            .append("largerImg", getLargerImg())
            .append("originalPrice", getOriginalPrice())
            .append("promotionPrice", getPromotionPrice())
            .append("currency", getCurrency())
            .append("promotionDiscount", getPromotionDiscount())
            .append("orders", getOrders())
            .append("sales", getSales())
            .append("averageStar", getAverageStar())
            .append("feedbacks", getFeedbacks())
            .append("isPromotion", getIsPromotion())
            .append("isBigSaleProduct", getIsBigSaleProduct())
            .append("detailUrl", getDetailUrl())
            .append("storeName", getStoreName())
            .toString();
    }
}
