package com.operatorTracker.service.impl;

import java.util.List;

import com.operatorTracker.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operatorTracker.mapper.OtAppPlantMapper;
import com.operatorTracker.domain.OtAppPlant;
import com.operatorTracker.service.IOtAppPlantService;

/**
 * appPlantService
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */
@Service
public class OtAppPlantServiceImpl implements IOtAppPlantService {
	
	@Autowired
    private OtAppPlantMapper otAppPlantMapper;
	
	/**
	 * add appPlant
	 *
	 * @param otAppplant appPlant
	 * @return
	 */
    @Override
    public int insertOtAppPlant(OtAppPlant otAppPlant)
    {
        return otAppPlantMapper.insertOtAppPlant(otAppPlant);
    }
    
    /**
     * Query Plant list
     *
     * @param OtAppPlant OtAppPlant
     * @return AppPlant
     */
    @Override
    public List<OtAppPlant> selectOtAppPlantList(OtAppPlant otAppPlant)
    {
        return otAppPlantMapper.selectOtAppPlantList(otAppPlant);
    }
    
    /**
     * Query Plant list
     *
     * @param OtAppPlant plantNo
     * @return AppPlant
     */
    @Override
    public OtAppPlant selectOtAppPlantById(Long PlantNo)
    {
        return otAppPlantMapper.selectOtAppPlantById(PlantNo);
    }
    
    /**
     * edit appPlant
     *
     * @param OtAppPlant otAppPlant
     * @return
     */
    @Override
    public int updateOtAppPlant(OtAppPlant otAppPlant)
    {
        return otAppPlantMapper.updateOtAppPlant(otAppPlant);
    }

    /**
     * delete appPlant
     *
     * @param OtAppPlant plantNo
     * @return
     */
    @Override
    public int deleteOtAppPlantById(Long PlantNo)
    {
        return otAppPlantMapper.deleteOtAppPlantById(PlantNo);
    }

}
