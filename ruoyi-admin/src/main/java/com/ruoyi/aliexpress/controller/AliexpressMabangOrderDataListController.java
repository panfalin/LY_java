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
import com.ruoyi.aliexpress.domain.AliexpressMabangOrderDataList;
import com.ruoyi.aliexpress.service.IAliexpressMabangOrderDataListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 马帮订单数据Controller
 * 
 * @author ruoyi
 * @date 2025-01-18
 */
@RestController
@RequestMapping("/aliexpress/orderDataList")
public class AliexpressMabangOrderDataListController extends BaseController
{
    @Autowired
    private IAliexpressMabangOrderDataListService aliexpressMabangOrderDataListService;

    /**
     * 查询马帮订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:orderDataList:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        startPage();
        List<AliexpressMabangOrderDataList> list = aliexpressMabangOrderDataListService.selectAliexpressMabangOrderDataListList(aliexpressMabangOrderDataList);
        return getDataTable(list);
    }

    /**
     * 导出马帮订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:orderDataList:export')")
    @Log(title = "马帮订单数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        List<AliexpressMabangOrderDataList> list = aliexpressMabangOrderDataListService.selectAliexpressMabangOrderDataListList(aliexpressMabangOrderDataList);
        ExcelUtil<AliexpressMabangOrderDataList> util = new ExcelUtil<AliexpressMabangOrderDataList>(AliexpressMabangOrderDataList.class);
        util.exportExcel(response, list, "马帮订单数据数据");
    }

    /**
     * 获取马帮订单数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:orderDataList:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(aliexpressMabangOrderDataListService.selectAliexpressMabangOrderDataListBySId(sId));
    }

    /**
     * 新增马帮订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:orderDataList:add')")
    @Log(title = "马帮订单数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        return toAjax(aliexpressMabangOrderDataListService.insertAliexpressMabangOrderDataList(aliexpressMabangOrderDataList));
    }

    /**
     * 修改马帮订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:orderDataList:edit')")
    @Log(title = "马帮订单数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressMabangOrderDataList aliexpressMabangOrderDataList)
    {
        return toAjax(aliexpressMabangOrderDataListService.updateAliexpressMabangOrderDataList(aliexpressMabangOrderDataList));
    }

    /**
     * 删除马帮订单数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:orderDataList:remove')")
    @Log(title = "马帮订单数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(aliexpressMabangOrderDataListService.deleteAliexpressMabangOrderDataListBySIds(sIds));
    }
}
