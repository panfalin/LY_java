package com.ruoyi.aliexpress.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 马帮订单数据对象 aliexpress_mabang_order_data_list
 * 
 * @author ruoyi
 * @date 2025-01-18
 */
public class AliexpressMabangOrderDataList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long sId;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderId;

    /** 类别（POP、半托管、全托管） */
    @Excel(name = "类别", readConverterExp = "P=OP、半托管、全托管")
    private String category;

    /** 付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paymentTime;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String store;

    /** 国家 */
    @Excel(name = "国家")
    private String country;

    /** 重量 */
    @Excel(name = "重量")
    private BigDecimal weight;

    /** SKU明细 */
    @Excel(name = "SKU明细")
    private String skuDetails;

    /** SKU总数量 */
    @Excel(name = "SKU总数量")
    private Long skuQuantity;

    /** 商品数量 */
    @Excel(name = "商品数量")
    private Long quantity;

    /** 商品总重量 */
    @Excel(name = "商品总重量")
    private BigDecimal totalProductWeight;

    /** 订单总金额 */
    @Excel(name = "订单总金额")
    private BigDecimal totalOrderAmount;

    /** 实际运费 */
    @Excel(name = "实际运费")
    private BigDecimal actualShipping;

    /** 运费收入 */
    @Excel(name = "运费收入")
    private BigDecimal shippingRevenue;

    /** 广告费(人民币) */
    @Excel(name = "广告费(人民币)")
    private BigDecimal adCostRmb;

    /** 平台交易费(人民币) */
    @Excel(name = "平台交易费(人民币)")
    private BigDecimal platformFeeRmb;

    /** VAT税费（人民币） */
    @Excel(name = "VAT税费", readConverterExp = "人=民币")
    private BigDecimal vatFeeRmb;

    /** 物流赔付 */
    @Excel(name = "物流赔付")
    private BigDecimal logisticsCompensation;

    /** 半托管赔付 */
    @Excel(name = "半托管赔付")
    private BigDecimal semiManagedCompensation;

    /** 实际退款 */
    @Excel(name = "实际退款")
    private BigDecimal actualRefund;

    /** 清仓补助 */
    @Excel(name = "清仓补助")
    private String clearanceSubsidy;

    /** 订单利润 */
    @Excel(name = "订单利润")
    private BigDecimal orderProfit;

    /** 订单利润率 */
    @Excel(name = "订单利润率")
    private BigDecimal orderProfitRate;

    /** 实际利润 */
    @Excel(name = "实际利润")
    private BigDecimal actualProfit;

    /** 实际利润率 */
    @Excel(name = "实际利润率")
    private BigDecimal actualProfitRate;

    public void setsId(Long sId) 
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }
    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setPaymentTime(Date paymentTime) 
    {
        this.paymentTime = paymentTime;
    }

    public Date getPaymentTime() 
    {
        return paymentTime;
    }
    public void setStore(String store) 
    {
        this.store = store;
    }

    public String getStore() 
    {
        return store;
    }
    public void setCountry(String country) 
    {
        this.country = country;
    }

    public String getCountry() 
    {
        return country;
    }
    public void setWeight(BigDecimal weight) 
    {
        this.weight = weight;
    }

    public BigDecimal getWeight() 
    {
        return weight;
    }
    public void setSkuDetails(String skuDetails) 
    {
        this.skuDetails = skuDetails;
    }

    public String getSkuDetails() 
    {
        return skuDetails;
    }
    public void setSkuQuantity(Long skuQuantity) 
    {
        this.skuQuantity = skuQuantity;
    }

    public Long getSkuQuantity() 
    {
        return skuQuantity;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setTotalProductWeight(BigDecimal totalProductWeight) 
    {
        this.totalProductWeight = totalProductWeight;
    }

    public BigDecimal getTotalProductWeight() 
    {
        return totalProductWeight;
    }
    public void setTotalOrderAmount(BigDecimal totalOrderAmount) 
    {
        this.totalOrderAmount = totalOrderAmount;
    }

    public BigDecimal getTotalOrderAmount() 
    {
        return totalOrderAmount;
    }
    public void setActualShipping(BigDecimal actualShipping) 
    {
        this.actualShipping = actualShipping;
    }

    public BigDecimal getActualShipping() 
    {
        return actualShipping;
    }
    public void setShippingRevenue(BigDecimal shippingRevenue) 
    {
        this.shippingRevenue = shippingRevenue;
    }

    public BigDecimal getShippingRevenue() 
    {
        return shippingRevenue;
    }
    public void setAdCostRmb(BigDecimal adCostRmb) 
    {
        this.adCostRmb = adCostRmb;
    }

    public BigDecimal getAdCostRmb() 
    {
        return adCostRmb;
    }
    public void setPlatformFeeRmb(BigDecimal platformFeeRmb) 
    {
        this.platformFeeRmb = platformFeeRmb;
    }

    public BigDecimal getPlatformFeeRmb() 
    {
        return platformFeeRmb;
    }
    public void setVatFeeRmb(BigDecimal vatFeeRmb) 
    {
        this.vatFeeRmb = vatFeeRmb;
    }

    public BigDecimal getVatFeeRmb() 
    {
        return vatFeeRmb;
    }
    public void setLogisticsCompensation(BigDecimal logisticsCompensation) 
    {
        this.logisticsCompensation = logisticsCompensation;
    }

    public BigDecimal getLogisticsCompensation() 
    {
        return logisticsCompensation;
    }
    public void setSemiManagedCompensation(BigDecimal semiManagedCompensation) 
    {
        this.semiManagedCompensation = semiManagedCompensation;
    }

    public BigDecimal getSemiManagedCompensation() 
    {
        return semiManagedCompensation;
    }
    public void setActualRefund(BigDecimal actualRefund) 
    {
        this.actualRefund = actualRefund;
    }

    public BigDecimal getActualRefund() 
    {
        return actualRefund;
    }
    public void setClearanceSubsidy(String clearanceSubsidy) 
    {
        this.clearanceSubsidy = clearanceSubsidy;
    }

    public String getClearanceSubsidy() 
    {
        return clearanceSubsidy;
    }
    public void setOrderProfit(BigDecimal orderProfit) 
    {
        this.orderProfit = orderProfit;
    }

    public BigDecimal getOrderProfit() 
    {
        return orderProfit;
    }
    public void setOrderProfitRate(BigDecimal orderProfitRate) 
    {
        this.orderProfitRate = orderProfitRate;
    }

    public BigDecimal getOrderProfitRate() 
    {
        return orderProfitRate;
    }
    public void setActualProfit(BigDecimal actualProfit) 
    {
        this.actualProfit = actualProfit;
    }

    public BigDecimal getActualProfit() 
    {
        return actualProfit;
    }
    public void setActualProfitRate(BigDecimal actualProfitRate) 
    {
        this.actualProfitRate = actualProfitRate;
    }

    public BigDecimal getActualProfitRate() 
    {
        return actualProfitRate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("orderId", getOrderId())
            .append("category", getCategory())
            .append("paymentTime", getPaymentTime())
            .append("store", getStore())
            .append("country", getCountry())
            .append("weight", getWeight())
            .append("skuDetails", getSkuDetails())
            .append("skuQuantity", getSkuQuantity())
            .append("quantity", getQuantity())
            .append("totalProductWeight", getTotalProductWeight())
            .append("totalOrderAmount", getTotalOrderAmount())
            .append("actualShipping", getActualShipping())
            .append("shippingRevenue", getShippingRevenue())
            .append("adCostRmb", getAdCostRmb())
            .append("platformFeeRmb", getPlatformFeeRmb())
            .append("vatFeeRmb", getVatFeeRmb())
            .append("logisticsCompensation", getLogisticsCompensation())
            .append("semiManagedCompensation", getSemiManagedCompensation())
            .append("actualRefund", getActualRefund())
            .append("clearanceSubsidy", getClearanceSubsidy())
            .append("orderProfit", getOrderProfit())
            .append("orderProfitRate", getOrderProfitRate())
            .append("actualProfit", getActualProfit())
            .append("actualProfitRate", getActualProfitRate())
            .toString();
    }
}
