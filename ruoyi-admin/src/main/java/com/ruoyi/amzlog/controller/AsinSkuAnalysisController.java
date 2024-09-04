package com.ruoyi.amzlog.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.mskulist.domain.Mskulist;
import com.ruoyi.mskulist.service.IMskulistService;
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
import com.ruoyi.amzlog.domain.AsinSkuAnalysis;
import com.ruoyi.amzlog.service.IAsinSkuAnalysisService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * amzlogController
 * 
 * @author ruoyi
 * @date 2024-08-29
 */
@RestController
@RequestMapping("/amzlog/analysis")
public class AsinSkuAnalysisController extends BaseController
{
    @Autowired
    private IAsinSkuAnalysisService asinSkuAnalysisService;

    @Autowired
    private IMskulistService mskulistService;

    /**
     * 查询amzlog列表
     */
    @PreAuthorize("@ss.hasPermi('amzlog:analysis:list')")
    @GetMapping("/list")
    public TableDataInfo list(AsinSkuAnalysis asinSkuAnalysis)
    {
        startPage();
        List<AsinSkuAnalysis> list = asinSkuAnalysisService.selectAsinSkuAnalysisList(asinSkuAnalysis);
        Mskulist mskulist = new Mskulist();
        int countMskulist = mskulistService.countMskulist(mskulist);
        TableDataInfo rspData = getDataTable(list);
        rspData.setTotal(countMskulist);
        return rspData;
    }

    /**
     * 导出amzlog列表
     */
    @PreAuthorize("@ss.hasPermi('amzlog:analysis:export')")
    @Log(title = "amzlog", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AsinSkuAnalysis asinSkuAnalysis)
    {
        List<AsinSkuAnalysis> list = asinSkuAnalysisService.selectAsinSkuAnalysisList(asinSkuAnalysis);
        ExcelUtil<AsinSkuAnalysis> util = new ExcelUtil<AsinSkuAnalysis>(AsinSkuAnalysis.class);
        util.exportExcel(response, list, "amzlog数据");
    }

    /**
     * 获取amzlog详细信息
     */
    @PreAuthorize("@ss.hasPermi('amzlog:analysis:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(asinSkuAnalysisService.selectAsinSkuAnalysisById(id));
    }

    /**
     * 新增amzlog
     */
    @PreAuthorize("@ss.hasPermi('amzlog:analysis:add')")
    @Log(title = "amzlog", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AsinSkuAnalysis asinSkuAnalysis)
    {
        return toAjax(asinSkuAnalysisService.insertAsinSkuAnalysis(asinSkuAnalysis));
    }

    /**
     * 修改amzlog
     */
    @PreAuthorize("@ss.hasPermi('amzlog:analysis:edit')")
    @Log(title = "amzlog", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AsinSkuAnalysis asinSkuAnalysis)
    {
        return toAjax(asinSkuAnalysisService.updateAsinSkuAnalysis(asinSkuAnalysis));
    }

    /**
     * 删除amzlog
     */
    @PreAuthorize("@ss.hasPermi('amzlog:analysis:remove')")
    @Log(title = "amzlog", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(asinSkuAnalysisService.deleteAsinSkuAnalysisByIds(ids));
    }
}
