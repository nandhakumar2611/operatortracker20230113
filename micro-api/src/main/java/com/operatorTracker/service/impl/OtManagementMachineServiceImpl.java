package com.operatorTracker.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.domain.OtManagementMachine;
import com.operatorTracker.mapper.OtManagementMachineMapper;
import com.operatorTracker.service.IOtManagementMachineService;

/**
 * ManagementMachine Service
 * 
 * @author Nandha Kumar
 * @Date 2023-01-06
 */
@Service
public class OtManagementMachineServiceImpl implements IOtManagementMachineService{

	@Autowired
	private OtManagementMachineMapper otManagementMachineMapper;
	
    /**
     * add managementMachine
     *
     * @param OtManagementMachine omanagementMachine
     * @return
     */
	@Override
	public int insertOtManagementMachine(OtManagementMachine otManagementMachine) {
		
		return otManagementMachineMapper.insertOtManagementMachine(otManagementMachine);
	}

    /**
     * Query ManagementMachine list
     *
     * @param OtManagementMachine managementMachine
     * @return managementOperator
     */
	@Override
	public List<OtManagementMachine> selectOtManagementMachineList(OtManagementMachine otManagementMachine) {
		
		return otManagementMachineMapper.selectOtManagementMachineList(otManagementMachine);
	}
	
	@Override
	public List<OtManagementMachine> selectOtManagementMachinePlantList(Long appPlantNo) {
		
		return otManagementMachineMapper.selectOtManagementMachinePlantList(appPlantNo);
	}

    /**
     * Query ManagementMachine
     *
     * @param managementOperatorNo managementMachineNo
     * @return managementOperator
     */
	@Override
	public OtManagementMachine selectOtManagementMachineById(Long managementMachineNo) {
	
		return otManagementMachineMapper.selectOtManagementMachineById(managementMachineNo);
	}

    /**
     * edit ManagementMachine
     *
     * @param OtManagementMachine managementMachine
     * @return
     */
	@Override
	public int updateOtManagementMachine(OtManagementMachine otManagementMachine) {
		
		return otManagementMachineMapper.updateOtManagementMachine(otManagementMachine);
	}

    /**
     * delete ManagementMachine
     *
     * @param otManagementMachine ManagementMachine
     * @return
     */
	@Override
	public int deleteOtManagementMachineById(Long managementMachineNo) {
		
		return otManagementMachineMapper.deleteOtManagementMachineById(managementMachineNo);
	}
	
}
