package com.operatorTracker.controller;

import com.alibaba.fastjson.JSONObject;
import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.domain.OtAppUser;
import com.operatorTracker.security.JWTUtils;
import com.operatorTracker.service.IOtAppUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Login
 *
 * @author
 */

@RestController
@RequestMapping("/system/user")
@CrossOrigin
public class LoginController
{
    protected final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private IOtAppUserService otAppUserService;

    @PostMapping("/login")
    public AjaxResult login(OtAppUser user) {
        if(user.getUserLoginName()=="" || user.getUserPasswd()==""){
            return AjaxResult.error("login fail");
        }
        user=otAppUserService.selectOtAppUserOne(user);
        if(user==null){
            return AjaxResult.error("login fail.Login name or password error.");
        }
        JSONObject object=new JSONObject();
        object.put("Authorization",JWTUtils.getToken(user));
        object.put("userRole",user.getUserRole());
        object.put("userTrueName",user.getUserTrueName());
        return AjaxResult.success(object);
    }


}
