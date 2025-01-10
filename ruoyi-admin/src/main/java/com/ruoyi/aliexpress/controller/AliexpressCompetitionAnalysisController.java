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
import com.ruoyi.aliexpress.domain.AliexpressCompetitionAnalysis;
import com.ruoyi.aliexpress.service.IAliexpressCompetitionAnalysisService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 竞对SKUController
 * 
 * @author ruoyi
 * @date 2025-01-10
 */
@RestController
@RequestMapping("/aliexpress/competition")
public class AliexpressCompetitionAnalysisController extends BaseController
{
    @Autowired
    private IAliexpressCompetitionAnalysisService aliexpressCompetitionAnalysisService;

    /**
     * 查询竞对SKU列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:competition:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis)
    {
        startPage();
        List<AliexpressCompetitionAnalysis> list = aliexpressCompetitionAnalysisService.selectAliexpressCompetitionAnalysisList(aliexpressCompetitionAnalysis);
        return getDataTable(list);
    }

    /**
     * 导出竞对SKU列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:competition:export')")
    @Log(title = "竞对SKU", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis)
    {
        List<AliexpressCompetitionAnalysis> list = aliexpressCompetitionAnalysisService.selectAliexpressCompetitionAnalysisList(aliexpressCompetitionAnalysis);
        ExcelUtil<AliexpressCompetitionAnalysis> util = new ExcelUtil<AliexpressCompetitionAnalysis>(AliexpressCompetitionAnalysis.class);
        util.exportExcel(response, list, "竞对SKU数据");
    }

    /**
     * 获取竞对SKU详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:competition:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(aliexpressCompetitionAnalysisService.selectAliexpressCompetitionAnalysisBySId(sId));
    }

    /**
     * 新增竞对SKU
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:competition:add')")
    @Log(title = "竞对SKU", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis)
    {
        return toAjax(aliexpressCompetitionAnalysisService.insertAliexpressCompetitionAnalysis(aliexpressCompetitionAnalysis));
    }

    /**
     * 修改竞对SKU
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:competition:edit')")
    @Log(title = "竞对SKU", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressCompetitionAnalysis aliexpressCompetitionAnalysis)
    {
        return toAjax(aliexpressCompetitionAnalysisService.updateAliexpressCompetitionAnalysis(aliexpressCompetitionAnalysis));
    }

    /**
     * 删除竞对SKU
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:competition:remove')")
    @Log(title = "竞对SKU", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(aliexpressCompetitionAnalysisService.deleteAliexpressCompetitionAnalysisBySIds(sIds));
    }
}
