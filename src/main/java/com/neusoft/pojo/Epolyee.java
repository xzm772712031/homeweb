package com.neusoft.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="epolyee")
public class Epolyee implements Serializable {
    /**
     * 员工编号
     */
    @Id
    @GeneratedValue
    private Integer epolyeeId;

    /**
     * 员工姓名
     */
    @NotEmpty
    private String epolyeeName;

    /**
     * 员工岗位编号（外键）
     */
    @NotEmpty
    private Integer job_Id;

    /**
     * 员性别
     */
    @NotEmpty
    private String epolyeeSex;

    /**
     * 员工年龄
     */
    @NotEmpty
    private String epolyeeAge;

    /**
     * 员工状态属相（便于安排人员）
     */
    @NotEmpty
    private Integer epolyeeState;
    
    private String EpolyeeTel;
    

    /**
     * 公司账号编号
     */
    private Integer admin_Id;

    private static final long serialVersionUID = 1L;

    public Integer getEpolyeeId() {
        return epolyeeId;
    }

    public void setEpolyeeId(Integer epolyeeId) {
        this.epolyeeId = epolyeeId;
    }

    public String getEpolyeeName() {
        return epolyeeName;
    }

    public void setEpolyeeName(String epolyeeName) {
        this.epolyeeName = epolyeeName;
    }

    public Integer getJob_Id() {
        return job_Id;
    }

    public void setJob_Id(Integer job_Id) {
        this.job_Id = job_Id;
    }

    public String getEpolyeeSex() {
        return epolyeeSex;
    }

    public void setEpolyeeSex(String epolyeeSex) {
        this.epolyeeSex = epolyeeSex;
    }

    public String getEpolyeeAge() {
        return epolyeeAge;
    }

    public void setEpolyeeAge(String epolyeeAge) {
        this.epolyeeAge = epolyeeAge;
    }

    public Integer getEpolyeeState() {
        return epolyeeState;
    }

    public void setEpolyeeState(Integer epolyeeState) {
        this.epolyeeState = epolyeeState;
    }

    public Integer getAdmin_Id() {
        return admin_Id;
    }

    public void setAdmin_Id(Integer admin_Id) {
        this.admin_Id = admin_Id;
    }
    
    private Job Job;
    

    public Job getJob() {
		return Job;
	}

	public void setJob(Job job) {
		Job = job;
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
        Epolyee other = (Epolyee) that;
        return (this.getEpolyeeId() == null ? other.getEpolyeeId() == null : this.getEpolyeeId().equals(other.getEpolyeeId()))
            && (this.getEpolyeeName() == null ? other.getEpolyeeName() == null : this.getEpolyeeName().equals(other.getEpolyeeName()))
            && (this.getJob_Id() == null ? other.getJob_Id() == null : this.getJob_Id().equals(other.getJob_Id()))
            && (this.getEpolyeeSex() == null ? other.getEpolyeeSex() == null : this.getEpolyeeSex().equals(other.getEpolyeeSex()))
            && (this.getEpolyeeAge() == null ? other.getEpolyeeAge() == null : this.getEpolyeeAge().equals(other.getEpolyeeAge()))
            && (this.getEpolyeeState() == null ? other.getEpolyeeState() == null : this.getEpolyeeState().equals(other.getEpolyeeState()))
            && (this.getAdmin_Id() == null ? other.getAdmin_Id() == null : this.getAdmin_Id().equals(other.getAdmin_Id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEpolyeeId() == null) ? 0 : getEpolyeeId().hashCode());
        result = prime * result + ((getEpolyeeName() == null) ? 0 : getEpolyeeName().hashCode());
        result = prime * result + ((getJob_Id() == null) ? 0 : getJob_Id().hashCode());
        result = prime * result + ((getEpolyeeSex() == null) ? 0 : getEpolyeeSex().hashCode());
        result = prime * result + ((getEpolyeeAge() == null) ? 0 : getEpolyeeAge().hashCode());
        result = prime * result + ((getEpolyeeState() == null) ? 0 : getEpolyeeState().hashCode());
        result = prime * result + ((getAdmin_Id() == null) ? 0 : getAdmin_Id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", epolyeeId=").append(epolyeeId);
        sb.append(", epolyeeName=").append(epolyeeName);
        sb.append(", job_Id=").append(job_Id);
        sb.append(", epolyeeSex=").append(epolyeeSex);
        sb.append(", epolyeeAge=").append(epolyeeAge);
        sb.append(", epolyeeState=").append(epolyeeState);
        sb.append(", admin_Id=").append(admin_Id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public String getEpolyeeTel() {
		return EpolyeeTel;
	}

	public void setEpolyeeTel(String epolyeeTel) {
		EpolyeeTel = epolyeeTel;
	}
}