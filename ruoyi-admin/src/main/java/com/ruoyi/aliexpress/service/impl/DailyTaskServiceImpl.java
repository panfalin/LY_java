package com.ruoyi.aliexpress.service.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.ruoyi.aliexpress.util.EmailUtils;
import com.ruoyi.aliexpress.util.ExcelExporterTask;
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
        Map<String,String> sendto=new HashMap<>();
//        sendto.put("夏慧颖","857240603@qq.com");
//        sendto.put("赵世杰","2885072146@qq.com");
//        sendto.put("沈娟","2885072146@qq.com");
//        sendto.put("陈雪芳","2885072146@qq.com");
//        sendto.put("voice","857240603@qq.com");
//        sendto.put("未分配","857240603@qq.com");


        sendto.put("夏慧颖","2355799969@qq.com");
        sendto.put("赵世杰","3003669197@qq.com");
        sendto.put("沈娟","2881970600@qq.com");
        sendto.put("陈雪芳","2850511085@qq.com");
        sendto.put("voice","3004275997@qq.com");
        sendto.put("未分配","2885072146@qq.com");


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

            // 对每个负责人分配任务
            for (Map.Entry<String, List<DailyTask>> entry : tasksByResponsiblePerson.entrySet()) {
                String responsiblePerson = entry.getKey();
                List<DailyTask> tasks = entry.getValue();

                // 创建两个列表来分别存储上架任务和下架任务
                List<DailyTask> shelveTasks = new ArrayList<>();
                List<DailyTask> unshelveTasks = new ArrayList<>();

                // 将任务按类型分类
                for (DailyTask task : tasks) {
                    if (task.getSuggestions().equals("上架")) {
                        shelveTasks.add(task);  // 上架任务
                    } else if (task.getSuggestions().equals("下架")) {
                        unshelveTasks.add(task);  // 下架任务
                    }
                }

                // 对上架任务按销量进行排序（降序）
                Collections.sort(shelveTasks, new Comparator<DailyTask>() {
                    @Override
                    public int compare(DailyTask task1, DailyTask task2) {
                        try {
                            Integer sales1 = Integer.parseInt(task1.getSales());
                            Integer sales2 = Integer.parseInt(task2.getSales());
                            return Integer.compare(sales2, sales1);  // 按销量降序排列
                        } catch (NumberFormatException e) {
                            return 0;  // 如果无法解析销量，认为它们相等
                        }
                    }
                });

                // 对下架任务按销量进行排序（降序）
                Collections.sort(unshelveTasks, new Comparator<DailyTask>() {
                    @Override
                    public int compare(DailyTask task1, DailyTask task2) {
                        try {
                            Integer sales1 = Integer.parseInt(task1.getSales());
                            Integer sales2 = Integer.parseInt(task2.getSales());
                            return Integer.compare(sales2, sales1);  // 按销量降序排列
                        } catch (NumberFormatException e) {
                            return 0;  // 如果无法解析销量，认为它们相等
                        }
                    }
                });

                // 从上架任务中取出前10个任务，如果不足10个则补充下架任务
                List<DailyTask> selectedShelveTasks = shelveTasks.size() >= 10 ? shelveTasks.subList(0, 10) : shelveTasks;
                int remainingShelveTasks = 10 - selectedShelveTasks.size();

                // 如果上架任务不足10个，使用下架任务来补充
                if (remainingShelveTasks >= 0 && !unshelveTasks.isEmpty()) {
                    List<DailyTask> additionalUnshelveTasks = unshelveTasks.size() >= remainingShelveTasks ?
                            unshelveTasks.subList(0, remainingShelveTasks) : unshelveTasks;
                    selectedShelveTasks.addAll(additionalUnshelveTasks);  // 补充下架任务
                }

                // 从下架任务中取出前10个任务，如果不足10个则补充上架任务
                List<DailyTask> selectedUnshelveTasks = unshelveTasks.size() >= 10 ? unshelveTasks.subList(0, 10) : unshelveTasks;
                int remainingUnshelveTasks = 10 - selectedUnshelveTasks.size();

                // 如果下架任务不足10个，使用上架任务来补充
                if (remainingUnshelveTasks >= 0 && !shelveTasks.isEmpty()) {
                    List<DailyTask> additionalShelveTasks = shelveTasks.size() >= remainingUnshelveTasks ?
                            shelveTasks.subList(0, remainingUnshelveTasks) : shelveTasks;
                    selectedUnshelveTasks.addAll(additionalShelveTasks);  // 补充上架任务
                }

                // 合并选中的上架任务和下架任务
                List<DailyTask> selectedTasks = new ArrayList<>();
                selectedTasks.addAll(selectedShelveTasks);
                selectedTasks.addAll(selectedUnshelveTasks);



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

               // 生成 Excel 文件
               String filePath = "tasks_" + responsiblePerson + "_" + taskTime + ".xlsx";
               ExcelExporterTask.generateExcelFile(selectedTasks, filePath);
               // 发送邮件
               String subject = "任务分配报告 - " + taskTime;
               String body = responsiblePerson + "，\n\n请查收您的任务分配报告。";
               EmailUtils.sendEmailWithAttachment(sendto.get(responsiblePerson), subject, body, filePath);


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
