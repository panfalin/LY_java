package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskSubTarget;

import java.util.List;

/**
 * 亚马逊任务子目标Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskSubTargetService {
    /**
     * 查询亚马逊任务子目标
     *
     * @param targetId 亚马逊任务子目标主键
     * @return 亚马逊任务子目标
     */
    public AmzTaskSubTarget selectAmzTaskSubTargetByTargetId(Long targetId);

    /**
     * 查询亚马逊任务子目标列表
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 亚马逊任务子目标集合
     */
    public List<AmzTaskSubTarget> selectAmzTaskSubTargetList(AmzTaskSubTarget amzTaskSubTarget);

    /**
     * 新增亚马逊任务子目标
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 结果
     */
    public int insertAmzTaskSubTarget(AmzTaskSubTarget amzTaskSubTarget);

    /**
     * 修改亚马逊任务子目标
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 结果
     */
    public int updateAmzTaskSubTarget(AmzTaskSubTarget amzTaskSubTarget);

    /**
     * 批量删除亚马逊任务子目标
     *
     * @param targetIds 需要删除的亚马逊任务子目标主键集合
     * @return 结果
     */
    public int deleteAmzTaskSubTargetByTargetIds(Long[] targetIds);

    /**
     * 删除亚马逊任务子目标信息
     *
     * @param targetId 亚马逊任务子目标主键
     * @return 结果
     */
    public int deleteAmzTaskSubTargetByTargetId(Long targetId);
}
