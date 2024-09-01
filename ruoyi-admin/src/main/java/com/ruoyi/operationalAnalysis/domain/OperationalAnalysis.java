package com.ruoyi.operationalAnalysis.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 运营分析对象 operational_analysis
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public class OperationalAnalysis extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 数据时间段 */
    @Excel(name = "数据时间段")
    private String type;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** SKU */
    @Excel(name = "SKU")
    private String sku;

    /** 平均销售单价 */
    @Excel(name = "平均销售单价")
    private String avgSalesPrice;

    /** 销量 */
    @Excel(name = "销量")
    private String sales;

    /** 订单量 */
    @Excel(name = "订单量")
    private String orderCount;

    /** 多渠道数量 */
    @Excel(name = "多渠道数量")
    private String multiChannelQuantity;

    /** 销售额 */
    @Excel(name = "销售额")
    private String salesAmount;

    /** 大类目Rank */
    @Excel(name = "大类目Rank")
    private String categoryRankLarge;

    /** 小类目Rank */
    @Excel(name = "小类目Rank")
    private String categoryRankSmall;

    /** 页面浏览次数-合计 */
    @Excel(name = "页面浏览次数-合计")
    private String pageViewsTotal;

    /** 页面浏览次数百分比-合计 */
    @Excel(name = "页面浏览次数百分比-合计")
    private String pageViewsPercentageTotal;

    /** 退款量 */
    @Excel(name = "退款量")
    private String refundCount;

    /** 退款金额 */
    @Excel(name = "退款金额")
    private String refundAmount;

    /** 退款率 */
    @Excel(name = "退款率")
    private String refundRate;

    /** 广告花费 */
    @Excel(name = "广告花费")
    private String adSpend;

    /** 花费占比 */
    @Excel(name = "花费占比")
    private String spendPercentage;

    /** 曝光量 */
    @Excel(name = "曝光量")
    private String impressions;

    /** 点击量 */
    @Excel(name = "点击量")
    private String clicks;

    /** 点击率（CTR） */
    @Excel(name = "点击率", readConverterExp = "C=TR")
    private String clickThroughRate;

    /** 广告订单量 */
    @Excel(name = "广告订单量")
    private String adOrderCount;

    /** 广告订单占比 */
    @Excel(name = "广告订单占比")
    private String adOrderPercentage;

    /** 转化率 */
    @Excel(name = "转化率")
    private String conversionRate;

    /** 广告销售额 */
    @Excel(name = "广告销售额")
    private String adSalesAmount;

    /** 单次点击成本（CPC） */
    @Excel(name = "单次点击成本", readConverterExp = "C=PC")
    private String costPerClick;

    /** 广告投入产出比（ACOS） */
    @Excel(name = "广告投入产出比", readConverterExp = "A=COS")
    private String adAcos;

    /** 可售库存 */
    @Excel(name = "可售库存")
    private String availableInventory;

    /** 可售天数 */
    @Excel(name = "可售天数")
    private String availableDays;

    /** 预留库存 */
    @Excel(name = "预留库存")
    private String reservedInventory;

    /** 总收入 */
    @Excel(name = "总收入")
    private String totalRevenue;

    /** 总支出 */
    @Excel(name = "总支出")
    private String totalExpenditure;

    /** 毛利润 */
    @Excel(name = "毛利润")
    private String grossProfit;

    /** 毛利率 */
    @Excel(name = "毛利率")
    private String grossMargin;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isDelete;

    /** 记录当天有没有新增过记录 */
    @Excel(name = "记录当天有没有新增过记录")
    private Long version;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setAvgSalesPrice(String avgSalesPrice) 
    {
        this.avgSalesPrice = avgSalesPrice;
    }

    public String getAvgSalesPrice() 
    {
        return avgSalesPrice;
    }
    public void setSales(String sales) 
    {
        this.sales = sales;
    }

    public String getSales() 
    {
        return sales;
    }
    public void setOrderCount(String orderCount) 
    {
        this.orderCount = orderCount;
    }

    public String getOrderCount() 
    {
        return orderCount;
    }
    public void setMultiChannelQuantity(String multiChannelQuantity) 
    {
        this.multiChannelQuantity = multiChannelQuantity;
    }

    public String getMultiChannelQuantity() 
    {
        return multiChannelQuantity;
    }
    public void setSalesAmount(String salesAmount) 
    {
        this.salesAmount = salesAmount;
    }

    public String getSalesAmount() 
    {
        return salesAmount;
    }
    public void setCategoryRankLarge(String categoryRankLarge) 
    {
        this.categoryRankLarge = categoryRankLarge;
    }

    public String getCategoryRankLarge() 
    {
        return categoryRankLarge;
    }
    public void setCategoryRankSmall(String categoryRankSmall) 
    {
        this.categoryRankSmall = categoryRankSmall;
    }

    public String getCategoryRankSmall() 
    {
        return categoryRankSmall;
    }
    public void setPageViewsTotal(String pageViewsTotal) 
    {
        this.pageViewsTotal = pageViewsTotal;
    }

    public String getPageViewsTotal() 
    {
        return pageViewsTotal;
    }
    public void setPageViewsPercentageTotal(String pageViewsPercentageTotal) 
    {
        this.pageViewsPercentageTotal = pageViewsPercentageTotal;
    }

    public String getPageViewsPercentageTotal() 
    {
        return pageViewsPercentageTotal;
    }
    public void setRefundCount(String refundCount) 
    {
        this.refundCount = refundCount;
    }

    public String getRefundCount() 
    {
        return refundCount;
    }
    public void setRefundAmount(String refundAmount) 
    {
        this.refundAmount = refundAmount;
    }

    public String getRefundAmount() 
    {
        return refundAmount;
    }
    public void setRefundRate(String refundRate) 
    {
        this.refundRate = refundRate;
    }

    public String getRefundRate() 
    {
        return refundRate;
    }
    public void setAdSpend(String adSpend) 
    {
        this.adSpend = adSpend;
    }

    public String getAdSpend() 
    {
        return adSpend;
    }
    public void setSpendPercentage(String spendPercentage) 
    {
        this.spendPercentage = spendPercentage;
    }

    public String getSpendPercentage() 
    {
        return spendPercentage;
    }
    public void setImpressions(String impressions) 
    {
        this.impressions = impressions;
    }

    public String getImpressions() 
    {
        return impressions;
    }
    public void setClicks(String clicks) 
    {
        this.clicks = clicks;
    }

    public String getClicks() 
    {
        return clicks;
    }
    public void setClickThroughRate(String clickThroughRate) 
    {
        this.clickThroughRate = clickThroughRate;
    }

    public String getClickThroughRate() 
    {
        return clickThroughRate;
    }
    public void setAdOrderCount(String adOrderCount) 
    {
        this.adOrderCount = adOrderCount;
    }

    public String getAdOrderCount() 
    {
        return adOrderCount;
    }
    public void setAdOrderPercentage(String adOrderPercentage) 
    {
        this.adOrderPercentage = adOrderPercentage;
    }

    public String getAdOrderPercentage() 
    {
        return adOrderPercentage;
    }
    public void setConversionRate(String conversionRate) 
    {
        this.conversionRate = conversionRate;
    }

    public String getConversionRate() 
    {
        return conversionRate;
    }
    public void setAdSalesAmount(String adSalesAmount) 
    {
        this.adSalesAmount = adSalesAmount;
    }

    public String getAdSalesAmount() 
    {
        return adSalesAmount;
    }
    public void setCostPerClick(String costPerClick) 
    {
        this.costPerClick = costPerClick;
    }

    public String getCostPerClick() 
    {
        return costPerClick;
    }
    public void setAdAcos(String adAcos) 
    {
        this.adAcos = adAcos;
    }

    public String getAdAcos() 
    {
        return adAcos;
    }
    public void setAvailableInventory(String availableInventory) 
    {
        this.availableInventory = availableInventory;
    }

    public String getAvailableInventory() 
    {
        return availableInventory;
    }
    public void setAvailableDays(String availableDays) 
    {
        this.availableDays = availableDays;
    }

    public String getAvailableDays() 
    {
        return availableDays;
    }
    public void setReservedInventory(String reservedInventory) 
    {
        this.reservedInventory = reservedInventory;
    }

    public String getReservedInventory() 
    {
        return reservedInventory;
    }
    public void setTotalRevenue(String totalRevenue) 
    {
        this.totalRevenue = totalRevenue;
    }

    public String getTotalRevenue() 
    {
        return totalRevenue;
    }
    public void setTotalExpenditure(String totalExpenditure) 
    {
        this.totalExpenditure = totalExpenditure;
    }

    public String getTotalExpenditure() 
    {
        return totalExpenditure;
    }
    public void setGrossProfit(String grossProfit) 
    {
        this.grossProfit = grossProfit;
    }

    public String getGrossProfit() 
    {
        return grossProfit;
    }
    public void setGrossMargin(String grossMargin) 
    {
        this.grossMargin = grossMargin;
    }

    public String getGrossMargin() 
    {
        return grossMargin;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }
    public void setVersion(Long version) 
    {
        this.version = version;
    }

    public Long getVersion() 
    {
        return version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("productName", getProductName())
            .append("sku", getSku())
            .append("avgSalesPrice", getAvgSalesPrice())
            .append("sales", getSales())
            .append("orderCount", getOrderCount())
            .append("multiChannelQuantity", getMultiChannelQuantity())
            .append("salesAmount", getSalesAmount())
            .append("categoryRankLarge", getCategoryRankLarge())
            .append("categoryRankSmall", getCategoryRankSmall())
            .append("pageViewsTotal", getPageViewsTotal())
            .append("pageViewsPercentageTotal", getPageViewsPercentageTotal())
            .append("refundCount", getRefundCount())
            .append("refundAmount", getRefundAmount())
            .append("refundRate", getRefundRate())
            .append("adSpend", getAdSpend())
            .append("spendPercentage", getSpendPercentage())
            .append("impressions", getImpressions())
            .append("clicks", getClicks())
            .append("clickThroughRate", getClickThroughRate())
            .append("adOrderCount", getAdOrderCount())
            .append("adOrderPercentage", getAdOrderPercentage())
            .append("conversionRate", getConversionRate())
            .append("adSalesAmount", getAdSalesAmount())
            .append("costPerClick", getCostPerClick())
            .append("adAcos", getAdAcos())
            .append("availableInventory", getAvailableInventory())
            .append("availableDays", getAvailableDays())
            .append("reservedInventory", getReservedInventory())
            .append("totalRevenue", getTotalRevenue())
            .append("totalExpenditure", getTotalExpenditure())
            .append("grossProfit", getGrossProfit())
            .append("grossMargin", getGrossMargin())
            .append("createdAt", getCreatedAt())
            .append("isDelete", getIsDelete())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("version", getVersion())
            .toString();
    }
}
