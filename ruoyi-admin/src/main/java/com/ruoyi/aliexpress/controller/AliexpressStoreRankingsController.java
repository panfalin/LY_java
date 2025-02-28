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
import com.ruoyi.aliexpress.domain.AliexpressStoreRankings;
import com.ruoyi.aliexpress.service.IAliexpressStoreRankingsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通工具-店铺排名Controller
 * 
 * @author ruoyi
 * @date 2025-02-27
 */
@RestController
@RequestMapping("/aliexpress/toolRankings")
public class AliexpressStoreRankingsController extends BaseController
{
    @Autowired
    private IAliexpressStoreRankingsService aliexpressStoreRankingsService;

    /**
     * 查询速卖通工具-店铺排名列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:toolRankings:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressStoreRankings aliexpressStoreRankings)
    {
        startPage();
        List<AliexpressStoreRankings> list = aliexpressStoreRankingsService.selectAliexpressStoreRankingsList(aliexpressStoreRankings);
        return getDataTable(list);
    }

    /**
     * 导出速卖通工具-店铺排名列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:toolRankings:export')")
    @Log(title = "速卖通工具-店铺排名", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressStoreRankings aliexpressStoreRankings)
    {
        List<AliexpressStoreRankings> list = aliexpressStoreRankingsService.selectAliexpressStoreRankingsList(aliexpressStoreRankings);
        ExcelUtil<AliexpressStoreRankings> util = new ExcelUtil<AliexpressStoreRankings>(AliexpressStoreRankings.class);
        util.exportExcel(response, list, "速卖通工具-店铺排名数据");
    }

    /**
     * 获取速卖通工具-店铺排名详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:toolRankings:query')")
    @GetMapping(value = "/{shops}")
    public AjaxResult getInfo(@PathVariable("shops") String shops)
    {
        return success(aliexpressStoreRankingsService.selectAliexpressStoreRankingsByShops(shops));
    }

    /**
     * 新增速卖通工具-店铺排名
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:toolRankings:add')")
    @Log(title = "速卖通工具-店铺排名", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressStoreRankings aliexpressStoreRankings)
    {
        return toAjax(aliexpressStoreRankingsService.insertAliexpressStoreRankings(aliexpressStoreRankings));
    }

    /**
     * 修改速卖通工具-店铺排名
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:toolRankings:edit')")
    @Log(title = "速卖通工具-店铺排名", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressStoreRankings aliexpressStoreRankings)
    {
        return toAjax(aliexpressStoreRankingsService.updateAliexpressStoreRankings(aliexpressStoreRankings));
    }

    /**
     * 删除速卖通工具-店铺排名
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:toolRankings:remove')")
    @Log(title = "速卖通工具-店铺排名", businessType = BusinessType.DELETE)
	@DeleteMapping("/{shopss}")
    public AjaxResult remove(@PathVariable String[] shopss)
    {
        return toAjax(aliexpressStoreRankingsService.deleteAliexpressStoreRankingsByShopss(shopss));
    }
}
