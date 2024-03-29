package net.suncaper.hotel_manager.domain;

import java.util.ArrayList;
import java.util.List;

public class H_AdminExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public H_AdminExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andAAccountIsNull() {
            addCriterion("a_account is null");
            return (Criteria) this;
        }

        public Criteria andAAccountIsNotNull() {
            addCriterion("a_account is not null");
            return (Criteria) this;
        }

        public Criteria andAAccountEqualTo(String value) {
            addCriterion("a_account =", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotEqualTo(String value) {
            addCriterion("a_account <>", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountGreaterThan(String value) {
            addCriterion("a_account >", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountGreaterThanOrEqualTo(String value) {
            addCriterion("a_account >=", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountLessThan(String value) {
            addCriterion("a_account <", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountLessThanOrEqualTo(String value) {
            addCriterion("a_account <=", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountLike(String value) {
            addCriterion("a_account like", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotLike(String value) {
            addCriterion("a_account not like", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountIn(List<String> values) {
            addCriterion("a_account in", values, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotIn(List<String> values) {
            addCriterion("a_account not in", values, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountBetween(String value1, String value2) {
            addCriterion("a_account between", value1, value2, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotBetween(String value1, String value2) {
            addCriterion("a_account not between", value1, value2, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNull() {
            addCriterion("a_password is null");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNotNull() {
            addCriterion("a_password is not null");
            return (Criteria) this;
        }

        public Criteria andAPasswordEqualTo(String value) {
            addCriterion("a_password =", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotEqualTo(String value) {
            addCriterion("a_password <>", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThan(String value) {
            addCriterion("a_password >", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("a_password >=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThan(String value) {
            addCriterion("a_password <", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThanOrEqualTo(String value) {
            addCriterion("a_password <=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLike(String value) {
            addCriterion("a_password like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotLike(String value) {
            addCriterion("a_password not like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordIn(List<String> values) {
            addCriterion("a_password in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotIn(List<String> values) {
            addCriterion("a_password not in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordBetween(String value1, String value2) {
            addCriterion("a_password between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotBetween(String value1, String value2) {
            addCriterion("a_password not between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPermissionIsNull() {
            addCriterion("a_permission is null");
            return (Criteria) this;
        }

        public Criteria andAPermissionIsNotNull() {
            addCriterion("a_permission is not null");
            return (Criteria) this;
        }

        public Criteria andAPermissionEqualTo(String value) {
            addCriterion("a_permission =", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionNotEqualTo(String value) {
            addCriterion("a_permission <>", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionGreaterThan(String value) {
            addCriterion("a_permission >", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("a_permission >=", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionLessThan(String value) {
            addCriterion("a_permission <", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionLessThanOrEqualTo(String value) {
            addCriterion("a_permission <=", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionLike(String value) {
            addCriterion("a_permission like", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionNotLike(String value) {
            addCriterion("a_permission not like", value, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionIn(List<String> values) {
            addCriterion("a_permission in", values, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionNotIn(List<String> values) {
            addCriterion("a_permission not in", values, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionBetween(String value1, String value2) {
            addCriterion("a_permission between", value1, value2, "aPermission");
            return (Criteria) this;
        }

        public Criteria andAPermissionNotBetween(String value1, String value2) {
            addCriterion("a_permission not between", value1, value2, "aPermission");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_admin
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 07 17:59:24 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_admin
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
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