package com.operatorTracker.mapper;

import java.util.List;
import java.util.Map;

import com.operatorTracker.domain.OtAppPlant;

import org.springframework.stereotype.Component;

/**
 * appPlant Mapper
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */
@Component
public interface OtAppPlantMapper {

	/**
	 * add appPlant
	 *
	 * @param otAppplant appPlant
	 * @return
	 */
	int insertOtAppPlant(OtAppPlant otAppPlant);

    /**
     *  Plant list
     *
     * @param otAppPlant otAppPlant
     * @return otAppPlant list
     */
	List<OtAppPlant> selectOtAppPlantList(OtAppPlant otAppPlant);

	/**
	 * Query Plant list
	 *
	 * @param OtAppPlant plantNo
	 * @return AppPlant
	 */
	OtAppPlant selectOtAppPlantById(Long plantNo);
	
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
