package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUser_IdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUser_IdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_IdEqualTo(Integer value) {
            addCriterion("User_Id =", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdNotEqualTo(Integer value) {
            addCriterion("User_Id <>", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdGreaterThan(Integer value) {
            addCriterion("User_Id >", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Id >=", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdLessThan(Integer value) {
            addCriterion("User_Id <", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Id <=", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdIn(List<Integer> values) {
            addCriterion("User_Id in", values, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdNotIn(List<Integer> values) {
            addCriterion("User_Id not in", values, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdBetween(Integer value1, Integer value2) {
            addCriterion("User_Id between", value1, value2, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Id not between", value1, value2, "user_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdIsNull() {
            addCriterion("Bespeak_Id is null");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdIsNotNull() {
            addCriterion("Bespeak_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdEqualTo(Integer value) {
            addCriterion("Bespeak_Id =", value, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdNotEqualTo(Integer value) {
            addCriterion("Bespeak_Id <>", value, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdGreaterThan(Integer value) {
            addCriterion("Bespeak_Id >", value, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bespeak_Id >=", value, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdLessThan(Integer value) {
            addCriterion("Bespeak_Id <", value, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Bespeak_Id <=", value, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdIn(List<Integer> values) {
            addCriterion("Bespeak_Id in", values, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdNotIn(List<Integer> values) {
            addCriterion("Bespeak_Id not in", values, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdBetween(Integer value1, Integer value2) {
            addCriterion("Bespeak_Id between", value1, value2, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andBespeak_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Bespeak_Id not between", value1, value2, "bespeak_Id");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("OrderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("OrderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("OrderDate =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("OrderDate <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("OrderDate >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderDate >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("OrderDate <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("OrderDate <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("OrderDate in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("OrderDate not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("OrderDate between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("OrderDate not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("OrderPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("OrderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Double value) {
            addCriterion("OrderPrice =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Double value) {
            addCriterion("OrderPrice <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Double value) {
            addCriterion("OrderPrice >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("OrderPrice >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Double value) {
            addCriterion("OrderPrice <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("OrderPrice <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Double> values) {
            addCriterion("OrderPrice in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Double> values) {
            addCriterion("OrderPrice not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Double value1, Double value2) {
            addCriterion("OrderPrice between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("OrderPrice not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIsNull() {
            addCriterion("OrderComment is null");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIsNotNull() {
            addCriterion("OrderComment is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCommentEqualTo(String value) {
            addCriterion("OrderComment =", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotEqualTo(String value) {
            addCriterion("OrderComment <>", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentGreaterThan(String value) {
            addCriterion("OrderComment >", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentGreaterThanOrEqualTo(String value) {
            addCriterion("OrderComment >=", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLessThan(String value) {
            addCriterion("OrderComment <", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLessThanOrEqualTo(String value) {
            addCriterion("OrderComment <=", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLike(String value) {
            addCriterion("OrderComment like", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotLike(String value) {
            addCriterion("OrderComment not like", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIn(List<String> values) {
            addCriterion("OrderComment in", values, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotIn(List<String> values) {
            addCriterion("OrderComment not in", values, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentBetween(String value1, String value2) {
            addCriterion("OrderComment between", value1, value2, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotBetween(String value1, String value2) {
            addCriterion("OrderComment not between", value1, value2, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("OrderState =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("OrderState <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("OrderState >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderState >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("OrderState <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("OrderState <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("OrderState in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("OrderState not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("OrderState between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderState not between", value1, value2, "orderState");
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