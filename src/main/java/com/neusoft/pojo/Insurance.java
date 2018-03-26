package com.neusoft.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="insurance")
public class Insurance implements Serializable {
    /**
     * 保险编号
     */
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer insuranceId;

    /**
     * 用户编号（外键）
     */
    @NotEmpty
    private Integer user_Id;

    /**
     * 订单编号（外键）
     */
    private Integer orderId;

    /**
     * 投保金额
     */
    private BigDecimal insurancePrice;

    /**
     * 保险生成时间
     */
    @NotEmpty
    private Date insuranceDate;

    /**
     * 投保费用
     */
    private BigDecimal insuranceCost;

    @NotEmpty
    private String insuranceOwner;

    @NotEmpty
    private String ownerIdentify;

    private String insuranceComment;

    @NotEmpty
    private Integer bespeak_Id;
    
    private String strDate;
    
    private Integer insuranceState;
    
    private User user;
    
    
    
    
    private static final long serialVersionUID = 1L;

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Integer getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(BigDecimal insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(BigDecimal insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public String getInsuranceOwner() {
        return insuranceOwner;
    }

    public void setInsuranceOwner(String insuranceOwner) {
        this.insuranceOwner = insuranceOwner;
    }

    public String getOwnerIdentify() {
        return ownerIdentify;
    }

    public void setOwnerIdentify(String ownerIdentify) {
        this.ownerIdentify = ownerIdentify;
    }

    public String getInsuranceComment() {
        return insuranceComment;
    }

    public void setInsuranceComment(String insuranceComment) {
        this.insuranceComment = insuranceComment;
    }

    public Integer getBespeak_Id() {
        return bespeak_Id;
    }

    public void setBespeak_Id(Integer bespeak_Id) {
        this.bespeak_Id = bespeak_Id;
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
        Insurance other = (Insurance) that;
        return (this.getInsuranceId() == null ? other.getInsuranceId() == null : this.getInsuranceId().equals(other.getInsuranceId()))
            && (this.getUser_Id() == null ? other.getUser_Id() == null : this.getUser_Id().equals(other.getUser_Id()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getInsurancePrice() == null ? other.getInsurancePrice() == null : this.getInsurancePrice().equals(other.getInsurancePrice()))
            && (this.getInsuranceDate() == null ? other.getInsuranceDate() == null : this.getInsuranceDate().equals(other.getInsuranceDate()))
            && (this.getInsuranceCost() == null ? other.getInsuranceCost() == null : this.getInsuranceCost().equals(other.getInsuranceCost()))
            && (this.getInsuranceOwner() == null ? other.getInsuranceOwner() == null : this.getInsuranceOwner().equals(other.getInsuranceOwner()))
            && (this.getOwnerIdentify() == null ? other.getOwnerIdentify() == null : this.getOwnerIdentify().equals(other.getOwnerIdentify()))
            && (this.getInsuranceComment() == null ? other.getInsuranceComment() == null : this.getInsuranceComment().equals(other.getInsuranceComment()))
            && (this.getBespeak_Id() == null ? other.getBespeak_Id() == null : this.getBespeak_Id().equals(other.getBespeak_Id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInsuranceId() == null) ? 0 : getInsuranceId().hashCode());
        result = prime * result + ((getUser_Id() == null) ? 0 : getUser_Id().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getInsurancePrice() == null) ? 0 : getInsurancePrice().hashCode());
        result = prime * result + ((getInsuranceDate() == null) ? 0 : getInsuranceDate().hashCode());
        result = prime * result + ((getInsuranceCost() == null) ? 0 : getInsuranceCost().hashCode());
        result = prime * result + ((getInsuranceOwner() == null) ? 0 : getInsuranceOwner().hashCode());
        result = prime * result + ((getOwnerIdentify() == null) ? 0 : getOwnerIdentify().hashCode());
        result = prime * result + ((getInsuranceComment() == null) ? 0 : getInsuranceComment().hashCode());
        result = prime * result + ((getBespeak_Id() == null) ? 0 : getBespeak_Id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", insuranceId=").append(insuranceId);
        sb.append(", user_Id=").append(user_Id);
        sb.append(", orderId=").append(orderId);
        sb.append(", insurancePrice=").append(insurancePrice);
        sb.append(", insuranceDate=").append(insuranceDate);
        sb.append(", insuranceCost=").append(insuranceCost);
        sb.append(", insuranceOwner=").append(insuranceOwner);
        sb.append(", ownerIdentify=").append(ownerIdentify);
        sb.append(", insuranceComment=").append(insuranceComment);
        sb.append(", bespeak_Id=").append(bespeak_Id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public Integer getInsuranceState() {
		return insuranceState;
	}

	public void setInsuranceState(Integer insuranceState) {
		this.insuranceState = insuranceState;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}