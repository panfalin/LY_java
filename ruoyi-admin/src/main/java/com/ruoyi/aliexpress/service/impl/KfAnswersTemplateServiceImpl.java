package com.ruoyi.aliexpress.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ruoyi.aliexpress.domain.userOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.KfAnswersTemplateMapper;
import com.ruoyi.aliexpress.domain.KfAnswersTemplate;
import com.ruoyi.aliexpress.service.IKfAnswersTemplateService;

/**
 * 客服问答SKU收集模板Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-22
 */
@Service
public class KfAnswersTemplateServiceImpl implements IKfAnswersTemplateService 
{
    @Autowired
    private KfAnswersTemplateMapper kfAnswersTemplateMapper;


    /**
     *  客服问答查询问题分类
     * @return 客服问答查询问题分类
     */
    public List<userOptions> selectUserOptions(){
        List<userOptions> resultList = this.kfAnswersTemplateMapper.selectUserOptions();
        if (resultList == null) {
            resultList = new ArrayList<>();
        }
        return resultList;
    }


    /**
     * 查询客服问答SKU收集模板
     * @param sku 客服问答SKU收集模板主键
     * @return 客服问答SKU收集模板
     */
    @Override
    public KfAnswersTemplate selectKfAnswersTemplateBySku(String sku)
    {
        return kfAnswersTemplateMapper.selectKfAnswersTemplateBySku(sku);
    }

    /**
     * 查询客服问答SKU收集模板列表
     * 
     * @param kfAnswersTemplate 客服问答SKU收集模板
     * @return 客服问答SKU收集模板
     */
    @Override
    public List<KfAnswersTemplate> selectKfAnswersTemplateList(KfAnswersTemplate kfAnswersTemplate)
    {
        return kfAnswersTemplateMapper.selectKfAnswersTemplateList(kfAnswersTemplate);
    }

    /**
     * 新增客服问答SKU收集模板
     * 
     * @param kfAnswersTemplate 客服问答SKU收集模板
     * @return 结果
     */
    @Override
    public int insertKfAnswersTemplate(KfAnswersTemplate kfAnswersTemplate)
    {
        return kfAnswersTemplateMapper.insertKfAnswersTemplate(kfAnswersTemplate);
    }

    /**
     * 修改客服问答SKU收集模板
     * 
     * @param kfAnswersTemplate 客服问答SKU收集模板
     * @return 结果
     */
    @Override
    public int updateKfAnswersTemplate(KfAnswersTemplate kfAnswersTemplate)
    {
        return kfAnswersTemplateMapper.updateKfAnswersTemplate(kfAnswersTemplate);
    }

    /**
     * 批量删除客服问答SKU收集模板
     * 
     * @param skus 需要删除的客服问答SKU收集模板主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersTemplateBySkus(String[] skus)
    {
        return kfAnswersTemplateMapper.deleteKfAnswersTemplateBySkus(skus);
    }

    /**
     * 删除客服问答SKU收集模板信息
     * 
     * @param sku 客服问答SKU收集模板主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersTemplateBySku(String sku)
    {
        return kfAnswersTemplateMapper.deleteKfAnswersTemplateBySku(sku);
    }
}
