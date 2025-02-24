package com.ruoyi.amazon.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 亚马逊数据分析，周转率，mskulist，这个是基础信息对象 amz_data_analysis_turnover_mskulist
 * 
 * @author panfalin
 * @date 2025-02-19
 */
public class AmzDataAnalysisTurnoverMskulist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** MSKU */
    @Excel(name = "MSKU")
    private String msku;

    /** 商品一级目录 */
    @Excel(name = "商品一级目录")
    private String categoryLevelOne;

    /** 商品二级目录 */
    @Excel(name = "商品二级目录")
    private String categoryLevelTwo;

    /** FNSKU */
    @Excel(name = "FNSKU")
    private String fnsku;

    /** 本地SKU */
    @Excel(name = "本地SKU")
    private String localSku;

    /** 主SKU */
    @Excel(name = "主SKU")
    private String mainSku;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** ASIN */
    @Excel(name = "ASIN")
    private String asin;

    /** 库存状态 */
    @Excel(name = "库存状态")
    private String stockStatus;

    /** 7天销量 */
    @Excel(name = "7天销量")
    private BigDecimal sales7Days;

    /** 14天销量 */
    @Excel(name = "14天销量")
    private BigDecimal sales14Days;

    /** 30天销量 */
    @Excel(name = "30天销量")
    private BigDecimal sales30Days;

    /** 90天销量 */
    @Excel(name = "90天销量")
    private BigDecimal sales90Days;

    /** 日均销量 */
    @Excel(name = "日均销量")
    private BigDecimal avgDailySales;

    /** 采购在途 */
    @Excel(name = "采购在途")
    private BigDecimal procurementInTransit;

    /** 本地库存 */
    @Excel(name = "本地库存")
    private BigDecimal localInventory;

    /** 可售 */
    @Excel(name = "可售")
    private BigDecimal available;

    /** 待入库 */
    @Excel(name = "待入库")
    private BigDecimal awaitingStock;

    /** 库存SKU */
    @Excel(name = "库存SKU")
    private String sku;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String warehouseName;

    /** 库存警戒天数 */
    @Excel(name = "库存警戒天数")
    private BigDecimal stockWarningDays;

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

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 最新采购价 */
    @Excel(name = "最新采购价")
    private BigDecimal latestPurchasePrice;

    /** 重量 */
    @Excel(name = "重量")
    private BigDecimal weight;

    /** 体积(cm³) */
    @Excel(name = "体积(cm³)")
    private BigDecimal volumeCm3;

    /** 仓库最小采购量 */
    @Excel(name = "仓库最小采购量")
    private BigDecimal minPurchaseQuantity;

    /** AMZ-库存上架时间【扩展属性】 */
    @Excel(name = "AMZ-库存上架时间【扩展属性】")
    private String amzInventoryShelfTime;

    /** 重塑人【扩展属性】 */
    @Excel(name = "重塑人【扩展属性】")
    private String reshaper;

    /** 重塑【扩展属性】 */
    @Excel(name = "重塑【扩展属性】")
    private String reshaping;

    /** 在途 */
    @Excel(name = "在途")
    private BigDecimal inTransit;

    /** 可售天数 */
    @Excel(name = "可售天数")
    private BigDecimal availableDays;

    /** 采购天数 */
    @Excel(name = "采购天数")
    private BigDecimal procurementDays;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 预留 */
    @Excel(name = "预留")
    private BigDecimal reserved;

    /** 计划入库 */
    @Excel(name = "计划入库")
    private BigDecimal plannedStockIn;

    /** 销售员 */
    @Excel(name = "销售员")
    private String salesPerson;

    /** 开发员 */
    @Excel(name = "开发员")
    private String developer;

    /** 上架时间 */
    @Excel(name = "上架时间")
    private String listingDate;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isDelete;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 记录当天有没有新增过记录 */
    @Excel(name = "记录当天有没有新增过记录")
    private Long version;

    /** （计算字段）本地库存总额 */
    @Excel(name = "", readConverterExp = "计=算字段")
    private BigDecimal totalLocalInventoryValue;

    /** （计算字段）FBA库存总额 */
    @Excel(name = "", readConverterExp = "计=算字段")
    private BigDecimal totalFbaInventoryValue;

    /** （计算字段）库存金额总计 */
    @Excel(name = "", readConverterExp = "计=算字段")
    private BigDecimal totalInventoryValue;

    /** （计算字段）周转天数 */
    @Excel(name = "", readConverterExp = "计=算字段")
    private BigDecimal turnoverDays;

    /** （计算字段）FBA周转天数 */
    @Excel(name = "", readConverterExp = "计=算字段")
    private BigDecimal fbaTurnoverDays;

    /** （计算字段）库存个数总计 */
    @Excel(name = "", readConverterExp = "计=算字段")
    private Long totalInventoryCount;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }
    public void setMsku(String msku) 
    {
        this.msku = msku;
    }

    public String getMsku() 
    {
        return msku;
    }
    public void setCategoryLevelOne(String categoryLevelOne) 
    {
        this.categoryLevelOne = categoryLevelOne;
    }

    public String getCategoryLevelOne() 
    {
        return categoryLevelOne;
    }
    public void setCategoryLevelTwo(String categoryLevelTwo) 
    {
        this.categoryLevelTwo = categoryLevelTwo;
    }

    public String getCategoryLevelTwo() 
    {
        return categoryLevelTwo;
    }
    public void setFnsku(String fnsku) 
    {
        this.fnsku = fnsku;
    }

    public String getFnsku() 
    {
        return fnsku;
    }
    public void setLocalSku(String localSku) 
    {
        this.localSku = localSku;
    }

    public String getLocalSku() 
    {
        return localSku;
    }
    public void setMainSku(String mainSku) 
    {
        this.mainSku = mainSku;
    }

    public String getMainSku() 
    {
        return mainSku;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setAsin(String asin) 
    {
        this.asin = asin;
    }

    public String getAsin() 
    {
        return asin;
    }
    public void setStockStatus(String stockStatus) 
    {
        this.stockStatus = stockStatus;
    }

    public String getStockStatus() 
    {
        return stockStatus;
    }
    public void setSales7Days(BigDecimal sales7Days) 
    {
        this.sales7Days = sales7Days;
    }

    public BigDecimal getSales7Days() 
    {
        return sales7Days;
    }
    public void setSales14Days(BigDecimal sales14Days) 
    {
        this.sales14Days = sales14Days;
    }

    public BigDecimal getSales14Days() 
    {
        return sales14Days;
    }
    public void setSales30Days(BigDecimal sales30Days) 
    {
        this.sales30Days = sales30Days;
    }

    public BigDecimal getSales30Days() 
    {
        return sales30Days;
    }
    public void setSales90Days(BigDecimal sales90Days) 
    {
        this.sales90Days = sales90Days;
    }

    public BigDecimal getSales90Days() 
    {
        return sales90Days;
    }
    public void setAvgDailySales(BigDecimal avgDailySales) 
    {
        this.avgDailySales = avgDailySales;
    }

    public BigDecimal getAvgDailySales() 
    {
        return avgDailySales;
    }
    public void setProcurementInTransit(BigDecimal procurementInTransit) 
    {
        this.procurementInTransit = procurementInTransit;
    }

    public BigDecimal getProcurementInTransit() 
    {
        return procurementInTransit;
    }
    public void setLocalInventory(BigDecimal localInventory) 
    {
        this.localInventory = localInventory;
    }

    public BigDecimal getLocalInventory() 
    {
        return localInventory;
    }
    public void setAvailable(BigDecimal available) 
    {
        this.available = available;
    }

    public BigDecimal getAvailable() 
    {
        return available;
    }
    public void setAwaitingStock(BigDecimal awaitingStock) 
    {
        this.awaitingStock = awaitingStock;
    }

    public BigDecimal getAwaitingStock() 
    {
        return awaitingStock;
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
    public void setStockWarningDays(BigDecimal stockWarningDays) 
    {
        this.stockWarningDays = stockWarningDays;
    }

    public BigDecimal getStockWarningDays() 
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
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setLatestPurchasePrice(BigDecimal latestPurchasePrice) 
    {
        this.latestPurchasePrice = latestPurchasePrice;
    }

    public BigDecimal getLatestPurchasePrice() 
    {
        return latestPurchasePrice;
    }
    public void setWeight(BigDecimal weight) 
    {
        this.weight = weight;
    }

    public BigDecimal getWeight() 
    {
        return weight;
    }
    public void setVolumeCm3(BigDecimal volumeCm3) 
    {
        this.volumeCm3 = volumeCm3;
    }

    public BigDecimal getVolumeCm3() 
    {
        return volumeCm3;
    }
    public void setMinPurchaseQuantity(BigDecimal minPurchaseQuantity) 
    {
        this.minPurchaseQuantity = minPurchaseQuantity;
    }

    public BigDecimal getMinPurchaseQuantity() 
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
    public void setInTransit(BigDecimal inTransit) 
    {
        this.inTransit = inTransit;
    }

    public BigDecimal getInTransit() 
    {
        return inTransit;
    }
    public void setAvailableDays(BigDecimal availableDays) 
    {
        this.availableDays = availableDays;
    }

    public BigDecimal getAvailableDays() 
    {
        return availableDays;
    }
    public void setProcurementDays(BigDecimal procurementDays) 
    {
        this.procurementDays = procurementDays;
    }

    public BigDecimal getProcurementDays() 
    {
        return procurementDays;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setReserved(BigDecimal reserved) 
    {
        this.reserved = reserved;
    }

    public BigDecimal getReserved() 
    {
        return reserved;
    }
    public void setPlannedStockIn(BigDecimal plannedStockIn) 
    {
        this.plannedStockIn = plannedStockIn;
    }

    public BigDecimal getPlannedStockIn() 
    {
        return plannedStockIn;
    }
    public void setSalesPerson(String salesPerson) 
    {
        this.salesPerson = salesPerson;
    }

    public String getSalesPerson() 
    {
        return salesPerson;
    }
    public void setDeveloper(String developer) 
    {
        this.developer = developer;
    }

    public String getDeveloper() 
    {
        return developer;
    }
    public void setListingDate(String listingDate) 
    {
        this.listingDate = listingDate;
    }

    public String getListingDate() 
    {
        return listingDate;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setVersion(Long version) 
    {
        this.version = version;
    }

    public Long getVersion() 
    {
        return version;
    }

    public BigDecimal getTotalLocalInventoryValue() {
        return totalLocalInventoryValue;
    }

    public void setTotalLocalInventoryValue(BigDecimal totalLocalInventoryValue) {
        this.totalLocalInventoryValue = totalLocalInventoryValue;
    }

    public BigDecimal getTotalFbaInventoryValue() {
        return totalFbaInventoryValue;
    }

    public void setTotalFbaInventoryValue(BigDecimal totalFbaInventoryValue) {
        this.totalFbaInventoryValue = totalFbaInventoryValue;
    }

    public BigDecimal getTotalInventoryValue() {
        return totalInventoryValue;
    }

    public void setTotalInventoryValue(BigDecimal totalInventoryValue) {
        this.totalInventoryValue = totalInventoryValue;
    }

    public BigDecimal getTurnoverDays() {
        return turnoverDays;
    }

    public void setTurnoverDays(BigDecimal turnoverDays) {
        this.turnoverDays = turnoverDays;
    }

    public BigDecimal getFbaTurnoverDays() {
        return fbaTurnoverDays;
    }

    public void setFbaTurnoverDays(BigDecimal fbaTurnoverDays) {
        this.fbaTurnoverDays = fbaTurnoverDays;
    }

    public Long getTotalInventoryCount() {
        return totalInventoryCount;
    }

    public void setTotalInventoryCount(Long totalInventoryCount) {
        this.totalInventoryCount = totalInventoryCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("storeName", getStoreName())
            .append("msku", getMsku())
            .append("categoryLevelOne", getCategoryLevelOne())
            .append("categoryLevelTwo", getCategoryLevelTwo())
            .append("fnsku", getFnsku())
            .append("localSku", getLocalSku())
            .append("mainSku", getMainSku())
            .append("productName", getProductName())
            .append("asin", getAsin())
            .append("stockStatus", getStockStatus())
            .append("sales7Days", getSales7Days())
            .append("sales14Days", getSales14Days())
            .append("sales30Days", getSales30Days())
            .append("sales90Days", getSales90Days())
            .append("avgDailySales", getAvgDailySales())
            .append("procurementInTransit", getProcurementInTransit())
            .append("localInventory", getLocalInventory())
            .append("available", getAvailable())
            .append("awaitingStock", getAwaitingStock())
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
            .append("supplierName", getSupplierName())
            .append("latestPurchasePrice", getLatestPurchasePrice())
            .append("weight", getWeight())
            .append("volumeCm3", getVolumeCm3())
            .append("minPurchaseQuantity", getMinPurchaseQuantity())
            .append("amzInventoryShelfTime", getAmzInventoryShelfTime())
            .append("reshaper", getReshaper())
            .append("reshaping", getReshaping())
            .append("inTransit", getInTransit())
            .append("availableDays", getAvailableDays())
            .append("procurementDays", getProcurementDays())
            .append("remarks", getRemarks())
            .append("reserved", getReserved())
            .append("plannedStockIn", getPlannedStockIn())
            .append("salesPerson", getSalesPerson())
            .append("developer", getDeveloper())
            .append("listingDate", getListingDate())
            .append("isDelete", getIsDelete())
            .append("createdAt", getCreatedAt())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("version", getVersion())
            .toString();
    }
}
