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
     * 评分原则
     */
    private String evaluationCriteria;
} 