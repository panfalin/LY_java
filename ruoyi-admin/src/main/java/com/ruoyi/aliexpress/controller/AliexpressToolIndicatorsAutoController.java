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
import com.ruoyi.aliexpress.domain.AliexpressToolIndicatorsAuto;
import com.ruoyi.aliexpress.service.IAliexpressToolIndicatorsAutoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工具指标-全托管Controller
 * 
 * @author ruoyi
 * @date 2025-02-26
 */
@RestController
@RequestMapping("/aliexpress/auto")
public class AliexpressToolIndicatorsAutoController extends BaseController
{
    @Autowired
    private IAliexpressToolIndicatorsAutoService aliexpressToolIndicatorsAutoService;

    /**
     * 查询工具指标-全托管列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:auto:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto)
    {
        startPage();
        List<AliexpressToolIndicatorsAuto> list = aliexpressToolIndicatorsAutoService.selectAliexpressToolIndicatorsAutoList(aliexpressToolIndicatorsAuto);
        return getDataTable(list);
    }

    /**
     * 导出工具指标-全托管列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:auto:export')")
    @Log(title = "工具指标-全托管", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto)
    {
        List<AliexpressToolIndicatorsAuto> list = aliexpressToolIndicatorsAutoService.selectAliexpressToolIndicatorsAutoList(aliexpressToolIndicatorsAuto);
        ExcelUtil<AliexpressToolIndicatorsAuto> util = new ExcelUtil<AliexpressToolIndicatorsAuto>(AliexpressToolIndicatorsAuto.class);
        util.exportExcel(response, list, "工具指标-全托管数据");
    }

    /**
     * 获取工具指标-全托管详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:auto:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(aliexpressToolIndicatorsAutoService.selectAliexpressToolIndicatorsAutoBySId(sId));
    }

    /**
     * 新增工具指标-全托管
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:auto:add')")
    @Log(title = "工具指标-全托管", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto)
    {
        return toAjax(aliexpressToolIndicatorsAutoService.insertAliexpressToolIndicatorsAuto(aliexpressToolIndicatorsAuto));
    }

    /**
     * 修改工具指标-全托管
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:auto:edit')")
    @Log(title = "工具指标-全托管", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressToolIndicatorsAuto aliexpressToolIndicatorsAuto)
    {
        return toAjax(aliexpressToolIndicatorsAutoService.updateAliexpressToolIndicatorsAuto(aliexpressToolIndicatorsAuto));
    }

    /**
     * 删除工具指标-全托管
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:auto:remove')")
    @Log(title = "工具指标-全托管", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(aliexpressToolIndicatorsAutoService.deleteAliexpressToolIndicatorsAutoBySIds(sIds));
    }
}
