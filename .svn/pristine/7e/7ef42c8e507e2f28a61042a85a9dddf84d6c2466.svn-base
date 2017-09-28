package bi.baiqiu.pojo2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
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

        public Criteria andBeneficiaryIdIsNull() {
            addCriterion("beneficiary_id is null");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdIsNotNull() {
            addCriterion("beneficiary_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdEqualTo(Integer value) {
            addCriterion("beneficiary_id =", value, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdNotEqualTo(Integer value) {
            addCriterion("beneficiary_id <>", value, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdGreaterThan(Integer value) {
            addCriterion("beneficiary_id >", value, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("beneficiary_id >=", value, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdLessThan(Integer value) {
            addCriterion("beneficiary_id <", value, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("beneficiary_id <=", value, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdIn(List<Integer> values) {
            addCriterion("beneficiary_id in", values, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdNotIn(List<Integer> values) {
            addCriterion("beneficiary_id not in", values, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdBetween(Integer value1, Integer value2) {
            addCriterion("beneficiary_id between", value1, value2, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andBeneficiaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("beneficiary_id not between", value1, value2, "beneficiaryId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Boolean value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Boolean value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Boolean value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Boolean value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Boolean> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Boolean> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusEqualTo(Boolean value) {
            addCriterion("shipping_status =", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotEqualTo(Boolean value) {
            addCriterion("shipping_status <>", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThan(Boolean value) {
            addCriterion("shipping_status >", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status >=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThan(Boolean value) {
            addCriterion("shipping_status <", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status <=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIn(List<Boolean> values) {
            addCriterion("shipping_status in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotIn(List<Boolean> values) {
            addCriterion("shipping_status not in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status not between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Boolean value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Boolean value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Boolean value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Boolean value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Boolean> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Boolean> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptIsNull() {
            addCriterion("consignee_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptIsNotNull() {
            addCriterion("consignee_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptEqualTo(String value) {
            addCriterion("consignee_encrypt =", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptNotEqualTo(String value) {
            addCriterion("consignee_encrypt <>", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptGreaterThan(String value) {
            addCriterion("consignee_encrypt >", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_encrypt >=", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptLessThan(String value) {
            addCriterion("consignee_encrypt <", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptLessThanOrEqualTo(String value) {
            addCriterion("consignee_encrypt <=", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptLike(String value) {
            addCriterion("consignee_encrypt like", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptNotLike(String value) {
            addCriterion("consignee_encrypt not like", value, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptIn(List<String> values) {
            addCriterion("consignee_encrypt in", values, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptNotIn(List<String> values) {
            addCriterion("consignee_encrypt not in", values, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptBetween(String value1, String value2) {
            addCriterion("consignee_encrypt between", value1, value2, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andConsigneeEncryptNotBetween(String value1, String value2) {
            addCriterion("consignee_encrypt not between", value1, value2, "consigneeEncrypt");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Short value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Short value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Short value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Short value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Short value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Short value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Short> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Short> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Short value1, Short value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Short value1, Short value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Short value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Short value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Short value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Short value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Short value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Short value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Short> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Short> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Short value1, Short value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Short value1, Short value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Short value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Short value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Short value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Short value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Short value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Short value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Short> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Short> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Short value1, Short value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Short value1, Short value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Short value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Short value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Short value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Short value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Short value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Short value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Short> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Short> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Short value1, Short value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Short value1, Short value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelEncryptIsNull() {
            addCriterion("tel_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andTelEncryptIsNotNull() {
            addCriterion("tel_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andTelEncryptEqualTo(String value) {
            addCriterion("tel_encrypt =", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptNotEqualTo(String value) {
            addCriterion("tel_encrypt <>", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptGreaterThan(String value) {
            addCriterion("tel_encrypt >", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("tel_encrypt >=", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptLessThan(String value) {
            addCriterion("tel_encrypt <", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptLessThanOrEqualTo(String value) {
            addCriterion("tel_encrypt <=", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptLike(String value) {
            addCriterion("tel_encrypt like", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptNotLike(String value) {
            addCriterion("tel_encrypt not like", value, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptIn(List<String> values) {
            addCriterion("tel_encrypt in", values, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptNotIn(List<String> values) {
            addCriterion("tel_encrypt not in", values, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptBetween(String value1, String value2) {
            addCriterion("tel_encrypt between", value1, value2, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andTelEncryptNotBetween(String value1, String value2) {
            addCriterion("tel_encrypt not between", value1, value2, "telEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptIsNull() {
            addCriterion("mobile_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptIsNotNull() {
            addCriterion("mobile_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptEqualTo(String value) {
            addCriterion("mobile_encrypt =", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptNotEqualTo(String value) {
            addCriterion("mobile_encrypt <>", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptGreaterThan(String value) {
            addCriterion("mobile_encrypt >", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_encrypt >=", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptLessThan(String value) {
            addCriterion("mobile_encrypt <", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptLessThanOrEqualTo(String value) {
            addCriterion("mobile_encrypt <=", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptLike(String value) {
            addCriterion("mobile_encrypt like", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptNotLike(String value) {
            addCriterion("mobile_encrypt not like", value, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptIn(List<String> values) {
            addCriterion("mobile_encrypt in", values, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptNotIn(List<String> values) {
            addCriterion("mobile_encrypt not in", values, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptBetween(String value1, String value2) {
            addCriterion("mobile_encrypt between", value1, value2, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andMobileEncryptNotBetween(String value1, String value2) {
            addCriterion("mobile_encrypt not between", value1, value2, "mobileEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptIsNull() {
            addCriterion("email_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptIsNotNull() {
            addCriterion("email_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptEqualTo(String value) {
            addCriterion("email_encrypt =", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptNotEqualTo(String value) {
            addCriterion("email_encrypt <>", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptGreaterThan(String value) {
            addCriterion("email_encrypt >", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("email_encrypt >=", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptLessThan(String value) {
            addCriterion("email_encrypt <", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptLessThanOrEqualTo(String value) {
            addCriterion("email_encrypt <=", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptLike(String value) {
            addCriterion("email_encrypt like", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptNotLike(String value) {
            addCriterion("email_encrypt not like", value, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptIn(List<String> values) {
            addCriterion("email_encrypt in", values, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptNotIn(List<String> values) {
            addCriterion("email_encrypt not in", values, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptBetween(String value1, String value2) {
            addCriterion("email_encrypt between", value1, value2, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andEmailEncryptNotBetween(String value1, String value2) {
            addCriterion("email_encrypt not between", value1, value2, "emailEncrypt");
            return (Criteria) this;
        }

        public Criteria andBestTimeIsNull() {
            addCriterion("best_time is null");
            return (Criteria) this;
        }

        public Criteria andBestTimeIsNotNull() {
            addCriterion("best_time is not null");
            return (Criteria) this;
        }

        public Criteria andBestTimeEqualTo(String value) {
            addCriterion("best_time =", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotEqualTo(String value) {
            addCriterion("best_time <>", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeGreaterThan(String value) {
            addCriterion("best_time >", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeGreaterThanOrEqualTo(String value) {
            addCriterion("best_time >=", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeLessThan(String value) {
            addCriterion("best_time <", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeLessThanOrEqualTo(String value) {
            addCriterion("best_time <=", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeLike(String value) {
            addCriterion("best_time like", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotLike(String value) {
            addCriterion("best_time not like", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeIn(List<String> values) {
            addCriterion("best_time in", values, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotIn(List<String> values) {
            addCriterion("best_time not in", values, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeBetween(String value1, String value2) {
            addCriterion("best_time between", value1, value2, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotBetween(String value1, String value2) {
            addCriterion("best_time not between", value1, value2, "bestTime");
            return (Criteria) this;
        }

        public Criteria andSignBuildingIsNull() {
            addCriterion("sign_building is null");
            return (Criteria) this;
        }

        public Criteria andSignBuildingIsNotNull() {
            addCriterion("sign_building is not null");
            return (Criteria) this;
        }

        public Criteria andSignBuildingEqualTo(String value) {
            addCriterion("sign_building =", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotEqualTo(String value) {
            addCriterion("sign_building <>", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingGreaterThan(String value) {
            addCriterion("sign_building >", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingGreaterThanOrEqualTo(String value) {
            addCriterion("sign_building >=", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingLessThan(String value) {
            addCriterion("sign_building <", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingLessThanOrEqualTo(String value) {
            addCriterion("sign_building <=", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingLike(String value) {
            addCriterion("sign_building like", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotLike(String value) {
            addCriterion("sign_building not like", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingIn(List<String> values) {
            addCriterion("sign_building in", values, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotIn(List<String> values) {
            addCriterion("sign_building not in", values, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingBetween(String value1, String value2) {
            addCriterion("sign_building between", value1, value2, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotBetween(String value1, String value2) {
            addCriterion("sign_building not between", value1, value2, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNull() {
            addCriterion("postscript is null");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNotNull() {
            addCriterion("postscript is not null");
            return (Criteria) this;
        }

        public Criteria andPostscriptEqualTo(String value) {
            addCriterion("postscript =", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotEqualTo(String value) {
            addCriterion("postscript <>", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThan(String value) {
            addCriterion("postscript >", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThanOrEqualTo(String value) {
            addCriterion("postscript >=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThan(String value) {
            addCriterion("postscript <", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThanOrEqualTo(String value) {
            addCriterion("postscript <=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLike(String value) {
            addCriterion("postscript like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotLike(String value) {
            addCriterion("postscript not like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptIn(List<String> values) {
            addCriterion("postscript in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotIn(List<String> values) {
            addCriterion("postscript not in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptBetween(String value1, String value2) {
            addCriterion("postscript between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotBetween(String value1, String value2) {
            addCriterion("postscript not between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(Byte value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(Byte value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(Byte value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(Byte value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<Byte> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<Byte> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Byte value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Byte value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Byte value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Byte value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Byte value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Byte> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Byte> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Byte value1, Byte value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNull() {
            addCriterion("pay_name is null");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNotNull() {
            addCriterion("pay_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayNameEqualTo(String value) {
            addCriterion("pay_name =", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotEqualTo(String value) {
            addCriterion("pay_name <>", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThan(String value) {
            addCriterion("pay_name >", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_name >=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThan(String value) {
            addCriterion("pay_name <", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_name <=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLike(String value) {
            addCriterion("pay_name like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotLike(String value) {
            addCriterion("pay_name not like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameIn(List<String> values) {
            addCriterion("pay_name in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotIn(List<String> values) {
            addCriterion("pay_name not in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameBetween(String value1, String value2) {
            addCriterion("pay_name between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotBetween(String value1, String value2) {
            addCriterion("pay_name not between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andHowOosIsNull() {
            addCriterion("how_oos is null");
            return (Criteria) this;
        }

        public Criteria andHowOosIsNotNull() {
            addCriterion("how_oos is not null");
            return (Criteria) this;
        }

        public Criteria andHowOosEqualTo(String value) {
            addCriterion("how_oos =", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotEqualTo(String value) {
            addCriterion("how_oos <>", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosGreaterThan(String value) {
            addCriterion("how_oos >", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosGreaterThanOrEqualTo(String value) {
            addCriterion("how_oos >=", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosLessThan(String value) {
            addCriterion("how_oos <", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosLessThanOrEqualTo(String value) {
            addCriterion("how_oos <=", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosLike(String value) {
            addCriterion("how_oos like", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotLike(String value) {
            addCriterion("how_oos not like", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosIn(List<String> values) {
            addCriterion("how_oos in", values, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotIn(List<String> values) {
            addCriterion("how_oos not in", values, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosBetween(String value1, String value2) {
            addCriterion("how_oos between", value1, value2, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotBetween(String value1, String value2) {
            addCriterion("how_oos not between", value1, value2, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowSurplusIsNull() {
            addCriterion("how_surplus is null");
            return (Criteria) this;
        }

        public Criteria andHowSurplusIsNotNull() {
            addCriterion("how_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andHowSurplusEqualTo(String value) {
            addCriterion("how_surplus =", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotEqualTo(String value) {
            addCriterion("how_surplus <>", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusGreaterThan(String value) {
            addCriterion("how_surplus >", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusGreaterThanOrEqualTo(String value) {
            addCriterion("how_surplus >=", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusLessThan(String value) {
            addCriterion("how_surplus <", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusLessThanOrEqualTo(String value) {
            addCriterion("how_surplus <=", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusLike(String value) {
            addCriterion("how_surplus like", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotLike(String value) {
            addCriterion("how_surplus not like", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusIn(List<String> values) {
            addCriterion("how_surplus in", values, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotIn(List<String> values) {
            addCriterion("how_surplus not in", values, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusBetween(String value1, String value2) {
            addCriterion("how_surplus between", value1, value2, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotBetween(String value1, String value2) {
            addCriterion("how_surplus not between", value1, value2, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andPackNameIsNull() {
            addCriterion("pack_name is null");
            return (Criteria) this;
        }

        public Criteria andPackNameIsNotNull() {
            addCriterion("pack_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackNameEqualTo(String value) {
            addCriterion("pack_name =", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotEqualTo(String value) {
            addCriterion("pack_name <>", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameGreaterThan(String value) {
            addCriterion("pack_name >", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameGreaterThanOrEqualTo(String value) {
            addCriterion("pack_name >=", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLessThan(String value) {
            addCriterion("pack_name <", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLessThanOrEqualTo(String value) {
            addCriterion("pack_name <=", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLike(String value) {
            addCriterion("pack_name like", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotLike(String value) {
            addCriterion("pack_name not like", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameIn(List<String> values) {
            addCriterion("pack_name in", values, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotIn(List<String> values) {
            addCriterion("pack_name not in", values, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameBetween(String value1, String value2) {
            addCriterion("pack_name between", value1, value2, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotBetween(String value1, String value2) {
            addCriterion("pack_name not between", value1, value2, "packName");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardMessageIsNull() {
            addCriterion("card_message is null");
            return (Criteria) this;
        }

        public Criteria andCardMessageIsNotNull() {
            addCriterion("card_message is not null");
            return (Criteria) this;
        }

        public Criteria andCardMessageEqualTo(String value) {
            addCriterion("card_message =", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotEqualTo(String value) {
            addCriterion("card_message <>", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageGreaterThan(String value) {
            addCriterion("card_message >", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageGreaterThanOrEqualTo(String value) {
            addCriterion("card_message >=", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageLessThan(String value) {
            addCriterion("card_message <", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageLessThanOrEqualTo(String value) {
            addCriterion("card_message <=", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageLike(String value) {
            addCriterion("card_message like", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotLike(String value) {
            addCriterion("card_message not like", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageIn(List<String> values) {
            addCriterion("card_message in", values, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotIn(List<String> values) {
            addCriterion("card_message not in", values, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageBetween(String value1, String value2) {
            addCriterion("card_message between", value1, value2, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotBetween(String value1, String value2) {
            addCriterion("card_message not between", value1, value2, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andInvPayeeIsNull() {
            addCriterion("inv_payee is null");
            return (Criteria) this;
        }

        public Criteria andInvPayeeIsNotNull() {
            addCriterion("inv_payee is not null");
            return (Criteria) this;
        }

        public Criteria andInvPayeeEqualTo(String value) {
            addCriterion("inv_payee =", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotEqualTo(String value) {
            addCriterion("inv_payee <>", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeGreaterThan(String value) {
            addCriterion("inv_payee >", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("inv_payee >=", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeLessThan(String value) {
            addCriterion("inv_payee <", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeLessThanOrEqualTo(String value) {
            addCriterion("inv_payee <=", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeLike(String value) {
            addCriterion("inv_payee like", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotLike(String value) {
            addCriterion("inv_payee not like", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeIn(List<String> values) {
            addCriterion("inv_payee in", values, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotIn(List<String> values) {
            addCriterion("inv_payee not in", values, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeBetween(String value1, String value2) {
            addCriterion("inv_payee between", value1, value2, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotBetween(String value1, String value2) {
            addCriterion("inv_payee not between", value1, value2, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvContentIsNull() {
            addCriterion("inv_content is null");
            return (Criteria) this;
        }

        public Criteria andInvContentIsNotNull() {
            addCriterion("inv_content is not null");
            return (Criteria) this;
        }

        public Criteria andInvContentEqualTo(String value) {
            addCriterion("inv_content =", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotEqualTo(String value) {
            addCriterion("inv_content <>", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentGreaterThan(String value) {
            addCriterion("inv_content >", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentGreaterThanOrEqualTo(String value) {
            addCriterion("inv_content >=", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentLessThan(String value) {
            addCriterion("inv_content <", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentLessThanOrEqualTo(String value) {
            addCriterion("inv_content <=", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentLike(String value) {
            addCriterion("inv_content like", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotLike(String value) {
            addCriterion("inv_content not like", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentIn(List<String> values) {
            addCriterion("inv_content in", values, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotIn(List<String> values) {
            addCriterion("inv_content not in", values, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentBetween(String value1, String value2) {
            addCriterion("inv_content between", value1, value2, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotBetween(String value1, String value2) {
            addCriterion("inv_content not between", value1, value2, "invContent");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(BigDecimal value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeIsNull() {
            addCriterion("insure_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsureFeeIsNotNull() {
            addCriterion("insure_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsureFeeEqualTo(BigDecimal value) {
            addCriterion("insure_fee =", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeNotEqualTo(BigDecimal value) {
            addCriterion("insure_fee <>", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeGreaterThan(BigDecimal value) {
            addCriterion("insure_fee >", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_fee >=", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeLessThan(BigDecimal value) {
            addCriterion("insure_fee <", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_fee <=", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeIn(List<BigDecimal> values) {
            addCriterion("insure_fee in", values, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeNotIn(List<BigDecimal> values) {
            addCriterion("insure_fee not in", values, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_fee between", value1, value2, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_fee not between", value1, value2, "insureFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(BigDecimal value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(BigDecimal value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(BigDecimal value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<BigDecimal> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeIsNull() {
            addCriterion("pack_fee is null");
            return (Criteria) this;
        }

        public Criteria andPackFeeIsNotNull() {
            addCriterion("pack_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPackFeeEqualTo(BigDecimal value) {
            addCriterion("pack_fee =", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotEqualTo(BigDecimal value) {
            addCriterion("pack_fee <>", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeGreaterThan(BigDecimal value) {
            addCriterion("pack_fee >", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pack_fee >=", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeLessThan(BigDecimal value) {
            addCriterion("pack_fee <", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pack_fee <=", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeIn(List<BigDecimal> values) {
            addCriterion("pack_fee in", values, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotIn(List<BigDecimal> values) {
            addCriterion("pack_fee not in", values, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pack_fee between", value1, value2, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pack_fee not between", value1, value2, "packFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeIsNull() {
            addCriterion("card_fee is null");
            return (Criteria) this;
        }

        public Criteria andCardFeeIsNotNull() {
            addCriterion("card_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCardFeeEqualTo(BigDecimal value) {
            addCriterion("card_fee =", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotEqualTo(BigDecimal value) {
            addCriterion("card_fee <>", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeGreaterThan(BigDecimal value) {
            addCriterion("card_fee >", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("card_fee >=", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeLessThan(BigDecimal value) {
            addCriterion("card_fee <", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("card_fee <=", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeIn(List<BigDecimal> values) {
            addCriterion("card_fee in", values, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotIn(List<BigDecimal> values) {
            addCriterion("card_fee not in", values, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_fee between", value1, value2, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_fee not between", value1, value2, "cardFee");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidIsNull() {
            addCriterion("money_paid is null");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidIsNotNull() {
            addCriterion("money_paid is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidEqualTo(BigDecimal value) {
            addCriterion("money_paid =", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidNotEqualTo(BigDecimal value) {
            addCriterion("money_paid <>", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidGreaterThan(BigDecimal value) {
            addCriterion("money_paid >", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_paid >=", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidLessThan(BigDecimal value) {
            addCriterion("money_paid <", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_paid <=", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidIn(List<BigDecimal> values) {
            addCriterion("money_paid in", values, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidNotIn(List<BigDecimal> values) {
            addCriterion("money_paid not in", values, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_paid between", value1, value2, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_paid not between", value1, value2, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNull() {
            addCriterion("surplus is null");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNotNull() {
            addCriterion("surplus is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusEqualTo(String value) {
            addCriterion("surplus =", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotEqualTo(String value) {
            addCriterion("surplus <>", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThan(String value) {
            addCriterion("surplus >", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThanOrEqualTo(String value) {
            addCriterion("surplus >=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThan(String value) {
            addCriterion("surplus <", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThanOrEqualTo(String value) {
            addCriterion("surplus <=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLike(String value) {
            addCriterion("surplus like", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotLike(String value) {
            addCriterion("surplus not like", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusIn(List<String> values) {
            addCriterion("surplus in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotIn(List<String> values) {
            addCriterion("surplus not in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusBetween(String value1, String value2) {
            addCriterion("surplus between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotBetween(String value1, String value2) {
            addCriterion("surplus not between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(String value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(String value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(String value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(String value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(String value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLike(String value) {
            addCriterion("integral like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotLike(String value) {
            addCriterion("integral not like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<String> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<String> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(String value1, String value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(String value1, String value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIsNull() {
            addCriterion("integral_money is null");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIsNotNull() {
            addCriterion("integral_money is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyEqualTo(String value) {
            addCriterion("integral_money =", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotEqualTo(String value) {
            addCriterion("integral_money <>", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyGreaterThan(String value) {
            addCriterion("integral_money >", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("integral_money >=", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyLessThan(String value) {
            addCriterion("integral_money <", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyLessThanOrEqualTo(String value) {
            addCriterion("integral_money <=", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyLike(String value) {
            addCriterion("integral_money like", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotLike(String value) {
            addCriterion("integral_money not like", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIn(List<String> values) {
            addCriterion("integral_money in", values, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotIn(List<String> values) {
            addCriterion("integral_money not in", values, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyBetween(String value1, String value2) {
            addCriterion("integral_money between", value1, value2, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotBetween(String value1, String value2) {
            addCriterion("integral_money not between", value1, value2, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(String value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(String value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(String value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(String value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(String value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(String value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLike(String value) {
            addCriterion("bonus like", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotLike(String value) {
            addCriterion("bonus not like", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<String> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<String> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(String value1, String value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(String value1, String value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andFromAdIsNull() {
            addCriterion("from_ad is null");
            return (Criteria) this;
        }

        public Criteria andFromAdIsNotNull() {
            addCriterion("from_ad is not null");
            return (Criteria) this;
        }

        public Criteria andFromAdEqualTo(Short value) {
            addCriterion("from_ad =", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdNotEqualTo(Short value) {
            addCriterion("from_ad <>", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdGreaterThan(Short value) {
            addCriterion("from_ad >", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdGreaterThanOrEqualTo(Short value) {
            addCriterion("from_ad >=", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdLessThan(Short value) {
            addCriterion("from_ad <", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdLessThanOrEqualTo(Short value) {
            addCriterion("from_ad <=", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdIn(List<Short> values) {
            addCriterion("from_ad in", values, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdNotIn(List<Short> values) {
            addCriterion("from_ad not in", values, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdBetween(Short value1, Short value2) {
            addCriterion("from_ad between", value1, value2, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdNotBetween(Short value1, Short value2) {
            addCriterion("from_ad not between", value1, value2, "fromAd");
            return (Criteria) this;
        }

        public Criteria andRefererIsNull() {
            addCriterion("referer is null");
            return (Criteria) this;
        }

        public Criteria andRefererIsNotNull() {
            addCriterion("referer is not null");
            return (Criteria) this;
        }

        public Criteria andRefererEqualTo(String value) {
            addCriterion("referer =", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotEqualTo(String value) {
            addCriterion("referer <>", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThan(String value) {
            addCriterion("referer >", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThanOrEqualTo(String value) {
            addCriterion("referer >=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThan(String value) {
            addCriterion("referer <", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThanOrEqualTo(String value) {
            addCriterion("referer <=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLike(String value) {
            addCriterion("referer like", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotLike(String value) {
            addCriterion("referer not like", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererIn(List<String> values) {
            addCriterion("referer in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotIn(List<String> values) {
            addCriterion("referer not in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererBetween(String value1, String value2) {
            addCriterion("referer between", value1, value2, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotBetween(String value1, String value2) {
            addCriterion("referer not between", value1, value2, "referer");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Integer value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Integer value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Integer value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Integer value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Integer> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Integer> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeIsNull() {
            addCriterion("prepay_time is null");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeIsNotNull() {
            addCriterion("prepay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeEqualTo(Integer value) {
            addCriterion("prepay_time =", value, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeNotEqualTo(Integer value) {
            addCriterion("prepay_time <>", value, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeGreaterThan(Integer value) {
            addCriterion("prepay_time >", value, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("prepay_time >=", value, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeLessThan(Integer value) {
            addCriterion("prepay_time <", value, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("prepay_time <=", value, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeIn(List<Integer> values) {
            addCriterion("prepay_time in", values, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeNotIn(List<Integer> values) {
            addCriterion("prepay_time not in", values, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeBetween(Integer value1, Integer value2) {
            addCriterion("prepay_time between", value1, value2, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andPrepayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("prepay_time not between", value1, value2, "prepayTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(Integer value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(Integer value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(Integer value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(Integer value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<Integer> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<Integer> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNull() {
            addCriterion("pack_id is null");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNotNull() {
            addCriterion("pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackIdEqualTo(Byte value) {
            addCriterion("pack_id =", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotEqualTo(Byte value) {
            addCriterion("pack_id <>", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThan(Byte value) {
            addCriterion("pack_id >", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("pack_id >=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThan(Byte value) {
            addCriterion("pack_id <", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThanOrEqualTo(Byte value) {
            addCriterion("pack_id <=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdIn(List<Byte> values) {
            addCriterion("pack_id in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotIn(List<Byte> values) {
            addCriterion("pack_id not in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdBetween(Byte value1, Byte value2) {
            addCriterion("pack_id between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotBetween(Byte value1, Byte value2) {
            addCriterion("pack_id not between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Byte value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Byte value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Byte value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Byte value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Byte value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Byte> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Byte> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Byte value1, Byte value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Byte value1, Byte value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andBonusIdIsNull() {
            addCriterion("bonus_id is null");
            return (Criteria) this;
        }

        public Criteria andBonusIdIsNotNull() {
            addCriterion("bonus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonusIdEqualTo(Short value) {
            addCriterion("bonus_id =", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotEqualTo(Short value) {
            addCriterion("bonus_id <>", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThan(Short value) {
            addCriterion("bonus_id >", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThanOrEqualTo(Short value) {
            addCriterion("bonus_id >=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThan(Short value) {
            addCriterion("bonus_id <", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThanOrEqualTo(Short value) {
            addCriterion("bonus_id <=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdIn(List<Short> values) {
            addCriterion("bonus_id in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotIn(List<Short> values) {
            addCriterion("bonus_id not in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdBetween(Short value1, Short value2) {
            addCriterion("bonus_id between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotBetween(Short value1, Short value2) {
            addCriterion("bonus_id not between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIsNull() {
            addCriterion("extension_code is null");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIsNotNull() {
            addCriterion("extension_code is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeEqualTo(String value) {
            addCriterion("extension_code =", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotEqualTo(String value) {
            addCriterion("extension_code <>", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeGreaterThan(String value) {
            addCriterion("extension_code >", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("extension_code >=", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLessThan(String value) {
            addCriterion("extension_code <", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLessThanOrEqualTo(String value) {
            addCriterion("extension_code <=", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLike(String value) {
            addCriterion("extension_code like", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotLike(String value) {
            addCriterion("extension_code not like", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIn(List<String> values) {
            addCriterion("extension_code in", values, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotIn(List<String> values) {
            addCriterion("extension_code not in", values, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeBetween(String value1, String value2) {
            addCriterion("extension_code between", value1, value2, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotBetween(String value1, String value2) {
            addCriterion("extension_code not between", value1, value2, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionIdIsNull() {
            addCriterion("extension_id is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIdIsNotNull() {
            addCriterion("extension_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionIdEqualTo(Integer value) {
            addCriterion("extension_id =", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdNotEqualTo(Integer value) {
            addCriterion("extension_id <>", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdGreaterThan(Integer value) {
            addCriterion("extension_id >", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("extension_id >=", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdLessThan(Integer value) {
            addCriterion("extension_id <", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdLessThanOrEqualTo(Integer value) {
            addCriterion("extension_id <=", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdIn(List<Integer> values) {
            addCriterion("extension_id in", values, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdNotIn(List<Integer> values) {
            addCriterion("extension_id not in", values, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdBetween(Integer value1, Integer value2) {
            addCriterion("extension_id between", value1, value2, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("extension_id not between", value1, value2, "extensionId");
            return (Criteria) this;
        }

        public Criteria andToBuyerIsNull() {
            addCriterion("to_buyer is null");
            return (Criteria) this;
        }

        public Criteria andToBuyerIsNotNull() {
            addCriterion("to_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andToBuyerEqualTo(String value) {
            addCriterion("to_buyer =", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotEqualTo(String value) {
            addCriterion("to_buyer <>", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerGreaterThan(String value) {
            addCriterion("to_buyer >", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("to_buyer >=", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerLessThan(String value) {
            addCriterion("to_buyer <", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerLessThanOrEqualTo(String value) {
            addCriterion("to_buyer <=", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerLike(String value) {
            addCriterion("to_buyer like", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotLike(String value) {
            addCriterion("to_buyer not like", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerIn(List<String> values) {
            addCriterion("to_buyer in", values, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotIn(List<String> values) {
            addCriterion("to_buyer not in", values, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerBetween(String value1, String value2) {
            addCriterion("to_buyer between", value1, value2, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotBetween(String value1, String value2) {
            addCriterion("to_buyer not between", value1, value2, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andPayNoteIsNull() {
            addCriterion("pay_note is null");
            return (Criteria) this;
        }

        public Criteria andPayNoteIsNotNull() {
            addCriterion("pay_note is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoteEqualTo(String value) {
            addCriterion("pay_note =", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotEqualTo(String value) {
            addCriterion("pay_note <>", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteGreaterThan(String value) {
            addCriterion("pay_note >", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteGreaterThanOrEqualTo(String value) {
            addCriterion("pay_note >=", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteLessThan(String value) {
            addCriterion("pay_note <", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteLessThanOrEqualTo(String value) {
            addCriterion("pay_note <=", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteLike(String value) {
            addCriterion("pay_note like", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotLike(String value) {
            addCriterion("pay_note not like", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteIn(List<String> values) {
            addCriterion("pay_note in", values, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotIn(List<String> values) {
            addCriterion("pay_note not in", values, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteBetween(String value1, String value2) {
            addCriterion("pay_note between", value1, value2, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotBetween(String value1, String value2) {
            addCriterion("pay_note not between", value1, value2, "payNote");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(Short value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(Short value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(Short value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(Short value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(Short value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(Short value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<Short> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<Short> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(Short value1, Short value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(Short value1, Short value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andInvTypeIsNull() {
            addCriterion("inv_type is null");
            return (Criteria) this;
        }

        public Criteria andInvTypeIsNotNull() {
            addCriterion("inv_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvTypeEqualTo(String value) {
            addCriterion("inv_type =", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotEqualTo(String value) {
            addCriterion("inv_type <>", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeGreaterThan(String value) {
            addCriterion("inv_type >", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeGreaterThanOrEqualTo(String value) {
            addCriterion("inv_type >=", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeLessThan(String value) {
            addCriterion("inv_type <", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeLessThanOrEqualTo(String value) {
            addCriterion("inv_type <=", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeLike(String value) {
            addCriterion("inv_type like", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotLike(String value) {
            addCriterion("inv_type not like", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeIn(List<String> values) {
            addCriterion("inv_type in", values, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotIn(List<String> values) {
            addCriterion("inv_type not in", values, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeBetween(String value1, String value2) {
            addCriterion("inv_type between", value1, value2, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotBetween(String value1, String value2) {
            addCriterion("inv_type not between", value1, value2, "invType");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andIsSeparateIsNull() {
            addCriterion("is_separate is null");
            return (Criteria) this;
        }

        public Criteria andIsSeparateIsNotNull() {
            addCriterion("is_separate is not null");
            return (Criteria) this;
        }

        public Criteria andIsSeparateEqualTo(Boolean value) {
            addCriterion("is_separate =", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateNotEqualTo(Boolean value) {
            addCriterion("is_separate <>", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateGreaterThan(Boolean value) {
            addCriterion("is_separate >", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_separate >=", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateLessThan(Boolean value) {
            addCriterion("is_separate <", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_separate <=", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateIn(List<Boolean> values) {
            addCriterion("is_separate in", values, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateNotIn(List<Boolean> values) {
            addCriterion("is_separate not in", values, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_separate between", value1, value2, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_separate not between", value1, value2, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(Boolean value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Boolean value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Boolean value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Boolean value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Boolean> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Boolean> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeIsNull() {
            addCriterion("outlet_type is null");
            return (Criteria) this;
        }

        public Criteria andOutletTypeIsNotNull() {
            addCriterion("outlet_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutletTypeEqualTo(Boolean value) {
            addCriterion("outlet_type =", value, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeNotEqualTo(Boolean value) {
            addCriterion("outlet_type <>", value, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeGreaterThan(Boolean value) {
            addCriterion("outlet_type >", value, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("outlet_type >=", value, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeLessThan(Boolean value) {
            addCriterion("outlet_type <", value, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("outlet_type <=", value, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeIn(List<Boolean> values) {
            addCriterion("outlet_type in", values, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeNotIn(List<Boolean> values) {
            addCriterion("outlet_type not in", values, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("outlet_type between", value1, value2, "outletType");
            return (Criteria) this;
        }

        public Criteria andOutletTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("outlet_type not between", value1, value2, "outletType");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(Boolean value) {
            addCriterion("invoice_status =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(Boolean value) {
            addCriterion("invoice_status <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(Boolean value) {
            addCriterion("invoice_status >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("invoice_status >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(Boolean value) {
            addCriterion("invoice_status <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("invoice_status <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<Boolean> values) {
            addCriterion("invoice_status in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<Boolean> values) {
            addCriterion("invoice_status not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_status between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_status not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdIsNull() {
            addCriterion("delivery_station_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdIsNotNull() {
            addCriterion("delivery_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdEqualTo(Integer value) {
            addCriterion("delivery_station_id =", value, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdNotEqualTo(Integer value) {
            addCriterion("delivery_station_id <>", value, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdGreaterThan(Integer value) {
            addCriterion("delivery_station_id >", value, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_station_id >=", value, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdLessThan(Integer value) {
            addCriterion("delivery_station_id <", value, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_station_id <=", value, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdIn(List<Integer> values) {
            addCriterion("delivery_station_id in", values, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdNotIn(List<Integer> values) {
            addCriterion("delivery_station_id not in", values, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_station_id between", value1, value2, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_station_id not between", value1, value2, "deliveryStationId");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("lock_status is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("lock_status is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(Integer value) {
            addCriterion("lock_status =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(Integer value) {
            addCriterion("lock_status <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(Integer value) {
            addCriterion("lock_status >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_status >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(Integer value) {
            addCriterion("lock_status <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lock_status <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<Integer> values) {
            addCriterion("lock_status in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<Integer> values) {
            addCriterion("lock_status not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(Integer value1, Integer value2) {
            addCriterion("lock_status between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_status not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andRjIsNull() {
            addCriterion("rj is null");
            return (Criteria) this;
        }

        public Criteria andRjIsNotNull() {
            addCriterion("rj is not null");
            return (Criteria) this;
        }

        public Criteria andRjEqualTo(Integer value) {
            addCriterion("rj =", value, "rj");
            return (Criteria) this;
        }

        public Criteria andRjNotEqualTo(Integer value) {
            addCriterion("rj <>", value, "rj");
            return (Criteria) this;
        }

        public Criteria andRjGreaterThan(Integer value) {
            addCriterion("rj >", value, "rj");
            return (Criteria) this;
        }

        public Criteria andRjGreaterThanOrEqualTo(Integer value) {
            addCriterion("rj >=", value, "rj");
            return (Criteria) this;
        }

        public Criteria andRjLessThan(Integer value) {
            addCriterion("rj <", value, "rj");
            return (Criteria) this;
        }

        public Criteria andRjLessThanOrEqualTo(Integer value) {
            addCriterion("rj <=", value, "rj");
            return (Criteria) this;
        }

        public Criteria andRjIn(List<Integer> values) {
            addCriterion("rj in", values, "rj");
            return (Criteria) this;
        }

        public Criteria andRjNotIn(List<Integer> values) {
            addCriterion("rj not in", values, "rj");
            return (Criteria) this;
        }

        public Criteria andRjBetween(Integer value1, Integer value2) {
            addCriterion("rj between", value1, value2, "rj");
            return (Criteria) this;
        }

        public Criteria andRjNotBetween(Integer value1, Integer value2) {
            addCriterion("rj not between", value1, value2, "rj");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNull() {
            addCriterion("order_from is null");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNotNull() {
            addCriterion("order_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFromEqualTo(Boolean value) {
            addCriterion("order_from =", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotEqualTo(Boolean value) {
            addCriterion("order_from <>", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThan(Boolean value) {
            addCriterion("order_from >", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_from >=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThan(Boolean value) {
            addCriterion("order_from <", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThanOrEqualTo(Boolean value) {
            addCriterion("order_from <=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromIn(List<Boolean> values) {
            addCriterion("order_from in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotIn(List<Boolean> values) {
            addCriterion("order_from not in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromBetween(Boolean value1, Boolean value2) {
            addCriterion("order_from between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_from not between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNull() {
            addCriterion("process_status is null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNotNull() {
            addCriterion("process_status is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusEqualTo(Boolean value) {
            addCriterion("process_status =", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotEqualTo(Boolean value) {
            addCriterion("process_status <>", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThan(Boolean value) {
            addCriterion("process_status >", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("process_status >=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThan(Boolean value) {
            addCriterion("process_status <", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("process_status <=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIn(List<Boolean> values) {
            addCriterion("process_status in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotIn(List<Boolean> values) {
            addCriterion("process_status not in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("process_status between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("process_status not between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andShippingDaysIsNull() {
            addCriterion("shipping_days is null");
            return (Criteria) this;
        }

        public Criteria andShippingDaysIsNotNull() {
            addCriterion("shipping_days is not null");
            return (Criteria) this;
        }

        public Criteria andShippingDaysEqualTo(Byte value) {
            addCriterion("shipping_days =", value, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysNotEqualTo(Byte value) {
            addCriterion("shipping_days <>", value, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysGreaterThan(Byte value) {
            addCriterion("shipping_days >", value, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_days >=", value, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysLessThan(Byte value) {
            addCriterion("shipping_days <", value, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_days <=", value, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysIn(List<Byte> values) {
            addCriterion("shipping_days in", values, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysNotIn(List<Byte> values) {
            addCriterion("shipping_days not in", values, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysBetween(Byte value1, Byte value2) {
            addCriterion("shipping_days between", value1, value2, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andShippingDaysNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_days not between", value1, value2, "shippingDays");
            return (Criteria) this;
        }

        public Criteria andRangeStatusIsNull() {
            addCriterion("range_status is null");
            return (Criteria) this;
        }

        public Criteria andRangeStatusIsNotNull() {
            addCriterion("range_status is not null");
            return (Criteria) this;
        }

        public Criteria andRangeStatusEqualTo(Boolean value) {
            addCriterion("range_status =", value, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusNotEqualTo(Boolean value) {
            addCriterion("range_status <>", value, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusGreaterThan(Boolean value) {
            addCriterion("range_status >", value, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("range_status >=", value, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusLessThan(Boolean value) {
            addCriterion("range_status <", value, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("range_status <=", value, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusIn(List<Boolean> values) {
            addCriterion("range_status in", values, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusNotIn(List<Boolean> values) {
            addCriterion("range_status not in", values, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("range_status between", value1, value2, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andRangeStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("range_status not between", value1, value2, "rangeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNull() {
            addCriterion("return_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNotNull() {
            addCriterion("return_status is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusEqualTo(Boolean value) {
            addCriterion("return_status =", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotEqualTo(Boolean value) {
            addCriterion("return_status <>", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThan(Boolean value) {
            addCriterion("return_status >", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("return_status >=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThan(Boolean value) {
            addCriterion("return_status <", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("return_status <=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIn(List<Boolean> values) {
            addCriterion("return_status in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotIn(List<Boolean> values) {
            addCriterion("return_status not in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("return_status between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("return_status not between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Boolean value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Boolean value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Boolean value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Boolean value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Boolean> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Boolean> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRangeTimeIsNull() {
            addCriterion("range_time is null");
            return (Criteria) this;
        }

        public Criteria andRangeTimeIsNotNull() {
            addCriterion("range_time is not null");
            return (Criteria) this;
        }

        public Criteria andRangeTimeEqualTo(Integer value) {
            addCriterion("range_time =", value, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeNotEqualTo(Integer value) {
            addCriterion("range_time <>", value, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeGreaterThan(Integer value) {
            addCriterion("range_time >", value, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("range_time >=", value, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeLessThan(Integer value) {
            addCriterion("range_time <", value, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("range_time <=", value, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeIn(List<Integer> values) {
            addCriterion("range_time in", values, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeNotIn(List<Integer> values) {
            addCriterion("range_time not in", values, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeBetween(Integer value1, Integer value2) {
            addCriterion("range_time between", value1, value2, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andRangeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("range_time not between", value1, value2, "rangeTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Integer value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Integer value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Integer value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Integer value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Integer> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Integer> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockIsNull() {
            addCriterion("occupied_stock is null");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockIsNotNull() {
            addCriterion("occupied_stock is not null");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockEqualTo(Boolean value) {
            addCriterion("occupied_stock =", value, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockNotEqualTo(Boolean value) {
            addCriterion("occupied_stock <>", value, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockGreaterThan(Boolean value) {
            addCriterion("occupied_stock >", value, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("occupied_stock >=", value, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockLessThan(Boolean value) {
            addCriterion("occupied_stock <", value, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockLessThanOrEqualTo(Boolean value) {
            addCriterion("occupied_stock <=", value, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockIn(List<Boolean> values) {
            addCriterion("occupied_stock in", values, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockNotIn(List<Boolean> values) {
            addCriterion("occupied_stock not in", values, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockBetween(Boolean value1, Boolean value2) {
            addCriterion("occupied_stock between", value1, value2, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("occupied_stock not between", value1, value2, "occupiedStock");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableIsNull() {
            addCriterion("occupied_available is null");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableIsNotNull() {
            addCriterion("occupied_available is not null");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableEqualTo(Boolean value) {
            addCriterion("occupied_available =", value, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableNotEqualTo(Boolean value) {
            addCriterion("occupied_available <>", value, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableGreaterThan(Boolean value) {
            addCriterion("occupied_available >", value, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("occupied_available >=", value, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableLessThan(Boolean value) {
            addCriterion("occupied_available <", value, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableLessThanOrEqualTo(Boolean value) {
            addCriterion("occupied_available <=", value, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableIn(List<Boolean> values) {
            addCriterion("occupied_available in", values, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableNotIn(List<Boolean> values) {
            addCriterion("occupied_available not in", values, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableBetween(Boolean value1, Boolean value2) {
            addCriterion("occupied_available between", value1, value2, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andOccupiedAvailableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("occupied_available not between", value1, value2, "occupiedAvailable");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusIsNull() {
            addCriterion("question_status is null");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusIsNotNull() {
            addCriterion("question_status is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusEqualTo(Boolean value) {
            addCriterion("question_status =", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusNotEqualTo(Boolean value) {
            addCriterion("question_status <>", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusGreaterThan(Boolean value) {
            addCriterion("question_status >", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("question_status >=", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusLessThan(Boolean value) {
            addCriterion("question_status <", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("question_status <=", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusIn(List<Boolean> values) {
            addCriterion("question_status in", values, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusNotIn(List<Boolean> values) {
            addCriterion("question_status not in", values, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("question_status between", value1, value2, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("question_status not between", value1, value2, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNull() {
            addCriterion("question_time is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNotNull() {
            addCriterion("question_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeEqualTo(Integer value) {
            addCriterion("question_time =", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotEqualTo(Integer value) {
            addCriterion("question_time <>", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThan(Integer value) {
            addCriterion("question_time >", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_time >=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThan(Integer value) {
            addCriterion("question_time <", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThanOrEqualTo(Integer value) {
            addCriterion("question_time <=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIn(List<Integer> values) {
            addCriterion("question_time in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotIn(List<Integer> values) {
            addCriterion("question_time not in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeBetween(Integer value1, Integer value2) {
            addCriterion("question_time between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("question_time not between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andMergeFromIsNull() {
            addCriterion("merge_from is null");
            return (Criteria) this;
        }

        public Criteria andMergeFromIsNotNull() {
            addCriterion("merge_from is not null");
            return (Criteria) this;
        }

        public Criteria andMergeFromEqualTo(String value) {
            addCriterion("merge_from =", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromNotEqualTo(String value) {
            addCriterion("merge_from <>", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromGreaterThan(String value) {
            addCriterion("merge_from >", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromGreaterThanOrEqualTo(String value) {
            addCriterion("merge_from >=", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromLessThan(String value) {
            addCriterion("merge_from <", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromLessThanOrEqualTo(String value) {
            addCriterion("merge_from <=", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromLike(String value) {
            addCriterion("merge_from like", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromNotLike(String value) {
            addCriterion("merge_from not like", value, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromIn(List<String> values) {
            addCriterion("merge_from in", values, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromNotIn(List<String> values) {
            addCriterion("merge_from not in", values, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromBetween(String value1, String value2) {
            addCriterion("merge_from between", value1, value2, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andMergeFromNotBetween(String value1, String value2) {
            addCriterion("merge_from not between", value1, value2, "mergeFrom");
            return (Criteria) this;
        }

        public Criteria andSplitToIsNull() {
            addCriterion("split_to is null");
            return (Criteria) this;
        }

        public Criteria andSplitToIsNotNull() {
            addCriterion("split_to is not null");
            return (Criteria) this;
        }

        public Criteria andSplitToEqualTo(String value) {
            addCriterion("split_to =", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToNotEqualTo(String value) {
            addCriterion("split_to <>", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToGreaterThan(String value) {
            addCriterion("split_to >", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToGreaterThanOrEqualTo(String value) {
            addCriterion("split_to >=", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToLessThan(String value) {
            addCriterion("split_to <", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToLessThanOrEqualTo(String value) {
            addCriterion("split_to <=", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToLike(String value) {
            addCriterion("split_to like", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToNotLike(String value) {
            addCriterion("split_to not like", value, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToIn(List<String> values) {
            addCriterion("split_to in", values, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToNotIn(List<String> values) {
            addCriterion("split_to not in", values, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToBetween(String value1, String value2) {
            addCriterion("split_to between", value1, value2, "splitTo");
            return (Criteria) this;
        }

        public Criteria andSplitToNotBetween(String value1, String value2) {
            addCriterion("split_to not between", value1, value2, "splitTo");
            return (Criteria) this;
        }

        public Criteria andIsWeighIsNull() {
            addCriterion("is_weigh is null");
            return (Criteria) this;
        }

        public Criteria andIsWeighIsNotNull() {
            addCriterion("is_weigh is not null");
            return (Criteria) this;
        }

        public Criteria andIsWeighEqualTo(Boolean value) {
            addCriterion("is_weigh =", value, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighNotEqualTo(Boolean value) {
            addCriterion("is_weigh <>", value, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighGreaterThan(Boolean value) {
            addCriterion("is_weigh >", value, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_weigh >=", value, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighLessThan(Boolean value) {
            addCriterion("is_weigh <", value, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighLessThanOrEqualTo(Boolean value) {
            addCriterion("is_weigh <=", value, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighIn(List<Boolean> values) {
            addCriterion("is_weigh in", values, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighNotIn(List<Boolean> values) {
            addCriterion("is_weigh not in", values, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighBetween(Boolean value1, Boolean value2) {
            addCriterion("is_weigh between", value1, value2, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andIsWeighNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_weigh not between", value1, value2, "isWeigh");
            return (Criteria) this;
        }

        public Criteria andWeighIsNull() {
            addCriterion("weigh is null");
            return (Criteria) this;
        }

        public Criteria andWeighIsNotNull() {
            addCriterion("weigh is not null");
            return (Criteria) this;
        }

        public Criteria andWeighEqualTo(String value) {
            addCriterion("weigh =", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighNotEqualTo(String value) {
            addCriterion("weigh <>", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighGreaterThan(String value) {
            addCriterion("weigh >", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighGreaterThanOrEqualTo(String value) {
            addCriterion("weigh >=", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighLessThan(String value) {
            addCriterion("weigh <", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighLessThanOrEqualTo(String value) {
            addCriterion("weigh <=", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighLike(String value) {
            addCriterion("weigh like", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighNotLike(String value) {
            addCriterion("weigh not like", value, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighIn(List<String> values) {
            addCriterion("weigh in", values, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighNotIn(List<String> values) {
            addCriterion("weigh not in", values, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighBetween(String value1, String value2) {
            addCriterion("weigh between", value1, value2, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighNotBetween(String value1, String value2) {
            addCriterion("weigh not between", value1, value2, "weigh");
            return (Criteria) this;
        }

        public Criteria andWeighBriefIsNull() {
            addCriterion("weigh_brief is null");
            return (Criteria) this;
        }

        public Criteria andWeighBriefIsNotNull() {
            addCriterion("weigh_brief is not null");
            return (Criteria) this;
        }

        public Criteria andWeighBriefEqualTo(String value) {
            addCriterion("weigh_brief =", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefNotEqualTo(String value) {
            addCriterion("weigh_brief <>", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefGreaterThan(String value) {
            addCriterion("weigh_brief >", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefGreaterThanOrEqualTo(String value) {
            addCriterion("weigh_brief >=", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefLessThan(String value) {
            addCriterion("weigh_brief <", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefLessThanOrEqualTo(String value) {
            addCriterion("weigh_brief <=", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefLike(String value) {
            addCriterion("weigh_brief like", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefNotLike(String value) {
            addCriterion("weigh_brief not like", value, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefIn(List<String> values) {
            addCriterion("weigh_brief in", values, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefNotIn(List<String> values) {
            addCriterion("weigh_brief not in", values, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefBetween(String value1, String value2) {
            addCriterion("weigh_brief between", value1, value2, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andWeighBriefNotBetween(String value1, String value2) {
            addCriterion("weigh_brief not between", value1, value2, "weighBrief");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotIsNull() {
            addCriterion("chased_or_not is null");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotIsNotNull() {
            addCriterion("chased_or_not is not null");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotEqualTo(Boolean value) {
            addCriterion("chased_or_not =", value, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotNotEqualTo(Boolean value) {
            addCriterion("chased_or_not <>", value, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotGreaterThan(Boolean value) {
            addCriterion("chased_or_not >", value, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("chased_or_not >=", value, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotLessThan(Boolean value) {
            addCriterion("chased_or_not <", value, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotLessThanOrEqualTo(Boolean value) {
            addCriterion("chased_or_not <=", value, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotIn(List<Boolean> values) {
            addCriterion("chased_or_not in", values, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotNotIn(List<Boolean> values) {
            addCriterion("chased_or_not not in", values, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("chased_or_not between", value1, value2, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andChasedOrNotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("chased_or_not not between", value1, value2, "chasedOrNot");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNull() {
            addCriterion("notice_status is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNotNull() {
            addCriterion("notice_status is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusEqualTo(Boolean value) {
            addCriterion("notice_status =", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotEqualTo(Boolean value) {
            addCriterion("notice_status <>", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThan(Boolean value) {
            addCriterion("notice_status >", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("notice_status >=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThan(Boolean value) {
            addCriterion("notice_status <", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("notice_status <=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIn(List<Boolean> values) {
            addCriterion("notice_status in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotIn(List<Boolean> values) {
            addCriterion("notice_status not in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("notice_status between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("notice_status not between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Integer value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Integer value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Integer value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Integer value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Integer> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Integer> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Integer value1, Integer value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andDirectRangeIsNull() {
            addCriterion("direct_range is null");
            return (Criteria) this;
        }

        public Criteria andDirectRangeIsNotNull() {
            addCriterion("direct_range is not null");
            return (Criteria) this;
        }

        public Criteria andDirectRangeEqualTo(Boolean value) {
            addCriterion("direct_range =", value, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeNotEqualTo(Boolean value) {
            addCriterion("direct_range <>", value, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeGreaterThan(Boolean value) {
            addCriterion("direct_range >", value, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("direct_range >=", value, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeLessThan(Boolean value) {
            addCriterion("direct_range <", value, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeLessThanOrEqualTo(Boolean value) {
            addCriterion("direct_range <=", value, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeIn(List<Boolean> values) {
            addCriterion("direct_range in", values, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeNotIn(List<Boolean> values) {
            addCriterion("direct_range not in", values, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeBetween(Boolean value1, Boolean value2) {
            addCriterion("direct_range between", value1, value2, "directRange");
            return (Criteria) this;
        }

        public Criteria andDirectRangeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("direct_range not between", value1, value2, "directRange");
            return (Criteria) this;
        }

        public Criteria andSplitFromIsNull() {
            addCriterion("split_from is null");
            return (Criteria) this;
        }

        public Criteria andSplitFromIsNotNull() {
            addCriterion("split_from is not null");
            return (Criteria) this;
        }

        public Criteria andSplitFromEqualTo(Integer value) {
            addCriterion("split_from =", value, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromNotEqualTo(Integer value) {
            addCriterion("split_from <>", value, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromGreaterThan(Integer value) {
            addCriterion("split_from >", value, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("split_from >=", value, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromLessThan(Integer value) {
            addCriterion("split_from <", value, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromLessThanOrEqualTo(Integer value) {
            addCriterion("split_from <=", value, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromIn(List<Integer> values) {
            addCriterion("split_from in", values, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromNotIn(List<Integer> values) {
            addCriterion("split_from not in", values, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromBetween(Integer value1, Integer value2) {
            addCriterion("split_from between", value1, value2, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andSplitFromNotBetween(Integer value1, Integer value2) {
            addCriterion("split_from not between", value1, value2, "splitFrom");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintIsNull() {
            addCriterion("is_delivery_print is null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintIsNotNull() {
            addCriterion("is_delivery_print is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintEqualTo(Boolean value) {
            addCriterion("is_delivery_print =", value, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintNotEqualTo(Boolean value) {
            addCriterion("is_delivery_print <>", value, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintGreaterThan(Boolean value) {
            addCriterion("is_delivery_print >", value, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delivery_print >=", value, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintLessThan(Boolean value) {
            addCriterion("is_delivery_print <", value, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delivery_print <=", value, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintIn(List<Boolean> values) {
            addCriterion("is_delivery_print in", values, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintNotIn(List<Boolean> values) {
            addCriterion("is_delivery_print not in", values, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delivery_print between", value1, value2, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryPrintNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delivery_print not between", value1, value2, "isDeliveryPrint");
            return (Criteria) this;
        }

        public Criteria andWaitPayIsNull() {
            addCriterion("wait_pay is null");
            return (Criteria) this;
        }

        public Criteria andWaitPayIsNotNull() {
            addCriterion("wait_pay is not null");
            return (Criteria) this;
        }

        public Criteria andWaitPayEqualTo(Boolean value) {
            addCriterion("wait_pay =", value, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayNotEqualTo(Boolean value) {
            addCriterion("wait_pay <>", value, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayGreaterThan(Boolean value) {
            addCriterion("wait_pay >", value, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wait_pay >=", value, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayLessThan(Boolean value) {
            addCriterion("wait_pay <", value, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayLessThanOrEqualTo(Boolean value) {
            addCriterion("wait_pay <=", value, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayIn(List<Boolean> values) {
            addCriterion("wait_pay in", values, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayNotIn(List<Boolean> values) {
            addCriterion("wait_pay not in", values, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayBetween(Boolean value1, Boolean value2) {
            addCriterion("wait_pay between", value1, value2, "waitPay");
            return (Criteria) this;
        }

        public Criteria andWaitPayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wait_pay not between", value1, value2, "waitPay");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNull() {
            addCriterion("is_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNotNull() {
            addCriterion("is_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockedEqualTo(Byte value) {
            addCriterion("is_locked =", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotEqualTo(Byte value) {
            addCriterion("is_locked <>", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThan(Byte value) {
            addCriterion("is_locked >", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_locked >=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThan(Byte value) {
            addCriterion("is_locked <", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThanOrEqualTo(Byte value) {
            addCriterion("is_locked <=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedIn(List<Byte> values) {
            addCriterion("is_locked in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotIn(List<Byte> values) {
            addCriterion("is_locked not in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedBetween(Byte value1, Byte value2) {
            addCriterion("is_locked between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_locked not between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andNoticePayIsNull() {
            addCriterion("notice_pay is null");
            return (Criteria) this;
        }

        public Criteria andNoticePayIsNotNull() {
            addCriterion("notice_pay is not null");
            return (Criteria) this;
        }

        public Criteria andNoticePayEqualTo(Byte value) {
            addCriterion("notice_pay =", value, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayNotEqualTo(Byte value) {
            addCriterion("notice_pay <>", value, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayGreaterThan(Byte value) {
            addCriterion("notice_pay >", value, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayGreaterThanOrEqualTo(Byte value) {
            addCriterion("notice_pay >=", value, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayLessThan(Byte value) {
            addCriterion("notice_pay <", value, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayLessThanOrEqualTo(Byte value) {
            addCriterion("notice_pay <=", value, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayIn(List<Byte> values) {
            addCriterion("notice_pay in", values, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayNotIn(List<Byte> values) {
            addCriterion("notice_pay not in", values, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayBetween(Byte value1, Byte value2) {
            addCriterion("notice_pay between", value1, value2, "noticePay");
            return (Criteria) this;
        }

        public Criteria andNoticePayNotBetween(Byte value1, Byte value2) {
            addCriterion("notice_pay not between", value1, value2, "noticePay");
            return (Criteria) this;
        }

        public Criteria andJhdIdIsNull() {
            addCriterion("jhd_id is null");
            return (Criteria) this;
        }

        public Criteria andJhdIdIsNotNull() {
            addCriterion("jhd_id is not null");
            return (Criteria) this;
        }

        public Criteria andJhdIdEqualTo(Integer value) {
            addCriterion("jhd_id =", value, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdNotEqualTo(Integer value) {
            addCriterion("jhd_id <>", value, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdGreaterThan(Integer value) {
            addCriterion("jhd_id >", value, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jhd_id >=", value, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdLessThan(Integer value) {
            addCriterion("jhd_id <", value, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdLessThanOrEqualTo(Integer value) {
            addCriterion("jhd_id <=", value, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdIn(List<Integer> values) {
            addCriterion("jhd_id in", values, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdNotIn(List<Integer> values) {
            addCriterion("jhd_id not in", values, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdBetween(Integer value1, Integer value2) {
            addCriterion("jhd_id between", value1, value2, "jhdId");
            return (Criteria) this;
        }

        public Criteria andJhdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jhd_id not between", value1, value2, "jhdId");
            return (Criteria) this;
        }

        public Criteria andLylxIsNull() {
            addCriterion("lylx is null");
            return (Criteria) this;
        }

        public Criteria andLylxIsNotNull() {
            addCriterion("lylx is not null");
            return (Criteria) this;
        }

        public Criteria andLylxEqualTo(Byte value) {
            addCriterion("lylx =", value, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxNotEqualTo(Byte value) {
            addCriterion("lylx <>", value, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxGreaterThan(Byte value) {
            addCriterion("lylx >", value, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxGreaterThanOrEqualTo(Byte value) {
            addCriterion("lylx >=", value, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxLessThan(Byte value) {
            addCriterion("lylx <", value, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxLessThanOrEqualTo(Byte value) {
            addCriterion("lylx <=", value, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxIn(List<Byte> values) {
            addCriterion("lylx in", values, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxNotIn(List<Byte> values) {
            addCriterion("lylx not in", values, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxBetween(Byte value1, Byte value2) {
            addCriterion("lylx between", value1, value2, "lylx");
            return (Criteria) this;
        }

        public Criteria andLylxNotBetween(Byte value1, Byte value2) {
            addCriterion("lylx not between", value1, value2, "lylx");
            return (Criteria) this;
        }

        public Criteria andDealCodeIsNull() {
            addCriterion("deal_code is null");
            return (Criteria) this;
        }

        public Criteria andDealCodeIsNotNull() {
            addCriterion("deal_code is not null");
            return (Criteria) this;
        }

        public Criteria andDealCodeEqualTo(String value) {
            addCriterion("deal_code =", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeNotEqualTo(String value) {
            addCriterion("deal_code <>", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeGreaterThan(String value) {
            addCriterion("deal_code >", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deal_code >=", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeLessThan(String value) {
            addCriterion("deal_code <", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeLessThanOrEqualTo(String value) {
            addCriterion("deal_code <=", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeLike(String value) {
            addCriterion("deal_code like", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeNotLike(String value) {
            addCriterion("deal_code not like", value, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeIn(List<String> values) {
            addCriterion("deal_code in", values, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeNotIn(List<String> values) {
            addCriterion("deal_code not in", values, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeBetween(String value1, String value2) {
            addCriterion("deal_code between", value1, value2, "dealCode");
            return (Criteria) this;
        }

        public Criteria andDealCodeNotBetween(String value1, String value2) {
            addCriterion("deal_code not between", value1, value2, "dealCode");
            return (Criteria) this;
        }

        public Criteria andSdIdIsNull() {
            addCriterion("sd_id is null");
            return (Criteria) this;
        }

        public Criteria andSdIdIsNotNull() {
            addCriterion("sd_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdIdEqualTo(Integer value) {
            addCriterion("sd_id =", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotEqualTo(Integer value) {
            addCriterion("sd_id <>", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThan(Integer value) {
            addCriterion("sd_id >", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_id >=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThan(Integer value) {
            addCriterion("sd_id <", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThanOrEqualTo(Integer value) {
            addCriterion("sd_id <=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdIn(List<Integer> values) {
            addCriterion("sd_id in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotIn(List<Integer> values) {
            addCriterion("sd_id not in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdBetween(Integer value1, Integer value2) {
            addCriterion("sd_id between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_id not between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(Byte value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(Byte value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(Byte value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(Byte value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(Byte value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<Byte> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<Byte> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(Byte value1, Byte value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(Byte value1, Byte value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andUserNickIsNull() {
            addCriterion("user_nick is null");
            return (Criteria) this;
        }

        public Criteria andUserNickIsNotNull() {
            addCriterion("user_nick is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickEqualTo(String value) {
            addCriterion("user_nick =", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotEqualTo(String value) {
            addCriterion("user_nick <>", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickGreaterThan(String value) {
            addCriterion("user_nick >", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick >=", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLessThan(String value) {
            addCriterion("user_nick <", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLessThanOrEqualTo(String value) {
            addCriterion("user_nick <=", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLike(String value) {
            addCriterion("user_nick like", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotLike(String value) {
            addCriterion("user_nick not like", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickIn(List<String> values) {
            addCriterion("user_nick in", values, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotIn(List<String> values) {
            addCriterion("user_nick not in", values, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickBetween(String value1, String value2) {
            addCriterion("user_nick between", value1, value2, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotBetween(String value1, String value2) {
            addCriterion("user_nick not between", value1, value2, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptIsNull() {
            addCriterion("user_nick_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptIsNotNull() {
            addCriterion("user_nick_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptEqualTo(String value) {
            addCriterion("user_nick_encrypt =", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptNotEqualTo(String value) {
            addCriterion("user_nick_encrypt <>", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptGreaterThan(String value) {
            addCriterion("user_nick_encrypt >", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick_encrypt >=", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptLessThan(String value) {
            addCriterion("user_nick_encrypt <", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptLessThanOrEqualTo(String value) {
            addCriterion("user_nick_encrypt <=", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptLike(String value) {
            addCriterion("user_nick_encrypt like", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptNotLike(String value) {
            addCriterion("user_nick_encrypt not like", value, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptIn(List<String> values) {
            addCriterion("user_nick_encrypt in", values, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptNotIn(List<String> values) {
            addCriterion("user_nick_encrypt not in", values, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptBetween(String value1, String value2) {
            addCriterion("user_nick_encrypt between", value1, value2, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserNickEncryptNotBetween(String value1, String value2) {
            addCriterion("user_nick_encrypt not between", value1, value2, "userNickEncrypt");
            return (Criteria) this;
        }

        public Criteria andOrderNoteIsNull() {
            addCriterion("order_note is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoteIsNotNull() {
            addCriterion("order_note is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoteEqualTo(String value) {
            addCriterion("order_note =", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteNotEqualTo(String value) {
            addCriterion("order_note <>", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteGreaterThan(String value) {
            addCriterion("order_note >", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteGreaterThanOrEqualTo(String value) {
            addCriterion("order_note >=", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteLessThan(String value) {
            addCriterion("order_note <", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteLessThanOrEqualTo(String value) {
            addCriterion("order_note <=", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteLike(String value) {
            addCriterion("order_note like", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteNotLike(String value) {
            addCriterion("order_note not like", value, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteIn(List<String> values) {
            addCriterion("order_note in", values, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteNotIn(List<String> values) {
            addCriterion("order_note not in", values, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteBetween(String value1, String value2) {
            addCriterion("order_note between", value1, value2, "orderNote");
            return (Criteria) this;
        }

        public Criteria andOrderNoteNotBetween(String value1, String value2) {
            addCriterion("order_note not between", value1, value2, "orderNote");
            return (Criteria) this;
        }

        public Criteria andBackAmountIsNull() {
            addCriterion("back_amount is null");
            return (Criteria) this;
        }

        public Criteria andBackAmountIsNotNull() {
            addCriterion("back_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBackAmountEqualTo(BigDecimal value) {
            addCriterion("back_amount =", value, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountNotEqualTo(BigDecimal value) {
            addCriterion("back_amount <>", value, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountGreaterThan(BigDecimal value) {
            addCriterion("back_amount >", value, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("back_amount >=", value, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountLessThan(BigDecimal value) {
            addCriterion("back_amount <", value, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("back_amount <=", value, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountIn(List<BigDecimal> values) {
            addCriterion("back_amount in", values, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountNotIn(List<BigDecimal> values) {
            addCriterion("back_amount not in", values, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_amount between", value1, value2, "backAmount");
            return (Criteria) this;
        }

        public Criteria andBackAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_amount not between", value1, value2, "backAmount");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNull() {
            addCriterion("real_money is null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNotNull() {
            addCriterion("real_money is not null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyEqualTo(BigDecimal value) {
            addCriterion("real_money =", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotEqualTo(BigDecimal value) {
            addCriterion("real_money <>", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThan(BigDecimal value) {
            addCriterion("real_money >", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_money >=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThan(BigDecimal value) {
            addCriterion("real_money <", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_money <=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIn(List<BigDecimal> values) {
            addCriterion("real_money in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotIn(List<BigDecimal> values) {
            addCriterion("real_money not in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_money between", value1, value2, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_money not between", value1, value2, "realMoney");
            return (Criteria) this;
        }

        public Criteria andDistTypeIsNull() {
            addCriterion("dist_type is null");
            return (Criteria) this;
        }

        public Criteria andDistTypeIsNotNull() {
            addCriterion("dist_type is not null");
            return (Criteria) this;
        }

        public Criteria andDistTypeEqualTo(Byte value) {
            addCriterion("dist_type =", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeNotEqualTo(Byte value) {
            addCriterion("dist_type <>", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeGreaterThan(Byte value) {
            addCriterion("dist_type >", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("dist_type >=", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeLessThan(Byte value) {
            addCriterion("dist_type <", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeLessThanOrEqualTo(Byte value) {
            addCriterion("dist_type <=", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeIn(List<Byte> values) {
            addCriterion("dist_type in", values, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeNotIn(List<Byte> values) {
            addCriterion("dist_type not in", values, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeBetween(Byte value1, Byte value2) {
            addCriterion("dist_type between", value1, value2, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("dist_type not between", value1, value2, "distType");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeIsNull() {
            addCriterion("real_shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeIsNotNull() {
            addCriterion("real_shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeEqualTo(BigDecimal value) {
            addCriterion("real_shipping_fee =", value, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("real_shipping_fee <>", value, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("real_shipping_fee >", value, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_shipping_fee >=", value, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeLessThan(BigDecimal value) {
            addCriterion("real_shipping_fee <", value, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_shipping_fee <=", value, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeIn(List<BigDecimal> values) {
            addCriterion("real_shipping_fee in", values, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("real_shipping_fee not in", values, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_shipping_fee between", value1, value2, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andRealShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_shipping_fee not between", value1, value2, "realShippingFee");
            return (Criteria) this;
        }

        public Criteria andCkIdIsNull() {
            addCriterion("ck_id is null");
            return (Criteria) this;
        }

        public Criteria andCkIdIsNotNull() {
            addCriterion("ck_id is not null");
            return (Criteria) this;
        }

        public Criteria andCkIdEqualTo(Integer value) {
            addCriterion("ck_id =", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotEqualTo(Integer value) {
            addCriterion("ck_id <>", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdGreaterThan(Integer value) {
            addCriterion("ck_id >", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ck_id >=", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdLessThan(Integer value) {
            addCriterion("ck_id <", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdLessThanOrEqualTo(Integer value) {
            addCriterion("ck_id <=", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdIn(List<Integer> values) {
            addCriterion("ck_id in", values, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotIn(List<Integer> values) {
            addCriterion("ck_id not in", values, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdBetween(Integer value1, Integer value2) {
            addCriterion("ck_id between", value1, value2, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ck_id not between", value1, value2, "ckId");
            return (Criteria) this;
        }

        public Criteria andIsHandledIsNull() {
            addCriterion("is_handled is null");
            return (Criteria) this;
        }

        public Criteria andIsHandledIsNotNull() {
            addCriterion("is_handled is not null");
            return (Criteria) this;
        }

        public Criteria andIsHandledEqualTo(Byte value) {
            addCriterion("is_handled =", value, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledNotEqualTo(Byte value) {
            addCriterion("is_handled <>", value, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledGreaterThan(Byte value) {
            addCriterion("is_handled >", value, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_handled >=", value, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledLessThan(Byte value) {
            addCriterion("is_handled <", value, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledLessThanOrEqualTo(Byte value) {
            addCriterion("is_handled <=", value, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledIn(List<Byte> values) {
            addCriterion("is_handled in", values, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledNotIn(List<Byte> values) {
            addCriterion("is_handled not in", values, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledBetween(Byte value1, Byte value2) {
            addCriterion("is_handled between", value1, value2, "isHandled");
            return (Criteria) this;
        }

        public Criteria andIsHandledNotBetween(Byte value1, Byte value2) {
            addCriterion("is_handled not between", value1, value2, "isHandled");
            return (Criteria) this;
        }

        public Criteria andAlipayNoIsNull() {
            addCriterion("alipay_no is null");
            return (Criteria) this;
        }

        public Criteria andAlipayNoIsNotNull() {
            addCriterion("alipay_no is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayNoEqualTo(String value) {
            addCriterion("alipay_no =", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoNotEqualTo(String value) {
            addCriterion("alipay_no <>", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoGreaterThan(String value) {
            addCriterion("alipay_no >", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_no >=", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoLessThan(String value) {
            addCriterion("alipay_no <", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoLessThanOrEqualTo(String value) {
            addCriterion("alipay_no <=", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoLike(String value) {
            addCriterion("alipay_no like", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoNotLike(String value) {
            addCriterion("alipay_no not like", value, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoIn(List<String> values) {
            addCriterion("alipay_no in", values, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoNotIn(List<String> values) {
            addCriterion("alipay_no not in", values, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoBetween(String value1, String value2) {
            addCriterion("alipay_no between", value1, value2, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andAlipayNoNotBetween(String value1, String value2) {
            addCriterion("alipay_no not between", value1, value2, "alipayNo");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNull() {
            addCriterion("is_print is null");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNotNull() {
            addCriterion("is_print is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrintEqualTo(Boolean value) {
            addCriterion("is_print =", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotEqualTo(Boolean value) {
            addCriterion("is_print <>", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThan(Boolean value) {
            addCriterion("is_print >", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_print >=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThan(Boolean value) {
            addCriterion("is_print <", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThanOrEqualTo(Boolean value) {
            addCriterion("is_print <=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintIn(List<Boolean> values) {
            addCriterion("is_print in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotIn(List<Boolean> values) {
            addCriterion("is_print not in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintBetween(Boolean value1, Boolean value2) {
            addCriterion("is_print between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_print not between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUserAlipayIsNull() {
            addCriterion("user_alipay is null");
            return (Criteria) this;
        }

        public Criteria andUserAlipayIsNotNull() {
            addCriterion("user_alipay is not null");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEqualTo(String value) {
            addCriterion("user_alipay =", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotEqualTo(String value) {
            addCriterion("user_alipay <>", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayGreaterThan(String value) {
            addCriterion("user_alipay >", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("user_alipay >=", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayLessThan(String value) {
            addCriterion("user_alipay <", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayLessThanOrEqualTo(String value) {
            addCriterion("user_alipay <=", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayLike(String value) {
            addCriterion("user_alipay like", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotLike(String value) {
            addCriterion("user_alipay not like", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayIn(List<String> values) {
            addCriterion("user_alipay in", values, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotIn(List<String> values) {
            addCriterion("user_alipay not in", values, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayBetween(String value1, String value2) {
            addCriterion("user_alipay between", value1, value2, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotBetween(String value1, String value2) {
            addCriterion("user_alipay not between", value1, value2, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptIsNull() {
            addCriterion("user_alipay_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptIsNotNull() {
            addCriterion("user_alipay_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptEqualTo(String value) {
            addCriterion("user_alipay_encrypt =", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptNotEqualTo(String value) {
            addCriterion("user_alipay_encrypt <>", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptGreaterThan(String value) {
            addCriterion("user_alipay_encrypt >", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("user_alipay_encrypt >=", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptLessThan(String value) {
            addCriterion("user_alipay_encrypt <", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptLessThanOrEqualTo(String value) {
            addCriterion("user_alipay_encrypt <=", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptLike(String value) {
            addCriterion("user_alipay_encrypt like", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptNotLike(String value) {
            addCriterion("user_alipay_encrypt not like", value, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptIn(List<String> values) {
            addCriterion("user_alipay_encrypt in", values, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptNotIn(List<String> values) {
            addCriterion("user_alipay_encrypt not in", values, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptBetween(String value1, String value2) {
            addCriterion("user_alipay_encrypt between", value1, value2, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEncryptNotBetween(String value1, String value2) {
            addCriterion("user_alipay_encrypt not between", value1, value2, "userAlipayEncrypt");
            return (Criteria) this;
        }

        public Criteria andLfStatusIsNull() {
            addCriterion("lf_status is null");
            return (Criteria) this;
        }

        public Criteria andLfStatusIsNotNull() {
            addCriterion("lf_status is not null");
            return (Criteria) this;
        }

        public Criteria andLfStatusEqualTo(Integer value) {
            addCriterion("lf_status =", value, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusNotEqualTo(Integer value) {
            addCriterion("lf_status <>", value, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusGreaterThan(Integer value) {
            addCriterion("lf_status >", value, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lf_status >=", value, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusLessThan(Integer value) {
            addCriterion("lf_status <", value, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lf_status <=", value, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusIn(List<Integer> values) {
            addCriterion("lf_status in", values, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusNotIn(List<Integer> values) {
            addCriterion("lf_status not in", values, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusBetween(Integer value1, Integer value2) {
            addCriterion("lf_status between", value1, value2, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andLfStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lf_status not between", value1, value2, "lfStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusIsNull() {
            addCriterion("box_add_status is null");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusIsNotNull() {
            addCriterion("box_add_status is not null");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusEqualTo(Integer value) {
            addCriterion("box_add_status =", value, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusNotEqualTo(Integer value) {
            addCriterion("box_add_status <>", value, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusGreaterThan(Integer value) {
            addCriterion("box_add_status >", value, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_add_status >=", value, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusLessThan(Integer value) {
            addCriterion("box_add_status <", value, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusLessThanOrEqualTo(Integer value) {
            addCriterion("box_add_status <=", value, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusIn(List<Integer> values) {
            addCriterion("box_add_status in", values, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusNotIn(List<Integer> values) {
            addCriterion("box_add_status not in", values, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusBetween(Integer value1, Integer value2) {
            addCriterion("box_add_status between", value1, value2, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andBoxAddStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("box_add_status not between", value1, value2, "boxAddStatus");
            return (Criteria) this;
        }

        public Criteria andIsAddsIsNull() {
            addCriterion("is_adds is null");
            return (Criteria) this;
        }

        public Criteria andIsAddsIsNotNull() {
            addCriterion("is_adds is not null");
            return (Criteria) this;
        }

        public Criteria andIsAddsEqualTo(Integer value) {
            addCriterion("is_adds =", value, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsNotEqualTo(Integer value) {
            addCriterion("is_adds <>", value, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsGreaterThan(Integer value) {
            addCriterion("is_adds >", value, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_adds >=", value, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsLessThan(Integer value) {
            addCriterion("is_adds <", value, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsLessThanOrEqualTo(Integer value) {
            addCriterion("is_adds <=", value, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsIn(List<Integer> values) {
            addCriterion("is_adds in", values, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsNotIn(List<Integer> values) {
            addCriterion("is_adds not in", values, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsBetween(Integer value1, Integer value2) {
            addCriterion("is_adds between", value1, value2, "isAdds");
            return (Criteria) this;
        }

        public Criteria andIsAddsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_adds not between", value1, value2, "isAdds");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNull() {
            addCriterion("appoint_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNotNull() {
            addCriterion("appoint_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_time =", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_time <>", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("appoint_time >", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_time >=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThan(Date value) {
            addCriterionForJDBCDate("appoint_time <", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_time <=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIn(List<Date> values) {
            addCriterionForJDBCDate("appoint_time in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("appoint_time not in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appoint_time between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appoint_time not between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNull() {
            addCriterion("refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(Integer value) {
            addCriterion("refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(Integer value) {
            addCriterion("refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(Integer value) {
            addCriterion("refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(Integer value) {
            addCriterion("refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<Integer> values) {
            addCriterion("refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<Integer> values) {
            addCriterion("refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_id not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andIsHandIsNull() {
            addCriterion("is_hand is null");
            return (Criteria) this;
        }

        public Criteria andIsHandIsNotNull() {
            addCriterion("is_hand is not null");
            return (Criteria) this;
        }

        public Criteria andIsHandEqualTo(Integer value) {
            addCriterion("is_hand =", value, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandNotEqualTo(Integer value) {
            addCriterion("is_hand <>", value, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandGreaterThan(Integer value) {
            addCriterion("is_hand >", value, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hand >=", value, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandLessThan(Integer value) {
            addCriterion("is_hand <", value, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandLessThanOrEqualTo(Integer value) {
            addCriterion("is_hand <=", value, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandIn(List<Integer> values) {
            addCriterion("is_hand in", values, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandNotIn(List<Integer> values) {
            addCriterion("is_hand not in", values, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandBetween(Integer value1, Integer value2) {
            addCriterion("is_hand between", value1, value2, "isHand");
            return (Criteria) this;
        }

        public Criteria andIsHandNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hand not between", value1, value2, "isHand");
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