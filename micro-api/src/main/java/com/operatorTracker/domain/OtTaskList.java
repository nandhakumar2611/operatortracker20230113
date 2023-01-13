package com.operatorTracker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ot_task_list
 *
 * @author jianxiang sun
 * @date 2022-12-02
 */
public class OtTaskList
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long taskNo;

    /**  */
    private String finsize;

    /**  */
    private Date orderDate;

    /**  */
    private String item;

    /**  */
    private String assembly;

    /**  */
    private Date deliveryDate;

    /**  */
    private String partNo;

    /**  */
    private Long purchaseOrderQty;

    /**  */
    private Long productionQty;

    /**  */
    private String purchaseOrderNo;

    /**  */
    private Date purchaseOrderDate;

    /**  */
    private Date issueDate;

    /** in progress;done */
    private String taskState;

    /** Manager User No */
    private Long userNoManager;
    
    /** Plant No */
    private Long plantNo;

    public void setTaskNo(Long taskNo)
    {
        this.taskNo = taskNo;
    }

    public Long getTaskNo()
    {
        return taskNo;
    }
    public void setFinsize(String finsize)
    {
        this.finsize = finsize;
    }

    public String getFinsize()
    {
        return finsize;
    }
    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    public Date getOrderDate()
    {
        return orderDate;
    }
    public void setItem(String item)
    {
        this.item = item;
    }

    public String getItem()
    {
        return item;
    }
    public void setAssembly(String assembly)
    {
        this.assembly = assembly;
    }

    public String getAssembly()
    {
        return assembly;
    }
    public void setDeliveryDate(Date deliveryDate)
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate()
    {
        return deliveryDate;
    }
    public void setPartNo(String partNo)
    {
        this.partNo = partNo;
    }

    public String getPartNo()
    {
        return partNo;
    }
    public void setPurchaseOrderQty(Long purchaseOrderQty)
    {
        this.purchaseOrderQty = purchaseOrderQty;
    }

    public Long getPurchaseOrderQty()
    {
        return purchaseOrderQty;
    }
    public void setProductionQty(Long productionQty)
    {
        this.productionQty = productionQty;
    }

    public Long getProductionQty()
    {
        return productionQty;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo)
    {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public String getPurchaseOrderNo()
    {
        return purchaseOrderNo;
    }
    public void setPurchaseOrderDate(Date purchaseOrderDate)
    {
        this.purchaseOrderDate = purchaseOrderDate;
    }

    public Date getPurchaseOrderDate()
    {
        return purchaseOrderDate;
    }
    public void setIssueDate(Date issueDate)
    {
        this.issueDate = issueDate;
    }

    public Date getIssueDate()
    {
        return issueDate;
    }
    public void setTaskState(String taskState)
    {
        this.taskState = taskState;
    }

    public String getTaskState()
    {
        return taskState;
    }
    public void setUserNoManager(Long userNoManager)
    {
        this.userNoManager = userNoManager;
    }

    public Long getUserNoManager()
    {
        return userNoManager;
    }
    
    public Long getPlantNo() {
		return plantNo;
	}

	public void setPlantNo(Long plantNo) {
		this.plantNo = plantNo;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskNo", getTaskNo())
            .append("finsize", getFinsize())
            .append("orderDate", getOrderDate())
            .append("item", getItem())
            .append("assembly", getAssembly())
            .append("deliveryDate", getDeliveryDate())
            .append("partNo", getPartNo())
            .append("purchaseOrderQty", getPurchaseOrderQty())
            .append("productionQty", getProductionQty())
            .append("purchaseOrderNo", getPurchaseOrderNo())
            .append("purchaseOrderDate", getPurchaseOrderDate())
            .append("issueDate", getIssueDate())
            .append("taskState", getTaskState())
            .append("userNoManager", getUserNoManager())
            .append("plantNo", getPlantNo())
            .toString();
    }
}
