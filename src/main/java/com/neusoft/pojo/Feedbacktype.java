package com.neusoft.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="feedbacktype")
public class Feedbacktype implements Serializable {
    /**
     * 反馈类型编号
     */
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedbackTypeId;

    /**
     * 反馈类型名称
     */
    @NotEmpty
    private String feedbackTypeName;

    private static final long serialVersionUID = 1L;

    public Integer getFeedbackTypeId() {
        return feedbackTypeId;
    }

    public void setFeedbackTypeId(Integer feedbackTypeId) {
        this.feedbackTypeId = feedbackTypeId;
    }

    public String getFeedbackTypeName() {
        return feedbackTypeName;
    }

    public void setFeedbackTypeName(String feedbackTypeName) {
        this.feedbackTypeName = feedbackTypeName;
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
        Feedbacktype other = (Feedbacktype) that;
        return (this.getFeedbackTypeId() == null ? other.getFeedbackTypeId() == null : this.getFeedbackTypeId().equals(other.getFeedbackTypeId()))
            && (this.getFeedbackTypeName() == null ? other.getFeedbackTypeName() == null : this.getFeedbackTypeName().equals(other.getFeedbackTypeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeedbackTypeId() == null) ? 0 : getFeedbackTypeId().hashCode());
        result = prime * result + ((getFeedbackTypeName() == null) ? 0 : getFeedbackTypeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackTypeId=").append(feedbackTypeId);
        sb.append(", feedbackTypeName=").append(feedbackTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}