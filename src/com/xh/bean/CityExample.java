package com.xh.bean;

import java.util.ArrayList;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CityExample() {
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

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
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

        public Criteria andcityIdIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andcityIdIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andcityIdEqualTo(Integer value) {
            addCriterion("cityId =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdNotEqualTo(Integer value) {
            addCriterion("cityId <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdGreaterThan(Integer value) {
            addCriterion("cityId >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityId >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdLessThan(Integer value) {
            addCriterion("cityId <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdLessThanOrEqualTo(Integer value) {
            addCriterion("cityId <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdIn(List<Integer> values) {
            addCriterion("cityId in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdNotIn(List<Integer> values) {
            addCriterion("cityId not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdBetween(Integer value1, Integer value2) {
            addCriterion("cityId between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cityId not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andcityNameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andcityNameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andcityNameEqualTo(String value) {
            addCriterion("cityName =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameLessThan(String value) {
            addCriterion("cityName <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameLike(String value) {
            addCriterion("cityName like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameNotLike(String value) {
            addCriterion("cityName not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameIn(List<String> values) {
            addCriterion("cityName in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andcityNameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityName");
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