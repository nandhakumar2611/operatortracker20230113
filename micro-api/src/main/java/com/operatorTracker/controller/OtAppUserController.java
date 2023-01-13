package com.operatorTracker.controller;

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
import com.operatorTracker.domain.OtAppUser;
import com.operatorTracker.service.IOtAppUserService;

/**
 * app User Controller
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Controller
@RequestMapping("/system/appUser")
public class OtAppUserController extends BaseController
{

    @Autowired
    private IOtAppUserService otAppUserService;

    /**
     * Query app User Operator list
     */
    @PostMapping("/listOperator")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listOperator(OtAppUser otAppUser)
    {
        startPage();
        List<Map> list = otAppUserService.selectOtAppUserOperatorList(otAppUser);
        return getDataTable(list);
    }


    /**
     * Query app User list
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtAppUser otAppUser)
    {
        startPage();
        List<OtAppUser> list = otAppUserService.selectOtAppUserList(otAppUser);
        return getDataTable(list);
    }

    /**
     * new appUser
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtAppUser otAppUser)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("0")){
            return AjaxResult.error();
        }
        OtAppUser checkLoginName=new OtAppUser();
        checkLoginName.setUserLoginName(otAppUser.getUserLoginName());
        List<OtAppUser> list = otAppUserService.selectOtAppUserList(checkLoginName);
        if(list==null || list.size()==0){
            return toAjax(otAppUserService.insertOtAppUser(otAppUser));
        }else {
            return AjaxResult.error("Login name already exists");
        }
    }


    /**
     * edit appUser
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtAppUser otAppUser)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("0")){
            return AjaxResult.error();
        }
        return toAjax(otAppUserService.updateOtAppUser(otAppUser));
    }

    /**
     * remove appUser
     */
    @PostMapping( "/remove")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(String ids)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("0")){
            return AjaxResult.error();
        }
        return toAjax(otAppUserService.deleteOtAppUserByIds(ids));
    }

    /**
     * remove appUser
     */
    @PostMapping( "/del")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(OtAppUser otAppUser)
    {
        if(getLoginUser()==null || !getLoginUser().getUserRole().equals("0")){
            return AjaxResult.error();
        }
        return toAjax(otAppUserService.deleteOtAppUserById(otAppUser.getUserNo()));
    }
}
