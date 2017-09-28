
package bi.baiqiu.pojo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import bi.baiqiu.utils.UtilTool;

/**
 * pc流量结构表
 */
@Table(name="bi_pc_flow_structure")
public class PcFlowStructureBean implements java.io.Serializable {

	// Fields

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id 
	private Integer flowId;

	    /**
	     *  日期  
	     */
	    @Column(name = "date")
	    private String date;

	    /**
	     *       来源                                                           
	     */
	    @Column(name = "flow_source")
	    private String flowSource;

	    /**
	     *               来源明细                                               
	     */
	    @Column(name = "flow_Source_details")
	    private String flowSourceDetails;

	    /**
	     *                        访客数                                        
	     */
	    @Column(name = "visitors_num")
	    private String visitorsNum;

	    /**
	     *                                              访客数变化              
	     */
	    @Column(name = "visitor_change")
	    private String visitorChange;

	    /**
	     *            新访客数                                                  
	     */
	    @Column(name = "new_visitors_num")
	    private String newVisitorsNum;

	    /**
	     *               新访客数变化                                           
	     */
	    @Column(name = "new_visitors_change")
	    private String newVisitorsChange;

	    /**
	     *       浏览量                                                         
	     */
	    @Column(name = "browser_num")
	    private String browserNum;

	    /**
	     *          浏览量变化                                                  
	     */
	    @Column(name = "browser_change")
	    private String browserChange;

	    /**
	     *          人均浏览量                                                  
	     */
	    @Column(name = "Per_capita_num")
	    private String perCapitaNum;

	    /**
	     *             人均浏览量变化                                           
	     */
	    @Column(name = "Per_capita_change")
	    private String perCapitaChange;

	    /**
	     *          收藏人数                                                    
	     */
	    @Column(name = "collectors_num")
	    private String collectorsNum;

	    /**
	     *             收藏人数变化                                             
	     */
	    @Column(name = "collectors_change")
	    private String collectorsChange;

	    /**
	     *             加入购物车人数                                           
	     */
	    @Column(name = "shopping_cart_per")
	    private String shoppingCartPer;

	    /**
	     *                    加入购物车人数变化                                
	     */
	    @Column(name = "shopping_cart_per_change")
	    private String shoppingCartPerChange;

	    /**
	     *     跳失率                                                           
	     */
	    @Column(name = "jump_rate")
	    private String jumpRate;

	    /**
	     *            跳失率变化                                                
	     */
	    @Column(name = "jump_rate_change")
	    private String jumpRateChange;

	    /**
	     *        下单金额                                                      
	     */
	    @Column(name = "order_amount")
	    private String orderAmount;

	    /**
	     *               下单金额变化                                           
	     */
	    @Column(name = "order_amount_change")
	    private String orderAmountChange;

	    /**
	     *        下单买家数                                                    
	     */
	    @Column(name = "order_buyers")
	    private String orderBuyers;

	    /**
	     *               下单买家数变化                                         
	     */
	    @Column(name = "order_buyers_change")
	    private String orderBuyersChange;

	    /**
	     *                 下单转化率                                           
	     */
	    @Column(name = "order_conversion_rate")
	    private String orderConversionRate;

	    /**
	     *                        下单转化率变化                                
	     */
	    @Column(name = "order_conversion_rate_change")
	    private String orderConversionRateChange;

	    /**
	     *          支付金额                                                    
	     */
	    @Column(name = "payment_amount")
	    private String paymentAmount;

	    /**
	     *                 支付金额变化                                         
	     */
	    @Column(name = "payment_amount_change")
	    private String paymentAmountChange;

	    /**
	     *       支付买家数                                                     
	     */
	    @Column(name = "buyers_paid")
	    private String buyersPaid;

	    /**
	     *              支付买家数变化                                          
	     */
	    @Column(name = "buyers_paid_change")
	    private String buyersPaidChange;

	    /**
	     *                   支付转化率                                         
	     */
	    @Column(name = "payment_conversion_rate")
	    private String paymentConversionRate;

	    /**
	     *                          支付转化率变化                              
	     */
	    @Column(name = "payment_conversion_rate_change")
	    private double paymentConversionRateChange;

	    /**
	     *   关联店铺id                                                         
	     */
	    @Column(name = "shop_id")
	    private String shopId;

	    /**
	     *       数据插入时间                                                   
	     */
	    @Column(name = "create_time")
	    private String createTime;

