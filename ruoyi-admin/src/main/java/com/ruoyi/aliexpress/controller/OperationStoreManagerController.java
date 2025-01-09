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
import com.ruoyi.aliexpress.domain.OperationStoreManager;
import com.ruoyi.aliexpress.service.IOperationStoreManagerService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 店长运营Controller
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
@RestController
@RequestMapping("/aliexpress/manager")
public class OperationStoreManagerController extends BaseController
{
    @Autowired
    private IOperationStoreManagerService operationStoreManagerService;

    /**
     * 查询店长运营列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:manager:list')")
    @GetMapping("/list")
    public TableDataInfo list(OperationStoreManager operationStoreManager)
    {
        startPage();
        List<OperationStoreManager> list = operationStoreManagerService.selectOperationStoreManagerList(operationStoreManager);
        return getDataTable(list);
    }

    /**
     * 导出店长运营列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:manager:export')")
    @Log(title = "店长运营", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OperationStoreManager operationStoreManager)
    {
        List<OperationStoreManager> list = operationStoreManagerService.selectOperationStoreManagerList(operationStoreManager);
        ExcelUtil<OperationStoreManager> util = new ExcelUtil<OperationStoreManager>(OperationStoreManager.class);
        util.exportExcel(response, list, "店长运营数据");
    }

    /**
     * 获取店长运营详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:manager:query')")
    @GetMapping(value = "/{sId}")
    public AjaxResult getInfo(@PathVariable("sId") Long sId)
    {
        return success(operationStoreManagerService.selectOperationStoreManagerBySId(sId));
    }

    /**
     * 新增店长运营
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:manager:add')")
    @Log(title = "店长运营", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OperationStoreManager operationStoreManager)
    {
        return toAjax(operationStoreManagerService.insertOperationStoreManager(operationStoreManager));
    }

    /**
     * 修改店长运营
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:manager:edit')")
    @Log(title = "店长运营", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OperationStoreManager operationStoreManager)
    {
        return toAjax(operationStoreManagerService.updateOperationStoreManager(operationStoreManager));
    }

    /**
     * 删除店长运营
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:manager:remove')")
    @Log(title = "店长运营", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sIds}")
    public AjaxResult remove(@PathVariable Long[] sIds)
    {
        return toAjax(operationStoreManagerService.deleteOperationStoreManagerBySIds(sIds));
    }
}
