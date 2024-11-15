package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.DailyTaskMapper;
import com.ruoyi.aliexpress.domain.DailyTask;
import com.ruoyi.aliexpress.service.IDailyTaskService;

/**
 * 速卖通分析-任务清单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-05
 */
@Service
public class DailyTaskServiceImpl implements IDailyTaskService 
{
    @Autowired
    private DailyTaskMapper dailyTaskMapper;

    /**
     * 查询速卖通分析-任务清单
     * 
     * @param id 速卖通分析-任务清单主键
     * @return 速卖通分析-任务清单
     */
    @Override
    public DailyTask selectDailyTaskById(Long id)
    {
        return dailyTaskMapper.selectDailyTaskById(id);
    }

    /**
     * 查询速卖通分析-任务清单列表
     * 
     * @param dailyTask 速卖通分析-任务清单
     * @return 速卖通分析-任务清单
     */
    @Override
    public List<DailyTask> selectDailyTaskList(DailyTask dailyTask)
    {
        return dailyTaskMapper.selectDailyTaskList(dailyTask);
    }

    /**
     * 新增速卖通分析-任务清单
     * 
     * @param dailyTask 速卖通分析-任务清单
     * @return 结果
     */
    @Override
    public int insertDailyTask(DailyTask dailyTask)
    {
        return dailyTaskMapper.insertDailyTask(dailyTask);
    }

    /**
     * 修改速卖通分析-任务清单
     * 
     * @param dailyTask 速卖通分析-任务清单
     * @return 结果
     */
    @Override
    public int updateDailyTask(DailyTask dailyTask)
    {
        dailyTask.setUpdateTime(DateUtils.getNowDate());
        return dailyTaskMapper.updateDailyTask(dailyTask);
    }

    /**
     * 批量删除速卖通分析-任务清单
     * 
     * @param ids 需要删除的速卖通分析-任务清单主键
     * @return 结果
     */
    @Override
    public int deleteDailyTaskByIds(Long[] ids)
    {
        return dailyTaskMapper.deleteDailyTaskByIds(ids);
    }

    /**
     * 删除速卖通分析-任务清单信息
     * 
     * @param id 速卖通分析-任务清单主键
     * @return 结果
     */
    @Override
    public int deleteDailyTaskById(Long id)
    {
        return dailyTaskMapper.deleteDailyTaskById(id);
    }
}
