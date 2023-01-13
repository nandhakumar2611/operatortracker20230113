package com.operatorTracker.mapper;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtManagementOperator;
import org.springframework.stereotype.Component;

/**
 * managementOperatorMapper
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Component
public interface OtManagementOperatorMapper
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
     * @return managementOperator list
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
     * delete managementOperator
     *
     * @param managementOperatorNo managementOperatorID
     * @return
     */
    public int deleteOtManagementOperatorById(Long managementOperatorNo);

    /**
     * more delete managementOperator
     *
     * @param managementOperatorNos need  delete ID
     * @return
     */
    public int deleteOtManagementOperatorByIds(String[] managementOperatorNos);
}
