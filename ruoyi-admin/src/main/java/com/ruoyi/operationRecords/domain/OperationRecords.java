package com.ruoyi.operationRecords.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 操作记录对象 operation_records
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
public class OperationRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** MSKU */
    @Excel(name = "MSKU")
    private String msku;

    /** 商品一级目录 */
    @Excel(name = "商品一级目录")
    private String categoryLevel1;

    /** 商品二级目录 */
    @Excel(name = "商品二级目录")
    private String categoryLevel2;

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
    private String sales7Days;

    /** 14天销量 */
    @Excel(name = "14天销量")
    private String sales14Days;

    /** 30天销量 */
    @Excel(name = "30天销量")
    private String sales30Days;

    /** 90天销量 */
    @Excel(name = "90天销量")
    private String sales90Days;

    /** 日均销量 */
    @Excel(name = "日均销量")
    private String avgDailySales;

    /** 采购在途 */
    @Excel(name = "采购在途")
    private String procurementInTransit;

    /** 本地库存 */
    @Excel(name = "本地库存")
    private String localInventory;

    /** 可售 */
    @Excel(name = "可售")
    private String available;

    /** 待入库 */
    @Excel(name = "待入库")
    private String awaitingStock;

    /** 在途 */
    @Excel(name = "在途")
    private String inTransit;

    /** 可售天数 */
    @Excel(name = "可售天数")
    private String availableDays;

    /** 采购天数 */
    @Excel(name = "采购天数")
    private String procurementDays;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 预留 */
    @Excel(name = "预留")
    private String reserved;

    /** 计划入库 */
    @Excel(name = "计划入库")
    private String plannedStockIn;

    /** 销售员 */
    @Excel(name = "销售员")
    private String salesPerson;

    /** 库存警戒天数 */
    @Excel(name = "库存警戒天数")
    private String stockWarningDays;

    /** 供应商 */
    @Excel(name = "供应商")
    private String supplier;

    /** 成本 */
    @Excel(name = "成本")
    private String cost;

    /** 生命周期状态 */
    @Excel(name = "生命周期状态")
    private String lifecycleStatus;

    /** 最小采购量 */
    @Excel(name = "最小采购量")
    private String minPurchaseQuantity;

    /** AM-季节性产品-淡季【扩展属性】 */
    @Excel(name = "AM-季节性产品-淡季【扩展属性】")
    private String seasonalProductOffseason;

    /** AM-季节性产品-淡季下滑比例【扩展属性】 */
    @Excel(name = "AM-季节性产品-淡季下滑比例【扩展属性】")
    private String seasonalProductOffseasonDecline;

    /** AM-季节性产品-旺季【扩展属性】 */
    @Excel(name = "AM-季节性产品-旺季【扩展属性】")
    private String seasonalProductPeak;

    /** AM-季节性产品-旺季上升比例【扩展属性】 */
    @Excel(name = "AM-季节性产品-旺季上升比例【扩展属性】")
    private String seasonalProductPeakIncrease;

    /** AM-竞对销量【扩展属性】 */
    @Excel(name = "AM-竞对销量【扩展属性】")
    private String competitorSales;

    /** AM-市场容量【扩展属性】 */
    @Excel(name = "AM-市场容量【扩展属性】")
    private String marketCapacity;

    /** 上架时间 */
    @Excel(name = "上架时间")
    private String shelfTime;

    /** 重塑人 */
    @Excel(name = "重塑人")
    private String reshaper;

    /** 重塑 */
    @Excel(name = "重塑")
    private String reshaping;

    /** 大类目Rank */
    @Excel(name = "大类目Rank")
    private String categoryRankLarge;

    /** 小类目Rank */
    @Excel(name = "小类目Rank")
    private String categoryRankSmall;

    /** 页面浏览次数百分比-合计 */
    @Excel(name = "页面浏览次数百分比-合计")
    private String pageViewsPercentage;

    /** 页面浏览次数-合计 */
    @Excel(name = "页面浏览次数-合计")
    private String pageViewsTotal;

    /** 转化率 */
    @Excel(name = "转化率")
    private String conversionRate;

    /** 广告投入产出比（ACOS） */
    @Excel(name = "广告投入产出比", readConverterExp = "A=COS")
    private String acos;

    /** 近30天销售额 */
    @Excel(name = "近30天销售额")
    private String salesLast30Days;

    /** 近30天利润率 */
    @Excel(name = "近30天利润率")
    private String profitMarginLast30Days;

    /** 近30天退款率 */
    @Excel(name = "近30天退款率")
    private String refundRateLast30Days;

    /** 马帮预测可售天数 */
    @Excel(name = "马帮预测可售天数")
    private String forecastAvailableDays;

    /** （可售FBA+FBA待入库+预留+FBA在途）/日均 */
    @Excel(name = "", readConverterExp = "可=售FBA+FBA待入库+预留+FBA在途")
    private String fbaAvailableDays;

    /** FBA库存状态 */
    @Excel(name = "FBA库存状态")
    private String fbaStockStatus;

    /** FBA+本地--可售天数 */
    @Excel(name = "FBA+本地--可售天数")
    private String fbaLocalAvailableDays;

    /** 是否需要给采购计划 */
    @Excel(name = "是否需要给采购计划")
    private String procurementPlanNeeded;

    /** 对比供应商最低采购个数/淡旺季加权 */
    @Excel(name = "对比供应商最低采购个数/淡旺季加权")
    private String minPurchaseQuantityComparison;

    /** 初步预计采购个数 */
    @Excel(name = "初步预计采购个数")
    private String preliminaryPurchaseQuantity;

    /** 对比供应商最低采购个数/淡旺季加权.1 */
    @Excel(name = "对比供应商最低采购个数/淡旺季加权.1")
    private String minPurchaseQuantityComparisonTwo;

    /** 修正计划采购个数 */
    @Excel(name = "修正计划采购个数")
    private String adjustedPurchaseQuantity;

    /** 计划下采购单日期（优化2周内完成） */
    @Excel(name = "计划下采购单日期", readConverterExp = "优=化2周内完成")
    private String procurementOrderDate;

    /** 预估货到本地仓时间 */
    @Excel(name = "预估货到本地仓时间")
    private String estimatedLocalWarehouseArrival;

    /** 预计FBA货发出时间 */
    @Excel(name = "预计FBA货发出时间")
    private String estimatedFbaShipment;

    /** 预计FBA入仓时间 */
    @Excel(name = "预计FBA入仓时间")
    private String estimatedFbaWarehouse;

    /** 预计FBA上架时间 */
    @Excel(name = "预计FBA上架时间")
    private String estimatedFbaShelving;

    /** 上架前可售天数 */
    @Excel(name = "上架前可售天数")
    private String preShelvingAvailableDays;

    /** 上架后可售天数 */
    @Excel(name = "上架后可售天数")
    private String postShelvingAvailableDays;

    /** 业务建议采购个数【0或者个数】 */
    @Excel(name = "业务建议采购个数【0或者个数】")
    private String businessSuggestedPurchaseQuantity;

    /** 业务建议采购付款日期 */
    @Excel(name = "业务建议采购付款日期")
    private String businessSuggestedPaymentDate;

    /** 上架后可售天数.1 */
    @Excel(name = "上架后可售天数.1")
    private String postShelvingAvailableDaysTwo;

    /** 采购金额 */
    @Excel(name = "采购金额")
    private String procurementAmount;

    /** 建议归因类型【利润率，退款率，评价，清仓，停售，销量，新品】 */
    @Excel(name = "建议归因类型【利润率，退款率，评价，清仓，停售，销量，新品】")
    private String suggestedAttributionType;

    /** 归因说明和长期打算 */
    @Excel(name = "归因说明和长期打算")
    private String attributionDescription;

    /** 运管操作日期 */
    @Excel(name = "运管操作日期")
    private String operationsDate;

    /** 运管操作记录 */
    @Excel(name = "运管操作记录")
    private String operationsRecord;

    /** 本地库存 */
    @Excel(name = "本地库存")
    private String localInventoryTwo;

    /** FBA库存 */
    @Excel(name = "FBA库存")
    private String fbaInventory;

    /** 本地库存金额 */
    @Excel(name = "本地库存金额")
    private String localInventoryValue;

    /** FBA库存金额 */
    @Excel(name = "FBA库存金额")
    private String fbaInventoryValue;

    /** 总库存金额 */
    @Excel(name = "总库存金额")
    private String totalInventoryValue;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private String isDelete;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

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
    public void setCategoryLevel1(String categoryLevel1) 
    {
        this.categoryLevel1 = categoryLevel1;
    }

    public String getCategoryLevel1() 
    {
        return categoryLevel1;
    }
    public void setCategoryLevel2(String categoryLevel2) 
    {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getCategoryLevel2() 
    {
        return categoryLevel2;
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
    public void setSales7Days(String sales7Days) 
    {
        this.sales7Days = sales7Days;
    }

    public String getSales7Days() 
    {
        return sales7Days;
    }
    public void setSales14Days(String sales14Days) 
    {
        this.sales14Days = sales14Days;
    }

    public String getSales14Days() 
    {
        return sales14Days;
    }
    public void setSales30Days(String sales30Days) 
    {
        this.sales30Days = sales30Days;
    }

    public String getSales30Days() 
    {
        return sales30Days;
    }
    public void setSales90Days(String sales90Days) 
    {
        this.sales90Days = sales90Days;
    }

    public String getSales90Days() 
    {
        return sales90Days;
    }
    public void setAvgDailySales(String avgDailySales) 
    {
        this.avgDailySales = avgDailySales;
    }

    public String getAvgDailySales() 
    {
        return avgDailySales;
    }
    public void setProcurementInTransit(String procurementInTransit) 
    {
        this.procurementInTransit = procurementInTransit;
    }

    public String getProcurementInTransit() 
    {
        return procurementInTransit;
    }
    public void setLocalInventory(String localInventory) 
    {
        this.localInventory = localInventory;
    }

    public String getLocalInventory() 
    {
        return localInventory;
    }
    public void setAvailable(String available) 
    {
        this.available = available;
    }

    public String getAvailable() 
    {
        return available;
    }
    public void setAwaitingStock(String awaitingStock) 
    {
        this.awaitingStock = awaitingStock;
    }

    public String getAwaitingStock() 
    {
        return awaitingStock;
    }
    public void setInTransit(String inTransit) 
    {
        this.inTransit = inTransit;
    }

    public String getInTransit() 
    {
        return inTransit;
    }
    public void setAvailableDays(String availableDays) 
    {
        this.availableDays = availableDays;
    }

    public String getAvailableDays() 
    {
        return availableDays;
    }
    public void setProcurementDays(String procurementDays) 
    {
        this.procurementDays = procurementDays;
    }

    public String getProcurementDays() 
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
    public void setReserved(String reserved) 
    {
        this.reserved = reserved;
    }

    public String getReserved() 
    {
        return reserved;
    }
    public void setPlannedStockIn(String plannedStockIn) 
    {
        this.plannedStockIn = plannedStockIn;
    }

    public String getPlannedStockIn() 
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
    public void setStockWarningDays(String stockWarningDays) 
    {
        this.stockWarningDays = stockWarningDays;
    }

    public String getStockWarningDays() 
    {
        return stockWarningDays;
    }
    public void setSupplier(String supplier) 
    {
        this.supplier = supplier;
    }

    public String getSupplier() 
    {
        return supplier;
    }
    public void setCost(String cost) 
    {
        this.cost = cost;
    }

    public String getCost() 
    {
        return cost;
    }
    public void setLifecycleStatus(String lifecycleStatus) 
    {
        this.lifecycleStatus = lifecycleStatus;
    }

    public String getLifecycleStatus() 
    {
        return lifecycleStatus;
    }
    public void setMinPurchaseQuantity(String minPurchaseQuantity) 
    {
        this.minPurchaseQuantity = minPurchaseQuantity;
    }

    public String getMinPurchaseQuantity() 
    {
        return minPurchaseQuantity;
    }
    public void setSeasonalProductOffseason(String seasonalProductOffseason) 
    {
        this.seasonalProductOffseason = seasonalProductOffseason;
    }

    public String getSeasonalProductOffseason() 
    {
        return seasonalProductOffseason;
    }
    public void setSeasonalProductOffseasonDecline(String seasonalProductOffseasonDecline) 
    {
        this.seasonalProductOffseasonDecline = seasonalProductOffseasonDecline;
    }

    public String getSeasonalProductOffseasonDecline() 
    {
        return seasonalProductOffseasonDecline;
    }
    public void setSeasonalProductPeak(String seasonalProductPeak) 
    {
        this.seasonalProductPeak = seasonalProductPeak;
    }

    public String getSeasonalProductPeak() 
    {
        return seasonalProductPeak;
    }
    public void setSeasonalProductPeakIncrease(String seasonalProductPeakIncrease) 
    {
        this.seasonalProductPeakIncrease = seasonalProductPeakIncrease;
    }

    public String getSeasonalProductPeakIncrease() 
    {
        return seasonalProductPeakIncrease;
    }
    public void setCompetitorSales(String competitorSales) 
    {
        this.competitorSales = competitorSales;
    }

    public String getCompetitorSales() 
    {
        return competitorSales;
    }
    public void setMarketCapacity(String marketCapacity) 
    {
        this.marketCapacity = marketCapacity;
    }

    public String getMarketCapacity() 
    {
        return marketCapacity;
    }
    public void setShelfTime(String shelfTime) 
    {
        this.shelfTime = shelfTime;
    }

    public String getShelfTime() 
    {
        return shelfTime;
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
    public void setCategoryRankLarge(String categoryRankLarge) 
    {
        this.categoryRankLarge = categoryRankLarge;
    }

    public String getCategoryRankLarge() 
    {
        return categoryRankLarge;
    }
    public void setCategoryRankSmall(String categoryRankSmall) 
    {
        this.categoryRankSmall = categoryRankSmall;
    }

    public String getCategoryRankSmall() 
    {
        return categoryRankSmall;
    }
    public void setPageViewsPercentage(String pageViewsPercentage) 
    {
        this.pageViewsPercentage = pageViewsPercentage;
    }

    public String getPageViewsPercentage() 
    {
        return pageViewsPercentage;
    }
    public void setPageViewsTotal(String pageViewsTotal) 
    {
        this.pageViewsTotal = pageViewsTotal;
    }

    public String getPageViewsTotal() 
    {
        return pageViewsTotal;
    }
    public void setConversionRate(String conversionRate) 
    {
        this.conversionRate = conversionRate;
    }

    public String getConversionRate() 
    {
        return conversionRate;
    }
    public void setAcos(String acos) 
    {
        this.acos = acos;
    }

    public String getAcos() 
    {
        return acos;
    }
    public void setSalesLast30Days(String salesLast30Days) 
    {
        this.salesLast30Days = salesLast30Days;
    }

    public String getSalesLast30Days() 
    {
        return salesLast30Days;
    }
    public void setProfitMarginLast30Days(String profitMarginLast30Days) 
    {
        this.profitMarginLast30Days = profitMarginLast30Days;
    }

    public String getProfitMarginLast30Days() 
    {
        return profitMarginLast30Days;
    }
    public void setRefundRateLast30Days(String refundRateLast30Days) 
    {
        this.refundRateLast30Days = refundRateLast30Days;
    }

    public String getRefundRateLast30Days() 
    {
        return refundRateLast30Days;
    }
    public void setForecastAvailableDays(String forecastAvailableDays) 
    {
        this.forecastAvailableDays = forecastAvailableDays;
    }

    public String getForecastAvailableDays() 
    {
        return forecastAvailableDays;
    }
    public void setFbaAvailableDays(String fbaAvailableDays) 
    {
        this.fbaAvailableDays = fbaAvailableDays;
    }

    public String getFbaAvailableDays() 
    {
        return fbaAvailableDays;
    }
    public void setFbaStockStatus(String fbaStockStatus) 
    {
        this.fbaStockStatus = fbaStockStatus;
    }

    public String getFbaStockStatus() 
    {
        return fbaStockStatus;
    }
    public void setFbaLocalAvailableDays(String fbaLocalAvailableDays) 
    {
        this.fbaLocalAvailableDays = fbaLocalAvailableDays;
    }

    public String getFbaLocalAvailableDays() 
    {
        return fbaLocalAvailableDays;
    }
    public void setProcurementPlanNeeded(String procurementPlanNeeded) 
    {
        this.procurementPlanNeeded = procurementPlanNeeded;
    }

    public String getProcurementPlanNeeded() 
    {
        return procurementPlanNeeded;
    }
    public void setMinPurchaseQuantityComparison(String minPurchaseQuantityComparison) 
    {
        this.minPurchaseQuantityComparison = minPurchaseQuantityComparison;
    }

    public String getMinPurchaseQuantityComparison() 
    {
        return minPurchaseQuantityComparison;
    }
    public void setPreliminaryPurchaseQuantity(String preliminaryPurchaseQuantity) 
    {
        this.preliminaryPurchaseQuantity = preliminaryPurchaseQuantity;
    }

    public String getPreliminaryPurchaseQuantity() 
    {
        return preliminaryPurchaseQuantity;
    }
    public void setMinPurchaseQuantityComparisonTwo(String minPurchaseQuantityComparisonTwo) 
    {
        this.minPurchaseQuantityComparisonTwo = minPurchaseQuantityComparisonTwo;
    }

    public String getMinPurchaseQuantityComparisonTwo() 
    {
        return minPurchaseQuantityComparisonTwo;
    }
    public void setAdjustedPurchaseQuantity(String adjustedPurchaseQuantity) 
    {
        this.adjustedPurchaseQuantity = adjustedPurchaseQuantity;
    }

    public String getAdjustedPurchaseQuantity() 
    {
        return adjustedPurchaseQuantity;
    }
    public void setProcurementOrderDate(String procurementOrderDate) 
    {
        this.procurementOrderDate = procurementOrderDate;
    }

    public String getProcurementOrderDate() 
    {
        return procurementOrderDate;
    }
    public void setEstimatedLocalWarehouseArrival(String estimatedLocalWarehouseArrival) 
    {
        this.estimatedLocalWarehouseArrival = estimatedLocalWarehouseArrival;
    }

    public String getEstimatedLocalWarehouseArrival() 
    {
        return estimatedLocalWarehouseArrival;
    }
    public void setEstimatedFbaShipment(String estimatedFbaShipment) 
    {
        this.estimatedFbaShipment = estimatedFbaShipment;
    }

    public String getEstimatedFbaShipment() 
    {
        return estimatedFbaShipment;
    }
    public void setEstimatedFbaWarehouse(String estimatedFbaWarehouse) 
    {
        this.estimatedFbaWarehouse = estimatedFbaWarehouse;
    }

    public String getEstimatedFbaWarehouse() 
    {
        return estimatedFbaWarehouse;
    }
    public void setEstimatedFbaShelving(String estimatedFbaShelving) 
    {
        this.estimatedFbaShelving = estimatedFbaShelving;
    }

    public String getEstimatedFbaShelving() 
    {
        return estimatedFbaShelving;
    }
    public void setPreShelvingAvailableDays(String preShelvingAvailableDays) 
    {
        this.preShelvingAvailableDays = preShelvingAvailableDays;
    }

    public String getPreShelvingAvailableDays() 
    {
        return preShelvingAvailableDays;
    }
    public void setPostShelvingAvailableDays(String postShelvingAvailableDays) 
    {
        this.postShelvingAvailableDays = postShelvingAvailableDays;
    }

    public String getPostShelvingAvailableDays() 
    {
        return postShelvingAvailableDays;
    }
    public void setBusinessSuggestedPurchaseQuantity(String businessSuggestedPurchaseQuantity) 
    {
        this.businessSuggestedPurchaseQuantity = businessSuggestedPurchaseQuantity;
    }

    public String getBusinessSuggestedPurchaseQuantity() 
    {
        return businessSuggestedPurchaseQuantity;
    }
    public void setBusinessSuggestedPaymentDate(String businessSuggestedPaymentDate) 
    {
        this.businessSuggestedPaymentDate = businessSuggestedPaymentDate;
    }

    public String getBusinessSuggestedPaymentDate() 
    {
        return businessSuggestedPaymentDate;
    }
    public void setPostShelvingAvailableDaysTwo(String postShelvingAvailableDaysTwo) 
    {
        this.postShelvingAvailableDaysTwo = postShelvingAvailableDaysTwo;
    }

    public String getPostShelvingAvailableDaysTwo() 
    {
        return postShelvingAvailableDaysTwo;
    }
    public void setProcurementAmount(String procurementAmount) 
    {
        this.procurementAmount = procurementAmount;
    }

    public String getProcurementAmount() 
    {
        return procurementAmount;
    }
    public void setSuggestedAttributionType(String suggestedAttributionType) 
    {
        this.suggestedAttributionType = suggestedAttributionType;
    }

    public String getSuggestedAttributionType() 
    {
        return suggestedAttributionType;
    }
    public void setAttributionDescription(String attributionDescription) 
    {
        this.attributionDescription = attributionDescription;
    }

    public String getAttributionDescription() 
    {
        return attributionDescription;
    }
    public void setOperationsDate(String operationsDate) 
    {
        this.operationsDate = operationsDate;
    }

    public String getOperationsDate() 
    {
        return operationsDate;
    }
    public void setOperationsRecord(String operationsRecord) 
    {
        this.operationsRecord = operationsRecord;
    }

    public String getOperationsRecord() 
    {
        return operationsRecord;
    }
    public void setLocalInventoryTwo(String localInventoryTwo) 
    {
        this.localInventoryTwo = localInventoryTwo;
    }

    public String getLocalInventoryTwo() 
    {
        return localInventoryTwo;
    }
    public void setFbaInventory(String fbaInventory) 
    {
        this.fbaInventory = fbaInventory;
    }

    public String getFbaInventory() 
    {
        return fbaInventory;
    }
    public void setLocalInventoryValue(String localInventoryValue) 
    {
        this.localInventoryValue = localInventoryValue;
    }

    public String getLocalInventoryValue() 
    {
        return localInventoryValue;
    }
    public void setFbaInventoryValue(String fbaInventoryValue) 
    {
        this.fbaInventoryValue = fbaInventoryValue;
    }

    public String getFbaInventoryValue() 
    {
        return fbaInventoryValue;
    }
    public void setTotalInventoryValue(String totalInventoryValue) 
    {
        this.totalInventoryValue = totalInventoryValue;
    }

    public String getTotalInventoryValue() 
    {
        return totalInventoryValue;
    }
    public void setIsDelete(String isDelete) 
    {
        this.isDelete = isDelete;
    }

    public String getIsDelete() 
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("storeName", getStoreName())
            .append("msku", getMsku())
            .append("categoryLevel1", getCategoryLevel1())
            .append("categoryLevel2", getCategoryLevel2())
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
            .append("inTransit", getInTransit())
            .append("availableDays", getAvailableDays())
            .append("procurementDays", getProcurementDays())
            .append("remarks", getRemarks())
            .append("reserved", getReserved())
            .append("plannedStockIn", getPlannedStockIn())
            .append("salesPerson", getSalesPerson())
            .append("stockWarningDays", getStockWarningDays())
            .append("supplier", getSupplier())
            .append("cost", getCost())
            .append("lifecycleStatus", getLifecycleStatus())
            .append("minPurchaseQuantity", getMinPurchaseQuantity())
            .append("seasonalProductOffseason", getSeasonalProductOffseason())
            .append("seasonalProductOffseasonDecline", getSeasonalProductOffseasonDecline())
            .append("seasonalProductPeak", getSeasonalProductPeak())
            .append("seasonalProductPeakIncrease", getSeasonalProductPeakIncrease())
            .append("competitorSales", getCompetitorSales())
            .append("marketCapacity", getMarketCapacity())
            .append("shelfTime", getShelfTime())
            .append("reshaper", getReshaper())
            .append("reshaping", getReshaping())
            .append("categoryRankLarge", getCategoryRankLarge())
            .append("categoryRankSmall", getCategoryRankSmall())
            .append("pageViewsPercentage", getPageViewsPercentage())
            .append("pageViewsTotal", getPageViewsTotal())
            .append("conversionRate", getConversionRate())
            .append("acos", getAcos())
            .append("salesLast30Days", getSalesLast30Days())
            .append("profitMarginLast30Days", getProfitMarginLast30Days())
            .append("refundRateLast30Days", getRefundRateLast30Days())
            .append("forecastAvailableDays", getForecastAvailableDays())
            .append("fbaAvailableDays", getFbaAvailableDays())
            .append("fbaStockStatus", getFbaStockStatus())
            .append("fbaLocalAvailableDays", getFbaLocalAvailableDays())
            .append("procurementPlanNeeded", getProcurementPlanNeeded())
            .append("minPurchaseQuantityComparison", getMinPurchaseQuantityComparison())
            .append("preliminaryPurchaseQuantity", getPreliminaryPurchaseQuantity())
            .append("minPurchaseQuantityComparisonTwo", getMinPurchaseQuantityComparisonTwo())
            .append("adjustedPurchaseQuantity", getAdjustedPurchaseQuantity())
            .append("procurementOrderDate", getProcurementOrderDate())
            .append("estimatedLocalWarehouseArrival", getEstimatedLocalWarehouseArrival())
            .append("estimatedFbaShipment", getEstimatedFbaShipment())
            .append("estimatedFbaWarehouse", getEstimatedFbaWarehouse())
            .append("estimatedFbaShelving", getEstimatedFbaShelving())
            .append("preShelvingAvailableDays", getPreShelvingAvailableDays())
            .append("postShelvingAvailableDays", getPostShelvingAvailableDays())
            .append("businessSuggestedPurchaseQuantity", getBusinessSuggestedPurchaseQuantity())
            .append("businessSuggestedPaymentDate", getBusinessSuggestedPaymentDate())
            .append("postShelvingAvailableDaysTwo", getPostShelvingAvailableDaysTwo())
            .append("procurementAmount", getProcurementAmount())
            .append("suggestedAttributionType", getSuggestedAttributionType())
            .append("attributionDescription", getAttributionDescription())
            .append("operationsDate", getOperationsDate())
            .append("operationsRecord", getOperationsRecord())
            .append("localInventoryTwo", getLocalInventoryTwo())
            .append("fbaInventory", getFbaInventory())
            .append("localInventoryValue", getLocalInventoryValue())
            .append("fbaInventoryValue", getFbaInventoryValue())
            .append("totalInventoryValue", getTotalInventoryValue())
            .append("isDelete", getIsDelete())
            .append("createdAt", getCreatedAt())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("version", getVersion())
            .toString();
    }
}
