package com.operatorTracker.service;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtAppUser;
import com.operatorTracker.domain.OtManagementMachine;
import com.operatorTracker.domain.OtManagementOperator;

/**
 * ManagementMachine Service
 * 
 * @author Nandha Kumar
 * @Date 2023-01-06
 */
public interface IOtManagementMachineService {

    /**
     * add managementMachine
     *
     * @param OtManagementMachine omanagementMachine
     * @return
     */
	int insertOtManagementMachine(OtManagementMachine otManagementMachine);
	
    /**
     * Query ManagementMachine list
     *
     * @param OtManagementMachine managementMachine
     * @return managementOperator
     */
	public List<OtManagementMachine> selectOtManagementMachineList(OtManagementMachine otManagementMachine);
	
	public List<OtManagementMachine> selectOtManagementMachinePlantList(Long appPlantNo);
	
    /**
     * Query ManagementMachine
     *
     * @param managementOperatorNo managementMachineNo
     * @return managementOperator
     */
	OtManagementMachine selectOtManagementMachineById(Long managementMachineNo);
	
    /**
     * edit ManagementMachine
     *
     * @param OtManagementMachine managementMachine
     * @return
     */
	int updateOtManagementMachine(OtManagementMachine otManagementMachine);
	
    /**
     * delete ManagementMachine
     *
     * @param otManagementMachine ManagementMachine
     * @return
     */
	int deleteOtManagementMachineById(Long managementMachineNo);
	
}
