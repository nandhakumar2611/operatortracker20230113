package com.operatorTracker.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * managementOperator object ot_management_operator
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public class OtManagementOperator
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long managementOperatorNo;

    /** Manager User No */
    private Long userNoManager;

    /** Operator User No */
    private Long userNoOperator;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public void setManagementOperatorNo(Long managementOperatorNo)
    {
        this.managementOperatorNo = managementOperatorNo;
    }

    public Long getManagementOperatorNo()
    {
        return managementOperatorNo;
    }
    public void setUserNoManager(Long userNoManager)
    {
        this.userNoManager = userNoManager;
    }

    public Long getUserNoManager()
    {
        return userNoManager;
    }
    public void setUserNoOperator(Long userNoOperator)
    {
        this.userNoOperator = userNoOperator;
    }

    public Long getUserNoOperator()
    {
        return userNoOperator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("managementOperatorNo", getManagementOperatorNo())
                .append("userNoManager", getUserNoManager())
                .append("userNoOperator", getUserNoOperator())
                .append("createTime", getCreateTime())
                .toString();
    }
}
