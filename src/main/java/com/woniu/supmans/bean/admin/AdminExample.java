package com.woniu.supmans.bean.admin;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("adminID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminID not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminnumIsNull() {
            addCriterion("adminNum is null");
            return (Criteria) this;
        }

        public Criteria andAdminnumIsNotNull() {
            addCriterion("adminNum is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnumEqualTo(String value) {
            addCriterion("adminNum =", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumNotEqualTo(String value) {
            addCriterion("adminNum <>", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumGreaterThan(String value) {
            addCriterion("adminNum >", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumGreaterThanOrEqualTo(String value) {
            addCriterion("adminNum >=", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumLessThan(String value) {
            addCriterion("adminNum <", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumLessThanOrEqualTo(String value) {
            addCriterion("adminNum <=", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumLike(String value) {
            addCriterion("adminNum like", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumNotLike(String value) {
            addCriterion("adminNum not like", value, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumIn(List<String> values) {
            addCriterion("adminNum in", values, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumNotIn(List<String> values) {
            addCriterion("adminNum not in", values, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumBetween(String value1, String value2) {
            addCriterion("adminNum between", value1, value2, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminnumNotBetween(String value1, String value2) {
            addCriterion("adminNum not between", value1, value2, "adminnum");
            return (Criteria) this;
        }

        public Criteria andAdminpassIsNull() {
            addCriterion("adminPass is null");
            return (Criteria) this;
        }

        public Criteria andAdminpassIsNotNull() {
            addCriterion("adminPass is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpassEqualTo(String value) {
            addCriterion("adminPass =", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotEqualTo(String value) {
            addCriterion("adminPass <>", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassGreaterThan(String value) {
            addCriterion("adminPass >", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassGreaterThanOrEqualTo(String value) {
            addCriterion("adminPass >=", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLessThan(String value) {
            addCriterion("adminPass <", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLessThanOrEqualTo(String value) {
            addCriterion("adminPass <=", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLike(String value) {
            addCriterion("adminPass like", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotLike(String value) {
            addCriterion("adminPass not like", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassIn(List<String> values) {
            addCriterion("adminPass in", values, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotIn(List<String> values) {
            addCriterion("adminPass not in", values, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassBetween(String value1, String value2) {
            addCriterion("adminPass between", value1, value2, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotBetween(String value1, String value2) {
            addCriterion("adminPass not between", value1, value2, "adminpass");
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