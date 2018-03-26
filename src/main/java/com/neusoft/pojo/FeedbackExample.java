package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FeedbackExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFeedbackIdIsNull() {
            addCriterion("FeedbackId is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("FeedbackId is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(Integer value) {
            addCriterion("FeedbackId =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(Integer value) {
            addCriterion("FeedbackId <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(Integer value) {
            addCriterion("FeedbackId >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FeedbackId >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(Integer value) {
            addCriterion("FeedbackId <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(Integer value) {
            addCriterion("FeedbackId <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<Integer> values) {
            addCriterion("FeedbackId in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<Integer> values) {
            addCriterion("FeedbackId not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(Integer value1, Integer value2) {
            addCriterion("FeedbackId between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FeedbackId not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andOrder_IdIsNull() {
            addCriterion("Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_IdIsNotNull() {
            addCriterion("Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_IdEqualTo(Integer value) {
            addCriterion("Order_Id =", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotEqualTo(Integer value) {
            addCriterion("Order_Id <>", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdGreaterThan(Integer value) {
            addCriterion("Order_Id >", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order_Id >=", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLessThan(Integer value) {
            addCriterion("Order_Id <", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Order_Id <=", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdIn(List<Integer> values) {
            addCriterion("Order_Id in", values, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotIn(List<Integer> values) {
            addCriterion("Order_Id not in", values, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdBetween(Integer value1, Integer value2) {
            addCriterion("Order_Id between", value1, value2, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Order_Id not between", value1, value2, "order_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdIsNull() {
            addCriterion("FeedBackType_Id is null");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdIsNotNull() {
            addCriterion("FeedBackType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdEqualTo(Integer value) {
            addCriterion("FeedBackType_Id =", value, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdNotEqualTo(Integer value) {
            addCriterion("FeedBackType_Id <>", value, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdGreaterThan(Integer value) {
            addCriterion("FeedBackType_Id >", value, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FeedBackType_Id >=", value, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdLessThan(Integer value) {
            addCriterion("FeedBackType_Id <", value, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdLessThanOrEqualTo(Integer value) {
            addCriterion("FeedBackType_Id <=", value, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdIn(List<Integer> values) {
            addCriterion("FeedBackType_Id in", values, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdNotIn(List<Integer> values) {
            addCriterion("FeedBackType_Id not in", values, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdBetween(Integer value1, Integer value2) {
            addCriterion("FeedBackType_Id between", value1, value2, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedBackType_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("FeedBackType_Id not between", value1, value2, "feedBackType_Id");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleIsNull() {
            addCriterion("FeedbackTitle is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleIsNotNull() {
            addCriterion("FeedbackTitle is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleEqualTo(String value) {
            addCriterion("FeedbackTitle =", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleNotEqualTo(String value) {
            addCriterion("FeedbackTitle <>", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleGreaterThan(String value) {
            addCriterion("FeedbackTitle >", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleGreaterThanOrEqualTo(String value) {
            addCriterion("FeedbackTitle >=", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleLessThan(String value) {
            addCriterion("FeedbackTitle <", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleLessThanOrEqualTo(String value) {
            addCriterion("FeedbackTitle <=", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleLike(String value) {
            addCriterion("FeedbackTitle like", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleNotLike(String value) {
            addCriterion("FeedbackTitle not like", value, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleIn(List<String> values) {
            addCriterion("FeedbackTitle in", values, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleNotIn(List<String> values) {
            addCriterion("FeedbackTitle not in", values, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleBetween(String value1, String value2) {
            addCriterion("FeedbackTitle between", value1, value2, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackTitleNotBetween(String value1, String value2) {
            addCriterion("FeedbackTitle not between", value1, value2, "feedbackTitle");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIsNull() {
            addCriterion("FeedbackDate is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIsNotNull() {
            addCriterion("FeedbackDate is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateEqualTo(Date value) {
            addCriterion("FeedbackDate =", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotEqualTo(Date value) {
            addCriterion("FeedbackDate <>", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateGreaterThan(Date value) {
            addCriterion("FeedbackDate >", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FeedbackDate >=", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateLessThan(Date value) {
            addCriterion("FeedbackDate <", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateLessThanOrEqualTo(Date value) {
            addCriterion("FeedbackDate <=", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIn(List<Date> values) {
            addCriterion("FeedbackDate in", values, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotIn(List<Date> values) {
            addCriterion("FeedbackDate not in", values, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateBetween(Date value1, Date value2) {
            addCriterion("FeedbackDate between", value1, value2, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotBetween(Date value1, Date value2) {
            addCriterion("FeedbackDate not between", value1, value2, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIsNull() {
            addCriterion("FeedbackContent is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIsNotNull() {
            addCriterion("FeedbackContent is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentEqualTo(String value) {
            addCriterion("FeedbackContent =", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotEqualTo(String value) {
            addCriterion("FeedbackContent <>", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentGreaterThan(String value) {
            addCriterion("FeedbackContent >", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentGreaterThanOrEqualTo(String value) {
            addCriterion("FeedbackContent >=", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLessThan(String value) {
            addCriterion("FeedbackContent <", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLessThanOrEqualTo(String value) {
            addCriterion("FeedbackContent <=", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentLike(String value) {
            addCriterion("FeedbackContent like", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotLike(String value) {
            addCriterion("FeedbackContent not like", value, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentIn(List<String> values) {
            addCriterion("FeedbackContent in", values, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotIn(List<String> values) {
            addCriterion("FeedbackContent not in", values, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentBetween(String value1, String value2) {
            addCriterion("FeedbackContent between", value1, value2, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackContentNotBetween(String value1, String value2) {
            addCriterion("FeedbackContent not between", value1, value2, "feedbackContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageIsNull() {
            addCriterion("FeedbackImage is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageIsNotNull() {
            addCriterion("FeedbackImage is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageEqualTo(String value) {
            addCriterion("FeedbackImage =", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageNotEqualTo(String value) {
            addCriterion("FeedbackImage <>", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageGreaterThan(String value) {
            addCriterion("FeedbackImage >", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageGreaterThanOrEqualTo(String value) {
            addCriterion("FeedbackImage >=", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageLessThan(String value) {
            addCriterion("FeedbackImage <", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageLessThanOrEqualTo(String value) {
            addCriterion("FeedbackImage <=", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageLike(String value) {
            addCriterion("FeedbackImage like", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageNotLike(String value) {
            addCriterion("FeedbackImage not like", value, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageIn(List<String> values) {
            addCriterion("FeedbackImage in", values, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageNotIn(List<String> values) {
            addCriterion("FeedbackImage not in", values, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageBetween(String value1, String value2) {
            addCriterion("FeedbackImage between", value1, value2, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackImageNotBetween(String value1, String value2) {
            addCriterion("FeedbackImage not between", value1, value2, "feedbackImage");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateIsNull() {
            addCriterion("FeedbackState is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateIsNotNull() {
            addCriterion("FeedbackState is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateEqualTo(Integer value) {
            addCriterion("FeedbackState =", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateNotEqualTo(Integer value) {
            addCriterion("FeedbackState <>", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateGreaterThan(Integer value) {
            addCriterion("FeedbackState >", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FeedbackState >=", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateLessThan(Integer value) {
            addCriterion("FeedbackState <", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateLessThanOrEqualTo(Integer value) {
            addCriterion("FeedbackState <=", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateIn(List<Integer> values) {
            addCriterion("FeedbackState in", values, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateNotIn(List<Integer> values) {
            addCriterion("FeedbackState not in", values, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateBetween(Integer value1, Integer value2) {
            addCriterion("FeedbackState between", value1, value2, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateNotBetween(Integer value1, Integer value2) {
            addCriterion("FeedbackState not between", value1, value2, "feedbackState");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}