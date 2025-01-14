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
import com.ruoyi.aliexpress.domain.PofitWarehouseUnsalableStatistics;
import com.ruoyi.aliexpress.service.IPofitWarehouseUnsalableStatisticsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 滞销库存Controller
 * 
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/aliexpress/unsalable")
public class PofitWarehouseUnsalableStatisticsController extends BaseController
{
    @Autowired
    private IPofitWarehouseUnsalableStatisticsService pofitWarehouseUnsalableStatisticsService;

    /**
     * 查询滞销库存列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:unsalable:list')")
    @GetMapping("/list")
    public TableDataInfo list(PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics)
    {
        startPage();
        List<PofitWarehouseUnsalableStatistics> list = pofitWarehouseUnsalableStatisticsService.selectPofitWarehouseUnsalableStatisticsList(pofitWarehouseUnsalableStatistics);
        return getDataTable(list);
    }

    /**
     * 导出滞销库存列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:unsalable:export')")
    @Log(title = "滞销库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics)
    {
        List<PofitWarehouseUnsalableStatistics> list = pofitWarehouseUnsalableStatisticsService.selectPofitWarehouseUnsalableStatisticsList(pofitWarehouseUnsalableStatistics);
        ExcelUtil<PofitWarehouseUnsalableStatistics> util = new ExcelUtil<PofitWarehouseUnsalableStatistics>(PofitWarehouseUnsalableStatistics.class);
        util.exportExcel(response, list, "滞销库存数据");
    }

    /**
     * 获取滞销库存详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:unsalable:query')")
    @GetMapping(value = "/{year}")
    public AjaxResult getInfo(@PathVariable("year") Long year)
    {
        return success(pofitWarehouseUnsalableStatisticsService.selectPofitWarehouseUnsalableStatisticsByYear(year));
    }

    /**
     * 新增滞销库存
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:unsalable:add')")
    @Log(title = "滞销库存", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics)
    {
        return toAjax(pofitWarehouseUnsalableStatisticsService.insertPofitWarehouseUnsalableStatistics(pofitWarehouseUnsalableStatistics));
    }

    /**
     * 修改滞销库存
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:unsalable:edit')")
    @Log(title = "滞销库存", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PofitWarehouseUnsalableStatistics pofitWarehouseUnsalableStatistics)
    {
        return toAjax(pofitWarehouseUnsalableStatisticsService.updatePofitWarehouseUnsalableStatistics(pofitWarehouseUnsalableStatistics));
    }

    /**
     * 删除滞销库存
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:unsalable:remove')")
    @Log(title = "滞销库存", businessType = BusinessType.DELETE)
	@DeleteMapping("/{years}")
    public AjaxResult remove(@PathVariable Long[] years)
    {
        return toAjax(pofitWarehouseUnsalableStatisticsService.deletePofitWarehouseUnsalableStatisticsByYears(years));
    }
}
