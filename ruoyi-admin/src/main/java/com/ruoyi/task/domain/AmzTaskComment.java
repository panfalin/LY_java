package com.ruoyi.task.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 亚马逊任务评论对象 amz_task_comment
 *
 * @author panfalin
 * @date 2025-03-19
 */
public class AmzTaskComment extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 评论ID
     */
    private Long commentId;

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
     * 评论内容
     */
    @Excel(name = "评论内容")
    private String commentContent;

    /**
     * 父评论ID
     */
    @Excel(name = "父评论ID")
    private Long parentId;

    /**
     * @提及的用户
     */
    @Excel(name = "@提及的用户")
    private String mentionUsers;

    /**
     * 是否重要
     */
    @Excel(name = "是否重要")
    private Integer isImportant;

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setMentionUsers(String mentionUsers) {
        this.mentionUsers = mentionUsers;
    }

    public String getMentionUsers() {
        return mentionUsers;
    }

    public void setIsImportant(Integer isImportant) {
        this.isImportant = isImportant;
    }

    public Integer getIsImportant() {
        return isImportant;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("commentId", getCommentId())
                .append("taskId", getTaskId())
                .append("storeName", getStoreName())
                .append("sku", getSku())
                .append("userId", getUserId())
                .append("commentContent", getCommentContent())
                .append("parentId", getParentId())
                .append("mentionUsers", getMentionUsers())
                .append("isImportant", getIsImportant())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
