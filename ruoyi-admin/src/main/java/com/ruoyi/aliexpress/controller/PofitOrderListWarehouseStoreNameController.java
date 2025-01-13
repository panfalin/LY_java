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
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseStoreName;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseStoreNameService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 马帮后台导出金额订单数据Controller
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
@RestController
@RequestMapping("/aliexpress/statistics_shops")
public class PofitOrderListWarehouseStoreNameController extends BaseController
{
    @Autowired
    private IPofitOrderListWarehouseStoreNameService pofitOrderListWarehouseStoreNameService;

    /**
     * 查询马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:statistics_shops:list')")
    @GetMapping("/list")
    public TableDataInfo list(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        startPage();
        List<PofitOrderListWarehouseStoreName> list = pofitOrderListWarehouseStoreNameService.selectPofitOrderListWarehouseStoreNameList(pofitOrderListWarehouseStoreName);
        return getDataTable(list);
    }

    /**
     * 查询马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:statistics_shops:list')")
    @GetMapping("/listTotal")
    public TableDataInfo listTotal(PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        List<PofitOrderListWarehouseStoreName> list = pofitOrderListWarehouseStoreNameService.selectPofitOrderListWarehouseTotalList(pofitOrderListWarehouseStoreName);
        return getDataTable(list);
    }


    /**
     * 导出马帮后台导出金额订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:statistics_shops:export')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        List<PofitOrderListWarehouseStoreName> list = pofitOrderListWarehouseStoreNameService.selectPofitOrderListWarehouseStoreNameList(pofitOrderListWarehouseStoreName);
        ExcelUtil<PofitOrderListWarehouseStoreName> util = new ExcelUtil<PofitOrderListWarehouseStoreName>(PofitOrderListWarehouseStoreName.class);
        util.exportExcel(response, list, "马帮后台导出金额订单数据数据");
    }

    /**
     * 获取马帮后台导出金额订单数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:statistics_shops:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(pofitOrderListWarehouseStoreNameService.selectPofitOrderListWarehouseStoreNameBySId(sId));
    }

    /**
     * 新增马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:statistics_shops:add')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        return toAjax(pofitOrderListWarehouseStoreNameService.insertPofitOrderListWarehouseStoreName(pofitOrderListWarehouseStoreName));
    }

    /**
     * 修改马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:statistics_shops:edit')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PofitOrderListWarehouseStoreName pofitOrderListWarehouseStoreName)
    {
        return toAjax(pofitOrderListWarehouseStoreNameService.updatePofitOrderListWarehouseStoreName(pofitOrderListWarehouseStoreName));
    }

    /**
     * 删除马帮后台导出金额订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:statistics_shops:remove')")
    @Log(title = "马帮后台导出金额订单数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(pofitOrderListWarehouseStoreNameService.deletePofitOrderListWarehouseStoreNameBySIds(sIds));
    }
}
