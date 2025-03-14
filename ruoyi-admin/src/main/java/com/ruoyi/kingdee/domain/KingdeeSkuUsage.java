package com.ruoyi.kingdee.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物料使用记录对象 kingdee_sku_usage
 * 
 * @author panfalin
 * @date 2025-03-14
 */
public class KingdeeSkuUsage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品编码 */
    @Excel(name = "商品编码")
    private String skuCode;

    /** 使用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "使用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date usageDate;

    /** 生产任务单单号 */
    @Excel(name = "生产任务单单号")
    private String billno;

    /** BOM单编号 */
    @Excel(name = "BOM单编号")
    private String bomIdNumber;

    /** 使用数量 */
    @Excel(name = "使用数量")
    private BigDecimal usageAmount;

    /** 物料使用情况 */
    @Excel(name = "物料使用情况")
    private String status;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    public void setSkuCode(String skuCode) 
    {
        this.skuCode = skuCode;
    }

    public String getSkuCode() 
    {
        return skuCode;
    }
    public void setUsageDate(Date usageDate) 
    {
        this.usageDate = usageDate;
    }

    public Date getUsageDate() 
    {
        return usageDate;
    }
    public void setBillno(String billno) 
    {
        this.billno = billno;
    }

    public String getBillno() 
    {
        return billno;
    }
    public void setBomIdNumber(String bomIdNumber) 
    {
        this.bomIdNumber = bomIdNumber;
    }

    public String getBomIdNumber() 
    {
        return bomIdNumber;
    }
    public void setUsageAmount(BigDecimal usageAmount) 
    {
        this.usageAmount = usageAmount;
    }

    public BigDecimal getUsageAmount() 
    {
        return usageAmount;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("skuCode", getSkuCode())
            .append("usageDate", getUsageDate())
            .append("billno", getBillno())
            .append("bomIdNumber", getBomIdNumber())
            .append("usageAmount", getUsageAmount())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
