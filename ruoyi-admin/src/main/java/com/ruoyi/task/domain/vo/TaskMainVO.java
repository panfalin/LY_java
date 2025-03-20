package com.ruoyi.task.domain.vo;

import com.ruoyi.task.domain.AmzTaskMain;
import lombok.Data;

import java.util.List;

@Data
public class TaskMainVO extends AmzTaskMain {

    // 计算字段
    private Integer remainingDays;      // 剩余天数
    private String finishTime;          // 完成时间展示
    private Integer notifyCount;        // 通知数量

    // 团队成员
    private List<AssigneeVO> assignees;

    // 子目标完成情况
    private List<SubTargetVO> completedTargets;

    // 通知列表
    private List<NotificationVO> notifications;
}

