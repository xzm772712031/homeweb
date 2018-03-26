package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.List;

public class CartypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CartypeExample() {
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

        public Criteria andCarTypeIdIsNull() {
            addCriterion("CarTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNotNull() {
            addCriterion("CarTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdEqualTo(Integer value) {
            addCriterion("CarTypeId =", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotEqualTo(Integer value) {
            addCriterion("CarTypeId <>", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThan(Integer value) {
            addCriterion("CarTypeId >", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarTypeId >=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThan(Integer value) {
            addCriterion("CarTypeId <", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CarTypeId <=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIn(List<Integer> values) {
            addCriterion("CarTypeId in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotIn(List<Integer> values) {
            addCriterion("CarTypeId not in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("CarTypeId between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CarTypeId not between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIsNull() {
            addCriterion("CarTypeName is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIsNotNull() {
            addCriterion("CarTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameEqualTo(String value) {
            addCriterion("CarTypeName =", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotEqualTo(String value) {
            addCriterion("CarTypeName <>", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameGreaterThan(String value) {
            addCriterion("CarTypeName >", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("CarTypeName >=", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLessThan(String value) {
            addCriterion("CarTypeName <", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLessThanOrEqualTo(String value) {
            addCriterion("CarTypeName <=", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLike(String value) {
            addCriterion("CarTypeName like", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotLike(String value) {
            addCriterion("CarTypeName not like", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIn(List<String> values) {
            addCriterion("CarTypeName in", values, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotIn(List<String> values) {
            addCriterion("CarTypeName not in", values, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameBetween(String value1, String value2) {
            addCriterion("CarTypeName between", value1, value2, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotBetween(String value1, String value2) {
            addCriterion("CarTypeName not between", value1, value2, "carTypeName");
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