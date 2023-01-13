package com.operatorTracker.service;

import java.util.List;
import com.operatorTracker.domain.OtDictOperations;

/**
 * dictOperationsService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public interface IOtDictOperationsService
{
    /**
     * Query dictOperations
     *
     * @param dictOpNo dictOperationsID
     * @return dictOperations
     */
    public OtDictOperations selectOtDictOperationsById(Long dictOpNo);

    /**
     * Query dictOperations list
     *
     * @param otDictOperations dictOperations
     * @return dictOperations集合
     */
    public List<OtDictOperations> selectOtDictOperationsList(OtDictOperations otDictOperations);

    /**
     * add dictOperations
     *
     * @param otDictOperations dictOperations
     * @return
     */
    public int insertOtDictOperations(OtDictOperations otDictOperations);

    /**
     * edit dictOperations
     *
     * @param otDictOperations dictOperations
     * @return
     */
    public int updateOtDictOperations(OtDictOperations otDictOperations);

    /**
     * 批量delete dictOperations
     *
     * @param ids need  delete ID
     * @return
     */
    public int deleteOtDictOperationsByIds(String ids);

    /**
     * delete dictOperations
     *
     * @param dictOpNo dictOperationsID
     * @return
     */
    public int deleteOtDictOperationsById(Long dictOpNo);
}
