package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 马帮后台导出金额订单数据对象 pofit_order_list_warehouse
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
public class PofitOrderListWarehouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long sId;

    /** 年份 */
    @Excel(name = "年份")
    private BigDecimal year;

    /** 月份 */
    @Excel(name = "月份")
    private BigDecimal moon;

    /** SKU */
    @Excel(name = "SKU")
    private String sku;

    /** SKU */
    @Excel(name = "SKU负责人")
    private String personCharge;


    /** 商品数量 */
    @Excel(name = "商品数量")
    private Long quantity;

    /** 实际利润 */
    @Excel(name = "实际利润")
    private BigDecimal actualProfit;

    /** 在途数量 */
    @Excel(name = "在途数量")
    private Long transitQuantity;

    /** 库存数量 */
    //@Excel(name = "库存数量")
    private Long stockQuantity;

    /** 库存数量 */
    @Excel(name = "本地库存数量")
    private Long bdStockQuantity;

    /** 库存数量 */
    @Excel(name = "备仓库存数量")
    private Long bcStockQuantity;



    /** 未发货数量 */
    @Excel(name = "未发货数量")
    private Long unshippedQuantity;

    /** 未发货数量 */
    @Excel(name = "总库存成本金额")
    private BigDecimal inventoryCost;

    /** 未发货数量 */
    @Excel(name = "日均销量")
    private BigDecimal dailyAvgSales;

    /** 未发货数量 */
    @Excel(name = "销售金额")
    private BigDecimal loanAmount;

    /** 未发货数量 */
    @Excel(name = "利润率")
    private BigDecimal profitMargin;

    /** 未发货数量 */
    @Excel(name = "成本价格")
    private BigDecimal costPrice;

    /** 未发货数量 */
    @Excel(name = "月回报率")
    private BigDecimal monthlyReturn;

    /** 未发货数量 */
    @Excel(name = "可售天数")
    private BigDecimal saleDays;


    /** 未发货数量 */
    @Excel(name = "库存周转率")
    private BigDecimal inventoryTurns;


    /** 未发货数量 */
    @Excel(name = "回报率")
    private BigDecimal returnRate;

    /** 未发货数量 */
    @Excel(name = "sku状态")
    private String skuState;

    /** 未发货数量 */
    @Excel(name = "市场容量")
    private String marketCapacity;

    /** 未发货数量 */
    @Excel(name = "订单分类")
    private String category;




    public String getPersonCharge() {
        return personCharge;
    }

    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMarketCapacity() {
        return marketCapacity;
    }

    public void setMarketCapacity(String marketCapacity) {
        this.marketCapacity = marketCapacity;
    }

    public String getSkuState() {
        return skuState;
    }

    public void setSkuState(String skuState) {
        this.skuState = skuState;
    }

    public BigDecimal getInventoryTurns() {
        return inventoryTurns;
    }

    public void setInventoryTurns(BigDecimal inventoryTurns) {
        this.inventoryTurns = inventoryTurns;
    }

    public BigDecimal getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(BigDecimal returnRate) {
        this.returnRate = returnRate;
    }

    public BigDecimal getMonthlyReturn() {
        return monthlyReturn;
    }

    public void setMonthlyReturn(BigDecimal monthlyReturn) {
        this.monthlyReturn = monthlyReturn;
    }

    public Long getBcStockQuantity() {
        return bcStockQuantity;
    }

    public void setBcStockQuantity(Long bcStockQuantity) {
        this.bcStockQuantity = bcStockQuantity;
    }

    public Long getBdStockQuantity() {
        return bdStockQuantity;
    }

    public void setBdStockQuantity(Long bdStockQuantity) {
        this.bdStockQuantity = bdStockQuantity;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(BigDecimal profitMargin) {
        this.profitMargin = profitMargin;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getSaleDays() {
        return saleDays;
    }

    public void setSaleDays(BigDecimal saleDays) {
        this.saleDays = saleDays;
    }

    public BigDecimal getDailyAvgSales() {
        return dailyAvgSales;
    }

    public void setDailyAvgSales(BigDecimal dailyAvgSales) {
        this.dailyAvgSales = dailyAvgSales;
    }

    public BigDecimal getInventoryCost() {
        return inventoryCost;
    }

    public void setInventoryCost(BigDecimal inventoryCost) {
        this.inventoryCost = inventoryCost;
    }

    public void setsId(Long sId)
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }
    public void setYear(BigDecimal year) 
    {
        this.year = year;
    }

    public BigDecimal getYear() 
    {
        return year;
    }
    public void setMoon(BigDecimal moon) 
    {
        this.moon = moon;
    }

    public BigDecimal getMoon() 
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
    public void setUnshippedQuantity(Long unshippedQuantity) 
    {
        this.unshippedQuantity = unshippedQuantity;
    }

    public Long getUnshippedQuantity() 
    {
        return unshippedQuantity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("year", getYear())
            .append("moon", getMoon())
            .append("sku", getSku())
            .append("quantity", getQuantity())
            .append("actualProfit", getActualProfit())
            .append("transitQuantity", getTransitQuantity())
            .append("stockQuantity", getStockQuantity())
            .append("unshippedQuantity", getUnshippedQuantity())
            .toString();
    }
}
