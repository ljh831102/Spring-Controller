package cn.ljh.controller.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsExample() {
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

        public Criteria andItemsIdIsNull() {
            addCriterion("items_id is null");
            return (Criteria) this;
        }

        public Criteria andItemsIdIsNotNull() {
            addCriterion("items_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemsIdEqualTo(Integer value) {
            addCriterion("items_id =", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotEqualTo(Integer value) {
            addCriterion("items_id <>", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThan(Integer value) {
            addCriterion("items_id >", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("items_id >=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThan(Integer value) {
            addCriterion("items_id <", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("items_id <=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdIn(List<Integer> values) {
            addCriterion("items_id in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotIn(List<Integer> values) {
            addCriterion("items_id not in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("items_id between", value1, value2, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("items_id not between", value1, value2, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsNameIsNull() {
            addCriterion("items_name is null");
            return (Criteria) this;
        }

        public Criteria andItemsNameIsNotNull() {
            addCriterion("items_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemsNameEqualTo(String value) {
            addCriterion("items_name =", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameNotEqualTo(String value) {
            addCriterion("items_name <>", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameGreaterThan(String value) {
            addCriterion("items_name >", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameGreaterThanOrEqualTo(String value) {
            addCriterion("items_name >=", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameLessThan(String value) {
            addCriterion("items_name <", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameLessThanOrEqualTo(String value) {
            addCriterion("items_name <=", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameLike(String value) {
            addCriterion("items_name like", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameNotLike(String value) {
            addCriterion("items_name not like", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameIn(List<String> values) {
            addCriterion("items_name in", values, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameNotIn(List<String> values) {
            addCriterion("items_name not in", values, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameBetween(String value1, String value2) {
            addCriterion("items_name between", value1, value2, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameNotBetween(String value1, String value2) {
            addCriterion("items_name not between", value1, value2, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsPriceIsNull() {
            addCriterion("items_price is null");
            return (Criteria) this;
        }

        public Criteria andItemsPriceIsNotNull() {
            addCriterion("items_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemsPriceEqualTo(Float value) {
            addCriterion("items_price =", value, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceNotEqualTo(Float value) {
            addCriterion("items_price <>", value, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceGreaterThan(Float value) {
            addCriterion("items_price >", value, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("items_price >=", value, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceLessThan(Float value) {
            addCriterion("items_price <", value, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceLessThanOrEqualTo(Float value) {
            addCriterion("items_price <=", value, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceIn(List<Float> values) {
            addCriterion("items_price in", values, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceNotIn(List<Float> values) {
            addCriterion("items_price not in", values, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceBetween(Float value1, Float value2) {
            addCriterion("items_price between", value1, value2, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsPriceNotBetween(Float value1, Float value2) {
            addCriterion("items_price not between", value1, value2, "itemsPrice");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIsNull() {
            addCriterion("items_detail is null");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIsNotNull() {
            addCriterion("items_detail is not null");
            return (Criteria) this;
        }

        public Criteria andItemsDetailEqualTo(String value) {
            addCriterion("items_detail =", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailNotEqualTo(String value) {
            addCriterion("items_detail <>", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailGreaterThan(String value) {
            addCriterion("items_detail >", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailGreaterThanOrEqualTo(String value) {
            addCriterion("items_detail >=", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailLessThan(String value) {
            addCriterion("items_detail <", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailLessThanOrEqualTo(String value) {
            addCriterion("items_detail <=", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailLike(String value) {
            addCriterion("items_detail like", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailNotLike(String value) {
            addCriterion("items_detail not like", value, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIn(List<String> values) {
            addCriterion("items_detail in", values, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailNotIn(List<String> values) {
            addCriterion("items_detail not in", values, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailBetween(String value1, String value2) {
            addCriterion("items_detail between", value1, value2, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsDetailNotBetween(String value1, String value2) {
            addCriterion("items_detail not between", value1, value2, "itemsDetail");
            return (Criteria) this;
        }

        public Criteria andItemsPicIsNull() {
            addCriterion("items_pic is null");
            return (Criteria) this;
        }

        public Criteria andItemsPicIsNotNull() {
            addCriterion("items_pic is not null");
            return (Criteria) this;
        }

        public Criteria andItemsPicEqualTo(String value) {
            addCriterion("items_pic =", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicNotEqualTo(String value) {
            addCriterion("items_pic <>", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicGreaterThan(String value) {
            addCriterion("items_pic >", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicGreaterThanOrEqualTo(String value) {
            addCriterion("items_pic >=", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicLessThan(String value) {
            addCriterion("items_pic <", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicLessThanOrEqualTo(String value) {
            addCriterion("items_pic <=", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicLike(String value) {
            addCriterion("items_pic like", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicNotLike(String value) {
            addCriterion("items_pic not like", value, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicIn(List<String> values) {
            addCriterion("items_pic in", values, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicNotIn(List<String> values) {
            addCriterion("items_pic not in", values, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicBetween(String value1, String value2) {
            addCriterion("items_pic between", value1, value2, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsPicNotBetween(String value1, String value2) {
            addCriterion("items_pic not between", value1, value2, "itemsPic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicIsNull() {
            addCriterion("items_detailpic is null");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicIsNotNull() {
            addCriterion("items_detailpic is not null");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicEqualTo(String value) {
            addCriterion("items_detailpic =", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicNotEqualTo(String value) {
            addCriterion("items_detailpic <>", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicGreaterThan(String value) {
            addCriterion("items_detailpic >", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicGreaterThanOrEqualTo(String value) {
            addCriterion("items_detailpic >=", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicLessThan(String value) {
            addCriterion("items_detailpic <", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicLessThanOrEqualTo(String value) {
            addCriterion("items_detailpic <=", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicLike(String value) {
            addCriterion("items_detailpic like", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicNotLike(String value) {
            addCriterion("items_detailpic not like", value, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicIn(List<String> values) {
            addCriterion("items_detailpic in", values, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicNotIn(List<String> values) {
            addCriterion("items_detailpic not in", values, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicBetween(String value1, String value2) {
            addCriterion("items_detailpic between", value1, value2, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsDetailpicNotBetween(String value1, String value2) {
            addCriterion("items_detailpic not between", value1, value2, "itemsDetailpic");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeIsNull() {
            addCriterion("items_createtime is null");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeIsNotNull() {
            addCriterion("items_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeEqualTo(Date value) {
            addCriterion("items_createtime =", value, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeNotEqualTo(Date value) {
            addCriterion("items_createtime <>", value, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeGreaterThan(Date value) {
            addCriterion("items_createtime >", value, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("items_createtime >=", value, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeLessThan(Date value) {
            addCriterion("items_createtime <", value, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("items_createtime <=", value, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeIn(List<Date> values) {
            addCriterion("items_createtime in", values, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeNotIn(List<Date> values) {
            addCriterion("items_createtime not in", values, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("items_createtime between", value1, value2, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("items_createtime not between", value1, value2, "itemsCreatetime");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleIsNull() {
            addCriterion("items_fitpeople is null");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleIsNotNull() {
            addCriterion("items_fitpeople is not null");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleEqualTo(String value) {
            addCriterion("items_fitpeople =", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleNotEqualTo(String value) {
            addCriterion("items_fitpeople <>", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleGreaterThan(String value) {
            addCriterion("items_fitpeople >", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("items_fitpeople >=", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleLessThan(String value) {
            addCriterion("items_fitpeople <", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleLessThanOrEqualTo(String value) {
            addCriterion("items_fitpeople <=", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleLike(String value) {
            addCriterion("items_fitpeople like", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleNotLike(String value) {
            addCriterion("items_fitpeople not like", value, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleIn(List<String> values) {
            addCriterion("items_fitpeople in", values, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleNotIn(List<String> values) {
            addCriterion("items_fitpeople not in", values, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleBetween(String value1, String value2) {
            addCriterion("items_fitpeople between", value1, value2, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsFitpeopleNotBetween(String value1, String value2) {
            addCriterion("items_fitpeople not between", value1, value2, "itemsFitpeople");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelIsNull() {
            addCriterion("items_sellinglevel is null");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelIsNotNull() {
            addCriterion("items_sellinglevel is not null");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelEqualTo(String value) {
            addCriterion("items_sellinglevel =", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelNotEqualTo(String value) {
            addCriterion("items_sellinglevel <>", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelGreaterThan(String value) {
            addCriterion("items_sellinglevel >", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelGreaterThanOrEqualTo(String value) {
            addCriterion("items_sellinglevel >=", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelLessThan(String value) {
            addCriterion("items_sellinglevel <", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelLessThanOrEqualTo(String value) {
            addCriterion("items_sellinglevel <=", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelLike(String value) {
            addCriterion("items_sellinglevel like", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelNotLike(String value) {
            addCriterion("items_sellinglevel not like", value, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelIn(List<String> values) {
            addCriterion("items_sellinglevel in", values, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelNotIn(List<String> values) {
            addCriterion("items_sellinglevel not in", values, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelBetween(String value1, String value2) {
            addCriterion("items_sellinglevel between", value1, value2, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsSellinglevelNotBetween(String value1, String value2) {
            addCriterion("items_sellinglevel not between", value1, value2, "itemsSellinglevel");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeIsNull() {
            addCriterion("items_itemtype is null");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeIsNotNull() {
            addCriterion("items_itemtype is not null");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeEqualTo(String value) {
            addCriterion("items_itemtype =", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeNotEqualTo(String value) {
            addCriterion("items_itemtype <>", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeGreaterThan(String value) {
            addCriterion("items_itemtype >", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("items_itemtype >=", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeLessThan(String value) {
            addCriterion("items_itemtype <", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeLessThanOrEqualTo(String value) {
            addCriterion("items_itemtype <=", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeLike(String value) {
            addCriterion("items_itemtype like", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeNotLike(String value) {
            addCriterion("items_itemtype not like", value, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeIn(List<String> values) {
            addCriterion("items_itemtype in", values, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeNotIn(List<String> values) {
            addCriterion("items_itemtype not in", values, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeBetween(String value1, String value2) {
            addCriterion("items_itemtype between", value1, value2, "itemsItemtype");
            return (Criteria) this;
        }

        public Criteria andItemsItemtypeNotBetween(String value1, String value2) {
            addCriterion("items_itemtype not between", value1, value2, "itemsItemtype");
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