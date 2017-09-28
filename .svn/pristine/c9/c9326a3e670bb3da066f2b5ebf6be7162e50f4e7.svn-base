package bi.baiqiu.pojo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import bi.baiqiu.utils.UtilTool;

/**
 *无线流量结构表
 */
@Table(name="bi_wireless_flow_structure")
public  class WirelessFlowStructureBean  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields    
	@Id
     private Integer flowId;
     private String date;
     private String flowSource;
     private String flowSourceDetails;
     private String visitorsNum;
     private String visitorChange;
     private String orderAmount;
     private String orderAmountChange;
     private String orderBuyers;
     private String orderBuyersChange;
     private String orderConversionRate;
     private String orderConversionRateChange;
     private String paymentAmount;
     private String paymentAmountChange;
     private String buyersPaid;
     private String buyersPaidChange;
     private String paymentConversionRate;
     private String paymentConversionRateChange;
     private Integer shopId;
     private String createTime;
     private String remark;
     @Transient
     private String startDate;
     @Transient
     private String endDate;
     @Transient
     private String sortName;
     @Transient
     private String sortOrder;
     @Transient
     private Boolean deleteHistory;
     @Transient
     private int [] idArray;



    /** default constructor */
    public WirelessFlowStructureBean() {
    }



	public WirelessFlowStructureBean(String date, String flowSource, String flowSourceDetails, String visitorsNum,
			String visitorChange, String orderBuyers,String orderBuyersChange , String orderAmount,
			String orderAmountChange, String orderConversionRate, String orderConversionRateChange,
			String paymentAmount, String paymentAmountChange, String buyersPaid, String buyersPaidChange,
			String paymentConversionRate, String paymentConversionRateChange, Integer shopId) {
		super();
		this.date = date;
		this.flowSource = flowSource;
		this.flowSourceDetails = flowSourceDetails;
		this.visitorsNum = visitorsNum;
		this.visitorChange = UtilTool.convertToDecimal(visitorChange);
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
		this.paymentConversionRateChange = UtilTool.convertToDecimal(paymentConversionRateChange);
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
		this.paymentConversionRate = paymentConversionRate;
	}



	public String getPaymentConversionRateChange() {
		return paymentConversionRateChange;
	}



	public void setPaymentConversionRateChange(String paymentConversionRateChange) {
		this.paymentConversionRateChange = paymentConversionRateChange;
	}



	public Integer getShopId() {
		return shopId;
	}



	public void setShopId(Integer shopId) {
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