package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andDeptidIsNull() {
            addCriterion("deptid is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptid is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptid =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptid <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptid >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptid >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptid <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptid <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptid in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptid not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptid between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptid not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDenameIsNull() {
            addCriterion("dename is null");
            return (Criteria) this;
        }

        public Criteria andDenameIsNotNull() {
            addCriterion("dename is not null");
            return (Criteria) this;
        }

        public Criteria andDenameEqualTo(String value) {
            addCriterion("dename =", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotEqualTo(String value) {
            addCriterion("dename <>", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameGreaterThan(String value) {
            addCriterion("dename >", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameGreaterThanOrEqualTo(String value) {
            addCriterion("dename >=", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLessThan(String value) {
            addCriterion("dename <", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLessThanOrEqualTo(String value) {
            addCriterion("dename <=", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLike(String value) {
            addCriterion("dename like", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotLike(String value) {
            addCriterion("dename not like", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameIn(List<String> values) {
            addCriterion("dename in", values, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotIn(List<String> values) {
            addCriterion("dename not in", values, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameBetween(String value1, String value2) {
            addCriterion("dename between", value1, value2, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotBetween(String value1, String value2) {
            addCriterion("dename not between", value1, value2, "dename");
            return (Criteria) this;
        }

        public Criteria andDephoneIsNull() {
            addCriterion("dephone is null");
            return (Criteria) this;
        }

        public Criteria andDephoneIsNotNull() {
            addCriterion("dephone is not null");
            return (Criteria) this;
        }

        public Criteria andDephoneEqualTo(String value) {
            addCriterion("dephone =", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneNotEqualTo(String value) {
            addCriterion("dephone <>", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneGreaterThan(String value) {
            addCriterion("dephone >", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneGreaterThanOrEqualTo(String value) {
            addCriterion("dephone >=", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneLessThan(String value) {
            addCriterion("dephone <", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneLessThanOrEqualTo(String value) {
            addCriterion("dephone <=", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneLike(String value) {
            addCriterion("dephone like", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneNotLike(String value) {
            addCriterion("dephone not like", value, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneIn(List<String> values) {
            addCriterion("dephone in", values, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneNotIn(List<String> values) {
            addCriterion("dephone not in", values, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneBetween(String value1, String value2) {
            addCriterion("dephone between", value1, value2, "dephone");
            return (Criteria) this;
        }

        public Criteria andDephoneNotBetween(String value1, String value2) {
            addCriterion("dephone not between", value1, value2, "dephone");
            return (Criteria) this;
        }

        public Criteria andDestuatsIsNull() {
            addCriterion("destuats is null");
            return (Criteria) this;
        }

        public Criteria andDestuatsIsNotNull() {
            addCriterion("destuats is not null");
            return (Criteria) this;
        }

        public Criteria andDestuatsEqualTo(String value) {
            addCriterion("destuats =", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsNotEqualTo(String value) {
            addCriterion("destuats <>", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsGreaterThan(String value) {
            addCriterion("destuats >", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsGreaterThanOrEqualTo(String value) {
            addCriterion("destuats >=", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsLessThan(String value) {
            addCriterion("destuats <", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsLessThanOrEqualTo(String value) {
            addCriterion("destuats <=", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsLike(String value) {
            addCriterion("destuats like", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsNotLike(String value) {
            addCriterion("destuats not like", value, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsIn(List<String> values) {
            addCriterion("destuats in", values, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsNotIn(List<String> values) {
            addCriterion("destuats not in", values, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsBetween(String value1, String value2) {
            addCriterion("destuats between", value1, value2, "destuats");
            return (Criteria) this;
        }

        public Criteria andDestuatsNotBetween(String value1, String value2) {
            addCriterion("destuats not between", value1, value2, "destuats");
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