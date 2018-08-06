package com.woniu.supmans.bean.staff;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andStockidIsNull() {
            addCriterion("stockID is null");
            return (Criteria) this;
        }

        public Criteria andStockidIsNotNull() {
            addCriterion("stockID is not null");
            return (Criteria) this;
        }

        public Criteria andStockidEqualTo(Integer value) {
            addCriterion("stockID =", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotEqualTo(Integer value) {
            addCriterion("stockID <>", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThan(Integer value) {
            addCriterion("stockID >", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockID >=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThan(Integer value) {
            addCriterion("stockID <", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThanOrEqualTo(Integer value) {
            addCriterion("stockID <=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidIn(List<Integer> values) {
            addCriterion("stockID in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotIn(List<Integer> values) {
            addCriterion("stockID not in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidBetween(Integer value1, Integer value2) {
            addCriterion("stockID between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotBetween(Integer value1, Integer value2) {
            addCriterion("stockID not between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockmidIsNull() {
            addCriterion("stockmID is null");
            return (Criteria) this;
        }

        public Criteria andStockmidIsNotNull() {
            addCriterion("stockmID is not null");
            return (Criteria) this;
        }

        public Criteria andStockmidEqualTo(Integer value) {
            addCriterion("stockmID =", value, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidNotEqualTo(Integer value) {
            addCriterion("stockmID <>", value, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidGreaterThan(Integer value) {
            addCriterion("stockmID >", value, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockmID >=", value, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidLessThan(Integer value) {
            addCriterion("stockmID <", value, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidLessThanOrEqualTo(Integer value) {
            addCriterion("stockmID <=", value, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidIn(List<Integer> values) {
            addCriterion("stockmID in", values, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidNotIn(List<Integer> values) {
            addCriterion("stockmID not in", values, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidBetween(Integer value1, Integer value2) {
            addCriterion("stockmID between", value1, value2, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStockmidNotBetween(Integer value1, Integer value2) {
            addCriterion("stockmID not between", value1, value2, "stockmid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidIsNull() {
            addCriterion("stocktypeID is null");
            return (Criteria) this;
        }

        public Criteria andStocktypeidIsNotNull() {
            addCriterion("stocktypeID is not null");
            return (Criteria) this;
        }

        public Criteria andStocktypeidEqualTo(Integer value) {
            addCriterion("stocktypeID =", value, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidNotEqualTo(Integer value) {
            addCriterion("stocktypeID <>", value, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidGreaterThan(Integer value) {
            addCriterion("stocktypeID >", value, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stocktypeID >=", value, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidLessThan(Integer value) {
            addCriterion("stocktypeID <", value, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidLessThanOrEqualTo(Integer value) {
            addCriterion("stocktypeID <=", value, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidIn(List<Integer> values) {
            addCriterion("stocktypeID in", values, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidNotIn(List<Integer> values) {
            addCriterion("stocktypeID not in", values, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidBetween(Integer value1, Integer value2) {
            addCriterion("stocktypeID between", value1, value2, "stocktypeid");
            return (Criteria) this;
        }

        public Criteria andStocktypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("stocktypeID not between", value1, value2, "stocktypeid");
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