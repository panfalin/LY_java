package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 速卖通滞销SKU分析对象 aliexpress_sku_analysis
 *
 * @author ruoyi
 * @date 2025-01-21
 */
public class AliexpressSkuAnalysis extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 滞销SKU
     */
    @Excel(name = "滞销SKU")
    private String sku;

    @Excel(name = "滞销商品名称")
    private String skuName;
    @Excel(name = "重量")
    private String weight;


    @Excel(name = "成本价格")
    private String warehouseCost;
    @Excel(name = "成本总价")
    private String totalWarehouseCost;

    @Excel(name = "包裹尺寸")
    private String packageSize;



    /**
     * 总库存
     */
    @Excel(name = "总库存")
    private Long totalStock;

    /**
     * 本地在途数量
     */
    @Excel(name = "本地在途数量")
    private Long localInTransitQuantity;



    /**
     * 本地在途数量
     */
    @Excel(name = "本地在途数量")
    private int totalPublications;


    /**
     * 本地可用数量
     */
    @Excel(name = "本地可用数量")
    private Long localAvailableQuantity;

    /**
     * 备仓在途数量
     */
    @Excel(name = "备仓在途数量")
    private Long backupInTransitQuantity;

    /**
     * 半托管备仓可用数量
     */
    @Excel(name = "半托管备仓可用数量")
    private Long halfManagementBackupAvailableQuantity;

    /**
     * 全托管备仓可用数量
     */
    @Excel(name = "全托管备仓可用数量")
    private Long fullManagementBackupAvailableQuantity;

    /**
     * 七天销量
     */

    private Long salesLast7Days;

    /**
     * 七天销量
     */

    private Long salesLast28Days;

    /**
     * 七天销量
     */

    private Long salesLast42Days;

    /**
     * pop日均市场容量
     */
    @Excel(name = "pop日均市场容量")
    private BigDecimal popDailyMarketCapacity;

    /**
     * 全托管日均市场容量
     */
    @Excel(name = "全托管日均市场容量")
    private BigDecimal fullManagementDailyMarketCapacity;

    /**
     * 半托管日均市场容量
     */
    @Excel(name = "半托管日均市场容量")
    private BigDecimal halfManagementDailyMarketCapacity;

    /**
     * 竞对热销国家
     */
    @Excel(name = "竞对热销国家")
    private String competitorHotSalesCountries;

    /**
     * 竞对热销价格
     */
    @Excel(name = "竞对热销价格")
    private String competitorHotSalesPrice;

    /**
     * 市场平均售价
     */
    @Excel(name = "市场平均售价")
    private String marketAveragePrice;

    /**
     * 对比我们刊登的价格
     */
    @Excel(name = "对比我们刊登的价格")
    private String priceComparison;

    /**
     * pop在线刊登数
     */
    @Excel(name = "pop在线刊登数")
    private Long popOnlineListings;

    /**
     * 全托管在线刊登数
     */
    @Excel(name = "全托管在线刊登数")
    private Long fullManagementOnlineListings;

    /**
     * 半托管在线刊登数
     */
    @Excel(name = "半托管在线刊登数")
    private Long halfManagementOnlineListings;

    /**
     * 推荐操作
     */
    @Excel(name = "推荐操作")
    private String recommendedAction;

    /**
     * 操作状态（如：pending、completed）
     */
    @Excel(name = "操作状态", readConverterExp = "如=：pending、completed")
    private String status;

    private String stockImageUrl;
    /**
     * 操作完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date completedAt;

    /**
     * 操作日志
     */
    @Excel(name = "操作日志")
    private String operationLog;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    public String getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    public int getTotalPublications() {
        return totalPublications;
    }

    public void setTotalPublications(int totalPublications) {
        this.totalPublications = totalPublications;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStockImageUrl() {
        return stockImageUrl;
    }

    public void setStockImageUrl(String stockImageUrl) {
        this.stockImageUrl = stockImageUrl;
    }

    public String getWarehouseCost() {
        return warehouseCost;
    }

    public void setWarehouseCost(String warehouseCost) {
        this.warehouseCost = warehouseCost;
    }

    public String gettotalWarehouseCost() {
        return totalWarehouseCost;
    }

    public void settotalWarehouseCost(String totalWarehouseCost) {
        this.totalWarehouseCost = totalWarehouseCost;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setTotalStock(Long totalStock) {
        this.totalStock = totalStock;
    }

    public Long getTotalStock() {
        return totalStock;
    }

    public void setPopDailyMarketCapacity(BigDecimal popDailyMarketCapacity) {
        this.popDailyMarketCapacity = popDailyMarketCapacity;
    }

    public BigDecimal getPopDailyMarketCapacity() {
        return popDailyMarketCapacity;
    }

    public void setFullManagementDailyMarketCapacity(BigDecimal fullManagementDailyMarketCapacity) {
        this.fullManagementDailyMarketCapacity = fullManagementDailyMarketCapacity;
    }

    public BigDecimal getFullManagementDailyMarketCapacity() {
        return fullManagementDailyMarketCapacity;
    }

    public void setHalfManagementDailyMarketCapacity(BigDecimal halfManagementDailyMarketCapacity) {
        this.halfManagementDailyMarketCapacity = halfManagementDailyMarketCapacity;
    }

    public BigDecimal getHalfManagementDailyMarketCapacity() {
        return halfManagementDailyMarketCapacity;
    }

    public void setCompetitorHotSalesCountries(String competitorHotSalesCountries) {
        this.competitorHotSalesCountries = competitorHotSalesCountries;
    }

    public String getCompetitorHotSalesCountries() {
        return competitorHotSalesCountries;
    }

    public void setCompetitorHotSalesPrice(String competitorHotSalesPrice) {
        this.competitorHotSalesPrice = competitorHotSalesPrice;
    }

    public String getCompetitorHotSalesPrice() {
        return competitorHotSalesPrice;
    }

    public void setMarketAveragePrice(String marketAveragePrice) {
        this.marketAveragePrice = marketAveragePrice;
    }

    public String getMarketAveragePrice() {
        return marketAveragePrice;
    }

    public void setPriceComparison(String priceComparison) {
        this.priceComparison = priceComparison;
    }

    public String getPriceComparison() {
        return priceComparison;
    }

    public void setPopOnlineListings(Long popOnlineListings) {
        this.popOnlineListings = popOnlineListings;
    }

    public Long getPopOnlineListings() {
        return popOnlineListings;
    }

    public void setFullManagementOnlineListings(Long fullManagementOnlineListings) {
        this.fullManagementOnlineListings = fullManagementOnlineListings;
    }

    public Long getFullManagementOnlineListings() {
        return fullManagementOnlineListings;
    }

    public void setHalfManagementOnlineListings(Long halfManagementOnlineListings) {
        this.halfManagementOnlineListings = halfManagementOnlineListings;
    }

    public Long getHalfManagementOnlineListings() {
        return halfManagementOnlineListings;
    }

    public void setRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
    }

    public String getRecommendedAction() {
        return recommendedAction;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setOperationLog(String operationLog) {
        this.operationLog = operationLog;
    }

    public String getOperationLog() {
        return operationLog;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Long getLocalInTransitQuantity() {
        return localInTransitQuantity;
    }

    public void setLocalInTransitQuantity(Long localInTransitQuantity) {
        this.localInTransitQuantity = localInTransitQuantity;
    }

    public Long getLocalAvailableQuantity() {
        return localAvailableQuantity;
    }

    public void setLocalAvailableQuantity(Long localAvailableQuantity) {
        this.localAvailableQuantity = localAvailableQuantity;
    }

    public Long getBackupInTransitQuantity() {
        return backupInTransitQuantity;
    }

    public void setBackupInTransitQuantity(Long backupInTransitQuantity) {
        this.backupInTransitQuantity = backupInTransitQuantity;
    }

    public Long getHalfManagementBackupAvailableQuantity() {
        return halfManagementBackupAvailableQuantity;
    }

    public void setHalfManagementBackupAvailableQuantity(Long halfManagementBackupAvailableQuantity) {
        this.halfManagementBackupAvailableQuantity = halfManagementBackupAvailableQuantity;
    }

    public Long getFullManagementBackupAvailableQuantity() {
        return fullManagementBackupAvailableQuantity;
    }

    public void setFullManagementBackupAvailableQuantity(Long fullManagementBackupAvailableQuantity) {
        this.fullManagementBackupAvailableQuantity = fullManagementBackupAvailableQuantity;
    }

    public Long getSalesLast7Days() {
        return salesLast7Days;
    }

    public void setSalesLast7Days(Long salesLast7Days) {
        this.salesLast7Days = salesLast7Days;
    }

    public Long getSalesLast28Days() {
        return salesLast28Days;
    }

    public void setSalesLast28Days(Long salesLast28Days) {
        this.salesLast28Days = salesLast28Days;
    }

    public Long getSalesLast42Days() {
        return salesLast42Days;
    }

    public void setSalesLast42Days(Long salesLast42Days) {
        this.salesLast42Days = salesLast42Days;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("sku", getSku())
                .append("availableStock", getTotalStock())
                .append("popDailyMarketCapacity", getPopDailyMarketCapacity())
                .append("fullManagementDailyMarketCapacity", getFullManagementDailyMarketCapacity())
                .append("halfManagementDailyMarketCapacity", getHalfManagementDailyMarketCapacity())
                .append("competitorHotSalesCountries", getCompetitorHotSalesCountries())
                .append("competitorHotSalesPrice", getCompetitorHotSalesPrice())
                .append("marketAveragePrice", getMarketAveragePrice())
                .append("priceComparison", getPriceComparison())
                .append("popOnlineListings", getPopOnlineListings())
                .append("fullManagementOnlineListings", getFullManagementOnlineListings())
                .append("halfManagementOnlineListings", getHalfManagementOnlineListings())
                .append("recommendedAction", getRecommendedAction())
                .append("status", getStatus())
                .append("completedAt", getCompletedAt())
                .append("operationLog", getOperationLog())
                .append("createdBy", getCreatedBy())
                .append("createdAt", getCreatedAt())
                .append("updatedBy", getUpdatedBy())
                .append("updatedAt", getUpdatedAt())
                .toString();
    }
}
