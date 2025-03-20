package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskAssignee;
import com.ruoyi.task.mapper.AmzTaskAssigneeMapper;
import com.ruoyi.task.service.IAmzTaskAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务指派Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskAssigneeServiceImpl implements IAmzTaskAssigneeService {
    @Autowired
    private AmzTaskAssigneeMapper amzTaskAssigneeMapper;

    /**
     * 查询亚马逊任务指派
     *
     * @param assigneeId 亚马逊任务指派主键
     * @return 亚马逊任务指派
     */
    @Override
    public AmzTaskAssignee selectAmzTaskAssigneeByAssigneeId(Long assigneeId) {
        return amzTaskAssigneeMapper.selectAmzTaskAssigneeByAssigneeId(assigneeId);
    }

    /**
     * 查询亚马逊任务指派列表
     *
     * @param amzTaskAssignee 亚马逊任务指派
     * @return 亚马逊任务指派
     */
    @Override
    public List<AmzTaskAssignee> selectAmzTaskAssigneeList(AmzTaskAssignee amzTaskAssignee) {
        return amzTaskAssigneeMapper.selectAmzTaskAssigneeList(amzTaskAssignee);
    }

    /**
     * 新增亚马逊任务指派
     *
     * @param amzTaskAssignee 亚马逊任务指派
     * @return 结果
     */
    @Override
    public int insertAmzTaskAssignee(AmzTaskAssignee amzTaskAssignee) {
        amzTaskAssignee.setCreateTime(DateUtils.getNowDate());
        return amzTaskAssigneeMapper.insertAmzTaskAssignee(amzTaskAssignee);
    }

    /**
     * 修改亚马逊任务指派
     *
     * @param amzTaskAssignee 亚马逊任务指派
     * @return 结果
     */
    @Override
    public int updateAmzTaskAssignee(AmzTaskAssignee amzTaskAssignee) {
        amzTaskAssignee.setUpdateTime(DateUtils.getNowDate());
        return amzTaskAssigneeMapper.updateAmzTaskAssignee(amzTaskAssignee);
    }

    /**
     * 批量删除亚马逊任务指派
     *
     * @param assigneeIds 需要删除的亚马逊任务指派主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskAssigneeByAssigneeIds(Long[] assigneeIds) {
        return amzTaskAssigneeMapper.deleteAmzTaskAssigneeByAssigneeIds(assigneeIds);
    }

    /**
     * 删除亚马逊任务指派信息
     *
     * @param assigneeId 亚马逊任务指派主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskAssigneeByAssigneeId(Long assigneeId) {
        return amzTaskAssigneeMapper.deleteAmzTaskAssigneeByAssigneeId(assigneeId);
    }
}
