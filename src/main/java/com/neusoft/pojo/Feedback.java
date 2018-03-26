package com.neusoft.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="feedback")
public class Feedback implements Serializable {
    /**
     * 反馈编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedbackId;

    @NotEmpty
    private Integer order_Id;
    
    
    private Integer user_Id;

    /**
     * 反馈类型编号
     */
    @NotEmpty
    private Integer feedBackType_Id;

    /**
     * 反馈标题
     */
    @NotEmpty
    private String feedbackTitle;

    /**
     * 反馈时间
     */
    @NotEmpty
    private Date feedbackDate;

    /**
     * 反馈内容
     */
    @NotEmpty
    private String feedbackContent;

    private String feedbackImage;
    
    private String feedback;
    
    private String strDate;
    
    
    
  
    /**
     * 反馈状态
     */
    private Integer feedbackState;
    
    private User user;
    
    private Feedbacktype feedbacktype;
    
    private static final long serialVersionUID = 1L;

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Integer order_Id) {
        this.order_Id = order_Id;
    }

    public Integer getFeedBackType_Id() {
        return feedBackType_Id;
    }

    public void setFeedBackType_Id(Integer feedBackType_Id) {
        this.feedBackType_Id = feedBackType_Id;
    }

    public String getFeedbackTitle() {
        return feedbackTitle;
    }

    public void setFeedbackTitle(String feedbackTitle) {
        this.feedbackTitle = feedbackTitle;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getFeedbackImage() {
        return feedbackImage;
    }

    public void setFeedbackImage(String feedbackImage) {
        this.feedbackImage = feedbackImage;
    }

    public Integer getFeedbackState() {
        return feedbackState;
    }

    public void setFeedbackState(Integer feedbackState) {
        this.feedbackState = feedbackState;
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
        Feedback other = (Feedback) that;
        return (this.getFeedbackId() == null ? other.getFeedbackId() == null : this.getFeedbackId().equals(other.getFeedbackId()))
            && (this.getOrder_Id() == null ? other.getOrder_Id() == null : this.getOrder_Id().equals(other.getOrder_Id()))
            && (this.getFeedBackType_Id() == null ? other.getFeedBackType_Id() == null : this.getFeedBackType_Id().equals(other.getFeedBackType_Id()))
            && (this.getFeedbackTitle() == null ? other.getFeedbackTitle() == null : this.getFeedbackTitle().equals(other.getFeedbackTitle()))
            && (this.getFeedbackDate() == null ? other.getFeedbackDate() == null : this.getFeedbackDate().equals(other.getFeedbackDate()))
            && (this.getFeedbackContent() == null ? other.getFeedbackContent() == null : this.getFeedbackContent().equals(other.getFeedbackContent()))
            && (this.getFeedbackImage() == null ? other.getFeedbackImage() == null : this.getFeedbackImage().equals(other.getFeedbackImage()))
            && (this.getFeedbackState() == null ? other.getFeedbackState() == null : this.getFeedbackState().equals(other.getFeedbackState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeedbackId() == null) ? 0 : getFeedbackId().hashCode());
        result = prime * result + ((getOrder_Id() == null) ? 0 : getOrder_Id().hashCode());
        result = prime * result + ((getFeedBackType_Id() == null) ? 0 : getFeedBackType_Id().hashCode());
        result = prime * result + ((getFeedbackTitle() == null) ? 0 : getFeedbackTitle().hashCode());
        result = prime * result + ((getFeedbackDate() == null) ? 0 : getFeedbackDate().hashCode());
        result = prime * result + ((getFeedbackContent() == null) ? 0 : getFeedbackContent().hashCode());
        result = prime * result + ((getFeedbackImage() == null) ? 0 : getFeedbackImage().hashCode());
        result = prime * result + ((getFeedbackState() == null) ? 0 : getFeedbackState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackId=").append(feedbackId);
        sb.append(", order_Id=").append(order_Id);
        sb.append(", feedBackType_Id=").append(feedBackType_Id);
        sb.append(", feedbackTitle=").append(feedbackTitle);
        sb.append(", feedbackDate=").append(feedbackDate);
        sb.append(", feedbackContent=").append(feedbackContent);
        sb.append(", feedbackImage=").append(feedbackImage);
        sb.append(", feedbackState=").append(feedbackState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public Integer getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Integer user_Id) {
		this.user_Id = user_Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Feedbacktype getFeedbacktype() {
		return feedbacktype;
	}

	public void setFeedbacktype(Feedbacktype feedbacktype) {
		this.feedbacktype = feedbacktype;
	}

	

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}