package com.ruoyi.kpi.util;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.reflect.ReflectUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class KpiExcelUtil<T> extends ExcelUtil<T> {
    private static final Logger log = LoggerFactory.getLogger(KpiExcelUtil.class);

    public KpiExcelUtil(Class<T> clazz) {
        super(clazz);
    }

    /**
     * 导出带有两行标题的Excel
     */
    public void exportExcel(HttpServletResponse response, List<T> list, String sheetName, String title, Map<String, String> infoMap) {
        try {
            // 设置下载响应头
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding("utf-8");
            String fileName = new String(title.getBytes("UTF-8"), "ISO-8859-1");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");
            
            // 创建工作簿
            SXSSFWorkbook wb = new SXSSFWorkbook(500);
            Sheet sheet = wb.createSheet(sheetName);
            
            // 创建标题样式 - 蓝色背景
            CellStyle titleStyle = wb.createCellStyle();
            titleStyle.setAlignment(HorizontalAlignment.CENTER);
            titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            titleStyle.setFillForegroundColor(IndexedColors.ROYAL_BLUE.getIndex());
            titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Font titleFont = wb.createFont();
            titleFont.setFontName("宋体");
            titleFont.setColor(IndexedColors.WHITE.getIndex());
            titleFont.setFontHeightInPoints((short) 14);
            titleFont.setBold(true);
            titleStyle.setFont(titleFont);
            
            // 创建信息行样式
            CellStyle infoStyle = wb.createCellStyle();
            infoStyle.setAlignment(HorizontalAlignment.LEFT);
            infoStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            infoStyle.setBorderBottom(BorderStyle.THIN);
            infoStyle.setBorderLeft(BorderStyle.THIN);
            infoStyle.setBorderRight(BorderStyle.THIN);
            infoStyle.setBorderTop(BorderStyle.THIN);
            Font infoFont = wb.createFont();
            infoFont.setFontName("宋体");
            infoFont.setFontHeightInPoints((short) 11);
            infoStyle.setFont(infoFont);
            
            // 创建表头样式 - 灰色背景
            CellStyle headerStyle = wb.createCellStyle();
            headerStyle.setAlignment(HorizontalAlignment.CENTER);
            headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setBorderLeft(BorderStyle.THIN);
            headerStyle.setBorderRight(BorderStyle.THIN);
            headerStyle.setBorderTop(BorderStyle.THIN);
            headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Font headerFont = wb.createFont();
            headerFont.setFontName("宋体");
            headerFont.setFontHeightInPoints((short) 11);
            headerStyle.setFont(headerFont);
            
            // 创建内容样式
            CellStyle contentStyle = wb.createCellStyle();
            contentStyle.setAlignment(HorizontalAlignment.CENTER);
            contentStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            contentStyle.setBorderBottom(BorderStyle.THIN);
            contentStyle.setBorderLeft(BorderStyle.THIN);
            contentStyle.setBorderRight(BorderStyle.THIN);
            contentStyle.setBorderTop(BorderStyle.THIN);
            Font contentFont = wb.createFont();
            contentFont.setFontName("宋体");
            contentFont.setFontHeightInPoints((short) 10);
            contentStyle.setFont(contentFont);
            
            // 创建第一行标题
            Row titleRow = sheet.createRow(0);
            titleRow.setHeight((short) 500);
            for (int i = 0; i < 8; i++) {
                Cell cell = titleRow.createCell(i);
                cell.setCellStyle(titleStyle);
                if (i == 0) {
                    cell.setCellValue(title);
                }
            }
            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 7));
            
            // 创建第二行信息
            Row infoRow = sheet.createRow(1);
            infoRow.setHeight((short) 400);
            
            // 添加信息行（合并为一行）
            Cell infoCell = infoRow.createCell(0);
            infoCell.setCellStyle(infoStyle);
            String infoText = String.format("所属部门: %s    岗位: %s    考核时间: %s", 
                                           infoMap.getOrDefault("department", "开发部"),
                                           infoMap.getOrDefault("position", "非标开发"),
                                           infoMap.getOrDefault("assessMonth", ""));
            infoCell.setCellValue(infoText);
            
            // 合并整行单元格
            sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 7));
            
            // 创建表头行（第3行）
            Row headerRow = sheet.createRow(2);
            headerRow.setHeight((short) 400);
            String[] headers = {"序号", "考核指标", "指标解释", "评分原则", "权重", "最终得分", "备注"};
            
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellStyle(headerStyle);
                cell.setCellValue(headers[i]);
            }
            
            // 设置列宽
            sheet.setColumnWidth(0, 8 * 256);
            sheet.setColumnWidth(1, 20 * 256);
            sheet.setColumnWidth(2, 25 * 256);
            sheet.setColumnWidth(3, 15 * 256);
            sheet.setColumnWidth(4, 15 * 256);
            sheet.setColumnWidth(5, 15 * 256);
            sheet.setColumnWidth(6, 15 * 256);

            // 创建内容行（从第4行开始）
            if (list != null && list.size() > 0) {
                int rowIndex = 3;
                for (int i = 0; i < list.size(); i++) {
                    T vo = list.get(i);
                    Row row = sheet.createRow(rowIndex++);
                    
                    // 序号
                    Cell indexCell = row.createCell(0);
                    indexCell.setCellStyle(contentStyle);
                    indexCell.setCellValue(i + 1);
                    
                    // 考核指标
                    Cell metricCell = row.createCell(1);
                    metricCell.setCellStyle(contentStyle);
                    metricCell.setCellValue(Convert.toStr(ReflectUtils.invokeGetter(vo, "metricName")));
                    
                    // 指标解释
                    Cell descCell = row.createCell(2);
                    descCell.setCellStyle(contentStyle);
                    descCell.setCellValue(Convert.toStr(ReflectUtils.invokeGetter(vo, "evaluationCriteria")));
                    
                    // 评分原则
                    Cell scoreRuleCell = row.createCell(3);
                    scoreRuleCell.setCellStyle(contentStyle);
                    scoreRuleCell.setCellValue(Convert.toStr(ReflectUtils.invokeGetter(vo, "calcType")));
                    
                    // 权重
                    Cell weightCell = row.createCell(4);
                    weightCell.setCellStyle(contentStyle);
                    Object weight = ReflectUtils.invokeGetter(vo, "weight");
                    if (weight != null) {
                        weightCell.setCellValue(weight instanceof BigDecimal ? 
                            ((BigDecimal)weight).doubleValue() : Convert.toDouble(weight));
                    }
                    
                    // 最终得分
                    Cell scoreCell = row.createCell(5);
                    scoreCell.setCellStyle(contentStyle);
                    Object score = ReflectUtils.invokeGetter(vo, "score");
                    if (score != null) {
                        scoreCell.setCellValue(score instanceof BigDecimal ? 
                            ((BigDecimal)score).doubleValue() : Convert.toDouble(score));
                    }
                    
                    // 备注
                    Cell remarkCell = row.createCell(6);
                    remarkCell.setCellStyle(contentStyle);
                    remarkCell.setCellValue("自动计算");
                }
                
                // 添加合计行
                Row totalRow = sheet.createRow(rowIndex++);
                for (int i = 0; i < 7; i++) {
                    Cell cell = totalRow.createCell(i);
                    cell.setCellStyle(contentStyle);
                    if (i == 0) {
                        cell.setCellValue("合计");
                    } else if (i == 4) {
                        cell.setCellValue(100);
                    }
                }
                sheet.addMergedRegion(new CellRangeAddress(rowIndex-1, rowIndex-1, 0, 2));
                
                // 添加注释行（合并为一个单元格，使用换行符分隔）
                rowIndex++;
                Row noteRow = sheet.createRow(rowIndex++);
                Cell noteCell = noteRow.createCell(0);
                noteCell.setCellStyle(contentStyle);

                // 设置单元格内容，使用换行符分隔
                String noteText = "注：低于60分，绩效为0；60-70分，绩效系数为0.7 70-80分，绩效系数为0.8 80-90分，绩效系数为0.9 90-100分，绩效系数为1 100-110 绩效系数为1.1\n" +
                                 "2、公司高层领导具有一票否决权。\n" +
                                 "3、一旦发现有侵权或账号异常，则当月绩效为0。";
                noteCell.setCellValue(noteText);

                // 设置单元格自动换行
                CellStyle wrapStyle = wb.createCellStyle();
                wrapStyle.cloneStyleFrom(contentStyle);
                wrapStyle.setWrapText(true);
                wrapStyle.setAlignment(HorizontalAlignment.LEFT);
                noteCell.setCellStyle(wrapStyle);

                // 合并单元格
                sheet.addMergedRegion(new CellRangeAddress(rowIndex-1, rowIndex+1, 0, 7));

                // 调整行高以适应内容
                noteRow.setHeight((short)(noteRow.getHeight() * 3));
            }
            
            // 输出到客户端
            OutputStream out = response.getOutputStream();
            wb.write(out);
            out.flush();
            out.close();
            wb.dispose();
        }
        catch (Exception e) {
            log.error("导出Excel异常{}", e.getMessage());
        }
    }
    
    /**
     * 获取所有字段注解信息
     */
    @Override
    public List<Object[]> getFields() {
        List<Object[]> fields = new ArrayList<Object[]>();
        Field[] allFields = clazz.getDeclaredFields();
        // 得到所有field并存放到一个list中
        for (Field field : allFields) {
            if (field.isAnnotationPresent(Excel.class)) {
                Excel attr = field.getAnnotation(Excel.class);
                if (attr != null && (attr.type() == Excel.Type.ALL || attr.type() == Excel.Type.EXPORT)) {
                    field.setAccessible(true);
                    fields.add(new Object[] { field.getName(), attr });
                }
            }
        }
        return fields;
    }
    
    /**
     * 设置单元格值
     */
    private void setCellValue(Cell cell, Object value, Excel attr) {
        if (value == null) {
            cell.setCellValue("");
            return;
        }
        
        String cellValue = "";
        if (value instanceof Date) {
            cellValue = DateUtils.parseDateToStr(attr.dateFormat(), (Date) value);
        } else if (value instanceof BigDecimal && attr.scale() >= 0) {
            cellValue = new DecimalFormat("0." + StringUtils.repeat("0", attr.scale())).format(value);
        } else if (value instanceof Integer && attr.readConverterExp() != null && !attr.readConverterExp().isEmpty()) {
            cellValue = convertExpValue(Convert.toStr(value), attr.readConverterExp(), attr.separator());
        } else {
            cellValue = Convert.toStr(value);
        }
        
        cell.setCellValue(cellValue);
    }
    
    /**
     * 解析导出值 0=男,1=女,2=未知
     */
    private String convertExpValue(String propertyValue, String converterExp, String separator) {
        String[] convertSource = converterExp.split(",");
        for (String item : convertSource) {
            String[] itemArray = item.split("=");
            if (itemArray.length > 1 && propertyValue.equals(itemArray[0])) {
                return itemArray[1];
            }
        }
        return propertyValue;
    }
} 