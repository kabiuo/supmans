package com.woniu.supmans.bean.staff;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffID is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffID =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffID <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffID >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffID >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffID <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffID <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffID in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffID not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffID between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffID not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffnumberIsNull() {
            addCriterion("staffnumber is null");
            return (Criteria) this;
        }

        public Criteria andStaffnumberIsNotNull() {
            addCriterion("staffnumber is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnumberEqualTo(String value) {
            addCriterion("staffnumber =", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberNotEqualTo(String value) {
            addCriterion("staffnumber <>", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberGreaterThan(String value) {
            addCriterion("staffnumber >", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberGreaterThanOrEqualTo(String value) {
            addCriterion("staffnumber >=", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberLessThan(String value) {
            addCriterion("staffnumber <", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberLessThanOrEqualTo(String value) {
            addCriterion("staffnumber <=", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberLike(String value) {
            addCriterion("staffnumber like", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberNotLike(String value) {
            addCriterion("staffnumber not like", value, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberIn(List<String> values) {
            addCriterion("staffnumber in", values, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberNotIn(List<String> values) {
            addCriterion("staffnumber not in", values, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberBetween(String value1, String value2) {
            addCriterion("staffnumber between", value1, value2, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffnumberNotBetween(String value1, String value2) {
            addCriterion("staffnumber not between", value1, value2, "staffnumber");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIsNull() {
            addCriterion("staffpassword is null");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIsNotNull() {
            addCriterion("staffpassword is not null");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordEqualTo(String value) {
            addCriterion("staffpassword =", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotEqualTo(String value) {
            addCriterion("staffpassword <>", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordGreaterThan(String value) {
            addCriterion("staffpassword >", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("staffpassword >=", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLessThan(String value) {
            addCriterion("staffpassword <", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLessThanOrEqualTo(String value) {
            addCriterion("staffpassword <=", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLike(String value) {
            addCriterion("staffpassword like", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotLike(String value) {
            addCriterion("staffpassword not like", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIn(List<String> values) {
            addCriterion("staffpassword in", values, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotIn(List<String> values) {
            addCriterion("staffpassword not in", values, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordBetween(String value1, String value2) {
            addCriterion("staffpassword between", value1, value2, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotBetween(String value1, String value2) {
            addCriterion("staffpassword not between", value1, value2, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("staffname is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffname is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffname =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffname <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffname >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffname >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffname <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffname <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffname like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffname not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffname in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffname not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffname between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffname not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNull() {
            addCriterion("staffsex is null");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNotNull() {
            addCriterion("staffsex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsexEqualTo(String value) {
            addCriterion("staffsex =", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotEqualTo(String value) {
            addCriterion("staffsex <>", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThan(String value) {
            addCriterion("staffsex >", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThanOrEqualTo(String value) {
            addCriterion("staffsex >=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThan(String value) {
            addCriterion("staffsex <", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThanOrEqualTo(String value) {
            addCriterion("staffsex <=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLike(String value) {
            addCriterion("staffsex like", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotLike(String value) {
            addCriterion("staffsex not like", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexIn(List<String> values) {
            addCriterion("staffsex in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotIn(List<String> values) {
            addCriterion("staffsex not in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexBetween(String value1, String value2) {
            addCriterion("staffsex between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotBetween(String value1, String value2) {
            addCriterion("staffsex not between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffcontactIsNull() {
            addCriterion("staffcontact is null");
            return (Criteria) this;
        }

        public Criteria andStaffcontactIsNotNull() {
            addCriterion("staffcontact is not null");
            return (Criteria) this;
        }

        public Criteria andStaffcontactEqualTo(String value) {
            addCriterion("staffcontact =", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactNotEqualTo(String value) {
            addCriterion("staffcontact <>", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactGreaterThan(String value) {
            addCriterion("staffcontact >", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactGreaterThanOrEqualTo(String value) {
            addCriterion("staffcontact >=", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactLessThan(String value) {
            addCriterion("staffcontact <", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactLessThanOrEqualTo(String value) {
            addCriterion("staffcontact <=", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactLike(String value) {
            addCriterion("staffcontact like", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactNotLike(String value) {
            addCriterion("staffcontact not like", value, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactIn(List<String> values) {
            addCriterion("staffcontact in", values, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactNotIn(List<String> values) {
            addCriterion("staffcontact not in", values, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactBetween(String value1, String value2) {
            addCriterion("staffcontact between", value1, value2, "staffcontact");
            return (Criteria) this;
        }

        public Criteria andStaffcontactNotBetween(String value1, String value2) {
            addCriterion("staffcontact not between", value1, value2, "staffcontact");
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