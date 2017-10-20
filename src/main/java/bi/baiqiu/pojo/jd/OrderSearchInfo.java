package bi.baiqiu.pojo.jd;

import java.util.List;

import com.jd.open.api.sdk.domain.order.CouponDetail;
import com.jd.open.api.sdk.domain.order.ItemInfo;
import com.jd.open.api.sdk.domain.order.UserInfo;
import com.jd.open.api.sdk.domain.order.VatInvoiceInfo;
import com.taobao.api.internal.mapping.ApiField;

public class OrderSearchInfo {
	@ApiField("order_id")
	private String orderId;
	@ApiField("vender_id")
	private String venderId;
	@ApiField("pay_type")
	private String payType;
	@ApiField("order_total_price")
	private String orderTotalPrice;
	@ApiField("order_seller_price")
	private String orderSellerPrice;
	@ApiField("order_payment")
	private String orderPayment;
	@ApiField("freight_price")
	private String freightPrice;
	@ApiField("seller_discount")
	private String sellerDiscount;
	@ApiField("order_state")
	private String orderState;
	@ApiField("order_state_remark")
	private String orderStateRemark;
	@ApiField("delivery_type")
	private String deliveryType;
	@ApiField("invoice_info")
	private String invoiceInfo;
	@ApiField("order_remark")
	private String orderRemark;
	@ApiField("order_start_time")
	private String orderStartTime;
	@ApiField("order_end_time")
	private String orderEndTime;
	private String modified;
	@ApiField("consignee_info")
	private UserInfo consigneeInfo;
	@ApiField("item_info_list")
	private List<ItemInfo> itemInfoList;
	@ApiField("coupon_detail_list")
	private List<CouponDetail> couponDetailList;
	@ApiField("vender_remark")
	private String venderRemark;
	@ApiField("balance_used")
	private String balanceUsed;
	@ApiField("payment_confirm_time")
	private String paymentConfirmTime;
	@ApiField("waybill")
	private String waybill;
	@ApiField("logistics_id")
	private String logisticsId;
	@ApiField("order_source")
	private String orderSource;
	@ApiField("vat_invoice_info")
	private VatInvoiceInfo vatInvoiceInfo;
	@ApiField("parent_order_id")
	private String parentOrderId;
	@ApiField("customs")
	private String customs;
	@ApiField("customs_model")
	private String customsModel;
	@ApiField("order_sign")
	private String orderSign;
	@ApiField("store_order")
	private String storeOrder;
	@ApiField("pin")
	private String pin;
	@ApiField("return_order")
	private String returnOrder;

	public String getStoreOrder() {
		return this.storeOrder;
	}

	public void setStoreOrder(String storeOrder) {
		this.storeOrder = storeOrder;
	}

	public String getOrderSign() {
		return this.orderSign;
	}

	public void setOrderSign(String orderSign) {
		this.orderSign = orderSign;
	}

	public String getCustoms() {
		return this.customs;
	}

	public void setCustoms(String customs) {
		this.customs = customs;
	}

	public String getCustomsModel() {
		return this.customsModel;
	}

	public void setCustomsModel(String customsModel) {
		this.customsModel = customsModel;
	}

	public String getOrderSource() {
		return this.orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getParentOrderId() {
		return this.parentOrderId;
	}

	public void setParentOrderId(String parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public String getWaybill() {
		return this.waybill;
	}

	public void setWaybill(String waybill) {
		this.waybill = waybill;
	}

	public String getLogisticsId() {
		return this.logisticsId;
	}

	public void setLogisticsId(String logisticsId) {
		this.logisticsId = logisticsId;
	}

	public VatInvoiceInfo getVatInvoiceInfo() {
		return this.vatInvoiceInfo;
	}

	public void setVatInvoiceInfo(VatInvoiceInfo vatInvoiceInfo) {
		this.vatInvoiceInfo = vatInvoiceInfo;
	}

	public String getPaymentConfirmTime() {
		return this.paymentConfirmTime;
	}

	public void setPaymentConfirmTime(String paymentConfirmTime) {
		this.paymentConfirmTime = paymentConfirmTime;
	}

	public String getModified() {
		return this.modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getReturnOrder() {
		return this.returnOrder;
	}

	public void setReturnOrder(String returnOrder) {
		this.returnOrder = returnOrder;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getVenderId() {
		return this.venderId;
	}

	public void setVenderId(String venderId) {
		this.venderId = venderId;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getOrderTotalPrice() {
		return this.orderTotalPrice;
	}

	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public String getOrderSellerPrice() {
		return this.orderSellerPrice;
	}

	public void setOrderSellerPrice(String orderSellerPrice) {
		this.orderSellerPrice = orderSellerPrice;
	}

	public String getOrderPayment() {
		return this.orderPayment;
	}

	public void setOrderPayment(String orderPayment) {
		this.orderPayment = orderPayment;
	}

	public String getFreightPrice() {
		return this.freightPrice;
	}

	public void setFreightPrice(String freightPrice) {
		this.freightPrice = freightPrice;
	}

	public String getSellerDiscount() {
		return this.sellerDiscount;
	}

	public void setSellerDiscount(String sellerDiscount) {
		this.sellerDiscount = sellerDiscount;
	}

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOrderStateRemark() {
		return this.orderStateRemark;
	}

	public void setOrderStateRemark(String orderStateRemark) {
		this.orderStateRemark = orderStateRemark;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getInvoiceInfo() {
		return this.invoiceInfo;
	}

	public void setInvoiceInfo(String invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public String getOrderRemark() {
		return this.orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public String getOrderStartTime() {
		return this.orderStartTime;
	}

	public void setOrderStartTime(String orderStartTime) {
		this.orderStartTime = orderStartTime;
	}

	public String getOrderEndTime() {
		return this.orderEndTime;
	}

	public void setOrderEndTime(String orderEndTime) {
		this.orderEndTime = orderEndTime;
	}

	public UserInfo getConsigneeInfo() {
		return this.consigneeInfo;
	}

	public void setConsigneeInfo(UserInfo consigneeInfo) {
		this.consigneeInfo = consigneeInfo;
	}

	public List<ItemInfo> getItemInfoList() {
		return this.itemInfoList;
	}

	public void setItemInfoList(List<ItemInfo> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getVenderRemark() {
		return this.venderRemark;
	}

	public void setVenderRemark(String venderRemark) {
		this.venderRemark = venderRemark;
	}

	public String getBalanceUsed() {
		return this.balanceUsed;
	}

	public void setBalanceUsed(String balanceUsed) {
		this.balanceUsed = balanceUsed;
	}

	public List<CouponDetail> getCouponDetailList() {
		return this.couponDetailList;
	}

	public void setCouponDetailList(List<CouponDetail> couponDetailList) {
		this.couponDetailList = couponDetailList;
	}
}
