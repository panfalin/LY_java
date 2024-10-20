package com.ruoyi.price_ratings.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * price_ratings对象 price_ratings
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public class PriceRatings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 刊登ids */
    @Excel(name = "刊登ids")
    private Long onlineDataId;

    /** 刊登id */
    @Excel(name = "刊登id")
    private String listingId;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 评分 */
    @Excel(name = "评分")
    private BigDecimal rating;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOnlineDataId(Long onlineDataId) 
    {
        this.onlineDataId = onlineDataId;
    }

    public Long getOnlineDataId() 
    {
        return onlineDataId;
    }
    public void setListingId(String listingId) 
    {
        this.listingId = listingId;
    }

    public String getListingId() 
    {
        return listingId;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setRating(BigDecimal rating) 
    {
        this.rating = rating;
    }

    public BigDecimal getRating() 
    {
        return rating;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("onlineDataId", getOnlineDataId())
            .append("listingId", getListingId())
            .append("price", getPrice())
            .append("rating", getRating())
            .toString();
    }
}
