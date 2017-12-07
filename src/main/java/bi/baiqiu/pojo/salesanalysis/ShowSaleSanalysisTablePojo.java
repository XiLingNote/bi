package bi.baiqiu.pojo.salesanalysis;
import java.util.ArrayList;
import java.util.List;
import bi.baiqiu.utils.UtilTool;

/**
 * @version: v1.0.0
 * @author Jared
 * @date Creat Time : 2017年11月16日 上午11:43:32
 * @Description: 销售分析展示的对象
 */
public class ShowSaleSanalysisTablePojo {
	// 价格区间
	private String priceRange;
	// 实付金额
	private String payment;
	// 订单数
	private String ordersNum;
	// 销售金额占比
	private String gmvPercent;
	// 订单占比
	private String ordersPerce;
	// 店铺id
	private String shopId;
	// 开始时间
	private String startDate;
	// 结束时间
	private String endDate;
	// 支付时间
	private String payTime;
	// 店铺订单最大支付时间
	private String maxPrice;
	// 价格区间集合
	private String priceRanges;
	// 订单数集合
	private String ordersNums;
	// 支付金额集合
	private String payments;
	private String[] priceRangeArray = new String[0];
	private String[] paymentArray = new String[0];
	private String[] ordersNumArray = new String[0];
	private List<ShowSaleSanalysisTablePojo> showList;

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getOrdersNum() {
		return ordersNum;
	}

	public void setOrdersNum(String ordersNum) {
		this.ordersNum = ordersNum;
	}

	public String getGmvPercent() {
		return gmvPercent;
	}

	public void setGmvPercent(String gmvPercent) {
		this.gmvPercent = gmvPercent;
	}

	public String getOrdersPerce() {
		return ordersPerce;
	}

	public void setOrdersPerce(String ordersPerce) {
		this.ordersPerce = ordersPerce;
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

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getPriceRanges() {
		return priceRanges;
	}

	public void setPriceRanges(String priceRanges) {
		if(priceRanges!=null)this.priceRangeArray=priceRanges.split(",");
		this.priceRanges = priceRanges;
	}

	public String getOrdersNums() {
		return ordersNums;
	}

	public void setOrdersNums(String ordersNums) {
		if(ordersNums!=null)this.ordersNumArray=ordersNums.split(",");
		this.ordersNums = ordersNums;
	}

	public String getPayments() {
		return payments;
	}

	public void setPayments(String payments) {
		if(payments!=null)this.paymentArray=payments.split(",");
		this.payments = payments;
	}

	public String[] getPriceRangeArray() {
		return priceRangeArray;
	}

	public void setPriceRangeArray(String[] priceRangeArray) {
		this.priceRangeArray = priceRangeArray;
	}

	public String[] getPaymentArray() {
		return paymentArray;
	}

	public void setPaymentArray(String[] paymentArray) {
		this.paymentArray = paymentArray;
	}

	public String[] getOrdersNumArray() {
		return ordersNumArray;
	}

	public void setOrdersNumArray(String[] ordersNumArray) {
		this.ordersNumArray = ordersNumArray;
	}

	public ShowSaleSanalysisTablePojo addPriceNumAndPayment(ShowSaleSanalysisTablePojo pojo) {
		if (pojo == null) {
			return this;
		}
		this.payment=UtilTool.stringNumAdd(this.getPayment(), pojo.getPayment());
		this.ordersNum=UtilTool.stringNumAdd(this.getOrdersNum(), pojo.getOrdersNum());
		// 当前
		String[] thisOrdersNums =this.getOrdersNumArray();
		String[] thisPriceRanges = this.getPriceRangeArray();
		String[] thisPayments = this.getPaymentArray();
		// 累加
		String[] pojoOrdersNums = UtilTool.getStringArrayBySplit(pojo.getOrdersNums(), ",");
		String[] pojoPriceRanges = UtilTool.getStringArrayBySplit(pojo.getPriceRanges(), ",");
		String[] pojoPayments = UtilTool.getStringArrayBySplit(pojo.getPayments(), ",");
		// 总的两个数组的交集
		String[] totalPriceRanges = UtilTool.stringUnion(thisPriceRanges, pojoPriceRanges);
		String[] totalOrdersNums = new String[totalPriceRanges.length];
		String[] toatlPayments = new String[totalPriceRanges.length];
		List<ShowSaleSanalysisTablePojo> list=new ArrayList<ShowSaleSanalysisTablePojo>();
		// 循环第三个数组，累加前两个数组的和
		for (int k = 0; k < totalPriceRanges.length; k++) {
			for (int i = 0; i < thisPriceRanges.length; i++) {
				if (totalPriceRanges[k].equals(thisPriceRanges[i])) {
					totalOrdersNums[k] = UtilTool.stringNumAdd(totalOrdersNums[k], thisOrdersNums[i]);
					toatlPayments[k] = UtilTool.stringNumAdd(toatlPayments[k], thisPayments[i]);
				}
			}
			for (int j = 0; j < pojoPriceRanges.length; j++) {
				if (totalPriceRanges[k].equals(pojoPriceRanges[j])) {
					totalOrdersNums[k] = UtilTool.stringNumAdd(totalOrdersNums[k], pojoOrdersNums[j]);
					toatlPayments[k] = UtilTool.stringNumAdd(toatlPayments[k], pojoPayments[j]);
				}
			}
			ShowSaleSanalysisTablePojo addShow=new ShowSaleSanalysisTablePojo();
			addShow.setOrdersNum(totalOrdersNums[k]);
			addShow.setPayment(toatlPayments[k]);
			addShow.setPriceRange(totalPriceRanges[k]);
			addShow.setGmvPercent(UtilTool.stringPercent(toatlPayments[k],this.payment));
			addShow.setOrdersPerce(UtilTool.stringPercent(totalOrdersNums[k],this.ordersNum));
			list.add(addShow);
		}
		this.setOrdersNumArray(totalOrdersNums);
		this.setPriceRangeArray(totalPriceRanges);
		this.setPaymentArray(toatlPayments);
		this.setShowList(list);
		return this;
	}

	public List<ShowSaleSanalysisTablePojo> getShowList() {
		return showList;
	}

	public void setShowList(List<ShowSaleSanalysisTablePojo> showList) {
		this.showList = showList;
	}
}