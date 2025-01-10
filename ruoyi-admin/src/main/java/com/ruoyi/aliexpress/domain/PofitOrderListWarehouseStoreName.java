package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 马帮后台导出金额订单数据对象 pofit_order_list_warehouse_store_name
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
public class PofitOrderListWarehouseStoreName extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long sId;

    /** 年份 */
    @Excel(name = "年份")
    private Long year;

    /** 月份 */
    @Excel(name = "月份")
    private Long moon;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** 店铺名称 */
    @Excel(name = "店铺类型")
    private String storeType;


    /** SKU */
    @Excel(name = "SKU")
    private String sku;

    /** SKU状态 */
    @Excel(name = "SKU状态")
    private String skuState;

    /** 订单分类 */
    @Excel(name = "订单分类")
    private String category;

    /** 商品数量 */
    @Excel(name = "商品数量")
    private Long quantity;

    /** 实际利润 */
    @Excel(name = "实际利润")
    private BigDecimal actualProfit;

    /** 在途数量 */
    @Excel(name = "在途数量")
    private Long transitQuantity;

    /** 库存总数量 */
    @Excel(name = "库存总数量")
    private Long stockQuantity;

    /** 本地库存数量 */
    @Excel(name = "本地库存数量")
    private Long bdStockQuantity;

    /** 备仓库存数量 */
    @Excel(name = "备仓库存数量")
    private Long bcStockQuantity;

    /** 未发货数量 */
    @Excel(name = "未发货数量")
    private Long unshippedQuantity;

    /** 总库存成本金额 */
    @Excel(name = "总库存成本金额")
    private BigDecimal inventoryCost;

    /** 日均销量 */
    @Excel(name = "日均销量")
    private BigDecimal dailyAvgSales;

    /** 销售金额 */
    @Excel(name = "销售金额")
    private BigDecimal loanAmount;

    /** 利润率 */
    @Excel(name = "利润率")
    private BigDecimal profitMargin;

    /** 成本价格 */
    @Excel(name = "成本价格")
    private BigDecimal costPrice;

    /** 可售天数 */
    @Excel(name = "可售天数")
    private Long saleDays;

    /** 月库存资金使用率 */
    @Excel(name = "月库存资金使用率")
    private BigDecimal monthlyReturn;

    /** 库存周转率 */
    @Excel(name = "库存周转率")
    private BigDecimal inventoryTurns;

    /** 回报率 */
    @Excel(name = "回报率")
    private BigDecimal returnRate;

    /** 市场容量 */
    @Excel(name = "市场容量")
    private BigDecimal marketCapacity;

    /** POP实际利润 */
    @Excel(name = "POP实际利润")
    private BigDecimal actualProfitPop;

    /** POP销售数量 */
    @Excel(name = "POP销售数量")
    private Long quantityPop;

    /** POP销售金额 */
    @Excel(name = "POP销售金额")
    private BigDecimal loanAmountPop;

    /** POP利润率 */
    @Excel(name = "POP利润率")
    private BigDecimal profitMarginPop;

    /** 半托管-JIT实际利润 */
    @Excel(name = "半托管-JIT实际利润")
    private BigDecimal actualProfitJitHalf;

    /** 半托管-JIT销售数量 */
    @Excel(name = "半托管-JIT销售数量")
    private Long quantityJitHalf;

    /** 半托管-JIT销售金额 */
    @Excel(name = "半托管-JIT销售金额")
    private BigDecimal loanAmountJitHalf;

    /** 半托管-JIT利润率 */
    @Excel(name = "半托管-JIT利润率")
    private BigDecimal profitMarginJitHalf;

    /** 半托管-仓发实际利润 */
    @Excel(name = "半托管-仓发实际利润")
    private BigDecimal actualProfitWarehouseHalf;

    /** 半托管-仓发销售数量 */
    @Excel(name = "半托管-仓发销售数量")
    private Long quantityWarehouseHalf;

    /** 半托管-仓发销售金额 */
    @Excel(name = "半托管-仓发销售金额")
    private BigDecimal loanAmountWarehouseHalf;

    /** 半托管-仓发利润率 */
    @Excel(name = "半托管-仓发利润率")
    private BigDecimal profitMarginWarehouseHalf;

    /** 全托管-JIT实际利润 */
    @Excel(name = "全托管-JIT实际利润")
    private BigDecimal actualProfitAllJit;

    /** 全托管-JIT销售数量 */
    @Excel(name = "全托管-JIT销售数量")
    private Long quantityAllJit;

    /** 全托管-JIT销售金额 */
    @Excel(name = "全托管-JIT销售金额")
    private BigDecimal loanAmountAllJit;

    /** 全托管-JIT利润率 */
    @Excel(name = "全托管-JIT利润率")
    private BigDecimal profitMarginAllJit;

    /** 全托管-仓发实际利润 */
    @Excel(name = "全托管-仓发实际利润")
    private BigDecimal actualProfitAllWarehouse;

    /** 全托管-仓发销售数量 */
    @Excel(name = "全托管-仓发销售数量")
    private Long quantityAllWarehouse;

    /** 全托管-仓发销售金额 */
    @Excel(name = "全托管-仓发销售金额")
    private BigDecimal loanAmountAllWarehouse;

    /** 全托管-仓发利润率 */
    @Excel(name = "全托管-仓发利润率")
    private BigDecimal profitMarginAllWarehouse;

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public void setsId(Long sId)
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }
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
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }
    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setSkuState(String skuState) 
    {
        this.skuState = skuState;
    }

    public String getSkuState() 
    {
        return skuState;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setActualProfit(BigDecimal actualProfit) 
    {
        this.actualProfit = actualProfit;
    }

    public BigDecimal getActualProfit() 
    {
        return actualProfit;
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
    public void setBdStockQuantity(Long bdStockQuantity) 
    {
        this.bdStockQuantity = bdStockQuantity;
    }

    public Long getBdStockQuantity() 
    {
        return bdStockQuantity;
    }
    public void setBcStockQuantity(Long bcStockQuantity) 
    {
        this.bcStockQuantity = bcStockQuantity;
    }

    public Long getBcStockQuantity() 
    {
        return bcStockQuantity;
    }
    public void setUnshippedQuantity(Long unshippedQuantity) 
    {
        this.unshippedQuantity = unshippedQuantity;
    }

    public Long getUnshippedQuantity() 
    {
        return unshippedQuantity;
    }
    public void setInventoryCost(BigDecimal inventoryCost) 
    {
        this.inventoryCost = inventoryCost;
    }

    public BigDecimal getInventoryCost() 
    {
        return inventoryCost;
    }
    public void setDailyAvgSales(BigDecimal dailyAvgSales) 
    {
        this.dailyAvgSales = dailyAvgSales;
    }

    public BigDecimal getDailyAvgSales() 
    {
        return dailyAvgSales;
    }
    public void setLoanAmount(BigDecimal loanAmount) 
    {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getLoanAmount() 
    {
        return loanAmount;
    }
    public void setProfitMargin(BigDecimal profitMargin) 
    {
        this.profitMargin = profitMargin;
    }

    public BigDecimal getProfitMargin() 
    {
        return profitMargin;
    }
    public void setCostPrice(BigDecimal costPrice) 
    {
        this.costPrice = costPrice;
    }

    public BigDecimal getCostPrice() 
    {
        return costPrice;
    }
    public void setSaleDays(Long saleDays) 
    {
        this.saleDays = saleDays;
    }

    public Long getSaleDays() 
    {
        return saleDays;
    }
    public void setMonthlyReturn(BigDecimal monthlyReturn) 
    {
        this.monthlyReturn = monthlyReturn;
    }

    public BigDecimal getMonthlyReturn() 
    {
        return monthlyReturn;
    }
    public void setInventoryTurns(BigDecimal inventoryTurns) 
    {
        this.inventoryTurns = inventoryTurns;
    }

    public BigDecimal getInventoryTurns() 
    {
        return inventoryTurns;
    }
    public void setReturnRate(BigDecimal returnRate) 
    {
        this.returnRate = returnRate;
    }

    public BigDecimal getReturnRate() 
    {
        return returnRate;
    }
    public void setMarketCapacity(BigDecimal marketCapacity) 
    {
        this.marketCapacity = marketCapacity;
    }

    public BigDecimal getMarketCapacity() 
    {
        return marketCapacity;
    }
    public void setActualProfitPop(BigDecimal actualProfitPop) 
    {
        this.actualProfitPop = actualProfitPop;
    }

    public BigDecimal getActualProfitPop() 
    {
        return actualProfitPop;
    }
    public void setQuantityPop(Long quantityPop) 
    {
        this.quantityPop = quantityPop;
    }

    public Long getQuantityPop() 
    {
        return quantityPop;
    }
    public void setLoanAmountPop(BigDecimal loanAmountPop) 
    {
        this.loanAmountPop = loanAmountPop;
    }

    public BigDecimal getLoanAmountPop() 
    {
        return loanAmountPop;
    }
    public void setProfitMarginPop(BigDecimal profitMarginPop) 
    {
        this.profitMarginPop = profitMarginPop;
    }

    public BigDecimal getProfitMarginPop() 
    {
        return profitMarginPop;
    }
    public void setActualProfitJitHalf(BigDecimal actualProfitJitHalf) 
    {
        this.actualProfitJitHalf = actualProfitJitHalf;
    }

    public BigDecimal getActualProfitJitHalf() 
    {
        return actualProfitJitHalf;
    }
    public void setQuantityJitHalf(Long quantityJitHalf) 
    {
        this.quantityJitHalf = quantityJitHalf;
    }

    public Long getQuantityJitHalf() 
    {
        return quantityJitHalf;
    }
    public void setLoanAmountJitHalf(BigDecimal loanAmountJitHalf) 
    {
        this.loanAmountJitHalf = loanAmountJitHalf;
    }

    public BigDecimal getLoanAmountJitHalf() 
    {
        return loanAmountJitHalf;
    }
    public void setProfitMarginJitHalf(BigDecimal profitMarginJitHalf) 
    {
        this.profitMarginJitHalf = profitMarginJitHalf;
    }

    public BigDecimal getProfitMarginJitHalf() 
    {
        return profitMarginJitHalf;
    }
    public void setActualProfitWarehouseHalf(BigDecimal actualProfitWarehouseHalf) 
    {
        this.actualProfitWarehouseHalf = actualProfitWarehouseHalf;
    }

    public BigDecimal getActualProfitWarehouseHalf() 
    {
        return actualProfitWarehouseHalf;
    }
    public void setQuantityWarehouseHalf(Long quantityWarehouseHalf) 
    {
        this.quantityWarehouseHalf = quantityWarehouseHalf;
    }

    public Long getQuantityWarehouseHalf() 
    {
        return quantityWarehouseHalf;
    }
    public void setLoanAmountWarehouseHalf(BigDecimal loanAmountWarehouseHalf) 
    {
        this.loanAmountWarehouseHalf = loanAmountWarehouseHalf;
    }

    public BigDecimal getLoanAmountWarehouseHalf() 
    {
        return loanAmountWarehouseHalf;
    }
    public void setProfitMarginWarehouseHalf(BigDecimal profitMarginWarehouseHalf) 
    {
        this.profitMarginWarehouseHalf = profitMarginWarehouseHalf;
    }

    public BigDecimal getProfitMarginWarehouseHalf() 
    {
        return profitMarginWarehouseHalf;
    }
    public void setActualProfitAllJit(BigDecimal actualProfitAllJit) 
    {
        this.actualProfitAllJit = actualProfitAllJit;
    }

    public BigDecimal getActualProfitAllJit() 
    {
        return actualProfitAllJit;
    }
    public void setQuantityAllJit(Long quantityAllJit) 
    {
        this.quantityAllJit = quantityAllJit;
    }

    public Long getQuantityAllJit() 
    {
        return quantityAllJit;
    }
    public void setLoanAmountAllJit(BigDecimal loanAmountAllJit) 
    {
        this.loanAmountAllJit = loanAmountAllJit;
    }

    public BigDecimal getLoanAmountAllJit() 
    {
        return loanAmountAllJit;
    }
    public void setProfitMarginAllJit(BigDecimal profitMarginAllJit) 
    {
        this.profitMarginAllJit = profitMarginAllJit;
    }

    public BigDecimal getProfitMarginAllJit() 
    {
        return profitMarginAllJit;
    }
    public void setActualProfitAllWarehouse(BigDecimal actualProfitAllWarehouse) 
    {
        this.actualProfitAllWarehouse = actualProfitAllWarehouse;
    }

    public BigDecimal getActualProfitAllWarehouse() 
    {
        return actualProfitAllWarehouse;
    }
    public void setQuantityAllWarehouse(Long quantityAllWarehouse) 
    {
        this.quantityAllWarehouse = quantityAllWarehouse;
    }

    public Long getQuantityAllWarehouse() 
    {
        return quantityAllWarehouse;
    }
    public void setLoanAmountAllWarehouse(BigDecimal loanAmountAllWarehouse) 
    {
        this.loanAmountAllWarehouse = loanAmountAllWarehouse;
    }

    public BigDecimal getLoanAmountAllWarehouse() 
    {
        return loanAmountAllWarehouse;
    }
    public void setProfitMarginAllWarehouse(BigDecimal profitMarginAllWarehouse) 
    {
        this.profitMarginAllWarehouse = profitMarginAllWarehouse;
    }

    public BigDecimal getProfitMarginAllWarehouse() 
    {
        return profitMarginAllWarehouse;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("year", getYear())
            .append("moon", getMoon())
            .append("storeName", getStoreName())
            .append("sku", getSku())
            .append("skuState", getSkuState())
            .append("category", getCategory())
            .append("quantity", getQuantity())
            .append("actualProfit", getActualProfit())
            .append("transitQuantity", getTransitQuantity())
            .append("stockQuantity", getStockQuantity())
            .append("bdStockQuantity", getBdStockQuantity())
            .append("bcStockQuantity", getBcStockQuantity())
            .append("unshippedQuantity", getUnshippedQuantity())
            .append("inventoryCost", getInventoryCost())
            .append("dailyAvgSales", getDailyAvgSales())
            .append("loanAmount", getLoanAmount())
            .append("profitMargin", getProfitMargin())
            .append("costPrice", getCostPrice())
            .append("saleDays", getSaleDays())
            .append("monthlyReturn", getMonthlyReturn())
            .append("inventoryTurns", getInventoryTurns())
            .append("returnRate", getReturnRate())
            .append("marketCapacity", getMarketCapacity())
            .append("actualProfitPop", getActualProfitPop())
            .append("quantityPop", getQuantityPop())
            .append("loanAmountPop", getLoanAmountPop())
            .append("profitMarginPop", getProfitMarginPop())
            .append("actualProfitJitHalf", getActualProfitJitHalf())
            .append("quantityJitHalf", getQuantityJitHalf())
            .append("loanAmountJitHalf", getLoanAmountJitHalf())
            .append("profitMarginJitHalf", getProfitMarginJitHalf())
            .append("actualProfitWarehouseHalf", getActualProfitWarehouseHalf())
            .append("quantityWarehouseHalf", getQuantityWarehouseHalf())
            .append("loanAmountWarehouseHalf", getLoanAmountWarehouseHalf())
            .append("profitMarginWarehouseHalf", getProfitMarginWarehouseHalf())
            .append("actualProfitAllJit", getActualProfitAllJit())
            .append("quantityAllJit", getQuantityAllJit())
            .append("loanAmountAllJit", getLoanAmountAllJit())
            .append("profitMarginAllJit", getProfitMarginAllJit())
            .append("actualProfitAllWarehouse", getActualProfitAllWarehouse())
            .append("quantityAllWarehouse", getQuantityAllWarehouse())
            .append("loanAmountAllWarehouse", getLoanAmountAllWarehouse())
            .append("profitMarginAllWarehouse", getProfitMarginAllWarehouse())
            .toString();
    }
}
