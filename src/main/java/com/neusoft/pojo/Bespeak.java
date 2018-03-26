package com.neusoft.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 
 */
@Table(name="bespeak")
public class Bespeak implements Serializable {
    /**
     * 预约编号
     */
    @Id
    @GeneratedValue
    private Integer bespeakId;

    /**
     * 用户编号（外键）
     */
    @NotEmpty
    private Integer user_Id;

    /**
     * 搬迁城市
     */
    @NotEmpty
    private String bespeakCity;

    /**
     * 搬出城市
     */
    @NotEmpty
    private String bespeakOut;

    /**
     * 搬入城市
     */
    @NotEmpty
    private String bespeakIn;

    /**
     * 搬运时间（预约）
     */
    @NotEmpty
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date bespeakDate;

    /**
     * 联系人
     */
    @NotEmpty
    private String bespeakAtten;

    /**
     * 联系电话
     */
    @NotEmpty
    private String bespeakTel;

    /**
     * 物品种类编号（外键）
     */
    private String goodsType;

    /**
     * 服务种类编号（外键）
     */
    @NotEmpty
    private Integer serviceType_Id;

    /**
     * 附加说明（可以不填）
     */
    private String bespeakAdd;

    /**
     * 预约提交时间（系统生成）
     */
    @NotEmpty
    private Date date;

    @NotEmpty
    private Integer bespeakState;
    
    private Integer count;
    
    
    private Servicetype servicetype;
    
    private String strDate;
    
    private String strDate2;
    
    
    private String months;
      
    public String getStrDate2() {
		return strDate2;
	}

	public void setStrDate2(String strDate2) {
		this.strDate2 = strDate2;
	}

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public Servicetype getServicetype() {
		return servicetype;
	}

	public void setServicetype(Servicetype servicetype) {
		this.servicetype = servicetype;
	}

	private static final long serialVersionUID = 1L;

    public Integer getBespeakId() {
        return bespeakId;
    }

    public void setBespeakId(Integer bespeakId) {
        this.bespeakId = bespeakId;
    }

    public Integer getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    public String getBespeakCity() {
        return bespeakCity;
    }

    public void setBespeakCity(String bespeakCity) {
        this.bespeakCity = bespeakCity;
    }

    public String getBespeakOut() {
        return bespeakOut;
    }

    public void setBespeakOut(String bespeakOut) {
        this.bespeakOut = bespeakOut;
    }

    public String getBespeakIn() {
        return bespeakIn;
    }

    public void setBespeakIn(String bespeakIn) {
        this.bespeakIn = bespeakIn;
    }

    public Date getBespeakDate() {
        return bespeakDate;
    }

    public void setBespeakDate(Date bespeakDate) {
        this.bespeakDate = bespeakDate;
    }

    public String getBespeakAtten() {
        return bespeakAtten;
    }

    public void setBespeakAtten(String bespeakAtten) {
        this.bespeakAtten = bespeakAtten;
    }

    public String getBespeakTel() {
        return bespeakTel;
    }

    public void setBespeakTel(String bespeakTel) {
        this.bespeakTel = bespeakTel;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getServiceType_Id() {
        return serviceType_Id;
    }

    public void setServiceType_Id(Integer serviceType_Id) {
        this.serviceType_Id = serviceType_Id;
    }

    public String getBespeakAdd() {
        return bespeakAdd;
    }

    public void setBespeakAdd(String bespeakAdd) {
        this.bespeakAdd = bespeakAdd;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getBespeakState() {
        return bespeakState;
    }

    public void setBespeakState(Integer bespeakState) {
        this.bespeakState = bespeakState;
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
        Bespeak other = (Bespeak) that;
        return (this.getBespeakId() == null ? other.getBespeakId() == null : this.getBespeakId().equals(other.getBespeakId()))
            && (this.getUser_Id() == null ? other.getUser_Id() == null : this.getUser_Id().equals(other.getUser_Id()))
            && (this.getBespeakCity() == null ? other.getBespeakCity() == null : this.getBespeakCity().equals(other.getBespeakCity()))
            && (this.getBespeakOut() == null ? other.getBespeakOut() == null : this.getBespeakOut().equals(other.getBespeakOut()))
            && (this.getBespeakIn() == null ? other.getBespeakIn() == null : this.getBespeakIn().equals(other.getBespeakIn()))
            && (this.getBespeakDate() == null ? other.getBespeakDate() == null : this.getBespeakDate().equals(other.getBespeakDate()))
            && (this.getBespeakAtten() == null ? other.getBespeakAtten() == null : this.getBespeakAtten().equals(other.getBespeakAtten()))
            && (this.getBespeakTel() == null ? other.getBespeakTel() == null : this.getBespeakTel().equals(other.getBespeakTel()))
            && (this.getGoodsType() == null ? other.getGoodsType() == null : this.getGoodsType().equals(other.getGoodsType()))
            && (this.getServiceType_Id() == null ? other.getServiceType_Id() == null : this.getServiceType_Id().equals(other.getServiceType_Id()))
            && (this.getBespeakAdd() == null ? other.getBespeakAdd() == null : this.getBespeakAdd().equals(other.getBespeakAdd()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getBespeakState() == null ? other.getBespeakState() == null : this.getBespeakState().equals(other.getBespeakState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBespeakId() == null) ? 0 : getBespeakId().hashCode());
        result = prime * result + ((getUser_Id() == null) ? 0 : getUser_Id().hashCode());
        result = prime * result + ((getBespeakCity() == null) ? 0 : getBespeakCity().hashCode());
        result = prime * result + ((getBespeakOut() == null) ? 0 : getBespeakOut().hashCode());
        result = prime * result + ((getBespeakIn() == null) ? 0 : getBespeakIn().hashCode());
        result = prime * result + ((getBespeakDate() == null) ? 0 : getBespeakDate().hashCode());
        result = prime * result + ((getBespeakAtten() == null) ? 0 : getBespeakAtten().hashCode());
        result = prime * result + ((getBespeakTel() == null) ? 0 : getBespeakTel().hashCode());
        result = prime * result + ((getGoodsType() == null) ? 0 : getGoodsType().hashCode());
        result = prime * result + ((getServiceType_Id() == null) ? 0 : getServiceType_Id().hashCode());
        result = prime * result + ((getBespeakAdd() == null) ? 0 : getBespeakAdd().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getBespeakState() == null) ? 0 : getBespeakState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bespeakId=").append(bespeakId);
        sb.append(", user_Id=").append(user_Id);
        sb.append(", bespeakCity=").append(bespeakCity);
        sb.append(", bespeakOut=").append(bespeakOut);
        sb.append(", bespeakIn=").append(bespeakIn);
        sb.append(", bespeakDate=").append(bespeakDate);
        sb.append(", bespeakAtten=").append(bespeakAtten);
        sb.append(", bespeakTel=").append(bespeakTel);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", serviceType_Id=").append(serviceType_Id);
        sb.append(", bespeakAdd=").append(bespeakAdd);
        sb.append(", date=").append(date);
        sb.append(", bespeakState=").append(bespeakState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	

	public String getMonths() {
		return months;
	}

	public void setMonths(String months) {
		this.months = months;
	}
}