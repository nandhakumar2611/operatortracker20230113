package com.operatorTracker.service;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtTaskAssignment;

/**
 * taskAssignmentService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public interface IOtTaskAssignmentService
{
    /**
     * Query taskAssignment
     *
     * @param taskAsNo taskAssignmentID
     * @return taskAssignment
     */
    public OtTaskAssignment selectOtTaskAssignmentById(Long taskAsNo);

    /**
     * Query taskAssignment list
     *
     * @param otTaskAssignment taskAssignment
     * @return taskAssignment集合
     */
    public List<OtTaskAssignment> selectOtTaskAssignmentList(OtTaskAssignment otTaskAssignment);

    public List<Map> selectOtTaskAssignmentListName(OtTaskAssignment otTaskAssignment);

    public List<Map> selectOtTaskAssignmentListReport(OtTaskAssignment otTaskAssignment);

    public List<Map> selectOtTaskAssignmentListInfoAll(OtTaskAssignment otTaskAssignment);
    /**
     * add taskAssignment
     *
     * @param otTaskAssignment taskAssignment
     * @return
     */
    public int insertOtTaskAssignment(OtTaskAssignment otTaskAssignment);

    /**
     * edit taskAssignment
     *
     * @param otTaskAssignment taskAssignment
     * @return
     */
    public int updateOtTaskAssignment(OtTaskAssignment otTaskAssignment);

    /**
     * 批量delete taskAssignment
     *
     * @param ids need  delete ID
     * @return
     */
    public int deleteOtTaskAssignmentByIds(String ids);

    /**
     * delete taskAssignment
     *
     * @param taskAsNo taskAssignmentID
     * @return
     */
    public int deleteOtTaskAssignmentById(Long taskAsNo);
}
