package com.neusoft.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="ordercar")
public class Ordercar implements Serializable {
    @Id
    @GeneratedValue
    private Integer orderCarId;

    @NotEmpty
    private Integer order_Id;

    @NotEmpty
    private Integer car_Id;
    
    private Car car;
    
    
    

    private static final long serialVersionUID = 1L;

    public Integer getOrderCarId() {
        return orderCarId;
    }

    public void setOrderCarId(Integer orderCarId) {
        this.orderCarId = orderCarId;
    }

    public Integer getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Integer order_Id) {
        this.order_Id = order_Id;
    }

    public Integer getCar_Id() {
        return car_Id;
    }

    public void setCar_Id(Integer car_Id) {
        this.car_Id = car_Id;
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
        Ordercar other = (Ordercar) that;
        return (this.getOrderCarId() == null ? other.getOrderCarId() == null : this.getOrderCarId().equals(other.getOrderCarId()))
            && (this.getOrder_Id() == null ? other.getOrder_Id() == null : this.getOrder_Id().equals(other.getOrder_Id()))
            && (this.getCar_Id() == null ? other.getCar_Id() == null : this.getCar_Id().equals(other.getCar_Id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderCarId() == null) ? 0 : getOrderCarId().hashCode());
        result = prime * result + ((getOrder_Id() == null) ? 0 : getOrder_Id().hashCode());
        result = prime * result + ((getCar_Id() == null) ? 0 : getCar_Id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderCarId=").append(orderCarId);
        sb.append(", order_Id=").append(order_Id);
        sb.append(", car_Id=").append(car_Id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}