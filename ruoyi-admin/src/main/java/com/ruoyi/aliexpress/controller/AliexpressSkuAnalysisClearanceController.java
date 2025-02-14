package com.ruoyi.aliexpress.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.domain.AliexpressSkuStatistics;
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
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisClearance;
import com.ruoyi.aliexpress.service.IAliexpressSkuAnalysisClearanceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 清仓库存Controller
 * 
 * @author ruoyi
 * @date 2025-02-11
 */
@RestController
@RequestMapping("/aliexpress/clearance")
public class AliexpressSkuAnalysisClearanceController extends BaseController
{
    @Autowired
    private IAliexpressSkuAnalysisClearanceService aliexpressSkuAnalysisClearanceService;

    /**
     * 查询清仓库存列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:clearance:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance)
    {
        startPage();
        List<AliexpressSkuAnalysis> list = aliexpressSkuAnalysisClearanceService.selectAliexpressSkuAnalysisClearanceList(aliexpressSkuAnalysisClearance);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:list')")
    @GetMapping("/listTotal")
    public TableDataInfo listTotal(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        List<AliexpressSkuStatistics> list = aliexpressSkuAnalysisClearanceService.selectAliexpressSkuStatistics(aliexpressSkuAnalysis);
        return getDataTable(list);
    }



    /**
     * 导出清仓库存列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:clearance:export')")
    @Log(title = "清仓库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressSkuAnalysis aliexpressSkuAnalysisClearance)
    {
        List<AliexpressSkuAnalysis> list = aliexpressSkuAnalysisClearanceService.selectAliexpressSkuAnalysisClearanceList(aliexpressSkuAnalysisClearance);
        ExcelUtil<AliexpressSkuAnalysis> util = new ExcelUtil<AliexpressSkuAnalysis>(AliexpressSkuAnalysis.class);
        util.exportExcel(response, list, "清仓库存数据");
    }

    /**
     * 获取清仓库存详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:clearance:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(aliexpressSkuAnalysisClearanceService.selectAliexpressSkuAnalysisClearanceById(id));
    }

    /**
     * 新增清仓库存
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:clearance:add')")
    @Log(title = "清仓库存", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressSkuAnalysis aliexpressSkuAnalysisClearance)
    {
        return toAjax(aliexpressSkuAnalysisClearanceService.insertAliexpressSkuAnalysisClearance(aliexpressSkuAnalysisClearance));
    }

    /**
     * 修改清仓库存
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:clearance:edit')")
    @Log(title = "清仓库存", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressSkuAnalysis aliexpressSkuAnalysisClearance)
    {
        return toAjax(aliexpressSkuAnalysisClearanceService.updateAliexpressSkuAnalysisClearance(aliexpressSkuAnalysisClearance));
    }

    /**
     * 删除清仓库存
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:clearance:remove')")
    @Log(title = "清仓库存", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(aliexpressSkuAnalysisClearanceService.deleteAliexpressSkuAnalysisClearanceByIds(ids));
    }
}
