package com.ruoyi.aliexpress.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.text.CharsetKit;
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
import com.ruoyi.aliexpress.domain.BcReserveWarehouse;
import com.ruoyi.aliexpress.service.IBcReserveWarehouseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.poi.ss.usermodel.*;
import com.ruoyi.aliexpress.util.ExcelExporter;
/**
 * warehouseController
 *
 * @author ruoyi
 * @date 2024-12-10
 */




@RestController
@RequestMapping("/warehouse/warehouse")
public class BcReserveWarehouseController extends BaseController
{
    @Autowired
    private IBcReserveWarehouseService bcReserveWarehouseService;

    /**
     * 查询warehouse列表
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:list')")
    @GetMapping("/list")
    public TableDataInfo list(BcReserveWarehouse bcReserveWarehouse)
    {
        startPage();
        List<BcReserveWarehouse> list = bcReserveWarehouseService.selectBcReserveWarehouseList(bcReserveWarehouse);
        return getDataTable(list);
    }

    /**
     * 导出warehouse列表
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:export')")
    @Log(title = "warehouse", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BcReserveWarehouse bcReserveWarehouse)
    {
        List<BcReserveWarehouse> list = bcReserveWarehouseService.selectBcReserveWarehouseList(bcReserveWarehouse);
        ExcelUtil<BcReserveWarehouse> util = new ExcelUtil<BcReserveWarehouse>(BcReserveWarehouse.class);
        util.exportExcel(response, list, "warehouse数据");
    }

    /**
     * 导出warehouse列表
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:export')")
    @Log(title = "warehouse", businessType = BusinessType.EXPORT)
    @PostMapping("/exportPackingList")
    public void exportPackingList(HttpServletResponse response, BcReserveWarehouse bcReserveWarehouse)
    {
        List<BcReserveWarehouse> list = bcReserveWarehouseService.selectBcReserveWarehouseList(bcReserveWarehouse);
        try {
            // 设置响应头信息，告诉浏览器这是一个Excel文件，需要下载
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding(CharsetKit.UTF_8);
            // 对文件名进行编码，防止中文等特殊字符出现乱码问题
            String fileName = URLEncoder.encode("output.xlsx", CharsetKit.UTF_8);
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);

            ExcelExporter.exportToExcel(list, response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            // 这里可以根据实际情况返回更合适的错误提示信息给前端，比如记录日志并返回一个带有错误信息的AjaxResult对象等
            // 示例：return AjaxResult.error("导出文件失败：" + e.getMessage());
        }
    }






    /**
     * 获取warehouse详细信息
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:query')")
    @GetMapping(value = "/{sku}")
    public AjaxResult getInfo(@PathVariable("sku") String sku)
    {
        return success(bcReserveWarehouseService.selectBcReserveWarehouseBySku(sku));
    }

    /**
     * 新增warehouse
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:add')")
    @Log(title = "warehouse", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BcReserveWarehouse bcReserveWarehouse)
    {
        return toAjax(bcReserveWarehouseService.insertBcReserveWarehouse(bcReserveWarehouse));
    }

    /**
     * 修改warehouse
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:edit')")
    @Log(title = "warehouse", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BcReserveWarehouse bcReserveWarehouse)
    {
        return toAjax(bcReserveWarehouseService.updateBcReserveWarehouse(bcReserveWarehouse));
    }

    /**
     * 删除warehouse
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:remove')")
    @Log(title = "warehouse", businessType = BusinessType.DELETE)
	@DeleteMapping("/{skus}")
    public AjaxResult remove(@PathVariable String[] skus)
    {
        return toAjax(bcReserveWarehouseService.deleteBcReserveWarehouseBySkus(skus));
    }
}
