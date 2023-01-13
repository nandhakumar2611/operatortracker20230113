package com.operatorTracker.service.impl;

import java.util.List;
import java.util.Map;

import com.operatorTracker.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.mapper.OtTaskListMapper;
import com.operatorTracker.domain.OtTaskList;
import com.operatorTracker.service.IOtTaskListService;

/**
 * taskListService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Service
public class OtTaskListServiceImpl implements IOtTaskListService
{
    @Autowired
    private OtTaskListMapper otTaskListMapper;

    /**
     * Query taskList
     *
     * @param taskNo taskListID
     * @return taskList
     */
    @Override
    public OtTaskList selectOtTaskListById(Long taskNo)
    {
        return otTaskListMapper.selectOtTaskListById(taskNo);
    }

    /**
     * Query taskList list
     *
     * @param otTaskList taskList
     * @return taskList
     */
    @Override
    public List<OtTaskList> selectOtTaskListList(OtTaskList otTaskList)
    {
        return otTaskListMapper.selectOtTaskListList(otTaskList);
    }

    @Override
    public List<Map> selectOtTaskListListAss(OtTaskList otTaskList)
    {
        return otTaskListMapper.selectOtTaskListListAss(otTaskList);
    }
    /**
     * add taskList
     *
     * @param otTaskList taskList
     * @return
     */
    @Override
    public int insertOtTaskList(OtTaskList otTaskList)
    {
        return otTaskListMapper.insertOtTaskList(otTaskList);
    }

    /**
     * edit taskList
     *
     * @param otTaskList taskList
     * @return
     */
    @Override
    public int updateOtTaskList(OtTaskList otTaskList)
    {
        return otTaskListMapper.updateOtTaskList(otTaskList);
    }

    /**
     * delete taskList object
     *
     * @param ids need  delete ID
     * @return
     */
    @Override
    public int deleteOtTaskListByIds(String ids)
    {
        return otTaskListMapper.deleteOtTaskListByIds(Convert.toStrArray(ids));
    }

    /**
     * delete taskList
     *
     * @param taskNo taskListID
     * @return
     */
    @Override
    public int deleteOtTaskListById(Long taskNo)
    {
        return otTaskListMapper.deleteOtTaskListById(taskNo);
    }
}
