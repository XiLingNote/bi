package bi.baiqiu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WareHouseExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNull() {
            addCriterion("show_name is null");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNotNull() {
            addCriterion("show_name is not null");
            return (Criteria) this;
        }

        public Criteria andShowNameEqualTo(String value) {
            addCriterion("show_name =", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotEqualTo(String value) {
            addCriterion("show_name <>", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThan(String value) {
            addCriterion("show_name >", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThanOrEqualTo(String value) {
            addCriterion("show_name >=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThan(String value) {
            addCriterion("show_name <", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThanOrEqualTo(String value) {
            addCriterion("show_name <=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLike(String value) {
            addCriterion("show_name like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotLike(String value) {
            addCriterion("show_name not like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameIn(List<String> values) {
            addCriterion("show_name in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotIn(List<String> values) {
            addCriterion("show_name not in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameBetween(String value1, String value2) {
            addCriterion("show_name between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotBetween(String value1, String value2) {
            addCriterion("show_name not between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("visible is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("visible is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(Boolean value) {
            addCriterion("visible =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(Boolean value) {
            addCriterion("visible <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(Boolean value) {
            addCriterion("visible >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("visible >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(Boolean value) {
            addCriterion("visible <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(Boolean value) {
            addCriterion("visible <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<Boolean> values) {
            addCriterion("visible in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<Boolean> values) {
            addCriterion("visible not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(Boolean value1, Boolean value2) {
            addCriterion("visible between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("visible not between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andFacetIsNull() {
            addCriterion("facet is null");
            return (Criteria) this;
        }

        public Criteria andFacetIsNotNull() {
            addCriterion("facet is not null");
            return (Criteria) this;
        }

        public Criteria andFacetEqualTo(Boolean value) {
            addCriterion("facet =", value, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetNotEqualTo(Boolean value) {
            addCriterion("facet <>", value, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetGreaterThan(Boolean value) {
            addCriterion("facet >", value, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("facet >=", value, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetLessThan(Boolean value) {
            addCriterion("facet <", value, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetLessThanOrEqualTo(Boolean value) {
            addCriterion("facet <=", value, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetIn(List<Boolean> values) {
            addCriterion("facet in", values, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetNotIn(List<Boolean> values) {
            addCriterion("facet not in", values, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetBetween(Boolean value1, Boolean value2) {
            addCriterion("facet between", value1, value2, "facet");
            return (Criteria) this;
        }

        public Criteria andFacetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("facet not between", value1, value2, "facet");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameIsNull() {
            addCriterion("repertory_name is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameIsNotNull() {
            addCriterion("repertory_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameEqualTo(String value) {
            addCriterion("repertory_name =", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameNotEqualTo(String value) {
            addCriterion("repertory_name <>", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameGreaterThan(String value) {
            addCriterion("repertory_name >", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("repertory_name >=", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameLessThan(String value) {
            addCriterion("repertory_name <", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameLessThanOrEqualTo(String value) {
            addCriterion("repertory_name <=", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameLike(String value) {
            addCriterion("repertory_name like", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameNotLike(String value) {
            addCriterion("repertory_name not like", value, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameIn(List<String> values) {
            addCriterion("repertory_name in", values, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameNotIn(List<String> values) {
            addCriterion("repertory_name not in", values, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameBetween(String value1, String value2) {
            addCriterion("repertory_name between", value1, value2, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andRepertoryNameNotBetween(String value1, String value2) {
            addCriterion("repertory_name not between", value1, value2, "repertoryName");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountIsNull() {
            addCriterion("not_turn_amount is null");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountIsNotNull() {
            addCriterion("not_turn_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountEqualTo(Integer value) {
            addCriterion("not_turn_amount =", value, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountNotEqualTo(Integer value) {
            addCriterion("not_turn_amount <>", value, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountGreaterThan(Integer value) {
            addCriterion("not_turn_amount >", value, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_turn_amount >=", value, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountLessThan(Integer value) {
            addCriterion("not_turn_amount <", value, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountLessThanOrEqualTo(Integer value) {
            addCriterion("not_turn_amount <=", value, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountIn(List<Integer> values) {
            addCriterion("not_turn_amount in", values, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountNotIn(List<Integer> values) {
            addCriterion("not_turn_amount not in", values, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountBetween(Integer value1, Integer value2) {
            addCriterion("not_turn_amount between", value1, value2, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andNotTurnAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("not_turn_amount not between", value1, value2, "notTurnAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountIsNull() {
            addCriterion("trun_amount is null");
            return (Criteria) this;
        }

        public Criteria andTrunAmountIsNotNull() {
            addCriterion("trun_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTrunAmountEqualTo(Integer value) {
            addCriterion("trun_amount =", value, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountNotEqualTo(Integer value) {
            addCriterion("trun_amount <>", value, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountGreaterThan(Integer value) {
            addCriterion("trun_amount >", value, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trun_amount >=", value, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountLessThan(Integer value) {
            addCriterion("trun_amount <", value, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountLessThanOrEqualTo(Integer value) {
            addCriterion("trun_amount <=", value, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountIn(List<Integer> values) {
            addCriterion("trun_amount in", values, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountNotIn(List<Integer> values) {
            addCriterion("trun_amount not in", values, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountBetween(Integer value1, Integer value2) {
            addCriterion("trun_amount between", value1, value2, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andTrunAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("trun_amount not between", value1, value2, "trunAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountIsNull() {
            addCriterion("not_print_amount is null");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountIsNotNull() {
            addCriterion("not_print_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountEqualTo(Integer value) {
            addCriterion("not_print_amount =", value, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountNotEqualTo(Integer value) {
            addCriterion("not_print_amount <>", value, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountGreaterThan(Integer value) {
            addCriterion("not_print_amount >", value, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_print_amount >=", value, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountLessThan(Integer value) {
            addCriterion("not_print_amount <", value, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountLessThanOrEqualTo(Integer value) {
            addCriterion("not_print_amount <=", value, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountIn(List<Integer> values) {
            addCriterion("not_print_amount in", values, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountNotIn(List<Integer> values) {
            addCriterion("not_print_amount not in", values, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountBetween(Integer value1, Integer value2) {
            addCriterion("not_print_amount between", value1, value2, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andNotPrintAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("not_print_amount not between", value1, value2, "notPrintAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIsNull() {
            addCriterion("distribution_amount is null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIsNotNull() {
            addCriterion("distribution_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountEqualTo(Integer value) {
            addCriterion("distribution_amount =", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotEqualTo(Integer value) {
            addCriterion("distribution_amount <>", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThan(Integer value) {
            addCriterion("distribution_amount >", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribution_amount >=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThan(Integer value) {
            addCriterion("distribution_amount <", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountLessThanOrEqualTo(Integer value) {
            addCriterion("distribution_amount <=", value, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountIn(List<Integer> values) {
            addCriterion("distribution_amount in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotIn(List<Integer> values) {
            addCriterion("distribution_amount not in", values, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountBetween(Integer value1, Integer value2) {
            addCriterion("distribution_amount between", value1, value2, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andDistributionAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("distribution_amount not between", value1, value2, "distributionAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountIsNull() {
            addCriterion("total_single_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountIsNotNull() {
            addCriterion("total_single_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountEqualTo(Integer value) {
            addCriterion("total_single_amount =", value, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountNotEqualTo(Integer value) {
            addCriterion("total_single_amount <>", value, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountGreaterThan(Integer value) {
            addCriterion("total_single_amount >", value, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_single_amount >=", value, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountLessThan(Integer value) {
            addCriterion("total_single_amount <", value, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountLessThanOrEqualTo(Integer value) {
            addCriterion("total_single_amount <=", value, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountIn(List<Integer> values) {
            addCriterion("total_single_amount in", values, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountNotIn(List<Integer> values) {
            addCriterion("total_single_amount not in", values, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountBetween(Integer value1, Integer value2) {
            addCriterion("total_single_amount between", value1, value2, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSingleAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_single_amount not between", value1, value2, "totalSingleAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountIsNull() {
            addCriterion("today_shipped_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountIsNotNull() {
            addCriterion("today_shipped_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountEqualTo(Integer value) {
            addCriterion("today_shipped_amount =", value, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountNotEqualTo(Integer value) {
            addCriterion("today_shipped_amount <>", value, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountGreaterThan(Integer value) {
            addCriterion("today_shipped_amount >", value, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_shipped_amount >=", value, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountLessThan(Integer value) {
            addCriterion("today_shipped_amount <", value, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("today_shipped_amount <=", value, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountIn(List<Integer> values) {
            addCriterion("today_shipped_amount in", values, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountNotIn(List<Integer> values) {
            addCriterion("today_shipped_amount not in", values, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountBetween(Integer value1, Integer value2) {
            addCriterion("today_shipped_amount between", value1, value2, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("today_shipped_amount not between", value1, value2, "todayShippedAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountIsNull() {
            addCriterion("today_shipped_general_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountIsNotNull() {
            addCriterion("today_shipped_general_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountEqualTo(Integer value) {
            addCriterion("today_shipped_general_amount =", value, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountNotEqualTo(Integer value) {
            addCriterion("today_shipped_general_amount <>", value, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountGreaterThan(Integer value) {
            addCriterion("today_shipped_general_amount >", value, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_shipped_general_amount >=", value, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountLessThan(Integer value) {
            addCriterion("today_shipped_general_amount <", value, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountLessThanOrEqualTo(Integer value) {
            addCriterion("today_shipped_general_amount <=", value, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountIn(List<Integer> values) {
            addCriterion("today_shipped_general_amount in", values, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountNotIn(List<Integer> values) {
            addCriterion("today_shipped_general_amount not in", values, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountBetween(Integer value1, Integer value2) {
            addCriterion("today_shipped_general_amount between", value1, value2, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedGeneralAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("today_shipped_general_amount not between", value1, value2, "todayShippedGeneralAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountIsNull() {
            addCriterion("today_shipped_presell_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountIsNotNull() {
            addCriterion("today_shipped_presell_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountEqualTo(Integer value) {
            addCriterion("today_shipped_presell_amount =", value, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountNotEqualTo(Integer value) {
            addCriterion("today_shipped_presell_amount <>", value, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountGreaterThan(Integer value) {
            addCriterion("today_shipped_presell_amount >", value, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_shipped_presell_amount >=", value, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountLessThan(Integer value) {
            addCriterion("today_shipped_presell_amount <", value, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountLessThanOrEqualTo(Integer value) {
            addCriterion("today_shipped_presell_amount <=", value, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountIn(List<Integer> values) {
            addCriterion("today_shipped_presell_amount in", values, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountNotIn(List<Integer> values) {
            addCriterion("today_shipped_presell_amount not in", values, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountBetween(Integer value1, Integer value2) {
            addCriterion("today_shipped_presell_amount between", value1, value2, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTodayShippedPresellAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("today_shipped_presell_amount not between", value1, value2, "todayShippedPresellAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountIsNull() {
            addCriterion("last_month_shipped_amount is null");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountIsNotNull() {
            addCriterion("last_month_shipped_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountEqualTo(Integer value) {
            addCriterion("last_month_shipped_amount =", value, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountNotEqualTo(Integer value) {
            addCriterion("last_month_shipped_amount <>", value, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountGreaterThan(Integer value) {
            addCriterion("last_month_shipped_amount >", value, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_month_shipped_amount >=", value, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountLessThan(Integer value) {
            addCriterion("last_month_shipped_amount <", value, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("last_month_shipped_amount <=", value, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountIn(List<Integer> values) {
            addCriterion("last_month_shipped_amount in", values, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountNotIn(List<Integer> values) {
            addCriterion("last_month_shipped_amount not in", values, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountBetween(Integer value1, Integer value2) {
            addCriterion("last_month_shipped_amount between", value1, value2, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andLastMonthShippedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("last_month_shipped_amount not between", value1, value2, "lastMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountIsNull() {
            addCriterion("present_month_shipped_amount is null");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountIsNotNull() {
            addCriterion("present_month_shipped_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountEqualTo(Integer value) {
            addCriterion("present_month_shipped_amount =", value, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountNotEqualTo(Integer value) {
            addCriterion("present_month_shipped_amount <>", value, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountGreaterThan(Integer value) {
            addCriterion("present_month_shipped_amount >", value, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("present_month_shipped_amount >=", value, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountLessThan(Integer value) {
            addCriterion("present_month_shipped_amount <", value, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("present_month_shipped_amount <=", value, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountIn(List<Integer> values) {
            addCriterion("present_month_shipped_amount in", values, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountNotIn(List<Integer> values) {
            addCriterion("present_month_shipped_amount not in", values, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountBetween(Integer value1, Integer value2) {
            addCriterion("present_month_shipped_amount between", value1, value2, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andPresentMonthShippedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("present_month_shipped_amount not between", value1, value2, "presentMonthShippedAmount");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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