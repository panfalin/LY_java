package com.ruoyi.task.service;

import com.ruoyi.task.domain.AmzTaskAssignee;

import java.util.List;

/**
 * 亚马逊任务指派Service接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
public interface IAmzTaskAssigneeService {
    /**
     * 查询亚马逊任务指派
     *
     * @param assigneeId 亚马逊任务指派主键
     * @return 亚马逊任务指派
     */
    public AmzTaskAssignee selectAmzTaskAssigneeByAssigneeId(Long assigneeId);

    /**
     * 查询亚马逊任务指派列表
     *
     * @param amzTaskAssignee 亚马逊任务指派
     * @return 亚马逊任务指派集合
     */
    public List<AmzTaskAssignee> selectAmzTaskAssigneeList(AmzTaskAssignee amzTaskAssignee);

    /**
     * 新增亚马逊任务指派
     *
     * @param amzTaskAssignee 亚马逊任务指派
     * @return 结果
     */
    public int insertAmzTaskAssignee(AmzTaskAssignee amzTaskAssignee);

    /**
     * 修改亚马逊任务指派
     *
     * @param amzTaskAssignee 亚马逊任务指派
     * @return 结果
     */
    public int updateAmzTaskAssignee(AmzTaskAssignee amzTaskAssignee);

    /**
     * 批量删除亚马逊任务指派
     *
     * @param assigneeIds 需要删除的亚马逊任务指派主键集合
     * @return 结果
     */
    public int deleteAmzTaskAssigneeByAssigneeIds(Long[] assigneeIds);

    /**
     * 删除亚马逊任务指派信息
     *
     * @param assigneeId 亚马逊任务指派主键
     * @return 结果
     */
    public int deleteAmzTaskAssigneeByAssigneeId(Long assigneeId);
}
