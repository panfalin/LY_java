package com.ruoyi.kpi.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.kpi.domain.AmzKpiMain;
import com.ruoyi.kpi.domain.dto.KpiExportDTO;
import com.ruoyi.kpi.domain.dto.KpiSettingDTO;
import com.ruoyi.kpi.service.IAmzKpiMainService;
import com.ruoyi.kpi.util.KpiExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
    @GetMapping("/listWithDetails")
    public AjaxResult listWithDetails(AmzKpiMain amzKpiMain) {
        return success(amzKpiMainService.selectKpiListWithDetails(amzKpiMain));
    }

    /**
     * 设置KPI考核项
     */
    @Log(title = "KPI考核设置", businessType = BusinessType.INSERT)
    @PostMapping("/setTargets")
    public AjaxResult setKpiTargets(@RequestBody KpiSettingDTO kpiSetting) {
        return toAjax(amzKpiMainService.setKpiTargets(kpiSetting));
    }

    @Log(title = "KPI考核设置", businessType = BusinessType.UPDATE)
    @PostMapping("/editTargets")
    public AjaxResult editKpiTargets(@RequestBody KpiSettingDTO kpiSetting) {
        return toAjax(amzKpiMainService.editKpiTargets(kpiSetting));
    }

    @PostMapping("/exportTargets")
    public void exportTargets(HttpServletResponse response, @RequestBody AmzKpiMain amzKpiMain) {
        List<KpiExportDTO> list = amzKpiMainService.selectKpiExportList(amzKpiMain);
        
        // 获取用户信息
        AmzKpiMain kpi = amzKpiMainService.selectAmzKpiMainByKpiId(amzKpiMain.getKpiId());
        if (kpi == null) {
            throw new ServiceException("未找到该用户的KPI记录");
        }
        
        // 当前月份
        String currentMonth = DateUtils.parseDateToStr("yyyy年MM月", DateUtils.getNowDate());
        
        // 设置标题和表头
        String sheetName = "KPI考核表";

        // 根据部门设置不同的标题
        String department = kpi.getDepartment();
        String title;
        
        // 根据部门设置不同的标题
        if (department == null) {
            title = "KPI绩效考核表";
        } else if (("standard").equals(department)) {
            title = "开发部标准组-KPI绩效考核表";
        } else if (("standardparts").equals(department)) {
            title = "亚马逊美国站（标准件）运营部KPI考核表";
        } else if (("nonstandarddev").equals(department)) {
            title = "开发部非标组-KPI绩效考核表";
        } else if (("nonstandard").equals(department)) {
            title = "业务部非标组-KPI绩效考核表";
        } else if (("design").equals(department)) {
            title = "美工部（标准件）-KPI考核表";
        } else {
            title = department + "KPI绩效考核表";
        }
        
        // 构建信息行数据
        Map<String, String> infoMap = new HashMap<>();
        infoMap.put("department", kpi.getDepartment() != null ? kpi.getDepartment() : "开发部");
        infoMap.put("position", kpi.getUserName() != null ? kpi.getUserName() : "非标开发");
        infoMap.put("assessMonth", currentMonth);
        
        // 使用自定义导出
        KpiExcelUtil<KpiExportDTO> util = new KpiExcelUtil<KpiExportDTO>(KpiExportDTO.class);
        util.exportExcel(response, list, sheetName, title, infoMap);
    }
}
