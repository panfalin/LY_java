package com.ruoyi.aliexpress.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.aliexpress.domain.AliexpressPublishedData;
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
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataAuto;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataAutoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 刊登数据-全托管Controller
 * 
 * @author ruoyi
 * @date 2025-03-17
 */
@RestController
@RequestMapping("/aliexpress/aliexpressPublishedDataAuto")
public class AliexpressPublishedDataAutoController extends BaseController
{
    @Autowired
    private IAliexpressPublishedDataAutoService aliexpressPublishedDataAutoService;

    /**
     * 查询刊登数据-全托管列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedDataAuto:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        startPage();
        List<AliexpressPublishedDataAuto> list = aliexpressPublishedDataAutoService.selectAliexpressPublishedDataAutoList(aliexpressPublishedDataAuto);
        return getDataTable(list);
    }

    /**
     * 查询速卖通刊登数据统计列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedData:list')")
    @GetMapping("/listTotal")
    public TableDataInfo listTotal(AliexpressPublishedDataAuto aliexpressPublishedDataAuto) {
        List<AliexpressPublishedDataAuto> list = aliexpressPublishedDataAutoService.selectAliexpressPublishedDataAutoStatisticsList(aliexpressPublishedDataAuto);
        return getDataTable(list);
    }


    /**
     * 导出刊登数据-全托管列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedDataAuto:export')")
    @Log(title = "刊登数据-全托管", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        List<AliexpressPublishedDataAuto> list = aliexpressPublishedDataAutoService.selectAliexpressPublishedDataAutoList(aliexpressPublishedDataAuto);
        ExcelUtil<AliexpressPublishedDataAuto> util = new ExcelUtil<AliexpressPublishedDataAuto>(AliexpressPublishedDataAuto.class);
        util.exportExcel(response, list, "刊登数据-全托管数据");
    }

    /**
     * 获取刊登数据-全托管详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedDataAuto:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(aliexpressPublishedDataAutoService.selectAliexpressPublishedDataAutoBySId(sId));
    }

    /**
     * 新增刊登数据-全托管
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedDataAuto:add')")
    @Log(title = "刊登数据-全托管", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        return toAjax(aliexpressPublishedDataAutoService.insertAliexpressPublishedDataAuto(aliexpressPublishedDataAuto));
    }

    /**
     * 修改刊登数据-全托管
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedDataAuto:edit')")
    @Log(title = "刊登数据-全托管", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressPublishedDataAuto aliexpressPublishedDataAuto)
    {
        return toAjax(aliexpressPublishedDataAutoService.updateAliexpressPublishedDataAuto(aliexpressPublishedDataAuto));
    }

    /**
     * 删除刊登数据-全托管
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedDataAuto:remove')")
    @Log(title = "刊登数据-全托管", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(aliexpressPublishedDataAutoService.deleteAliexpressPublishedDataAutoBySIds(sIds));
    }
}
