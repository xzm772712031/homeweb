package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CarExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("CarId is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("CarId is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("CarId =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("CarId <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("CarId >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarId >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("CarId <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("CarId <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("CarId in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("CarId not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("CarId between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CarId not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNull() {
            addCriterion("CarName is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("CarName is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("CarName =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("CarName <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("CarName >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("CarName >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("CarName <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("CarName <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("CarName like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("CarName not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("CarName in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("CarName not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("CarName between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("CarName not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("CarType is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("CarType is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(Integer value) {
            addCriterion("CarType =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(Integer value) {
            addCriterion("CarType <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(Integer value) {
            addCriterion("CarType >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarType >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(Integer value) {
            addCriterion("CarType <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CarType <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<Integer> values) {
            addCriterion("CarType in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<Integer> values) {
            addCriterion("CarType not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(Integer value1, Integer value2) {
            addCriterion("CarType between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CarType not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarClientIsNull() {
            addCriterion("CarClient is null");
            return (Criteria) this;
        }

        public Criteria andCarClientIsNotNull() {
            addCriterion("CarClient is not null");
            return (Criteria) this;
        }

        public Criteria andCarClientEqualTo(String value) {
            addCriterion("CarClient =", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientNotEqualTo(String value) {
            addCriterion("CarClient <>", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientGreaterThan(String value) {
            addCriterion("CarClient >", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientGreaterThanOrEqualTo(String value) {
            addCriterion("CarClient >=", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientLessThan(String value) {
            addCriterion("CarClient <", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientLessThanOrEqualTo(String value) {
            addCriterion("CarClient <=", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientLike(String value) {
            addCriterion("CarClient like", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientNotLike(String value) {
            addCriterion("CarClient not like", value, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientIn(List<String> values) {
            addCriterion("CarClient in", values, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientNotIn(List<String> values) {
            addCriterion("CarClient not in", values, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientBetween(String value1, String value2) {
            addCriterion("CarClient between", value1, value2, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarClientNotBetween(String value1, String value2) {
            addCriterion("CarClient not between", value1, value2, "carClient");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNull() {
            addCriterion("CarState is null");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNotNull() {
            addCriterion("CarState is not null");
            return (Criteria) this;
        }

        public Criteria andCarStateEqualTo(Integer value) {
            addCriterion("CarState =", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotEqualTo(Integer value) {
            addCriterion("CarState <>", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThan(Integer value) {
            addCriterion("CarState >", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarState >=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThan(Integer value) {
            addCriterion("CarState <", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThanOrEqualTo(Integer value) {
            addCriterion("CarState <=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateIn(List<Integer> values) {
            addCriterion("CarState in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotIn(List<Integer> values) {
            addCriterion("CarState not in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateBetween(Integer value1, Integer value2) {
            addCriterion("CarState between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotBetween(Integer value1, Integer value2) {
            addCriterion("CarState not between", value1, value2, "carState");
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