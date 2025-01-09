package com.ruoyi.aliexpress.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.aliexpress.mapper.OperationStoreManagerMapper;
import com.ruoyi.aliexpress.domain.OperationStoreManager;
import com.ruoyi.aliexpress.service.IOperationStoreManagerService;

/**
 * 店长运营Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
@Service
public class OperationStoreManagerServiceImpl implements IOperationStoreManagerService 
{
    @Autowired
    private OperationStoreManagerMapper operationStoreManagerMapper;

    /**
     * 查询店长运营
     * 
     * @param sId 店长运营主键
     * @return 店长运营
     */
    @Override
    public OperationStoreManager selectOperationStoreManagerBySId(Long sId)
    {
        return operationStoreManagerMapper.selectOperationStoreManagerBySId(sId);
    }

    /**
     * 查询店长运营列表
     * 
     * @param operationStoreManager 店长运营
     * @return 店长运营
     */
    @Override
    public List<OperationStoreManager> selectOperationStoreManagerList(OperationStoreManager operationStoreManager)
    {
        return operationStoreManagerMapper.selectOperationStoreManagerList(operationStoreManager);
    }

    /**
     * 新增店长运营
     * 
     * @param operationStoreManager 店长运营
     * @return 结果
     */
    @Override
    public int insertOperationStoreManager(OperationStoreManager operationStoreManager)
    {
        operationStoreManager.setCreateTime(DateUtils.getNowDate());
        return operationStoreManagerMapper.insertOperationStoreManager(operationStoreManager);
    }

    /**
     * 修改店长运营
     * 
     * @param operationStoreManager 店长运营
     * @return 结果
     */
    @Override
    public int updateOperationStoreManager(OperationStoreManager operationStoreManager)
    {
        return operationStoreManagerMapper.updateOperationStoreManager(operationStoreManager);
    }

    /**
     * 批量删除店长运营
     * 
     * @param sIds 需要删除的店长运营主键
     * @return 结果
     */
    @Override
    public int deleteOperationStoreManagerBySIds(Long[] sIds)
    {
        return operationStoreManagerMapper.deleteOperationStoreManagerBySIds(sIds);
    }

    /**
     * 删除店长运营信息
     * 
     * @param sId 店长运营主键
     * @return 结果
     */
    @Override
    public int deleteOperationStoreManagerBySId(Long sId)
    {
        return operationStoreManagerMapper.deleteOperationStoreManagerBySId(sId);
    }
}
