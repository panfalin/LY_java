package com.ruoyi.kpi.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.kpi.domain.AmzKpiTarget;
import com.ruoyi.kpi.service.IAmzKpiTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * KPI考核项目Controller
 *
 * @author panfalin
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/kpi/target")
public class AmzKpiTargetController extends BaseController {
    @Autowired
    private IAmzKpiTargetService amzKpiTargetService;

    /**
     * 查询KPI考核项目列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:target:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzKpiTarget amzKpiTarget) {
        startPage();
        List<AmzKpiTarget> list = amzKpiTargetService.selectAmzKpiTargetList(amzKpiTarget);
        return getDataTable(list);
    }

    /**
     * 导出KPI考核项目列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:target:export')")
    @Log(title = "KPI考核项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzKpiTarget amzKpiTarget) {
        List<AmzKpiTarget> list = amzKpiTargetService.selectAmzKpiTargetList(amzKpiTarget);
        ExcelUtil<AmzKpiTarget> util = new ExcelUtil<AmzKpiTarget>(AmzKpiTarget.class);
        util.exportExcel(response, list, "KPI考核项目数据");
    }

    /**
     * 获取KPI考核项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('kpi:target:query')")
    @GetMapping(value = "/{targetId}")
    public AjaxResult getInfo(@PathVariable("targetId") Long targetId) {
        return success(amzKpiTargetService.selectAmzKpiTargetByTargetId(targetId));
    }

    /**
     * 新增KPI考核项目
     */
    @PreAuthorize("@ss.hasPermi('kpi:target:add')")
    @Log(title = "KPI考核项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzKpiTarget amzKpiTarget) {
        return toAjax(amzKpiTargetService.insertAmzKpiTarget(amzKpiTarget));
    }

    /**
     * 修改KPI考核项目
     */
    @PreAuthorize("@ss.hasPermi('kpi:target:edit')")
    @Log(title = "KPI考核项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzKpiTarget amzKpiTarget) {
        return toAjax(amzKpiTargetService.updateAmzKpiTarget(amzKpiTarget));
    }

    /**
     * 删除KPI考核项目
     */
    @PreAuthorize("@ss.hasPermi('kpi:target:remove')")
    @Log(title = "KPI考核项目", businessType = BusinessType.DELETE)
    @DeleteMapping("/{targetIds}")
    public AjaxResult remove(@PathVariable Long[] targetIds) {
        return toAjax(amzKpiTargetService.deleteAmzKpiTargetByTargetIds(targetIds));
    }
}
