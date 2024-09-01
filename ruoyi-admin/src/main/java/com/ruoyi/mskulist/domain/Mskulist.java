package com.ruoyi.mskulist.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * mskulist对象 mskulist
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
public class Mskulist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** MSKU */
    @Excel(name = "MSKU")
    private String msku;

    /** 商品一级目录 */
    @Excel(name = "商品一级目录")
    private String categoryLevel1;

    /** 商品二级目录 */
    @Excel(name = "商品二级目录")
    private String categoryLevel2;

    /** FNSKU */
    @Excel(name = "FNSKU")
    private String fnsku;

    /** 本地SKU */
    @Excel(name = "本地SKU")
    private String localSku;

    /** 主SKU */
    @Excel(name = "主SKU")
    private String mainSku;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** ASIN */
    @Excel(name = "ASIN")
    private String asin;

    /** 库存状态 */
    @Excel(name = "库存状态")
    private String stockStatus;

    /** 7天销量 */
    @Excel(name = "7天销量")
    private String sales7Days;

    /** 14天销量 */
    @Excel(name = "14天销量")
    private String sales14Days;

    /** 30天销量 */
    @Excel(name = "30天销量")
    private String sales30Days;

    /** 90天销量 */
    @Excel(name = "90天销量")
    private String sales90Days;

    /** 日均销量 */
    @Excel(name = "日均销量")
    private String avgDailySales;

    /** 采购在途 */
    @Excel(name = "采购在途")
    private String procurementInTransit;

    /** 本地库存 */
    @Excel(name = "本地库存")
    private String localInventory;

    /** 可售 */
    @Excel(name = "可售")
    private String available;

    /** 待入库 */
    @Excel(name = "待入库")
    private String awaitingStock;

    /** 在途 */
    @Excel(name = "在途")
    private String inTransit;

    /** 可售天数 */
    @Excel(name = "可售天数")
    private String availableDays;

    /** 采购天数 */
    @Excel(name = "采购天数")
    private String procurementDays;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 预留 */
    @Excel(name = "预留")
    private String reserved;

    /** 计划入库 */
    @Excel(name = "计划入库")
    private String plannedStockIn;

    /** 销售员 */
    @Excel(name = "销售员")
    private String salesPerson;

    /** 上架时间 */
    @Excel(name = "上架时间")
    private String listingDate;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isDelete;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

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
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }
    public void setMsku(String msku) 
    {
        this.msku = msku;
    }

    public String getMsku() 
    {
        return msku;
    }
    public void setCategoryLevel1(String categoryLevel1) 
    {
        this.categoryLevel1 = categoryLevel1;
    }

    public String getCategoryLevel1() 
    {
        return categoryLevel1;
    }
    public void setCategoryLevel2(String categoryLevel2) 
    {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getCategoryLevel2() 
    {
        return categoryLevel2;
    }
    public void setFnsku(String fnsku) 
    {
        this.fnsku = fnsku;
    }

    public String getFnsku() 
    {
        return fnsku;
    }
    public void setLocalSku(String localSku) 
    {
        this.localSku = localSku;
    }

    public String getLocalSku() 
    {
        return localSku;
    }
    public void setMainSku(String mainSku) 
    {
        this.mainSku = mainSku;
    }

    public String getMainSku() 
    {
        return mainSku;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setAsin(String asin) 
    {
        this.asin = asin;
    }

    public String getAsin() 
    {
        return asin;
    }
    public void setStockStatus(String stockStatus) 
    {
        this.stockStatus = stockStatus;
    }

    public String getStockStatus() 
    {
        return stockStatus;
    }
    public void setSales7Days(String sales7Days) 
    {
        this.sales7Days = sales7Days;
    }

    public String getSales7Days() 
    {
        return sales7Days;
    }
    public void setSales14Days(String sales14Days) 
    {
        this.sales14Days = sales14Days;
    }

    public String getSales14Days() 
    {
        return sales14Days;
    }
    public void setSales30Days(String sales30Days) 
    {
        this.sales30Days = sales30Days;
    }

    public String getSales30Days() 
    {
        return sales30Days;
    }
    public void setSales90Days(String sales90Days) 
    {
        this.sales90Days = sales90Days;
    }

    public String getSales90Days() 
    {
        return sales90Days;
    }
    public void setAvgDailySales(String avgDailySales) 
    {
        this.avgDailySales = avgDailySales;
    }

    public String getAvgDailySales() 
    {
        return avgDailySales;
    }
    public void setProcurementInTransit(String procurementInTransit) 
    {
        this.procurementInTransit = procurementInTransit;
    }

    public String getProcurementInTransit() 
    {
        return procurementInTransit;
    }
    public void setLocalInventory(String localInventory) 
    {
        this.localInventory = localInventory;
    }

    public String getLocalInventory() 
    {
        return localInventory;
    }
    public void setAvailable(String available) 
    {
        this.available = available;
    }

    public String getAvailable() 
    {
        return available;
    }
    public void setAwaitingStock(String awaitingStock) 
    {
        this.awaitingStock = awaitingStock;
    }

    public String getAwaitingStock() 
    {
        return awaitingStock;
    }
    public void setInTransit(String inTransit) 
    {
        this.inTransit = inTransit;
    }

    public String getInTransit() 
    {
        return inTransit;
    }
    public void setAvailableDays(String availableDays) 
    {
        this.availableDays = availableDays;
    }

    public String getAvailableDays() 
    {
        return availableDays;
    }
    public void setProcurementDays(String procurementDays) 
    {
        this.procurementDays = procurementDays;
    }

    public String getProcurementDays() 
    {
        return procurementDays;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setReserved(String reserved) 
    {
        this.reserved = reserved;
    }

    public String getReserved() 
    {
        return reserved;
    }
    public void setPlannedStockIn(String plannedStockIn) 
    {
        this.plannedStockIn = plannedStockIn;
    }

    public String getPlannedStockIn() 
    {
        return plannedStockIn;
    }
    public void setSalesPerson(String salesPerson) 
    {
        this.salesPerson = salesPerson;
    }

    public String getSalesPerson() 
    {
        return salesPerson;
    }
    public void setListingDate(String listingDate) 
    {
        this.listingDate = listingDate;
    }

    public String getListingDate() 
    {
        return listingDate;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
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
            .append("storeName", getStoreName())
            .append("msku", getMsku())
            .append("categoryLevel1", getCategoryLevel1())
            .append("categoryLevel2", getCategoryLevel2())
            .append("fnsku", getFnsku())
            .append("localSku", getLocalSku())
            .append("mainSku", getMainSku())
            .append("productName", getProductName())
            .append("asin", getAsin())
            .append("stockStatus", getStockStatus())
            .append("sales7Days", getSales7Days())
            .append("sales14Days", getSales14Days())
            .append("sales30Days", getSales30Days())
            .append("sales90Days", getSales90Days())
            .append("avgDailySales", getAvgDailySales())
            .append("procurementInTransit", getProcurementInTransit())
            .append("localInventory", getLocalInventory())
            .append("available", getAvailable())
            .append("awaitingStock", getAwaitingStock())
            .append("inTransit", getInTransit())
            .append("availableDays", getAvailableDays())
            .append("procurementDays", getProcurementDays())
            .append("remarks", getRemarks())
            .append("reserved", getReserved())
            .append("plannedStockIn", getPlannedStockIn())
            .append("salesPerson", getSalesPerson())
            .append("listingDate", getListingDate())
            .append("isDelete", getIsDelete())
            .append("createdAt", getCreatedAt())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("version", getVersion())
            .toString();
    }
}
