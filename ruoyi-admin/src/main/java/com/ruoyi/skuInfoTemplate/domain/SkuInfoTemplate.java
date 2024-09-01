package com.ruoyi.skuInfoTemplate.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * skuInfoTemplate对象 sku_info_template
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public class SkuInfoTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 库存SKU */
    @Excel(name = "库存SKU")
    private String sku;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String warehouseName;

    /** 库存警戒天数 */
    @Excel(name = "库存警戒天数")
    private String stockWarningDays;

    /** AM-季节性产品-淡季【扩展属性】 */
    @Excel(name = "AM-季节性产品-淡季【扩展属性】")
    private String amSeasonalProductOffseason;

    /** AM-季节性产品-旺季上升比例【扩展属性】 */
    @Excel(name = "AM-季节性产品-旺季上升比例【扩展属性】")
    private String amSeasonalProductPeakIncreaseRatio;

    /** AM-季节性产品-旺季【扩展属性】 */
    @Excel(name = "AM-季节性产品-旺季【扩展属性】")
    private String amSeasonalProductPeak;

    /** AM-竞对销量【扩展属性】 */
    @Excel(name = "AM-竞对销量【扩展属性】")
    private String amCompetitorSales;

    /** AM-市场容量【扩展属性】 */
    @Excel(name = "AM-市场容量【扩展属性】")
    private String amMarketCapacity;

    /** AM-产品生命周期状态【扩展属性】 */
    @Excel(name = "AM-产品生命周期状态【扩展属性】")
    private String amProductLifecycleStatus;

    /** AM-季节性产品-淡季下滑比例【扩展属性】 */
    @Excel(name = "AM-季节性产品-淡季下滑比例【扩展属性】")
    private String amSeasonalProductOffseasonDecline;

    /** 采购天数 */
    @Excel(name = "采购天数")
    private String procurementDays;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 最新采购价 */
    @Excel(name = "最新采购价")
    private String latestPurchasePrice;

    /** 重量 */
    @Excel(name = "重量")
    private String weight;

    /** 体积(cm³) */
    @Excel(name = "体积(cm³)")
    private String volumeCm3;

    /** 仓库最小采购量 */
    @Excel(name = "仓库最小采购量")
    private String minPurchaseQuantity;

    /** AMZ-库存上架时间【扩展属性】 */
    @Excel(name = "AMZ-库存上架时间【扩展属性】")
    private String amzInventoryShelfTime;

    /** 重塑人【扩展属性】 */
    @Excel(name = "重塑人【扩展属性】")
    private String reshaper;

    /** 重塑【扩展属性】 */
    @Excel(name = "重塑【扩展属性】")
    private String reshaping;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isDelete;

    /** 记录当天有没有新增过记录 */
    @Excel(name = "记录当天有没有新增过记录")
    private Long version;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setWarehouseName(String warehouseName) 
    {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() 
    {
        return warehouseName;
    }
    public void setStockWarningDays(String stockWarningDays) 
    {
        this.stockWarningDays = stockWarningDays;
    }

    public String getStockWarningDays() 
    {
        return stockWarningDays;
    }
    public void setAmSeasonalProductOffseason(String amSeasonalProductOffseason) 
    {
        this.amSeasonalProductOffseason = amSeasonalProductOffseason;
    }

    public String getAmSeasonalProductOffseason() 
    {
        return amSeasonalProductOffseason;
    }
    public void setAmSeasonalProductPeakIncreaseRatio(String amSeasonalProductPeakIncreaseRatio) 
    {
        this.amSeasonalProductPeakIncreaseRatio = amSeasonalProductPeakIncreaseRatio;
    }

    public String getAmSeasonalProductPeakIncreaseRatio() 
    {
        return amSeasonalProductPeakIncreaseRatio;
    }
    public void setAmSeasonalProductPeak(String amSeasonalProductPeak) 
    {
        this.amSeasonalProductPeak = amSeasonalProductPeak;
    }

    public String getAmSeasonalProductPeak() 
    {
        return amSeasonalProductPeak;
    }
    public void setAmCompetitorSales(String amCompetitorSales) 
    {
        this.amCompetitorSales = amCompetitorSales;
    }

    public String getAmCompetitorSales() 
    {
        return amCompetitorSales;
    }
    public void setAmMarketCapacity(String amMarketCapacity) 
    {
        this.amMarketCapacity = amMarketCapacity;
    }

    public String getAmMarketCapacity() 
    {
        return amMarketCapacity;
    }
    public void setAmProductLifecycleStatus(String amProductLifecycleStatus) 
    {
        this.amProductLifecycleStatus = amProductLifecycleStatus;
    }

    public String getAmProductLifecycleStatus() 
    {
        return amProductLifecycleStatus;
    }
    public void setAmSeasonalProductOffseasonDecline(String amSeasonalProductOffseasonDecline) 
    {
        this.amSeasonalProductOffseasonDecline = amSeasonalProductOffseasonDecline;
    }

    public String getAmSeasonalProductOffseasonDecline() 
    {
        return amSeasonalProductOffseasonDecline;
    }
    public void setProcurementDays(String procurementDays) 
    {
        this.procurementDays = procurementDays;
    }

    public String getProcurementDays() 
    {
        return procurementDays;
    }
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setLatestPurchasePrice(String latestPurchasePrice) 
    {
        this.latestPurchasePrice = latestPurchasePrice;
    }

    public String getLatestPurchasePrice() 
    {
        return latestPurchasePrice;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }
    public void setVolumeCm3(String volumeCm3) 
    {
        this.volumeCm3 = volumeCm3;
    }

    public String getVolumeCm3() 
    {
        return volumeCm3;
    }
    public void setMinPurchaseQuantity(String minPurchaseQuantity) 
    {
        this.minPurchaseQuantity = minPurchaseQuantity;
    }

    public String getMinPurchaseQuantity() 
    {
        return minPurchaseQuantity;
    }
    public void setAmzInventoryShelfTime(String amzInventoryShelfTime) 
    {
        this.amzInventoryShelfTime = amzInventoryShelfTime;
    }

    public String getAmzInventoryShelfTime() 
    {
        return amzInventoryShelfTime;
    }
    public void setReshaper(String reshaper) 
    {
        this.reshaper = reshaper;
    }

    public String getReshaper() 
    {
        return reshaper;
    }
    public void setReshaping(String reshaping) 
    {
        this.reshaping = reshaping;
    }

    public String getReshaping() 
    {
        return reshaping;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }
    public void setVersion(Long version) 
    {
        this.version = version;
    }

    public Long getVersion() 
    {
        return version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sku", getSku())
            .append("warehouseName", getWarehouseName())
            .append("stockWarningDays", getStockWarningDays())
            .append("amSeasonalProductOffseason", getAmSeasonalProductOffseason())
            .append("amSeasonalProductPeakIncreaseRatio", getAmSeasonalProductPeakIncreaseRatio())
            .append("amSeasonalProductPeak", getAmSeasonalProductPeak())
            .append("amCompetitorSales", getAmCompetitorSales())
            .append("amMarketCapacity", getAmMarketCapacity())
            .append("amProductLifecycleStatus", getAmProductLifecycleStatus())
            .append("amSeasonalProductOffseasonDecline", getAmSeasonalProductOffseasonDecline())
            .append("procurementDays", getProcurementDays())
            .append("supplierName", getSupplierName())
            .append("latestPurchasePrice", getLatestPurchasePrice())
            .append("weight", getWeight())
            .append("volumeCm3", getVolumeCm3())
            .append("minPurchaseQuantity", getMinPurchaseQuantity())
            .append("amzInventoryShelfTime", getAmzInventoryShelfTime())
            .append("reshaper", getReshaper())
            .append("reshaping", getReshaping())
            .append("createdAt", getCreatedAt())
            .append("isDelete", getIsDelete())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("version", getVersion())
            .toString();
    }
}
