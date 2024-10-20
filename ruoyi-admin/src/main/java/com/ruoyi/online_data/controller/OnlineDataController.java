package com.ruoyi.online_data.controller;

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
import com.ruoyi.online_data.domain.OnlineData;
import com.ruoyi.online_data.service.IOnlineDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通分析-刊登数据Controller
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
@RestController
@RequestMapping("/online_data/online_data")
public class OnlineDataController extends BaseController
{
    @Autowired
    private IOnlineDataService onlineDataService;

    /**
     * 查询速卖通分析-刊登数据列表
     */
    @PreAuthorize("@ss.hasPermi('online_data:online_data:list')")
    @GetMapping("/list")
    public TableDataInfo list(OnlineData onlineData)
    {
        startPage();
        List<OnlineData> list = onlineDataService.selectOnlineDataList(onlineData);
        return getDataTable(list);
    }

    /**
     * 导出速卖通分析-刊登数据列表
     */
    @PreAuthorize("@ss.hasPermi('online_data:online_data:export')")
    @Log(title = "速卖通分析-刊登数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OnlineData onlineData)
    {
        List<OnlineData> list = onlineDataService.selectOnlineDataList(onlineData);
        ExcelUtil<OnlineData> util = new ExcelUtil<OnlineData>(OnlineData.class);
        util.exportExcel(response, list, "速卖通分析-刊登数据数据");
    }

    /**
     * 获取速卖通分析-刊登数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('online_data:online_data:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(onlineDataService.selectOnlineDataById(id));
    }

    /**
     * 新增速卖通分析-刊登数据
     */
    @PreAuthorize("@ss.hasPermi('online_data:online_data:add')")
    @Log(title = "速卖通分析-刊登数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OnlineData onlineData)
    {
        return toAjax(onlineDataService.insertOnlineData(onlineData));
    }

    /**
     * 修改速卖通分析-刊登数据
     */
    @PreAuthorize("@ss.hasPermi('online_data:online_data:edit')")
    @Log(title = "速卖通分析-刊登数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OnlineData onlineData)
    {
        return toAjax(onlineDataService.updateOnlineData(onlineData));
    }

    /**
     * 删除速卖通分析-刊登数据
     */
    @PreAuthorize("@ss.hasPermi('online_data:online_data:remove')")
    @Log(title = "速卖通分析-刊登数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(onlineDataService.deleteOnlineDataByIds(ids));
    }
}
