package com.ruoyi.aliexpress.service.impl;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysis;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisAttribute;
import com.ruoyi.aliexpress.domain.AliexpressSkuStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.AliexpressSkuAnalysisClearanceMapper;
import com.ruoyi.aliexpress.domain.AliexpressSkuAnalysisClearance;
import com.ruoyi.aliexpress.service.IAliexpressSkuAnalysisClearanceService;

/**
 * 清仓库存Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-11
 */
@Service
public class AliexpressSkuAnalysisClearanceServiceImpl implements IAliexpressSkuAnalysisClearanceService 
{
    @Autowired
    private AliexpressSkuAnalysisClearanceMapper aliexpressSkuAnalysisClearanceMapper;

    /**
     * 查询清仓库存
     * 
     * @param id 清仓库存主键
     * @return 清仓库存
     */
    @Override
    public AliexpressSkuAnalysis selectAliexpressSkuAnalysisClearanceById(Long id)
    {
        return aliexpressSkuAnalysisClearanceMapper.selectAliexpressSkuAnalysisClearanceById(id);
    }

    /**
     * 查询清仓库存列表
     * 
     * @param aliexpressSkuAnalysis 清仓库存
     * @return 清仓库存
     */
    @Override
    public List<AliexpressSkuAnalysis> selectAliexpressSkuAnalysisClearanceList(AliexpressSkuAnalysis aliexpressSkuAnalysis)
    {
        aliexpressSkuAnalysis.setSalesLast28Days(0L);
        List<AliexpressSkuAnalysis> aliexpressSkuAnalyses = aliexpressSkuAnalysisClearanceMapper.selectAliexpressSkuAnalysisClearanceList(aliexpressSkuAnalysis);
        //获取sku 国家 查询aliexpress_competition_information_attribute表中的价格和货币类型
        for (AliexpressSkuAnalysis aliexpressSkuAnalyse : aliexpressSkuAnalyses) {
            StringBuilder resultMarket = new StringBuilder();  // 用于拼接最终结果
            StringBuilder resultPrice = new StringBuilder();  // 用于拼接最终结果
            List<Double> usdPricesMarket = new ArrayList<>();
            String hotCountries=aliexpressSkuAnalyse.getCompetitorHotSalesCountries();
            String sku=aliexpressSkuAnalyse.getSku();
            //计算市场平均售价
            AliexpressSkuAnalysisAttribute AliexpressSkuAnalysiMarketPrice=new AliexpressSkuAnalysisAttribute();
            AliexpressSkuAnalysiMarketPrice.setSku(sku);
            List<AliexpressSkuAnalysisAttribute> aliexpressSkuAnalysisAttributesMarketPrice =aliexpressSkuAnalysisClearanceMapper.selectAliexpressSkuAnalysisAttributeList(AliexpressSkuAnalysiMarketPrice);
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
            // 计算最小值
            double averagePriceMarket = usdPricesMarket.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
            if (averagePriceMarket==0.0){
                resultMarket.append("");
                resultPrice.append("");
            }else {
                resultMarket.append("$").append(String.format("%.2f", averagePriceMarket));
                resultPrice.append("$").append(String.format("%.2f", averagePriceMarket*0.8));
            }



            aliexpressSkuAnalyse.setMarketAveragePrice(resultMarket.toString());
            aliexpressSkuAnalyse.setPriceComparison(resultPrice.toString());

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
                    List<AliexpressSkuAnalysisAttribute> aliexpressSkuAnalysisAttributes =aliexpressSkuAnalysisClearanceMapper.selectAliexpressSkuAnalysisAttributeList(AliexpressSkuAnalysi);
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
        return aliexpressSkuAnalysisClearanceMapper.selectAliexpressSkuStatistics(aliexpressSkuAnalysis);
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
        exchangeRates.put("PLN", 0.25); // 波兰兹罗提（PLN）对美元汇率
        exchangeRates.put("RSD", 0.0092); // 塞尔维亚第纳尔（RSD）对美元汇率
        exchangeRates.put("LTL", 0.2857);  // 立陶宛里塔斯（LTL）对美元汇率 (1 LTL ≈ 0.2857 USD)
        exchangeRates.put("RON", 0.22);    // 罗马尼亚列伊（RON）对美元汇率（1 RON ≈ 0.22 USD）
        exchangeRates.put("PAB", 1.0); // 巴拿马巴波亚（PAB）对美元汇率
        exchangeRates.put("MUR", 0.022); // 毛里求斯卢比（MUR）对美元汇率
        exchangeRates.put("CLP", 0.0012); // 智利比索（CLP）对美元汇率
        exchangeRates.put("PKR", 0.0036); // 巴基斯坦卢比（PKR）对美元汇率
        exchangeRates.put("NZD", 0.61);    // 新西兰元（NZD）对美元汇率
        exchangeRates.put("MAD", 0.10);    // 摩洛哥迪拉姆（MAD）对美元汇率
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
        exchangeRates.put("AZN", 0.588);   // 阿塞拜疆马纳特（AZN）对美元汇率（1 AZN ≈ 0.588 USD）
        exchangeRates.put("BYN", 0.3846);  // 白俄罗斯卢布（BYN）对美元汇率（1 BYN ≈ 0.3846 USD）
        exchangeRates.put("MDL", 0.0556);  // 摩尔多瓦列伊（MDL）对美元汇率（1 MDL ≈ 0.0556 USD）
        exchangeRates.put("TRY", 0.05);    // 土耳其里拉（TRY）对美元汇率（1 TRY ≈ 0.05 USD）
        exchangeRates.put("COP", 0.00025); // 哥伦比亚比索（COP）对美元汇率（1 COP ≈ 0.00025 USD）
        exchangeRates.put("TMT", 0.29);    // 土库曼斯坦马纳特（TMT）对美元汇率
        exchangeRates.put("KZT", 0.0021);  // 哈萨克斯坦坚戈（KZT）对美元汇率
        exchangeRates.put("KGS", 0.012);   // 吉尔吉斯斯坦索姆（KGS）对美元汇率
        exchangeRates.put("KES", 0.0074);  // 肯尼亚先令（KES）对美元汇率
        exchangeRates.put("TND", 0.32);    // 突尼斯第纳尔（TND）对美元汇率
        exchangeRates.put("THB", 0.029);   // 泰铢（THB）对美元汇率
        exchangeRates.put("TJS", 0.087);   // 塔吉克斯坦索莫尼（TJS）对美元汇率
        exchangeRates.put("TZS", 0.00043); // 坦桑尼亚先令（TZS）对美元汇率
        exchangeRates.put("UGX", 0.00027); // 乌干达先令（UGX）对美元汇率
        exchangeRates.put("UAH", 0.027);   // 乌克兰赫尔夫尼亚（UAH）对美元汇率
        exchangeRates.put("VND", 0.000043); // 越南盾（VND）对美元汇率
        exchangeRates.put("VES", 0.000038); // 委内瑞拉玻利瓦尔（VES）对美元汇率
        exchangeRates.put("UYU", 0.025);   // 乌拉圭比索（UYU）对美元汇率
        exchangeRates.put("VUV", 0.0088);  // 瓦努阿图瓦图（VUV）对美元汇率
        exchangeRates.put("UZS", 0.000087);  // 乌兹别克斯坦索姆（UZS）对美元汇率（1 UZS ≈ 0.000087 USD）
        exchangeRates.put("PEN", 0.27);  // 秘鲁新索尔（PEN）对美元汇率（1 PEN ≈ 0.27 USD）
        exchangeRates.put("CDF", 0.0017);  // 加蓬法郎（CDF）对美元汇率（1 CDF ≈ 0.0017 USD）
        exchangeRates.put("BGN", 0.54);  // 保加利亚列弗（BGN）对美元汇率（1 BGN ≈ 0.54 USD）
        exchangeRates.put("NOK", 0.095);  // 挪威克朗（NOK）对美元汇率（1 NOK ≈ 0.095 USD）
        exchangeRates.put("KGS", 0.0115);  // 吉尔吉斯斯坦索姆（KGS）对美元汇率（1 KGS ≈ 0.0115 USD）
        exchangeRates.put("ARS", 0.0029);  // 阿根廷比索（ARS）对美元汇率（1 ARS ≈ 0.0029 USD）
        return exchangeRates.getOrDefault(currencyType, 0.0);
    }



    /**
     * 新增清仓库存
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 结果
     */
    @Override
    public int insertAliexpressSkuAnalysisClearance(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance)
    {
        return aliexpressSkuAnalysisClearanceMapper.insertAliexpressSkuAnalysisClearance(aliexpressSkuAnalysisClearance);
    }

    /**
     * 修改清仓库存
     * 
     * @param aliexpressSkuAnalysisClearance 清仓库存
     * @return 结果
     */
    @Override
    public int updateAliexpressSkuAnalysisClearance(AliexpressSkuAnalysis aliexpressSkuAnalysisClearance)
    {
        return aliexpressSkuAnalysisClearanceMapper.updateAliexpressSkuAnalysisClearance(aliexpressSkuAnalysisClearance);
    }

    /**
     * 批量删除清仓库存
     * 
     * @param ids 需要删除的清仓库存主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressSkuAnalysisClearanceByIds(Long[] ids)
    {
        return aliexpressSkuAnalysisClearanceMapper.deleteAliexpressSkuAnalysisClearanceByIds(ids);
    }

    /**
     * 删除清仓库存信息
     * 
     * @param id 清仓库存主键
     * @return 结果
     */
    @Override
    public int deleteAliexpressSkuAnalysisClearanceById(Long id)
    {
        return aliexpressSkuAnalysisClearanceMapper.deleteAliexpressSkuAnalysisClearanceById(id);
    }
}
