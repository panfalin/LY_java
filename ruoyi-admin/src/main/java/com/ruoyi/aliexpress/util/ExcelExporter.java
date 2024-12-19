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
    private static final String SKU_COLUMN_NAME = "sku";
    private static final String INDEX_COLUMN_NAME = "序号";
    private static final String DELIVERY_TIME_COLUMN_NAME = "揽收时间";

    // 创建样式方法，设置字体和居中
    private static CellStyle createCellStyle(Workbook workbook, boolean centerAlign, short fontSize) {
        CellStyle style = workbook.createCellStyle();
        if (centerAlign) {
            style.setAlignment(HorizontalAlignment.CENTER);
            style.setVerticalAlignment(VerticalAlignment.CENTER);
        }
        // 设置边框
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);

        // 设置字体大小
        Font font = workbook.createFont();
        font.setFontHeightInPoints(fontSize);  // 设置字体大小
        style.setFont(font);

        return style;
    }

    public static void exportToExcel(List<BcReserveWarehouse> dataList, OutputStream outputStream) {
        try (Workbook workbook = new XSSFWorkbook()) {
            // 用于存储每个box列的有效数据总和
            int[] boxTotals = new int[10];

            // 遍历数据，填充box数据列表和总和
            for (BcReserveWarehouse item : dataList) {
                for (int i = 0; i < 10; i++) {
                    String boxColumnName = BOX_COLUMN_NAMES[i];
                    String boxValueStr = getBoxValue(item, boxColumnName);
                    if (boxValueStr != null && isNumeric(boxValueStr)) {
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

                    // 设置"装箱单"单元格样式为居中，字体加大
                    CellStyle titleCellStyle = createCellStyle(workbook, true, (short) 14);
                    titleCell.setCellStyle(titleCellStyle);

                    // 创建表头行
                    Row headerRow = sheet.createRow(1);
                    int colIndex = 0;
                    headerRow.createCell(colIndex++).setCellValue(INDEX_COLUMN_NAME);
                    headerRow.createCell(colIndex++).setCellValue(SKU_COLUMN_NAME);
                    headerRow.createCell(colIndex++).setCellValue("箱号" + (i + 1));

                    // 设置列宽：sku列宽增加，其他列适当调整
                    sheet.setColumnWidth(1, 8000);  // 将SKU列宽度加大
                    sheet.setColumnWidth(0, 5000);  // 序号列宽度调整
                    sheet.setColumnWidth(2, 5000);  // 箱号列宽度调整

                    // 设置表头单元格样式
                    CellStyle headerCellStyle = createCellStyle(workbook, true, (short) 12);
                    for (int col = 0; col < 3; col++) {
                        headerRow.getCell(col).setCellStyle(headerCellStyle);
                    }

                    // 填充数据行
                    int rowIndex = 2;
                    int dataIndex = 1;
                    for (BcReserveWarehouse item : dataList) {
                        String boxColumnName = BOX_COLUMN_NAMES[i];
                        String boxValueStr = getBoxValue(item, boxColumnName);
                        if (boxValueStr != null && isNumeric(boxValueStr)) {
                            Row dataRow = sheet.createRow(rowIndex++);
                            CellStyle dataCellStyle = createCellStyle(workbook, true, (short) 12);  // 设置数据行样式为居中
                            dataRow.createCell(0).setCellValue(dataIndex++);
                            dataRow.createCell(1).setCellValue(item.getSku());
                            int boxValue = Integer.parseInt(boxValueStr);
                            dataRow.createCell(2).setCellValue(boxValue);
                            dataRow.getCell(0).setCellStyle(dataCellStyle);
                            dataRow.getCell(1).setCellStyle(dataCellStyle);
                            dataRow.getCell(2).setCellStyle(dataCellStyle);
                        }
                    }

                    // 写入总数行，使用和数据行相同的样式
                    Row totalRow = sheet.createRow(rowIndex++);
                    totalRow.createCell(0).setCellValue("总计");
                    totalRow.createCell(1).setCellValue("");
                    totalRow.createCell(2).setCellValue(boxTotals[i]);

                    CellStyle totalCellStyle = createCellStyle(workbook, true, (short) 12);
                    totalRow.getCell(0).setCellStyle(totalCellStyle);
                    totalRow.getCell(1).setCellStyle(totalCellStyle);
                    totalRow.getCell(2).setCellStyle(totalCellStyle);

                    // 合并单元格并添加注释行，使用和数据行相同的样式
                    CellRangeAddress region = new CellRangeAddress(rowIndex, rowIndex, 0, 2);
                    sheet.addMergedRegion(region);
                    Row noteRow = sheet.createRow(rowIndex);
                    noteRow.createCell(0).setCellValue("注：此箱内共" + getSkuCountForBox(dataList, i) + "个sku共计" + boxTotals[i] + "个产品");

                    noteRow.getCell(0).setCellStyle(totalCellStyle);  // 注释行样式和总计行一致

                    // 在每个sheet的最后添加揽收时间字段，使用和数据行相同的样式
                    Row deliveryTimeRow = sheet.createRow(rowIndex + 1);
                    deliveryTimeRow.createCell(0).setCellValue(DELIVERY_TIME_COLUMN_NAME);
                    deliveryTimeRow.createCell(1).setCellValue("2024-12-19 15:30");  // 假设日期时间，你可以根据需求动态填充

                    deliveryTimeRow.getCell(0).setCellStyle(totalCellStyle);  // 添加样式
                    deliveryTimeRow.getCell(1).setCellStyle(totalCellStyle);  // 添加样式
                }
            }

            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getBoxValue(BcReserveWarehouse item, String boxColumnName) {
        switch (boxColumnName) {
            case "box1": return item.getBox1();
            case "box2": return item.getBox2();
            case "box3": return item.getBox3();
            case "box4": return item.getBox4();
            case "box5": return item.getBox5();
            case "box6": return item.getBox6();
            case "box7": return item.getBox7();
            case "box8": return item.getBox8();
            case "box9": return item.getBox9();
            case "box10": return item.getBox10();
            default: return null;
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
            if (boxValueStr != null && isNumeric(boxValueStr)) {
                skuSet.add(item.getSku());
            }
        }
        return skuSet.size();
    }
}
