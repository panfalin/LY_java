package com.ruoyi.orders.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单数据对象 orders
 * 
 * @author ruoyi
 * @date 2024-10-17
 */
public class Orders extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单编号 */
    private String orderId;

    /** 付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date paymentTime;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String storeName;

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

    /** 商品总重量 */
    @Excel(name = "商品总重量")
    private BigDecimal totalProductWeight;

    /** 订单总金额 */
    @Excel(name = "订单总金额")
    private BigDecimal totalOrderAmount;

    /** 实际运费 */
    @Excel(name = "实际运费")
    private BigDecimal actualShipping;

    /** 广告费(人民币) */
    @Excel(name = "广告费(人民币)")
    private BigDecimal adCostRmb;

    /** 平台交易费(人民币) */
    @Excel(name = "平台交易费(人民币)")
    private BigDecimal platformFeeRmb;

    /** VAT税费（人民币） */
    @Excel(name = "VAT税费", readConverterExp = "人=民币")
    private BigDecimal vatFeeRmb;

    /** 订单利润 */
    @Excel(name = "订单利润")
    private String orderProfit;

    /** 订单利润率 */
    @Excel(name = "订单利润率")
    private String orderProfitRate;

    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }
    public void setPaymentTime(Date paymentTime) 
    {
        this.paymentTime = paymentTime;
    }

    public Date getPaymentTime()
    {
        return paymentTime;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
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
    public void setOrderProfit(String orderProfit) 
    {
        this.orderProfit = orderProfit;
    }

    public String getOrderProfit() 
    {
        return orderProfit;
    }
    public void setOrderProfitRate(String orderProfitRate) 
    {
        this.orderProfitRate = orderProfitRate;
    }

    public String getOrderProfitRate() 
    {
        return orderProfitRate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("paymentTime", getPaymentTime())
            .append("storeName", getStoreName())
            .append("country", getCountry())
            .append("weight", getWeight())
            .append("skuDetails", getSkuDetails())
            .append("skuQuantity", getSkuQuantity())
            .append("totalProductWeight", getTotalProductWeight())
            .append("totalOrderAmount", getTotalOrderAmount())
            .append("actualShipping", getActualShipping())
            .append("adCostRmb", getAdCostRmb())
            .append("platformFeeRmb", getPlatformFeeRmb())
            .append("vatFeeRmb", getVatFeeRmb())
            .append("orderProfit", getOrderProfit())
            .append("orderProfitRate", getOrderProfitRate())
            .toString();
    }
}
