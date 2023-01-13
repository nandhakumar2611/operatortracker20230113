package com.operatorTracker.service;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtAppMachine;
import com.operatorTracker.domain.OtAppOperatorTime;
import com.operatorTracker.domain.OtTaskAssignment;

/**
 * appMachineServices
 *
 * @author Nandha Kumar
 * @date 2023-01-11
 */
public interface IOtAppOperatorTimeService {

	/**
	 * add operatorTaskTime
	 *
	 * @param OtAppOperatorTime OtAppOperatorTime
	 * @return
	 */
	int insertOtAppOperatorTime(OtAppOperatorTime otAppOperatorTime);

	/**
	 * view operatorTaskTime
	 *
	 * @param OtAppOperatorTime OtAppOperatorTime
	 * @return
	 */
	List<OtAppOperatorTime> selectOtAppOperatorTimeList(OtAppOperatorTime otAppOperatorTime);

	List<OtAppOperatorTime> selectOtAppOperatorTimeUserList(OtAppOperatorTime otAppOperatorTime);

	
}
