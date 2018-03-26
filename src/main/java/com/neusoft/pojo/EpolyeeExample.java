package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.List;

public class EpolyeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public EpolyeeExample() {
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

        public Criteria andEpolyeeIdIsNull() {
            addCriterion("EpolyeeId is null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdIsNotNull() {
            addCriterion("EpolyeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdEqualTo(Integer value) {
            addCriterion("EpolyeeId =", value, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdNotEqualTo(Integer value) {
            addCriterion("EpolyeeId <>", value, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdGreaterThan(Integer value) {
            addCriterion("EpolyeeId >", value, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EpolyeeId >=", value, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdLessThan(Integer value) {
            addCriterion("EpolyeeId <", value, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("EpolyeeId <=", value, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdIn(List<Integer> values) {
            addCriterion("EpolyeeId in", values, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdNotIn(List<Integer> values) {
            addCriterion("EpolyeeId not in", values, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdBetween(Integer value1, Integer value2) {
            addCriterion("EpolyeeId between", value1, value2, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EpolyeeId not between", value1, value2, "epolyeeId");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameIsNull() {
            addCriterion("EpolyeeName is null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameIsNotNull() {
            addCriterion("EpolyeeName is not null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameEqualTo(String value) {
            addCriterion("EpolyeeName =", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameNotEqualTo(String value) {
            addCriterion("EpolyeeName <>", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameGreaterThan(String value) {
            addCriterion("EpolyeeName >", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EpolyeeName >=", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameLessThan(String value) {
            addCriterion("EpolyeeName <", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameLessThanOrEqualTo(String value) {
            addCriterion("EpolyeeName <=", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameLike(String value) {
            addCriterion("EpolyeeName like", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameNotLike(String value) {
            addCriterion("EpolyeeName not like", value, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameIn(List<String> values) {
            addCriterion("EpolyeeName in", values, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameNotIn(List<String> values) {
            addCriterion("EpolyeeName not in", values, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameBetween(String value1, String value2) {
            addCriterion("EpolyeeName between", value1, value2, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andEpolyeeNameNotBetween(String value1, String value2) {
            addCriterion("EpolyeeName not between", value1, value2, "epolyeeName");
            return (Criteria) this;
        }

        public Criteria andJob_IdIsNull() {
            addCriterion("Job_Id is null");
            return (Criteria) this;
        }

        public Criteria andJob_IdIsNotNull() {
            addCriterion("Job_Id is not null");
            return (Criteria) this;
        }

        public Criteria andJob_IdEqualTo(Integer value) {
            addCriterion("Job_Id =", value, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdNotEqualTo(Integer value) {
            addCriterion("Job_Id <>", value, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdGreaterThan(Integer value) {
            addCriterion("Job_Id >", value, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Job_Id >=", value, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdLessThan(Integer value) {
            addCriterion("Job_Id <", value, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Job_Id <=", value, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdIn(List<Integer> values) {
            addCriterion("Job_Id in", values, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdNotIn(List<Integer> values) {
            addCriterion("Job_Id not in", values, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdBetween(Integer value1, Integer value2) {
            addCriterion("Job_Id between", value1, value2, "job_Id");
            return (Criteria) this;
        }

        public Criteria andJob_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Job_Id not between", value1, value2, "job_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexIsNull() {
            addCriterion("EpolyeeSex is null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexIsNotNull() {
            addCriterion("EpolyeeSex is not null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexEqualTo(String value) {
            addCriterion("EpolyeeSex =", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexNotEqualTo(String value) {
            addCriterion("EpolyeeSex <>", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexGreaterThan(String value) {
            addCriterion("EpolyeeSex >", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexGreaterThanOrEqualTo(String value) {
            addCriterion("EpolyeeSex >=", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexLessThan(String value) {
            addCriterion("EpolyeeSex <", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexLessThanOrEqualTo(String value) {
            addCriterion("EpolyeeSex <=", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexLike(String value) {
            addCriterion("EpolyeeSex like", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexNotLike(String value) {
            addCriterion("EpolyeeSex not like", value, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexIn(List<String> values) {
            addCriterion("EpolyeeSex in", values, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexNotIn(List<String> values) {
            addCriterion("EpolyeeSex not in", values, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexBetween(String value1, String value2) {
            addCriterion("EpolyeeSex between", value1, value2, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeSexNotBetween(String value1, String value2) {
            addCriterion("EpolyeeSex not between", value1, value2, "epolyeeSex");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeIsNull() {
            addCriterion("EpolyeeAge is null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeIsNotNull() {
            addCriterion("EpolyeeAge is not null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeEqualTo(String value) {
            addCriterion("EpolyeeAge =", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeNotEqualTo(String value) {
            addCriterion("EpolyeeAge <>", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeGreaterThan(String value) {
            addCriterion("EpolyeeAge >", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeGreaterThanOrEqualTo(String value) {
            addCriterion("EpolyeeAge >=", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeLessThan(String value) {
            addCriterion("EpolyeeAge <", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeLessThanOrEqualTo(String value) {
            addCriterion("EpolyeeAge <=", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeLike(String value) {
            addCriterion("EpolyeeAge like", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeNotLike(String value) {
            addCriterion("EpolyeeAge not like", value, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeIn(List<String> values) {
            addCriterion("EpolyeeAge in", values, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeNotIn(List<String> values) {
            addCriterion("EpolyeeAge not in", values, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeBetween(String value1, String value2) {
            addCriterion("EpolyeeAge between", value1, value2, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeAgeNotBetween(String value1, String value2) {
            addCriterion("EpolyeeAge not between", value1, value2, "epolyeeAge");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateIsNull() {
            addCriterion("EpolyeeState is null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateIsNotNull() {
            addCriterion("EpolyeeState is not null");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateEqualTo(Integer value) {
            addCriterion("EpolyeeState =", value, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateNotEqualTo(Integer value) {
            addCriterion("EpolyeeState <>", value, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateGreaterThan(Integer value) {
            addCriterion("EpolyeeState >", value, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("EpolyeeState >=", value, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateLessThan(Integer value) {
            addCriterion("EpolyeeState <", value, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateLessThanOrEqualTo(Integer value) {
            addCriterion("EpolyeeState <=", value, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateIn(List<Integer> values) {
            addCriterion("EpolyeeState in", values, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateNotIn(List<Integer> values) {
            addCriterion("EpolyeeState not in", values, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateBetween(Integer value1, Integer value2) {
            addCriterion("EpolyeeState between", value1, value2, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andEpolyeeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("EpolyeeState not between", value1, value2, "epolyeeState");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdIsNull() {
            addCriterion("Admin_Id is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdIsNotNull() {
            addCriterion("Admin_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdEqualTo(Integer value) {
            addCriterion("Admin_Id =", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdNotEqualTo(Integer value) {
            addCriterion("Admin_Id <>", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdGreaterThan(Integer value) {
            addCriterion("Admin_Id >", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Admin_Id >=", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdLessThan(Integer value) {
            addCriterion("Admin_Id <", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Admin_Id <=", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdIn(List<Integer> values) {
            addCriterion("Admin_Id in", values, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdNotIn(List<Integer> values) {
            addCriterion("Admin_Id not in", values, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdBetween(Integer value1, Integer value2) {
            addCriterion("Admin_Id between", value1, value2, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Admin_Id not between", value1, value2, "admin_Id");
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