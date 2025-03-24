package com.ruoyi.kpi.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * KPI历史得分对象 amz_kpi_history
 *
 * @author panfalin
 * @date 2025-03-24
 */
public class AmzKpiHistory extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 历史ID
     */
    private Long historyId;

    /**
     * 关联的KPI ID
     */
    @Excel(name = "关联的KPI ID")
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
     * 考核年月(YYYY-MM)
     */
    @Excel(name = "考核年月(YYYY-MM)")
    private String assessMonth;

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

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public Long getHistoryId() {
        return historyId;
    }

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

    public void setAssessMonth(String assessMonth) {
        this.assessMonth = assessMonth;
    }

    public String getAssessMonth() {
        return assessMonth;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("historyId", getHistoryId())
                .append("kpiId", getKpiId())
                .append("userId", getUserId())
                .append("userName", getUserName())
                .append("assessMonth", getAssessMonth())
                .append("totalScore", getTotalScore())
                .append("status", getStatus())
                .append("createTime", getCreateTime())
                .toString();
    }
}
