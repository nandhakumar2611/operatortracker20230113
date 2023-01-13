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
import com.operatorTracker.domain.OtAppPlant;
import com.operatorTracker.service.IOtAppPlantService;


/**
 * app Plant Controller
 *
 * @author  Nandha Kumar 
 * @date 2023-01-05
 */
@Controller
@RequestMapping("/system/appPlant")
public class OtAppPlantController extends BaseController{
	
	 @Autowired
	 private IOtAppPlantService otAppPlantService;
	 
    /**
     * new plant
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtAppPlant otAppPlant)
    {
        return toAjax(otAppPlantService.insertOtAppPlant(otAppPlant));
    }
    
    /**
     *  Plant list
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtAppPlant otAppPlant)
    {
        startPage();
        List<OtAppPlant> list = otAppPlantService.selectOtAppPlantList(otAppPlant);
        return getDataTable(list);
    }

    /**
     * edit dictOperations
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtAppPlant otAppPlant)
    {
        return toAjax(otAppPlantService.updateOtAppPlant(otAppPlant));
    }
    
    @PostMapping( "/del")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(OtAppPlant otAppPlant)
    {
        return toAjax(otAppPlantService.deleteOtAppPlantById(otAppPlant.getPlantNo()));
    }
    
}
