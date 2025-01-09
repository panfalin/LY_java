package com.ruoyi.aliexpress.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 店长运营对象 operation_store_manager
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
public class OperationStoreManager extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long sId;

    /** 运营ID */
    @Excel(name = "运营ID")
    private String operatingId;

    /** 检查内容 */
    @Excel(name = "检查内容")
    private String checkContent;

    /** 具体操作内容 */
    @Excel(name = "具体操作内容")
    private String operationContent;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 分析 */
    @Excel(name = "分析")
    private String analyze;

    /** 结果 */
    @Excel(name = "结果")
    private String result;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String shopName;

    public void setsId(Long sId) 
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }
    public void setOperatingId(String operatingId) 
    {
        this.operatingId = operatingId;
    }

    public String getOperatingId() 
    {
        return operatingId;
    }
    public void setCheckContent(String checkContent) 
    {
        this.checkContent = checkContent;
    }

    public String getCheckContent() 
    {
        return checkContent;
    }
    public void setOperationContent(String operationContent) 
    {
        this.operationContent = operationContent;
    }

    public String getOperationContent() 
    {
        return operationContent;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setAnalyze(String analyze) 
    {
        this.analyze = analyze;
    }

    public String getAnalyze() 
    {
        return analyze;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("operatingId", getOperatingId())
            .append("checkContent", getCheckContent())
            .append("operationContent", getOperationContent())
            .append("date", getDate())
            .append("analyze", getAnalyze())
            .append("result", getResult())
            .append("shopName", getShopName())
            .append("createTime", getCreateTime())
            .toString();
    }
}