	    /**
	     *  备注                                                                
	     */
	    @Column(name = "remark")
	    private String remark;
	@Transient
	private String sortName;
	@Transient
	private String sortOrder;
	@Transient
	private String startDate;
	@Transient
	private String endDate;
	@Transient
	private List<PcFlowStructureBean> pcFlowStructureBeans;
	@Transient
	private Boolean deleteHistory;
	@Transient
	private int[]idArray;
	
	public PcFlowStructureBean() {
	}
	
	public PcFlowStructureBean(String date, String flowSource, String flowSourceDetails, String visitorsNum,
			String visitorChange, String newVisitorsNum, String newVisitorsChange, String browserNum,
			String browserChange, String perCapitaNum, String perCapitaChange, String collectorsNum,
			String collectorsChange, String shoppingCartPer, String shoppingCartPerChange, String jumpRate,
			String jumpRateChange, String orderAmount, String orderAmountChange, String orderBuyers,
			String orderBuyersChange, String orderConversionRate, String orderConversionRateChange,
			String paymentAmount, String paymentAmountChange, String buyersPaid, String buyersPaidChange,
			String paymentConversionRate, double paymentConversionRateChange, String shopId) {
		super();
		this.date = date;
		this.flowSource = flowSource;
		this.flowSourceDetails = flowSourceDetails;
		this.visitorsNum = visitorsNum;
		this.visitorChange = UtilTool.convertToDecimal(visitorChange);
		this.newVisitorsNum = newVisitorsNum;
		this.newVisitorsChange = UtilTool.convertToDecimal(newVisitorsChange);
		this.browserNum = browserNum;
		this.browserChange = UtilTool.convertToDecimal(browserChange);
		this.perCapitaNum = perCapitaNum;
		this.perCapitaChange = UtilTool.convertToDecimal(perCapitaChange);
		this.collectorsNum = collectorsNum;
		this.collectorsChange = UtilTool.convertToDecimal(collectorsChange);
		this.shoppingCartPer = shoppingCartPer;
		this.shoppingCartPerChange = UtilTool.convertToDecimal(shoppingCartPerChange);
		this.jumpRate = UtilTool.convertToDecimal(jumpRate);
		this.jumpRateChange = UtilTool.convertToDecimal(jumpRateChange);
		this.orderAmount = orderAmount;
		this.orderAmountChange = UtilTool.convertToDecimal(orderAmountChange);
		this.orderBuyers = orderBuyers;
		this.orderBuyersChange = UtilTool.convertToDecimal(orderBuyersChange);
		this.orderConversionRate = UtilTool.convertToDecimal(orderConversionRate);
		this.orderConversionRateChange = UtilTool.convertToDecimal(orderConversionRateChange);
		this.paymentAmount = paymentAmount;
		this.paymentAmountChange = UtilTool.convertToDecimal(paymentAmountChange);
		this.buyersPaid = buyersPaid;
		this.buyersPaidChange = UtilTool.convertToDecimal(buyersPaidChange);
		this.paymentConversionRate = UtilTool.convertToDecimal(paymentConversionRate);
		this.paymentConversionRateChange = paymentConversionRateChange;
		this.shopId = shopId;
	}

