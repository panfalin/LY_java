package com.ruoyi.kpi.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * KPI指标定义对象 amz_kpi_metrics
 * 
 * @author panfalin
 * @date 2025-03-25
 */
public class AmzKpiMetrics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 指标ID */
    private Long metricId;

    /** 指标名称 */
    @Excel(name = "指标名称")
    private String metricName;

    /** 指标代码 */
    @Excel(name = "指标代码")
    private String metricCode;

    /** 指标解释 */
    @Excel(name = "指标解释")
    private String indicator;

    /** 评分原则 */
    @Excel(name = "评分原则")
    private String evaluationCriteria;

    /** 所属部门(standard/nonStandard/nonStandardDev/standardParts/design) */
    @Excel(name = "所属部门(standard/nonStandard/nonStandardDev/standardParts/design)")
    private String department;

    /** 默认权重 */
    @Excel(name = "默认权重")
    private BigDecimal defaultWeight;

    /** 计算类型(自动计算/自定义输入) */
    @Excel(name = "计算类型(自动计算/自定义输入)")
    private String calcType;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Integer status;

    public void setMetricId(Long metricId) 
    {
        this.metricId = metricId;
    }

    public Long getMetricId() 
    {
        return metricId;
    }
    public void setMetricName(String metricName) 
    {
        this.metricName = metricName;
    }

    public String getMetricName() 
    {
        return metricName;
    }
    public void setMetricCode(String metricCode) 
    {
        this.metricCode = metricCode;
    }

    public String getMetricCode() 
    {
        return metricCode;
    }
    public void setIndicator(String indicator) 
    {
        this.indicator = indicator;
    }

    public String getIndicator() 
    {
        return indicator;
    }
    public void setEvaluationCriteria(String evaluationCriteria) 
    {
        this.evaluationCriteria = evaluationCriteria;
    }

    public String getEvaluationCriteria() 
    {
        return evaluationCriteria;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setDefaultWeight(BigDecimal defaultWeight) 
    {
        this.defaultWeight = defaultWeight;
    }

    public BigDecimal getDefaultWeight() 
    {
        return defaultWeight;
    }
    public void setCalcType(String calcType) 
    {
        this.calcType = calcType;
    }

    public String getCalcType() 
    {
        return calcType;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("metricId", getMetricId())
            .append("metricName", getMetricName())
            .append("metricCode", getMetricCode())
            .append("indicator", getIndicator())
            .append("evaluationCriteria", getEvaluationCriteria())
            .append("department", getDepartment())
            .append("defaultWeight", getDefaultWeight())
            .append("calcType", getCalcType())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
