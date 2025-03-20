package com.ruoyi.task.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SubTargetVO {
    private String targetName;
    private String targetLevel;
    private BigDecimal targetValue;
    private BigDecimal currentValue;
    private Double progress;
}
