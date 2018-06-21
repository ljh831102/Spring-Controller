package cn.ljh.controller.po;

import java.util.ArrayList;
import java.util.List;

public class RegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionExample() {
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

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeIsNull() {
            addCriterion("region_province_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeIsNotNull() {
            addCriterion("region_province_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeEqualTo(String value) {
            addCriterion("region_province_code =", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeNotEqualTo(String value) {
            addCriterion("region_province_code <>", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeGreaterThan(String value) {
            addCriterion("region_province_code >", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_province_code >=", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeLessThan(String value) {
            addCriterion("region_province_code <", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("region_province_code <=", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeLike(String value) {
            addCriterion("region_province_code like", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeNotLike(String value) {
            addCriterion("region_province_code not like", value, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeIn(List<String> values) {
            addCriterion("region_province_code in", values, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeNotIn(List<String> values) {
            addCriterion("region_province_code not in", values, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeBetween(String value1, String value2) {
            addCriterion("region_province_code between", value1, value2, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("region_province_code not between", value1, value2, "regionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeIsNull() {
            addCriterion("region_city_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeIsNotNull() {
            addCriterion("region_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeEqualTo(String value) {
            addCriterion("region_city_code =", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeNotEqualTo(String value) {
            addCriterion("region_city_code <>", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeGreaterThan(String value) {
            addCriterion("region_city_code >", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_city_code >=", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeLessThan(String value) {
            addCriterion("region_city_code <", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeLessThanOrEqualTo(String value) {
            addCriterion("region_city_code <=", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeLike(String value) {
            addCriterion("region_city_code like", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeNotLike(String value) {
            addCriterion("region_city_code not like", value, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeIn(List<String> values) {
            addCriterion("region_city_code in", values, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeNotIn(List<String> values) {
            addCriterion("region_city_code not in", values, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeBetween(String value1, String value2) {
            addCriterion("region_city_code between", value1, value2, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCityCodeNotBetween(String value1, String value2) {
            addCriterion("region_city_code not between", value1, value2, "regionCityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeIsNull() {
            addCriterion("region_county_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeIsNotNull() {
            addCriterion("region_county_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeEqualTo(String value) {
            addCriterion("region_county_code =", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeNotEqualTo(String value) {
            addCriterion("region_county_code <>", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeGreaterThan(String value) {
            addCriterion("region_county_code >", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_county_code >=", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeLessThan(String value) {
            addCriterion("region_county_code <", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("region_county_code <=", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeLike(String value) {
            addCriterion("region_county_code like", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeNotLike(String value) {
            addCriterion("region_county_code not like", value, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeIn(List<String> values) {
            addCriterion("region_county_code in", values, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeNotIn(List<String> values) {
            addCriterion("region_county_code not in", values, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeBetween(String value1, String value2) {
            addCriterion("region_county_code between", value1, value2, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionCountyCodeNotBetween(String value1, String value2) {
            addCriterion("region_county_code not between", value1, value2, "regionCountyCode");
            return (Criteria) this;
        }

        public Criteria andRegionKindIsNull() {
            addCriterion("region_kind is null");
            return (Criteria) this;
        }

        public Criteria andRegionKindIsNotNull() {
            addCriterion("region_kind is not null");
            return (Criteria) this;
        }

        public Criteria andRegionKindEqualTo(String value) {
            addCriterion("region_kind =", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindNotEqualTo(String value) {
            addCriterion("region_kind <>", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindGreaterThan(String value) {
            addCriterion("region_kind >", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindGreaterThanOrEqualTo(String value) {
            addCriterion("region_kind >=", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindLessThan(String value) {
            addCriterion("region_kind <", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindLessThanOrEqualTo(String value) {
            addCriterion("region_kind <=", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindLike(String value) {
            addCriterion("region_kind like", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindNotLike(String value) {
            addCriterion("region_kind not like", value, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindIn(List<String> values) {
            addCriterion("region_kind in", values, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindNotIn(List<String> values) {
            addCriterion("region_kind not in", values, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindBetween(String value1, String value2) {
            addCriterion("region_kind between", value1, value2, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionKindNotBetween(String value1, String value2) {
            addCriterion("region_kind not between", value1, value2, "regionKind");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNull() {
            addCriterion("region_name is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNotNull() {
            addCriterion("region_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEqualTo(String value) {
            addCriterion("region_name =", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotEqualTo(String value) {
            addCriterion("region_name <>", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThan(String value) {
            addCriterion("region_name >", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
            addCriterion("region_name >=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThan(String value) {
            addCriterion("region_name <", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThanOrEqualTo(String value) {
            addCriterion("region_name <=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLike(String value) {
            addCriterion("region_name like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotLike(String value) {
            addCriterion("region_name not like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameIn(List<String> values) {
            addCriterion("region_name in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotIn(List<String> values) {
            addCriterion("region_name not in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameBetween(String value1, String value2) {
            addCriterion("region_name between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotBetween(String value1, String value2) {
            addCriterion("region_name not between", value1, value2, "regionName");
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