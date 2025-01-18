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
import com.ruoyi.aliexpress.domain.AliexpressCompetitionInformation;
import com.ruoyi.aliexpress.service.IAliexpressCompetitionInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 竞对信息Controller
 * 
 * @author ruoyi
 * @date 2025-01-16
 */
@RestController
@RequestMapping("/aliexpress/information")
public class AliexpressCompetitionInformationController extends BaseController
{
    @Autowired
    private IAliexpressCompetitionInformationService aliexpressCompetitionInformationService;

    /**
     * 查询竞对信息列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:information:list')")
    @GetMapping("/list")
    public TableDataInfo list(AliexpressCompetitionInformation aliexpressCompetitionInformation)
    {
        startPage();
        List<AliexpressCompetitionInformation> list = aliexpressCompetitionInformationService.selectAliexpressCompetitionInformationList(aliexpressCompetitionInformation);
        return getDataTable(list);
    }

    /**
     * 导出竞对信息列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:information:export')")
    @Log(title = "竞对信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AliexpressCompetitionInformation aliexpressCompetitionInformation)
    {
        List<AliexpressCompetitionInformation> list = aliexpressCompetitionInformationService.selectAliexpressCompetitionInformationList(aliexpressCompetitionInformation);
        ExcelUtil<AliexpressCompetitionInformation> util = new ExcelUtil<AliexpressCompetitionInformation>(AliexpressCompetitionInformation.class);
        util.exportExcel(response, list, "竞对信息数据");
    }

    /**
     * 获取竞对信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:information:query')")
    @GetMapping(value = "/{sku}")
    public AjaxResult getInfo(@PathVariable("sku") String sku)
    {
        return success(aliexpressCompetitionInformationService.selectAliexpressCompetitionInformationBySku(sku));
    }

    /**
     * 新增竞对信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:information:add')")
    @Log(title = "竞对信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AliexpressCompetitionInformation aliexpressCompetitionInformation)
    {
        return toAjax(aliexpressCompetitionInformationService.insertAliexpressCompetitionInformation(aliexpressCompetitionInformation));
    }

    /**
     * 修改竞对信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:information:edit')")
    @Log(title = "竞对信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AliexpressCompetitionInformation aliexpressCompetitionInformation)
    {
        return toAjax(aliexpressCompetitionInformationService.updateAliexpressCompetitionInformation(aliexpressCompetitionInformation));
    }

    /**
     * 删除竞对信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:information:remove')")
    @Log(title = "竞对信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{skus}")
    public AjaxResult remove(@PathVariable String[] skus)
    {
        return toAjax(aliexpressCompetitionInformationService.deleteAliexpressCompetitionInformationBySkus(skus));
    }
}
