package com.ruoyi.kingdee.controller;

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
import com.ruoyi.kingdee.domain.KingdeePurchaseOrderList;
import com.ruoyi.kingdee.service.IKingdeePurchaseOrderListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 金蝶采购订单列表Controller
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@RestController
@RequestMapping("/kingdee/purchaseList")
public class KingdeePurchaseOrderListController extends BaseController
{
    @Autowired
    private IKingdeePurchaseOrderListService kingdeePurchaseOrderListService;

    /**
     * 查询金蝶采购订单列表列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchaseList:list')")
    @GetMapping("/list")
    public TableDataInfo list(KingdeePurchaseOrderList kingdeePurchaseOrderList)
    {
        startPage();
        List<KingdeePurchaseOrderList> list = kingdeePurchaseOrderListService.selectKingdeePurchaseOrderListList(kingdeePurchaseOrderList);
        return getDataTable(list);
    }

    /**
     * 导出金蝶采购订单列表列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchaseList:export')")
    @Log(title = "金蝶采购订单列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KingdeePurchaseOrderList kingdeePurchaseOrderList)
    {
        List<KingdeePurchaseOrderList> list = kingdeePurchaseOrderListService.selectKingdeePurchaseOrderListList(kingdeePurchaseOrderList);
        ExcelUtil<KingdeePurchaseOrderList> util = new ExcelUtil<KingdeePurchaseOrderList>(KingdeePurchaseOrderList.class);
        util.exportExcel(response, list, "金蝶采购订单列表数据");
    }

    /**
     * 获取金蝶采购订单列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchaseList:query')")
    @GetMapping(value = "/{rk}")
    public AjaxResult getInfo(@PathVariable("rk") Long rk)
    {
        return success(kingdeePurchaseOrderListService.selectKingdeePurchaseOrderListByRk(rk));
    }

    /**
     * 新增金蝶采购订单列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchaseList:add')")
    @Log(title = "金蝶采购订单列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KingdeePurchaseOrderList kingdeePurchaseOrderList)
    {
        return toAjax(kingdeePurchaseOrderListService.insertKingdeePurchaseOrderList(kingdeePurchaseOrderList));
    }

    /**
     * 修改金蝶采购订单列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchaseList:edit')")
    @Log(title = "金蝶采购订单列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KingdeePurchaseOrderList kingdeePurchaseOrderList)
    {
        return toAjax(kingdeePurchaseOrderListService.updateKingdeePurchaseOrderList(kingdeePurchaseOrderList));
    }

    /**
     * 删除金蝶采购订单列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchaseList:remove')")
    @Log(title = "金蝶采购订单列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rks}")
    public AjaxResult remove(@PathVariable Long[] rks)
    {
        return toAjax(kingdeePurchaseOrderListService.deleteKingdeePurchaseOrderListByRks(rks));
    }
}
