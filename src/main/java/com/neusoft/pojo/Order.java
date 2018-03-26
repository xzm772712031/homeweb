package com.neusoft.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author 
 */
@Table(name="order")
public class Order implements Serializable {
    /**
     * 订单编号
     */
    @Id
   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    /**
     * 用户编号（外键）
     */
    @NotEmpty
    private Integer user_Id;

    /**
     * 预约单编号（外键）
     */
    @NotEmpty
    private Integer bespeak_Id;

    /**
     * 订单生成时间
     */
    @NotEmpty
    private Date orderDate;

    /**
     * 订单金额
     */
    @NotEmpty
    private Double orderPrice;

    /**
     * 订单备注
     */
    private String orderComment;

    /**
     * 订单状态
     */
    @NotEmpty
    private Integer orderState;
    
    private String strDate;
    
    private User  user;
    
    private Bespeak bespeak;
    
    
    
    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    public Integer getBespeak_Id() {
        return bespeak_Id;
    }

    public void setBespeak_Id(Integer bespeak_Id) {
        this.bespeak_Id = bespeak_Id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
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
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUser_Id() == null ? other.getUser_Id() == null : this.getUser_Id().equals(other.getUser_Id()))
            && (this.getBespeak_Id() == null ? other.getBespeak_Id() == null : this.getBespeak_Id().equals(other.getBespeak_Id()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getOrderComment() == null ? other.getOrderComment() == null : this.getOrderComment().equals(other.getOrderComment()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUser_Id() == null) ? 0 : getUser_Id().hashCode());
        result = prime * result + ((getBespeak_Id() == null) ? 0 : getBespeak_Id().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getOrderComment() == null) ? 0 : getOrderComment().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", user_Id=").append(user_Id);
        sb.append(", bespeak_Id=").append(bespeak_Id);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderComment=").append(orderComment);
        sb.append(", orderState=").append(orderState);
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bespeak getBespeak() {
		return bespeak;
	}

	public void setBespeak(Bespeak bespeak) {
		this.bespeak = bespeak;
	}
}