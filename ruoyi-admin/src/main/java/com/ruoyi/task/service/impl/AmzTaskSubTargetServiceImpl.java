package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskSubTarget;
import com.ruoyi.task.mapper.AmzTaskSubTargetMapper;
import com.ruoyi.task.service.IAmzTaskSubTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务子目标Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskSubTargetServiceImpl implements IAmzTaskSubTargetService {
    @Autowired
    private AmzTaskSubTargetMapper amzTaskSubTargetMapper;

    /**
     * 查询亚马逊任务子目标
     *
     * @param targetId 亚马逊任务子目标主键
     * @return 亚马逊任务子目标
     */
    @Override
    public AmzTaskSubTarget selectAmzTaskSubTargetByTargetId(Long targetId) {
        return amzTaskSubTargetMapper.selectAmzTaskSubTargetByTargetId(targetId);
    }

    /**
     * 查询亚马逊任务子目标列表
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 亚马逊任务子目标
     */
    @Override
    public List<AmzTaskSubTarget> selectAmzTaskSubTargetList(AmzTaskSubTarget amzTaskSubTarget) {
        return amzTaskSubTargetMapper.selectAmzTaskSubTargetList(amzTaskSubTarget);
    }

    /**
     * 新增亚马逊任务子目标
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 结果
     */
    @Override
    public int insertAmzTaskSubTarget(AmzTaskSubTarget amzTaskSubTarget) {
        amzTaskSubTarget.setCreateTime(DateUtils.getNowDate());
        return amzTaskSubTargetMapper.insertAmzTaskSubTarget(amzTaskSubTarget);
    }

    /**
     * 修改亚马逊任务子目标
     *
     * @param amzTaskSubTarget 亚马逊任务子目标
     * @return 结果
     */
    @Override
    public int updateAmzTaskSubTarget(AmzTaskSubTarget amzTaskSubTarget) {
        amzTaskSubTarget.setUpdateTime(DateUtils.getNowDate());
        return amzTaskSubTargetMapper.updateAmzTaskSubTarget(amzTaskSubTarget);
    }

    /**
     * 批量删除亚马逊任务子目标
     *
     * @param targetIds 需要删除的亚马逊任务子目标主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskSubTargetByTargetIds(Long[] targetIds) {
        return amzTaskSubTargetMapper.deleteAmzTaskSubTargetByTargetIds(targetIds);
    }

    /**
     * 删除亚马逊任务子目标信息
     *
     * @param targetId 亚马逊任务子目标主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskSubTargetByTargetId(Long targetId) {
        return amzTaskSubTargetMapper.deleteAmzTaskSubTargetByTargetId(targetId);
    }
}
