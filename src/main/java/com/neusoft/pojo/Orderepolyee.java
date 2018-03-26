package com.neusoft.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="orderepolyee")
public class Orderepolyee implements Serializable {
    @Id
    @GeneratedValue
    private Integer orderdEpolyeeId;

    @NotEmpty
    private Integer order_ID;

    @NotEmpty
    private Integer epolyee_Id;
    
    private Epolyee epolyee;
   
    private static final long serialVersionUID = 1L;

    public Integer getOrderdEpolyeeId() {
        return orderdEpolyeeId;
    }

    public void setOrderdEpolyeeId(Integer orderdEpolyeeId) {
        this.orderdEpolyeeId = orderdEpolyeeId;
    }

    public Integer getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(Integer order_ID) {
        this.order_ID = order_ID;
    }

    public Integer getEpolyee_Id() {
        return epolyee_Id;
    }

    public void setEpolyee_Id(Integer epolyee_Id) {
        this.epolyee_Id = epolyee_Id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orderepolyee other = (Orderepolyee) that;
        return (this.getOrderdEpolyeeId() == null ? other.getOrderdEpolyeeId() == null : this.getOrderdEpolyeeId().equals(other.getOrderdEpolyeeId()))
            && (this.getOrder_ID() == null ? other.getOrder_ID() == null : this.getOrder_ID().equals(other.getOrder_ID()))
            && (this.getEpolyee_Id() == null ? other.getEpolyee_Id() == null : this.getEpolyee_Id().equals(other.getEpolyee_Id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderdEpolyeeId() == null) ? 0 : getOrderdEpolyeeId().hashCode());
        result = prime * result + ((getOrder_ID() == null) ? 0 : getOrder_ID().hashCode());
        result = prime * result + ((getEpolyee_Id() == null) ? 0 : getEpolyee_Id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderdEpolyeeId=").append(orderdEpolyeeId);
        sb.append(", order_ID=").append(order_ID);
        sb.append(", epolyee_Id=").append(epolyee_Id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public Epolyee getEpolyee() {
		return epolyee;
	}

	public void setEpolyee(Epolyee epolyee) {
		this.epolyee = epolyee;
	}
}