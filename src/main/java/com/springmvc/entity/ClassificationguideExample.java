package com.springmvc.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassificationguideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassificationguideExample() {
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

        public Criteria andClassificationguideinfoIdIsNull() {
            addCriterion("ClassificationGuideInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdIsNotNull() {
            addCriterion("ClassificationGuideInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_id =", value, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdNotEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_id <>", value, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdGreaterThan(Integer value) {
            addCriterion("ClassificationGuideInfo_id >", value, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_id >=", value, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdLessThan(Integer value) {
            addCriterion("ClassificationGuideInfo_id <", value, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_id <=", value, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdIn(List<Integer> values) {
            addCriterion("ClassificationGuideInfo_id in", values, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdNotIn(List<Integer> values) {
            addCriterion("ClassificationGuideInfo_id not in", values, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationGuideInfo_id between", value1, value2, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationGuideInfo_id not between", value1, value2, "classificationguideinfoId");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameIsNull() {
            addCriterion("ClassificationGuideInfo_name is null");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameIsNotNull() {
            addCriterion("ClassificationGuideInfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameEqualTo(String value) {
            addCriterion("ClassificationGuideInfo_name =", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameNotEqualTo(String value) {
            addCriterion("ClassificationGuideInfo_name <>", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameGreaterThan(String value) {
            addCriterion("ClassificationGuideInfo_name >", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassificationGuideInfo_name >=", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameLessThan(String value) {
            addCriterion("ClassificationGuideInfo_name <", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameLessThanOrEqualTo(String value) {
            addCriterion("ClassificationGuideInfo_name <=", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameLike(String value) {
            addCriterion("ClassificationGuideInfo_name like", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameNotLike(String value) {
            addCriterion("ClassificationGuideInfo_name not like", value, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameIn(List<String> values) {
            addCriterion("ClassificationGuideInfo_name in", values, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameNotIn(List<String> values) {
            addCriterion("ClassificationGuideInfo_name not in", values, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameBetween(String value1, String value2) {
            addCriterion("ClassificationGuideInfo_name between", value1, value2, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoNameNotBetween(String value1, String value2) {
            addCriterion("ClassificationGuideInfo_name not between", value1, value2, "classificationguideinfoName");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationIsNull() {
            addCriterion("ClassificationGuideInfo_classification is null");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationIsNotNull() {
            addCriterion("ClassificationGuideInfo_classification is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_classification =", value, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationNotEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_classification <>", value, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationGreaterThan(Integer value) {
            addCriterion("ClassificationGuideInfo_classification >", value, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_classification >=", value, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationLessThan(Integer value) {
            addCriterion("ClassificationGuideInfo_classification <", value, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationLessThanOrEqualTo(Integer value) {
            addCriterion("ClassificationGuideInfo_classification <=", value, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationIn(List<Integer> values) {
            addCriterion("ClassificationGuideInfo_classification in", values, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationNotIn(List<Integer> values) {
            addCriterion("ClassificationGuideInfo_classification not in", values, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationGuideInfo_classification between", value1, value2, "classificationguideinfoClassification");
            return (Criteria) this;
        }

        public Criteria andClassificationguideinfoClassificationNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassificationGuideInfo_classification not between", value1, value2, "classificationguideinfoClassification");
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