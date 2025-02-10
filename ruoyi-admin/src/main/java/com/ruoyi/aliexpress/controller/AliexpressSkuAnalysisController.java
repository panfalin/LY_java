package com.ruoyi.aliexpress.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

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
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.service.IAliexpressSkuAnalysisService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通滞销SKU分析Controller
 * 
 * @author ruoyi
 * @date 2025-01-21
 */
@RestController
@RequestMapping("/aliexpress/slowMovingInventory")
public class AliexpressSkuAnalysisController extends BaseController
{
    @Autowired
    private IAliexpressSkuAnalysisService aliexpressSkuAnalysisService;

    /**
     * 查询速卖通滞销SKU分析列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        startPage();
        List<AliexpressSkuAnalysis> list = aliexpressSkuAnalysisService.selectAliexpressSkuAnalysisList(aliexpressSkuAnalysis);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:list')")
    @GetMapping("/listTotal")
    public TableDataInfo listTotal(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        List<AliexpressSkuStatistics> list = aliexpressSkuAnalysisService.selectAliexpressSkuStatistics(aliexpressSkuAnalysis);
        return getDataTable(list);
    }



    /**
     * 导出速卖通滞销SKU分析列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:export')")
    @Log(title = "速卖通滞销SKU分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        List<AliexpressSkuAnalysis> list = aliexpressSkuAnalysisService.selectAliexpressSkuAnalysisList(aliexpressSkuAnalysis);
        ExcelUtil<AliexpressSkuAnalysis> util = new ExcelUtil<AliexpressSkuAnalysis>(AliexpressSkuAnalysis.class);
        util.exportExcel(response, list, "速卖通滞销SKU分析数据");
    }

    /**
     * 获取速卖通滞销SKU分析详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(aliexpressSkuAnalysisService.selectAliexpressSkuAnalysisById(id));
    }

    /**
     * 新增速卖通滞销SKU分析
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:add')")
    @Log(title = "速卖通滞销SKU分析", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        return toAjax(aliexpressSkuAnalysisService.insertAliexpressSkuAnalysis(aliexpressSkuAnalysis));
    }

    /**
     * 修改速卖通滞销SKU分析
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:edit')")
    @Log(title = "速卖通滞销SKU分析", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        return toAjax(aliexpressSkuAnalysisService.updateAliexpressSkuAnalysis(aliexpressSkuAnalysis));
    }

    /**
     * 删除速卖通滞销SKU分析
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:slowMovingInventory:remove')")
    @Log(title = "速卖通滞销SKU分析", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(aliexpressSkuAnalysisService.deleteAliexpressSkuAnalysisByIds(ids));
    }
}
