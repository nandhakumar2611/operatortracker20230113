package com.operatorTracker.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.domain.OtAppUser;
import com.operatorTracker.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.operatorTracker.domain.OtTaskList;
import com.operatorTracker.service.IOtTaskListService;

/**
 * taskListController
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Controller
@RequestMapping("/system/taskList")
public class OtTaskListController extends BaseController
{

    @Autowired
    private IOtTaskListService otTaskListService;

    /**
     * Query taskList List
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtTaskList otTaskList)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return getDataTable(new ArrayList<>());
        }
        otTaskList.setUserNoManager(getLoginUser().getUserNo());
        startPage();
        List<OtTaskList> list = otTaskListService.selectOtTaskListList(otTaskList);
        return getDataTable(list);
    }

    @PostMapping("/listAss")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listAss(OtTaskList otTaskList)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return getDataTable(new ArrayList<>());
        }
        otTaskList.setUserNoManager(getLoginUser().getUserNo());
        startPage();
        List<Map> list = otTaskListService.selectOtTaskListListAss(otTaskList);
        return getDataTable(list);
    }

    /**
     * add taskList
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtTaskList otTaskList)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return AjaxResult.error();
        }
        otTaskList.setUserNoManager(getLoginUser().getUserNo());
        otTaskList.setTaskState("inProcess");
        return toAjax(otTaskListService.insertOtTaskList(otTaskList));
    }

    /**
     * edit taskList
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OtTaskList otTaskList)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return AjaxResult.error();
        }
        otTaskList.setUserNoManager(getLoginUser().getUserNo());
        return toAjax(otTaskListService.updateOtTaskList(otTaskList));
    }

    /**
     * delete taskList
     */
    @PostMapping( "/remove")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(String ids)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return AjaxResult.error();
        }
        return toAjax(otTaskListService.deleteOtTaskListByIds(ids));
    }
    
    /**
     * remove appUser
     */
    @PostMapping( "/del")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(OtTaskList otTaskList)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return AjaxResult.error();
        }
        return toAjax(otTaskListService.deleteOtTaskListById(otTaskList.getTaskNo()));
    }
}
