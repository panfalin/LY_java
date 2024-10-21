package com.ruoyi.orders.controller;

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
import com.ruoyi.orders.domain.Orders;
import com.ruoyi.orders.service.IOrdersService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单数据Controller
 *
 * @author ruoyi
 * @date 2024-10-17
 */
@RestController
@RequestMapping("/orders/orders")
public class OrdersController extends BaseController {
    @Autowired
    private IOrdersService ordersService;

    /**
     * 查询订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('orders:orders:list')")
    @GetMapping("/list")
    public TableDataInfo list(Orders orders) {
        startPage();
        List<Orders> list= ordersService.selectOrdersList(orders);
        return getDataTable(list);
    }

    /**
     * 导出订单数据列表
     */
    @PreAuthorize("@ss.hasPermi('orders:orders:export')")
    @Log(title = "订单数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Orders orders) {
        List<Orders> list = ordersService.selectOrdersList(orders);
        ExcelUtil<Orders> util = new ExcelUtil<Orders>(Orders.class);
        util.exportExcel(response, list, "订单数据数据");
    }

    /**
     * 获取订单数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('orders:orders:query')")
    @GetMapping(value = "/{orderId}")
    public AjaxResult getInfo(@PathVariable("orderId") String orderId) {
        return success(ordersService.selectOrdersByOrderId(orderId));
    }

    /**
     * 新增订单数据
     */
    @PreAuthorize("@ss.hasPermi('orders:orders:add')")
    @Log(title = "订单数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Orders orders) {
        return toAjax(ordersService.insertOrders(orders));
    }

    /**
     * 修改订单数据
     */
    @PreAuthorize("@ss.hasPermi('orders:orders:edit')")
    @Log(title = "订单数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Orders orders) {
        return toAjax(ordersService.updateOrders(orders));
    }

    /**
     * 删除订单数据
     */
    @PreAuthorize("@ss.hasPermi('orders:orders:remove')")
    @Log(title = "订单数据", businessType = BusinessType.DELETE)
    @DeleteMapping("/{orderIds}")
    public AjaxResult remove(@PathVariable String[] orderIds) {
        return toAjax(ordersService.deleteOrdersByOrderIds(orderIds));
    }

    /**
     * 获取所有店铺
     */
    @PreAuthorize("@ss.hasPermi('orders:stores:view')") // 添加权限控制
    @Log(title = "店铺数据", businessType = BusinessType.OTHER) // 添加日志记录
    @GetMapping("/stores")
    public AjaxResult getAllStores() {
        List<String> stores = ordersService.getAllStores();
        return AjaxResult.success(stores); // 返回结果时使用 AjaxResult
    }

    /**
     * 获取所有店铺
     */
    @PreAuthorize("@ss.hasPermi('orders:country:view')") // 添加权限控制
    @Log(title = "国家数据", businessType = BusinessType.OTHER) // 添加日志记录
    @GetMapping("/country")
    public AjaxResult getAllCountry() {
        List<String> country = ordersService.getAllCountry();
        return AjaxResult.success(country); // 返回结果时使用 AjaxResult
    }
}
