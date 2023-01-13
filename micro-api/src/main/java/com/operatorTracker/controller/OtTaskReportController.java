package com.operatorTracker.controller;

import java.util.Date;
import java.util.List;
import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.domain.OtTaskAssignment;
import com.operatorTracker.page.TableDataInfo;
import com.operatorTracker.service.IOtTaskAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.operatorTracker.domain.OtTaskReport;
import com.operatorTracker.service.IOtTaskReportService;

/**
 * taskReportController
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Controller
@RequestMapping("/system/taskReport")
public class OtTaskReportController extends BaseController
{

    @Autowired
    private IOtTaskReportService otTaskReportService;
    @Autowired
    private IOtTaskAssignmentService otTaskAssignmentService;

    /**
     * Query taskReport List
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtTaskReport otTaskReport)
    {
        startPage();
        List<OtTaskReport> list = otTaskReportService.selectOtTaskReportList(otTaskReport);
        return getDataTable(list);
    }

    /**
     * add taskReport
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtTaskReport otTaskReport)
    {
        return toAjax(otTaskReportService.insertOtTaskReport(otTaskReport));
    }

    @PostMapping("/addReport")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addReport(
            @RequestParam (value = "taskAsNo") Long taskAsNo,
            @RequestParam (value = "qtyDone") Long qtyDone,
            @RequestParam (value = "remarks") String remarks,
            @RequestParam (value = "taskReportNo",required = false) Long taskReportNo,
            @RequestParam (value = "taskState") Integer taskState
    )
    {

        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("2")){
            return AjaxResult.error();
        }

        OtTaskReport otTaskReport=new OtTaskReport();
        otTaskReport.setTaskAsNo(taskAsNo);
        if(qtyDone!=null){
            otTaskReport.setQtyDone(qtyDone);
        }
        if(remarks!=null){
            otTaskReport.setRemarks(remarks);
        }
        otTaskReport.setUserNoOperator(getLoginUser().getUserNo());
        if(taskReportNo!=null){
            otTaskReport.setTaskReportNo(taskReportNo);
        }
        if(taskState==1){
            OtTaskAssignment taskAssignment=new OtTaskAssignment();
            taskAssignment.setAssignmentState("done");
            taskAssignment.setTaskAsNo(otTaskReport.getTaskAsNo());
            otTaskAssignmentService.updateOtTaskAssignment(taskAssignment);
        }
        otTaskReport.setSubmitTime(new Date());
        if(otTaskReport.getTaskReportNo()==null){
            return toAjax(otTaskReportService.insertOtTaskReport(otTaskReport));
        }else {
            return toAjax(otTaskReportService.updateOtTaskReport(otTaskReport));
        }
    }

    /**
     * edit taskReport
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtTaskReport otTaskReport)
    {
        return toAjax(otTaskReportService.updateOtTaskReport(otTaskReport));
    }

    /**
     * delete taskReport
     */
    @PostMapping( "/remove")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(String ids)
    {
        return toAjax(otTaskReportService.deleteOtTaskReportByIds(ids));
    }
}
