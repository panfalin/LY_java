package com.ruoyi.kpi.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class KpiSettingDTO {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 部门
     */
    private String department;

    /**
     * 考核项列表
     */
    private List<KpiTargetDTO> targets;
    
    /**
     * 是否覆盖已有考核项
     */
    private Boolean overwrite;
}
