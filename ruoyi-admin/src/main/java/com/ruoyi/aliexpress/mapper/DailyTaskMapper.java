package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.DailyTask;

/**
 * 速卖通分析-任务清单Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-05
 */
public interface DailyTaskMapper 
{
    /**
     * 查询速卖通分析-任务清单
     * 
     * @param id 速卖通分析-任务清单主键
     * @return 速卖通分析-任务清单
     */
    public DailyTask selectDailyTaskById(Long id);

    /**
     * 查询速卖通分析-任务清单列表
     * 
     * @param dailyTask 速卖通分析-任务清单
     * @return 速卖通分析-任务清单集合
     */
    public List<DailyTask> selectDailyTaskList(DailyTask dailyTask);

    /**
     * 新增速卖通分析-任务清单
     * 
     * @param dailyTask 速卖通分析-任务清单
     * @return 结果
     */
    public int insertDailyTask(DailyTask dailyTask);

    /**
     * 修改速卖通分析-任务清单
     * 
     * @param dailyTask 速卖通分析-任务清单
     * @return 结果
     */
    public int updateDailyTask(DailyTask dailyTask);

    /**
     * 删除速卖通分析-任务清单
     * 
     * @param id 速卖通分析-任务清单主键
     * @return 结果
     */
    public int deleteDailyTaskById(Long id);

    /**
     * 批量删除速卖通分析-任务清单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDailyTaskByIds(Long[] ids);
}
