package com.operatorTracker.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.operatorTracker.domain.OtManagementMachine;

/**
 * ManagementMachine Service
 * 
 * @author Nandha Kumar
 * @Date 2023-01-06
 */
@Component
public interface OtManagementMachineMapper {
	
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
