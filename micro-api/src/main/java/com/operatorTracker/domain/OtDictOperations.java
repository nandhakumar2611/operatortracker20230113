package com.operatorTracker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * dictOperations object ot_dict_operations
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public class OtDictOperations
{
    private static final long serialVersionUID = 1L;

    /** Operation dictionary no */
    private Long dictOpNo;

    /** Operation dictionary Name */
    private String dictOpName;

    public void setDictOpNo(Long dictOpNo)
    {
        this.dictOpNo = dictOpNo;
    }

    public Long getDictOpNo()
    {
        return dictOpNo;
    }
    public void setDictOpName(String dictOpName)
    {
        this.dictOpName = dictOpName;
    }

    public String getDictOpName()
    {
        return dictOpName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dictOpNo", getDictOpNo())
            .append("dictOpName", getDictOpName())
            .toString();
    }
}
