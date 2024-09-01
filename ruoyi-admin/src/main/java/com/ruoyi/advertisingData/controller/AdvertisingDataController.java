package com.ruoyi.advertisingData.controller;

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
import com.ruoyi.advertisingData.domain.AdvertisingData;
import com.ruoyi.advertisingData.service.IAdvertisingDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 广告数据Controller
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@RestController
@RequestMapping("/advertisingData/advertisingData")
public class AdvertisingDataController extends BaseController
{
    @Autowired
    private IAdvertisingDataService advertisingDataService;

    /**
     * 查询广告数据列表
     */
    @PreAuthorize("@ss.hasPermi('advertisingData:advertisingData:list')")
    @GetMapping("/list")
    public TableDataInfo list(AdvertisingData advertisingData)
    {
        startPage();
        List<AdvertisingData> list = advertisingDataService.selectAdvertisingDataList(advertisingData);
        return getDataTable(list);
    }

    /**
     * 导出广告数据列表
     */
    @PreAuthorize("@ss.hasPermi('advertisingData:advertisingData:export')")
    @Log(title = "广告数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AdvertisingData advertisingData)
    {
        List<AdvertisingData> list = advertisingDataService.selectAdvertisingDataList(advertisingData);
        ExcelUtil<AdvertisingData> util = new ExcelUtil<AdvertisingData>(AdvertisingData.class);
        util.exportExcel(response, list, "广告数据数据");
    }

    /**
     * 获取广告数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('advertisingData:advertisingData:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(advertisingDataService.selectAdvertisingDataById(id));
    }

    /**
     * 新增广告数据
     */
    @PreAuthorize("@ss.hasPermi('advertisingData:advertisingData:add')")
    @Log(title = "广告数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AdvertisingData advertisingData)
    {
        return toAjax(advertisingDataService.insertAdvertisingData(advertisingData));
    }

    /**
     * 修改广告数据
     */
    @PreAuthorize("@ss.hasPermi('advertisingData:advertisingData:edit')")
    @Log(title = "广告数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AdvertisingData advertisingData)
    {
        return toAjax(advertisingDataService.updateAdvertisingData(advertisingData));
    }

    /**
     * 删除广告数据
     */
    @PreAuthorize("@ss.hasPermi('advertisingData:advertisingData:remove')")
    @Log(title = "广告数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(advertisingDataService.deleteAdvertisingDataByIds(ids));
    }
}
