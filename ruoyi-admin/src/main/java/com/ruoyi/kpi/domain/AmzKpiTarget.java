package com.ruoyi.kpi.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * KPI考核项目对象 amz_kpi_target
 *
 * @author panfalin
 * @date 2025-03-24
 */
@Setter
@Getter
public class AmzKpiTarget extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 考核项ID
     */
    private Long targetId;

    /**
     * 关联的KPI ID
     */
    @Excel(name = "关联的KPI ID")
    private Long kpiId;

    /**
     * 考核人ID
     */
    @Excel(name = "考核人ID")
    private String userId;

    /**
     * 考核人姓名
     */
    @Excel(name = "考核人姓名")
    private String userName;

    /**
     * 部门
     */
    @Excel(name = "部门")
    private String department;

    /**
     * 考核类别(产品开发效能/供应商管理等)
     */
    @Excel(name = "考核类别(产品开发效能/供应商管理等)")
    private String category;

    /**
     * 类别序号
     */
    @Excel(name = "类别序号")
    private Long categoryIndex;

    /**
     * 指标名称
     */
    @Excel(name = "指标名称")
    private String metricName;

    /**
     * 当前值
     */
    @Excel(name = "当前值")
    private BigDecimal currValue;

    /**
     * 目标值
     */
    @Excel(name = "目标值")
    private BigDecimal targetValue;

    /**
     * 权重(%)
     */
    @Excel(name = "权重(%)")
    private BigDecimal weight;

    /**
     * 得分
     */
    @Excel(name = "得分")
    private BigDecimal score;

    /**
     * 计算方式
     */
    @Excel(name = "计算方式")
    private String calcType;

    /**
     * 指标解释
     */
    @Excel(name = "指标解释")
    private String indicator;

    /**
     * 评分标准
     */
    @Excel(name = "评分标准")
    private String evaluationCriteria;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("targetId", getTargetId())
                .append("kpiId", getKpiId())
                .append("userId", getUserId())
                .append("userName", getUserName())
                .append("department", getDepartment())
                .append("category", getCategory())
                .append("categoryIndex", getCategoryIndex())
                .append("metricName", getMetricName())
                .append("currValue", getCurrValue())
                .append("targetValue", getTargetValue())
                .append("weight", getWeight())
                .append("score", getScore())
                .append("calcType", getCalcType())
                .append("evaluationCriteria", getEvaluationCriteria())
                .append("remark", getRemark())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
