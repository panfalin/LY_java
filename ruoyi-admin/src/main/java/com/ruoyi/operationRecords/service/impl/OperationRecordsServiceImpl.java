package com.ruoyi.operationRecords.service.impl;

import java.util.Date;
import java.util.List;

import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.operationRecords.mapper.OperationRecordsMapper;
import com.ruoyi.operationRecords.domain.OperationRecords;
import com.ruoyi.operationRecords.service.IOperationRecordsService;

import static com.ruoyi.common.utils.SecurityUtils.getLoginUser;

/**
 * 操作记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
@Service
public class OperationRecordsServiceImpl implements IOperationRecordsService 
{
    @Autowired
    private OperationRecordsMapper operationRecordsMapper;

    /**
     * 查询操作记录
     * 
     * @param id 操作记录主键
     * @return 操作记录
     */
    @Override
    public OperationRecords selectOperationRecordsById(Long id)
    {
        return operationRecordsMapper.selectOperationRecordsById(id);
    }

    /**
     * 查询操作记录列表
     * 
     * @param operationRecords 操作记录
     * @return 操作记录
     */
    @Override
    public List<OperationRecords> selectOperationRecordsList(OperationRecords operationRecords)
    {

        LoginUser user = getLoginUser();
        String userRoleKey = user.getUser().getRoles().get(0).getRoleKey();
        if ("admin".equals(userRoleKey)) {
            return operationRecordsMapper.selectOperationRecordsList(operationRecords);
        }
        String userName = user.getUser().getUserName();
        operationRecords.setSalesPerson(userName);
        return operationRecordsMapper.selectOperationRecordsList(operationRecords);
    }

    /**
     * 新增操作记录
     * 
     * @param operationRecords 操作记录
     * @return 结果
     */
    @Override
    public int insertOperationRecords(OperationRecords operationRecords)
    {
        return operationRecordsMapper.insertOperationRecords(operationRecords);
    }

    /**
     * 修改操作记录
     * 
     * @param operationRecords 操作记录
     * @return 结果
     */
    @Override
    public int updateOperationRecords(OperationRecords operationRecords)
    {
        operationRecords.setUpdateTime(DateUtils.getNowDate());
        return operationRecordsMapper.updateOperationRecords(operationRecords);
    }

    /**
     * 批量删除操作记录
     * 
     * @param ids 需要删除的操作记录主键
     * @return 结果
     */
    @Override
    public int deleteOperationRecordsByIds(Long[] ids)
    {
        return operationRecordsMapper.deleteOperationRecordsByIds(ids);
    }

    /**
     * 删除操作记录信息
     * 
     * @param id 操作记录主键
     * @return 结果
     */
    @Override
    public int deleteOperationRecordsById(Long id)
    {
        return operationRecordsMapper.deleteOperationRecordsById(id);
    }
}
