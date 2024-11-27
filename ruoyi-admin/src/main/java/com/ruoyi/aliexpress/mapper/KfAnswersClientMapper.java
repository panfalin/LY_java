package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.KfAnswersClient;

/**
 * 用户Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
public interface KfAnswersClientMapper 
{
    /**
     * 查询用户
     * 
     * @param clientId 用户主键
     * @return 用户
     */
    public KfAnswersClient selectKfAnswersClientByClientId(String clientId);

    /**
     * 查询用户列表
     * 
     * @param kfAnswersClient 用户
     * @return 用户集合
     */
    public List<KfAnswersClient> selectKfAnswersClientList(KfAnswersClient kfAnswersClient);

    /**
     * 新增用户
     * 
     * @param kfAnswersClient 用户
     * @return 结果
     */
    public int insertKfAnswersClient(KfAnswersClient kfAnswersClient);

    /**
     * 修改用户
     * 
     * @param kfAnswersClient 用户
     * @return 结果
     */
    public int updateKfAnswersClient(KfAnswersClient kfAnswersClient);

    /**
     * 删除用户
     * 
     * @param clientId 用户主键
     * @return 结果
     */
    public int deleteKfAnswersClientByClientId(String clientId);

    /**
     * 批量删除用户
     * 
     * @param clientIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKfAnswersClientByClientIds(String[] clientIds);
}
