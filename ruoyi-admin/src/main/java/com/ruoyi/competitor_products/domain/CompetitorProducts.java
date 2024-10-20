package com.ruoyi.competitor_products.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * competitor_products对象 competitor_products
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public class CompetitorProducts extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** SKU */
    @Excel(name = "SKU")
    private Long productId;

    /** 竞品id */
    @Excel(name = "竞品id")
    private String competitorId;

    /** 180天销量 */
    @Excel(name = "180天销量")
    private Long sales180Days;

    /** 7天销量 */
    @Excel(name = "7天销量")
    private Long sales7Days;

    /** 收藏数 */
    @Excel(name = "收藏数")
    private Long favoritesCount;

    /** 180天评论数 */
    @Excel(name = "180天评论数")
    private Long reviewsCount;

    /** 最低价格 */
    @Excel(name = "最低价格")
    private BigDecimal minPrice;

    /** 最高价格 */
    @Excel(name = "最高价格")
    private BigDecimal maxPrice;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setCompetitorId(String competitorId) 
    {
        this.competitorId = competitorId;
    }

    public String getCompetitorId() 
    {
        return competitorId;
    }
    public void setSales180Days(Long sales180Days) 
    {
        this.sales180Days = sales180Days;
    }

    public Long getSales180Days() 
    {
        return sales180Days;
    }
    public void setSales7Days(Long sales7Days) 
    {
        this.sales7Days = sales7Days;
    }

    public Long getSales7Days() 
    {
        return sales7Days;
    }
    public void setFavoritesCount(Long favoritesCount) 
    {
        this.favoritesCount = favoritesCount;
    }

    public Long getFavoritesCount() 
    {
        return favoritesCount;
    }
    public void setReviewsCount(Long reviewsCount) 
    {
        this.reviewsCount = reviewsCount;
    }

    public Long getReviewsCount() 
    {
        return reviewsCount;
    }
    public void setMinPrice(BigDecimal minPrice) 
    {
        this.minPrice = minPrice;
    }

    public BigDecimal getMinPrice() 
    {
        return minPrice;
    }
    public void setMaxPrice(BigDecimal maxPrice) 
    {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getMaxPrice() 
    {
        return maxPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productId", getProductId())
            .append("competitorId", getCompetitorId())
            .append("sales180Days", getSales180Days())
            .append("sales7Days", getSales7Days())
            .append("favoritesCount", getFavoritesCount())
            .append("reviewsCount", getReviewsCount())
            .append("minPrice", getMinPrice())
            .append("maxPrice", getMaxPrice())
            .toString();
    }
}
