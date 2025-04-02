package com.ruoyi.amazon.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.amazon.mapper.AmzSearchTemplateMapper;
import com.ruoyi.amazon.domain.AmzSearchTemplate;
import com.ruoyi.amazon.service.IAmzSearchTemplateService;

/**
 * 搜索模板Service业务层处理
 * 
 * @author panfalin
 * @date 2025-04-02
 */
@Service
public class AmzSearchTemplateServiceImpl implements IAmzSearchTemplateService 
{
    @Autowired
    private AmzSearchTemplateMapper amzSearchTemplateMapper;

    /**
     * 查询搜索模板
     * 
     * @param id 搜索模板主键
     * @return 搜索模板
     */
    @Override
    public AmzSearchTemplate selectAmzSearchTemplateById(Long id)
    {
        return amzSearchTemplateMapper.selectAmzSearchTemplateById(id);
    }

    /**
     * 查询搜索模板列表
     * 
     * @param amzSearchTemplate 搜索模板
     * @return 搜索模板
     */
    @Override
    public List<AmzSearchTemplate> selectAmzSearchTemplateList(AmzSearchTemplate amzSearchTemplate)
    {
        return amzSearchTemplateMapper.selectAmzSearchTemplateList(amzSearchTemplate);
    }

    /**
     * 新增搜索模板
     * 
     * @param amzSearchTemplate 搜索模板
     * @return 结果
     */
    @Override
    public int insertAmzSearchTemplate(AmzSearchTemplate amzSearchTemplate)
    {
        amzSearchTemplate.setCreateTime(DateUtils.getNowDate());
        return amzSearchTemplateMapper.insertAmzSearchTemplate(amzSearchTemplate);
    }

    /**
     * 修改搜索模板
     * 
     * @param amzSearchTemplate 搜索模板
     * @return 结果
     */
    @Override
    public int updateAmzSearchTemplate(AmzSearchTemplate amzSearchTemplate)
    {
        amzSearchTemplate.setUpdateTime(DateUtils.getNowDate());
        return amzSearchTemplateMapper.updateAmzSearchTemplate(amzSearchTemplate);
    }

    /**
     * 批量删除搜索模板
     * 
     * @param ids 需要删除的搜索模板主键
     * @return 结果
     */
    @Override
    public int deleteAmzSearchTemplateByIds(Long[] ids)
    {
        return amzSearchTemplateMapper.deleteAmzSearchTemplateByIds(ids);
    }

    /**
     * 删除搜索模板信息
     * 
     * @param id 搜索模板主键
     * @return 结果
     */
    @Override
    public int deleteAmzSearchTemplateById(Long id)
    {
        return amzSearchTemplateMapper.deleteAmzSearchTemplateById(id);
    }
}
