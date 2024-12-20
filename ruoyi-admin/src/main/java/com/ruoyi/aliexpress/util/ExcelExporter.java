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
    private static final String ESTIMATED_PICKUP_TIME_COLUMN_NAME = "预计揽收";

    public static void exportToExcel(List<BcReserveWarehouse> dataList, OutputStream outputStream) {
        try (Workbook workbook = new XSSFWorkbook()) {
            // 用于存储每个box列的有效数据总和
            int[] boxTotals = new int[10];
            String appointmentTime = "";
//            // 遍历数据，填充box数据列表和总和
            for (BcReserveWarehouse item2 : dataList) {
                if (item2.getAppointmentTime() == null) {
                    continue;
                }
                appointmentTime = item2.getAppointmentTime();
            }


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
//                    CellRangeAddress titleRegion = new CellRangeAddress(0, 0, 0, 2);
//                    sheet.addMergedRegion(titleRegion);
                    Cell titleCell = titleRow.createCell(0);
                    Cell titleCell2 = titleRow.createCell(1);
                    Cell titleCell3 = titleRow.createCell(2);

                    titleCell.setCellValue("装箱单");
                    titleCell2.setCellValue("");
                    titleCell3.setCellValue("");

                    // 设置"装箱单"单元格样式为居中并添加下边框
                    CellStyle titleCellStyle = workbook.createCellStyle();
                    titleCellStyle.setAlignment(HorizontalAlignment.CENTER); // 居中对齐
                    Font titleFont = workbook.createFont();
                    titleFont.setFontHeightInPoints((short) 20); // 字体加大
                    titleCellStyle.setFont(titleFont);
                    // 添加上边框
                    titleCellStyle.setBorderTop(BorderStyle.THIN);
                    // 添加上边框
                    titleCellStyle.setBorderLeft(BorderStyle.THIN);
                    titleCellStyle.setBorderRight(BorderStyle.THIN);
                    // 添加下边框
                    titleCellStyle.setBorderBottom(BorderStyle.THIN);
                    titleRow.getCell(0).setCellStyle(titleCellStyle);
                    titleRow.getCell(1).setCellStyle(titleCellStyle);
                    titleRow.getCell(2).setCellStyle(titleCellStyle);
                    CellRangeAddress titleRegion = new CellRangeAddress(0, 0, 0, 2);
                    sheet.addMergedRegion(titleRegion);


                    //创建表头行
                    Row headerRow = sheet.createRow(1);
                    int colIndex = 0;
                    headerRow.createCell(colIndex++).setCellValue(INDEX_COLUMN_NAME);
                    headerRow.createCell(colIndex++).setCellValue(SKU_COLUMN_NAME);
                    headerRow.createCell(colIndex++).setCellValue("箱号" + (i + 1));

                    // 设置列宽：sku列宽增加，其他列适当调整
                    sheet.setColumnWidth(1, 8000);  // 将SKU列宽度加大
                    sheet.setColumnWidth(0, 3000);  // 序号列宽度调整
                    sheet.setColumnWidth(2, 6000);  // 箱号列宽度调整

                    // 设置表头单元格样式（居中、加大字体）
                    CellStyle headerCellStyle = workbook.createCellStyle();
                    headerCellStyle.setAlignment(HorizontalAlignment.CENTER); // 居中
                    Font headerFont = workbook.createFont();
                    headerFont.setFontHeightInPoints((short) 20); // 字体加大
                    headerCellStyle.setFont(headerFont);
                    setBorderStyle(headerCellStyle); // 设置边框
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
                            // 序号
                            dataRow.createCell(0).setCellValue(dataIndex++);
                            // SKU
                            dataRow.createCell(1).setCellValue(item.getSku());
                            // 箱号
                            int boxValue = Integer.parseInt(boxValueStr);
                            dataRow.createCell(2).setCellValue(boxValue);

                            // 设置单元格居中并加边框
                            CellStyle dataCellStyle = workbook.createCellStyle();
                            dataCellStyle.setAlignment(HorizontalAlignment.CENTER);
                            Font dataFont = workbook.createFont();
                            dataFont.setFontHeightInPoints((short) 20); // 字体加大
                            dataCellStyle.setFont(dataFont);
                            setBorderStyle(dataCellStyle); // 设置边框
                            for (int col = 0; col < 3; col++) {
                                dataRow.getCell(col).setCellStyle(dataCellStyle);
                            }
                        }
                    }

                    // 在“总计”行之前插入一行空行
                    Row emptyRow = sheet.createRow(rowIndex++);
                    emptyRow.createCell(0).setCellValue("");
                    emptyRow.createCell(1).setCellValue("");
                    emptyRow.createCell(2).setCellValue("");

                    // 设置总计行样式
                    CellStyle totalCellStyle = workbook.createCellStyle();
                    totalCellStyle.setAlignment(HorizontalAlignment.CENTER);
                    Font totalFont = workbook.createFont();
                    totalFont.setFontHeightInPoints((short) 20); // 字体
                    totalCellStyle.setFont(totalFont);
                    setBorderStyle(totalCellStyle); // 设置边框
                    for (int col = 0; col < 3; col++) {
                        emptyRow.getCell(col).setCellStyle(totalCellStyle);
                    }

                    // 创建总计行
                    Row totalRow = sheet.createRow(rowIndex++);
                    totalRow.createCell(0).setCellValue("总计");
                    totalRow.createCell(1).setCellValue("");
                    totalRow.createCell(2).setCellValue(boxTotals[i]);

                    // 设置总计行样式
                    CellStyle totalCellStyleBlank = workbook.createCellStyle();
                    totalCellStyleBlank.setAlignment(HorizontalAlignment.CENTER);
                    Font totalFontBlank = workbook.createFont();
                    totalFontBlank.setFontHeightInPoints((short) 20); // 字体
                    totalCellStyleBlank.setFont(totalFontBlank);
                    setBorderStyle(totalCellStyleBlank); // 设置边框
                    for (int col = 0; col < 3; col++) {
                        totalRow.getCell(col).setCellStyle(totalCellStyleBlank);
                    }

                    // 合并单元格并添加注释行
                    CellRangeAddress region = new CellRangeAddress(rowIndex, rowIndex, 0, 2);
                    sheet.addMergedRegion(region);
                    Row noteRow = sheet.createRow(rowIndex);
                    noteRow.createCell(0).setCellValue("注：此箱内共" + getSkuCountForBox(dataList, i) + "个sku共计" + boxTotals[i] + "个产品");
                    noteRow.createCell(1).setCellValue("");
                    noteRow.createCell(2).setCellValue("");
                    // 设置注释行居中并加边框
                    CellStyle noteCellStyle = workbook.createCellStyle();
                    noteCellStyle.setAlignment(HorizontalAlignment.CENTER); // 居中对齐
                    Font noteFont = workbook.createFont();
                    noteFont.setFontHeightInPoints((short) 20); // 字体加大
                    noteCellStyle.setFont(noteFont);
                    setBorderStyle(noteCellStyle); // 设置边框
                    noteRow.getCell(0).setCellStyle(noteCellStyle);
                    noteRow.getCell(1).setCellStyle(noteCellStyle);
                    noteRow.getCell(2).setCellStyle(noteCellStyle);

                    // 添加预计揽收时间
                    Row estimatedPickupRow = sheet.createRow(rowIndex + 1);
                    estimatedPickupRow.createCell(0).setCellValue(ESTIMATED_PICKUP_TIME_COLUMN_NAME + ":" + appointmentTime);
                    // 预计揽收时间不加样式
                }
            }

            // 将Excel工作簿写入输出流
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
            if (boxValueStr != null && isNumeric(boxValueStr)) {
                skuSet.add(item.getSku());
            }
        }
        return skuSet.size();
    }

    // 设置单元格边框
    private static void setBorderStyle(CellStyle cellStyle) {
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
    }
}
