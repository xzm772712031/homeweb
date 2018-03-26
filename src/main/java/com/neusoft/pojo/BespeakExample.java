package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BespeakExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BespeakExample() {
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

        public Criteria andBespeakIdIsNull() {
            addCriterion("BespeakId is null");
            return (Criteria) this;
        }

        public Criteria andBespeakIdIsNotNull() {
            addCriterion("BespeakId is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakIdEqualTo(Integer value) {
            addCriterion("BespeakId =", value, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdNotEqualTo(Integer value) {
            addCriterion("BespeakId <>", value, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdGreaterThan(Integer value) {
            addCriterion("BespeakId >", value, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BespeakId >=", value, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdLessThan(Integer value) {
            addCriterion("BespeakId <", value, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdLessThanOrEqualTo(Integer value) {
            addCriterion("BespeakId <=", value, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdIn(List<Integer> values) {
            addCriterion("BespeakId in", values, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdNotIn(List<Integer> values) {
            addCriterion("BespeakId not in", values, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdBetween(Integer value1, Integer value2) {
            addCriterion("BespeakId between", value1, value2, "bespeakId");
            return (Criteria) this;
        }

        public Criteria andBespeakIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BespeakId not between", value1, value2, "bespeakId");
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

        public Criteria andBespeakCityIsNull() {
            addCriterion("BespeakCity is null");
            return (Criteria) this;
        }

        public Criteria andBespeakCityIsNotNull() {
            addCriterion("BespeakCity is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakCityEqualTo(String value) {
            addCriterion("BespeakCity =", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityNotEqualTo(String value) {
            addCriterion("BespeakCity <>", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityGreaterThan(String value) {
            addCriterion("BespeakCity >", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityGreaterThanOrEqualTo(String value) {
            addCriterion("BespeakCity >=", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityLessThan(String value) {
            addCriterion("BespeakCity <", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityLessThanOrEqualTo(String value) {
            addCriterion("BespeakCity <=", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityLike(String value) {
            addCriterion("BespeakCity like", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityNotLike(String value) {
            addCriterion("BespeakCity not like", value, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityIn(List<String> values) {
            addCriterion("BespeakCity in", values, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityNotIn(List<String> values) {
            addCriterion("BespeakCity not in", values, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityBetween(String value1, String value2) {
            addCriterion("BespeakCity between", value1, value2, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakCityNotBetween(String value1, String value2) {
            addCriterion("BespeakCity not between", value1, value2, "bespeakCity");
            return (Criteria) this;
        }

        public Criteria andBespeakOutIsNull() {
            addCriterion("BespeakOut is null");
            return (Criteria) this;
        }

        public Criteria andBespeakOutIsNotNull() {
            addCriterion("BespeakOut is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakOutEqualTo(String value) {
            addCriterion("BespeakOut =", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutNotEqualTo(String value) {
            addCriterion("BespeakOut <>", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutGreaterThan(String value) {
            addCriterion("BespeakOut >", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutGreaterThanOrEqualTo(String value) {
            addCriterion("BespeakOut >=", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutLessThan(String value) {
            addCriterion("BespeakOut <", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutLessThanOrEqualTo(String value) {
            addCriterion("BespeakOut <=", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutLike(String value) {
            addCriterion("BespeakOut like", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutNotLike(String value) {
            addCriterion("BespeakOut not like", value, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutIn(List<String> values) {
            addCriterion("BespeakOut in", values, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutNotIn(List<String> values) {
            addCriterion("BespeakOut not in", values, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutBetween(String value1, String value2) {
            addCriterion("BespeakOut between", value1, value2, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakOutNotBetween(String value1, String value2) {
            addCriterion("BespeakOut not between", value1, value2, "bespeakOut");
            return (Criteria) this;
        }

        public Criteria andBespeakInIsNull() {
            addCriterion("BespeakIn is null");
            return (Criteria) this;
        }

        public Criteria andBespeakInIsNotNull() {
            addCriterion("BespeakIn is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakInEqualTo(String value) {
            addCriterion("BespeakIn =", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInNotEqualTo(String value) {
            addCriterion("BespeakIn <>", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInGreaterThan(String value) {
            addCriterion("BespeakIn >", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInGreaterThanOrEqualTo(String value) {
            addCriterion("BespeakIn >=", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInLessThan(String value) {
            addCriterion("BespeakIn <", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInLessThanOrEqualTo(String value) {
            addCriterion("BespeakIn <=", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInLike(String value) {
            addCriterion("BespeakIn like", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInNotLike(String value) {
            addCriterion("BespeakIn not like", value, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInIn(List<String> values) {
            addCriterion("BespeakIn in", values, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInNotIn(List<String> values) {
            addCriterion("BespeakIn not in", values, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInBetween(String value1, String value2) {
            addCriterion("BespeakIn between", value1, value2, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakInNotBetween(String value1, String value2) {
            addCriterion("BespeakIn not between", value1, value2, "bespeakIn");
            return (Criteria) this;
        }

        public Criteria andBespeakDateIsNull() {
            addCriterion("BespeakDate is null");
            return (Criteria) this;
        }

        public Criteria andBespeakDateIsNotNull() {
            addCriterion("BespeakDate is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakDateEqualTo(Date value) {
            addCriterion("BespeakDate =", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateNotEqualTo(Date value) {
            addCriterion("BespeakDate <>", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateGreaterThan(Date value) {
            addCriterion("BespeakDate >", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BespeakDate >=", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateLessThan(Date value) {
            addCriterion("BespeakDate <", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateLessThanOrEqualTo(Date value) {
            addCriterion("BespeakDate <=", value, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateIn(List<Date> values) {
            addCriterion("BespeakDate in", values, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateNotIn(List<Date> values) {
            addCriterion("BespeakDate not in", values, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateBetween(Date value1, Date value2) {
            addCriterion("BespeakDate between", value1, value2, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakDateNotBetween(Date value1, Date value2) {
            addCriterion("BespeakDate not between", value1, value2, "bespeakDate");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenIsNull() {
            addCriterion("BespeakAtten is null");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenIsNotNull() {
            addCriterion("BespeakAtten is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenEqualTo(String value) {
            addCriterion("BespeakAtten =", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenNotEqualTo(String value) {
            addCriterion("BespeakAtten <>", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenGreaterThan(String value) {
            addCriterion("BespeakAtten >", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenGreaterThanOrEqualTo(String value) {
            addCriterion("BespeakAtten >=", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenLessThan(String value) {
            addCriterion("BespeakAtten <", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenLessThanOrEqualTo(String value) {
            addCriterion("BespeakAtten <=", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenLike(String value) {
            addCriterion("BespeakAtten like", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenNotLike(String value) {
            addCriterion("BespeakAtten not like", value, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenIn(List<String> values) {
            addCriterion("BespeakAtten in", values, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenNotIn(List<String> values) {
            addCriterion("BespeakAtten not in", values, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenBetween(String value1, String value2) {
            addCriterion("BespeakAtten between", value1, value2, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakAttenNotBetween(String value1, String value2) {
            addCriterion("BespeakAtten not between", value1, value2, "bespeakAtten");
            return (Criteria) this;
        }

        public Criteria andBespeakTelIsNull() {
            addCriterion("BespeakTel is null");
            return (Criteria) this;
        }

        public Criteria andBespeakTelIsNotNull() {
            addCriterion("BespeakTel is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakTelEqualTo(String value) {
            addCriterion("BespeakTel =", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelNotEqualTo(String value) {
            addCriterion("BespeakTel <>", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelGreaterThan(String value) {
            addCriterion("BespeakTel >", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelGreaterThanOrEqualTo(String value) {
            addCriterion("BespeakTel >=", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelLessThan(String value) {
            addCriterion("BespeakTel <", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelLessThanOrEqualTo(String value) {
            addCriterion("BespeakTel <=", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelLike(String value) {
            addCriterion("BespeakTel like", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelNotLike(String value) {
            addCriterion("BespeakTel not like", value, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelIn(List<String> values) {
            addCriterion("BespeakTel in", values, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelNotIn(List<String> values) {
            addCriterion("BespeakTel not in", values, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelBetween(String value1, String value2) {
            addCriterion("BespeakTel between", value1, value2, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andBespeakTelNotBetween(String value1, String value2) {
            addCriterion("BespeakTel not between", value1, value2, "bespeakTel");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GoodsType is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GoodsType is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GoodsType =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GoodsType <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GoodsType >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsType >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GoodsType <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GoodsType <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GoodsType like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GoodsType not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GoodsType in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GoodsType not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GoodsType between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GoodsType not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdIsNull() {
            addCriterion("ServiceType_Id is null");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdIsNotNull() {
            addCriterion("ServiceType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdEqualTo(Integer value) {
            addCriterion("ServiceType_Id =", value, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdNotEqualTo(Integer value) {
            addCriterion("ServiceType_Id <>", value, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdGreaterThan(Integer value) {
            addCriterion("ServiceType_Id >", value, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ServiceType_Id >=", value, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdLessThan(Integer value) {
            addCriterion("ServiceType_Id <", value, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdLessThanOrEqualTo(Integer value) {
            addCriterion("ServiceType_Id <=", value, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdIn(List<Integer> values) {
            addCriterion("ServiceType_Id in", values, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdNotIn(List<Integer> values) {
            addCriterion("ServiceType_Id not in", values, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdBetween(Integer value1, Integer value2) {
            addCriterion("ServiceType_Id between", value1, value2, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andServiceType_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("ServiceType_Id not between", value1, value2, "serviceType_Id");
            return (Criteria) this;
        }

        public Criteria andBespeakAddIsNull() {
            addCriterion("BespeakAdd is null");
            return (Criteria) this;
        }

        public Criteria andBespeakAddIsNotNull() {
            addCriterion("BespeakAdd is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakAddEqualTo(String value) {
            addCriterion("BespeakAdd =", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddNotEqualTo(String value) {
            addCriterion("BespeakAdd <>", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddGreaterThan(String value) {
            addCriterion("BespeakAdd >", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddGreaterThanOrEqualTo(String value) {
            addCriterion("BespeakAdd >=", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddLessThan(String value) {
            addCriterion("BespeakAdd <", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddLessThanOrEqualTo(String value) {
            addCriterion("BespeakAdd <=", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddLike(String value) {
            addCriterion("BespeakAdd like", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddNotLike(String value) {
            addCriterion("BespeakAdd not like", value, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddIn(List<String> values) {
            addCriterion("BespeakAdd in", values, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddNotIn(List<String> values) {
            addCriterion("BespeakAdd not in", values, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddBetween(String value1, String value2) {
            addCriterion("BespeakAdd between", value1, value2, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andBespeakAddNotBetween(String value1, String value2) {
            addCriterion("BespeakAdd not between", value1, value2, "bespeakAdd");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andBespeakStateIsNull() {
            addCriterion("BespeakState is null");
            return (Criteria) this;
        }

        public Criteria andBespeakStateIsNotNull() {
            addCriterion("BespeakState is not null");
            return (Criteria) this;
        }

        public Criteria andBespeakStateEqualTo(Integer value) {
            addCriterion("BespeakState =", value, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateNotEqualTo(Integer value) {
            addCriterion("BespeakState <>", value, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateGreaterThan(Integer value) {
            addCriterion("BespeakState >", value, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("BespeakState >=", value, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateLessThan(Integer value) {
            addCriterion("BespeakState <", value, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateLessThanOrEqualTo(Integer value) {
            addCriterion("BespeakState <=", value, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateIn(List<Integer> values) {
            addCriterion("BespeakState in", values, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateNotIn(List<Integer> values) {
            addCriterion("BespeakState not in", values, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateBetween(Integer value1, Integer value2) {
            addCriterion("BespeakState between", value1, value2, "bespeakState");
            return (Criteria) this;
        }

        public Criteria andBespeakStateNotBetween(Integer value1, Integer value2) {
            addCriterion("BespeakState not between", value1, value2, "bespeakState");
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