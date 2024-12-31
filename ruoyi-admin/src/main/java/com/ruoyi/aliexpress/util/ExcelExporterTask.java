package com.ruoyi.aliexpress.util;
import com.ruoyi.aliexpress.domain.DailyTask;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ExcelExporterTask {
    // 生成 Excel 表格
    public static String generateExcelFile(List<DailyTask> tasks, String filePath) throws IOException {
        String taskTime = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // 创建工作簿
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Tasks");

        // 创建表头
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("刊登ID");
        headerRow.createCell(1).setCellValue("Sku");
        headerRow.createCell(2).setCellValue("商品名称");
        headerRow.createCell(3).setCellValue("历史销量");
        headerRow.createCell(4).setCellValue("30天访客");
        headerRow.createCell(5).setCellValue("店铺");
        headerRow.createCell(6).setCellValue("任务");
        headerRow.createCell(7).setCellValue("责任人");
        headerRow.createCell(8).setCellValue("目标");
        headerRow.createCell(9).setCellValue("任务时间");

        // 填充数据
        int rowNum = 1;
        for (DailyTask task : tasks) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(task.getId()==null?0:task.getId());
            row.createCell(1).setCellValue(task.getSku());  // 假设 DailyTask 有 getTaskName() 方法
            row.createCell(2).setCellValue(task.getProductName());
            row.createCell(3).setCellValue(task.getSales()==null?"":task.getSales());
            row.createCell(4).setCellValue(task.getVisitorCount()==null?0:task.getVisitorCount());
            row.createCell(5).setCellValue(task.getStore());
            row.createCell(6).setCellValue(task.getTasks());
            row.createCell(7).setCellValue(task.getResponsiblePerson());
            row.createCell(8).setCellValue(task.getSuggestions());
            row.createCell(9).setCellValue(taskTime);
        }

        // 写入到文件
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        } finally {
            workbook.close();
        }

        return filePath;
    }



}
