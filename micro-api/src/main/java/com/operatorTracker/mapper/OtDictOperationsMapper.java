package com.operatorTracker.mapper;

import java.util.List;
import com.operatorTracker.domain.OtDictOperations;
import org.springframework.stereotype.Component;

/**
 * dictOperationsMapper
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Component
public interface OtDictOperationsMapper
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
     * @return dictOperations list
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
     * delete dictOperations
     *
     * @param dictOpNo dictOperationsID
     * @return
     */
    public int deleteOtDictOperationsById(Long dictOpNo);

    /**
     * more delete dictOperations
     *
     * @param dictOpNos need  delete ID
     * @return
     */
    public int deleteOtDictOperationsByIds(String[] dictOpNos);
}
