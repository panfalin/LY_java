package com.ruoyi.amazon.mapper;

import java.util.List;
import com.ruoyi.amazon.domain.AmzSearchTemplate;

/**
 * 搜索模板Mapper接口
 * 
 * @author panfalin
 * @date 2025-04-02
 */
public interface AmzSearchTemplateMapper 
{
    /**
     * 查询搜索模板
     * 
     * @param id 搜索模板主键
     * @return 搜索模板
     */
    public AmzSearchTemplate selectAmzSearchTemplateById(Long id);

    /**
     * 查询搜索模板列表
     * 
     * @param amzSearchTemplate 搜索模板
     * @return 搜索模板集合
     */
    public List<AmzSearchTemplate> selectAmzSearchTemplateList(AmzSearchTemplate amzSearchTemplate);

    /**
     * 新增搜索模板
     * 
     * @param amzSearchTemplate 搜索模板
     * @return 结果
     */
    public int insertAmzSearchTemplate(AmzSearchTemplate amzSearchTemplate);

    /**
     * 修改搜索模板
     * 
     * @param amzSearchTemplate 搜索模板
     * @return 结果
     */
    public int updateAmzSearchTemplate(AmzSearchTemplate amzSearchTemplate);

    /**
     * 删除搜索模板
     * 
     * @param id 搜索模板主键
     * @return 结果
     */
    public int deleteAmzSearchTemplateById(Long id);

    /**
     * 批量删除搜索模板
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAmzSearchTemplateByIds(Long[] ids);
}
