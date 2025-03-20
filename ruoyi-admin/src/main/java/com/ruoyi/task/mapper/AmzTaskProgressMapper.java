package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskProgress;

import java.util.List;

/**
 * 亚马逊任务进度记录Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface AmzTaskProgressMapper {
    /**
     * 查询亚马逊任务进度记录
     *
     * @param progressId 亚马逊任务进度记录主键
     * @return 亚马逊任务进度记录
     */
    public AmzTaskProgress selectAmzTaskProgressByProgressId(Long progressId);

    /**
     * 查询亚马逊任务进度记录列表
     *
     * @param amzTaskProgress 亚马逊任务进度记录
     * @return 亚马逊任务进度记录集合
     */
    public List<AmzTaskProgress> selectAmzTaskProgressList(AmzTaskProgress amzTaskProgress);

    /**
     * 新增亚马逊任务进度记录
     *
     * @param amzTaskProgress 亚马逊任务进度记录
     * @return 结果
     */
    public int insertAmzTaskProgress(AmzTaskProgress amzTaskProgress);

    /**
     * 修改亚马逊任务进度记录
     *
     * @param amzTaskProgress 亚马逊任务进度记录
     * @return 结果
     */
    public int updateAmzTaskProgress(AmzTaskProgress amzTaskProgress);

    /**
     * 删除亚马逊任务进度记录
     *
     * @param progressId 亚马逊任务进度记录主键
     * @return 结果
     */
    public int deleteAmzTaskProgressByProgressId(Long progressId);

    /**
     * 批量删除亚马逊任务进度记录
     *
     * @param progressIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskProgressByProgressIds(Long[] progressIds);
}
