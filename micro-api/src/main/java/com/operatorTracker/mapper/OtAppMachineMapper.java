package com.operatorTracker.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import com.operatorTracker.domain.OtAppMachine;

/**
 * appMachien mappper
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */
@Component
public interface OtAppMachineMapper {
	
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
