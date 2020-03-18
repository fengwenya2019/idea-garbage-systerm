package com.springmvc.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassificationExample() {
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

        public Criteria andClassificationinfoIdIsNull() {
            addCriterion("ClassificationInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdIsNotNull() {
            addCriterion("ClassificationInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdEqualTo(Integer value) {
            addCriterion("ClassificationInfo_id =", value, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdNotEqualTo(Integer value) {
            addCriterion("ClassificationInfo_id <>", value, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdGreaterThan(Integer value) {
            addCriterion("ClassificationInfo_id >", value, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassificationInfo_id >=", value, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdLessThan(Integer value) {
            addCriterion("ClassificationInfo_id <", value, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ClassificationInfo_id <=", value, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdIn(List<Integer> values) {
            addCriterion("ClassificationInfo_id in", values, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdNotIn(List<Integer> values) {
            addCriterion("ClassificationInfo_id not in", values, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationInfo_id between", value1, value2, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationInfo_id not between", value1, value2, "classificationinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeIsNull() {
            addCriterion("ClassificationInfo_code is null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeIsNotNull() {
            addCriterion("ClassificationInfo_code is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeEqualTo(Integer value) {
            addCriterion("ClassificationInfo_code =", value, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeNotEqualTo(Integer value) {
            addCriterion("ClassificationInfo_code <>", value, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeGreaterThan(Integer value) {
            addCriterion("ClassificationInfo_code >", value, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassificationInfo_code >=", value, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeLessThan(Integer value) {
            addCriterion("ClassificationInfo_code <", value, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeLessThanOrEqualTo(Integer value) {
            addCriterion("ClassificationInfo_code <=", value, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeIn(List<Integer> values) {
            addCriterion("ClassificationInfo_code in", values, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeNotIn(List<Integer> values) {
            addCriterion("ClassificationInfo_code not in", values, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationInfo_code between", value1, value2, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationInfo_code not between", value1, value2, "classificationinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameIsNull() {
            addCriterion("ClassificationInfo_name is null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameIsNotNull() {
            addCriterion("ClassificationInfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameEqualTo(String value) {
            addCriterion("ClassificationInfo_name =", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameNotEqualTo(String value) {
            addCriterion("ClassificationInfo_name <>", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameGreaterThan(String value) {
            addCriterion("ClassificationInfo_name >", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassificationInfo_name >=", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameLessThan(String value) {
            addCriterion("ClassificationInfo_name <", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameLessThanOrEqualTo(String value) {
            addCriterion("ClassificationInfo_name <=", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameLike(String value) {
            addCriterion("ClassificationInfo_name like", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameNotLike(String value) {
            addCriterion("ClassificationInfo_name not like", value, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameIn(List<String> values) {
            addCriterion("ClassificationInfo_name in", values, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameNotIn(List<String> values) {
            addCriterion("ClassificationInfo_name not in", values, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameBetween(String value1, String value2) {
            addCriterion("ClassificationInfo_name between", value1, value2, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoNameNotBetween(String value1, String value2) {
            addCriterion("ClassificationInfo_name not between", value1, value2, "classificationinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionIsNull() {
            addCriterion("ClassificationInfo_description is null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionIsNotNull() {
            addCriterion("ClassificationInfo_description is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionEqualTo(String value) {
            addCriterion("ClassificationInfo_description =", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionNotEqualTo(String value) {
            addCriterion("ClassificationInfo_description <>", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionGreaterThan(String value) {
            addCriterion("ClassificationInfo_description >", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ClassificationInfo_description >=", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionLessThan(String value) {
            addCriterion("ClassificationInfo_description <", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ClassificationInfo_description <=", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionLike(String value) {
            addCriterion("ClassificationInfo_description like", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionNotLike(String value) {
            addCriterion("ClassificationInfo_description not like", value, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionIn(List<String> values) {
            addCriterion("ClassificationInfo_description in", values, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionNotIn(List<String> values) {
            addCriterion("ClassificationInfo_description not in", values, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionBetween(String value1, String value2) {
            addCriterion("ClassificationInfo_description between", value1, value2, "classificationinfoDescription");
            return (Criteria) this;
        }

        public Criteria andClassificationinfoDescriptionNotBetween(String value1, String value2) {
            addCriterion("ClassificationInfo_description not between", value1, value2, "classificationinfoDescription");
            return (Criteria) this;
        }
    }

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