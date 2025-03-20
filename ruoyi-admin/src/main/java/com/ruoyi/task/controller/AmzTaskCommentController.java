package com.ruoyi.task.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.task.domain.AmzTaskComment;
import com.ruoyi.task.service.IAmzTaskCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 亚马逊任务评论Controller
 *
 * @author panfalin
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/task/comment")
public class AmzTaskCommentController extends BaseController {
    @Autowired
    private IAmzTaskCommentService amzTaskCommentService;

    /**
     * 查询亚马逊任务评论列表
     */
    @PreAuthorize("@ss.hasPermi('task:comment:list')")
    @GetMapping("/list")
    public TableDataInfo list(AmzTaskComment amzTaskComment) {
        startPage();
        List<AmzTaskComment> list = amzTaskCommentService.selectAmzTaskCommentList(amzTaskComment);
        return getDataTable(list);
    }

    /**
     * 导出亚马逊任务评论列表
     */
    @PreAuthorize("@ss.hasPermi('task:comment:export')")
    @Log(title = "亚马逊任务评论", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AmzTaskComment amzTaskComment) {
        List<AmzTaskComment> list = amzTaskCommentService.selectAmzTaskCommentList(amzTaskComment);
        ExcelUtil<AmzTaskComment> util = new ExcelUtil<AmzTaskComment>(AmzTaskComment.class);
        util.exportExcel(response, list, "亚马逊任务评论数据");
    }

    /**
     * 获取亚马逊任务评论详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:comment:query')")
    @GetMapping(value = "/{commentId}")
    public AjaxResult getInfo(@PathVariable("commentId") Long commentId) {
        return success(amzTaskCommentService.selectAmzTaskCommentByCommentId(commentId));
    }

    /**
     * 新增亚马逊任务评论
     */
    @PreAuthorize("@ss.hasPermi('task:comment:add')")
    @Log(title = "亚马逊任务评论", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AmzTaskComment amzTaskComment) {
        return toAjax(amzTaskCommentService.insertAmzTaskComment(amzTaskComment));
    }

    /**
     * 修改亚马逊任务评论
     */
    @PreAuthorize("@ss.hasPermi('task:comment:edit')")
    @Log(title = "亚马逊任务评论", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AmzTaskComment amzTaskComment) {
        return toAjax(amzTaskCommentService.updateAmzTaskComment(amzTaskComment));
    }

    /**
     * 删除亚马逊任务评论
     */
    @PreAuthorize("@ss.hasPermi('task:comment:remove')")
    @Log(title = "亚马逊任务评论", businessType = BusinessType.DELETE)
    @DeleteMapping("/{commentIds}")
    public AjaxResult remove(@PathVariable Long[] commentIds) {
        return toAjax(amzTaskCommentService.deleteAmzTaskCommentByCommentIds(commentIds));
    }
}
