package com.operatorTracker.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.operatorTracker.domain.OtManagementOperator;
import com.operatorTracker.service.IOtManagementOperatorService;

/**
 * managementOperatorController
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Controller
@RequestMapping("/system/managementOperator")
public class OtManagementOperatorController extends BaseController
{

    @Autowired
    private IOtManagementOperatorService otManagementOperatorService;

    /**
     * Query managementOperator List
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtManagementOperator otManagementOperator)
    {
        startPage();
        List<OtManagementOperator> list = otManagementOperatorService.selectOtManagementOperatorList(otManagementOperator);
        return getDataTable(list);
    }


    @PostMapping("/listName")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listName(OtManagementOperator otManagementOperator)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("1")){
            return getDataTable(new ArrayList<>());
        }
        otManagementOperator.setUserNoManager(getLoginUser().getUserNo());
        startPage();
        List<Map> list = otManagementOperatorService.selectOtManagementOperatorListName(otManagementOperator);
        return getDataTable(list);
    }

    /**
     * add managementOperator
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtManagementOperator otManagementOperator)
    {
        return toAjax(otManagementOperatorService.insertOtManagementOperator(otManagementOperator));
    }

    /**
     * Operator Assign Manager
     * @param otManagementOperator
     * @return
     */
    @PostMapping("/operatorAdd")
    @ResponseBody
    @CrossOrigin
    public AjaxResult OperatorAdd(OtManagementOperator otManagementOperator)
    {
        OtManagementOperator search=new OtManagementOperator();
        search.setUserNoOperator(otManagementOperator.getUserNoOperator());
        List<OtManagementOperator> list = otManagementOperatorService.selectOtManagementOperatorList(search);
        if(list!=null && list.size()>0){
            for(OtManagementOperator oo:list){
                otManagementOperatorService.deleteOtManagementOperatorById(oo.getManagementOperatorNo());
            }
        }
        if(otManagementOperator.getUserNoManager()!=null){
            return toAjax(otManagementOperatorService.insertOtManagementOperator(otManagementOperator));
        }else {
            return AjaxResult.success();
        }
    }

    /**
     * edit managementOperator
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtManagementOperator otManagementOperator)
    {
        return toAjax(otManagementOperatorService.updateOtManagementOperator(otManagementOperator));
    }

    /**
     * remove managementOperator
     */
    @PostMapping( "/remove")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(String ids)
    {
        return toAjax(otManagementOperatorService.deleteOtManagementOperatorByIds(ids));
    }


    /**
     * remove managementOperator
     */
    @PostMapping( "/del")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(OtManagementOperator otManagementOperator)
    {
        return toAjax(otManagementOperatorService.deleteOtManagementOperatorById(otManagementOperator.getManagementOperatorNo()));
    }
}
