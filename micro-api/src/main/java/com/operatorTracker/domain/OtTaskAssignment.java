package com.operatorTracker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * taskAssignment object ot_task_assignment
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public class OtTaskAssignment
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long taskAsNo;

    /**  */
    private Long taskNo;

    /** Operator User No */
    private Long userNoOperator;

    /**  */
    private Date assignmentTime;

    /** Operation dictionary no */
    private Long dictOpNo;

    private Date fromDate;

    private Date toDate;

    /**  */
    private String operationDescription;

    /**  */
    private Long targetQty;

    /**inProcess;done  */
    private String assignmentState;
    
    /**Machine No  */
    private Long machineNo;

    public void setTaskAsNo(Long taskAsNo)
    {
        this.taskAsNo = taskAsNo;
    }

    public Long getTaskAsNo()
    {
        return taskAsNo;
    }
    public void setTaskNo(Long taskNo)
    {
        this.taskNo = taskNo;
    }

    public Long getTaskNo()
    {
        return taskNo;
    }
    public void setUserNoOperator(Long userNoOperator)
    {
        this.userNoOperator = userNoOperator;
    }

    public Long getUserNoOperator()
    {
        return userNoOperator;
    }
    public void setAssignmentTime(Date assignmentTime)
    {
        this.assignmentTime = assignmentTime;
    }

    public Date getAssignmentTime()
    {
        return assignmentTime;
    }
    public void setDictOpNo(Long dictOpNo)
    {
        this.dictOpNo = dictOpNo;
    }

    public Long getDictOpNo()
    {
        return dictOpNo;
    }
    public void setOperationDescription(String operationDescription)
    {
        this.operationDescription = operationDescription;
    }

    public String getOperationDescription()
    {
        return operationDescription;
    }
    public void setTargetQty(Long targetQty)
    {
        this.targetQty = targetQty;
    }

    public Long getTargetQty()
    {
        return targetQty;
    }
    public void setAssignmentState(String assignmentState)
    {
        this.assignmentState = assignmentState;
    }

    public String getAssignmentState()
    {
        return assignmentState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskAsNo", getTaskAsNo())
            .append("taskNo", getTaskNo())
            .append("userNoOperator", getUserNoOperator())
            .append("assignmentTime", getAssignmentTime())
            .append("dictOpNo", getDictOpNo())
            .append("operationDescription", getOperationDescription())
            .append("targetQty", getTargetQty())
            .append("assignmentState", getAssignmentState())
            .append("machineNo", getMachineNo())
            .toString();
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

	public Long getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(Long machineNo) {
		this.machineNo = machineNo;
	}
    
    
}
