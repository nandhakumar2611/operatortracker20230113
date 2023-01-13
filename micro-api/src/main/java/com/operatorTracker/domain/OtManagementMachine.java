package com.operatorTracker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ManagementMachine Object ot_management_machine
 * 
 * @author Nandha Kumar
 * @Date 2023-01-06
 */
public class OtManagementMachine {

	private static final long serialVersionUID=1L;
    
	/** ManageMachineNo*/
    private Long managementMachineNo;
    
    /** Plant No*/
    private Long appPlantNo;
    
    /** Machine No*/
    private Long appMachineNo;

	public Long getManagementMachineNo() {
		return managementMachineNo;
	}

	public void setManagementMachineNo(Long managementMachineNo) {
		this.managementMachineNo = managementMachineNo;
	}

	public Long getAppPlantNo() {
		return appPlantNo;
	}

	public void setAppPlantNo(Long appPlantNo) {
		this.appPlantNo = appPlantNo;
	}

	public Long getAppMachineNo() {
		return appMachineNo;
	}

	public void setAppMachineNo(Long appMachineNo) {
		this.appMachineNo = appMachineNo;
	}
    
    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("managementMachineNo", getManagementMachineNo())
                .append("appPlantNo", getAppPlantNo())
                .append("appMachineNo", getAppMachineNo())
                .toString();
    }
}
