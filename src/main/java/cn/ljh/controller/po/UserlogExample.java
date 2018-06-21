package cn.ljh.controller.po;

import java.util.ArrayList;
import java.util.List;

public class UserlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserlogExample() {
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

        public Criteria andUserlogIdIsNull() {
            addCriterion("userlog_id is null");
            return (Criteria) this;
        }

        public Criteria andUserlogIdIsNotNull() {
            addCriterion("userlog_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogIdEqualTo(Integer value) {
            addCriterion("userlog_id =", value, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdNotEqualTo(Integer value) {
            addCriterion("userlog_id <>", value, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdGreaterThan(Integer value) {
            addCriterion("userlog_id >", value, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userlog_id >=", value, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdLessThan(Integer value) {
            addCriterion("userlog_id <", value, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("userlog_id <=", value, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdIn(List<Integer> values) {
            addCriterion("userlog_id in", values, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdNotIn(List<Integer> values) {
            addCriterion("userlog_id not in", values, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdBetween(Integer value1, Integer value2) {
            addCriterion("userlog_id between", value1, value2, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userlog_id not between", value1, value2, "userlogId");
            return (Criteria) this;
        }

        public Criteria andUserlogLogIsNull() {
            addCriterion("userlog_log is null");
            return (Criteria) this;
        }

        public Criteria andUserlogLogIsNotNull() {
            addCriterion("userlog_log is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogLogEqualTo(String value) {
            addCriterion("userlog_log =", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogNotEqualTo(String value) {
            addCriterion("userlog_log <>", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogGreaterThan(String value) {
            addCriterion("userlog_log >", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogGreaterThanOrEqualTo(String value) {
            addCriterion("userlog_log >=", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogLessThan(String value) {
            addCriterion("userlog_log <", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogLessThanOrEqualTo(String value) {
            addCriterion("userlog_log <=", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogLike(String value) {
            addCriterion("userlog_log like", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogNotLike(String value) {
            addCriterion("userlog_log not like", value, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogIn(List<String> values) {
            addCriterion("userlog_log in", values, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogNotIn(List<String> values) {
            addCriterion("userlog_log not in", values, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogBetween(String value1, String value2) {
            addCriterion("userlog_log between", value1, value2, "userlogLog");
            return (Criteria) this;
        }

        public Criteria andUserlogLogNotBetween(String value1, String value2) {
            addCriterion("userlog_log not between", value1, value2, "userlogLog");
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