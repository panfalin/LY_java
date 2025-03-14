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
import com.ruoyi.aliexpress.domain.AliexpressPublishedDataChildren;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataChildrenService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通刊登子数据Controller
 * 
 * @author ruoyi
 * @date 2025-03-14
 */
@RestController
@RequestMapping("/aliexpress/PublishedDataChildren")
public class AliexpressPublishedDataChildrenController extends BaseController
{
    @Autowired
    private IAliexpressPublishedDataChildrenService aliexpressPublishedDataChildrenService;

    /**
     * 查询速卖通刊登子数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:PublishedDataChildren:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressPublishedDataChildren aliexpressPublishedDataChildren)
    {
        startPage();
        List<AliexpressPublishedDataChildren> list = aliexpressPublishedDataChildrenService.selectAliexpressPublishedDataChildrenList(aliexpressPublishedDataChildren);
        return getDataTable(list);
    }

    /**
     * 导出速卖通刊登子数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:PublishedDataChildren:export')")
    @Log(title = "速卖通刊登子数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressPublishedDataChildren aliexpressPublishedDataChildren)
    {
        List<AliexpressPublishedDataChildren> list = aliexpressPublishedDataChildrenService.selectAliexpressPublishedDataChildrenList(aliexpressPublishedDataChildren);
        ExcelUtil<AliexpressPublishedDataChildren> util = new ExcelUtil<AliexpressPublishedDataChildren>(AliexpressPublishedDataChildren.class);
        util.exportExcel(response, list, "速卖通刊登子数据数据");
    }

    /**
     * 获取速卖通刊登子数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:PublishedDataChildren:query')")
    @GetMapping(value = "/{commodityId}")
    public AjaxResult getInfo(@PathVariable("commodityId") String commodityId)
    {
        return success(aliexpressPublishedDataChildrenService.selectAliexpressPublishedDataChildrenByCommodityId(commodityId));
    }

    /**
     * 新增速卖通刊登子数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:PublishedDataChildren:add')")
    @Log(title = "速卖通刊登子数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressPublishedDataChildren aliexpressPublishedDataChildren)
    {
        return toAjax(aliexpressPublishedDataChildrenService.insertAliexpressPublishedDataChildren(aliexpressPublishedDataChildren));
    }

    /**
     * 修改速卖通刊登子数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:PublishedDataChildren:edit')")
    @Log(title = "速卖通刊登子数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressPublishedDataChildren aliexpressPublishedDataChildren)
    {
        return toAjax(aliexpressPublishedDataChildrenService.updateAliexpressPublishedDataChildren(aliexpressPublishedDataChildren));
    }

    /**
     * 删除速卖通刊登子数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:PublishedDataChildren:remove')")
    @Log(title = "速卖通刊登子数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{commodityIds}")
    public AjaxResult remove(@PathVariable String[] commodityIds)
    {
        return toAjax(aliexpressPublishedDataChildrenService.deleteAliexpressPublishedDataChildrenByCommodityIds(commodityIds));
    }
}
