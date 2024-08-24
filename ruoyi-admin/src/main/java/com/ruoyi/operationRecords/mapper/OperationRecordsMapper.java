package com.ruoyi.operationRecords.mapper;

import java.util.List;
import com.ruoyi.operationRecords.domain.OperationRecords;

/**
 * 操作记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
public interface OperationRecordsMapper 
{
    /**
     * 查询操作记录
     * 
     * @param id 操作记录主键
     * @return 操作记录
     */
    public OperationRecords selectOperationRecordsById(Long id);

    /**
     * 查询操作记录列表
     * 
     * @param operationRecords 操作记录
     * @return 操作记录集合
     */
    public List<OperationRecords> selectOperationRecordsList(OperationRecords operationRecords);

    /**
     * 新增操作记录
     * 
     * @param operationRecords 操作记录
     * @return 结果
     */
    public int insertOperationRecords(OperationRecords operationRecords);

    /**
     * 修改操作记录
     * 
     * @param operationRecords 操作记录
     * @return 结果
     */
    public int updateOperationRecords(OperationRecords operationRecords);

    /**
     * 删除操作记录
     * 
     * @param id 操作记录主键
     * @return 结果
     */
    public int deleteOperationRecordsById(Long id);

    /**
     * 批量删除操作记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOperationRecordsByIds(Long[] ids);
}
