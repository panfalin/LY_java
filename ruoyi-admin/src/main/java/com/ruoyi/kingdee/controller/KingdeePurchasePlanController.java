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
import com.ruoyi.kingdee.domain.KingdeePurchasePlan;
import com.ruoyi.kingdee.service.IKingdeePurchasePlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 金蝶采购计划Controller
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@RestController
@RequestMapping("/kingdee/purchasePlan")
public class KingdeePurchasePlanController extends BaseController
{
    @Autowired
    private IKingdeePurchasePlanService kingdeePurchasePlanService;

    /**
     * 查询金蝶采购计划列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchasePlan:list')")
    @GetMapping("/list")
    public TableDataInfo list(KingdeePurchasePlan kingdeePurchasePlan)
    {
        startPage();
        List<KingdeePurchasePlan> list = kingdeePurchasePlanService.selectKingdeePurchasePlanList(kingdeePurchasePlan);
        return getDataTable(list);
    }

    /**
     * 导出金蝶采购计划列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchasePlan:export')")
    @Log(title = "金蝶采购计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KingdeePurchasePlan kingdeePurchasePlan)
    {
        List<KingdeePurchasePlan> list = kingdeePurchasePlanService.selectKingdeePurchasePlanList(kingdeePurchasePlan);
        ExcelUtil<KingdeePurchasePlan> util = new ExcelUtil<KingdeePurchasePlan>(KingdeePurchasePlan.class);
        util.exportExcel(response, list, "金蝶采购计划数据");
    }

    /**
     * 获取金蝶采购计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchasePlan:query')")
    @GetMapping(value = "/{skuCode}")
    public AjaxResult getInfo(@PathVariable("skuCode") String skuCode)
    {
        return success(kingdeePurchasePlanService.selectKingdeePurchasePlanBySkuCode(skuCode));
    }

    /**
     * 新增金蝶采购计划
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchasePlan:add')")
    @Log(title = "金蝶采购计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KingdeePurchasePlan kingdeePurchasePlan)
    {
        return toAjax(kingdeePurchasePlanService.insertKingdeePurchasePlan(kingdeePurchasePlan));
    }

    /**
     * 修改金蝶采购计划
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchasePlan:edit')")
    @Log(title = "金蝶采购计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KingdeePurchasePlan kingdeePurchasePlan)
    {
        return toAjax(kingdeePurchasePlanService.updateKingdeePurchasePlan(kingdeePurchasePlan));
    }

    /**
     * 删除金蝶采购计划
     */
    @PreAuthorize("@ss.hasPermi('kingdee:purchasePlan:remove')")
    @Log(title = "金蝶采购计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{skuCodes}")
    public AjaxResult remove(@PathVariable String[] skuCodes)
    {
        return toAjax(kingdeePurchasePlanService.deleteKingdeePurchasePlanBySkuCodes(skuCodes));
    }
}
