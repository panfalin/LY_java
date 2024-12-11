package com.ruoyi.aliexpress.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.ruoyi.aliexpress.domain.BcReserveWarehouse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExcelExporter {
    // 定义所有的box列名
    private static final String[] BOX_COLUMN_NAMES = {"box1", "box2", "box3", "box4", "box5", "box6", "box7", "box8", "box9", "box10"};
    //private static final String[] BOX_COLUMN_NAMES = {"箱号1", "箱号2", "箱号3", "箱号4", "箱号5", "箱号6", "箱号7", "箱号8", "箱号9", "箱号10"};
    private static final String SKU_COLUMN_NAME = "sku";
    private static final String INDEX_COLUMN_NAME = "序号";

    public static void exportToExcel(List<BcReserveWarehouse> dataList, OutputStream outputStream) {
        try (Workbook workbook = new XSSFWorkbook()) {
            // 用于存储每个box列的有效数据总和
            int[] boxTotals = new int[10];

            // 遍历数据，填充box数据列表和总和
            for (BcReserveWarehouse item : dataList) {
                for (int i = 0; i < 10; i++) {
                    String boxColumnName = BOX_COLUMN_NAMES[i];
                    String boxValueStr = getBoxValue(item, boxColumnName);
                    if (boxValueStr!= null && isNumeric(boxValueStr)) {
                        int boxValue = Integer.parseInt(boxValueStr);
                        boxTotals[i] += boxValue;
                    }
                }
            }

            // 创建每个box列对应的工作表并填充数据
            for (int i = 0; i < 10; i++) {
                if (boxTotals[i] > 0) {
                    Sheet sheet = workbook.createSheet(BOX_COLUMN_NAMES[i]);

                    // 在表头上方添加一行并合并单元格写入"装箱单"
                    Row titleRow = sheet.createRow(0);
                    CellRangeAddress titleRegion = new CellRangeAddress(0, 0, 0, 2);
                    sheet.addMergedRegion(titleRegion);
                    Cell titleCell = titleRow.createCell(0);
                    titleCell.setCellValue("装箱单");
                    // 设置"装箱单"单元格样式为居中（使用POI标准方式）
                    CellStyle titleCellStyle = workbook.createCellStyle();
                    titleCellStyle.setAlignment(HorizontalAlignment.CENTER); // 这里修改为使用POI的HorizontalAlignment枚举来设置水平居中
                    titleCell.setCellStyle(titleCellStyle);

                    // 创建表头行
                    Row headerRow = sheet.createRow(1);
                    int colIndex = 0;
                    headerRow.createCell(colIndex++).setCellValue(INDEX_COLUMN_NAME);
                    headerRow.createCell(colIndex++).setCellValue(SKU_COLUMN_NAME);
                    headerRow.createCell(colIndex++).setCellValue("箱号" + (i + 1));

                    // 设置sku列宽度为原来的2倍（可根据实际需求调整倍数）
                    sheet.setColumnWidth(1, sheet.getColumnWidth(1) * 2);

                    // 填充数据行
                    int rowIndex = 2;
                    int dataIndex = 1;
                    for (BcReserveWarehouse item : dataList) {
                        String boxColumnName = BOX_COLUMN_NAMES[i];
                        String boxValueStr = getBoxValue(item, boxColumnName);
                        if (boxValueStr!= null && isNumeric(boxValueStr)) {
                            Row dataRow = sheet.createRow(rowIndex++);
                            dataRow.createCell(0).setCellValue(dataIndex++);
                            dataRow.createCell(1).setCellValue(item.getSku());
                            int boxValue = Integer.parseInt(boxValueStr);
                            dataRow.createCell(2).setCellValue(boxValue);
                        }
                    }

                    // 写入总数行
                    Row totalRow = sheet.createRow(rowIndex++);
                    totalRow.createCell(0).setCellValue("总计");
                    totalRow.createCell(1).setCellValue("");
                    totalRow.createCell(2).setCellValue(boxTotals[i]);

                    // 合并单元格并添加注释行
                    CellRangeAddress region = new CellRangeAddress(rowIndex, rowIndex, 0, 2);
                    sheet.addMergedRegion(region);
                    Row noteRow = sheet.createRow(rowIndex);
                    noteRow.createCell(0).setCellValue("注：此箱内共" + getSkuCountForBox(dataList, i) + "个sku共计" + boxTotals[i] + "个产品");
                }
            }

            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getBoxValue(BcReserveWarehouse item, String boxColumnName) {
        switch (boxColumnName) {
            case "box1":
                return item.getBox1();
            case "box2":
                return item.getBox2();
            case "box3":
                return item.getBox3();
            case "box4":
                return item.getBox4();
            case "box5":
                return item.getBox5();
            case "box6":
                return item.getBox6();
            case "box7":
                return item.getBox7();
            case "box8":
                return item.getBox8();
            case "box9":
                return item.getBox9();
            case "box10":
                return item.getBox10();
            default:
                return null;
        }
    }

    private static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // 计算指定box列的sku数量
    private static int getSkuCountForBox(List<BcReserveWarehouse> dataList, int boxIndex) {
        String boxColumnName = BOX_COLUMN_NAMES[boxIndex];
        Set<String> skuSet = new HashSet<>();
        for (BcReserveWarehouse item : dataList) {
            String boxValueStr = getBoxValue(item, boxColumnName);
            if (boxValueStr!= null && isNumeric(boxValueStr)) {
                skuSet.add(item.getSku());
            }
        }
        return skuSet.size();
    }
}