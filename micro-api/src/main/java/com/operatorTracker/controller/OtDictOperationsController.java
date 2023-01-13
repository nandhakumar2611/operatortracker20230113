package com.operatorTracker.controller;

import java.util.List;

import com.operatorTracker.domain.AjaxResult;
import com.operatorTracker.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.operatorTracker.domain.OtDictOperations;
import com.operatorTracker.service.IOtDictOperationsService;

/**
 * dict Operations Controller
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Controller
@RequestMapping("/system/dictOperations")
public class OtDictOperationsController extends BaseController
{

    @Autowired
    private IOtDictOperationsService otDictOperationsService;

    /**
     * Query dict Operations list
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(OtDictOperations otDictOperations)
    {
        startPage();
        List<OtDictOperations> list = otDictOperationsService.selectOtDictOperationsList(otDictOperations);
        return getDataTable(list);
    }

    /**
     * new dictOperation
     */
    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public AjaxResult addSave(OtDictOperations otDictOperations)
    {
        return toAjax(otDictOperationsService.insertOtDictOperations(otDictOperations));
    }


    /**
     * edit dictOperations
     */
    @PostMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public AjaxResult editSave(OtDictOperations otDictOperations)
    {
        return toAjax(otDictOperationsService.updateOtDictOperations(otDictOperations));
    }

    /**
     * remove dictOperations
     */
    @PostMapping( "/remove")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(String ids)
    {
        return toAjax(otDictOperationsService.deleteOtDictOperationsByIds(ids));
    }

    @PostMapping( "/del")
    @ResponseBody
    @CrossOrigin
    public AjaxResult remove(OtDictOperations otDictOperations)
    {
        return toAjax(otDictOperationsService.deleteOtDictOperationsById(otDictOperations.getDictOpNo()));
    }
}
