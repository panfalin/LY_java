package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 店铺利润汇总对象 aliexpress_store_profit
 *
 * @author panfalin
 * @date 2024-12-11
 */
public class AliexpressStoreProfit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 利润月份 */
    @Excel(name = "利润月份")
    private String mouth;

    /** 货币类型 */
    @Excel(name = "货币类型")
    private String moneyType;

    /** 店铺 */
    @Excel(name = "店铺")
    private String storeName;

    /** 店铺负责人 */
    @Excel(name = "店铺负责人")
    private String storeManager;

    /** 订单金额 */
    @Excel(name = "订单金额")
    private BigDecimal orderAmount;

    /** 运费 */
    @Excel(name = "运费")
    private BigDecimal shippingFee;

    /** 其他收入 */
    @Excel(name = "其他收入")
    private BigDecimal otherIncome;

    /** 补贴金额 */
    @Excel(name = "补贴金额")
    private BigDecimal subsidyAmount;

    /** 退货成本 */
    @Excel(name = "退货成本")
    private BigDecimal returnCost;

    /** 运费退回 */
    @Excel(name = "运费退回")
    private BigDecimal shippingReturn;

    /** 其他店铺收入 */
    @Excel(name = "其他店铺收入")
    private BigDecimal otherStoreIncome;

    /** 合计 */
    @Excel(name = "合计")
    private BigDecimal total;

    /** 订单量 */
    @Excel(name = "订单量")
    private BigDecimal orderQuantity;

    /** 退款订单量 */
    @Excel(name = "退款订单量")
    private BigDecimal refundOrderQuantity;

    /** 退款金额 */
    @Excel(name = "退款金额")
    private BigDecimal refundAmount;

    /** 客单价 */
    @Excel(name = "客单价")
    private BigDecimal customerUnitPrice;

    /** 毛利 */
    @Excel(name = "毛利")
    private BigDecimal grossProfit;

    /** 实际退款USD */
    @Excel(name = "实际退款USD")
    private BigDecimal actualRefundUsd;

    /** 直通车 */
    @Excel(name = "直通车")
    private BigDecimal directCar;

    /** 取消订单（rmb） */
    @Excel(name = "物流赔付", readConverterExp = "r=mb")
    private BigDecimal cancelOrderRmb;

    /** 清仓成本补助 */
    @Excel(name = "清仓成本补助")
    private BigDecimal clearanceCostSubsidy;

    /** 退款差值 */
    @Excel(name = "退款差值")
    private BigDecimal refundDifference;

    /** 直通车花费 */
    @Excel(name = "直通车花费")
    private BigDecimal directCarCost;

    /** 海外仓头程运费 */
    @Excel(name = "海外仓头程运费")
    private BigDecimal overseasFirstShipping;

    /** 海外仓尾程运费 */
    @Excel(name = "海外仓尾程运费")
    private BigDecimal overseasLastShipping;

    /** 操作费 */
    @Excel(name = "操作费")
    private BigDecimal operationFee;

    /** 退货成本 */
    @Excel(name = "退货成本")
    private BigDecimal returnCost2;

    /** 供应商补发成本 */
    @Excel(name = "供应商补发成本")
    private BigDecimal supplierReshipCost;

    /** 仓库发错损失 */
    @Excel(name = "仓库发错损失")
    private BigDecimal warehouseErrorLoss;

    /** 实际花费毛利 */
    @Excel(name = "实际花费毛利")
    private BigDecimal actualCostProfit;

    /** 实际花费毛利率1 */
    @Excel(name = "实际花费毛利率1")
    private BigDecimal actualCostProfitRate1;

    /** 订单实际毛利 */
    @Excel(name = "订单实际毛利")
    private BigDecimal orderActualProfit;

    /** 订单实际毛利率 */
    @Excel(name = "订单实际毛利率")
    private BigDecimal orderActualProfitRate;

    /** 半托管营业额 */
    @Excel(name = "半托管营业额")
    private BigDecimal half托管Revenue;

    /** 半托管利润 */
    @Excel(name = "半托管利润")
    private BigDecimal half托管Profit;

    /** 自营+半托管营业额 */
    @Excel(name = "自营+半托管营业额")
    private BigDecimal selfHalf托管Revenue;

    /** 自营+半托管利润 */
    @Excel(name = "自营+半托管利润")
    private BigDecimal selfHalf托管Profit;

    /** 利润率 */
    @Excel(name = "利润率")
    private BigDecimal profitRate;

    /** 9月营业额 */
    @Excel(name = "9月营业额")
    private BigDecimal septemberRevenue;

    /** 9月利润 */
    @Excel(name = "9月利润")
    private BigDecimal septemberProfit;

    /** 9月利润率 */
    @Excel(name = "9月利润率")
    private BigDecimal septemberProfitRate;

    /** 对比营业额 */
    @Excel(name = "对比营业额")
    private BigDecimal compareRevenue;

    /** 对比利润率 */
    @Excel(name = "对比利润率")
    private BigDecimal compareProfitRate;

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

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public String getStoreName()
    {
        return storeName;
    }
    public void setStoreManager(String storeManager)
    {
        this.storeManager = storeManager;
    }

    public String getStoreManager()
    {
        return storeManager;
    }
    public void setOrderAmount(BigDecimal orderAmount)
    {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getOrderAmount()
    {
        return orderAmount;
    }
    public void setShippingFee(BigDecimal shippingFee)
    {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getShippingFee()
    {
        return shippingFee;
    }
    public void setOtherIncome(BigDecimal otherIncome)
    {
        this.otherIncome = otherIncome;
    }

    public BigDecimal getOtherIncome()
    {
        return otherIncome;
    }
    public void setSubsidyAmount(BigDecimal subsidyAmount)
    {
        this.subsidyAmount = subsidyAmount;
    }

    public BigDecimal getSubsidyAmount()
    {
        return subsidyAmount;
    }
    public void setReturnCost(BigDecimal returnCost)
    {
        this.returnCost = returnCost;
    }

    public BigDecimal getReturnCost()
    {
        return returnCost;
    }
    public void setShippingReturn(BigDecimal shippingReturn)
    {
        this.shippingReturn = shippingReturn;
    }

    public BigDecimal getShippingReturn()
    {
        return shippingReturn;
    }
    public void setOtherStoreIncome(BigDecimal otherStoreIncome)
    {
        this.otherStoreIncome = otherStoreIncome;
    }

    public BigDecimal getOtherStoreIncome()
    {
        return otherStoreIncome;
    }
    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }

    public BigDecimal getTotal()
    {
        return total;
    }
    public void setOrderQuantity(BigDecimal orderQuantity)
    {
        this.orderQuantity = orderQuantity;
    }

    public BigDecimal getOrderQuantity()
    {
        return orderQuantity;
    }
    public void setRefundOrderQuantity(BigDecimal refundOrderQuantity)
    {
        this.refundOrderQuantity = refundOrderQuantity;
    }

    public BigDecimal getRefundOrderQuantity()
    {
        return refundOrderQuantity;
    }
    public void setRefundAmount(BigDecimal refundAmount)
    {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getRefundAmount()
    {
        return refundAmount;
    }
    public void setCustomerUnitPrice(BigDecimal customerUnitPrice)
    {
        this.customerUnitPrice = customerUnitPrice;
    }

    public BigDecimal getCustomerUnitPrice()
    {
        return customerUnitPrice;
    }
    public void setGrossProfit(BigDecimal grossProfit)
    {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getGrossProfit()
    {
        return grossProfit;
    }
    public void setActualRefundUsd(BigDecimal actualRefundUsd)
    {
        this.actualRefundUsd = actualRefundUsd;
    }

    public BigDecimal getActualRefundUsd()
    {
        return actualRefundUsd;
    }
    public void setDirectCar(BigDecimal directCar)
    {
        this.directCar = directCar;
    }

    public BigDecimal getDirectCar()
    {
        return directCar;
    }
    public void setCancelOrderRmb(BigDecimal cancelOrderRmb)
    {
        this.cancelOrderRmb = cancelOrderRmb;
    }

    public BigDecimal getCancelOrderRmb()
    {
        return cancelOrderRmb;
    }
    public void setClearanceCostSubsidy(BigDecimal clearanceCostSubsidy)
    {
        this.clearanceCostSubsidy = clearanceCostSubsidy;
    }

    public BigDecimal getClearanceCostSubsidy()
    {
        return clearanceCostSubsidy;
    }
    public void setRefundDifference(BigDecimal refundDifference)
    {
        this.refundDifference = refundDifference;
    }

    public BigDecimal getRefundDifference()
    {
        return refundDifference;
    }
    public void setDirectCarCost(BigDecimal directCarCost)
    {
        this.directCarCost = directCarCost;
    }

    public BigDecimal getDirectCarCost()
    {
        return directCarCost;
    }
    public void setOverseasFirstShipping(BigDecimal overseasFirstShipping)
    {
        this.overseasFirstShipping = overseasFirstShipping;
    }

    public BigDecimal getOverseasFirstShipping()
    {
        return overseasFirstShipping;
    }
    public void setOverseasLastShipping(BigDecimal overseasLastShipping)
    {
        this.overseasLastShipping = overseasLastShipping;
    }

    public BigDecimal getOverseasLastShipping()
    {
        return overseasLastShipping;
    }
    public void setOperationFee(BigDecimal operationFee)
    {
        this.operationFee = operationFee;
    }

    public BigDecimal getOperationFee()
    {
        return operationFee;
    }
    public void setReturnCost2(BigDecimal returnCost2)
    {
        this.returnCost2 = returnCost2;
    }

    public BigDecimal getReturnCost2()
    {
        return returnCost2;
    }
    public void setSupplierReshipCost(BigDecimal supplierReshipCost)
    {
        this.supplierReshipCost = supplierReshipCost;
    }

    public BigDecimal getSupplierReshipCost()
    {
        return supplierReshipCost;
    }
    public void setWarehouseErrorLoss(BigDecimal warehouseErrorLoss)
    {
        this.warehouseErrorLoss = warehouseErrorLoss;
    }

    public BigDecimal getWarehouseErrorLoss()
    {
        return warehouseErrorLoss;
    }
    public void setActualCostProfit(BigDecimal actualCostProfit)
    {
        this.actualCostProfit = actualCostProfit;
    }

    public BigDecimal getActualCostProfit()
    {
        return actualCostProfit;
    }
    public void setActualCostProfitRate1(BigDecimal actualCostProfitRate1)
    {
        this.actualCostProfitRate1 = actualCostProfitRate1;
    }

    public BigDecimal getActualCostProfitRate1()
    {
        return actualCostProfitRate1;
    }
    public void setOrderActualProfit(BigDecimal orderActualProfit)
    {
        this.orderActualProfit = orderActualProfit;
    }

    public BigDecimal getOrderActualProfit()
    {
        return orderActualProfit;
    }
    public void setOrderActualProfitRate(BigDecimal orderActualProfitRate)
    {
        this.orderActualProfitRate = orderActualProfitRate;
    }

    public BigDecimal getOrderActualProfitRate()
    {
        return orderActualProfitRate;
    }
    public void setHalf托管Revenue(BigDecimal half托管Revenue)
    {
        this.half托管Revenue = half托管Revenue;
    }

    public BigDecimal getHalf托管Revenue()
    {
        return half托管Revenue;
    }
    public void setHalf托管Profit(BigDecimal half托管Profit)
    {
        this.half托管Profit = half托管Profit;
    }

    public BigDecimal getHalf托管Profit()
    {
        return half托管Profit;
    }
    public void setSelfHalf托管Revenue(BigDecimal selfHalf托管Revenue)
    {
        this.selfHalf托管Revenue = selfHalf托管Revenue;
    }

    public BigDecimal getSelfHalf托管Revenue()
    {
        return selfHalf托管Revenue;
    }
    public void setSelfHalf托管Profit(BigDecimal selfHalf托管Profit)
    {
        this.selfHalf托管Profit = selfHalf托管Profit;
    }

    public BigDecimal getSelfHalf托管Profit()
    {
        return selfHalf托管Profit;
    }
    public void setProfitRate(BigDecimal profitRate)
    {
        this.profitRate = profitRate;
    }

    public BigDecimal getProfitRate()
    {
        return profitRate;
    }
    public void setSeptemberRevenue(BigDecimal septemberRevenue)
    {
        this.septemberRevenue = septemberRevenue;
    }

    public BigDecimal getSeptemberRevenue()
    {
        return septemberRevenue;
    }
    public void setSeptemberProfit(BigDecimal septemberProfit)
    {
        this.septemberProfit = septemberProfit;
    }

    public BigDecimal getSeptemberProfit()
    {
        return septemberProfit;
    }
    public void setSeptemberProfitRate(BigDecimal septemberProfitRate)
    {
        this.septemberProfitRate = septemberProfitRate;
    }

    public BigDecimal getSeptemberProfitRate()
    {
        return septemberProfitRate;
    }
    public void setCompareRevenue(BigDecimal compareRevenue)
    {
        this.compareRevenue = compareRevenue;
    }

    public BigDecimal getCompareRevenue()
    {
        return compareRevenue;
    }
    public void setCompareProfitRate(BigDecimal compareProfitRate)
    {
        this.compareProfitRate = compareProfitRate;
    }

    public BigDecimal getCompareProfitRate()
    {
        return compareProfitRate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("storeName", getStoreName())
            .append("storeManager", getStoreManager())
            .append("orderAmount", getOrderAmount())
            .append("shippingFee", getShippingFee())
            .append("otherIncome", getOtherIncome())
            .append("subsidyAmount", getSubsidyAmount())
            .append("returnCost", getReturnCost())
            .append("shippingReturn", getShippingReturn())
            .append("otherStoreIncome", getOtherStoreIncome())
            .append("total", getTotal())
            .append("orderQuantity", getOrderQuantity())
            .append("refundOrderQuantity", getRefundOrderQuantity())
            .append("refundAmount", getRefundAmount())
            .append("customerUnitPrice", getCustomerUnitPrice())
            .append("grossProfit", getGrossProfit())
            .append("actualRefundUsd", getActualRefundUsd())
            .append("directCar", getDirectCar())
            .append("cancelOrderRmb", getCancelOrderRmb())
            .append("clearanceCostSubsidy", getClearanceCostSubsidy())
            .append("refundDifference", getRefundDifference())
            .append("directCarCost", getDirectCarCost())
            .append("overseasFirstShipping", getOverseasFirstShipping())
            .append("overseasLastShipping", getOverseasLastShipping())
            .append("operationFee", getOperationFee())
            .append("returnCost2", getReturnCost2())
            .append("supplierReshipCost", getSupplierReshipCost())
            .append("warehouseErrorLoss", getWarehouseErrorLoss())
            .append("actualCostProfit", getActualCostProfit())
            .append("actualCostProfitRate1", getActualCostProfitRate1())
            .append("orderActualProfit", getOrderActualProfit())
            .append("orderActualProfitRate", getOrderActualProfitRate())
            .append("half托管Revenue", getHalf托管Revenue())
            .append("half托管Profit", getHalf托管Profit())
            .append("selfHalf托管Revenue", getSelfHalf托管Revenue())
            .append("selfHalf托管Profit", getSelfHalf托管Profit())
            .append("profitRate", getProfitRate())
            .append("septemberRevenue", getSeptemberRevenue())
            .append("septemberProfit", getSeptemberProfit())
            .append("septemberProfitRate", getSeptemberProfitRate())
            .append("compareRevenue", getCompareRevenue())
            .append("compareProfitRate", getCompareProfitRate())
            .toString();
    }
}
