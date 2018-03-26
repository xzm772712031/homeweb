package com.neusoft.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsuranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InsuranceExample() {
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

        public Criteria andInsuranceIdIsNull() {
            addCriterion("InsuranceId is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNotNull() {
            addCriterion("InsuranceId is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdEqualTo(Integer value) {
            addCriterion("InsuranceId =", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotEqualTo(Integer value) {
            addCriterion("InsuranceId <>", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThan(Integer value) {
            addCriterion("InsuranceId >", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("InsuranceId >=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThan(Integer value) {
            addCriterion("InsuranceId <", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThanOrEqualTo(Integer value) {
            addCriterion("InsuranceId <=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIn(List<Integer> values) {
            addCriterion("InsuranceId in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotIn(List<Integer> values) {
            addCriterion("InsuranceId not in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdBetween(Integer value1, Integer value2) {
            addCriterion("InsuranceId between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("InsuranceId not between", value1, value2, "insuranceId");
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

        public Criteria andInsurancePriceIsNull() {
            addCriterion("InsurancePrice is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIsNotNull() {
            addCriterion("InsurancePrice is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceEqualTo(BigDecimal value) {
            addCriterion("InsurancePrice =", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotEqualTo(BigDecimal value) {
            addCriterion("InsurancePrice <>", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThan(BigDecimal value) {
            addCriterion("InsurancePrice >", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InsurancePrice >=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThan(BigDecimal value) {
            addCriterion("InsurancePrice <", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InsurancePrice <=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIn(List<BigDecimal> values) {
            addCriterion("InsurancePrice in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotIn(List<BigDecimal> values) {
            addCriterion("InsurancePrice not in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InsurancePrice between", value1, value2, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InsurancePrice not between", value1, value2, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateIsNull() {
            addCriterion("InsuranceDate is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateIsNotNull() {
            addCriterion("InsuranceDate is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateEqualTo(Date value) {
            addCriterion("InsuranceDate =", value, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateNotEqualTo(Date value) {
            addCriterion("InsuranceDate <>", value, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateGreaterThan(Date value) {
            addCriterion("InsuranceDate >", value, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("InsuranceDate >=", value, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateLessThan(Date value) {
            addCriterion("InsuranceDate <", value, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateLessThanOrEqualTo(Date value) {
            addCriterion("InsuranceDate <=", value, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateIn(List<Date> values) {
            addCriterion("InsuranceDate in", values, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateNotIn(List<Date> values) {
            addCriterion("InsuranceDate not in", values, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateBetween(Date value1, Date value2) {
            addCriterion("InsuranceDate between", value1, value2, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceDateNotBetween(Date value1, Date value2) {
            addCriterion("InsuranceDate not between", value1, value2, "insuranceDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNull() {
            addCriterion("InsuranceCost is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNotNull() {
            addCriterion("InsuranceCost is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostEqualTo(BigDecimal value) {
            addCriterion("InsuranceCost =", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotEqualTo(BigDecimal value) {
            addCriterion("InsuranceCost <>", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThan(BigDecimal value) {
            addCriterion("InsuranceCost >", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InsuranceCost >=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThan(BigDecimal value) {
            addCriterion("InsuranceCost <", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InsuranceCost <=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIn(List<BigDecimal> values) {
            addCriterion("InsuranceCost in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotIn(List<BigDecimal> values) {
            addCriterion("InsuranceCost not in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InsuranceCost between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InsuranceCost not between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerIsNull() {
            addCriterion("InsuranceOwner is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerIsNotNull() {
            addCriterion("InsuranceOwner is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerEqualTo(String value) {
            addCriterion("InsuranceOwner =", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerNotEqualTo(String value) {
            addCriterion("InsuranceOwner <>", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerGreaterThan(String value) {
            addCriterion("InsuranceOwner >", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("InsuranceOwner >=", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerLessThan(String value) {
            addCriterion("InsuranceOwner <", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerLessThanOrEqualTo(String value) {
            addCriterion("InsuranceOwner <=", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerLike(String value) {
            addCriterion("InsuranceOwner like", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerNotLike(String value) {
            addCriterion("InsuranceOwner not like", value, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerIn(List<String> values) {
            addCriterion("InsuranceOwner in", values, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerNotIn(List<String> values) {
            addCriterion("InsuranceOwner not in", values, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerBetween(String value1, String value2) {
            addCriterion("InsuranceOwner between", value1, value2, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andInsuranceOwnerNotBetween(String value1, String value2) {
            addCriterion("InsuranceOwner not between", value1, value2, "insuranceOwner");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyIsNull() {
            addCriterion("OwnerIdentify is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyIsNotNull() {
            addCriterion("OwnerIdentify is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyEqualTo(String value) {
            addCriterion("OwnerIdentify =", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyNotEqualTo(String value) {
            addCriterion("OwnerIdentify <>", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyGreaterThan(String value) {
            addCriterion("OwnerIdentify >", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("OwnerIdentify >=", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyLessThan(String value) {
            addCriterion("OwnerIdentify <", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyLessThanOrEqualTo(String value) {
            addCriterion("OwnerIdentify <=", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyLike(String value) {
            addCriterion("OwnerIdentify like", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyNotLike(String value) {
            addCriterion("OwnerIdentify not like", value, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyIn(List<String> values) {
            addCriterion("OwnerIdentify in", values, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyNotIn(List<String> values) {
            addCriterion("OwnerIdentify not in", values, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyBetween(String value1, String value2) {
            addCriterion("OwnerIdentify between", value1, value2, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andOwnerIdentifyNotBetween(String value1, String value2) {
            addCriterion("OwnerIdentify not between", value1, value2, "ownerIdentify");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentIsNull() {
            addCriterion("InsuranceComment is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentIsNotNull() {
            addCriterion("InsuranceComment is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentEqualTo(String value) {
            addCriterion("InsuranceComment =", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentNotEqualTo(String value) {
            addCriterion("InsuranceComment <>", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentGreaterThan(String value) {
            addCriterion("InsuranceComment >", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentGreaterThanOrEqualTo(String value) {
            addCriterion("InsuranceComment >=", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentLessThan(String value) {
            addCriterion("InsuranceComment <", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentLessThanOrEqualTo(String value) {
            addCriterion("InsuranceComment <=", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentLike(String value) {
            addCriterion("InsuranceComment like", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentNotLike(String value) {
            addCriterion("InsuranceComment not like", value, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentIn(List<String> values) {
            addCriterion("InsuranceComment in", values, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentNotIn(List<String> values) {
            addCriterion("InsuranceComment not in", values, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentBetween(String value1, String value2) {
            addCriterion("InsuranceComment between", value1, value2, "insuranceComment");
            return (Criteria) this;
        }

        public Criteria andInsuranceCommentNotBetween(String value1, String value2) {
            addCriterion("InsuranceComment not between", value1, value2, "insuranceComment");
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