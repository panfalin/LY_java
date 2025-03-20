package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskSnapshot;
import com.ruoyi.task.service.IAmzTaskSnapshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务数据快照Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/snapshot")
public class AmzTaskSnapshotController extends BaseController {
    @Autowired
    private IAmzTaskSnapshotService amzTaskSnapshotService;

    /**
     * 查询亚马逊任务数据快照列表
     */
    @PreAuthorize("@ss.hasPermi('task:snapshot:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskSnapshot amzTaskSnapshot) {
        startPage();
        List<AmzTaskSnapshot> list = amzTaskSnapshotService.selectAmzTaskSnapshotList(amzTaskSnapshot);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务数据快照列表
     */
    @PreAuthorize("@ss.hasPermi('task:snapshot:export')")
    @Log(title = "亚马逊任务数据快照", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskSnapshot amzTaskSnapshot) {
        List<AmzTaskSnapshot> list = amzTaskSnapshotService.selectAmzTaskSnapshotList(amzTaskSnapshot);
        ExcelUtil<AmzTaskSnapshot> util = new ExcelUtil<AmzTaskSnapshot>(AmzTaskSnapshot.class);
        util.exportExcel(response, list, "亚马逊任务数据快照数据");
    }

    /**
     * 获取亚马逊任务数据快照详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:snapshot:query')")
    @GetMapping(value = "/{snapshotId}")
    public AjaxResult getInfo(@PathVariable("snapshotId") Long snapshotId) {
        return success(amzTaskSnapshotService.selectAmzTaskSnapshotBySnapshotId(snapshotId));
    }

    /**
     * 新增亚马逊任务数据快照
     */
    @PreAuthorize("@ss.hasPermi('task:snapshot:add')")
    @Log(title = "亚马逊任务数据快照", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskSnapshot amzTaskSnapshot) {
        return toAjax(amzTaskSnapshotService.insertAmzTaskSnapshot(amzTaskSnapshot));
    }

    /**
     * 修改亚马逊任务数据快照
     */
    @PreAuthorize("@ss.hasPermi('task:snapshot:edit')")
    @Log(title = "亚马逊任务数据快照", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskSnapshot amzTaskSnapshot) {
        return toAjax(amzTaskSnapshotService.updateAmzTaskSnapshot(amzTaskSnapshot));
    }

    /**
     * 删除亚马逊任务数据快照
     */
    @PreAuthorize("@ss.hasPermi('task:snapshot:remove')")
    @Log(title = "亚马逊任务数据快照", businessType = BusinessType.DELETE)
    @DeleteMapping("/{snapshotIds}")
    public AjaxResult remove(@PathVariable Long[] snapshotIds) {
        return toAjax(amzTaskSnapshotService.deleteAmzTaskSnapshotBySnapshotIds(snapshotIds));
    }
}
