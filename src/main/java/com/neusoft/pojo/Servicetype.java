package com.neusoft.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="servicetype")
public class Servicetype implements Serializable {
    /**
     * 服务类型编号
     */
    @Id
    @GeneratedValue
    private Integer serviceTypeId;
    /**
     * 服务类型名称
     */
    @NotEmpty
    private String serviceTypeName;

    private static final long serialVersionUID = 1L;

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
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
        Servicetype other = (Servicetype) that;
        return (this.getServiceTypeId() == null ? other.getServiceTypeId() == null : this.getServiceTypeId().equals(other.getServiceTypeId()))
            && (this.getServiceTypeName() == null ? other.getServiceTypeName() == null : this.getServiceTypeName().equals(other.getServiceTypeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServiceTypeId() == null) ? 0 : getServiceTypeId().hashCode());
        result = prime * result + ((getServiceTypeName() == null) ? 0 : getServiceTypeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serviceTypeId=").append(serviceTypeId);
        sb.append(", serviceTypeName=").append(serviceTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}