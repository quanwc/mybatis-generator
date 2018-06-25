package com.yiman.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityDetailExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTotalRewardIsNull() {
            addCriterion("total_reward is null");
            return (Criteria) this;
        }

        public Criteria andTotalRewardIsNotNull() {
            addCriterion("total_reward is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRewardEqualTo(Integer value) {
            addCriterion("total_reward =", value, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardNotEqualTo(Integer value) {
            addCriterion("total_reward <>", value, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardGreaterThan(Integer value) {
            addCriterion("total_reward >", value, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_reward >=", value, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardLessThan(Integer value) {
            addCriterion("total_reward <", value, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardLessThanOrEqualTo(Integer value) {
            addCriterion("total_reward <=", value, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardIn(List<Integer> values) {
            addCriterion("total_reward in", values, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardNotIn(List<Integer> values) {
            addCriterion("total_reward not in", values, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardBetween(Integer value1, Integer value2) {
            addCriterion("total_reward between", value1, value2, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTotalRewardNotBetween(Integer value1, Integer value2) {
            addCriterion("total_reward not between", value1, value2, "totalReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardIsNull() {
            addCriterion("top_reward is null");
            return (Criteria) this;
        }

        public Criteria andTopRewardIsNotNull() {
            addCriterion("top_reward is not null");
            return (Criteria) this;
        }

        public Criteria andTopRewardEqualTo(Integer value) {
            addCriterion("top_reward =", value, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardNotEqualTo(Integer value) {
            addCriterion("top_reward <>", value, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardGreaterThan(Integer value) {
            addCriterion("top_reward >", value, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_reward >=", value, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardLessThan(Integer value) {
            addCriterion("top_reward <", value, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardLessThanOrEqualTo(Integer value) {
            addCriterion("top_reward <=", value, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardIn(List<Integer> values) {
            addCriterion("top_reward in", values, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardNotIn(List<Integer> values) {
            addCriterion("top_reward not in", values, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardBetween(Integer value1, Integer value2) {
            addCriterion("top_reward between", value1, value2, "topReward");
            return (Criteria) this;
        }

        public Criteria andTopRewardNotBetween(Integer value1, Integer value2) {
            addCriterion("top_reward not between", value1, value2, "topReward");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("expire_date not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNull() {
            addCriterion("order_index is null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNotNull() {
            addCriterion("order_index is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexEqualTo(Byte value) {
            addCriterion("order_index =", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotEqualTo(Byte value) {
            addCriterion("order_index <>", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThan(Byte value) {
            addCriterion("order_index >", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_index >=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThan(Byte value) {
            addCriterion("order_index <", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThanOrEqualTo(Byte value) {
            addCriterion("order_index <=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIn(List<Byte> values) {
            addCriterion("order_index in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotIn(List<Byte> values) {
            addCriterion("order_index not in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexBetween(Byte value1, Byte value2) {
            addCriterion("order_index between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotBetween(Byte value1, Byte value2) {
            addCriterion("order_index not between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateIsNull() {
            addCriterion("begin_reward_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateIsNotNull() {
            addCriterion("begin_reward_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateEqualTo(Date value) {
            addCriterion("begin_reward_date =", value, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateNotEqualTo(Date value) {
            addCriterion("begin_reward_date <>", value, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateGreaterThan(Date value) {
            addCriterion("begin_reward_date >", value, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_reward_date >=", value, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateLessThan(Date value) {
            addCriterion("begin_reward_date <", value, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_reward_date <=", value, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateIn(List<Date> values) {
            addCriterion("begin_reward_date in", values, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateNotIn(List<Date> values) {
            addCriterion("begin_reward_date not in", values, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateBetween(Date value1, Date value2) {
            addCriterion("begin_reward_date between", value1, value2, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andBeginRewardDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_reward_date not between", value1, value2, "beginRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateIsNull() {
            addCriterion("end_reward_date is null");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateIsNotNull() {
            addCriterion("end_reward_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateEqualTo(Date value) {
            addCriterion("end_reward_date =", value, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateNotEqualTo(Date value) {
            addCriterion("end_reward_date <>", value, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateGreaterThan(Date value) {
            addCriterion("end_reward_date >", value, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_reward_date >=", value, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateLessThan(Date value) {
            addCriterion("end_reward_date <", value, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateLessThanOrEqualTo(Date value) {
            addCriterion("end_reward_date <=", value, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateIn(List<Date> values) {
            addCriterion("end_reward_date in", values, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateNotIn(List<Date> values) {
            addCriterion("end_reward_date not in", values, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateBetween(Date value1, Date value2) {
            addCriterion("end_reward_date between", value1, value2, "endRewardDate");
            return (Criteria) this;
        }

        public Criteria andEndRewardDateNotBetween(Date value1, Date value2) {
            addCriterion("end_reward_date not between", value1, value2, "endRewardDate");
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