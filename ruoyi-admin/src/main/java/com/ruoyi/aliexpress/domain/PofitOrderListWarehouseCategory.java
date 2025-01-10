package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 马帮后台导出金额订单数据对象 pofit_order_list_warehouse_category
 * 
 * @author ruoyi
 * @date 2025-01-08
 */
public class PofitOrderListWarehouseCategory extends BaseEntity
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

    /** SKU */
    @Excel(name = "SKU")
    private String sku;

    /** SKU状态 */
    @Excel(name = "SKU状态")
    private String skuState;

    /** SKU状态 */
    @Excel(name = "SKU负责人")
    private String personCharge;



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

    /** 市场容量 */
    @Excel(name = "POP实际利润")
    private BigDecimal actualProfitPop;
    /** 市场容量 */
    @Excel(name = "POP销售数量")
    private BigDecimal quantityPop;
    /** 市场容量 */
    @Excel(name = "POP销售金额")
    private BigDecimal loanAmountPop;

    @Excel(name = "POP利润率")
    private BigDecimal profitMarginPop;

    /** 市场容量 */
    @Excel(name = "半托管-JIT实际利润")
    private BigDecimal actualProfitJitHalf;
    /** 市场容量 */
    @Excel(name = "半托管-JIT销售数量")
    private BigDecimal quantityJitHalf;
    /** 市场容量 */
    @Excel(name = "半托管-JIT销售金额")
    private BigDecimal loanAmountJitHalf;

    @Excel(name = "半托管-JIT利润率")
    private BigDecimal profitMarginJitHalf;


    /** 市场容量 */
    @Excel(name = "半托管-仓发实际利润")
    private BigDecimal actualProfitWarehouseHalf;
    /** 市场容量 */
    @Excel(name = "半托管-仓发销售数量")
    private BigDecimal quantityWarehouseHalf;
    /** 市场容量 */
    @Excel(name = "半托管-仓发销售金额")
    private BigDecimal loanAmountWarehouseHalf;
    @Excel(name = "半托管-仓发利润率")
    private BigDecimal profitMarginWarehouseHalf;

    /** 市场容量 */
    @Excel(name = "全托管-JIT实际利润")
    private BigDecimal actualProfitAllJit;
    /** 市场容量 */
    @Excel(name = "全托管-JIT销售数量")
    private BigDecimal quantityAllJit;
    /** 市场容量 */
    @Excel(name = "全托管-JIT销售金额")
    private BigDecimal loanAmountAllJit;
    @Excel(name = "全托管-JIT利润率")
    private BigDecimal profitMarginAllJit;


    /** 市场容量 */
    @Excel(name = "全托管-仓发实际利润")
    private BigDecimal actualProfitAllWarehouse;
    /** 市场容量 */
    @Excel(name = "全托管-仓发销售数量")
    private BigDecimal quantityAllWarehouse;
    /** 市场容量 */
    @Excel(name = "全托管-仓发销售金额")
    private BigDecimal loanAmountAllWarehouse;
    @Excel(name = "全托管-仓发利润率")
    private BigDecimal profitMarginAllWarehouse;


    public String getPersonCharge() {
        return personCharge;
    }

    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge;
    }

    public BigDecimal getProfitMarginPop() {
        return profitMarginPop;
    }

    public void setProfitMarginPop(BigDecimal profitMarginPop) {
        this.profitMarginPop = profitMarginPop;
    }

    public BigDecimal getProfitMarginJitHalf() {
        return profitMarginJitHalf;
    }

    public void setProfitMarginJitHalf(BigDecimal profitMarginJitHalf) {
        this.profitMarginJitHalf = profitMarginJitHalf;
    }

    public BigDecimal getProfitMarginWarehouseHalf() {
        return profitMarginWarehouseHalf;
    }

    public void setProfitMarginWarehouseHalf(BigDecimal profitMarginWarehouseHalf) {
        this.profitMarginWarehouseHalf = profitMarginWarehouseHalf;
    }

    public BigDecimal getProfitMarginAllJit() {
        return profitMarginAllJit;
    }

    public void setProfitMarginAllJit(BigDecimal profitMarginAllJit) {
        this.profitMarginAllJit = profitMarginAllJit;
    }

    public BigDecimal getProfitMarginAllWarehouse() {
        return profitMarginAllWarehouse;
    }

    public void setProfitMarginAllWarehouse(BigDecimal profitMarginAllWarehouse) {
        this.profitMarginAllWarehouse = profitMarginAllWarehouse;
    }

    public BigDecimal getActualProfitPop() {
        return actualProfitPop;
    }

    public void setActualProfitPop(BigDecimal actualProfitPop) {
        this.actualProfitPop = actualProfitPop;
    }

    public BigDecimal getQuantityPop() {
        return quantityPop;
    }

    public void setQuantityPop(BigDecimal quantityPop) {
        this.quantityPop = quantityPop;
    }

    public BigDecimal getLoanAmountPop() {
        return loanAmountPop;
    }

    public void setLoanAmountPop(BigDecimal loanAmountPop) {
        this.loanAmountPop = loanAmountPop;
    }

    public BigDecimal getActualProfitJitHalf() {
        return actualProfitJitHalf;
    }

    public void setActualProfitJitHalf(BigDecimal actualProfitJitHalf) {
        this.actualProfitJitHalf = actualProfitJitHalf;
    }

    public BigDecimal getQuantityJitHalf() {
        return quantityJitHalf;
    }

    public void setQuantityJitHalf(BigDecimal quantityJitHalf) {
        this.quantityJitHalf = quantityJitHalf;
    }

    public BigDecimal getLoanAmountJitHalf() {
        return loanAmountJitHalf;
    }

    public void setLoanAmountJitHalf(BigDecimal loanAmountJitHalf) {
        this.loanAmountJitHalf = loanAmountJitHalf;
    }

    public BigDecimal getActualProfitWarehouseHalf() {
        return actualProfitWarehouseHalf;
    }

    public void setActualProfitWarehouseHalf(BigDecimal actualProfitWarehouseHalf) {
        this.actualProfitWarehouseHalf = actualProfitWarehouseHalf;
    }

    public BigDecimal getQuantityWarehouseHalf() {
        return quantityWarehouseHalf;
    }

    public void setQuantityWarehouseHalf(BigDecimal quantityWarehouseHalf) {
        this.quantityWarehouseHalf = quantityWarehouseHalf;
    }

    public BigDecimal getLoanAmountWarehouseHalf() {
        return loanAmountWarehouseHalf;
    }

    public void setLoanAmountWarehouseHalf(BigDecimal loanAmountWarehouseHalf) {
        this.loanAmountWarehouseHalf = loanAmountWarehouseHalf;
    }

    public BigDecimal getActualProfitAllJit() {
        return actualProfitAllJit;
    }

    public void setActualProfitAllJit(BigDecimal actualProfitAllJit) {
        this.actualProfitAllJit = actualProfitAllJit;
    }

    public BigDecimal getQuantityAllJit() {
        return quantityAllJit;
    }

    public void setQuantityAllJit(BigDecimal quantityAllJit) {
        this.quantityAllJit = quantityAllJit;
    }

    public BigDecimal getLoanAmountAllJit() {
        return loanAmountAllJit;
    }

    public void setLoanAmountAllJit(BigDecimal loanAmountAllJit) {
        this.loanAmountAllJit = loanAmountAllJit;
    }

    public BigDecimal getActualProfitAllWarehouse() {
        return actualProfitAllWarehouse;
    }

    public void setActualProfitAllWarehouse(BigDecimal actualProfitAllWarehouse) {
        this.actualProfitAllWarehouse = actualProfitAllWarehouse;
    }

    public BigDecimal getQuantityAllWarehouse() {
        return quantityAllWarehouse;
    }

    public void setQuantityAllWarehouse(BigDecimal quantityAllWarehouse) {
        this.quantityAllWarehouse = quantityAllWarehouse;
    }

    public BigDecimal getLoanAmountAllWarehouse() {
        return loanAmountAllWarehouse;
    }

    public void setLoanAmountAllWarehouse(BigDecimal loanAmountAllWarehouse) {
        this.loanAmountAllWarehouse = loanAmountAllWarehouse;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("year", getYear())
            .append("moon", getMoon())
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
            .toString();
    }
}
