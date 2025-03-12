package com.ruoyi.aliexpress.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 店铺利润汇总对象 aliexpress_store_profit
 *
 * @author panfalin
 * @date 2024-12-11
 */
public class AliexpressStoreAutoProfit extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 利润月份
     */
    @Excel(name = "利润月份")
    private String mouth;

    /**
     * 类别
     */
    @Excel(name = "类别")
    private String category;

    /**
     * 类别数组
     */
    private String[] categoryArray;

    /**
     * 货币类型
     */
    @Excel(name = "货币类型")
    private String moneyType;

    /**
     * 店铺
     */
    @Excel(name = "店铺")
    private String storeName;

    /**
     * 店铺负责人
     */
    @Excel(name = "店铺负责人")
    private String storeManager;

    /**
     * 直通车
     */
    @Excel(name = "全托管-JIT/SKU销量")
    private BigDecimal directCar;

    /**
     * 物流赔付
     */
    @Excel(name = "全托管-JIT/供货价金额")
    private BigDecimal cancelOrderRmb;
    /**
     * 9月利润率
     */
    @Excel(name = "全托管-JIT/利润")
    private BigDecimal septemberProfitRate;


    /**
     * 海外仓尾程运费
     */
    @Excel(name = "全托管-仓发/SKU销量")
    private BigDecimal overseasLastShipping;

    /**
     * 操作费
     */
    @Excel(name = "全托管-仓发/供货价金额")
    private BigDecimal operationFee;
    /**
     * 9月利润
     */
    @Excel(name = "全托管-仓发/利润")
    private BigDecimal septemberProfit;

    /**
     * 清仓成本补助
     */
    @Excel(name = "清仓成本补助")
    private BigDecimal clearanceCostSubsidy;

    /**
     * 9月营业额
     */
    @Excel(name = "当月揽收费用")
    private BigDecimal septemberRevenue;

    /**
     * 对比营业额
     */
    @Excel(name = "上月活动差价")
    private BigDecimal compareRevenue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getCategoryArray() {
        return categoryArray;
    }

    public void setCategoryArray(String[] categoryArray) {
        this.categoryArray = categoryArray;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreManager() {
        return storeManager;
    }

    public void setStoreManager(String storeManager) {
        this.storeManager = storeManager;
    }

    public BigDecimal getDirectCar() {
        return directCar;
    }

    public void setDirectCar(BigDecimal directCar) {
        this.directCar = directCar;
    }

    public BigDecimal getCancelOrderRmb() {
        return cancelOrderRmb;
    }

    public void setCancelOrderRmb(BigDecimal cancelOrderRmb) {
        this.cancelOrderRmb = cancelOrderRmb;
    }

    public BigDecimal getSeptemberProfitRate() {
        return septemberProfitRate;
    }

    public void setSeptemberProfitRate(BigDecimal septemberProfitRate) {
        this.septemberProfitRate = septemberProfitRate;
    }

    public BigDecimal getOverseasLastShipping() {
        return overseasLastShipping;
    }

    public void setOverseasLastShipping(BigDecimal overseasLastShipping) {
        this.overseasLastShipping = overseasLastShipping;
    }

    public BigDecimal getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(BigDecimal operationFee) {
        this.operationFee = operationFee;
    }

    public BigDecimal getSeptemberProfit() {
        return septemberProfit;
    }

    public void setSeptemberProfit(BigDecimal septemberProfit) {
        this.septemberProfit = septemberProfit;
    }

    public BigDecimal getClearanceCostSubsidy() {
        return clearanceCostSubsidy;
    }

    public void setClearanceCostSubsidy(BigDecimal clearanceCostSubsidy) {
        this.clearanceCostSubsidy = clearanceCostSubsidy;
    }

    public BigDecimal getSeptemberRevenue() {
        return septemberRevenue;
    }

    public void setSeptemberRevenue(BigDecimal septemberRevenue) {
        this.septemberRevenue = septemberRevenue;
    }

    public BigDecimal getCompareRevenue() {
        return compareRevenue;
    }

    public void setCompareRevenue(BigDecimal compareRevenue) {
        this.compareRevenue = compareRevenue;
    }

    public BigDecimal getCompareProfitRate() {
        return compareProfitRate;
    }

    public void setCompareProfitRate(BigDecimal compareProfitRate) {
        this.compareProfitRate = compareProfitRate;
    }

    /**
     * 对比利润率
     */
    @Excel(name = "当月产生罚款")
    private BigDecimal compareProfitRate;

}
