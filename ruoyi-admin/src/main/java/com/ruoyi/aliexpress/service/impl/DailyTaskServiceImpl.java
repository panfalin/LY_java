package com.ruoyi.aliexpress.service.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
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
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();

        // 格式化日期为 "yyyy-MM-dd" 格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String taskDate = currentDate.format(formatter);
        dailyTask.setTaskTime(taskDate);

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

    @Override
    public ResponseEntity<Map<String, Object>> updateDailyTaskUnfinished(DailyTask dailyTask) {
        // 创建一个返回的 Map 对象
        Map<String, Object> response = new HashMap<>();
        try{
           // 获取当前日期
           String taskTime = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
           // 查询所有未分配的任务
           List<DailyTask> allTasks = dailyTaskMapper.selectDailyTaskUnfinishedList();

           // 按照负责人分组任务
           Map<String, List<DailyTask>> tasksByResponsiblePerson = new HashMap<>();
           for (DailyTask task : allTasks) {
               String responsiblePerson = task.getResponsiblePerson();
               if (!tasksByResponsiblePerson.containsKey(responsiblePerson)) {
                   tasksByResponsiblePerson.put(responsiblePerson, new ArrayList<>());
               }
               tasksByResponsiblePerson.get(responsiblePerson).add(task);
           }
           // 统计总共更新了多少任务
           int totalUpdatedTasks = 0;

           // 对每个负责人分配20个任务
           for (Map.Entry<String, List<DailyTask>> entry : tasksByResponsiblePerson.entrySet()) {
               String responsiblePerson = entry.getKey();
               List<DailyTask> tasks = entry.getValue();

               // 随机选取20个任务
               Collections.shuffle(tasks);  // 打乱任务顺序
               List<DailyTask> selectedTasks = new ArrayList<>();

               int taskCount = 0;
               for (int i = 0; i < tasks.size(); i++) {
                   if (taskCount >= 20) {
                       break;  // 已经选够20个任务，停止选取
                   }
                   selectedTasks.add(tasks.get(i));
                   taskCount++;
               }
               // 获取任务ID
               List<Long> taskIds = new ArrayList<>();
               for (DailyTask selectedTask : selectedTasks) {
                   taskIds.add(selectedTask.getsId());
               }

               // 使用 Map 传递参数给 MyBatis
               Map<String, Object> params = new HashMap<>();
               params.put("taskTime", taskTime);
               params.put("responsiblePerson", responsiblePerson);
               params.put("taskIds", taskIds);


               // 更新任务的任务时间和责任人
               int updatedCount = dailyTaskMapper.updateDailyTaskUnfinished(params);
               // 累计更新的任务数量
               totalUpdatedTasks += updatedCount;
           }
           // 返回成功的响应
           response.put("status", "success");
           response.put("message", "Successfully updated tasks.");
           response.put("totalUpdatedTasks", totalUpdatedTasks);
           return ResponseEntity.ok(response);
        }catch (Exception e) {
           // 处理异常，返回失败的响应
           response.put("status", "error");
           response.put("message", "Failed to update tasks: " + e.getMessage());
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
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
