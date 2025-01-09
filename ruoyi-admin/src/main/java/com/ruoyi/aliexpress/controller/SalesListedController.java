package com.ruoyi.aliexpress.controller;

import com.ruoyi.aliexpress.domain.DailyTask;
import com.ruoyi.aliexpress.service.IDailyTaskService;
import com.ruoyi.aliexpress.service.ISalesListedService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 速卖通分析-任务清单Controller
 * 
 * @author ruoyi
 * @date 2024-11-05
 */
@RestController
@RequestMapping("/task")
public class SalesListedController extends BaseController
{
    @Autowired
    private ISalesListedService salesService;

    /**
     * 查询速卖通分析-任务清单列表 (上架)
     */
    @PreAuthorize("@ss.hasPermi('task:task:list')")
    @GetMapping("/sales/listListed")
    public TableDataInfo listListed(DailyTask dailyTask)
    {
        startPage();
        dailyTask.setSuggestions("上架");
        List<DailyTask> list = salesService.selectDailyTaskList(dailyTask);
        return getDataTable(list);
    }

    /**
     * 查询速卖通分析-任务清单列表 (上架)
     */
    @PreAuthorize("@ss.hasPermi('task:task:list')")
    @GetMapping("/sales/listOptimization")
    public TableDataInfo listOptimization(DailyTask dailyTask)
    {
        startPage();
        dailyTask.setSuggestions("优化");
        List<DailyTask> list = salesService.selectDailyTaskList(dailyTask);
        return getDataTable(list);
    }

    /**
     * 查询速卖通分析-任务清单列表 (上架)
     */
    @PreAuthorize("@ss.hasPermi('task:task:list')")
    @GetMapping("/sales/listRemoved")
    public TableDataInfo listRemoved(DailyTask dailyTask)
    {
        startPage();
        dailyTask.setSuggestions("下架");
        List<DailyTask> list = salesService.selectDailyTaskList(dailyTask);
        return getDataTable(list);
    }



    @PreAuthorize("@ss.hasPermi('task:task:list')")
    @GetMapping("/sales/updateDailyTasks")
    public ResponseEntity<Map<String, Object>> updateDailyTaskUnfinished(DailyTask dailyTask) {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        String userUserName = user.getUserName();
        if (!"admin".equalsIgnoreCase(userUserName)){
            // 创建一个返回的 Map 对象
            Map<String, Object> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "权限不足");
            return ResponseEntity.ok(response);
        }


        // 调用 service 层的业务逻辑方法，返回更新结果
        return salesService.updateDailyTaskUnfinished(dailyTask);
    }

    /**
     * 导出速卖通分析-任务清单列表
     */
    @PreAuthorize("@ss.hasPermi('task:task:export')")
    @Log(title = "速卖通分析-任务清单", businessType = BusinessType.EXPORT)
    @PostMapping("/sales/export")
    public void export(HttpServletResponse response, DailyTask dailyTask)
    {
        List<DailyTask> list = salesService.selectDailyTaskList(dailyTask);
        ExcelUtil<DailyTask> util = new ExcelUtil<DailyTask>(DailyTask.class);
        util.exportExcel(response, list, "速卖通分析-任务清单数据");
    }

    /**
     * 获取速卖通分析-任务清单详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:task:query')")
    @GetMapping(value = "/sales/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(salesService.selectDailyTaskById(id));
    }




}
