package com.operatorTracker.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.operatorTracker.utils.Convert;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.mapper.OtManagementOperatorMapper;
import com.operatorTracker.domain.OtManagementOperator;
import com.operatorTracker.service.IOtManagementOperatorService;

/**
 * managementOperatorService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Service
public class OtManagementOperatorServiceImpl implements IOtManagementOperatorService
{
    @Autowired
    private OtManagementOperatorMapper otManagementOperatorMapper;

    /**
     * Query managementOperator
     *
     * @param managementOperatorNo managementOperatorID
     * @return managementOperator
     */
    @Override
    public OtManagementOperator selectOtManagementOperatorById(Long managementOperatorNo)
    {
        return otManagementOperatorMapper.selectOtManagementOperatorById(managementOperatorNo);
    }

    /**
     * Query managementOperator list
     *
     * @param otManagementOperator managementOperator
     * @return managementOperator
     */
    @Override
    public List<OtManagementOperator> selectOtManagementOperatorList(OtManagementOperator otManagementOperator)
    {
        return otManagementOperatorMapper.selectOtManagementOperatorList(otManagementOperator);
    }


    @Override
    public List<Map> selectOtManagementOperatorListName(OtManagementOperator otManagementOperator)
    {
        return otManagementOperatorMapper.selectOtManagementOperatorListName(otManagementOperator);
    }

    /**
     * add managementOperator
     *
     * @param otManagementOperator managementOperator
     * @return
     */
    @Override
    public int insertOtManagementOperator(OtManagementOperator otManagementOperator)
    {
        otManagementOperator.setCreateTime(new Date());
        return otManagementOperatorMapper.insertOtManagementOperator(otManagementOperator);
    }

    /**
     * edit managementOperator
     *
     * @param otManagementOperator managementOperator
     * @return
     */
    @Override
    public int updateOtManagementOperator(OtManagementOperator otManagementOperator)
    {
        return otManagementOperatorMapper.updateOtManagementOperator(otManagementOperator);
    }

    /**
     * delete managementOperator object
     *
     * @param ids need  delete ID
     * @return
     */
    @Override
    public int deleteOtManagementOperatorByIds(String ids)
    {
        return otManagementOperatorMapper.deleteOtManagementOperatorByIds(Convert.toStrArray(ids));
    }

    /**
     * delete managementOperator
     *
     * @param managementOperatorNo managementOperatorID
     * @return
     */
    @Override
    public int deleteOtManagementOperatorById(Long managementOperatorNo)
    {
        return otManagementOperatorMapper.deleteOtManagementOperatorById(managementOperatorNo);
    }
}
