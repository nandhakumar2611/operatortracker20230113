package com.operatorTracker.mapper;

import java.util.List;
import com.operatorTracker.domain.OtTaskReport;
import org.springframework.stereotype.Component;

/**
 * taskReportMapper
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Component
public interface OtTaskReportMapper
{
    /**
     * Query taskReport
     *
     * @param taskReportNo taskReportID
     * @return taskReport
     */
    public OtTaskReport selectOtTaskReportById(Long taskReportNo);

    /**
     * Query taskReport list
     *
     * @param otTaskReport taskReport
     * @return taskReport list
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
     * delete taskReport
     *
     * @param taskReportNo taskReportID
     * @return
     */
    public int deleteOtTaskReportById(Long taskReportNo);

    /**
     * more delete taskReport
     *
     * @param taskReportNos need  delete ID
     * @return
     */
    public int deleteOtTaskReportByIds(String[] taskReportNos);
}
