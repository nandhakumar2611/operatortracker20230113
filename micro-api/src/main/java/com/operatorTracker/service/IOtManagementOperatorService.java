package com.operatorTracker.service;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtManagementOperator;

/**
 * managementOperatorService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public interface IOtManagementOperatorService
{
    /**
     * Query managementOperator
     *
     * @param managementOperatorNo managementOperatorID
     * @return managementOperator
     */
    public OtManagementOperator selectOtManagementOperatorById(Long managementOperatorNo);

    /**
     * Query managementOperator list
     *
     * @param otManagementOperator managementOperator
     * @return managementOperator集合
     */
    public List<OtManagementOperator> selectOtManagementOperatorList(OtManagementOperator otManagementOperator);


    public List<Map> selectOtManagementOperatorListName(OtManagementOperator otManagementOperator);

    /**
     * add managementOperator
     *
     * @param otManagementOperator managementOperator
     * @return
     */
    public int insertOtManagementOperator(OtManagementOperator otManagementOperator);

    /**
     * edit managementOperator
     *
     * @param otManagementOperator managementOperator
     * @return
     */
    public int updateOtManagementOperator(OtManagementOperator otManagementOperator);

    /**
     * 批量delete managementOperator
     *
     * @param ids need  delete ID
     * @return
     */
    public int deleteOtManagementOperatorByIds(String ids);

    /**
     * delete managementOperator
     *
     * @param managementOperatorNo managementOperatorID
     * @return
     */
    public int deleteOtManagementOperatorById(Long managementOperatorNo);
}
