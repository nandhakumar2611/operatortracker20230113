package com.operatorTracker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * OperatorTime object ot_operator_time
 *
 * @author Nandha Kumar
 * @date 2023-01-11
 */
public class OtAppOperatorTime {
	
	 private static final long serialVersionUID = 1L;
	 
	 private Long userOperatorTimeNo;
	 private Long operatorNo;
//	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	 private Date taskStartTime;
//	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	 private Date taskEndTime;
	 
	public Long getUserOperatorTimeNo() {
		return userOperatorTimeNo;
	}
	public void setUserOperatorTimeNo(Long userOperatorTimeNo) {
		this.userOperatorTimeNo = userOperatorTimeNo;
	}
	public Long getOperatorNo() {
		return operatorNo;
	}
	public void setOperatorNo(Long operatorNo) {
		this.operatorNo = operatorNo;
	}
	public Date getTaskStartTime() {
		return taskStartTime;
	}
	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
		System.out.println(taskStartTime);
	}
	public Date getTaskEndTime() {
		return taskEndTime;
	}
	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
		System.out.println(taskEndTime);
	}
	
    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userOperatorTimeNo", getUserOperatorTimeNo())
            .append("operatorNo", getOperatorNo())
            .append("taskStartTime", getTaskStartTime())
            .append("taskEndTime", getTaskEndTime())
            .toString();
    }
    
}
