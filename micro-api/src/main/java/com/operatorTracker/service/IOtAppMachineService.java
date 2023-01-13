package com.operatorTracker.service;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtAppMachine;

/**
 * appMachine Service
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */
public interface IOtAppMachineService {
	
	/**
	 * add appMachine
	 *
	 * @param OtAppMachine otAppMachine
	 * @return
	 */
	int insertOtAppMachine(OtAppMachine otAppMachine);
	
    /**
     * Query appMachine list
     *
     * @param OtAppMachine otAppMachine
     * @return appPlant
     */
	public List<OtAppMachine> selectOtAppMachineList(OtAppMachine otAppMachine);
	
	/**
	 * Query appMachine list
	 *
	 * @param OtAppMachine machineNo
	 * @return AppPlant
	 */
	OtAppMachine selectOtAppMachineById(Long machineNo);
	
	List<Map> selectOtAppMachinePlantList(OtAppMachine otAppMachine);
	
	/**
	 * edit appMachine
	 *
	 * @param OtAppMachine otAppMachine
	 * @return
	 */
	int updateOtAppMachine(OtAppMachine otAppMachine);
	
	/**
	 * delete appMachine
	 *
	 * @param OtAppMachine machineNo
	 * @return
	 */
	int deleteOtAppMachine(Long machineNo);



}
