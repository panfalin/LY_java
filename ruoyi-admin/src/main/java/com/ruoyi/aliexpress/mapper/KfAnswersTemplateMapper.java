package com.ruoyi.aliexpress.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.aliexpress.domain.KfAnswersTemplate;
import com.ruoyi.aliexpress.domain.userOptions;
import org.apache.catalina.valves.rewrite.Substitution;

/**
 * 客服问答SKU收集模板Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-22
 */
public interface KfAnswersTemplateMapper 
{

    /**
     *  客服问答查询处理人
     * @return 客服问答查处理人
     */
    public List<userOptions> selectUserOptions();

    public List<KfAnswersTemplate> selectKfAnswersTemplateAllList();
    public List<KfAnswersTemplate> selectKfAnswersFinalTreatmentList();
    public List<KfAnswersTemplate> selectKfAnswersProductTypeList();

    /**
     * 查询客服问答SKU收集模板
     * 
     * @param sId 客服问答SKU收集模板主键
     * @return 客服问答SKU收集模板
     */
    public KfAnswersTemplate selectKfAnswersTemplateBySku(String sId);

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
     * 删除客服问答SKU收集模板
     * 
     * @param sku 客服问答SKU收集模板主键
     * @return 结果
     */
    public int deleteKfAnswersTemplateBySku(String sku);

    /**
     * 批量删除客服问答SKU收集模板
     * 
     * @param skus 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKfAnswersTemplateBySkus(String[] skus);
}
