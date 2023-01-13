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
import com.operatorTracker.domain.OtAppUser;
import com.operatorTracker.page.TableDataInfo;
import com.operatorTracker.service.IOtAppMachineService;

/**
 * Machine Controller
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */
@Controller
@RequestMapping("/system/appMachine")
public class OtAppMachineController extends BaseController{
	
	@Autowired
	private IOtAppMachineService OtAppMachineService;
	
	/**
     * new machine
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtAppMachine otAppMachine)
    {
        return toAjax(OtAppMachineService.insertOtAppMachine(otAppMachine));
    }

    /**
     *  Machine list
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtAppMachine otAppMachine)
    {
        startPage();
        List<OtAppMachine> list = OtAppMachineService.selectOtAppMachineList(otAppMachine);
        return getDataTable(list);
    }
    
    /**
     * Query app Machine plant list
     */
    @PostMapping("/listPlant")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo listOperator(OtAppMachine otAppMachine)
    {
        startPage();
        List<Map> list = OtAppMachineService.selectOtAppMachinePlantList(otAppMachine);
        return getDataTable(list);
    }
    
    /**
     *  edit Machine
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtAppMachine otAppMachine)
    {
    	return toAjax(OtAppMachineService.updateOtAppMachine(otAppMachine));
    }
    
    /**
     *  delete Machine
     */
    @PostMapping("/del")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(OtAppMachine otAppMachine)
    {
    	return toAjax(OtAppMachineService.deleteOtAppMachine(otAppMachine.getMachineNo()));
    }
}
