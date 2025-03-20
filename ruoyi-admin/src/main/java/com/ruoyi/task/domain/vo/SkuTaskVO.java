package com.ruoyi.task.domain.vo;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.task.domain.AmzTaskMain;
import lombok.Data;

import java.util.List;

@Data
public class SkuTaskVO {
    @Excel(name = "店铺名称")
    private String storeName;

    @Excel(name = "SKU")
    private String sku;

    @Excel(name = "ASIN")
    private String asin;

    @Excel(name = "产品名称")
    private String productName;

    @Excel(name = "市场ID")
    private String marketplaceId;

    @Excel(name = "任务总数")
    private Integer taskCount;

    @Excel(name = "进行中任务")
    private Integer runningCount;

    @Excel(name = "已完成任务")
    private Integer completedCount;

    // 任务列表
    private List<TaskMainVO> tasks;
}