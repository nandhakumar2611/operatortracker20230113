package com.operatorTracker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.domain.OtTaskList;
import com.operatorTracker.page.TableDataInfo;
import com.operatorTracker.service.IOtTaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.operatorTracker.domain.OtTaskAssignment;
import com.operatorTracker.service.IOtTaskAssignmentService;

/**
 * taskAssignmentController
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Controller
@RequestMapping("/system/taskAssignment")
public class OtTaskAssignmentController extends BaseController
{

    @Autowired
    private IOtTaskAssignmentService otTaskAssignmentService;
    @Autowired
    private IOtTaskListService otTaskListService;

    /**
     * Query taskAssignment List
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtTaskAssignment otTaskAssignment)
    {
        startPage();
        List<OtTaskAssignment> list = otTaskAssignmentService.selectOtTaskAssignmentList(otTaskAssignment);
        return getDataTable(list);
    }


    @PostMapping("/listName")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listName(OtTaskAssignment otTaskAssignment)
    {
        startPage();
        List<Map> list = otTaskAssignmentService.selectOtTaskAssignmentListName(otTaskAssignment);
        return getDataTable(list);
    }

    @PostMapping("/listOperatorAll")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listOperatorAll(OtTaskAssignment otTaskAssignment)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("2")){
            return getDataTable(new ArrayList<>());
        }
        otTaskAssignment.setUserNoOperator(getLoginUser().getUserNo());
        startPage();
        List<Map> list = otTaskAssignmentService.selectOtTaskAssignmentListInfoAll(otTaskAssignment);
        return getDataTable(list);
    }

    @PostMapping("/listReport")
    @ResponseBody
    @CrossOrigin
    public AjaxResult listReport(OtTaskAssignment otTaskAssignment)
    {
        if(getLoginUser()==null){
            return AjaxResult.error();
        }
        Map<String,Object> map=new HashMap<>();
        OtTaskList taskList=otTaskListService.selectOtTaskListById(otTaskAssignment.getTaskNo());
        map.put("taskList",taskList);
        List<Map> list = otTaskAssignmentService.selectOtTaskAssignmentListReport(otTaskAssignment);
        map.put("list",list);
        return AjaxResult.success(map);
    }

    /**
     * add taskAssignment
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtTaskAssignment otTaskAssignment)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return AjaxResult.error();
        }
        otTaskAssignment.setAssignmentState("inProcess");
        return toAjax(otTaskAssignmentService.insertOtTaskAssignment(otTaskAssignment));
    }

    /**
     * edit taskAssignment
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtTaskAssignment otTaskAssignment)
    {
        return toAjax(otTaskAssignmentService.updateOtTaskAssignment(otTaskAssignment));
    }

    /**
     * delete taskAssignment
     */
    @PostMapping( "/remove")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(String ids)
    {
        return toAjax(otTaskAssignmentService.deleteOtTaskAssignmentByIds(ids));
    }
}
