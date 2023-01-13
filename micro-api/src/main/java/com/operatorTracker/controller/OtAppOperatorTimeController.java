package com.operatorTracker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.domain.OtAppMachine;
import com.operatorTracker.domain.OtAppOperatorTime;
import com.operatorTracker.domain.OtTaskAssignment;
import com.operatorTracker.page.TableDataInfo;
import com.operatorTracker.service.IOtAppOperatorTimeService;

/**
 * Operator Time Controller
 *
 * @author Nandha Kumar
 * @date 2023-01-12
 */
@Controller
@RequestMapping("/system/operatorTime")
public class OtAppOperatorTimeController extends BaseController{
	
	@Autowired
	private IOtAppOperatorTimeService otAppOperatorTimeService;
	
	/**
     * new time
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtAppOperatorTime otAppOperatorTime)
    {
    	otAppOperatorTime.setOperatorNo(getLoginUser().getUserNo());
        return toAjax(otAppOperatorTimeService.insertOtAppOperatorTime(otAppOperatorTime));
    }
    
    /**
     * view time List
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtAppOperatorTime otAppOperatorTime)
    {
        startPage();
        List<OtAppOperatorTime> list = otAppOperatorTimeService.selectOtAppOperatorTimeList(otAppOperatorTime);
        return getDataTable(list);
    }
    
    /**
     * Query app Machine plant list
     */
    @PostMapping("/listUser")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listOperator(OtAppOperatorTime otAppOperatorTime)
    {
        startPage();
        List<OtAppOperatorTime> list = otAppOperatorTimeService.selectOtAppOperatorTimeUserList(otAppOperatorTime);
        return getDataTable(list);
    }

}
