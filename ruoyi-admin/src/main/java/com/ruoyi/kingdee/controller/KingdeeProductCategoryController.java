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
import com.ruoyi.kingdee.domain.KingdeeProductCategory;
import com.ruoyi.kingdee.service.IKingdeeProductCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 金蝶商品分类信息Controller
 *
 * @author panfalin
 * @date 2025-03-13
 */
@RestController
@RequestMapping("/kingdee/productCategory")
public class KingdeeProductCategoryController extends BaseController {
    @Autowired
    private IKingdeeProductCategoryService kingdeeProductCategoryService;

    /**
     * 查询金蝶商品分类信息列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:productCategory:list')")
    @GetMapping("/list")
    public TableDataInfo list(KingdeeProductCategory kingdeeProductCategory) {
        startPage();
        List<KingdeeProductCategory> list = kingdeeProductCategoryService.selectKingdeeProductCategoryList(kingdeeProductCategory);
        return getDataTable(list);
    }

    /**
     * 导出金蝶商品分类信息列表
     */
    @PreAuthorize("@ss.hasPermi('kingdee:productCategory:export')")
    @Log(title = "金蝶商品分类信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, KingdeeProductCategory kingdeeProductCategory) {
        List<KingdeeProductCategory> list = kingdeeProductCategoryService.selectKingdeeProductCategoryList(kingdeeProductCategory);
        ExcelUtil<KingdeeProductCategory> util = new ExcelUtil<KingdeeProductCategory>(KingdeeProductCategory.class);
        util.exportExcel(response, list, "金蝶商品分类信息数据");
    }

    /**
     * 获取金蝶商品分类信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:productCategory:query')")
    @GetMapping(value = "/{rk}")
    public AjaxResult getInfo(@PathVariable("rk") Long rk) {
        return success(kingdeeProductCategoryService.selectKingdeeProductCategoryByRk(rk));
    }

    /**
     * 新增金蝶商品分类信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:productCategory:add')")
    @Log(title = "金蝶商品分类信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KingdeeProductCategory kingdeeProductCategory) {
        return toAjax(kingdeeProductCategoryService.insertKingdeeProductCategory(kingdeeProductCategory));
    }

    /**
     * 修改金蝶商品分类信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:productCategory:edit')")
    @Log(title = "金蝶商品分类信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KingdeeProductCategory kingdeeProductCategory) {
        return toAjax(kingdeeProductCategoryService.updateKingdeeProductCategory(kingdeeProductCategory));
    }

    /**
     * 删除金蝶商品分类信息
     */
    @PreAuthorize("@ss.hasPermi('kingdee:productCategory:remove')")
    @Log(title = "金蝶商品分类信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{rks}")
    public AjaxResult remove(@PathVariable Long[] rks) {
        return toAjax(kingdeeProductCategoryService.deleteKingdeeProductCategoryByRks(rks));
    }

    /**
     * 这个是返回商品分类树的
     */
    @GetMapping("/tree")
    public AjaxResult tree() {
        return success(kingdeeProductCategoryService.selectProductCategoryTree());
    }
}
