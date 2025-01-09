package com.ruoyi.aliexpress.mapper;

import java.util.List;
import com.ruoyi.aliexpress.domain.OperationStoreManager;

/**
 * 店长运营Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-09
 */
public interface OperationStoreManagerMapper 
{
    /**
     * 查询店长运营
     * 
     * @param sId 店长运营主键
     * @return 店长运营
     */
    public OperationStoreManager selectOperationStoreManagerBySId(Long sId);

    /**
     * 查询店长运营列表
     * 
     * @param operationStoreManager 店长运营
     * @return 店长运营集合
     */
    public List<OperationStoreManager> selectOperationStoreManagerList(OperationStoreManager operationStoreManager);

    /**
     * 新增店长运营
     * 
     * @param operationStoreManager 店长运营
     * @return 结果
     */
    public int insertOperationStoreManager(OperationStoreManager operationStoreManager);

    /**
     * 修改店长运营
     * 
     * @param operationStoreManager 店长运营
     * @return 结果
     */
    public int updateOperationStoreManager(OperationStoreManager operationStoreManager);

    /**
     * 删除店长运营
     * 
     * @param sId 店长运营主键
     * @return 结果
     */
    public int deleteOperationStoreManagerBySId(Long sId);

    /**
     * 批量删除店长运营
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOperationStoreManagerBySIds(Long[] sIds);
}
