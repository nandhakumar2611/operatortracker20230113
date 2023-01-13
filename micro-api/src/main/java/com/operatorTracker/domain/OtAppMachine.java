package com.operatorTracker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Machine object ot_app_machine
 *
 * @author Nandha Kumar
 * @date 2023-01-05
 */

public class OtAppMachine {
	
	private static final long serialVersionUID = 1L;
	
    /** Machine No */
	private Long machineNo;
	
    /** Machine Name */
	private String machineName;

	public Long getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(Long machineNo) {
		this.machineNo = machineNo;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("machineNo", getMachineNo())
            .append("machineName", getMachineName())
            .toString();
    }
}
