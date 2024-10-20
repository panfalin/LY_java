package com.ruoyi.price_ratings.controller;

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
import com.ruoyi.price_ratings.domain.PriceRatings;
import com.ruoyi.price_ratings.service.IPriceRatingsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * price_ratingsController
 * 
 * @author ruoyi
 * @date 2024-10-16
 */
@RestController
@RequestMapping("/price_ratings/price_ratings")
public class PriceRatingsController extends BaseController
{
    @Autowired
    private IPriceRatingsService priceRatingsService;

    /**
     * 查询price_ratings列表
     */
    @PreAuthorize("@ss.hasPermi('price_ratings:price_ratings:list')")
    @GetMapping("/list")
    public TableDataInfo list(PriceRatings priceRatings)
    {
        startPage();
        List<PriceRatings> list = priceRatingsService.selectPriceRatingsList(priceRatings);
        return getDataTable(list);
    }

    /**
     * 导出price_ratings列表
     */
    @PreAuthorize("@ss.hasPermi('price_ratings:price_ratings:export')")
    @Log(title = "price_ratings", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PriceRatings priceRatings)
    {
        List<PriceRatings> list = priceRatingsService.selectPriceRatingsList(priceRatings);
        ExcelUtil<PriceRatings> util = new ExcelUtil<PriceRatings>(PriceRatings.class);
        util.exportExcel(response, list, "price_ratings数据");
    }

    /**
     * 获取price_ratings详细信息
     */
    @PreAuthorize("@ss.hasPermi('price_ratings:price_ratings:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(priceRatingsService.selectPriceRatingsById(id));
    }

    /**
     * 新增price_ratings
     */
    @PreAuthorize("@ss.hasPermi('price_ratings:price_ratings:add')")
    @Log(title = "price_ratings", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PriceRatings priceRatings)
    {
        return toAjax(priceRatingsService.insertPriceRatings(priceRatings));
    }

    /**
     * 修改price_ratings
     */
    @PreAuthorize("@ss.hasPermi('price_ratings:price_ratings:edit')")
    @Log(title = "price_ratings", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PriceRatings priceRatings)
    {
        return toAjax(priceRatingsService.updatePriceRatings(priceRatings));
    }

    /**
     * 删除price_ratings
     */
    @PreAuthorize("@ss.hasPermi('price_ratings:price_ratings:remove')")
    @Log(title = "price_ratings", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(priceRatingsService.deletePriceRatingsByIds(ids));
    }
}
