package com.operatorTracker.mapper;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtTaskList;
import org.springframework.stereotype.Component;

/**
 * taskListMapper
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Component
public interface OtTaskListMapper
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
     * @return taskList list
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
     * delete taskList
     *
     * @param taskNo taskListID
     * @return
     */
    public int deleteOtTaskListById(Long taskNo);

    /**
     * more delete taskList
     *
     * @param taskNos need  delete ID
     * @return
     */
    public int deleteOtTaskListByIds(String[] taskNos);
}
