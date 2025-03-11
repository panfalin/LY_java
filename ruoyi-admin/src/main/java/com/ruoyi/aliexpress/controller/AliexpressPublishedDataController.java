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
import com.ruoyi.aliexpress.domain.AliexpressPublishedData;
import com.ruoyi.aliexpress.service.IAliexpressPublishedDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通刊登数据Controller
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
@RestController
@RequestMapping("/aliexpress/aliexpressPublishedData")
public class AliexpressPublishedDataController extends BaseController
{
    @Autowired
    private IAliexpressPublishedDataService aliexpressPublishedDataService;

    /**
     * 查询速卖通刊登数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedData:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressPublishedData aliexpressPublishedData)
    {
        startPage();
        List<AliexpressPublishedData> list = aliexpressPublishedDataService.selectAliexpressPublishedDataList(aliexpressPublishedData);
        return getDataTable(list);
    }

    /**
     * 导出速卖通刊登数据列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedData:export')")
    @Log(title = "速卖通刊登数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressPublishedData aliexpressPublishedData)
    {
        List<AliexpressPublishedData> list = aliexpressPublishedDataService.selectAliexpressPublishedDataList(aliexpressPublishedData);
        ExcelUtil<AliexpressPublishedData> util = new ExcelUtil<AliexpressPublishedData>(AliexpressPublishedData.class);
        util.exportExcel(response, list, "速卖通刊登数据数据");
    }

    /**
     * 获取速卖通刊登数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedData:query')")
    @GetMapping(value = "/{commodityId}")
    public AjaxResult getInfo(@PathVariable("commodityId") String commodityId)
    {
        return success(aliexpressPublishedDataService.selectAliexpressPublishedDataByCommodityId(commodityId));
    }

    /**
     * 新增速卖通刊登数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedData:add')")
    @Log(title = "速卖通刊登数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressPublishedData aliexpressPublishedData)
    {
        return toAjax(aliexpressPublishedDataService.insertAliexpressPublishedData(aliexpressPublishedData));
    }

    /**
     * 修改速卖通刊登数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedData:edit')")
    @Log(title = "速卖通刊登数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressPublishedData aliexpressPublishedData)
    {
        return toAjax(aliexpressPublishedDataService.updateAliexpressPublishedData(aliexpressPublishedData));
    }

    /**
     * 删除速卖通刊登数据
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:aliexpressPublishedData:remove')")
    @Log(title = "速卖通刊登数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{commodityIds}")
    public AjaxResult remove(@PathVariable String[] commodityIds)
    {
        return toAjax(aliexpressPublishedDataService.deleteAliexpressPublishedDataByCommodityIds(commodityIds));
    }
}
