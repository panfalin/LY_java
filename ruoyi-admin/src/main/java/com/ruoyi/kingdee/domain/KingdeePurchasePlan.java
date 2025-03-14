package com.ruoyi.kingdee.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 金蝶采购计划对象 kingdee_purchase_plan
 * 
 * @author panfalin
 * @date 2025-03-13
 */
public class KingdeePurchasePlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品编码 */
    @Excel(name = "商品编码")
    private String skuCode;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String skuName;

    /** 图片 */
    @Excel(name = "图片")
    private String skuImage;

    /** 系统库存 */
    @Excel(name = "系统库存")
    private BigDecimal skuStock;

    /** 在途数量 */
    @Excel(name = "在途数量")
    private BigDecimal inTransitStock;

    /** 可用库存（减去预计耗量） */
    @Excel(name = "可用库存", readConverterExp = "减=去预计耗量")
    private BigDecimal skuAvailableStock;

    /** 可用天数90天 */
    @Excel(name = "可用天数90天")
    private BigDecimal availableDays90;

    /** 可用天数30天 */
    @Excel(name = "可用天数30天")
    private BigDecimal availableDays30;

    /** 可用天数30天大于 */
    private BigDecimal availableDays30Lt;

    /** 预计耗量 */
    @Excel(name = "预计耗量")
    private BigDecimal usagePlan;

    /** 最小起订量 */
    @Excel(name = "最小起订量")
    private BigDecimal minPurchaseQuantity;

    /** 采购周期 */
    @Excel(name = "采购周期")
    private BigDecimal purchaseCycle;

    public BigDecimal getSuggestedPurchaseQty() {
        return suggestedPurchaseQty;
    }

    public void setSuggestedPurchaseQty(BigDecimal suggestedPurchaseQty) {
        this.suggestedPurchaseQty = suggestedPurchaseQty;
    }

    /**
     * 建议采购数量
     */
    private BigDecimal suggestedPurchaseQty;

    private List<KingdeeSkuUsage> kingdeeSkuUsageList;

    public List<KingdeeSkuUsage> getKingdeeSkuUsageList() {
        return kingdeeSkuUsageList;
    }

    public void setKingdeeSkuUsageList(List<KingdeeSkuUsage> kingdeeSkuUsageList) {
        this.kingdeeSkuUsageList = kingdeeSkuUsageList;
    }

    /** 日均耗量(90天) */
    @Excel(name = "日均耗量(90天)")
    private BigDecimal skuDailyUsage90;

    /** 日均耗量(30天) */
    @Excel(name = "日均耗量(30天)")
    private BigDecimal skuDailyUsage30;

    /** 采购价格 */
    @Excel(name = "采购价格")
    private BigDecimal price;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    /** 默认仓库 */
    @Excel(name = "默认仓库")
    private String warehouse;

    /** 默认仓位 */
    @Excel(name = "默认仓位")
    private String spaceidName;

    /** 过去30天总耗量 */
    @Excel(name = "过去30天总耗量")
    private BigDecimal historicalUsage;

    /** 过去30天日均耗量 */
    @Excel(name = "过去30天日均耗量")
    private BigDecimal dailyAvgUsage;

    /** 预计耗量 */
    @Excel(name = "预计耗量")
    private BigDecimal futurePrediction;

    /** 预计库存 */
    @Excel(name = "预计库存")
    private BigDecimal expectedStock;

    /** 预计可用天数 */
    @Excel(name = "预计可用天数")
    private BigDecimal expectedDays30;

    /** 在途订单信息 */
    @Excel(name = "在途订单信息")
    private String inTransitOrders;

    /** 商品分类 */
    @Excel(name = "商品分类")
    private String parentName;

    /** 商品型号 */
    @Excel(name = "商品型号")
    private String model;

    public BigDecimal getAvailableDays30Lt() {
        return availableDays30Lt;
    }

    public void setAvailableDays30Lt(BigDecimal availableDays30Lt) {
        this.availableDays30Lt = availableDays30Lt;
    }

    public void setSkuCode(String skuCode) 
    {
        this.skuCode = skuCode;
    }

    public String getSkuCode() 
    {
        return skuCode;
    }
    public void setSkuName(String skuName) 
    {
        this.skuName = skuName;
    }

    public BigDecimal getExpectedDays30() {
        return expectedDays30;
    }

    public void setExpectedDays30(BigDecimal expectedDays30) {
        this.expectedDays30 = expectedDays30;
    }

    public BigDecimal getExpectedStock() {
        return expectedStock;
    }

    public void setExpectedStock(BigDecimal expectedStock) {
        this.expectedStock = expectedStock;
    }
    public String getSkuName() 
    {
        return skuName;
    }
    public void setSkuImage(String skuImage) 
    {
        this.skuImage = skuImage;
    }

    public String getSkuImage() 
    {
        return skuImage;
    }
    public void setSkuStock(BigDecimal skuStock) 
    {
        this.skuStock = skuStock;
    }

    public BigDecimal getSkuStock() 
    {
        return skuStock;
    }
    public void setInTransitStock(BigDecimal inTransitStock) 
    {
        this.inTransitStock = inTransitStock;
    }

    public BigDecimal getInTransitStock() 
    {
        return inTransitStock;
    }
    public void setSkuAvailableStock(BigDecimal skuAvailableStock) 
    {
        this.skuAvailableStock = skuAvailableStock;
    }

    public BigDecimal getSkuAvailableStock() 
    {
        return skuAvailableStock;
    }
    public void setAvailableDays90(BigDecimal availableDays90) 
    {
        this.availableDays90 = availableDays90;
    }

    public BigDecimal getAvailableDays90() 
    {
        return availableDays90;
    }
    public void setAvailableDays30(BigDecimal availableDays30) 
    {
        this.availableDays30 = availableDays30;
    }

    public BigDecimal getAvailableDays30() 
    {
        return availableDays30;
    }
    public void setUsagePlan(BigDecimal usagePlan) 
    {
        this.usagePlan = usagePlan;
    }

    public BigDecimal getUsagePlan() 
    {
        return usagePlan;
    }
    public void setMinPurchaseQuantity(BigDecimal minPurchaseQuantity) 
    {
        this.minPurchaseQuantity = minPurchaseQuantity;
    }

    public BigDecimal getMinPurchaseQuantity() 
    {
        return minPurchaseQuantity;
    }
    public void setPurchaseCycle(BigDecimal purchaseCycle) 
    {
        this.purchaseCycle = purchaseCycle;
    }

    public BigDecimal getPurchaseCycle() 
    {
        return purchaseCycle;
    }
    public void setSkuDailyUsage90(BigDecimal skuDailyUsage90) 
    {
        this.skuDailyUsage90 = skuDailyUsage90;
    }

    public BigDecimal getSkuDailyUsage90() 
    {
        return skuDailyUsage90;
    }
    public void setSkuDailyUsage30(BigDecimal skuDailyUsage30) 
    {
        this.skuDailyUsage30 = skuDailyUsage30;
    }

    public BigDecimal getSkuDailyUsage30() 
    {
        return skuDailyUsage30;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setWarehouse(String warehouse) 
    {
        this.warehouse = warehouse;
    }

    public String getWarehouse() 
    {
        return warehouse;
    }
    public void setSpaceidName(String spaceidName) 
    {
        this.spaceidName = spaceidName;
    }

    public String getSpaceidName() 
    {
        return spaceidName;
    }
    public void setHistoricalUsage(BigDecimal historicalUsage) 
    {
        this.historicalUsage = historicalUsage;
    }

    public BigDecimal getHistoricalUsage() 
    {
        return historicalUsage;
    }
    public void setDailyAvgUsage(BigDecimal dailyAvgUsage) 
    {
        this.dailyAvgUsage = dailyAvgUsage;
    }

    public BigDecimal getDailyAvgUsage() 
    {
        return dailyAvgUsage;
    }
    public void setFuturePrediction(BigDecimal futurePrediction) 
    {
        this.futurePrediction = futurePrediction;
    }

    public BigDecimal getFuturePrediction() 
    {
        return futurePrediction;
    }
    public void setInTransitOrders(String inTransitOrders) 
    {
        this.inTransitOrders = inTransitOrders;
    }

    public String getInTransitOrders() 
    {
        return inTransitOrders;
    }
    public void setParentName(String parentName) 
    {
        this.parentName = parentName;
    }

    public String getParentName() 
    {
        return parentName;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("skuCode", getSkuCode())
            .append("skuName", getSkuName())
            .append("skuImage", getSkuImage())
            .append("skuStock", getSkuStock())
            .append("inTransitStock", getInTransitStock())
            .append("skuAvailableStock", getSkuAvailableStock())
            .append("availableDays90", getAvailableDays90())
            .append("availableDays30", getAvailableDays30())
            .append("usagePlan", getUsagePlan())
            .append("minPurchaseQuantity", getMinPurchaseQuantity())
            .append("purchaseCycle", getPurchaseCycle())
            .append("skuDailyUsage90", getSkuDailyUsage90())
            .append("skuDailyUsage30", getSkuDailyUsage30())
            .append("price", getPrice())
            .append("createdAt", getCreatedAt())
            .append("warehouse", getWarehouse())
            .append("spaceidName", getSpaceidName())
            .append("historicalUsage", getHistoricalUsage())
            .append("dailyAvgUsage", getDailyAvgUsage())
            .append("futurePrediction", getFuturePrediction())
            .append("inTransitOrders", getInTransitOrders())
            .append("parentName", getParentName())
            .append("model", getModel())
            .toString();
    }
}
