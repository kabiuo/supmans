package com.woniu.supmans.bean.staff;

import java.util.ArrayList;
import java.util.List;

public class SoldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoldExample() {
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

        public Criteria andSoldidIsNull() {
            addCriterion("soldID is null");
            return (Criteria) this;
        }

        public Criteria andSoldidIsNotNull() {
            addCriterion("soldID is not null");
            return (Criteria) this;
        }

        public Criteria andSoldidEqualTo(Integer value) {
            addCriterion("soldID =", value, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidNotEqualTo(Integer value) {
            addCriterion("soldID <>", value, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidGreaterThan(Integer value) {
            addCriterion("soldID >", value, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("soldID >=", value, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidLessThan(Integer value) {
            addCriterion("soldID <", value, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidLessThanOrEqualTo(Integer value) {
            addCriterion("soldID <=", value, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidIn(List<Integer> values) {
            addCriterion("soldID in", values, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidNotIn(List<Integer> values) {
            addCriterion("soldID not in", values, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidBetween(Integer value1, Integer value2) {
            addCriterion("soldID between", value1, value2, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldidNotBetween(Integer value1, Integer value2) {
            addCriterion("soldID not between", value1, value2, "soldid");
            return (Criteria) this;
        }

        public Criteria andSoldnidIsNull() {
            addCriterion("soldnID is null");
            return (Criteria) this;
        }

        public Criteria andSoldnidIsNotNull() {
            addCriterion("soldnID is not null");
            return (Criteria) this;
        }

        public Criteria andSoldnidEqualTo(Integer value) {
            addCriterion("soldnID =", value, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidNotEqualTo(Integer value) {
            addCriterion("soldnID <>", value, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidGreaterThan(Integer value) {
            addCriterion("soldnID >", value, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("soldnID >=", value, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidLessThan(Integer value) {
            addCriterion("soldnID <", value, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidLessThanOrEqualTo(Integer value) {
            addCriterion("soldnID <=", value, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidIn(List<Integer> values) {
            addCriterion("soldnID in", values, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidNotIn(List<Integer> values) {
            addCriterion("soldnID not in", values, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidBetween(Integer value1, Integer value2) {
            addCriterion("soldnID between", value1, value2, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnidNotBetween(Integer value1, Integer value2) {
            addCriterion("soldnID not between", value1, value2, "soldnid");
            return (Criteria) this;
        }

        public Criteria andSoldnumberIsNull() {
            addCriterion("soldnumber is null");
            return (Criteria) this;
        }

        public Criteria andSoldnumberIsNotNull() {
            addCriterion("soldnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSoldnumberEqualTo(String value) {
            addCriterion("soldnumber =", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberNotEqualTo(String value) {
            addCriterion("soldnumber <>", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberGreaterThan(String value) {
            addCriterion("soldnumber >", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberGreaterThanOrEqualTo(String value) {
            addCriterion("soldnumber >=", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberLessThan(String value) {
            addCriterion("soldnumber <", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberLessThanOrEqualTo(String value) {
            addCriterion("soldnumber <=", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberLike(String value) {
            addCriterion("soldnumber like", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberNotLike(String value) {
            addCriterion("soldnumber not like", value, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberIn(List<String> values) {
            addCriterion("soldnumber in", values, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberNotIn(List<String> values) {
            addCriterion("soldnumber not in", values, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberBetween(String value1, String value2) {
            addCriterion("soldnumber between", value1, value2, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldnumberNotBetween(String value1, String value2) {
            addCriterion("soldnumber not between", value1, value2, "soldnumber");
            return (Criteria) this;
        }

        public Criteria andSoldpriceIsNull() {
            addCriterion("soldprice is null");
            return (Criteria) this;
        }

        public Criteria andSoldpriceIsNotNull() {
            addCriterion("soldprice is not null");
            return (Criteria) this;
        }

        public Criteria andSoldpriceEqualTo(String value) {
            addCriterion("soldprice =", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceNotEqualTo(String value) {
            addCriterion("soldprice <>", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceGreaterThan(String value) {
            addCriterion("soldprice >", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceGreaterThanOrEqualTo(String value) {
            addCriterion("soldprice >=", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceLessThan(String value) {
            addCriterion("soldprice <", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceLessThanOrEqualTo(String value) {
            addCriterion("soldprice <=", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceLike(String value) {
            addCriterion("soldprice like", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceNotLike(String value) {
            addCriterion("soldprice not like", value, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceIn(List<String> values) {
            addCriterion("soldprice in", values, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceNotIn(List<String> values) {
            addCriterion("soldprice not in", values, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceBetween(String value1, String value2) {
            addCriterion("soldprice between", value1, value2, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldpriceNotBetween(String value1, String value2) {
            addCriterion("soldprice not between", value1, value2, "soldprice");
            return (Criteria) this;
        }

        public Criteria andSoldtidIsNull() {
            addCriterion("soldtID is null");
            return (Criteria) this;
        }

        public Criteria andSoldtidIsNotNull() {
            addCriterion("soldtID is not null");
            return (Criteria) this;
        }

        public Criteria andSoldtidEqualTo(Integer value) {
            addCriterion("soldtID =", value, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidNotEqualTo(Integer value) {
            addCriterion("soldtID <>", value, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidGreaterThan(Integer value) {
            addCriterion("soldtID >", value, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("soldtID >=", value, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidLessThan(Integer value) {
            addCriterion("soldtID <", value, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidLessThanOrEqualTo(Integer value) {
            addCriterion("soldtID <=", value, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidIn(List<Integer> values) {
            addCriterion("soldtID in", values, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidNotIn(List<Integer> values) {
            addCriterion("soldtID not in", values, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidBetween(Integer value1, Integer value2) {
            addCriterion("soldtID between", value1, value2, "soldtid");
            return (Criteria) this;
        }

        public Criteria andSoldtidNotBetween(Integer value1, Integer value2) {
            addCriterion("soldtID not between", value1, value2, "soldtid");
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