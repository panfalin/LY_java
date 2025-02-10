package com.ruoyi.aliexpress.service.impl;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisAttribute;
import com.ruoyi.aliexpress.domain.AliexpressSkuStatistics;
import com.ruoyi.aliexpress.domain.DailyTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressSkuAnalysisMapper;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.service.IAliexpressSkuAnalysisService;

import javax.annotation.Resource;

/**
 * 速卖通滞销SKU分析Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-21
 */
@Service
public class AliexpressSkuAnalysisServiceImpl implements IAliexpressSkuAnalysisService 
{



    @Resource
    private AliexpressSkuAnalysisMapper aliexpressSkuAnalysisMapper;

    /**
     * 查询速卖通滞销SKU分析
     * 
     * @param id 速卖通滞销SKU分析主键
     * @return 速卖通滞销SKU分析
     */
    @Override
    public AliexpressSkuAnalysis selectAliexpressSkuAnalysisById(Long id)
    {
        return aliexpressSkuAnalysisMapper.selectAliexpressSkuAnalysisById(id);
    }

    /**
     * 查询速卖通滞销SKU分析列表
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 速卖通滞销SKU分析
     */
    @Override
    public List<AliexpressSkuAnalysis> selectAliexpressSkuAnalysisList(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        aliexpressSkuAnalysis.setSales28Days(0L);
        List<AliexpressSkuAnalysis> aliexpressSkuAnalyses = aliexpressSkuAnalysisMapper.selectAliexpressSkuAnalysisList(aliexpressSkuAnalysis);
        //获取sku 国家 查询aliexpress_competition_information_attribute表中的价格和货币类型
        for (AliexpressSkuAnalysis aliexpressSkuAnalyse : aliexpressSkuAnalyses) {
            StringBuilder resultMarket = new StringBuilder();  // 用于拼接最终结果
            List<Double> usdPricesMarket = new ArrayList<>();
            String hotCountries=aliexpressSkuAnalyse.getCompetitorHotSalesCountries();
            String sku=aliexpressSkuAnalyse.getSku();
            //计算市场平均售价
            AliexpressSkuAnalysisAttribute AliexpressSkuAnalysiMarketPrice=new AliexpressSkuAnalysisAttribute();
            AliexpressSkuAnalysiMarketPrice.setSku(sku);
            List<AliexpressSkuAnalysisAttribute> aliexpressSkuAnalysisAttributesMarketPrice =aliexpressSkuAnalysisMapper.selectAliexpressSkuAnalysisAttributeList(AliexpressSkuAnalysiMarketPrice);
            for ( AliexpressSkuAnalysisAttribute aliexpressSkuAnalysisAttribute : aliexpressSkuAnalysisAttributesMarketPrice) {
                String priceStr = aliexpressSkuAnalysisAttribute.getPrice();
                String currencyType = aliexpressSkuAnalysisAttribute.getMonetaryType();
                // 提取价格中的数值部分
                double price = extractPrice(priceStr);
                // 获取汇率并转换为美元
                double exchangeRate = getExchangeRate(currencyType);
                double usdPrice = price * exchangeRate;
                usdPricesMarket.add(usdPrice);
            }
            // 计算平均值
            double averagePriceMarket = usdPricesMarket.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            if (averagePriceMarket==0.0){
                resultMarket.append("");
            }else {
                resultMarket.append("$").append(String.format("%.2f", averagePriceMarket));
            }



            aliexpressSkuAnalyse.setMarketAveragePrice(resultMarket.toString());


            //计算热销国家平均售价
            if (hotCountries!=null&&hotCountries!=""){
                // 存储转换后的美元价格
                StringBuilder result = new StringBuilder();  // 用于拼接最终结果
                String[] parts = hotCountries.split(",\\s*");
                for (String part : parts) {
                    List<Double> usdPrices = new ArrayList<>();
                    // 使用正则去除括号和数字
                    String country = part.replaceAll("\\(\\d+\\)", "").trim();
                    if ("".equals(country)){
                        country="美国";
                    }
                    AliexpressSkuAnalysisAttribute AliexpressSkuAnalysi=new AliexpressSkuAnalysisAttribute();
                    AliexpressSkuAnalysi.setSku(sku);
                    AliexpressSkuAnalysi.setCountries(country);
                    List<AliexpressSkuAnalysisAttribute> aliexpressSkuAnalysisAttributes =aliexpressSkuAnalysisMapper.selectAliexpressSkuAnalysisAttributeList(AliexpressSkuAnalysi);
                    for ( AliexpressSkuAnalysisAttribute aliexpressSkuAnalysisAttribute : aliexpressSkuAnalysisAttributes) {
                        String priceStr = aliexpressSkuAnalysisAttribute.getPrice();
                        String currencyType = aliexpressSkuAnalysisAttribute.getMonetaryType();
                        // 提取价格中的数值部分
                        double price = extractPrice(priceStr);
                        // 获取汇率并转换为美元
                        double exchangeRate = getExchangeRate(currencyType);
                        double usdPrice = price * exchangeRate;
                        usdPrices.add(usdPrice);
                    }
                    // 计算平均值
                    double averagePrice = usdPrices.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
                    // 拼接国家和对应的美元价格
                    result.append(country).append("：$").append(String.format("%.2f", averagePrice)).append(",");
                }
                aliexpressSkuAnalyse.setCompetitorHotSalesPrice(result.toString());


            }




        }





        return aliexpressSkuAnalyses;
    }

    @Override
    public List<AliexpressSkuStatistics> selectAliexpressSkuStatistics(AliexpressSkuAnalysis aliexpressSkuAnalysis) {
        return aliexpressSkuAnalysisMapper.selectAliexpressSkuStatistics(aliexpressSkuAnalysis);
    }


