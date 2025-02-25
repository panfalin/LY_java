package com.ruoyi.amazon.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.amazon.dto.AmzDataAnalysisTurnoverDTO;
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
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverMskulist;
import com.ruoyi.amazon.service.IAmzDataAnalysisTurnoverMskulistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 亚马逊数据分析，周转率，mskulist，这个是基础信息Controller
 * 
 * @author panfalin
 * @date 2025-02-19
 */
@RestController
@RequestMapping("/amazon/amzTurnover")
public class AmzDataAnalysisTurnoverMskulistController extends BaseController
{
    @Autowired
    private IAmzDataAnalysisTurnoverMskulistService amzDataAnalysisTurnoverMskulistService;

    /**
     * 查询亚马逊数据分析，周转率，mskulist，这个是基础信息列表
     */
    @PreAuthorize("@ss.hasPermi('amazon:amzTurnover:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist)
    {
        startPage();
        List<AmzDataAnalysisTurnoverMskulist> list = amzDataAnalysisTurnoverMskulistService.selectAmzDataAnalysisTurnoverMskulistList(amzDataAnalysisTurnoverMskulist);
        return getDataTable(list);
    }

    @PostMapping("/summary")
    public AjaxResult getAll(@RequestBody Map<String, Object> map)
    {
        AmzDataAnalysisTurnoverDTO amzDataAnalysisTurnoverSummary = amzDataAnalysisTurnoverMskulistService.getAmzDataAnalysisTurnoverMskulistAll(map);
        return AjaxResult.success(amzDataAnalysisTurnoverSummary);
    }

    @GetMapping("/getStoreList")
    public AjaxResult getStoreList() {
        List<String> storeList = amzDataAnalysisTurnoverMskulistService.selectDistinctStoreNames();
        return success(storeList);
    }

    @GetMapping("/getSalesPersonList")
    public AjaxResult getSalesPersonList() {
        List<String> salesPersonList = amzDataAnalysisTurnoverMskulistService.selectDistinctSalesPersons();
        return success(salesPersonList);
    }

    @GetMapping("/getDeveloperList")
    public AjaxResult getDeveloperList() {
        List<String> developerList = amzDataAnalysisTurnoverMskulistService.selectDistinctDevelopers();
        return success(developerList);
    }

    /**
     * 导出亚马逊数据分析，周转率，mskulist，这个是基础信息列表
     */
    @PreAuthorize("@ss.hasPermi('amazon:amzTurnover:export')")
    @Log(title = "亚马逊数据分析，周转率，mskulist，这个是基础信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist)
    {
        List<AmzDataAnalysisTurnoverMskulist> list = amzDataAnalysisTurnoverMskulistService.selectAmzDataAnalysisTurnoverMskulistList(amzDataAnalysisTurnoverMskulist);
        ExcelUtil<AmzDataAnalysisTurnoverMskulist> util = new ExcelUtil<AmzDataAnalysisTurnoverMskulist>(AmzDataAnalysisTurnoverMskulist.class);
        util.exportExcel(response, list, "亚马逊数据分析，周转率，mskulist，这个是基础信息数据");
    }

    /**
     * 获取亚马逊数据分析，周转率，mskulist，这个是基础信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('amazon:amzTurnover:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(amzDataAnalysisTurnoverMskulistService.selectAmzDataAnalysisTurnoverMskulistById(id));
    }

    /**
     * 新增亚马逊数据分析，周转率，mskulist，这个是基础信息
     */
    @PreAuthorize("@ss.hasPermi('amazon:amzTurnover:add')")
    @Log(title = "亚马逊数据分析，周转率，mskulist，这个是基础信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist)
    {
        return toAjax(amzDataAnalysisTurnoverMskulistService.insertAmzDataAnalysisTurnoverMskulist(amzDataAnalysisTurnoverMskulist));
    }

    /**
     * 修改亚马逊数据分析，周转率，mskulist，这个是基础信息
     */
    @PreAuthorize("@ss.hasPermi('amazon:amzTurnover:edit')")
    @Log(title = "亚马逊数据分析，周转率，mskulist，这个是基础信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist)
    {
        return toAjax(amzDataAnalysisTurnoverMskulistService.updateAmzDataAnalysisTurnoverMskulist(amzDataAnalysisTurnoverMskulist));
    }

    /**
     * 删除亚马逊数据分析，周转率，mskulist，这个是基础信息
     */
    @PreAuthorize("@ss.hasPermi('amazon:amzTurnover:remove')")
    @Log(title = "亚马逊数据分析，周转率，mskulist，这个是基础信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(amzDataAnalysisTurnoverMskulistService.deleteAmzDataAnalysisTurnoverMskulistByIds(ids));
    }
}
