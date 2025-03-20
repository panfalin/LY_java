package com.ruoyi.task.mapper;

import com.ruoyi.task.domain.AmzTaskAssignee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 亚马逊任务指派Mapper接口
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Mapper
public interface AmzTaskAssigneeMapper {
    /**
     * 查询亚马逊任务指派
     *
     * @param assigneeId 亚马逊任务指派主键
     * @return 亚马逊任务指派
     */
    public AmzTaskAssignee selectAmzTaskAssigneeByAssigneeId(Long assigneeId);

    public List<AmzTaskAssignee> selectAmzTaskAssigneeByAssigneeListId(Long assigneeId);

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
     * 删除亚马逊任务指派
     *
     * @param assigneeId 亚马逊任务指派主键
     * @return 结果
     */
    public int deleteAmzTaskAssigneeByAssigneeId(Long assigneeId);

    /**
     * 批量删除亚马逊任务指派
     *
     * @param assigneeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzTaskAssigneeByAssigneeIds(Long[] assigneeIds);

    List<AmzTaskAssignee> selectAmzTaskAssigneeByTaskIds(List<Long> taskIds);
}
