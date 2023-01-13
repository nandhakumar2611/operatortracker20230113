package com.operatorTracker.service.impl;

import java.util.List;

import com.operatorTracker.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.mapper.OtTaskReportMapper;
import com.operatorTracker.domain.OtTaskReport;
import com.operatorTracker.service.IOtTaskReportService;

/**
 * taskReportService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Service
public class OtTaskReportServiceImpl implements IOtTaskReportService
{
    @Autowired
    private OtTaskReportMapper otTaskReportMapper;

    /**
     * Query taskReport
     *
     * @param taskReportNo taskReportID
     * @return taskReport
     */
    @Override
    public OtTaskReport selectOtTaskReportById(Long taskReportNo)
    {
        return otTaskReportMapper.selectOtTaskReportById(taskReportNo);
    }


    public OtTaskReport selectOtTaskReportOne(OtTaskReport otTaskReport){
        List<OtTaskReport> list=selectOtTaskReportList(otTaskReport);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }
    /**
     * Query taskReport list
     *
     * @param otTaskReport taskReport
     * @return taskReport
     */
    @Override
    public List<OtTaskReport> selectOtTaskReportList(OtTaskReport otTaskReport)
    {
        return otTaskReportMapper.selectOtTaskReportList(otTaskReport);
    }

    /**
     * add taskReport
     *
     * @param otTaskReport taskReport
     * @return
     */
    @Override
    public int insertOtTaskReport(OtTaskReport otTaskReport)
    {
        return otTaskReportMapper.insertOtTaskReport(otTaskReport);
    }

    /**
     * edit taskReport
     *
     * @param otTaskReport taskReport
     * @return
     */
    @Override
    public int updateOtTaskReport(OtTaskReport otTaskReport)
    {
        return otTaskReportMapper.updateOtTaskReport(otTaskReport);
    }

    /**
     * delete taskReport object
     *
     * @param ids need  delete ID
     * @return
     */
    @Override
    public int deleteOtTaskReportByIds(String ids)
    {
        return otTaskReportMapper.deleteOtTaskReportByIds(Convert.toStrArray(ids));
    }

    /**
     * delete taskReport
     *
     * @param taskReportNo taskReportID
     * @return
     */
    @Override
    public int deleteOtTaskReportById(Long taskReportNo)
    {
        return otTaskReportMapper.deleteOtTaskReportById(taskReportNo);
    }
}
