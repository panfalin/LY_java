package com.ruoyi.operationRecords.controller;

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
import com.ruoyi.operationRecords.domain.OperationRecords;
import com.ruoyi.operationRecords.service.IOperationRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 操作记录Controller
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
@RestController
@RequestMapping("/operationRecords/records")
public class OperationRecordsController extends BaseController
{
    @Autowired
    private IOperationRecordsService operationRecordsService;

    /**
     * 查询操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('operationRecords:records:list')")
    @GetMapping("/list")
    public TableDataInfo list(OperationRecords operationRecords)
    {
        startPage();
        List<OperationRecords> list = operationRecordsService.selectOperationRecordsList(operationRecords);
        return getDataTable(list);
    }

    /**
     * 导出操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('operationRecords:records:export')")
    @Log(title = "操作记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OperationRecords operationRecords)
    {
        List<OperationRecords> list = operationRecordsService.selectOperationRecordsList(operationRecords);
        ExcelUtil<OperationRecords> util = new ExcelUtil<OperationRecords>(OperationRecords.class);
        util.exportExcel(response, list, "操作记录数据");
    }

    /**
     * 获取操作记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('operationRecords:records:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(operationRecordsService.selectOperationRecordsById(id));
    }

    /**
     * 新增操作记录
     */
    @PreAuthorize("@ss.hasPermi('operationRecords:records:add')")
    @Log(title = "操作记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OperationRecords operationRecords)
    {
        return toAjax(operationRecordsService.insertOperationRecords(operationRecords));
    }

    /**
     * 修改操作记录
     */
    @PreAuthorize("@ss.hasPermi('operationRecords:records:edit')")
    @Log(title = "操作记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OperationRecords operationRecords)
    {
        return toAjax(operationRecordsService.updateOperationRecords(operationRecords));
    }

    /**
     * 删除操作记录
     */
    @PreAuthorize("@ss.hasPermi('operationRecords:records:remove')")
    @Log(title = "操作记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(operationRecordsService.deleteOperationRecordsByIds(ids));
    }
}
