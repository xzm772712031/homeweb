package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrdercarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrdercarExample() {
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

        public Criteria andOrderCarIdIsNull() {
            addCriterion("OrderCarId is null");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdIsNotNull() {
            addCriterion("OrderCarId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdEqualTo(Integer value) {
            addCriterion("OrderCarId =", value, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdNotEqualTo(Integer value) {
            addCriterion("OrderCarId <>", value, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdGreaterThan(Integer value) {
            addCriterion("OrderCarId >", value, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderCarId >=", value, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdLessThan(Integer value) {
            addCriterion("OrderCarId <", value, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("OrderCarId <=", value, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdIn(List<Integer> values) {
            addCriterion("OrderCarId in", values, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdNotIn(List<Integer> values) {
            addCriterion("OrderCarId not in", values, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdBetween(Integer value1, Integer value2) {
            addCriterion("OrderCarId between", value1, value2, "orderCarId");
            return (Criteria) this;
        }

        public Criteria andOrderCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderCarId not between", value1, value2, "orderCarId");
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

        public Criteria andCar_IdIsNull() {
            addCriterion("Car_Id is null");
            return (Criteria) this;
        }

        public Criteria andCar_IdIsNotNull() {
            addCriterion("Car_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCar_IdEqualTo(Integer value) {
            addCriterion("Car_Id =", value, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdNotEqualTo(Integer value) {
            addCriterion("Car_Id <>", value, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdGreaterThan(Integer value) {
            addCriterion("Car_Id >", value, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Car_Id >=", value, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdLessThan(Integer value) {
            addCriterion("Car_Id <", value, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Car_Id <=", value, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdIn(List<Integer> values) {
            addCriterion("Car_Id in", values, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdNotIn(List<Integer> values) {
            addCriterion("Car_Id not in", values, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdBetween(Integer value1, Integer value2) {
            addCriterion("Car_Id between", value1, value2, "car_Id");
            return (Criteria) this;
        }

        public Criteria andCar_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Car_Id not between", value1, value2, "car_Id");
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