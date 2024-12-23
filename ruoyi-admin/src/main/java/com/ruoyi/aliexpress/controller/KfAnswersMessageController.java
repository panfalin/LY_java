package com.ruoyi.aliexpress.controller;

import java.util.List;
import java.util.Map;
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
import com.ruoyi.aliexpress.domain.KfAnswersMessage;
import com.ruoyi.aliexpress.service.IKfAnswersMessageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消息Controller
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
@RestController
@RequestMapping("/aliexpress/message")
public class KfAnswersMessageController extends BaseController
{
    @Autowired
    private IKfAnswersMessageService kfAnswersMessageService;

    /**
     * 查询消息列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:list')")
    @GetMapping("/list")
    public TableDataInfo list(KfAnswersMessage kfAnswersMessage)
    {
        startPage();
        List<KfAnswersMessage> list = kfAnswersMessageService.selectKfAnswersMessageList(kfAnswersMessage);
        return getDataTable(list);
    }


    /**
     * 查询消息列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:list')")
    @GetMapping("/list/unread")
    public TableDataInfo listUnread(KfAnswersMessage kfAnswersMessage)
    {
        startPage();
        List<Map<String,String>> list = kfAnswersMessageService.selectKfAnswersClientUnreadCountOnly();
        return getDataTable(list);
    }


    /**
     * 导出消息列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:export')")
    @Log(title = "消息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KfAnswersMessage kfAnswersMessage)
    {
        List<KfAnswersMessage> list = kfAnswersMessageService.selectKfAnswersMessageList(kfAnswersMessage);
        ExcelUtil<KfAnswersMessage> util = new ExcelUtil<KfAnswersMessage>(KfAnswersMessage.class);
        util.exportExcel(response, list, "消息数据");
    }

    /**
     * 获取消息详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:query')")
    @GetMapping(value = "/{senderId}/{shopId}")
    public TableDataInfo getInfo(@PathVariable("senderId") String senderId, @PathVariable("shopId") String shopId)
    {
        List<KfAnswersMessage> list = kfAnswersMessageService.selectKfAnswersMessageByMessageId(senderId,shopId);
        return getDataTable(list);
    }





    /**
     * 新增消息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:add')")
    @Log(title = "消息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KfAnswersMessage kfAnswersMessage)
    {
        return toAjax(kfAnswersMessageService.insertKfAnswersMessage(kfAnswersMessage));
    }

    /**
     * 修改消息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:edit')")
    @Log(title = "消息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KfAnswersMessage kfAnswersMessage)
    {
        return toAjax(kfAnswersMessageService.updateKfAnswersMessage(kfAnswersMessage));
    }

    /**
     * 修改消息已读
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:edit')")
    @Log(title = "修改消息已读", businessType = BusinessType.UPDATE)
    @PutMapping("/read")
    public AjaxResult editRead(@RequestBody KfAnswersMessage kfAnswersMessage)
    {
        return toAjax(kfAnswersMessageService.updateKfAnswersMessageRead(kfAnswersMessage));
    }

    /**
     * 修改消息已读
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:edit')")
    @Log(title = "修改最新消息已读", businessType = BusinessType.UPDATE)
    @PutMapping("/sendnew")
    public AjaxResult editsendnew(@RequestBody KfAnswersMessage kfAnswersMessage)
    {
        return toAjax(kfAnswersMessageService.updateKfAnswersMessageSendNew(kfAnswersMessage));
    }




    /**
     * 修改消息已读
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:edit')")
    @Log(title = "修改消息已读", businessType = BusinessType.UPDATE)
    @PutMapping("/status")
    public AjaxResult editStatus(@RequestBody KfAnswersMessage kfAnswersMessage)
    {
        return toAjax(kfAnswersMessageService.updateKfAnswersMessageStatus(kfAnswersMessage));
    }



    /**
     * 删除消息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:message:remove')")
    @Log(title = "消息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{messageIds}")
    public AjaxResult remove(@PathVariable String[] messageIds)
    {
        return toAjax(kfAnswersMessageService.deleteKfAnswersMessageByMessageIds(messageIds));
    }
}
