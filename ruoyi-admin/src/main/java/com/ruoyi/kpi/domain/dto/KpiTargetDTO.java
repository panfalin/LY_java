package com.ruoyi.kpi.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class KpiTargetDTO {
    /**
     * 考核项名称
     */
    private String name;

    /**
     * 当前值
     */
    private BigDecimal currValue;

    /**
     * 目标值
     */
    private BigDecimal targetValue;

    /**
     * 权重
     */
    private BigDecimal weight;

    /**
     * 计算方式
     */
    private String calcType;

    /**
     * 指标解释
     */
    private String indicator;

    /**
     * 评分原则
     */
    private String evaluationCriteria;
} 