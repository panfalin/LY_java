package com.ruoyi.advertisingData.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 广告数据对象 advertising_data
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public class AdvertisingData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 时间范围 */
    @Excel(name = "时间范围")
    private String range;

    /** 数据时间段 */
    @Excel(name = "数据时间段")
    private String dataType;

    /** 商品 */
    @Excel(name = "商品")
    private String productName;

    /** SKU */
    @Excel(name = "SKU")
    private String sku;

    /** ASIN */
    @Excel(name = "ASIN")
    private String asin;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 广告活动 */
    @Excel(name = "广告活动")
    private String adCampaign;

    /** 广告组 */
    @Excel(name = "广告组")
    private String adGroup;

    /** 计费方式 */
    @Excel(name = "计费方式")
    private String billingMethod;

    /** 曝光量 */
    @Excel(name = "曝光量")
    private String impressions;

    /** 点击量 */
    @Excel(name = "点击量")
    private String clicks;

    /** 点击率（CTR） */
    @Excel(name = "点击率", readConverterExp = "C=TR")
    private String ctr;

    /** 广告花费 */
    @Excel(name = "广告花费")
    private String adCost;

    /** 单次点击成本（CPC） */
    @Excel(name = "单次点击成本", readConverterExp = "C=PC")
    private String cpc;

    /** 广告订单量 */
    @Excel(name = "广告订单量")
    private String adOrders;

    /** 直接订单量 */
    @Excel(name = "直接订单量")
    private String directOrders;

    /** 自然订单量 */
    @Excel(name = "自然订单量")
    private String organicOrders;

    /** 间接订单量 */
    @Excel(name = "间接订单量")
    private String indirectOrders;

    /** 商品总订单量 */
    @Excel(name = "商品总订单量")
    private String totalOrders;

    /** 广告销售额 */
    @Excel(name = "广告销售额")
    private String adSales;

    /** 直接销售额 */
    @Excel(name = "直接销售额")
    private String directSales;

    /** 间接销售额 */
    @Excel(name = "间接销售额")
    private String indirectSales;

    /** 转化率 */
    @Excel(name = "转化率")
    private String conversionRate;

    /** 广告ROI */
    @Excel(name = "广告ROI")
    private String adRoi;

    /** 广告投入产出比（ACOS） */
    @Excel(name = "广告投入产出比", readConverterExp = "A=COS")
    private String acos;

    /** 广告支出回报（ROAS） */
    @Excel(name = "广告支出回报", readConverterExp = "R=OAS")
    private String roas;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Long isDelete;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRange(String range) 
    {
        this.range = range;
    }

    public String getRange() 
    {
        return range;
    }
    public void setDataType(String dataType) 
    {
        this.dataType = dataType;
    }

    public String getDataType() 
    {
        return dataType;
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
    public void setAsin(String asin) 
    {
        this.asin = asin;
    }

    public String getAsin() 
    {
        return asin;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setAdCampaign(String adCampaign) 
    {
        this.adCampaign = adCampaign;
    }

    public String getAdCampaign() 
    {
        return adCampaign;
    }
    public void setAdGroup(String adGroup) 
    {
        this.adGroup = adGroup;
    }

    public String getAdGroup() 
    {
        return adGroup;
    }
    public void setBillingMethod(String billingMethod) 
    {
        this.billingMethod = billingMethod;
    }

    public String getBillingMethod() 
    {
        return billingMethod;
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
    public void setCtr(String ctr) 
    {
        this.ctr = ctr;
    }

    public String getCtr() 
    {
        return ctr;
    }
    public void setAdCost(String adCost) 
    {
        this.adCost = adCost;
    }

    public String getAdCost() 
    {
        return adCost;
    }
    public void setCpc(String cpc) 
    {
        this.cpc = cpc;
    }

    public String getCpc() 
    {
        return cpc;
    }
    public void setAdOrders(String adOrders) 
    {
        this.adOrders = adOrders;
    }

    public String getAdOrders() 
    {
        return adOrders;
    }
    public void setDirectOrders(String directOrders) 
    {
        this.directOrders = directOrders;
    }

    public String getDirectOrders() 
    {
        return directOrders;
    }
    public void setOrganicOrders(String organicOrders) 
    {
        this.organicOrders = organicOrders;
    }

    public String getOrganicOrders() 
    {
        return organicOrders;
    }
    public void setIndirectOrders(String indirectOrders) 
    {
        this.indirectOrders = indirectOrders;
    }

    public String getIndirectOrders() 
    {
        return indirectOrders;
    }
    public void setTotalOrders(String totalOrders) 
    {
        this.totalOrders = totalOrders;
    }

    public String getTotalOrders() 
    {
        return totalOrders;
    }
    public void setAdSales(String adSales) 
    {
        this.adSales = adSales;
    }

    public String getAdSales() 
    {
        return adSales;
    }
    public void setDirectSales(String directSales) 
    {
        this.directSales = directSales;
    }

    public String getDirectSales() 
    {
        return directSales;
    }
    public void setIndirectSales(String indirectSales) 
    {
        this.indirectSales = indirectSales;
    }

    public String getIndirectSales() 
    {
        return indirectSales;
    }
    public void setConversionRate(String conversionRate) 
    {
        this.conversionRate = conversionRate;
    }

    public String getConversionRate() 
    {
        return conversionRate;
    }
    public void setAdRoi(String adRoi) 
    {
        this.adRoi = adRoi;
    }

    public String getAdRoi() 
    {
        return adRoi;
    }
    public void setAcos(String acos) 
    {
        this.acos = acos;
    }

    public String getAcos() 
    {
        return acos;
    }
    public void setRoas(String roas) 
    {
        this.roas = roas;
    }

    public String getRoas() 
    {
        return roas;
    }
    public void setIsDelete(Long isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Long getIsDelete() 
    {
        return isDelete;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("range", getRange())
            .append("dataType", getDataType())
            .append("productName", getProductName())
            .append("sku", getSku())
            .append("asin", getAsin())
            .append("status", getStatus())
            .append("type", getType())
            .append("adCampaign", getAdCampaign())
            .append("adGroup", getAdGroup())
            .append("billingMethod", getBillingMethod())
            .append("impressions", getImpressions())
            .append("clicks", getClicks())
            .append("ctr", getCtr())
            .append("adCost", getAdCost())
            .append("cpc", getCpc())
            .append("adOrders", getAdOrders())
            .append("directOrders", getDirectOrders())
            .append("organicOrders", getOrganicOrders())
            .append("indirectOrders", getIndirectOrders())
            .append("totalOrders", getTotalOrders())
            .append("adSales", getAdSales())
            .append("directSales", getDirectSales())
            .append("indirectSales", getIndirectSales())
            .append("conversionRate", getConversionRate())
            .append("adRoi", getAdRoi())
            .append("acos", getAcos())
            .append("roas", getRoas())
            .append("isDelete", getIsDelete())
            .append("createdAt", getCreatedAt())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
