package com.ruoyi.kingdee.controller;

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
import com.ruoyi.kingdee.domain.KingdeeProductInfo;
import com.ruoyi.kingdee.service.IKingdeeProductInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 金蝶商品信息Controller
 * 
 * @author panfalin
 * @date 2025-03-13
 */
@RestController
@RequestMapping("/kingdee/product")
public class KingdeeProductInfoController extends BaseController
{
    @Autowired
    private IKingdeeProductInfoService kingdeeProductInfoService;

    /**
     * 查询金蝶商品信息列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(KingdeeProductInfo kingdeeProductInfo)
    {
        startPage();
        List<KingdeeProductInfo> list = kingdeeProductInfoService.selectKingdeeProductInfoList(kingdeeProductInfo);
        return getDataTable(list);
    }

    /**
     * 导出金蝶商品信息列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:product:export')")
    @Log(title = "金蝶商品信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KingdeeProductInfo kingdeeProductInfo)
    {
        List<KingdeeProductInfo> list = kingdeeProductInfoService.selectKingdeeProductInfoList(kingdeeProductInfo);
        ExcelUtil<KingdeeProductInfo> util = new ExcelUtil<KingdeeProductInfo>(KingdeeProductInfo.class);
        util.exportExcel(response, list, "金蝶商品信息数据");
    }

    /**
     * 获取金蝶商品信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:product:query')")
    @GetMapping(value = "/{rk}")
    public AjaxResult getInfo(@PathVariable("rk") Long rk)
    {
        return success(kingdeeProductInfoService.selectKingdeeProductInfoByRk(rk));
    }

    /**
     * 新增金蝶商品信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:product:add')")
    @Log(title = "金蝶商品信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KingdeeProductInfo kingdeeProductInfo)
    {
        return toAjax(kingdeeProductInfoService.insertKingdeeProductInfo(kingdeeProductInfo));
    }

    /**
     * 修改金蝶商品信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:product:edit')")
    @Log(title = "金蝶商品信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KingdeeProductInfo kingdeeProductInfo)
    {
        return toAjax(kingdeeProductInfoService.updateKingdeeProductInfo(kingdeeProductInfo));
    }

    /**
     * 删除金蝶商品信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:product:remove')")
    @Log(title = "金蝶商品信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rks}")
    public AjaxResult remove(@PathVariable Long[] rks)
    {
        return toAjax(kingdeeProductInfoService.deleteKingdeeProductInfoByRks(rks));
    }
}
