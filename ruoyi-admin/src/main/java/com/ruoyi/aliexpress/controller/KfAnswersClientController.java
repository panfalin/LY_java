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
import com.ruoyi.aliexpress.domain.KfAnswersClient;
import com.ruoyi.aliexpress.service.IKfAnswersClientService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户Controller
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
@RestController
@RequestMapping("/aliexpress/client")
public class KfAnswersClientController extends BaseController
{
    @Autowired
    private IKfAnswersClientService kfAnswersClientService;

    /**
     * 查询用户列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:client:list')")
    @GetMapping("/list")
    public TableDataInfo list(KfAnswersClient kfAnswersClient)
    {
        startPage();
        List<KfAnswersClient> list = kfAnswersClientService.selectKfAnswersClientList(kfAnswersClient);

        return getDataTable(list);
    }

    /**
     * 导出用户列表
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:client:export')")
    @Log(title = "用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KfAnswersClient kfAnswersClient)
    {
        List<KfAnswersClient> list = kfAnswersClientService.selectKfAnswersClientList(kfAnswersClient);
        ExcelUtil<KfAnswersClient> util = new ExcelUtil<KfAnswersClient>(KfAnswersClient.class);
        util.exportExcel(response, list, "用户数据");
    }

    /**
     * 获取用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:client:query')")
    @GetMapping(value = "/{clientId}")
    public AjaxResult getInfo(@PathVariable("clientId") String clientId)
    {
        return success(kfAnswersClientService.selectKfAnswersClientByClientId(clientId));
    }

    /**
     * 新增用户
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:client:add')")
    @Log(title = "用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KfAnswersClient kfAnswersClient)
    {
        return toAjax(kfAnswersClientService.insertKfAnswersClient(kfAnswersClient));
    }

    /**
     * 修改用户
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:client:edit')")
    @Log(title = "用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KfAnswersClient kfAnswersClient)
    {
        return toAjax(kfAnswersClientService.updateKfAnswersClient(kfAnswersClient));
    }

    /**
     * 删除用户
     */
    @PreAuthorize("@ss.hasPermi('aliexpress:client:remove')")
    @Log(title = "用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{clientIds}")
    public AjaxResult remove(@PathVariable String[] clientIds)
    {
        return toAjax(kfAnswersClientService.deleteKfAnswersClientByClientIds(clientIds));
    }
}
