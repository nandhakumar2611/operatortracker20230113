package com.operatorTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.domain.OtManagementMachine;
import com.operatorTracker.page.TableDataInfo;
import com.operatorTracker.service.IOtManagementMachineService;

/**
 * ManagementMachine controller
 * 
 * @author Nandha Kumar
 * @Date 2023-01-06
 */
@Controller
@RequestMapping("/system/managementMachine")
public class OtManagementMachineController extends BaseController {
	
	@Autowired
	private IOtManagementMachineService otManagementMachineService;
	
    /**
     * add ManagementMachine
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtManagementMachine otManagementMachine)
    {
        return toAjax(otManagementMachineService.insertOtManagementMachine(otManagementMachine));
    }
    
    /**
     * Query ManagementMachine List
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtManagementMachine otManagementMachine)
    {
        startPage();
        List<OtManagementMachine> list = otManagementMachineService.selectOtManagementMachineList(otManagementMachine);
        return getDataTable(list);
    }
    
    /**
     * Query ManagementMachine List
     */
    @PostMapping("/listPlant")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listPlant(OtManagementMachine otManagementMachine)
    {
        startPage();
        List<OtManagementMachine> list = otManagementMachineService.selectOtManagementMachinePlantList(otManagementMachine.getAppPlantNo());
        return getDataTable(list);
    }
    
    /**
     * edit ManagementMachine
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtManagementMachine otManagementMachine)
    {
        return toAjax(otManagementMachineService.updateOtManagementMachine(otManagementMachine));
    }
    
    /**
     * remove ManagementMachine
     */
    @PostMapping( "/del")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(OtManagementMachine otManagementMachine)
    {
        return toAjax(otManagementMachineService.deleteOtManagementMachineById(otManagementMachine.getAppMachineNo()));
    }

}
