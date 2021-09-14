package com.xh.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StudentExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("stuId is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuId is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuId =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuId <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuId >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuId >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuId <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuId <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuId in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuId not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuId between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuId not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentjobIsNull() {
            addCriterion("studentJob is null");
            return (Criteria) this;
        }

        public Criteria andStudentjobIsNotNull() {
            addCriterion("studentJob is not null");
            return (Criteria) this;
        }

        public Criteria andStudentjobEqualTo(Integer value) {
            addCriterion("studentJob =", value, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobNotEqualTo(Integer value) {
            addCriterion("studentJob <>", value, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobGreaterThan(Integer value) {
            addCriterion("studentJob >", value, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentJob >=", value, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobLessThan(Integer value) {
            addCriterion("studentJob <", value, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobLessThanOrEqualTo(Integer value) {
            addCriterion("studentJob <=", value, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobIn(List<Integer> values) {
            addCriterion("studentJob in", values, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobNotIn(List<Integer> values) {
            addCriterion("studentJob not in", values, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobBetween(Integer value1, Integer value2) {
            addCriterion("studentJob between", value1, value2, "studentjob");
            return (Criteria) this;
        }

        public Criteria andStudentjobNotBetween(Integer value1, Integer value2) {
            addCriterion("studentJob not between", value1, value2, "studentjob");
            return (Criteria) this;
        }

        public Criteria andClaidIsNull() {
            addCriterion("claId is null");
            return (Criteria) this;
        }

        public Criteria andClaidIsNotNull() {
            addCriterion("claId is not null");
            return (Criteria) this;
        }

        public Criteria andClaidEqualTo(Integer value) {
            addCriterion("claId =", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotEqualTo(Integer value) {
            addCriterion("claId <>", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidGreaterThan(Integer value) {
            addCriterion("claId >", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("claId >=", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidLessThan(Integer value) {
            addCriterion("claId <", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidLessThanOrEqualTo(Integer value) {
            addCriterion("claId <=", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidIn(List<Integer> values) {
            addCriterion("claId in", values, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotIn(List<Integer> values) {
            addCriterion("claId not in", values, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidBetween(Integer value1, Integer value2) {
            addCriterion("claId between", value1, value2, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotBetween(Integer value1, Integer value2) {
            addCriterion("claId not between", value1, value2, "claid");
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