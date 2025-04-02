package com.ruoyi.amazon.controller;

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
import com.ruoyi.amazon.domain.AmzSearchTemplate;
import com.ruoyi.amazon.service.IAmzSearchTemplateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 搜索模板Controller
 * 
 * @author panfalin
 * @date 2025-04-02
 */
@RestController
@RequestMapping("/amazon/template")
public class AmzSearchTemplateController extends BaseController
{
    @Autowired
    private IAmzSearchTemplateService amzSearchTemplateService;

    /**
     * 查询搜索模板列表
     */
    @PreAuthorize("@ss.hasPermi('amazon:template:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzSearchTemplate amzSearchTemplate)
    {
        startPage();
        List<AmzSearchTemplate> list = amzSearchTemplateService.selectAmzSearchTemplateList(amzSearchTemplate);
        return getDataTable(list);
    }

    /**
     * 导出搜索模板列表
     */
    @PreAuthorize("@ss.hasPermi('amazon:template:export')")
    @Log(title = "搜索模板", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzSearchTemplate amzSearchTemplate)
    {
        List<AmzSearchTemplate> list = amzSearchTemplateService.selectAmzSearchTemplateList(amzSearchTemplate);
        ExcelUtil<AmzSearchTemplate> util = new ExcelUtil<AmzSearchTemplate>(AmzSearchTemplate.class);
        util.exportExcel(response, list, "搜索模板数据");
    }

    /**
     * 获取搜索模板详细信息
     */
    @PreAuthorize("@ss.hasPermi('amazon:template:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(amzSearchTemplateService.selectAmzSearchTemplateById(id));
    }

    /**
     * 新增搜索模板
     */
    @PreAuthorize("@ss.hasPermi('amazon:template:add')")
    @Log(title = "搜索模板", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzSearchTemplate amzSearchTemplate)
    {
        return toAjax(amzSearchTemplateService.insertAmzSearchTemplate(amzSearchTemplate));
    }

    /**
     * 修改搜索模板
     */
    @PreAuthorize("@ss.hasPermi('amazon:template:edit')")
    @Log(title = "搜索模板", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzSearchTemplate amzSearchTemplate)
    {
        return toAjax(amzSearchTemplateService.updateAmzSearchTemplate(amzSearchTemplate));
    }

    /**
     * 删除搜索模板
     */
    @PreAuthorize("@ss.hasPermi('amazon:template:remove')")
    @Log(title = "搜索模板", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(amzSearchTemplateService.deleteAmzSearchTemplateByIds(ids));
    }
}
