package com.springmvc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteExample() {
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

        public Criteria andSiteinfoIdIsNull() {
            addCriterion("SiteInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdIsNotNull() {
            addCriterion("SiteInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdEqualTo(Integer value) {
            addCriterion("SiteInfo_id =", value, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdNotEqualTo(Integer value) {
            addCriterion("SiteInfo_id <>", value, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdGreaterThan(Integer value) {
            addCriterion("SiteInfo_id >", value, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_id >=", value, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdLessThan(Integer value) {
            addCriterion("SiteInfo_id <", value, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_id <=", value, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdIn(List<Integer> values) {
            addCriterion("SiteInfo_id in", values, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdNotIn(List<Integer> values) {
            addCriterion("SiteInfo_id not in", values, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_id between", value1, value2, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_id not between", value1, value2, "siteinfoId");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteIsNull() {
            addCriterion("SiteInfo_site is null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteIsNotNull() {
            addCriterion("SiteInfo_site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteEqualTo(Integer value) {
            addCriterion("SiteInfo_site =", value, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteNotEqualTo(Integer value) {
            addCriterion("SiteInfo_site <>", value, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteGreaterThan(Integer value) {
            addCriterion("SiteInfo_site >", value, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_site >=", value, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteLessThan(Integer value) {
            addCriterion("SiteInfo_site <", value, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteLessThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_site <=", value, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteIn(List<Integer> values) {
            addCriterion("SiteInfo_site in", values, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteNotIn(List<Integer> values) {
            addCriterion("SiteInfo_site not in", values, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_site between", value1, value2, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoSiteNotBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_site not between", value1, value2, "siteinfoSite");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationIsNull() {
            addCriterion("SiteInfo_location is null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationIsNotNull() {
            addCriterion("SiteInfo_location is not null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationEqualTo(String value) {
            addCriterion("SiteInfo_location =", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationNotEqualTo(String value) {
            addCriterion("SiteInfo_location <>", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationGreaterThan(String value) {
            addCriterion("SiteInfo_location >", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationGreaterThanOrEqualTo(String value) {
            addCriterion("SiteInfo_location >=", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationLessThan(String value) {
            addCriterion("SiteInfo_location <", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationLessThanOrEqualTo(String value) {
            addCriterion("SiteInfo_location <=", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationLike(String value) {
            addCriterion("SiteInfo_location like", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationNotLike(String value) {
            addCriterion("SiteInfo_location not like", value, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationIn(List<String> values) {
            addCriterion("SiteInfo_location in", values, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationNotIn(List<String> values) {
            addCriterion("SiteInfo_location not in", values, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationBetween(String value1, String value2) {
            addCriterion("SiteInfo_location between", value1, value2, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLocationNotBetween(String value1, String value2) {
            addCriterion("SiteInfo_location not between", value1, value2, "siteinfoLocation");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationIsNull() {
            addCriterion("SiteInfo_classification is null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationIsNotNull() {
            addCriterion("SiteInfo_classification is not null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationEqualTo(Integer value) {
            addCriterion("SiteInfo_classification =", value, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationNotEqualTo(Integer value) {
            addCriterion("SiteInfo_classification <>", value, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationGreaterThan(Integer value) {
            addCriterion("SiteInfo_classification >", value, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_classification >=", value, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationLessThan(Integer value) {
            addCriterion("SiteInfo_classification <", value, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationLessThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_classification <=", value, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationIn(List<Integer> values) {
            addCriterion("SiteInfo_classification in", values, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationNotIn(List<Integer> values) {
            addCriterion("SiteInfo_classification not in", values, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_classification between", value1, value2, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoClassificationNotBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_classification not between", value1, value2, "siteinfoClassification");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashIsNull() {
            addCriterion("SiteInfo_countOfTrash is null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashIsNotNull() {
            addCriterion("SiteInfo_countOfTrash is not null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashEqualTo(Integer value) {
            addCriterion("SiteInfo_countOfTrash =", value, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashNotEqualTo(Integer value) {
            addCriterion("SiteInfo_countOfTrash <>", value, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashGreaterThan(Integer value) {
            addCriterion("SiteInfo_countOfTrash >", value, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashGreaterThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_countOfTrash >=", value, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashLessThan(Integer value) {
            addCriterion("SiteInfo_countOfTrash <", value, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashLessThanOrEqualTo(Integer value) {
            addCriterion("SiteInfo_countOfTrash <=", value, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashIn(List<Integer> values) {
            addCriterion("SiteInfo_countOfTrash in", values, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashNotIn(List<Integer> values) {
            addCriterion("SiteInfo_countOfTrash not in", values, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_countOfTrash between", value1, value2, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoCountoftrashNotBetween(Integer value1, Integer value2) {
            addCriterion("SiteInfo_countOfTrash not between", value1, value2, "siteinfoCountoftrash");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeIsNull() {
            addCriterion("SiteInfo_openTime is null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeIsNotNull() {
            addCriterion("SiteInfo_openTime is not null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeEqualTo(Date value) {
            addCriterion("SiteInfo_openTime =", value, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeNotEqualTo(Date value) {
            addCriterion("SiteInfo_openTime <>", value, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeGreaterThan(Date value) {
            addCriterion("SiteInfo_openTime >", value, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SiteInfo_openTime >=", value, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeLessThan(Date value) {
            addCriterion("SiteInfo_openTime <", value, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("SiteInfo_openTime <=", value, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeIn(List<Date> values) {
            addCriterion("SiteInfo_openTime in", values, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeNotIn(List<Date> values) {
            addCriterion("SiteInfo_openTime not in", values, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeBetween(Date value1, Date value2) {
            addCriterion("SiteInfo_openTime between", value1, value2, "siteinfoOpentime");
            return (Criteria) this;
        }

        public Criteria andSiteinfoOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("SiteInfo_openTime not between", value1, value2, "siteinfoOpentime");
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