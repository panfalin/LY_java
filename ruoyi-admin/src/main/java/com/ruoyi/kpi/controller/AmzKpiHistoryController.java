package com.ruoyi.kpi.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.kpi.domain.AmzKpiHistory;
import com.ruoyi.kpi.service.IAmzKpiHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * KPI历史得分Controller
 *
 * @author panfalin
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/kpi/history")
public class AmzKpiHistoryController extends BaseController {
    @Autowired
    private IAmzKpiHistoryService amzKpiHistoryService;

    /**
     * 查询KPI历史得分列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:history:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzKpiHistory amzKpiHistory) {
        startPage();
        List<AmzKpiHistory> list = amzKpiHistoryService.selectAmzKpiHistoryList(amzKpiHistory);
        return getDataTable(list);
    }

    /**
     * 导出KPI历史得分列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:history:export')")
    @Log(title = "KPI历史得分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzKpiHistory amzKpiHistory) {
        List<AmzKpiHistory> list = amzKpiHistoryService.selectAmzKpiHistoryList(amzKpiHistory);
        ExcelUtil<AmzKpiHistory> util = new ExcelUtil<AmzKpiHistory>(AmzKpiHistory.class);
        util.exportExcel(response, list, "KPI历史得分数据");
    }

    /**
     * 获取KPI历史得分详细信息
     */
    @PreAuthorize("@ss.hasPermi('kpi:history:query')")
    @GetMapping(value = "/{historyId}")
    public AjaxResult getInfo(@PathVariable("historyId") Long historyId) {
        return success(amzKpiHistoryService.selectAmzKpiHistoryByHistoryId(historyId));
    }

    /**
     * 新增KPI历史得分
     */
    @PreAuthorize("@ss.hasPermi('kpi:history:add')")
    @Log(title = "KPI历史得分", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzKpiHistory amzKpiHistory) {
        return toAjax(amzKpiHistoryService.insertAmzKpiHistory(amzKpiHistory));
    }

    /**
     * 修改KPI历史得分
     */
    @PreAuthorize("@ss.hasPermi('kpi:history:edit')")
    @Log(title = "KPI历史得分", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzKpiHistory amzKpiHistory) {
        return toAjax(amzKpiHistoryService.updateAmzKpiHistory(amzKpiHistory));
    }

    /**
     * 删除KPI历史得分
     */
    @PreAuthorize("@ss.hasPermi('kpi:history:remove')")
    @Log(title = "KPI历史得分", businessType = BusinessType.DELETE)
    @DeleteMapping("/{historyIds}")
    public AjaxResult remove(@PathVariable Long[] historyIds) {
        return toAjax(amzKpiHistoryService.deleteAmzKpiHistoryByHistoryIds(historyIds));
    }
}
