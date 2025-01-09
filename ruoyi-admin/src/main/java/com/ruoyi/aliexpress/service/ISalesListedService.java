package com.ruoyi.aliexpress.service;

import com.ruoyi.aliexpress.domain.DailyTask;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

/**
 * 速卖通分析-任务清单Service接口
 * 
 * @author ruoyi
 * @date 2024-11-05
 */
public interface ISalesListedService
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
     * 修改速卖通分析-任务清单
     *
     * @param dailyTask 速卖通分析-任务清单
     * @return 结果
     */
    public ResponseEntity<Map<String, Object>> updateDailyTaskUnfinished(DailyTask dailyTask);





    /**
     * 批量删除速卖通分析-任务清单
     * 
     * @param ids 需要删除的速卖通分析-任务清单主键集合
     * @return 结果
     */
    public int deleteDailyTaskByIds(Long[] ids);

    /**
     * 删除速卖通分析-任务清单信息
     * 
     * @param id 速卖通分析-任务清单主键
     * @return 结果
     */
    public int deleteDailyTaskById(Long id);
}
