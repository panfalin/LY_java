package com.ruoyi.aliexpress.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.aliexpress.domain.AliexpressStoreAutoProfit;
import com.ruoyi.common.utils.bean.BeanUtils;
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
import com.ruoyi.aliexpress.domain.AliexpressStoreProfit;
import com.ruoyi.aliexpress.service.IAliexpressStoreProfitService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 店铺利润汇总Controller
 * 
 * @author panfalin
 * @date 2024-12-11
 */
@RestController
@RequestMapping("/profit/profit")
public class AliexpressStoreProfitController extends BaseController
{
    @Autowired
    private IAliexpressStoreProfitService aliexpressStoreProfitService;

    /**
     * 查询店铺利润汇总列表
     */
    @PreAuthorize("@ss.hasPermi('profit:profit:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressStoreProfit aliexpressStoreProfit)
    {
        // startPage();
        List<AliexpressStoreProfit> list = aliexpressStoreProfitService.selectAliexpressStoreProfitList(aliexpressStoreProfit);
        return getDataTable(list);
    }

    /**
     * 导出店铺利润汇总列表
     */
    @PreAuthorize("@ss.hasPermi('profit:profit:export')")
    @Log(title = "店铺利润汇总", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressStoreProfit aliexpressStoreProfit)
    {
        List<AliexpressStoreProfit> list = aliexpressStoreProfitService.selectAliexpressStoreProfitList(aliexpressStoreProfit);
        ExcelUtil<AliexpressStoreProfit> util = new ExcelUtil<AliexpressStoreProfit>(AliexpressStoreProfit.class);
        util.exportExcel(response, list, "POP店铺利润汇总数据");
    }

    @PreAuthorize("@ss.hasPermi('profit:profit:export')")
    @Log(title = "店铺利润汇总", businessType = BusinessType.EXPORT)
    @PostMapping("/exportAuto")
    public void exportAuto(HttpServletResponse response, AliexpressStoreProfit aliexpressStoreProfit) {
        // 获取原始数据
        List<AliexpressStoreProfit> originList = aliexpressStoreProfitService.selectAliexpressStoreProfitList(aliexpressStoreProfit);
        List<AliexpressStoreAutoProfit> list = new ArrayList<>();

        // 遍历 originList，逐个复制属性到 AliexpressStoreAutoProfit 对象
        for (AliexpressStoreProfit origin : originList) {
            AliexpressStoreAutoProfit target = new AliexpressStoreAutoProfit();
            BeanUtils.copyProperties(origin, target); // 复制属性
            list.add(target); // 添加到目标列表
        }
        ExcelUtil<AliexpressStoreAutoProfit> util = new ExcelUtil<>(AliexpressStoreAutoProfit.class);
        util.exportExcel(response, list, "全托管店铺利润汇总数据");
    }

    /**
     * 获取店铺利润汇总详细信息
     */
    @PreAuthorize("@ss.hasPermi('profit:profit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(aliexpressStoreProfitService.selectAliexpressStoreProfitById(id));
    }

    /**
     * 新增店铺利润汇总
     */
    @PreAuthorize("@ss.hasPermi('profit:profit:add')")
    @Log(title = "店铺利润汇总", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressStoreProfit aliexpressStoreProfit)
    {
        return toAjax(aliexpressStoreProfitService.insertAliexpressStoreProfit(aliexpressStoreProfit));
    }

    /**
     * 修改店铺利润汇总
     */
    @PreAuthorize("@ss.hasPermi('profit:profit:edit')")
    @Log(title = "店铺利润汇总", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressStoreProfit aliexpressStoreProfit)
    {
        return toAjax(aliexpressStoreProfitService.updateAliexpressStoreProfit(aliexpressStoreProfit));
    }

    /**
     * 删除店铺利润汇总
     */
    @PreAuthorize("@ss.hasPermi('profit:profit:remove')")
    @Log(title = "店铺利润汇总", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(aliexpressStoreProfitService.deleteAliexpressStoreProfitByIds(ids));
    }
}
