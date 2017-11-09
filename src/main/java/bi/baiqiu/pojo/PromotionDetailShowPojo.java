package bi.baiqiu.pojo;



import java.util.HashMap;
import java.util.Map;

import bi.baiqiu.utils.UtilTool;

/**
 * @version: v1.0.0
 * @author Jared
 * @date Creat Time : 2017年11月7日 下午5:00:52
 * @Description: 优惠明细
 */
public class PromotionDetailShowPojo {
	// 支付时间
	private String payTime;
	// 商品总金额
	private String sumTotalFee;
	// 实付金额
	private String sumPayment;
	// 商品优惠金额(sumTotalFee-sumPayment)
	private String orderSumDiscountFee;
	// 优惠表优惠金额(detailDiscountFees)
	private String detailSumDiscountFee;
	// 优惠详情列表
	private String promotionNames;
	// 优惠详情金额与列表一一对应以 , 隔开多个
	private String detailDiscountFees;
	// 店铺id
	private String shopId;
	// 开始时间
	private String startDate;
	// 结束时间
	private String endDate;

	private String[] promotionName = new String[0];

	private String[] detailDiscountFee = new String[0];
	
	private String [][] detailDiscountFeeSection;
	private Map<String,String>  orderPromotionNameAndFee;

	private PromotionDetailShowPojo pojo;

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getSumTotalFee() {
		return sumTotalFee;
	}

	public void setSumTotalFee(String sumTotalFee) {
		this.sumTotalFee = sumTotalFee;
	}

	public String getSumPayment() {
		return sumPayment;
	}

	public void setSumPayment(String sumPayment) {
		this.sumPayment = sumPayment;
	}

	public String getOrderSumDiscountFee() {
		return orderSumDiscountFee;
	}

	public void setOrderSumDiscountFee(String orderSumDiscountFee) {
		this.orderSumDiscountFee = orderSumDiscountFee;
	}

	public String getDetailSumDiscountFee() {
		return detailSumDiscountFee;
	}

	public void setDetailSumDiscountFee(String detailSumDiscountFee) {
		this.detailSumDiscountFee = detailSumDiscountFee;
	}

	public String getPromotionNames() {
		return promotionNames;
	}

	public void setPromotionNames(String promotionNames) {
		if (promotionNames != null)
			this.promotionName = promotionNames.split(",");
		this.promotionNames = promotionNames;
	}

	public String getDetailDiscountFees() {
		return detailDiscountFees;
	}

	public void setDetailDiscountFees(String detailDiscountFees) {
		if (detailDiscountFees != null)
			this.detailDiscountFee = detailDiscountFees.split(",");
		this.detailDiscountFees = detailDiscountFees;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String[] getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String[] promotionName) {
		this.promotionName = promotionName;
	}

	public String[] getDetailDiscountFee() {
		return detailDiscountFee;
	}

	public void setDetailDiscountFee(String[] detailDiscountFee) {
		this.detailDiscountFee = detailDiscountFee;
	}

	public PromotionDetailShowPojo getPojo() {
		return pojo;
	}

	public void setPojo(PromotionDetailShowPojo pojo) {
		this.pojo = pojo;
	}
	public Map<String,String> getOrderPromotionNameAndFee() {
		return orderPromotionNameAndFee;
	}

	public void setOrderPromotionNameAndFee(Map<String,String> orderPromotionNameAndFee) {
		this.orderPromotionNameAndFee = orderPromotionNameAndFee;
	}
	/**
	 * @Function: addPromotionName
	 * @Description:累加两个对象的四个数组
	 * @param pojo
	 * @return void
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年11月9日 Jared v1.0.0
	 */
	public void addPromotionName(PromotionDetailShowPojo pojo) {
		// 数组为空返回
		if (pojo == null || pojo.getDetailDiscountFee() == null || pojo.getPromotionName() == null) {
			return;
		}
		// 当前
		String[] thisPromotionName = this.getPromotionName();
		String[] thisDetailDiscountFee = this.getDetailDiscountFee();
		// 累加
		String[] addPromotionName = pojo.getPromotionName();
		String[] adddetailDiscountFee = pojo.getDetailDiscountFee();
		// 总的两个数组的交集
		String[] totalPromotionName = UtilTool.stringUnion(thisPromotionName, addPromotionName);
		String[] totalDetailDiscountFee = new String[totalPromotionName.length];
		Map<String,String>promotionNameAndFeeMap=new HashMap<String, String>();
		// 遍历总数组名字,如果明细数组名字同将两个金额数组对应下标的值加在一
		for (int k = 0; k < totalPromotionName.length; k++) {

			for (int i = 0; i < thisPromotionName.length; i++) {
				if (totalPromotionName[k].equals(thisPromotionName[i])) {
					totalDetailDiscountFee[k] = UtilTool.stringNumAdd(totalDetailDiscountFee[k],
							thisDetailDiscountFee[i]);
				}
			}
			for (int j = 0; j < addPromotionName.length; j++) {
				if (totalPromotionName[k].equals(addPromotionName[j])) {
					totalDetailDiscountFee[k] = UtilTool.stringNumAdd(totalDetailDiscountFee[k],
							adddetailDiscountFee[j]);
				}
			}
			promotionNameAndFeeMap.put(totalPromotionName[k], totalDetailDiscountFee[k]);
		}
		this.orderPromotionNameAndFee=promotionNameAndFeeMap;
		this.orderSumDiscountFee=UtilTool.stringNumAdd(this.getOrderSumDiscountFee(),pojo.getOrderSumDiscountFee());
		this.detailSumDiscountFee=UtilTool.stringNumAdd(this.getDetailSumDiscountFee(),pojo.getDetailSumDiscountFee());
		this.sumPayment=UtilTool.stringNumAdd(this.getSumPayment(),pojo.getSumPayment());
		this.sumTotalFee=UtilTool.stringNumAdd(this.getSumTotalFee(),pojo.getSumTotalFee());
		this.detailDiscountFee = totalDetailDiscountFee;
		this.promotionName = totalPromotionName;
	}

	public String [][] getDetailDiscountFeeSection() {
		return detailDiscountFeeSection;
	}

	public void setDetailDiscountFeeSection(String [][] detailDiscountFeeSection) {
		this.detailDiscountFeeSection = detailDiscountFeeSection;
	}
}
