package com.ruoyi.task.domain.vo;

import lombok.Data;

@Data
public class AssigneeVO {
    private Long userId;
    private String userName;
    private String roleType;
    private String avatar;
    private Boolean isLeader;
}
