package com.neusoft.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="car")
public class Car implements Serializable {
    @Id
    @GeneratedValue
    private Integer carId;

    @NotEmpty
    private String carName;

    @NotEmpty
    private Integer carType;

    @NotEmpty
    private String carClient;

    @NotEmpty
    private Integer carState;
    
    private Cartype cartype;
    
    

    public Cartype getCartype() {
		return cartype;
	}

	public void setCartype(Cartype cartype) {
		this.cartype = cartype;
	}

	private static final long serialVersionUID = 1L;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getCarClient() {
        return carClient;
    }

    public void setCarClient(String carClient) {
        this.carClient = carClient;
    }

    public Integer getCarState() {
        return carState;
    }

    public void setCarState(Integer carState) {
        this.carState = carState;
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
        Car other = (Car) that;
        return (this.getCarId() == null ? other.getCarId() == null : this.getCarId().equals(other.getCarId()))
            && (this.getCarName() == null ? other.getCarName() == null : this.getCarName().equals(other.getCarName()))
            && (this.getCarType() == null ? other.getCarType() == null : this.getCarType().equals(other.getCarType()))
            && (this.getCarClient() == null ? other.getCarClient() == null : this.getCarClient().equals(other.getCarClient()))
            && (this.getCarState() == null ? other.getCarState() == null : this.getCarState().equals(other.getCarState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarId() == null) ? 0 : getCarId().hashCode());
        result = prime * result + ((getCarName() == null) ? 0 : getCarName().hashCode());
        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());
        result = prime * result + ((getCarClient() == null) ? 0 : getCarClient().hashCode());
        result = prime * result + ((getCarState() == null) ? 0 : getCarState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carId=").append(carId);
        sb.append(", carName=").append(carName);
        sb.append(", carType=").append(carType);
        sb.append(", carClient=").append(carClient);
        sb.append(", carState=").append(carState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}