package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskProgress;
import com.ruoyi.task.mapper.AmzTaskProgressMapper;
import com.ruoyi.task.service.IAmzTaskProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务进度记录Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskProgressServiceImpl implements IAmzTaskProgressService {
    @Autowired
    private AmzTaskProgressMapper amzTaskProgressMapper;

    /**
     * 查询亚马逊任务进度记录
     *
     * @param progressId 亚马逊任务进度记录主键
     * @return 亚马逊任务进度记录
     */
    @Override
    public AmzTaskProgress selectAmzTaskProgressByProgressId(Long progressId) {
        return amzTaskProgressMapper.selectAmzTaskProgressByProgressId(progressId);
    }

    /**
     * 查询亚马逊任务进度记录列表
     *
     * @param amzTaskProgress 亚马逊任务进度记录
     * @return 亚马逊任务进度记录
     */
    @Override
    public List<AmzTaskProgress> selectAmzTaskProgressList(AmzTaskProgress amzTaskProgress) {
        return amzTaskProgressMapper.selectAmzTaskProgressList(amzTaskProgress);
    }

    /**
     * 新增亚马逊任务进度记录
     *
     * @param amzTaskProgress 亚马逊任务进度记录
     * @return 结果
     */
    @Override
    public int insertAmzTaskProgress(AmzTaskProgress amzTaskProgress) {
        amzTaskProgress.setCreateTime(DateUtils.getNowDate());
        return amzTaskProgressMapper.insertAmzTaskProgress(amzTaskProgress);
    }

    /**
     * 修改亚马逊任务进度记录
     *
     * @param amzTaskProgress 亚马逊任务进度记录
     * @return 结果
     */
    @Override
    public int updateAmzTaskProgress(AmzTaskProgress amzTaskProgress) {
        amzTaskProgress.setUpdateTime(DateUtils.getNowDate());
        return amzTaskProgressMapper.updateAmzTaskProgress(amzTaskProgress);
    }

    /**
     * 批量删除亚马逊任务进度记录
     *
     * @param progressIds 需要删除的亚马逊任务进度记录主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskProgressByProgressIds(Long[] progressIds) {
        return amzTaskProgressMapper.deleteAmzTaskProgressByProgressIds(progressIds);
    }

    /**
     * 删除亚马逊任务进度记录信息
     *
     * @param progressId 亚马逊任务进度记录主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskProgressByProgressId(Long progressId) {
        return amzTaskProgressMapper.deleteAmzTaskProgressByProgressId(progressId);
    }
}
