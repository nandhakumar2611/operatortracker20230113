package com.operatorTracker.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.operatorTracker.domain.OtAppOperatorTime;
import com.operatorTracker.domain.OtTaskAssignment;

/**
 * appMachineServices
 *
 * @author Nandha Kumar
 * @date 2023-01-11
 */
@Component
public interface OtAppOperatorTimeMapper {
	
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
