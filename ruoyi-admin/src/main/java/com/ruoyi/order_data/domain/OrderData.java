package com.ruoyi.order_data.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 速卖通分析-店铺维度对象 order_data
 * 
 * @author ruoyi
 * @date 2024-10-23
 */
public class OrderData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品ID */
    @Excel(name = "商品ID")
    private String productId;

    /** 统计时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statisticalDate;

    /** 类目ID */
    @Excel(name = "类目ID")
    private String categoryId;

    /** 排名 */
    @Excel(name = "排名")
    private Long rank;

    /** 支付老买家 */
    @Excel(name = "支付老买家")
    private Long payingOldBuyers;

    /** 支付买家数 */
    @Excel(name = "支付买家数")
    private Long payingBuyers;

    /** 支付商品件数 */
    @Excel(name = "支付商品件数")
    private Long paidProductQuantity;

    /** 浏览量 */
    @Excel(name = "浏览量")
    private Long pageViews;

    /** 下单金额 */
    @Excel(name = "下单金额")
    private BigDecimal orderAmount;

    /** 平均停留时长 */
    @Excel(name = "平均停留时长")
    private BigDecimal averageStayDuration;

    /** 支付新买家 */
    @Excel(name = "支付新买家")
    private Long payingNewBuyers;

    /** 老访客数 */
    @Excel(name = "老访客数")
    private Long oldVisitorCount;

    /** 支付转化率 */
    @Excel(name = "支付转化率")
    private BigDecimal paymentConversionRate;

    /** 新访客数 */
    @Excel(name = "新访客数")
    private Long newVisitorCount;

    /** 搜索曝光量 */
    @Excel(name = "搜索曝光量")
    private Long searchExposure;

    /** 下单商品件数 */
    @Excel(name = "下单商品件数")
    private Long orderedProductQuantity;

    /** 下单买家数 */
    @Excel(name = "下单买家数")
    private Long orderingBuyers;

    /** 客单价 */
    @Excel(name = "客单价")
    private BigDecimal averageOrderValue;

    /** 成功退款金额 */
    @Excel(name = "成功退款金额")
    private BigDecimal successfulRefundAmount;

    /** 税费 */
    @Excel(name = "税费")
    private BigDecimal tax;

    /** 商品收藏人数 */
    @Excel(name = "商品收藏人数")
    private Long productFavorites;

    /** 商品加购人数 */
    @Excel(name = "商品加购人数")
    private Long productAddToCart;

    /** 访客数 */
    @Excel(name = "访客数")
    private Long visitorCount;

    /** 搜索点击率 */
    @Excel(name = "搜索点击率")
    private BigDecimal searchClickThroughRate;

    /** 成交金额 */
    @Excel(name = "成交金额")
    private BigDecimal transactionAmount;

    /** 支付件单价 */
    @Excel(name = "支付件单价")
    private BigDecimal paidItemPrice;

    /** 支付主订单数 */
    @Excel(name = "支付主订单数")
    private Long paidMainOrders;

    /** 下单转化率 */
    @Excel(name = "下单转化率")
    private BigDecimal orderConversionRate;

    /** 下单主订单数 */
    @Excel(name = "下单主订单数")
    private Long orderedMainOrders;

    /** 根类目名称 */
    @Excel(name = "根类目名称")
    private String rootCategoryName;

    /** 类目路径 */
    @Excel(name = "类目路径")
    private String categoryPath;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String storeName;

    /** SKU明细 */
    @Excel(name = "SKU明细")
    private String skuDetails;

    /** 总销售数量 */
    @Excel(name = "总销售数量")
    private Long totalQuantity;

    /** 订单总金额 */
    @Excel(name = "订单总金额")
    private BigDecimal totalOrderAmount;

    /** 总运费 */
    @Excel(name = "总运费")
    private BigDecimal totalShippingCost;

    /** 广告费(人民币) */
    @Excel(name = "广告费(人民币)")
    private BigDecimal totalAdCost;

    /** VAT税费（人民币） */
    @Excel(name = "VAT税费（人民币）")
    private BigDecimal totalVatFee;

    /** 总订单利润 */
    @Excel(name = "总订单利润")
    private BigDecimal totalSales;

    /** 订单数量 */
    @Excel(name = "订单数量")
    private Long orderCount;

    /** 国家详情 */
    @Excel(name = "国家详情")
    private String countryDetail;

    /** 总平台交易费 */
    @Excel(name = "总平台交易费")
    private BigDecimal totalPlatformFee;

    /** 国家数量 */
    @Excel(name = "国家数量")
    private Long uniqueCountries;

    public String getSkuDetails() {
        return skuDetails;
    }

    public void setSkuDetails(String skuDetails) {
        this.skuDetails = skuDetails;
    }

    public Long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public BigDecimal getTotalOrderAmount() {
        return totalOrderAmount;
    }

    public void setTotalOrderAmount(BigDecimal totalOrderAmount) {
        this.totalOrderAmount = totalOrderAmount;
    }

    public BigDecimal getTotalShippingCost() {
        return totalShippingCost;
    }

    public void setTotalShippingCost(BigDecimal totalShippingCost) {
        this.totalShippingCost = totalShippingCost;
    }

    public BigDecimal getTotalAdCost() {
        return totalAdCost;
    }

    public void setTotalAdCost(BigDecimal totalAdCost) {
        this.totalAdCost = totalAdCost;
    }

    public BigDecimal getTotalVatFee() {
        return totalVatFee;
    }

    public void setTotalVatFee(BigDecimal totalVatFee) {
        this.totalVatFee = totalVatFee;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public String getCountryDetail() {
        return countryDetail;
    }

    public void setCountryDetail(String countryDetail) {
        this.countryDetail = countryDetail;
    }

    public BigDecimal getTotalPlatformFee() {
        return totalPlatformFee;
    }

    public void setTotalPlatformFee(BigDecimal totalPlatformFee) {
        this.totalPlatformFee = totalPlatformFee;
    }

    public Long getUniqueCountries() {
        return uniqueCountries;
    }

    public void setUniqueCountries(Long uniqueCountries) {
        this.uniqueCountries = uniqueCountries;
    }

    public void setProductId(String productId) 
    {
        this.productId = productId;
    }

    public String getProductId() 
    {
        return productId;
    }
    public void setStatisticalDate(Date statisticalDate) 
    {
        this.statisticalDate = statisticalDate;
    }

    public Date getStatisticalDate() 
    {
        return statisticalDate;
    }
    public void setCategoryId(String categoryId) 
    {
        this.categoryId = categoryId;
    }

    public String getCategoryId() 
    {
        return categoryId;
    }
    public void setRank(Long rank) 
    {
        this.rank = rank;
    }

    public Long getRank() 
    {
        return rank;
    }
    public void setPayingOldBuyers(Long payingOldBuyers) 
    {
        this.payingOldBuyers = payingOldBuyers;
    }

    public Long getPayingOldBuyers() 
    {
        return payingOldBuyers;
    }
    public void setPayingBuyers(Long payingBuyers) 
    {
        this.payingBuyers = payingBuyers;
    }

    public Long getPayingBuyers() 
    {
        return payingBuyers;
    }
    public void setPaidProductQuantity(Long paidProductQuantity) 
    {
        this.paidProductQuantity = paidProductQuantity;
    }

    public Long getPaidProductQuantity() 
    {
        return paidProductQuantity;
    }
    public void setPageViews(Long pageViews) 
    {
        this.pageViews = pageViews;
    }

    public Long getPageViews() 
    {
        return pageViews;
    }
    public void setOrderAmount(BigDecimal orderAmount) 
    {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getOrderAmount() 
    {
        return orderAmount;
    }
    public void setAverageStayDuration(BigDecimal averageStayDuration) 
    {
        this.averageStayDuration = averageStayDuration;
    }

    public BigDecimal getAverageStayDuration() 
    {
        return averageStayDuration;
    }
    public void setPayingNewBuyers(Long payingNewBuyers) 
    {
        this.payingNewBuyers = payingNewBuyers;
    }

    public Long getPayingNewBuyers() 
    {
        return payingNewBuyers;
    }
    public void setOldVisitorCount(Long oldVisitorCount) 
    {
        this.oldVisitorCount = oldVisitorCount;
    }

    public Long getOldVisitorCount() 
    {
        return oldVisitorCount;
    }
    public void setPaymentConversionRate(BigDecimal paymentConversionRate) 
    {
        this.paymentConversionRate = paymentConversionRate;
    }

    public BigDecimal getPaymentConversionRate() 
    {
        return paymentConversionRate;
    }
    public void setNewVisitorCount(Long newVisitorCount) 
    {
        this.newVisitorCount = newVisitorCount;
    }

    public Long getNewVisitorCount() 
    {
        return newVisitorCount;
    }
    public void setSearchExposure(Long searchExposure) 
    {
        this.searchExposure = searchExposure;
    }

    public Long getSearchExposure() 
    {
        return searchExposure;
    }
    public void setOrderedProductQuantity(Long orderedProductQuantity) 
    {
        this.orderedProductQuantity = orderedProductQuantity;
    }

    public Long getOrderedProductQuantity() 
    {
        return orderedProductQuantity;
    }
    public void setOrderingBuyers(Long orderingBuyers) 
    {
        this.orderingBuyers = orderingBuyers;
    }

    public Long getOrderingBuyers() 
    {
        return orderingBuyers;
    }
    public void setAverageOrderValue(BigDecimal averageOrderValue) 
    {
        this.averageOrderValue = averageOrderValue;
    }

    public BigDecimal getAverageOrderValue() 
    {
        return averageOrderValue;
    }
    public void setSuccessfulRefundAmount(BigDecimal successfulRefundAmount) 
    {
        this.successfulRefundAmount = successfulRefundAmount;
    }

    public BigDecimal getSuccessfulRefundAmount() 
    {
        return successfulRefundAmount;
    }
    public void setTax(BigDecimal tax) 
    {
        this.tax = tax;
    }

    public BigDecimal getTax() 
    {
        return tax;
    }
    public void setProductFavorites(Long productFavorites) 
    {
        this.productFavorites = productFavorites;
    }

    public Long getProductFavorites() 
    {
        return productFavorites;
    }
    public void setProductAddToCart(Long productAddToCart) 
    {
        this.productAddToCart = productAddToCart;
    }

    public Long getProductAddToCart() 
    {
        return productAddToCart;
    }
    public void setVisitorCount(Long visitorCount) 
    {
        this.visitorCount = visitorCount;
    }

    public Long getVisitorCount() 
    {
        return visitorCount;
    }
    public void setSearchClickThroughRate(BigDecimal searchClickThroughRate) 
    {
        this.searchClickThroughRate = searchClickThroughRate;
    }

    public BigDecimal getSearchClickThroughRate() 
    {
        return searchClickThroughRate;
    }
    public void setTransactionAmount(BigDecimal transactionAmount) 
    {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getTransactionAmount() 
    {
        return transactionAmount;
    }
    public void setPaidItemPrice(BigDecimal paidItemPrice) 
    {
        this.paidItemPrice = paidItemPrice;
    }

    public BigDecimal getPaidItemPrice() 
    {
        return paidItemPrice;
    }
    public void setPaidMainOrders(Long paidMainOrders) 
    {
        this.paidMainOrders = paidMainOrders;
    }

    public Long getPaidMainOrders() 
    {
        return paidMainOrders;
    }
    public void setOrderConversionRate(BigDecimal orderConversionRate) 
    {
        this.orderConversionRate = orderConversionRate;
    }

    public BigDecimal getOrderConversionRate() 
    {
        return orderConversionRate;
    }
    public void setOrderedMainOrders(Long orderedMainOrders) 
    {
        this.orderedMainOrders = orderedMainOrders;
    }

    public Long getOrderedMainOrders() 
    {
        return orderedMainOrders;
    }
    public void setRootCategoryName(String rootCategoryName) 
    {
        this.rootCategoryName = rootCategoryName;
    }

    public String getRootCategoryName() 
    {
        return rootCategoryName;
    }
    public void setCategoryPath(String categoryPath) 
    {
        this.categoryPath = categoryPath;
    }

    public String getCategoryPath() 
    {
        return categoryPath;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("productId", getProductId())
            .append("statisticalDate", getStatisticalDate())
            .append("categoryId", getCategoryId())
            .append("rank", getRank())
            .append("payingOldBuyers", getPayingOldBuyers())
            .append("payingBuyers", getPayingBuyers())
            .append("paidProductQuantity", getPaidProductQuantity())
            .append("pageViews", getPageViews())
            .append("orderAmount", getOrderAmount())
            .append("averageStayDuration", getAverageStayDuration())
            .append("payingNewBuyers", getPayingNewBuyers())
            .append("oldVisitorCount", getOldVisitorCount())
            .append("paymentConversionRate", getPaymentConversionRate())
            .append("newVisitorCount", getNewVisitorCount())
            .append("searchExposure", getSearchExposure())
            .append("orderedProductQuantity", getOrderedProductQuantity())
            .append("orderingBuyers", getOrderingBuyers())
            .append("averageOrderValue", getAverageOrderValue())
            .append("successfulRefundAmount", getSuccessfulRefundAmount())
            .append("tax", getTax())
            .append("productFavorites", getProductFavorites())
            .append("productAddToCart", getProductAddToCart())
            .append("visitorCount", getVisitorCount())
            .append("searchClickThroughRate", getSearchClickThroughRate())
            .append("transactionAmount", getTransactionAmount())
            .append("paidItemPrice", getPaidItemPrice())
            .append("paidMainOrders", getPaidMainOrders())
            .append("orderConversionRate", getOrderConversionRate())
            .append("orderedMainOrders", getOrderedMainOrders())
            .append("rootCategoryName", getRootCategoryName())
            .append("categoryPath", getCategoryPath())
            .append("createdTime", getCreatedTime())
            .append("storeName", getStoreName())
            .toString();
    }
}
