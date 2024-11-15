package com.ruoyi.aliexpress.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.aliexpress.domain.DailyTask;
import com.ruoyi.aliexpress.service.IDailyTaskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通分析-任务清单Controller
 * 
 * @author ruoyi
 * @date 2024-11-05
 */
@RestController
@RequestMapping("/task/task")
public class DailyTaskController extends BaseController
{
    @Autowired
    private IDailyTaskService dailyTaskService;

    /**
     * 查询速卖通分析-任务清单列表
     */
    @PreAuthorize("@ss.hasPermi('task:task:list')")
    @GetMapping("/list")
    public TableDataInfo list(DailyTask dailyTask)
    {
        startPage();
        List<DailyTask> list = dailyTaskService.selectDailyTaskList(dailyTask);
        return getDataTable(list);
    }

    /**
     * 导出速卖通分析-任务清单列表
     */
    @PreAuthorize("@ss.hasPermi('task:task:export')")
    @Log(title = "速卖通分析-任务清单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DailyTask dailyTask)
    {
        List<DailyTask> list = dailyTaskService.selectDailyTaskList(dailyTask);
        ExcelUtil<DailyTask> util = new ExcelUtil<DailyTask>(DailyTask.class);
        util.exportExcel(response, list, "速卖通分析-任务清单数据");
    }

    /**
     * 获取速卖通分析-任务清单详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:task:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dailyTaskService.selectDailyTaskById(id));
    }

    /**
     * 新增速卖通分析-任务清单
     */
    @PreAuthorize("@ss.hasPermi('task:task:add')")
    @Log(title = "速卖通分析-任务清单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DailyTask dailyTask)
    {
        return toAjax(dailyTaskService.insertDailyTask(dailyTask));
    }

    /**
     * 修改速卖通分析-任务清单
     */
    @PreAuthorize("@ss.hasPermi('task:task:edit')")
    @Log(title = "速卖通分析-任务清单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DailyTask dailyTask)
    {
        return toAjax(dailyTaskService.updateDailyTask(dailyTask));
    }

    /**
     * 删除速卖通分析-任务清单
     */
    @PreAuthorize("@ss.hasPermi('task:task:remove')")
    @Log(title = "速卖通分析-任务清单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dailyTaskService.deleteDailyTaskByIds(ids));
    }
}
