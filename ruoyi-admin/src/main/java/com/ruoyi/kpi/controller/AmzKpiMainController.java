package com.ruoyi.kpi.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.kpi.domain.AmzKpiMain;
import com.ruoyi.kpi.domain.dto.KpiSettingDTO;
import com.ruoyi.kpi.service.IAmzKpiMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * KPI主表Controller
 *
 * @author ruoyi
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/kpi/main")
public class AmzKpiMainController extends BaseController {
    @Autowired
    private IAmzKpiMainService amzKpiMainService;

    /**
     * 查询KPI主表列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzKpiMain amzKpiMain) {
        startPage();
        List<AmzKpiMain> list = amzKpiMainService.selectAmzKpiMainList(amzKpiMain);
        return getDataTable(list);
    }

    /**
     * 导出KPI主表列表
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:export')")
    @Log(title = "KPI主表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzKpiMain amzKpiMain) {
        List<AmzKpiMain> list = amzKpiMainService.selectAmzKpiMainList(amzKpiMain);
        ExcelUtil<AmzKpiMain> util = new ExcelUtil<AmzKpiMain>(AmzKpiMain.class);
        util.exportExcel(response, list, "KPI主表数据");
    }

    /**
     * 获取KPI主表详细信息
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:query')")
    @GetMapping(value = "/{kpiId}")
    public AjaxResult getInfo(@PathVariable("kpiId") Long kpiId) {
        return success(amzKpiMainService.selectAmzKpiMainByKpiId(kpiId));
    }

    /**
     * 新增KPI主表
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:add')")
    @Log(title = "KPI主表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzKpiMain amzKpiMain) {
        return toAjax(amzKpiMainService.insertAmzKpiMain(amzKpiMain));
    }

    /**
     * 修改KPI主表
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:edit')")
    @Log(title = "KPI主表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzKpiMain amzKpiMain) {
        return toAjax(amzKpiMainService.updateAmzKpiMain(amzKpiMain));
    }

    /**
     * 删除KPI主表
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:remove')")
    @Log(title = "KPI主表", businessType = BusinessType.DELETE)
    @DeleteMapping("/{kpiIds}")
    public AjaxResult remove(@PathVariable Long[] kpiIds) {
        return toAjax(amzKpiMainService.deleteAmzKpiMainByKpiIds(kpiIds));
    }

    /**
     * 获取KPI列表（包含考核项和历史记录）
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:list')")
    @GetMapping("/listWithDetails")
    public AjaxResult listWithDetails(AmzKpiMain amzKpiMain) {
        return success(amzKpiMainService.selectKpiListWithDetails(amzKpiMain));
    }

    /**
     * 设置KPI考核项
     */
    @PreAuthorize("@ss.hasPermi('kpi:main:add')")
    @Log(title = "KPI考核设置", businessType = BusinessType.INSERT)
    @PostMapping("/setTargets")
    public AjaxResult setKpiTargets(@RequestBody KpiSettingDTO kpiSetting) {
        return toAjax(amzKpiMainService.setKpiTargets(kpiSetting));
    }
}
