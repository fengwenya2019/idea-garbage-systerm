package com.springmvc.entity;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUserinfoIdIsNull() {
            addCriterion("UserInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("UserInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Integer value) {
            addCriterion("UserInfo_id =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Integer value) {
            addCriterion("UserInfo_id <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Integer value) {
            addCriterion("UserInfo_id >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserInfo_id >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Integer value) {
            addCriterion("UserInfo_id <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("UserInfo_id <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Integer> values) {
            addCriterion("UserInfo_id in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Integer> values) {
            addCriterion("UserInfo_id not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("UserInfo_id between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UserInfo_id not between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIsNull() {
            addCriterion("UserInfo_name is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIsNotNull() {
            addCriterion("UserInfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameEqualTo(String value) {
            addCriterion("UserInfo_name =", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotEqualTo(String value) {
            addCriterion("UserInfo_name <>", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameGreaterThan(String value) {
            addCriterion("UserInfo_name >", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserInfo_name >=", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLessThan(String value) {
            addCriterion("UserInfo_name <", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLessThanOrEqualTo(String value) {
            addCriterion("UserInfo_name <=", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLike(String value) {
            addCriterion("UserInfo_name like", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotLike(String value) {
            addCriterion("UserInfo_name not like", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIn(List<String> values) {
            addCriterion("UserInfo_name in", values, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotIn(List<String> values) {
            addCriterion("UserInfo_name not in", values, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameBetween(String value1, String value2) {
            addCriterion("UserInfo_name between", value1, value2, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotBetween(String value1, String value2) {
            addCriterion("UserInfo_name not between", value1, value2, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameIsNull() {
            addCriterion("UserInfo_userName is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameIsNotNull() {
            addCriterion("UserInfo_userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameEqualTo(String value) {
            addCriterion("UserInfo_userName =", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameNotEqualTo(String value) {
            addCriterion("UserInfo_userName <>", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameGreaterThan(String value) {
            addCriterion("UserInfo_userName >", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserInfo_userName >=", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameLessThan(String value) {
            addCriterion("UserInfo_userName <", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserInfo_userName <=", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameLike(String value) {
            addCriterion("UserInfo_userName like", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameNotLike(String value) {
            addCriterion("UserInfo_userName not like", value, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameIn(List<String> values) {
            addCriterion("UserInfo_userName in", values, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameNotIn(List<String> values) {
            addCriterion("UserInfo_userName not in", values, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameBetween(String value1, String value2) {
            addCriterion("UserInfo_userName between", value1, value2, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoUsernameNotBetween(String value1, String value2) {
            addCriterion("UserInfo_userName not between", value1, value2, "userinfoUsername");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIsNull() {
            addCriterion("UserInfo_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIsNotNull() {
            addCriterion("UserInfo_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneEqualTo(String value) {
            addCriterion("UserInfo_phone =", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotEqualTo(String value) {
            addCriterion("UserInfo_phone <>", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneGreaterThan(String value) {
            addCriterion("UserInfo_phone >", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("UserInfo_phone >=", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLessThan(String value) {
            addCriterion("UserInfo_phone <", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLessThanOrEqualTo(String value) {
            addCriterion("UserInfo_phone <=", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLike(String value) {
            addCriterion("UserInfo_phone like", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotLike(String value) {
            addCriterion("UserInfo_phone not like", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIn(List<String> values) {
            addCriterion("UserInfo_phone in", values, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotIn(List<String> values) {
            addCriterion("UserInfo_phone not in", values, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneBetween(String value1, String value2) {
            addCriterion("UserInfo_phone between", value1, value2, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotBetween(String value1, String value2) {
            addCriterion("UserInfo_phone not between", value1, value2, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordIsNull() {
            addCriterion("UserInfo_password is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordIsNotNull() {
            addCriterion("UserInfo_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordEqualTo(String value) {
            addCriterion("UserInfo_password =", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordNotEqualTo(String value) {
            addCriterion("UserInfo_password <>", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordGreaterThan(String value) {
            addCriterion("UserInfo_password >", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("UserInfo_password >=", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordLessThan(String value) {
            addCriterion("UserInfo_password <", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordLessThanOrEqualTo(String value) {
            addCriterion("UserInfo_password <=", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordLike(String value) {
            addCriterion("UserInfo_password like", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordNotLike(String value) {
            addCriterion("UserInfo_password not like", value, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordIn(List<String> values) {
            addCriterion("UserInfo_password in", values, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordNotIn(List<String> values) {
            addCriterion("UserInfo_password not in", values, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordBetween(String value1, String value2) {
            addCriterion("UserInfo_password between", value1, value2, "userinfoPassword");
            return (Criteria) this;
        }

        public Criteria andUserinfoPasswordNotBetween(String value1, String value2) {
            addCriterion("UserInfo_password not between", value1, value2, "userinfoPassword");
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