package com.springmvc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GreendailyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GreendailyExample() {
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

        public Criteria andGreendailyinfoIdIsNull() {
            addCriterion("GreenDailyInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdIsNotNull() {
            addCriterion("GreenDailyInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdEqualTo(Integer value) {
            addCriterion("GreenDailyInfo_id =", value, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdNotEqualTo(Integer value) {
            addCriterion("GreenDailyInfo_id <>", value, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdGreaterThan(Integer value) {
            addCriterion("GreenDailyInfo_id >", value, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GreenDailyInfo_id >=", value, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdLessThan(Integer value) {
            addCriterion("GreenDailyInfo_id <", value, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("GreenDailyInfo_id <=", value, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdIn(List<Integer> values) {
            addCriterion("GreenDailyInfo_id in", values, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdNotIn(List<Integer> values) {
            addCriterion("GreenDailyInfo_id not in", values, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("GreenDailyInfo_id between", value1, value2, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GreenDailyInfo_id not between", value1, value2, "greendailyinfoId");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleIsNull() {
            addCriterion("GreenDailyInfo_title is null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleIsNotNull() {
            addCriterion("GreenDailyInfo_title is not null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleEqualTo(String value) {
            addCriterion("GreenDailyInfo_title =", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleNotEqualTo(String value) {
            addCriterion("GreenDailyInfo_title <>", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleGreaterThan(String value) {
            addCriterion("GreenDailyInfo_title >", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("GreenDailyInfo_title >=", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleLessThan(String value) {
            addCriterion("GreenDailyInfo_title <", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleLessThanOrEqualTo(String value) {
            addCriterion("GreenDailyInfo_title <=", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleLike(String value) {
            addCriterion("GreenDailyInfo_title like", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleNotLike(String value) {
            addCriterion("GreenDailyInfo_title not like", value, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleIn(List<String> values) {
            addCriterion("GreenDailyInfo_title in", values, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleNotIn(List<String> values) {
            addCriterion("GreenDailyInfo_title not in", values, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleBetween(String value1, String value2) {
            addCriterion("GreenDailyInfo_title between", value1, value2, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoTitleNotBetween(String value1, String value2) {
            addCriterion("GreenDailyInfo_title not between", value1, value2, "greendailyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorIsNull() {
            addCriterion("GreenDailyInfo_author is null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorIsNotNull() {
            addCriterion("GreenDailyInfo_author is not null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorEqualTo(String value) {
            addCriterion("GreenDailyInfo_author =", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorNotEqualTo(String value) {
            addCriterion("GreenDailyInfo_author <>", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorGreaterThan(String value) {
            addCriterion("GreenDailyInfo_author >", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("GreenDailyInfo_author >=", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorLessThan(String value) {
            addCriterion("GreenDailyInfo_author <", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorLessThanOrEqualTo(String value) {
            addCriterion("GreenDailyInfo_author <=", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorLike(String value) {
            addCriterion("GreenDailyInfo_author like", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorNotLike(String value) {
            addCriterion("GreenDailyInfo_author not like", value, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorIn(List<String> values) {
            addCriterion("GreenDailyInfo_author in", values, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorNotIn(List<String> values) {
            addCriterion("GreenDailyInfo_author not in", values, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorBetween(String value1, String value2) {
            addCriterion("GreenDailyInfo_author between", value1, value2, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoAuthorNotBetween(String value1, String value2) {
            addCriterion("GreenDailyInfo_author not between", value1, value2, "greendailyinfoAuthor");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeIsNull() {
            addCriterion("GreenDailyInfo_uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeIsNotNull() {
            addCriterion("GreenDailyInfo_uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeEqualTo(Date value) {
            addCriterion("GreenDailyInfo_uploadTime =", value, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeNotEqualTo(Date value) {
            addCriterion("GreenDailyInfo_uploadTime <>", value, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeGreaterThan(Date value) {
            addCriterion("GreenDailyInfo_uploadTime >", value, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GreenDailyInfo_uploadTime >=", value, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeLessThan(Date value) {
            addCriterion("GreenDailyInfo_uploadTime <", value, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("GreenDailyInfo_uploadTime <=", value, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeIn(List<Date> values) {
            addCriterion("GreenDailyInfo_uploadTime in", values, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeNotIn(List<Date> values) {
            addCriterion("GreenDailyInfo_uploadTime not in", values, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeBetween(Date value1, Date value2) {
            addCriterion("GreenDailyInfo_uploadTime between", value1, value2, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("GreenDailyInfo_uploadTime not between", value1, value2, "greendailyinfoUploadtime");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionIsNull() {
            addCriterion("GreenDailyInfo_description is null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionIsNotNull() {
            addCriterion("GreenDailyInfo_description is not null");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionEqualTo(String value) {
            addCriterion("GreenDailyInfo_description =", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionNotEqualTo(String value) {
            addCriterion("GreenDailyInfo_description <>", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionGreaterThan(String value) {
            addCriterion("GreenDailyInfo_description >", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("GreenDailyInfo_description >=", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionLessThan(String value) {
            addCriterion("GreenDailyInfo_description <", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("GreenDailyInfo_description <=", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionLike(String value) {
            addCriterion("GreenDailyInfo_description like", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionNotLike(String value) {
            addCriterion("GreenDailyInfo_description not like", value, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionIn(List<String> values) {
            addCriterion("GreenDailyInfo_description in", values, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionNotIn(List<String> values) {
            addCriterion("GreenDailyInfo_description not in", values, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionBetween(String value1, String value2) {
            addCriterion("GreenDailyInfo_description between", value1, value2, "greendailyinfoDescription");
            return (Criteria) this;
        }

        public Criteria andGreendailyinfoDescriptionNotBetween(String value1, String value2) {
            addCriterion("GreenDailyInfo_description not between", value1, value2, "greendailyinfoDescription");
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