    public static double extractPrice(String priceStr) {
        if (priceStr == null || priceStr.isEmpty()) {
            return 0.0;
        }


        // 移除所有非数字、逗号和点的字符（如 грн、¥、$ 等）
//        String numericStr = priceStr.replaceAll("[^\\d,\\.]", "");
        String numericStr = priceStr.replaceAll("[^\\d,.]", "");
        // 判断是否需要去掉最后一位的 "."
        if (numericStr.endsWith(".")) {
            numericStr = numericStr.substring(0, numericStr.length() - 1);
        }




        // 判断是 "欧美格式" 还是 "俄语/欧洲大陆格式"
        if (numericStr.contains(",") && numericStr.contains(".")) {
            int lastComma = numericStr.lastIndexOf(",");
            int lastDot = numericStr.lastIndexOf(".");

            if (lastComma > lastDot) {
                // `,` 在最后，说明 `,` 是小数点，`.` 是千位分隔符
                numericStr = numericStr.replace(".", "").replace(",", ".");
            } else {
                // `.` 在最后，说明 `.` 是小数点，`,` 是千位分隔符
                numericStr = numericStr.replace(",", "");
            }
        } else if (numericStr.contains(",")) {

            if (priceStr.contains("руб.")) {
                // 包含руб.""它是小数点
                numericStr = numericStr.replace(",", ".");
            }
            // 只有 `,`，假设它是小数点
            numericStr = numericStr.replace(",", "");
        }
        // 处理可能的额外小数点（如果出现多个）
        int firstDot = numericStr.indexOf(".");
        int lastDot = numericStr.lastIndexOf(".");
        if (firstDot != lastDot) {
            // 移除所有点，只保留最后一个点（确保是小数点）
            numericStr = numericStr.replace(".", "");
            numericStr = numericStr.substring(0, lastDot-1) + "." + numericStr.substring(lastDot-1);
        }

        try {
            return NumberFormat.getInstance(Locale.US).parse(numericStr).doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
    // 获取汇率（此处为示例，实际应用中应通过API获取实时汇率）
    private static double getExchangeRate(String currencyType) {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("KRW", 0.00084); // 韩元对美元汇率
        exchangeRates.put("JPY", 0.0091);  // 日元对美元汇率
        exchangeRates.put("USD", 1.0);     // 美元对美元汇率
        exchangeRates.put("CNY", 0.14);    // 人民币对美元汇率
        exchangeRates.put("EUR", 1.08);    // 欧元（西班牙）对美元汇率
        exchangeRates.put("ESP", 1.0);    // 西班牙对美元汇率
        exchangeRates.put("GBP", 1.27);    // 英镑对美元汇率
        exchangeRates.put("AUD", 0.65);    // 澳元对美元汇率
        exchangeRates.put("CAD", 0.75);    // 加元对美元汇率
        exchangeRates.put("CHF", 1.13);    // 瑞士法郎对美元汇率
        exchangeRates.put("SGD", 0.74);    // 新加坡元对美元汇率
        exchangeRates.put("HKD", 0.13);    // 港币对美元汇率
        exchangeRates.put("TWD", 0.032);   // 新台币对美元汇率
        exchangeRates.put("INR", 0.012);   // 印度卢比对美元汇率
        exchangeRates.put("RUB", 0.011);   // 俄罗斯卢布对美元汇率
        exchangeRates.put("BRL", 0.20);    // 巴西雷亚尔对美元汇率
        exchangeRates.put("ZAR", 0.053);   // 南非兰特对美元汇率
        exchangeRates.put("MXN", 0.058);   // 墨西哥比索对美元汇率
        exchangeRates.put("THB", 0.028);   // 泰铢对美元汇率
        exchangeRates.put("MYR", 0.21);    // 马来西亚林吉特对美元汇率
        exchangeRates.put("IDR", 0.000064);// 印尼盾对美元汇率
        exchangeRates.put("PHP", 0.018);   // 菲律宾比索对美元汇率
        exchangeRates.put("VND", 0.000042);// 越南盾对美元汇率
        exchangeRates.put("AED", 0.27);    // 阿联酋迪拉姆对美元汇率
        exchangeRates.put("SAR", 0.27);    // 沙特里亚尔对美元汇率
        exchangeRates.put("EGP", 0.032);   // 埃及镑对美元汇率
        exchangeRates.put("UAH", 0.026);   // 乌克兰格里夫纳对美元汇率
        exchangeRates.put("ILS", 0.28);    // 以色列谢克尔对美元汇率
        return exchangeRates.getOrDefault(currencyType, 0.0);
    }


    /**
     * 新增速卖通滞销SKU分析
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 结果
     */
    @Override
    public int insertAliexpressSkuAnalysis(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        return aliexpressSkuAnalysisMapper.insertAliexpressSkuAnalysis(aliexpressSkuAnalysis);
    }

    /**
     * 修改速卖通滞销SKU分析
     * 
     * @param aliexpressSkuAnalysis 速卖通滞销SKU分析
     * @return 结果
     */
    @Override
    public int updateAliexpressSkuAnalysis(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        return aliexpressSkuAnalysisMapper.updateAliexpressSkuAnalysis(aliexpressSkuAnalysis);
    }

    /**
     * 批量删除速卖通滞销SKU分析
     * 
     * @param ids 需要删除的速卖通滞销SKU分析主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressSkuAnalysisByIds(Long[] ids)
    {
        return aliexpressSkuAnalysisMapper.deleteAliexpressSkuAnalysisByIds(ids);
    }

    /**
     * 删除速卖通滞销SKU分析信息
     * 
     * @param id 速卖通滞销SKU分析主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressSkuAnalysisById(Long id)
    {
        return aliexpressSkuAnalysisMapper.deleteAliexpressSkuAnalysisById(id);
    }
}
