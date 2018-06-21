package cn.ljh.controller.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeIsNull() {
            addCriterion("user_region_province_code is null");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeIsNotNull() {
            addCriterion("user_region_province_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeEqualTo(String value) {
            addCriterion("user_region_province_code =", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeNotEqualTo(String value) {
            addCriterion("user_region_province_code <>", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeGreaterThan(String value) {
            addCriterion("user_region_province_code >", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_region_province_code >=", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeLessThan(String value) {
            addCriterion("user_region_province_code <", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("user_region_province_code <=", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeLike(String value) {
            addCriterion("user_region_province_code like", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeNotLike(String value) {
            addCriterion("user_region_province_code not like", value, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeIn(List<String> values) {
            addCriterion("user_region_province_code in", values, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeNotIn(List<String> values) {
            addCriterion("user_region_province_code not in", values, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeBetween(String value1, String value2) {
            addCriterion("user_region_province_code between", value1, value2, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("user_region_province_code not between", value1, value2, "userRegionProvinceCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeIsNull() {
            addCriterion("user_region_city_code is null");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeIsNotNull() {
            addCriterion("user_region_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeEqualTo(String value) {
            addCriterion("user_region_city_code =", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeNotEqualTo(String value) {
            addCriterion("user_region_city_code <>", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeGreaterThan(String value) {
            addCriterion("user_region_city_code >", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_region_city_code >=", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeLessThan(String value) {
            addCriterion("user_region_city_code <", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeLessThanOrEqualTo(String value) {
            addCriterion("user_region_city_code <=", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeLike(String value) {
            addCriterion("user_region_city_code like", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeNotLike(String value) {
            addCriterion("user_region_city_code not like", value, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeIn(List<String> values) {
            addCriterion("user_region_city_code in", values, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeNotIn(List<String> values) {
            addCriterion("user_region_city_code not in", values, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeBetween(String value1, String value2) {
            addCriterion("user_region_city_code between", value1, value2, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCityCodeNotBetween(String value1, String value2) {
            addCriterion("user_region_city_code not between", value1, value2, "userRegionCityCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeIsNull() {
            addCriterion("user_region_county_code is null");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeIsNotNull() {
            addCriterion("user_region_county_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeEqualTo(String value) {
            addCriterion("user_region_county_code =", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeNotEqualTo(String value) {
            addCriterion("user_region_county_code <>", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeGreaterThan(String value) {
            addCriterion("user_region_county_code >", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_region_county_code >=", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeLessThan(String value) {
            addCriterion("user_region_county_code <", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("user_region_county_code <=", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeLike(String value) {
            addCriterion("user_region_county_code like", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeNotLike(String value) {
            addCriterion("user_region_county_code not like", value, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeIn(List<String> values) {
            addCriterion("user_region_county_code in", values, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeNotIn(List<String> values) {
            addCriterion("user_region_county_code not in", values, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeBetween(String value1, String value2) {
            addCriterion("user_region_county_code between", value1, value2, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserRegionCountyCodeNotBetween(String value1, String value2) {
            addCriterion("user_region_county_code not between", value1, value2, "userRegionCountyCode");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailIsNull() {
            addCriterion("user_addressdetail is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailIsNotNull() {
            addCriterion("user_addressdetail is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailEqualTo(String value) {
            addCriterion("user_addressdetail =", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailNotEqualTo(String value) {
            addCriterion("user_addressdetail <>", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailGreaterThan(String value) {
            addCriterion("user_addressdetail >", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailGreaterThanOrEqualTo(String value) {
            addCriterion("user_addressdetail >=", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailLessThan(String value) {
            addCriterion("user_addressdetail <", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailLessThanOrEqualTo(String value) {
            addCriterion("user_addressdetail <=", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailLike(String value) {
            addCriterion("user_addressdetail like", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailNotLike(String value) {
            addCriterion("user_addressdetail not like", value, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailIn(List<String> values) {
            addCriterion("user_addressdetail in", values, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailNotIn(List<String> values) {
            addCriterion("user_addressdetail not in", values, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailBetween(String value1, String value2) {
            addCriterion("user_addressdetail between", value1, value2, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserAddressdetailNotBetween(String value1, String value2) {
            addCriterion("user_addressdetail not between", value1, value2, "userAddressdetail");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesIsNull() {
            addCriterion("user_hobbies is null");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesIsNotNull() {
            addCriterion("user_hobbies is not null");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesEqualTo(String value) {
            addCriterion("user_hobbies =", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesNotEqualTo(String value) {
            addCriterion("user_hobbies <>", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesGreaterThan(String value) {
            addCriterion("user_hobbies >", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesGreaterThanOrEqualTo(String value) {
            addCriterion("user_hobbies >=", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesLessThan(String value) {
            addCriterion("user_hobbies <", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesLessThanOrEqualTo(String value) {
            addCriterion("user_hobbies <=", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesLike(String value) {
            addCriterion("user_hobbies like", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesNotLike(String value) {
            addCriterion("user_hobbies not like", value, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesIn(List<String> values) {
            addCriterion("user_hobbies in", values, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesNotIn(List<String> values) {
            addCriterion("user_hobbies not in", values, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesBetween(String value1, String value2) {
            addCriterion("user_hobbies between", value1, value2, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserHobbiesNotBetween(String value1, String value2) {
            addCriterion("user_hobbies not between", value1, value2, "userHobbies");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneIsNull() {
            addCriterion("user_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneIsNotNull() {
            addCriterion("user_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneEqualTo(String value) {
            addCriterion("user_mobilephone =", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneNotEqualTo(String value) {
            addCriterion("user_mobilephone <>", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneGreaterThan(String value) {
            addCriterion("user_mobilephone >", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobilephone >=", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneLessThan(String value) {
            addCriterion("user_mobilephone <", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("user_mobilephone <=", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneLike(String value) {
            addCriterion("user_mobilephone like", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneNotLike(String value) {
            addCriterion("user_mobilephone not like", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneIn(List<String> values) {
            addCriterion("user_mobilephone in", values, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneNotIn(List<String> values) {
            addCriterion("user_mobilephone not in", values, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneBetween(String value1, String value2) {
            addCriterion("user_mobilephone between", value1, value2, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneNotBetween(String value1, String value2) {
            addCriterion("user_mobilephone not between", value1, value2, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNull() {
            addCriterion("user_img is null");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNotNull() {
            addCriterion("user_img is not null");
            return (Criteria) this;
        }

        public Criteria andUserImgEqualTo(String value) {
            addCriterion("user_img =", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotEqualTo(String value) {
            addCriterion("user_img <>", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThan(String value) {
            addCriterion("user_img >", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("user_img >=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThan(String value) {
            addCriterion("user_img <", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThanOrEqualTo(String value) {
            addCriterion("user_img <=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLike(String value) {
            addCriterion("user_img like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotLike(String value) {
            addCriterion("user_img not like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgIn(List<String> values) {
            addCriterion("user_img in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotIn(List<String> values) {
            addCriterion("user_img not in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgBetween(String value1, String value2) {
            addCriterion("user_img between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotBetween(String value1, String value2) {
            addCriterion("user_img not between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserDetailIsNull() {
            addCriterion("user_detail is null");
            return (Criteria) this;
        }

        public Criteria andUserDetailIsNotNull() {
            addCriterion("user_detail is not null");
            return (Criteria) this;
        }

        public Criteria andUserDetailEqualTo(String value) {
            addCriterion("user_detail =", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailNotEqualTo(String value) {
            addCriterion("user_detail <>", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailGreaterThan(String value) {
            addCriterion("user_detail >", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailGreaterThanOrEqualTo(String value) {
            addCriterion("user_detail >=", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailLessThan(String value) {
            addCriterion("user_detail <", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailLessThanOrEqualTo(String value) {
            addCriterion("user_detail <=", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailLike(String value) {
            addCriterion("user_detail like", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailNotLike(String value) {
            addCriterion("user_detail not like", value, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailIn(List<String> values) {
            addCriterion("user_detail in", values, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailNotIn(List<String> values) {
            addCriterion("user_detail not in", values, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailBetween(String value1, String value2) {
            addCriterion("user_detail between", value1, value2, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserDetailNotBetween(String value1, String value2) {
            addCriterion("user_detail not between", value1, value2, "userDetail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorIsNull() {
            addCriterion("user_favoritecolor is null");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorIsNotNull() {
            addCriterion("user_favoritecolor is not null");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorEqualTo(String value) {
            addCriterion("user_favoritecolor =", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorNotEqualTo(String value) {
            addCriterion("user_favoritecolor <>", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorGreaterThan(String value) {
            addCriterion("user_favoritecolor >", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorGreaterThanOrEqualTo(String value) {
            addCriterion("user_favoritecolor >=", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorLessThan(String value) {
            addCriterion("user_favoritecolor <", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorLessThanOrEqualTo(String value) {
            addCriterion("user_favoritecolor <=", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorLike(String value) {
            addCriterion("user_favoritecolor like", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorNotLike(String value) {
            addCriterion("user_favoritecolor not like", value, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorIn(List<String> values) {
            addCriterion("user_favoritecolor in", values, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorNotIn(List<String> values) {
            addCriterion("user_favoritecolor not in", values, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorBetween(String value1, String value2) {
            addCriterion("user_favoritecolor between", value1, value2, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserFavoritecolorNotBetween(String value1, String value2) {
            addCriterion("user_favoritecolor not between", value1, value2, "userFavoritecolor");
            return (Criteria) this;
        }

        public Criteria andUserSalaryIsNull() {
            addCriterion("user_salary is null");
            return (Criteria) this;
        }

        public Criteria andUserSalaryIsNotNull() {
            addCriterion("user_salary is not null");
            return (Criteria) this;
        }

        public Criteria andUserSalaryEqualTo(Integer value) {
            addCriterion("user_salary =", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryNotEqualTo(Integer value) {
            addCriterion("user_salary <>", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryGreaterThan(Integer value) {
            addCriterion("user_salary >", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_salary >=", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryLessThan(Integer value) {
            addCriterion("user_salary <", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("user_salary <=", value, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryIn(List<Integer> values) {
            addCriterion("user_salary in", values, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryNotIn(List<Integer> values) {
            addCriterion("user_salary not in", values, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryBetween(Integer value1, Integer value2) {
            addCriterion("user_salary between", value1, value2, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("user_salary not between", value1, value2, "userSalary");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlIsNull() {
            addCriterion("user_favoriteurl is null");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlIsNotNull() {
            addCriterion("user_favoriteurl is not null");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlEqualTo(String value) {
            addCriterion("user_favoriteurl =", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlNotEqualTo(String value) {
            addCriterion("user_favoriteurl <>", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlGreaterThan(String value) {
            addCriterion("user_favoriteurl >", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlGreaterThanOrEqualTo(String value) {
            addCriterion("user_favoriteurl >=", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlLessThan(String value) {
            addCriterion("user_favoriteurl <", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlLessThanOrEqualTo(String value) {
            addCriterion("user_favoriteurl <=", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlLike(String value) {
            addCriterion("user_favoriteurl like", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlNotLike(String value) {
            addCriterion("user_favoriteurl not like", value, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlIn(List<String> values) {
            addCriterion("user_favoriteurl in", values, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlNotIn(List<String> values) {
            addCriterion("user_favoriteurl not in", values, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlBetween(String value1, String value2) {
            addCriterion("user_favoriteurl between", value1, value2, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserFavoriteurlNotBetween(String value1, String value2) {
            addCriterion("user_favoriteurl not between", value1, value2, "userFavoriteurl");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNull() {
            addCriterion("user_grade is null");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNotNull() {
            addCriterion("user_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUserGradeEqualTo(String value) {
            addCriterion("user_grade =", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotEqualTo(String value) {
            addCriterion("user_grade <>", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThan(String value) {
            addCriterion("user_grade >", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThanOrEqualTo(String value) {
            addCriterion("user_grade >=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThan(String value) {
            addCriterion("user_grade <", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThanOrEqualTo(String value) {
            addCriterion("user_grade <=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLike(String value) {
            addCriterion("user_grade like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotLike(String value) {
            addCriterion("user_grade not like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeIn(List<String> values) {
            addCriterion("user_grade in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotIn(List<String> values) {
            addCriterion("user_grade not in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeBetween(String value1, String value2) {
            addCriterion("user_grade between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotBetween(String value1, String value2) {
            addCriterion("user_grade not between", value1, value2, "userGrade");
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