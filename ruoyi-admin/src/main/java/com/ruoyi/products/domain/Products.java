package com.ruoyi.products.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * products对象 products
 *
 * @author ruoyi
 * @date 2024-10-16
 */
public class Products extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** SKU */
    @Excel(name = "SKU")
    private String productCode;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** 上架时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上架时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date listingTime;

    /** 分类 */
    @Excel(name = "分类")
    private String category;

    /** 热销国家 */
    @Excel(name = "热销国家")
    private String bestSellingCountries;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBestSellingCountries() {
        return bestSellingCountries;
    }

    public void setBestSellingCountries(String bestSellingCountries) {
        this.bestSellingCountries = bestSellingCountries;
    }

    public Date getListingTime() {
        return listingTime;
    }

    public void setListingTime(Date listingTime) {
        this.listingTime = listingTime;
    }

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 目标 */
    @Excel(name = "目标")
    private String target;

    /** 可用库存 */
    @Excel(name = "可用库存")
    private Long totalInventory;

    /** 最新采购价 */
    @Excel(name = "最新采购价")
    private BigDecimal latestPurchasePrice;

    /** 图片 */
    @Excel(name = "图片")
    private String imageUrl;

    /** 7天销量 */
    @Excel(name = "7天销量")
    private Long salesDays7;

    /** 28天销量 */
    @Excel(name = "28天销量")
    private Long salesDays28;

    /** 42天销量 */
    @Excel(name = "42天销量")
    private Long salesDays42;

    /** AE-竞品ID一【扩展属性】 */
    @Excel(name = "AE-竞品ID一【扩展属性】")
    private String ae_competitor_id_one_extension_attribute;

    /** AE-竞品ID二【扩展属性】 */
    @Excel(name = "AE-竞品ID二【扩展属性】")
    private String ae_competitor_id_two_extension_attribute;

    /** AE-竞品ID三【扩展属性】 */
    @Excel(name = "AE-竞品ID三【扩展属性】")
    private String ae_competitor_id_three_extension_attribute;

    /** 总刊登数 */
    @Excel(name = "总刊登数")
        private Long totalListingCount;

    /** 上架店铺数 */
    @Excel(name = "上架店铺数")
    private Long store_count;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    public String getProductCode()
    {
        return productCode;
    }


    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStatus()
    {
        return status;
    }
    public void setTotalInventory(Long totalInventory)
    {
        this.totalInventory = totalInventory;
    }

    public Long getTotalInventory()
    {
        return totalInventory;
    }
    public void setLatestPurchasePrice(BigDecimal latestPurchasePrice)
    {
        this.latestPurchasePrice = latestPurchasePrice;
    }

    public BigDecimal getLatestPurchasePrice()
    {
        return latestPurchasePrice;
    }
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }
    public Long getSales7Days() {
        return salesDays7;
    }

    public void setSales7Days(Long sales7Days) {
        this.salesDays7 = salesDays7;
    }

    public Long getSales28Days() {
        return salesDays28;
    }

    public void setSales28Days(Long sales28Days) {
        this.salesDays28 = salesDays28;
    }

    public Long getSales42Days() {
        return salesDays42;
    }

    public void setSales42Days(Long sales42Days) {
        this.salesDays42 = salesDays42;
    }

    public String getAe_competitor_id_one_extension_attribute() {
        return ae_competitor_id_one_extension_attribute;
    }

    public void setAe_competitor_id_one_extension_attribute(String ae_competitor_id_one_extension_attribute) {
        this.ae_competitor_id_one_extension_attribute = ae_competitor_id_one_extension_attribute;
    }

    public String getAe_competitor_id_two_extension_attribute() {
        return ae_competitor_id_two_extension_attribute;
    }

    public void setAe_competitor_id_two_extension_attribute(String ae_competitor_id_two_extension_attribute) {
        this.ae_competitor_id_two_extension_attribute = ae_competitor_id_two_extension_attribute;
    }

    public String getAe_competitor_id_three_extension_attribute() {
        return ae_competitor_id_three_extension_attribute;
    }

    public void setAe_competitor_id_three_extension_attribute(String ae_competitor_id_three_extension_attribute) {
        this.ae_competitor_id_three_extension_attribute = ae_competitor_id_three_extension_attribute;
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
            .append("productCode", getProductCode())
            .append("status", getStatus())
            .append("totalInventory", getTotalInventory())
            .append("latestPurchasePrice", getLatestPurchasePrice())
            .append("imageUrl", getImageUrl())
            .append("ae_competitor_id_one_extension_attribute", getAe_competitor_id_one_extension_attribute())
            .append("ae_competitor_id_two_extension_attribute", getAe_competitor_id_two_extension_attribute())
            .append("ae_competitor_id_three_extension_attribute", getAe_competitor_id_three_extension_attribute())
            .append("sales7Days", getSales7Days())
            .append("sales28Days", getSales28Days())
            .append("sales42Days", getSales42Days())
            .append("totalListingCount", getTotalListingCount())
            .append("store_count", getStore_count())
            .append("target", getTarget())
            .toString();
    }
}
