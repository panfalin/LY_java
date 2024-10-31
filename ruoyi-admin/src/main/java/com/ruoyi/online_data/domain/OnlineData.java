package com.ruoyi.online_data.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 速卖通分析-刊登数据对象 online_data
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
public class OnlineData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** SKU */
    @Excel(name = "SKU")
    private Long productId;

    /** 店铺 */
    @Excel(name = "店铺")
    private String storeEmail;

    /** 刊登id */
    @Excel(name = "刊登id")
    private String listingId;

    /** 刊登数量 */
    @Excel(name = "刊登数量")
    private Long listingCount;

    /** 总刊登数 */
    @Excel(name = "总刊登数")
    private Long totalListingCount;

    /** 上架店铺数 */
    @Excel(name = "上架店铺数")
    private Long store_count;

    /** 销量 */
    @Excel(name = "销量")
    private Long totalSales;

    public Long getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Long totalSales) {
        this.totalSales = totalSales;
    }

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

    public void setStoreEmail(String storeEmail)
    {
        this.storeEmail = storeEmail;
    }
    public String getStoreEmail()
    {
        return storeEmail;
    }

    public void setListingId(String listingId)
    {
        this.listingId = listingId;
    }
    public String getListingId()
    {
        return listingId;
    }

    public void setListingCount(Long listingCount)
    {
        this.listingCount = listingCount;
    }
    public Long getListingCount()
    {
        return listingCount;
    }

    public void setTotalListingCount(Long totalListingCount)
    {
        this.totalListingCount = totalListingCount;
    }
    public Long getTotalListingCount()
    {
        return totalListingCount;
    }

    public Long getStore_count() {
        return store_count;
    }

    public void setStore_count(Long store_count) {
        this.store_count = store_count;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productId", getProductId())
            .append("storeEmail", getStoreEmail())
            .append("listingId", getListingId())
            .append("listingCount", getListingCount())
            .append("totalListingCount", getTotalListingCount())
            .append("store_count", getStore_count())
            .toString();
    }
}
