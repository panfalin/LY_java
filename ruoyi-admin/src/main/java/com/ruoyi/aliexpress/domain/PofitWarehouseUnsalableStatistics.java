package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 滞销库存对象 pofit_warehouse_unsalable_statistics
 * 
 * @author ruoyi
 * @date 2025-01-14
 */
public class PofitWarehouseUnsalableStatistics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 年份 */
    @Excel(name = "年份")
    private Long year;

    /** 月份 */
    @Excel(name = "月份")
    private Long moon;

    /** sku */
    @Excel(name = "sku")
    private String sku;

    /** 在途库存数量 */
    @Excel(name = "在途库存数量")
    private Long transitQuantity;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long stockQuantity;

    /** 未发货数量 */
    @Excel(name = "未发货数量")
    private Long unshippedQuantity;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** 成本价格 */
    @Excel(name = "成本价格")
    private BigDecimal costPrice;

    /** 库存金额 */
    @Excel(name = "库存金额")
    private BigDecimal inventoryCost;

    public void setYear(Long year) 
    {
        this.year = year;
    }

    public Long getYear() 
    {
        return year;
    }
    public void setMoon(Long moon) 
    {
        this.moon = moon;
    }

    public Long getMoon() 
    {
        return moon;
    }
    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setTransitQuantity(Long transitQuantity) 
    {
        this.transitQuantity = transitQuantity;
    }

    public Long getTransitQuantity() 
    {
        return transitQuantity;
    }
    public void setStockQuantity(Long stockQuantity) 
    {
        this.stockQuantity = stockQuantity;
    }

    public Long getStockQuantity() 
    {
        return stockQuantity;
    }
    public void setUnshippedQuantity(Long unshippedQuantity) 
    {
        this.unshippedQuantity = unshippedQuantity;
    }

    public Long getUnshippedQuantity() 
    {
        return unshippedQuantity;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }
    public void setCostPrice(BigDecimal costPrice) 
    {
        this.costPrice = costPrice;
    }

    public BigDecimal getCostPrice() 
    {
        return costPrice;
    }
    public void setInventoryCost(BigDecimal inventoryCost) 
    {
        this.inventoryCost = inventoryCost;
    }

    public BigDecimal getInventoryCost() 
    {
        return inventoryCost;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("year", getYear())
            .append("moon", getMoon())
            .append("sku", getSku())
            .append("transitQuantity", getTransitQuantity())
            .append("stockQuantity", getStockQuantity())
            .append("unshippedQuantity", getUnshippedQuantity())
            .append("storeName", getStoreName())
            .append("costPrice", getCostPrice())
            .append("inventoryCost", getInventoryCost())
            .toString();
    }
}
