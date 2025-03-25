package com.ruoyi.kpi.domain.dto;

import com.ruoyi.common.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class KpiExportDTO {
    @Excel(name = "序号", cellType = Excel.ColumnType.NUMERIC, width = 10)
    private Integer index;

    @Excel(name = "项目", width = 20)
    private String metricName;

    @Excel(name = "考核指标", width = 30)
    private String evaluationCriteria;

    @Excel(name = "占比(%)", cellType = Excel.ColumnType.NUMERIC, width = 10)
    private BigDecimal weight;

    @Excel(name = "指标说明", width = 30)
    private String description;

    @Excel(name = "考核标准", width = 20)
    private String calcType;

    @Excel(name = "得分", cellType = Excel.ColumnType.NUMERIC, width = 10)
    private BigDecimal score;

    // 非导出字段，用于存储额外数据
    private String lastMonthValue;  // 上月GMV日均
    private String currentMonthTarget;  // 本月目标日均
    private String currentValue;  // 当前日均
    private String completionRate;  // 完成度
} 