package com.ruoyi.amazon.controller;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverOperationalAnalysis;
import com.ruoyi.amazon.domain.AmzDataAnalysisTurnoverSkuInfoTemplate;
import com.ruoyi.amazon.dto.AmzDataAnalysisTurnoverDTO;
import com.ruoyi.amazon.dto.AmzStoreRankingDTO;
import com.ruoyi.amazon.service.IAmzDataAnalysisTurnoverOperationalAnalysisService;
import com.ruoyi.amazon.service.IAmzDataAnalysisTurnoverSkuInfoTemplateService;
import org.springframework.beans.BeanUtils;
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

    @Autowired
    private IAmzDataAnalysisTurnoverOperationalAnalysisService amzDataAnalysisTurnoverOperationalAnalysisService;

    @Autowired
    private IAmzDataAnalysisTurnoverSkuInfoTemplateService amzDataAnalysisTurnoverSkuInfoTemplateService;

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

    @GetMapping("/getResetPersonList")
    public AjaxResult getResetPersonList() {
        List<String> resetPersons = amzDataAnalysisTurnoverMskulistService.selectDistinctResetPersons();
        return success(resetPersons);
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
    public void export(HttpServletResponse response, AmzDataAnalysisTurnoverMskulist amzDataAnalysisTurnoverMskulist) {
        try {
            // 1. 复制查询条件到其他两个对象
            AmzDataAnalysisTurnoverOperationalAnalysis operationalAnalysis = new AmzDataAnalysisTurnoverOperationalAnalysis();
            AmzDataAnalysisTurnoverSkuInfoTemplate skuInfoTemplate = new AmzDataAnalysisTurnoverSkuInfoTemplate();

            // 复制共同的查询条件
            BeanUtils.copyProperties(amzDataAnalysisTurnoverMskulist, operationalAnalysis);
            BeanUtils.copyProperties(amzDataAnalysisTurnoverMskulist, skuInfoTemplate);

            // 2. 查询数据（使用相同的查询条件）
            List<AmzDataAnalysisTurnoverMskulist> list1 =
                    amzDataAnalysisTurnoverMskulistService.selectAmzDataAnalysisTurnoverMskulistList(amzDataAnalysisTurnoverMskulist);

            List<AmzDataAnalysisTurnoverOperationalAnalysis> list2 =
                    amzDataAnalysisTurnoverOperationalAnalysisService.selectAmzDataAnalysisTurnoverOperationalAnalysisList(operationalAnalysis);

            List<AmzDataAnalysisTurnoverSkuInfoTemplate> list3 =
                    amzDataAnalysisTurnoverSkuInfoTemplateService.selectAmzDataAnalysisTurnoverSkuInfoTemplateList(skuInfoTemplate);

            // 3. 构造导出数据
            Map<String, List<Object>> sheetDataMap = new LinkedHashMap<>();
            sheetDataMap.put("SKU基础信息", new ArrayList<>(list1));
            sheetDataMap.put("运营分析", new ArrayList<>(list2));
            sheetDataMap.put("SKU信息模板", new ArrayList<>(list3));

            // 4. 设置文件名
            String fileName = URLEncoder.encode("库存分析_" + new SimpleDateFormat("yyyyMMdd").format(new Date()), "UTF-8");
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xlsx");

            // 5. 导出
            ExcelUtil<AmzDataAnalysisTurnoverMskulist> util = new ExcelUtil<>(AmzDataAnalysisTurnoverMskulist.class);
//            util.exportMultipleSheets(response, sheetDataMap, "库存分析");

        } catch (Exception e) {
            throw new RuntimeException("导出Excel失败: " + e.getMessage());
        }
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

    /**
     * 获取店铺排名数据
     */
    @GetMapping("/storeRanking")
    public AjaxResult getStoreRanking(AmzDataAnalysisTurnoverMskulist queryDTO) {
        List<AmzStoreRankingDTO> storeRanking = amzDataAnalysisTurnoverMskulistService.getStoreRanking(queryDTO);
        return AjaxResult.success(storeRanking);
    }
}
