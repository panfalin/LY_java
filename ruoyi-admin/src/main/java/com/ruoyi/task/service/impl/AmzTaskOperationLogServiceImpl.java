package com.ruoyi.task.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.task.domain.AmzTaskOperationLog;
import com.ruoyi.task.mapper.AmzTaskOperationLogMapper;
import com.ruoyi.task.service.IAmzTaskOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 亚马逊任务操作日志Service业务层处理
 *
 * @author panfalin
 * @date 2025-03-19
 */
@Service
public class AmzTaskOperationLogServiceImpl implements IAmzTaskOperationLogService {
    @Autowired
    private AmzTaskOperationLogMapper amzTaskOperationLogMapper;

    /**
     * 查询亚马逊任务操作日志
     *
     * @param logId 亚马逊任务操作日志主键
     * @return 亚马逊任务操作日志
     */
    @Override
    public AmzTaskOperationLog selectAmzTaskOperationLogByLogId(Long logId) {
        return amzTaskOperationLogMapper.selectAmzTaskOperationLogByLogId(logId);
    }

    /**
     * 查询亚马逊任务操作日志列表
     *
     * @param amzTaskOperationLog 亚马逊任务操作日志
     * @return 亚马逊任务操作日志
     */
    @Override
    public List<AmzTaskOperationLog> selectAmzTaskOperationLogList(AmzTaskOperationLog amzTaskOperationLog) {
        return amzTaskOperationLogMapper.selectAmzTaskOperationLogList(amzTaskOperationLog);
    }

    /**
     * 新增亚马逊任务操作日志
     *
     * @param amzTaskOperationLog 亚马逊任务操作日志
     * @return 结果
     */
    @Override
    public int insertAmzTaskOperationLog(AmzTaskOperationLog amzTaskOperationLog) {
        amzTaskOperationLog.setCreateTime(DateUtils.getNowDate());
        return amzTaskOperationLogMapper.insertAmzTaskOperationLog(amzTaskOperationLog);
    }

    /**
     * 修改亚马逊任务操作日志
     *
     * @param amzTaskOperationLog 亚马逊任务操作日志
     * @return 结果
     */
    @Override
    public int updateAmzTaskOperationLog(AmzTaskOperationLog amzTaskOperationLog) {
        return amzTaskOperationLogMapper.updateAmzTaskOperationLog(amzTaskOperationLog);
    }

    /**
     * 批量删除亚马逊任务操作日志
     *
     * @param logIds 需要删除的亚马逊任务操作日志主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskOperationLogByLogIds(Long[] logIds) {
        return amzTaskOperationLogMapper.deleteAmzTaskOperationLogByLogIds(logIds);
    }

    /**
     * 删除亚马逊任务操作日志信息
     *
     * @param logId 亚马逊任务操作日志主键
     * @return 结果
     */
    @Override
    public int deleteAmzTaskOperationLogByLogId(Long logId) {
        return amzTaskOperationLogMapper.deleteAmzTaskOperationLogByLogId(logId);
    }
}
