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
import com.ruoyi.aliexpress.domain.AliexpressToolIndicators;
import com.ruoyi.aliexpress.service.IAliexpressToolIndicatorsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工具指标Controller
 * 
 * @author ruoyi
 * @date 2025-02-17
 */
@RestController
@RequestMapping("/aliexpress/indicators")
public class AliexpressToolIndicatorsController extends BaseController
{
    @Autowired
    private IAliexpressToolIndicatorsService aliexpressToolIndicatorsService;

    /**
     * 查询工具指标列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressToolIndicators aliexpressToolIndicators)
    {
        startPage();
        List<AliexpressToolIndicators> list = aliexpressToolIndicatorsService.selectAliexpressToolIndicatorsList(aliexpressToolIndicators);
        return getDataTable(list);
    }

    /**
     * 查询工具指标列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:list')")
    @GetMapping("/listShop")
    public TableDataInfo listShop(AliexpressToolIndicators aliexpressToolIndicators)
    {
        startPage();
        List<AliexpressToolIndicators> list = aliexpressToolIndicatorsService.selectAliexpressToolIndicatorsListShop(aliexpressToolIndicators);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:list')")
    @GetMapping("/listShopName")
    public TableDataInfo listShopName(AliexpressToolIndicators aliexpressToolIndicators)
    {
        startPage();
        List<AliexpressToolIndicators> list = aliexpressToolIndicatorsService.selectAliexpressToolIndicatorsListShopName(aliexpressToolIndicators);
        return getDataTable(list);
    }

    /**
     * 导出工具指标列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:export')")
    @Log(title = "工具指标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressToolIndicators aliexpressToolIndicators)
    {
        List<AliexpressToolIndicators> list = aliexpressToolIndicatorsService.selectAliexpressToolIndicatorsList(aliexpressToolIndicators);
        ExcelUtil<AliexpressToolIndicators> util = new ExcelUtil<AliexpressToolIndicators>(AliexpressToolIndicators.class);
        util.exportExcel(response, list, "工具指标数据");
    }

    /**
     * 获取工具指标详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(aliexpressToolIndicatorsService.selectAliexpressToolIndicatorsBySId(sId));
    }

    /**
     * 新增工具指标
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:add')")
    @Log(title = "工具指标", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressToolIndicators aliexpressToolIndicators)
    {
        return toAjax(aliexpressToolIndicatorsService.insertAliexpressToolIndicators(aliexpressToolIndicators));
    }

    /**
     * 修改工具指标
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:edit')")
    @Log(title = "工具指标", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressToolIndicators aliexpressToolIndicators)
    {
        return toAjax(aliexpressToolIndicatorsService.updateAliexpressToolIndicators(aliexpressToolIndicators));
    }

    /**
     * 删除工具指标
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:indicators:remove')")
    @Log(title = "工具指标", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(aliexpressToolIndicatorsService.deleteAliexpressToolIndicatorsBySIds(sIds));
    }
}
