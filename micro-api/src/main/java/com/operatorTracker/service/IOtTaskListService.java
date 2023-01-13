package com.operatorTracker.service;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtTaskList;

/**
 * taskListService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public interface IOtTaskListService
{
    /**
     * Query taskList
     *
     * @param taskNo taskListID
     * @return taskList
     */
    public OtTaskList selectOtTaskListById(Long taskNo);

    /**
     * Query taskList list
     *
     * @param otTaskList taskList
     * @return taskList集合
     */
    public List<OtTaskList> selectOtTaskListList(OtTaskList otTaskList);

    public List<Map> selectOtTaskListListAss(OtTaskList otTaskList);
    /**
     * add taskList
     *
     * @param otTaskList taskList
     * @return
     */
    public int insertOtTaskList(OtTaskList otTaskList);

    /**
     * edit taskList
     *
     * @param otTaskList taskList
     * @return
     */
    public int updateOtTaskList(OtTaskList otTaskList);

    /**
     * 批量delete taskList
     *
     * @param ids need  delete ID
     * @return
     */
    public int deleteOtTaskListByIds(String ids);

    /**
     * delete taskList
     *
     * @param taskNo taskListID
     * @return
     */
    public int deleteOtTaskListById(Long taskNo);
}
