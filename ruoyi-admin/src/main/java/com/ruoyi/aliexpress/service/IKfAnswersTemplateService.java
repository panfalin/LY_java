package com.ruoyi.aliexpress.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.aliexpress.domain.KfAnswersTemplate;
import com.ruoyi.aliexpress.domain.userOptions;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.enums.BusinessType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 客服问答SKU收集模板Service接口
 * 
 * @author ruoyi
 * @date 2024-11-22
 */
public interface IKfAnswersTemplateService 
{
    /**
     *  客服问答查询问题分类
     * @return 客服问答查询问题分类
     */
    public List<userOptions> selectUserOptions();

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
    public List<KfAnswersTemplate> selectKfAnswersTemplateAllList();
    public List<KfAnswersTemplate> selectKfAnswersFinalTreatmentList();
    public List<KfAnswersTemplate> selectKfAnswersProductTypeList();

    /**
     * 新增客服问答SKU收集模板
     * 
     * @param kfAnswersTemplate 客服问答SKU收集模板
     * @return 结果
     */
    public int insertKfAnswersTemplate(KfAnswersTemplate kfAnswersTemplate);

    public int insertKfAnswersTemplateDict(SysDictData sysDictData);


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
