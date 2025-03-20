package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskComment;

import java.util.List;

/**
 * 亚马逊任务评论Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskCommentService {
    /**
     * 查询亚马逊任务评论
     *
     * @param commentId 亚马逊任务评论主键
     * @return 亚马逊任务评论
     */
    public AmzTaskComment selectAmzTaskCommentByCommentId(Long commentId);

    /**
     * 查询亚马逊任务评论列表
     *
     * @param amzTaskComment 亚马逊任务评论
     * @return 亚马逊任务评论集合
     */
    public List<AmzTaskComment> selectAmzTaskCommentList(AmzTaskComment amzTaskComment);

    /**
     * 新增亚马逊任务评论
     *
     * @param amzTaskComment 亚马逊任务评论
     * @return 结果
     */
    public int insertAmzTaskComment(AmzTaskComment amzTaskComment);

    /**
     * 修改亚马逊任务评论
     *
     * @param amzTaskComment 亚马逊任务评论
     * @return 结果
     */
    public int updateAmzTaskComment(AmzTaskComment amzTaskComment);

    /**
     * 批量删除亚马逊任务评论
     *
     * @param commentIds 需要删除的亚马逊任务评论主键集合
     * @return 结果
     */
    public int deleteAmzTaskCommentByCommentIds(Long[] commentIds);

    /**
     * 删除亚马逊任务评论信息
     *
     * @param commentId 亚马逊任务评论主键
     * @return 结果
     */
    public int deleteAmzTaskCommentByCommentId(Long commentId);
}
