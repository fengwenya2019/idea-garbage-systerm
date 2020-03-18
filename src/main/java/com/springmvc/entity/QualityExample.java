package com.springmvc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QualityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QualityExample() {
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

        public Criteria andQualityinfoIdIsNull() {
            addCriterion("QualityInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdIsNotNull() {
            addCriterion("QualityInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdEqualTo(Integer value) {
            addCriterion("QualityInfo_id =", value, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdNotEqualTo(Integer value) {
            addCriterion("QualityInfo_id <>", value, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdGreaterThan(Integer value) {
            addCriterion("QualityInfo_id >", value, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QualityInfo_id >=", value, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdLessThan(Integer value) {
            addCriterion("QualityInfo_id <", value, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("QualityInfo_id <=", value, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdIn(List<Integer> values) {
            addCriterion("QualityInfo_id in", values, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdNotIn(List<Integer> values) {
            addCriterion("QualityInfo_id not in", values, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("QualityInfo_id between", value1, value2, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QualityInfo_id not between", value1, value2, "qualityinfoId");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeIsNull() {
            addCriterion("QualityInfo_time is null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeIsNotNull() {
            addCriterion("QualityInfo_time is not null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeEqualTo(Date value) {
            addCriterion("QualityInfo_time =", value, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeNotEqualTo(Date value) {
            addCriterion("QualityInfo_time <>", value, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeGreaterThan(Date value) {
            addCriterion("QualityInfo_time >", value, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QualityInfo_time >=", value, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeLessThan(Date value) {
            addCriterion("QualityInfo_time <", value, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("QualityInfo_time <=", value, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeIn(List<Date> values) {
            addCriterion("QualityInfo_time in", values, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeNotIn(List<Date> values) {
            addCriterion("QualityInfo_time not in", values, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeBetween(Date value1, Date value2) {
            addCriterion("QualityInfo_time between", value1, value2, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("QualityInfo_time not between", value1, value2, "qualityinfoTime");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationIsNull() {
            addCriterion("QualityInfo_classification is null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationIsNotNull() {
            addCriterion("QualityInfo_classification is not null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationEqualTo(Integer value) {
            addCriterion("QualityInfo_classification =", value, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationNotEqualTo(Integer value) {
            addCriterion("QualityInfo_classification <>", value, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationGreaterThan(Integer value) {
            addCriterion("QualityInfo_classification >", value, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("QualityInfo_classification >=", value, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationLessThan(Integer value) {
            addCriterion("QualityInfo_classification <", value, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationLessThanOrEqualTo(Integer value) {
            addCriterion("QualityInfo_classification <=", value, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationIn(List<Integer> values) {
            addCriterion("QualityInfo_classification in", values, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationNotIn(List<Integer> values) {
            addCriterion("QualityInfo_classification not in", values, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationBetween(Integer value1, Integer value2) {
            addCriterion("QualityInfo_classification between", value1, value2, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoClassificationNotBetween(Integer value1, Integer value2) {
            addCriterion("QualityInfo_classification not between", value1, value2, "qualityinfoClassification");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightIsNull() {
            addCriterion("QualityInfo_weight is null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightIsNotNull() {
            addCriterion("QualityInfo_weight is not null");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightEqualTo(Double value) {
            addCriterion("QualityInfo_weight =", value, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightNotEqualTo(Double value) {
            addCriterion("QualityInfo_weight <>", value, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightGreaterThan(Double value) {
            addCriterion("QualityInfo_weight >", value, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("QualityInfo_weight >=", value, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightLessThan(Double value) {
            addCriterion("QualityInfo_weight <", value, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightLessThanOrEqualTo(Double value) {
            addCriterion("QualityInfo_weight <=", value, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightIn(List<Double> values) {
            addCriterion("QualityInfo_weight in", values, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightNotIn(List<Double> values) {
            addCriterion("QualityInfo_weight not in", values, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightBetween(Double value1, Double value2) {
            addCriterion("QualityInfo_weight between", value1, value2, "qualityinfoWeight");
            return (Criteria) this;
        }

        public Criteria andQualityinfoWeightNotBetween(Double value1, Double value2) {
            addCriterion("QualityInfo_weight not between", value1, value2, "qualityinfoWeight");
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