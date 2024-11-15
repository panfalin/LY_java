package com.ruoyi.orders.controller;

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
import com.ruoyi.orders.domain.Stores;
import com.ruoyi.orders.service.IStoresService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通分析-店铺信息Controller
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
@RestController
@RequestMapping("/stores/stores")
public class StoresController extends BaseController
{
    @Autowired
    private IStoresService storesService;

    /**
     * 查询速卖通分析-店铺信息列表
     */
    @PreAuthorize("@ss.hasPermi('stores:stores:list')")
    @GetMapping("/list")
    public TableDataInfo list(Stores stores)
    {
        List<Stores> list = storesService.selectStoresList(stores);
        return getDataTable(list);
    }

    /**
     * 导出速卖通分析-店铺信息列表
     */
    @PreAuthorize("@ss.hasPermi('stores:stores:export')")
    @Log(title = "速卖通分析-店铺信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Stores stores)
    {
        List<Stores> list = storesService.selectStoresList(stores);
        ExcelUtil<Stores> util = new ExcelUtil<Stores>(Stores.class);
        util.exportExcel(response, list, "速卖通分析-店铺信息数据");
    }

    /**
     * 获取速卖通分析-店铺信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('stores:stores:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(storesService.selectStoresById(id));
    }

    /**
     * 新增速卖通分析-店铺信息
     */
    @PreAuthorize("@ss.hasPermi('stores:stores:add')")
    @Log(title = "速卖通分析-店铺信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Stores stores)
    {
        return toAjax(storesService.insertStores(stores));
    }

    /**
     * 修改速卖通分析-店铺信息
     */
    @PreAuthorize("@ss.hasPermi('stores:stores:edit')")
    @Log(title = "速卖通分析-店铺信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Stores stores)
    {
        return toAjax(storesService.updateStores(stores));
    }

    /**
     * 删除速卖通分析-店铺信息
     */
    @PreAuthorize("@ss.hasPermi('stores:stores:remove')")
    @Log(title = "速卖通分析-店铺信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(storesService.deleteStoresByIds(ids));
    }
}
