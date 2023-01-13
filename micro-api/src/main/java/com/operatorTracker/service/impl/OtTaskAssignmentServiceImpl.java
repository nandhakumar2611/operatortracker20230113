package com.operatorTracker.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtDictOperations;
import com.operatorTracker.domain.OtTaskList;
import com.operatorTracker.domain.OtTaskReport;
import com.operatorTracker.mapper.OtDictOperationsMapper;
import com.operatorTracker.mapper.OtTaskListMapper;
import com.operatorTracker.mapper.OtTaskReportMapper;
import com.operatorTracker.service.IOtTaskReportService;
import com.operatorTracker.utils.Convert;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.mapper.OtTaskAssignmentMapper;
import com.operatorTracker.domain.OtTaskAssignment;
import com.operatorTracker.service.IOtTaskAssignmentService;

/**
 * taskAssignmentService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Service
public class OtTaskAssignmentServiceImpl implements IOtTaskAssignmentService
{
    @Autowired
    private OtTaskAssignmentMapper otTaskAssignmentMapper;
    @Autowired
    private OtTaskListMapper otTaskListMapper;
    @Autowired
    private OtDictOperationsMapper otDictOperationsMapper;

    @Autowired
    private IOtTaskReportService otTaskReportService;

    /**
     * Query taskAssignment
     *
     * @param taskAsNo taskAssignmentID
     * @return taskAssignment
     */
    @Override
    public OtTaskAssignment selectOtTaskAssignmentById(Long taskAsNo)
    {
        return otTaskAssignmentMapper.selectOtTaskAssignmentById(taskAsNo);
    }

    /**
     * Query taskAssignment list
     *
     * @param otTaskAssignment taskAssignment
     * @return taskAssignment
     */
    @Override
    public List<OtTaskAssignment> selectOtTaskAssignmentList(OtTaskAssignment otTaskAssignment)
    {
        return otTaskAssignmentMapper.selectOtTaskAssignmentList(otTaskAssignment);
    }

    @Override
    public List<Map> selectOtTaskAssignmentListName(OtTaskAssignment otTaskAssignment)
    {
        return otTaskAssignmentMapper.selectOtTaskAssignmentListName(otTaskAssignment);
    }

    @Override
    public List<Map> selectOtTaskAssignmentListReport(OtTaskAssignment otTaskAssignment)
    {
        return otTaskAssignmentMapper.selectOtTaskAssignmentListReport(otTaskAssignment);
    }

    @Override
    public List<Map> selectOtTaskAssignmentListInfoAll(OtTaskAssignment otTaskAssignment)
    {
        return otTaskAssignmentMapper.selectOtTaskAssignmentListInfoAll(otTaskAssignment);
    }

    /**
     * add taskAssignment
     *
     * @param otTaskAssignment taskAssignment
     * @return
     */
    @Override
    public int insertOtTaskAssignment(OtTaskAssignment otTaskAssignment)
    {
        return otTaskAssignmentMapper.insertOtTaskAssignment(otTaskAssignment);
    }

    /**
     * edit taskAssignment
     *
     * @param otTaskAssignment taskAssignment
     * @return
     */
    @Override
    public int updateOtTaskAssignment(OtTaskAssignment otTaskAssignment)
    {
        return otTaskAssignmentMapper.updateOtTaskAssignment(otTaskAssignment);
    }

    /**
     * delete taskAssignment object
     *
     * @param ids need  delete ID
     * @return
     */
    @Override
    public int deleteOtTaskAssignmentByIds(String ids)
    {
        return otTaskAssignmentMapper.deleteOtTaskAssignmentByIds(Convert.toStrArray(ids));
    }

    /**
     * delete taskAssignment
     *
     * @param taskAsNo taskAssignmentID
     * @return
     */
    @Override
    public int deleteOtTaskAssignmentById(Long taskAsNo)
    {
        return otTaskAssignmentMapper.deleteOtTaskAssignmentById(taskAsNo);
    }
}
