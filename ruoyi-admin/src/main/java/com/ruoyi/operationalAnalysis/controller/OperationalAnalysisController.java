package com.ruoyi.operationalAnalysis.controller;

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
import com.ruoyi.operationalAnalysis.domain.OperationalAnalysis;
import com.ruoyi.operationalAnalysis.service.IOperationalAnalysisService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运营分析Controller
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@RestController
@RequestMapping("/operationalAnalysis/operationalAnalysis")
public class OperationalAnalysisController extends BaseController
{
    @Autowired
    private IOperationalAnalysisService operationalAnalysisService;

    /**
     * 查询运营分析列表
     */
    @PreAuthorize("@ss.hasPermi('operationalAnalysis:operationalAnalysis:list')")
    @GetMapping("/list")
    public TableDataInfo list(OperationalAnalysis operationalAnalysis)
    {
        startPage();
        List<OperationalAnalysis> list = operationalAnalysisService.selectOperationalAnalysisList(operationalAnalysis);
        return getDataTable(list);
    }

    /**
     * 导出运营分析列表
     */
    @PreAuthorize("@ss.hasPermi('operationalAnalysis:operationalAnalysis:export')")
    @Log(title = "运营分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OperationalAnalysis operationalAnalysis)
    {
        List<OperationalAnalysis> list = operationalAnalysisService.selectOperationalAnalysisList(operationalAnalysis);
        ExcelUtil<OperationalAnalysis> util = new ExcelUtil<OperationalAnalysis>(OperationalAnalysis.class);
        util.exportExcel(response, list, "运营分析数据");
    }

    /**
     * 获取运营分析详细信息
     */
    @PreAuthorize("@ss.hasPermi('operationalAnalysis:operationalAnalysis:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(operationalAnalysisService.selectOperationalAnalysisById(id));
    }

    /**
     * 新增运营分析
     */
    @PreAuthorize("@ss.hasPermi('operationalAnalysis:operationalAnalysis:add')")
    @Log(title = "运营分析", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OperationalAnalysis operationalAnalysis)
    {
        return toAjax(operationalAnalysisService.insertOperationalAnalysis(operationalAnalysis));
    }

    /**
     * 修改运营分析
     */
    @PreAuthorize("@ss.hasPermi('operationalAnalysis:operationalAnalysis:edit')")
    @Log(title = "运营分析", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OperationalAnalysis operationalAnalysis)
    {
        return toAjax(operationalAnalysisService.updateOperationalAnalysis(operationalAnalysis));
    }

    /**
     * 删除运营分析
     */
    @PreAuthorize("@ss.hasPermi('operationalAnalysis:operationalAnalysis:remove')")
    @Log(title = "运营分析", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(operationalAnalysisService.deleteOperationalAnalysisByIds(ids));
    }
}
