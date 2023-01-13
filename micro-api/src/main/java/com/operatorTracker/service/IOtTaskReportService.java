package com.operatorTracker.service;

import java.util.List;
import com.operatorTracker.domain.OtTaskReport;

/**
 * taskReportService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public interface IOtTaskReportService
{
    /**
     * Query taskReport
     *
     * @param taskReportNo taskReportID
     * @return taskReport
     */
    public OtTaskReport selectOtTaskReportById(Long taskReportNo);

    public OtTaskReport selectOtTaskReportOne(OtTaskReport otTaskReport);
    /**
     * Query taskReport list
     *
     * @param otTaskReport taskReport
     * @return taskReport集合
     */
    public List<OtTaskReport> selectOtTaskReportList(OtTaskReport otTaskReport);

    /**
     * add taskReport
     *
     * @param otTaskReport taskReport
     * @return
     */
    public int insertOtTaskReport(OtTaskReport otTaskReport);

    /**
     * edit taskReport
     *
     * @param otTaskReport taskReport
     * @return
     */
    public int updateOtTaskReport(OtTaskReport otTaskReport);

    /**
     * 批量delete taskReport
     *
     * @param ids need  delete ID
     * @return
     */
    public int deleteOtTaskReportByIds(String ids);

    /**
     * delete taskReport
     *
     * @param taskReportNo taskReportID
     * @return
     */
    public int deleteOtTaskReportById(Long taskReportNo);
}
