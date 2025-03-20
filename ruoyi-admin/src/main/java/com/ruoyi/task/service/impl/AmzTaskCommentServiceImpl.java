package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskComment;
import com.ruoyi.task.mapper.AmzTaskCommentMapper;
import com.ruoyi.task.service.IAmzTaskCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务评论Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskCommentServiceImpl implements IAmzTaskCommentService {
    @Autowired
    private AmzTaskCommentMapper amzTaskCommentMapper;

    /**
     * 查询亚马逊任务评论
     *
     * @param commentId 亚马逊任务评论主键
     * @return 亚马逊任务评论
     */
    @Override
    public AmzTaskComment selectAmzTaskCommentByCommentId(Long commentId) {
        return amzTaskCommentMapper.selectAmzTaskCommentByCommentId(commentId);
    }

    /**
     * 查询亚马逊任务评论列表
     *
     * @param amzTaskComment 亚马逊任务评论
     * @return 亚马逊任务评论
     */
    @Override
    public List<AmzTaskComment> selectAmzTaskCommentList(AmzTaskComment amzTaskComment) {
        return amzTaskCommentMapper.selectAmzTaskCommentList(amzTaskComment);
    }

    /**
     * 新增亚马逊任务评论
     *
     * @param amzTaskComment 亚马逊任务评论
     * @return 结果
     */
    @Override
    public int insertAmzTaskComment(AmzTaskComment amzTaskComment) {
        amzTaskComment.setCreateTime(DateUtils.getNowDate());
        return amzTaskCommentMapper.insertAmzTaskComment(amzTaskComment);
    }

    /**
     * 修改亚马逊任务评论
     *
     * @param amzTaskComment 亚马逊任务评论
     * @return 结果
     */
    @Override
    public int updateAmzTaskComment(AmzTaskComment amzTaskComment) {
        amzTaskComment.setUpdateTime(DateUtils.getNowDate());
        return amzTaskCommentMapper.updateAmzTaskComment(amzTaskComment);
    }

    /**
     * 批量删除亚马逊任务评论
     *
     * @param commentIds 需要删除的亚马逊任务评论主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskCommentByCommentIds(Long[] commentIds) {
        return amzTaskCommentMapper.deleteAmzTaskCommentByCommentIds(commentIds);
    }

    /**
     * 删除亚马逊任务评论信息
     *
     * @param commentId 亚马逊任务评论主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskCommentByCommentId(Long commentId) {
        return amzTaskCommentMapper.deleteAmzTaskCommentByCommentId(commentId);
    }
}
