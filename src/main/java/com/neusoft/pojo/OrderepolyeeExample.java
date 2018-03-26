package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderepolyeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderepolyeeExample() {
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

        public Criteria andOrderdEpolyeeIdIsNull() {
            addCriterion("OrderdEpolyeeId is null");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdIsNotNull() {
            addCriterion("OrderdEpolyeeId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdEqualTo(Integer value) {
            addCriterion("OrderdEpolyeeId =", value, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdNotEqualTo(Integer value) {
            addCriterion("OrderdEpolyeeId <>", value, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdGreaterThan(Integer value) {
            addCriterion("OrderdEpolyeeId >", value, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderdEpolyeeId >=", value, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdLessThan(Integer value) {
            addCriterion("OrderdEpolyeeId <", value, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("OrderdEpolyeeId <=", value, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdIn(List<Integer> values) {
            addCriterion("OrderdEpolyeeId in", values, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdNotIn(List<Integer> values) {
            addCriterion("OrderdEpolyeeId not in", values, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdBetween(Integer value1, Integer value2) {
            addCriterion("OrderdEpolyeeId between", value1, value2, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrderdEpolyeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderdEpolyeeId not between", value1, value2, "orderdEpolyeeId");
            return (Criteria) this;
        }

        public Criteria andOrder_IDIsNull() {
            addCriterion("Order_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrder_IDIsNotNull() {
            addCriterion("Order_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_IDEqualTo(Integer value) {
            addCriterion("Order_ID =", value, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDNotEqualTo(Integer value) {
            addCriterion("Order_ID <>", value, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDGreaterThan(Integer value) {
            addCriterion("Order_ID >", value, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order_ID >=", value, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDLessThan(Integer value) {
            addCriterion("Order_ID <", value, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDLessThanOrEqualTo(Integer value) {
            addCriterion("Order_ID <=", value, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDIn(List<Integer> values) {
            addCriterion("Order_ID in", values, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDNotIn(List<Integer> values) {
            addCriterion("Order_ID not in", values, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDBetween(Integer value1, Integer value2) {
            addCriterion("Order_ID between", value1, value2, "order_ID");
            return (Criteria) this;
        }

        public Criteria andOrder_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("Order_ID not between", value1, value2, "order_ID");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdIsNull() {
            addCriterion("Epolyee_Id is null");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdIsNotNull() {
            addCriterion("Epolyee_Id is not null");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdEqualTo(Integer value) {
            addCriterion("Epolyee_Id =", value, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdNotEqualTo(Integer value) {
            addCriterion("Epolyee_Id <>", value, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdGreaterThan(Integer value) {
            addCriterion("Epolyee_Id >", value, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Epolyee_Id >=", value, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdLessThan(Integer value) {
            addCriterion("Epolyee_Id <", value, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Epolyee_Id <=", value, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdIn(List<Integer> values) {
            addCriterion("Epolyee_Id in", values, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdNotIn(List<Integer> values) {
            addCriterion("Epolyee_Id not in", values, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdBetween(Integer value1, Integer value2) {
            addCriterion("Epolyee_Id between", value1, value2, "epolyee_Id");
            return (Criteria) this;
        }

        public Criteria andEpolyee_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Epolyee_Id not between", value1, value2, "epolyee_Id");
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