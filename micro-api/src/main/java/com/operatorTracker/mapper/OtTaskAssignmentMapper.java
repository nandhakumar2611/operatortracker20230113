package com.operatorTracker.mapper;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtTaskAssignment;
import org.springframework.stereotype.Component;

/**
 * taskAssignmentMapper
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Component
public interface OtTaskAssignmentMapper
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
     * @return taskAssignment list
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
     * delete taskAssignment
     *
     * @param taskAsNo taskAssignmentID
     * @return
     */
    public int deleteOtTaskAssignmentById(Long taskAsNo);

    /**
     * more delete taskAssignment
     *
     * @param taskAsNos need  delete ID
     * @return
     */
    public int deleteOtTaskAssignmentByIds(String[] taskAsNos);
}
