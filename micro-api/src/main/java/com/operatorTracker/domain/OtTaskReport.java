package com.operatorTracker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * taskReport object ot_task_report
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public class OtTaskReport
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long taskReportNo;

    /**  */
    private Long taskAsNo;

    /** Operator User No */
    private Long userNoOperator;

    /**  */
    private Date submitTime;

    /**  */
    private Long qtyDone;

    /**  */
    private String remarks;

    public void setTaskReportNo(Long taskReportNo)
    {
        this.taskReportNo = taskReportNo;
    }

    public Long getTaskReportNo()
    {
        return taskReportNo;
    }
    public void setTaskAsNo(Long taskAsNo)
    {
        this.taskAsNo = taskAsNo;
    }

    public Long getTaskAsNo()
    {
        return taskAsNo;
    }
    public void setUserNoOperator(Long userNoOperator)
    {
        this.userNoOperator = userNoOperator;
    }

    public Long getUserNoOperator()
    {
        return userNoOperator;
    }
    public void setSubmitTime(Date submitTime)
    {
        this.submitTime = submitTime;
    }

    public Date getSubmitTime()
    {
        return submitTime;
    }
    public void setQtyDone(Long qtyDone)
    {
        this.qtyDone = qtyDone;
    }

    public Long getQtyDone()
    {
        return qtyDone;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getRemarks()
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskReportNo", getTaskReportNo())
            .append("taskAsNo", getTaskAsNo())
            .append("userNoOperator", getUserNoOperator())
            .append("submitTime", getSubmitTime())
            .append("qtyDone", getQtyDone())
            .append("remarks", getRemarks())
            .toString();
    }
}
