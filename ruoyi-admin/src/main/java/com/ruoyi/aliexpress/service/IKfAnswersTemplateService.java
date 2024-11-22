package com.ruoyi.aliexpress.service;

import java.util.List;
import com.ruoyi.aliexpress.domain.KfAnswersTemplate;

/**
 * 客服问答SKU收集模板Service接口
 * 
 * @author ruoyi
 * @date 2024-11-22
 */
public interface IKfAnswersTemplateService 
{
    /**
     * 查询客服问答SKU收集模板
     * 
     * @param sku 客服问答SKU收集模板主键
     * @return 客服问答SKU收集模板
     */
    public KfAnswersTemplate selectKfAnswersTemplateBySku(String sku);

    /**
     * 查询客服问答SKU收集模板列表
     * 
     * @param kfAnswersTemplate 客服问答SKU收集模板
     * @return 客服问答SKU收集模板集合
     */
    public List<KfAnswersTemplate> selectKfAnswersTemplateList(KfAnswersTemplate kfAnswersTemplate);

    /**
     * 新增客服问答SKU收集模板
     * 
     * @param kfAnswersTemplate 客服问答SKU收集模板
     * @return 结果
     */
    public int insertKfAnswersTemplate(KfAnswersTemplate kfAnswersTemplate);

    /**
     * 修改客服问答SKU收集模板
     * 
     * @param kfAnswersTemplate 客服问答SKU收集模板
     * @return 结果
     */
    public int updateKfAnswersTemplate(KfAnswersTemplate kfAnswersTemplate);

    /**
     * 批量删除客服问答SKU收集模板
     * 
     * @param skus 需要删除的客服问答SKU收集模板主键集合
     * @return 结果
     */
    public int deleteKfAnswersTemplateBySkus(String[] skus);

    /**
     * 删除客服问答SKU收集模板信息
     * 
     * @param sku 客服问答SKU收集模板主键
     * @return 结果
     */
    public int deleteKfAnswersTemplateBySku(String sku);
}
