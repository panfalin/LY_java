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
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouse;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 马帮后台导出金额订单数据Controller
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
@RestController
@RequestMapping("/statistics/statistics")
public class PofitOrderListWarehouseController extends BaseController
{
    @Autowired
    private IPofitOrderListWarehouseService pofitOrderListWarehouseService;

    /**
     * 查询马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('statistics:statistics:list')")
    @GetMapping("/list")
    public TableDataInfo list(PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        startPage();
        List<PofitOrderListWarehouse> list = pofitOrderListWarehouseService.selectPofitOrderListWarehouseList(pofitOrderListWarehouse);
        return getDataTable(list);
    }

    /**
     * 查询马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('statistics:statistics:list')")
    @GetMapping("/listToal")
    public TableDataInfo listTotal(PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        List<PofitOrderListWarehouse> list = pofitOrderListWarehouseService.selectPofitOrderListWarehouseTotalList(pofitOrderListWarehouse);
        return getDataTable(list);
    }



    /**
     * 导出马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('statistics:statistics:export')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        List<PofitOrderListWarehouse> list = pofitOrderListWarehouseService.selectPofitOrderListWarehouseList(pofitOrderListWarehouse);
        ExcelUtil<PofitOrderListWarehouse> util = new ExcelUtil<PofitOrderListWarehouse>(PofitOrderListWarehouse.class);
        util.exportExcel(response, list, "马帮后台导出金额订单数据数据");
    }

    /**
     * 获取马帮后台导出金额订单数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('statistics:statistics:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(pofitOrderListWarehouseService.selectPofitOrderListWarehouseBySId(sId));
    }

    /**
     * 新增马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('statistics:statistics:add')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        return toAjax(pofitOrderListWarehouseService.insertPofitOrderListWarehouse(pofitOrderListWarehouse));
    }

    /**
     * 修改马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('statistics:statistics:edit')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PofitOrderListWarehouse pofitOrderListWarehouse)
    {
        return toAjax(pofitOrderListWarehouseService.updatePofitOrderListWarehouse(pofitOrderListWarehouse));
    }

    /**
     * 删除马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('statistics:statistics:remove')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(pofitOrderListWarehouseService.deletePofitOrderListWarehouseBySIds(sIds));
    }
}
