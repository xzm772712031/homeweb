package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public NewsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNewsIdIsNull() {
            addCriterion("newsId is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("newsId is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("newsId =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("newsId <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("newsId >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsId >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("newsId <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("newsId <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("newsId in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("newsId not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("newsId between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("newsId not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("newsTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("newsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("newsTitle =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("newsTitle <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("newsTitle >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("newsTitle >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("newsTitle <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("newsTitle <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("newsTitle like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("newsTitle not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("newsTitle in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("newsTitle not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("newsTitle between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("newsTitle not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsContextIsNull() {
            addCriterion("newsContext is null");
            return (Criteria) this;
        }

        public Criteria andNewsContextIsNotNull() {
            addCriterion("newsContext is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContextEqualTo(String value) {
            addCriterion("newsContext =", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotEqualTo(String value) {
            addCriterion("newsContext <>", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextGreaterThan(String value) {
            addCriterion("newsContext >", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextGreaterThanOrEqualTo(String value) {
            addCriterion("newsContext >=", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextLessThan(String value) {
            addCriterion("newsContext <", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextLessThanOrEqualTo(String value) {
            addCriterion("newsContext <=", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextLike(String value) {
            addCriterion("newsContext like", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotLike(String value) {
            addCriterion("newsContext not like", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextIn(List<String> values) {
            addCriterion("newsContext in", values, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotIn(List<String> values) {
            addCriterion("newsContext not in", values, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextBetween(String value1, String value2) {
            addCriterion("newsContext between", value1, value2, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotBetween(String value1, String value2) {
            addCriterion("newsContext not between", value1, value2, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsImagesIsNull() {
            addCriterion("newsImages is null");
            return (Criteria) this;
        }

        public Criteria andNewsImagesIsNotNull() {
            addCriterion("newsImages is not null");
            return (Criteria) this;
        }

        public Criteria andNewsImagesEqualTo(String value) {
            addCriterion("newsImages =", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotEqualTo(String value) {
            addCriterion("newsImages <>", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesGreaterThan(String value) {
            addCriterion("newsImages >", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesGreaterThanOrEqualTo(String value) {
            addCriterion("newsImages >=", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesLessThan(String value) {
            addCriterion("newsImages <", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesLessThanOrEqualTo(String value) {
            addCriterion("newsImages <=", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesLike(String value) {
            addCriterion("newsImages like", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotLike(String value) {
            addCriterion("newsImages not like", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesIn(List<String> values) {
            addCriterion("newsImages in", values, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotIn(List<String> values) {
            addCriterion("newsImages not in", values, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesBetween(String value1, String value2) {
            addCriterion("newsImages between", value1, value2, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotBetween(String value1, String value2) {
            addCriterion("newsImages not between", value1, value2, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("newsDate is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("newsDate is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterionForJDBCDate("newsDate =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("newsDate <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("newsDate >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newsDate >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterionForJDBCDate("newsDate <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newsDate <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterionForJDBCDate("newsDate in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("newsDate not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newsDate between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newsDate not between", value1, value2, "newsDate");
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