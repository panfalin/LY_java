package com.ruoyi.kpi.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.List;

/**
 * KPI主表对象 amz_kpi_main
 *
 * @author ruoyi
 * @date 2025-03-24
 */
public class AmzKpiMain extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * KPI ID
     */
    private Long kpiId;

    /**
     * 用户ID
     */
    @Excel(name = "用户ID")
    private String userId;

    /**
     * 用户名称
     */
    @Excel(name = "用户名称")
    private String userName;

    /**
     * 部门
     */
    @Excel(name = "部门")
    private String department;

    /**
     * 总分
     */
    @Excel(name = "总分")
    private BigDecimal totalScore;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private String status;

    /**
     * 创建人名称
     */
    @Excel(name = "创建人名称")
    private String createByName;

    /**
     * 更新人名称
     */
    @Excel(name = "更新人名称")
    private String updateByName;

    /**
     * 考核项列表
     */
    private List<AmzKpiTarget> targets;

    /**
     * 历史记录
     */
    private List<AmzKpiHistory> histories;

    public void setKpiId(Long kpiId) {
        this.kpiId = kpiId;
    }

    public Long getKpiId() {
        return kpiId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName;
    }

    public String getUpdateByName() {
        return updateByName;
    }

    public void setTargets(List<AmzKpiTarget> targets) {
        this.targets = targets;
    }

    public List<AmzKpiTarget> getTargets() {
        return targets;
    }

    public void setHistories(List<AmzKpiHistory> histories) {
        this.histories = histories;
    }

    public List<AmzKpiHistory> getHistories() {
        return histories;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("kpiId", getKpiId())
                .append("userId", getUserId())
                .append("userName", getUserName())
                .append("department", getDepartment())
                .append("totalScore", getTotalScore())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createByName", getCreateByName())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateByName", getUpdateByName())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
