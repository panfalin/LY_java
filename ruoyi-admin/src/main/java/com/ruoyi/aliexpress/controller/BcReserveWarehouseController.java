package com.ruoyi.aliexpress.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.text.CharsetKit;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
import org.springframework.web.multipart.MultipartFile;

/**
 * warehouseController
 *
 * @author ruoyi
 * @date 2024-12-10
 */




@RestController
@RequestMapping("/warehouse/warehouse")
@CrossOrigin(origins = "*", maxAge = 3600)
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
        util.exportExcel(response, list, "data");
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
     * 处理Excel文件上传并将数据导入数据库
     *
     * @param file 上传的Excel文件
     * @return 导入结果信息
     */
    @PreAuthorize("@ss.hasPermi('warehouse:warehouse:export')")
    @PostMapping("/import")
    public ResponseEntity<String> importDataFromExcel(@RequestParam("file") MultipartFile file) {
        List<BcReserveWarehouse> dataList = new ArrayList<>();

        try (Workbook workbook = new XSSFWorkbook(file.getInputStream())) {
            Sheet sheet = workbook.getSheetAt(0);
            // 从第二行（索引为1）开始遍历表格
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                BcReserveWarehouse data = new BcReserveWarehouse();
                data.setSku(getCellValueAsString(row.getCell(0)));
                data.setStockId(getCellValueAsString(row.getCell(1)));
                data.setStockWarehouse(getCellValueAsString(row.getCell(2)));
                data.setWarehousePosition(getCellValueAsString(row.getCell(3)));
                data.setGoodsId(getCellValueAsString(row.getCell(4)));
                data.setGoodsNumber(removeDecimalIfExists(getCellValueAsString(row.getCell(5))));
                data.setShopId(getCellValueAsString(row.getCell(6)));
                data.setBox1(removeDecimalIfExists(getCellValueAsString(row.getCell(7))));
                data.setBox2(removeDecimalIfExists(getCellValueAsString(row.getCell(8))));
                data.setBox3(removeDecimalIfExists(getCellValueAsString(row.getCell(9))));
                data.setBox4(removeDecimalIfExists(getCellValueAsString(row.getCell(10))));
                data.setBox5(removeDecimalIfExists(getCellValueAsString(row.getCell(11))));
                data.setBox6(removeDecimalIfExists(getCellValueAsString(row.getCell(12))));
                data.setBox7(removeDecimalIfExists(getCellValueAsString(row.getCell(13))));
                data.setBox8(removeDecimalIfExists(getCellValueAsString(row.getCell(14))));
                data.setBox9(removeDecimalIfExists(getCellValueAsString(row.getCell(15))));
                data.setBox10(removeDecimalIfExists(getCellValueAsString(row.getCell(16))));
                data.setBoxSize(removeDecimalIfExists(getCellValueAsString(row.getCell(17))));
                data.setWeight(removeDecimalIfExists(getCellValueAsString(row.getCell(18))));
                dataList.add(data);
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("读取Excel文件时出错: " + e.getMessage());
        }

        try {
            bcReserveWarehouseService.insertOrUpdateExcel(dataList);
            return ResponseEntity.ok("数据导入成功！");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("数据导入失败: " + e.getMessage());
        }
    }

    private String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return null;
        }
        switch (cell.getCellType()) {
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case STRING:
                return cell.getStringCellValue();
            default:
                return null;
        }
    }

    private String removeDecimalIfExists(String value) {
        if (value!= null && value.contains(".")) {
            return value.split("\\.")[0];
        }
        return value;
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
