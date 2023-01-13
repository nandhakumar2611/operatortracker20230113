package com.operatorTracker.service;

import java.util.List;

import com.operatorTracker.domain.OtAppPlant;
import com.operatorTracker.domain.OtDictOperations;

/**
 * appPlant Service
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */
public interface IOtAppPlantService {

	/**
	 * add appPlant
	 *
	 * @param otAppplant appPlant
	 * @return
	 */
	int insertOtAppPlant(OtAppPlant otAppPlant);
	
    /**
     * Query appPlant list
     *
     * @param otAppplant appPlant
     * @return appPlant
     */
    public List<OtAppPlant> selectOtAppPlantList(OtAppPlant otAppPlant);

	/**
	 * Query Plant list
	 *
	 * @param OtAppPlant plantNo
	 * @return AppPlant
	 */
	OtAppPlant selectOtAppPlantById(Long PlantNo);

	/**
	 * edit appPlant
	 *
	 * @param OtAppPlant otAppPlant
	 * @return
	 */
	int updateOtAppPlant(OtAppPlant otAppPlant);

	/**
	 * delete appPlant
	 *
	 * @param OtAppPlant plantNo
	 * @return
	 */
	int deleteOtAppPlantById(Long plantNo);


}
