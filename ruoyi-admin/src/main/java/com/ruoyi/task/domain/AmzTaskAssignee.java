package com.ruoyi.task.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 亚马逊任务指派对象 amz_task_assignee
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Setter
@Getter
public class AmzTaskAssignee extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 指派ID
     */
    private Long assigneeId;

    /**
     * 任务ID
     */
    @Excel(name = "任务ID")
    private Long taskId;

    /**
     * 店铺名称
     */
    @Excel(name = "店铺名称")
    private String storeName;

    /**
     * SKU编号
     */
    @Excel(name = "SKU编号")
    private String sku;

    /**
     * 用户ID
     */
    @Excel(name = "用户ID")
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 部门ID
     */
    @Excel(name = "部门ID")
    private Long deptId;

    /**
     * 角色类型(leader/manager/operator)
     */
    @Excel(name = "角色类型(leader/manager/operator)")
    private String roleType;

    /**
     * 是否负责人
     */
    @Excel(name = "是否负责人")
    private Integer isLeader;

    /**
     * 指派类型(direct/inherit/auto)
     */
    @Excel(name = "指派类型(direct/inherit/auto)")
    private String assignType;

    /**
     * 权限类型(view/edit/admin)
     */
    @Excel(name = "权限类型(view/edit/admin)")
    private String permissionType;

    /**
     * 生效时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生效时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /**
     * 状态(active/inactive)
     */
    @Excel(name = "状态(active/inactive)")
    private String status;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("assigneeId", getAssigneeId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("sku", getSku())
                .append("userId", getUserId())
                .append("deptId", getDeptId())
                .append("roleType", getRoleType())
                .append("isLeader", getIsLeader())
                .append("assignType", getAssignType())
                .append("permissionType", getPermissionType())
                .append("startTime", getStartTime())
                .append("endTime", getEndTime())
                .append("status", getStatus())
                .append("remark", getRemark())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
