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
import com.ruoyi.kingdee.domain.KingdeeSkuUsage;
import com.ruoyi.kingdee.service.IKingdeeSkuUsageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料使用记录Controller
 * 
 * @author panfalin
 * @date 2025-03-14
 */
@RestController
@RequestMapping("/kingdee/usage")
public class KingdeeSkuUsageController extends BaseController
{
    @Autowired
    private IKingdeeSkuUsageService kingdeeSkuUsageService;

    /**
     * 查询物料使用记录列表
     */
    @GetMapping("/list")
    public TableDataInfo list(KingdeeSkuUsage kingdeeSkuUsage)
    {
        startPage();
        List<KingdeeSkuUsage> list = kingdeeSkuUsageService.selectKingdeeSkuUsageList(kingdeeSkuUsage);
        return getDataTable(list);
    }

    /**
     * 导出物料使用记录列表
     */
    @Log(title = "物料使用记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KingdeeSkuUsage kingdeeSkuUsage)
    {
        List<KingdeeSkuUsage> list = kingdeeSkuUsageService.selectKingdeeSkuUsageList(kingdeeSkuUsage);
        ExcelUtil<KingdeeSkuUsage> util = new ExcelUtil<KingdeeSkuUsage>(KingdeeSkuUsage.class);
        util.exportExcel(response, list, "物料使用记录数据");
    }

    /**
     * 获取物料使用记录详细信息
     */
    @GetMapping(value = "/{skuCode}")
    public AjaxResult getInfo(@PathVariable("skuCode") String skuCode)
    {
        return success(kingdeeSkuUsageService.selectKingdeeSkuUsageBySkuCode(skuCode));
    }

    /**
     * 新增物料使用记录
     */
    @Log(title = "物料使用记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KingdeeSkuUsage kingdeeSkuUsage)
    {
        return toAjax(kingdeeSkuUsageService.insertKingdeeSkuUsage(kingdeeSkuUsage));
    }

    /**
     * 修改物料使用记录
     */
    @Log(title = "物料使用记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KingdeeSkuUsage kingdeeSkuUsage)
    {
        return toAjax(kingdeeSkuUsageService.updateKingdeeSkuUsage(kingdeeSkuUsage));
    }

    /**
     * 删除物料使用记录
     */
    @Log(title = "物料使用记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{skuCodes}")
    public AjaxResult remove(@PathVariable String[] skuCodes)
    {
        return toAjax(kingdeeSkuUsageService.deleteKingdeeSkuUsageBySkuCodes(skuCodes));
    }
}
