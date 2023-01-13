package com.operatorTracker.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operatorTracker.domain.OtAppOperatorTime;
import com.operatorTracker.mapper.OtAppOperatorTimeMapper;
import com.operatorTracker.service.IOtAppOperatorTimeService;

/**
 * appMachineServices
 *
 * @author Nandha Kumar
 * @date 2023-01-11
 */
@Service
public class OtAppOperatorTimeServiceImpl implements IOtAppOperatorTimeService {
	
	@Autowired
	private OtAppOperatorTimeMapper otAppOperatorTimeMapper;

	@Override
	public int insertOtAppOperatorTime(OtAppOperatorTime otAppOperatorTime) {
		
		return otAppOperatorTimeMapper.insertOtAppOperatorTime(otAppOperatorTime);
	}

	@Override
	public List<OtAppOperatorTime> selectOtAppOperatorTimeList(OtAppOperatorTime otAppOperatorTime) {
		
		return otAppOperatorTimeMapper.selectOtAppOperatorTimeList(otAppOperatorTime);
	}

	@Override
	public List<OtAppOperatorTime> selectOtAppOperatorTimeUserList(OtAppOperatorTime otAppOperatorTime) {
		
		return otAppOperatorTimeMapper.selectOtAppOperatorTimeUserList(otAppOperatorTime);
	}

}
