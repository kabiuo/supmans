package com.woniu.supmans.bean.staff;

import java.util.ArrayList;
import java.util.List;

public class MerchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchExample() {
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

        public Criteria andMerchidIsNull() {
            addCriterion("merchID is null");
            return (Criteria) this;
        }

        public Criteria andMerchidIsNotNull() {
            addCriterion("merchID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchidEqualTo(Integer value) {
            addCriterion("merchID =", value, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidNotEqualTo(Integer value) {
            addCriterion("merchID <>", value, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidGreaterThan(Integer value) {
            addCriterion("merchID >", value, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchID >=", value, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidLessThan(Integer value) {
            addCriterion("merchID <", value, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidLessThanOrEqualTo(Integer value) {
            addCriterion("merchID <=", value, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidIn(List<Integer> values) {
            addCriterion("merchID in", values, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidNotIn(List<Integer> values) {
            addCriterion("merchID not in", values, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidBetween(Integer value1, Integer value2) {
            addCriterion("merchID between", value1, value2, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchidNotBetween(Integer value1, Integer value2) {
            addCriterion("merchID not between", value1, value2, "merchid");
            return (Criteria) this;
        }

        public Criteria andMerchnameIsNull() {
            addCriterion("merchname is null");
            return (Criteria) this;
        }

        public Criteria andMerchnameIsNotNull() {
            addCriterion("merchname is not null");
            return (Criteria) this;
        }

        public Criteria andMerchnameEqualTo(String value) {
            addCriterion("merchname =", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameNotEqualTo(String value) {
            addCriterion("merchname <>", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameGreaterThan(String value) {
            addCriterion("merchname >", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameGreaterThanOrEqualTo(String value) {
            addCriterion("merchname >=", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameLessThan(String value) {
            addCriterion("merchname <", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameLessThanOrEqualTo(String value) {
            addCriterion("merchname <=", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameLike(String value) {
            addCriterion("merchname like", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameNotLike(String value) {
            addCriterion("merchname not like", value, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameIn(List<String> values) {
            addCriterion("merchname in", values, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameNotIn(List<String> values) {
            addCriterion("merchname not in", values, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameBetween(String value1, String value2) {
            addCriterion("merchname between", value1, value2, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchnameNotBetween(String value1, String value2) {
            addCriterion("merchname not between", value1, value2, "merchname");
            return (Criteria) this;
        }

        public Criteria andMerchaddressIsNull() {
            addCriterion("merchaddress is null");
            return (Criteria) this;
        }

        public Criteria andMerchaddressIsNotNull() {
            addCriterion("merchaddress is not null");
            return (Criteria) this;
        }

        public Criteria andMerchaddressEqualTo(String value) {
            addCriterion("merchaddress =", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressNotEqualTo(String value) {
            addCriterion("merchaddress <>", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressGreaterThan(String value) {
            addCriterion("merchaddress >", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressGreaterThanOrEqualTo(String value) {
            addCriterion("merchaddress >=", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressLessThan(String value) {
            addCriterion("merchaddress <", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressLessThanOrEqualTo(String value) {
            addCriterion("merchaddress <=", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressLike(String value) {
            addCriterion("merchaddress like", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressNotLike(String value) {
            addCriterion("merchaddress not like", value, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressIn(List<String> values) {
            addCriterion("merchaddress in", values, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressNotIn(List<String> values) {
            addCriterion("merchaddress not in", values, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressBetween(String value1, String value2) {
            addCriterion("merchaddress between", value1, value2, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchaddressNotBetween(String value1, String value2) {
            addCriterion("merchaddress not between", value1, value2, "merchaddress");
            return (Criteria) this;
        }

        public Criteria andMerchpdIsNull() {
            addCriterion("merchPD is null");
            return (Criteria) this;
        }

        public Criteria andMerchpdIsNotNull() {
            addCriterion("merchPD is not null");
            return (Criteria) this;
        }

        public Criteria andMerchpdEqualTo(String value) {
            addCriterion("merchPD =", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdNotEqualTo(String value) {
            addCriterion("merchPD <>", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdGreaterThan(String value) {
            addCriterion("merchPD >", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdGreaterThanOrEqualTo(String value) {
            addCriterion("merchPD >=", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdLessThan(String value) {
            addCriterion("merchPD <", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdLessThanOrEqualTo(String value) {
            addCriterion("merchPD <=", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdLike(String value) {
            addCriterion("merchPD like", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdNotLike(String value) {
            addCriterion("merchPD not like", value, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdIn(List<String> values) {
            addCriterion("merchPD in", values, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdNotIn(List<String> values) {
            addCriterion("merchPD not in", values, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdBetween(String value1, String value2) {
            addCriterion("merchPD between", value1, value2, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchpdNotBetween(String value1, String value2) {
            addCriterion("merchPD not between", value1, value2, "merchpd");
            return (Criteria) this;
        }

        public Criteria andMerchgpIsNull() {
            addCriterion("merchGP is null");
            return (Criteria) this;
        }

        public Criteria andMerchgpIsNotNull() {
            addCriterion("merchGP is not null");
            return (Criteria) this;
        }

        public Criteria andMerchgpEqualTo(String value) {
            addCriterion("merchGP =", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpNotEqualTo(String value) {
            addCriterion("merchGP <>", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpGreaterThan(String value) {
            addCriterion("merchGP >", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpGreaterThanOrEqualTo(String value) {
            addCriterion("merchGP >=", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpLessThan(String value) {
            addCriterion("merchGP <", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpLessThanOrEqualTo(String value) {
            addCriterion("merchGP <=", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpLike(String value) {
            addCriterion("merchGP like", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpNotLike(String value) {
            addCriterion("merchGP not like", value, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpIn(List<String> values) {
            addCriterion("merchGP in", values, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpNotIn(List<String> values) {
            addCriterion("merchGP not in", values, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpBetween(String value1, String value2) {
            addCriterion("merchGP between", value1, value2, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchgpNotBetween(String value1, String value2) {
            addCriterion("merchGP not between", value1, value2, "merchgp");
            return (Criteria) this;
        }

        public Criteria andMerchpriceIsNull() {
            addCriterion("merchprice is null");
            return (Criteria) this;
        }

        public Criteria andMerchpriceIsNotNull() {
            addCriterion("merchprice is not null");
            return (Criteria) this;
        }

        public Criteria andMerchpriceEqualTo(String value) {
            addCriterion("merchprice =", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceNotEqualTo(String value) {
            addCriterion("merchprice <>", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceGreaterThan(String value) {
            addCriterion("merchprice >", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceGreaterThanOrEqualTo(String value) {
            addCriterion("merchprice >=", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceLessThan(String value) {
            addCriterion("merchprice <", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceLessThanOrEqualTo(String value) {
            addCriterion("merchprice <=", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceLike(String value) {
            addCriterion("merchprice like", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceNotLike(String value) {
            addCriterion("merchprice not like", value, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceIn(List<String> values) {
            addCriterion("merchprice in", values, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceNotIn(List<String> values) {
            addCriterion("merchprice not in", values, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceBetween(String value1, String value2) {
            addCriterion("merchprice between", value1, value2, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchpriceNotBetween(String value1, String value2) {
            addCriterion("merchprice not between", value1, value2, "merchprice");
            return (Criteria) this;
        }

        public Criteria andMerchtypeIsNull() {
            addCriterion("merchtype is null");
            return (Criteria) this;
        }

        public Criteria andMerchtypeIsNotNull() {
            addCriterion("merchtype is not null");
            return (Criteria) this;
        }

        public Criteria andMerchtypeEqualTo(Integer value) {
            addCriterion("merchtype =", value, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeNotEqualTo(Integer value) {
            addCriterion("merchtype <>", value, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeGreaterThan(Integer value) {
            addCriterion("merchtype >", value, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchtype >=", value, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeLessThan(Integer value) {
            addCriterion("merchtype <", value, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeLessThanOrEqualTo(Integer value) {
            addCriterion("merchtype <=", value, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeIn(List<Integer> values) {
            addCriterion("merchtype in", values, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeNotIn(List<Integer> values) {
            addCriterion("merchtype not in", values, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeBetween(Integer value1, Integer value2) {
            addCriterion("merchtype between", value1, value2, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("merchtype not between", value1, value2, "merchtype");
            return (Criteria) this;
        }

        public Criteria andMerchnumberIsNull() {
            addCriterion("merchnumber is null");
            return (Criteria) this;
        }

        public Criteria andMerchnumberIsNotNull() {
            addCriterion("merchnumber is not null");
            return (Criteria) this;
        }

        public Criteria andMerchnumberEqualTo(String value) {
            addCriterion("merchnumber =", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberNotEqualTo(String value) {
            addCriterion("merchnumber <>", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberGreaterThan(String value) {
            addCriterion("merchnumber >", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("merchnumber >=", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberLessThan(String value) {
            addCriterion("merchnumber <", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberLessThanOrEqualTo(String value) {
            addCriterion("merchnumber <=", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberLike(String value) {
            addCriterion("merchnumber like", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberNotLike(String value) {
            addCriterion("merchnumber not like", value, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberIn(List<String> values) {
            addCriterion("merchnumber in", values, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberNotIn(List<String> values) {
            addCriterion("merchnumber not in", values, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberBetween(String value1, String value2) {
            addCriterion("merchnumber between", value1, value2, "merchnumber");
            return (Criteria) this;
        }

        public Criteria andMerchnumberNotBetween(String value1, String value2) {
            addCriterion("merchnumber not between", value1, value2, "merchnumber");
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