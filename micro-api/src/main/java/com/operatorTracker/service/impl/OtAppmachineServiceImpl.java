package com.operatorTracker.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.domain.OtAppMachine;
import com.operatorTracker.mapper.OtAppMachineMapper;
import com.operatorTracker.service.IOtAppMachineService;

/**
 * appMachineServices
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */
@Service
public class OtAppmachineServiceImpl implements IOtAppMachineService{
	
	@Autowired
	private OtAppMachineMapper otAppMachineMapper;
	
	/**
	 * add appMachine
	 *
	 * @param OtAppMachine otAppMachine
	 * @return
	 */
	@Override
	public int insertOtAppMachine(OtAppMachine otAppMachine) {
	
		return otAppMachineMapper.insertOtAppMachine(otAppMachine);
	}
	
    /**
     * Query appMachine list
     *
     * @param OtAppMachine otAppMachine
     * @return appPlant
     */
	@Override
	public List<OtAppMachine> selectOtAppMachineList(OtAppMachine otAppMachine) {
		
		return otAppMachineMapper.selectOtAppMachineList(otAppMachine);
	}
	
    @Override
    public List<Map> selectOtAppMachinePlantList(OtAppMachine otAppMachine)
    {
        return otAppMachineMapper.selectOtAppMachinePlantList(otAppMachine);
    }
    
	/**
	 * Query appMachine list
	 *
	 * @param OtAppMachine machineNo
	 * @return AppPlant
	 */
	@Override
	public OtAppMachine selectOtAppMachineById(Long machineNo) {
		
		return otAppMachineMapper.selectOtAppMachineById(machineNo);
	}

	/**
	 * edit appMachine
	 *
	 * @param OtAppMachine otAppMachine
	 * @return
	 */
	@Override
	public int updateOtAppMachine(OtAppMachine otAppMachine) {
		
		return otAppMachineMapper.updateOtAppMachine(otAppMachine);
	}

	/**
	 * delete appMachine
	 *
	 * @param OtAppMachine machineNo
	 * @return
	 */
	@Override
	public int deleteOtAppMachine(Long machineNo) {
		
		return otAppMachineMapper.deleteOtAppMachine(machineNo);
	}
	
}
