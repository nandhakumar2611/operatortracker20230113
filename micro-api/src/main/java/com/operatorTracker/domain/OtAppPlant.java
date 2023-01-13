package com.operatorTracker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Plant object ot_app_plant
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */

public class OtAppPlant {
	
	private static final long serialVersionUID = 1L;

    /** Plant No */
    private Long plantNo;

    /** Plant Name */
    private String plantName;
    
    /** Plant Location */
    private String plantLocation;

	public Long getPlantNo() {
		return plantNo;
	}

	public void setPlantNo(Long plantNo) {
		this.plantNo = plantNo;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getPlantLocation() {
		return plantLocation;
	}

	public void setPlantLocation(String plantLocation) {
		this.plantLocation = plantLocation;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("plantNo", getPlantNo())
            .append("plantName", getPlantName())
            .append("plantLocation", getPlantLocation())
            .toString();
    }
    
}
