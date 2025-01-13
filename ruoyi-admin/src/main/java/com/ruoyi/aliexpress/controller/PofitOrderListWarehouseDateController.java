package com.ruoyi.aliexpress.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.page.PageDomain;
import com.ruoyi.common.core.page.TableSupport;
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
import com.ruoyi.aliexpress.domain.PofitOrderListWarehouseDate;
import com.ruoyi.aliexpress.service.IPofitOrderListWarehouseDateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 时间维度统计Controller
 * 
 * @author ruoyi
 * @date 2025-01-11
 */
@RestController
@RequestMapping("/aliexpress/date")
public class PofitOrderListWarehouseDateController extends BaseController
{
    @Autowired
    private IPofitOrderListWarehouseDateService pofitOrderListWarehouseDateService;

    /**
     * 查询时间维度统计列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:date:list')")
    @GetMapping("/list")
    public TableDataInfo list(PofitOrderListWarehouseDate pofitOrderListWarehouseDate)
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        if (pageDomain.getOrderByColumn()==null){
            startPage();
        }
        else {
            if (pageDomain.getOrderByColumn().split(",").length>1){
                startPage(pageDomain);
            }
            else {
                startPage();
            }
        }

        List<PofitOrderListWarehouseDate> list = pofitOrderListWarehouseDateService.selectPofitOrderListWarehouseDateList(pofitOrderListWarehouseDate);
        return getDataTable(list);
    }

    /**
     * 导出时间维度统计列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:date:export')")
    @Log(title = "时间维度统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PofitOrderListWarehouseDate pofitOrderListWarehouseDate)
    {
        List<PofitOrderListWarehouseDate> list = pofitOrderListWarehouseDateService.selectPofitOrderListWarehouseDateList(pofitOrderListWarehouseDate);
        ExcelUtil<PofitOrderListWarehouseDate> util = new ExcelUtil<PofitOrderListWarehouseDate>(PofitOrderListWarehouseDate.class);
        util.exportExcel(response, list, "时间维度统计数据");
    }

    /**
     * 获取时间维度统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:date:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(pofitOrderListWarehouseDateService.selectPofitOrderListWarehouseDateBySId(sId));
    }

    /**
     * 新增时间维度统计
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:date:add')")
    @Log(title = "时间维度统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PofitOrderListWarehouseDate pofitOrderListWarehouseDate)
    {
        return toAjax(pofitOrderListWarehouseDateService.insertPofitOrderListWarehouseDate(pofitOrderListWarehouseDate));
    }

    /**
     * 修改时间维度统计
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:date:edit')")
    @Log(title = "时间维度统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PofitOrderListWarehouseDate pofitOrderListWarehouseDate)
    {
        return toAjax(pofitOrderListWarehouseDateService.updatePofitOrderListWarehouseDate(pofitOrderListWarehouseDate));
    }

    /**
     * 删除时间维度统计
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:date:remove')")
    @Log(title = "时间维度统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(pofitOrderListWarehouseDateService.deletePofitOrderListWarehouseDateBySIds(sIds));
    }
}
