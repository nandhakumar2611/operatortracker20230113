package com.operatorTracker.service.impl;

import java.util.List;

import com.operatorTracker.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.mapper.OtDictOperationsMapper;
import com.operatorTracker.domain.OtDictOperations;
import com.operatorTracker.service.IOtDictOperationsService;

/**
 * dictOperationsService
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
@Service
public class OtDictOperationsServiceImpl implements IOtDictOperationsService
{
    @Autowired
    private OtDictOperationsMapper otDictOperationsMapper;

    /**
     * Query dictOperations
     *
     * @param dictOpNo dictOperationsID
     * @return dictOperations
     */
    @Override
    public OtDictOperations selectOtDictOperationsById(Long dictOpNo)
    {
        return otDictOperationsMapper.selectOtDictOperationsById(dictOpNo);
    }

    /**
     * Query dictOperations list
     *
     * @param otDictOperations dictOperations
     * @return dictOperations
     */
    @Override
    public List<OtDictOperations> selectOtDictOperationsList(OtDictOperations otDictOperations)
    {
        return otDictOperationsMapper.selectOtDictOperationsList(otDictOperations);
    }

    /**
     * add dictOperations
     *
     * @param otDictOperations dictOperations
     * @return
     */
    @Override
    public int insertOtDictOperations(OtDictOperations otDictOperations)
    {
        return otDictOperationsMapper.insertOtDictOperations(otDictOperations);
    }

    /**
     * edit dictOperations
     *
     * @param otDictOperations dictOperations
     * @return
     */
    @Override
    public int updateOtDictOperations(OtDictOperations otDictOperations)
    {
        return otDictOperationsMapper.updateOtDictOperations(otDictOperations);
    }

    /**
     * delete dictOperations object
     *
     * @param ids need  delete ID
     * @return
     */
    @Override
    public int deleteOtDictOperationsByIds(String ids)
    {
        return otDictOperationsMapper.deleteOtDictOperationsByIds(Convert.toStrArray(ids));
    }

    /**
     * delete dictOperations
     *
     * @param dictOpNo dictOperationsID
     * @return
     */
    @Override
    public int deleteOtDictOperationsById(Long dictOpNo)
    {
        return otDictOperationsMapper.deleteOtDictOperationsById(dictOpNo);
    }
}
