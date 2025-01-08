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
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseCategory;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 马帮后台导出金额订单数据Controller
 * 
 * @author ruoyi
 * @date 2025-01-08
 */
@RestController
@RequestMapping("/aliexpress/category")
public class PofitOrderListWarehouseCategoryController extends BaseController
{
    @Autowired
    private IPofitOrderListWarehouseCategoryService pofitOrderListWarehouseCategoryService;

    /**
     * 查询马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory)
    {
        startPage();
        List<PofitOrderListWarehouseCategory> list = pofitOrderListWarehouseCategoryService.selectPofitOrderListWarehouseCategoryList(pofitOrderListWarehouseCategory);
        return getDataTable(list);
    }

    /**
     * 导出马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:category:export')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory)
    {
        List<PofitOrderListWarehouseCategory> list = pofitOrderListWarehouseCategoryService.selectPofitOrderListWarehouseCategoryList(pofitOrderListWarehouseCategory);
        ExcelUtil<PofitOrderListWarehouseCategory> util = new ExcelUtil<PofitOrderListWarehouseCategory>(PofitOrderListWarehouseCategory.class);
        util.exportExcel(response, list, "马帮后台导出金额订单数据数据");
    }

    /**
     * 获取马帮后台导出金额订单数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:category:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(pofitOrderListWarehouseCategoryService.selectPofitOrderListWarehouseCategoryBySId(sId));
    }

    /**
     * 新增马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:category:add')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory)
    {
        return toAjax(pofitOrderListWarehouseCategoryService.insertPofitOrderListWarehouseCategory(pofitOrderListWarehouseCategory));
    }

    /**
     * 修改马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:category:edit')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PofitOrderListWarehouseCategory pofitOrderListWarehouseCategory)
    {
        return toAjax(pofitOrderListWarehouseCategoryService.updatePofitOrderListWarehouseCategory(pofitOrderListWarehouseCategory));
    }

    /**
     * 删除马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:category:remove')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(pofitOrderListWarehouseCategoryService.deletePofitOrderListWarehouseCategoryBySIds(sIds));
    }
}