	public Integer getFlowId() {
		return flowId;
	}
	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFlowSource() {
		return flowSource;
	}
	public void setFlowSource(String flowSource) {
		this.flowSource = flowSource;
	}
	public String getFlowSourceDetails() {
		return flowSourceDetails;
	}
	public void setFlowSourceDetails(String flowSourceDetails) {
		this.flowSourceDetails = flowSourceDetails;
	}
	public String getVisitorsNum() {
		return visitorsNum;
	}
	public void setVisitorsNum(String visitorsNum) {
		this.visitorsNum = visitorsNum;
	}
	public String getVisitorChange() {
		return visitorChange;
	}
	public void setVisitorChange(String visitorChange) {
		this.visitorChange = visitorChange;
	}
	public String getNewVisitorsNum() {
		return newVisitorsNum;
	}
	public void setNewVisitorsNum(String newVisitorsNum) {
		this.newVisitorsNum = newVisitorsNum;
	}
	public String getNewVisitorsChange() {
		return newVisitorsChange;
	}
	public void setNewVisitorsChange(String newVisitorsChange) {
		this.newVisitorsChange = newVisitorsChange;
	}
	public String getBrowserNum() {
		return browserNum;
	}
	public void setBrowserNum(String browserNum) {
		this.browserNum = browserNum;
	}
	public String getBrowserChange() {
		return browserChange;
	}
	public void setBrowserChange(String browserChange) {
		this.browserChange = browserChange;
	}
	public String getPerCapitaNum() {
		return perCapitaNum;
	}
	public void setPerCapitaNum(String perCapitaNum) {
		this.perCapitaNum = perCapitaNum;
	}
	public String getPerCapitaChange() {
		return perCapitaChange;
	}
	public void setPerCapitaChange(String perCapitaChange) {
		this.perCapitaChange = perCapitaChange;
	}
	public String getCollectorsNum() {
		return collectorsNum;
	}
	public void setCollectorsNum(String collectorsNum) {
		this.collectorsNum = collectorsNum;
	}
	public String getCollectorsChange() {
		return collectorsChange;
	}
	public void setCollectorsChange(String collectorsChange) {
		this.collectorsChange = collectorsChange;
	}
	public String getShoppingCartPer() {
		return shoppingCartPer;
	}
	public void setShoppingCartPer(String shoppingCartPer) {
		this.shoppingCartPer = shoppingCartPer;
	}
	public String getShoppingCartPerChange() {
		return shoppingCartPerChange;
	}
	public void setShoppingCartPerChange(String shoppingCartPerChange) {
		this.shoppingCartPerChange = shoppingCartPerChange;
	}
	public String getJumpRate() {
		return jumpRate;
	}
	public void setJumpRate(String jumpRate) {
		this.jumpRate = jumpRate;
	}
	public String getJumpRateChange() {
		return jumpRateChange;
	}
	public void setJumpRateChange(String jumpRateChange) {
		this.jumpRateChange = jumpRateChange;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmountChange() {
		return orderAmountChange;
	}
	public void setOrderAmountChange(String orderAmountChange) {
		this.orderAmountChange = orderAmountChange;
	}
	public String getOrderBuyers() {
		return orderBuyers;
	}
	public void setOrderBuyers(String orderBuyers) {
		this.orderBuyers = orderBuyers;
	}
	public String getOrderBuyersChange() {
		return orderBuyersChange;
	}
	public void setOrderBuyersChange(String orderBuyersChange) {
		this.orderBuyersChange = orderBuyersChange;
	}
	public String getOrderConversionRate() {
		return orderConversionRate;
	}
	public void setOrderConversionRate(String orderConversionRate) {
		this.orderConversionRate = orderConversionRate;
	}
	public String getOrderConversionRateChange() {
		return orderConversionRateChange;
	}
	public void setOrderConversionRateChange(String orderConversionRateChange) {
		this.orderConversionRateChange = orderConversionRateChange;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentAmountChange() {
		return paymentAmountChange;
	}
	public void setPaymentAmountChange(String paymentAmountChange) {
		this.paymentAmountChange = paymentAmountChange;
	}
	public String getBuyersPaid() {
		return buyersPaid;
	}
	public void setBuyersPaid(String buyersPaid) {
		this.buyersPaid = buyersPaid;
	}
	public String getBuyersPaidChange() {
		return buyersPaidChange;
	}
	public void setBuyersPaidChange(String buyersPaidChange) {
		this.buyersPaidChange = buyersPaidChange;
	}
	public String getPaymentConversionRate() {
		return paymentConversionRate;
	}
	public void setPaymentConversionRate(String paymentConversionRate) {
		if(paymentConversionRate==null)
			paymentConversionRate="";
		this.paymentConversionRate = paymentConversionRate;
	}
	public double getPaymentConversionRateChange() {
		return paymentConversionRateChange;
	}
	public void setPaymentConversionRateChange(double paymentConversionRateChange) {
		this.paymentConversionRateChange = paymentConversionRateChange;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		//通过逆向驼峰转换进而排序
		Matcher matcher = Pattern.compile("[A-Z]").matcher(sortName);
	    StringBuilder builder = new StringBuilder(sortName);
	    for (int i = 0; matcher.find(); i++) {
	        builder.replace(matcher.start() + i, matcher.end() + i, "_" + matcher.group().toLowerCase());
	    }
	    if (builder.charAt(0) == '_') {
	        builder.deleteCharAt(0);
	    }
	
		this.sortName = builder.toString();
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<PcFlowStructureBean> getPcFlowStructureBeans() {
		return pcFlowStructureBeans;
	}

	public void setPcFlowStructureBeans(List<PcFlowStructureBean> pcFlowStructureBeans) {
		this.pcFlowStructureBeans = pcFlowStructureBeans;
	}

	public Boolean getDeleteHistory() {
		return deleteHistory;
	}

	public void setDeleteHistory(Boolean deleteHistory) {
		this.deleteHistory = deleteHistory;
	}

	public int[] getIdArray() {
		return idArray;
	}

	public void setIdArray(int[] idArray) {
		this.idArray = idArray;
	}

	
}