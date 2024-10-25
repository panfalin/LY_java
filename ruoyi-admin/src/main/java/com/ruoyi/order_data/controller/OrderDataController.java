package com.ruoyi.order_data.controller;

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
import com.ruoyi.order_data.domain.OrderData;
import com.ruoyi.order_data.service.IOrderDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 速卖通分析-店铺维度Controller
 * 
 * @author ruoyi
 * @date 2024-10-23
 */
@RestController
@RequestMapping("/order_data/order_data")
public class OrderDataController extends BaseController
{
    @Autowired
    private IOrderDataService orderDataService;

    /**
     * 查询速卖通分析-店铺维度列表
     */
    @PreAuthorize("@ss.hasPermi('order_data:order_data:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrderData orderData)
    {
        // startPage();
        List<OrderData> list = orderDataService.selectOrderDataList(orderData);
        return getDataTable(list);
    }

    /**
     * 导出速卖通分析-店铺维度列表
     */
    @PreAuthorize("@ss.hasPermi('order_data:order_data:export')")
    @Log(title = "速卖通分析-店铺维度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OrderData orderData)
    {
        List<OrderData> list = orderDataService.selectOrderDataList(orderData);
        ExcelUtil<OrderData> util = new ExcelUtil<OrderData>(OrderData.class);
        util.exportExcel(response, list, "速卖通分析-店铺维度数据");
    }

    /**
     * 获取速卖通分析-店铺维度详细信息
     */
    @PreAuthorize("@ss.hasPermi('order_data:order_data:query')")
    @GetMapping(value = "/{productId}")
    public AjaxResult getInfo(@PathVariable("productId") String productId)
    {
        return success(orderDataService.selectOrderDataByProductId(productId));
    }

    /**
     * 新增速卖通分析-店铺维度
     */
    @PreAuthorize("@ss.hasPermi('order_data:order_data:add')")
    @Log(title = "速卖通分析-店铺维度", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrderData orderData)
    {
        return toAjax(orderDataService.insertOrderData(orderData));
    }

    /**
     * 修改速卖通分析-店铺维度
     */
    @PreAuthorize("@ss.hasPermi('order_data:order_data:edit')")
    @Log(title = "速卖通分析-店铺维度", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderData orderData)
    {
        return toAjax(orderDataService.updateOrderData(orderData));
    }

    /**
     * 删除速卖通分析-店铺维度
     */
    @PreAuthorize("@ss.hasPermi('order_data:order_data:remove')")
    @Log(title = "速卖通分析-店铺维度", businessType = BusinessType.DELETE)
	@DeleteMapping("/{productIds}")
    public AjaxResult remove(@PathVariable String[] productIds)
    {
        return toAjax(orderDataService.deleteOrderDataByProductIds(productIds));
    }

    /**
     * 获取所有店铺
     */
    @PreAuthorize("@ss.hasPermi('orders:stores:view')") // 添加权限控制
    @Log(title = "店铺数据", businessType = BusinessType.OTHER) // 添加日志记录
    @GetMapping("/stores")
    public AjaxResult getAllStores() {
        List<String> stores = orderDataService.getAllStores();
        return AjaxResult.success(stores); // 返回结果时使用 AjaxResult
    }
}
