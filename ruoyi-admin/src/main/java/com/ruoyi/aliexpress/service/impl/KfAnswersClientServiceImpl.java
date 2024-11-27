package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.KfAnswersClientMapper;
import com.ruoyi.aliexpress.domain.KfAnswersClient;
import com.ruoyi.aliexpress.service.IKfAnswersClientService;

/**
 * 用户Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-27
 */
@Service
public class KfAnswersClientServiceImpl implements IKfAnswersClientService 
{
    @Autowired
    private KfAnswersClientMapper kfAnswersClientMapper;

    /**
     * 查询用户
     * 
     * @param clientId 用户主键
     * @return 用户
     */
    @Override
    public KfAnswersClient selectKfAnswersClientByClientId(String clientId)
    {
        return kfAnswersClientMapper.selectKfAnswersClientByClientId(clientId);
    }

    /**
     * 查询用户列表
     * 
     * @param kfAnswersClient 用户
     * @return 用户
     */
    @Override
    public List<KfAnswersClient> selectKfAnswersClientList(KfAnswersClient kfAnswersClient)
    {
        return kfAnswersClientMapper.selectKfAnswersClientList(kfAnswersClient);
    }

    /**
     * 新增用户
     * 
     * @param kfAnswersClient 用户
     * @return 结果
     */
    @Override
    public int insertKfAnswersClient(KfAnswersClient kfAnswersClient)
    {
        return kfAnswersClientMapper.insertKfAnswersClient(kfAnswersClient);
    }

    /**
     * 修改用户
     * 
     * @param kfAnswersClient 用户
     * @return 结果
     */
    @Override
    public int updateKfAnswersClient(KfAnswersClient kfAnswersClient)
    {
        kfAnswersClient.setUpdateTime(DateUtils.getNowDate());
        return kfAnswersClientMapper.updateKfAnswersClient(kfAnswersClient);
    }

    /**
     * 批量删除用户
     * 
     * @param clientIds 需要删除的用户主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersClientByClientIds(String[] clientIds)
    {
        return kfAnswersClientMapper.deleteKfAnswersClientByClientIds(clientIds);
    }

    /**
     * 删除用户信息
     * 
     * @param clientId 用户主键
     * @return 结果
     */
    @Override
    public int deleteKfAnswersClientByClientId(String clientId)
    {
        return kfAnswersClientMapper.deleteKfAnswersClientByClientId(clientId);
    }
}
