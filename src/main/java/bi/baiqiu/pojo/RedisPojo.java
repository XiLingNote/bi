package bi.baiqiu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @comment
 * @author Jim
 * @date 2017年8月25日 下午1:27:14
 * @version 1.0.0
 * @see
 */
public class RedisPojo implements Comparable<RedisPojo>, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "RedisPojo [gmv=" + gmv + ", target=" + target
				+ ", completeness=" + completeness + ", alipay=" + alipay
				+ ", alipayTarget=" + alipayTarget + ", orderNum=" + orderNum
				+ ", alipayOut=" + alipayOut + ", alipayCompleteness="
				+ alipayCompleteness + ", datetime=" + datetime + "]";
	}

	private BigDecimal gmv = new BigDecimal(0);
	// 目标
	private BigDecimal target = new BigDecimal(0);

	// 完成率
	private Double completeness;

	// 支付宝订单收入（不计支出）
	private BigDecimal alipay = new BigDecimal(0);

	// 支付宝目标
	private BigDecimal alipayTarget = new BigDecimal(0);

	// 订单数量
	private Integer orderNum = 0;

	// 支付宝订单支出
	private BigDecimal alipayOut = new BigDecimal(0);

	// 支付宝 完成率
	// @Expose
	private Double alipayCompleteness;

	// 排序字段
	private String datetime;

	public BigDecimal getAlipayOut() {
		return alipayOut;
	}

	public void increaseOrderNum(Integer orderNum) {
		if (orderNum != null) {
			this.orderNum = this.orderNum + orderNum;
		}
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public void setCompleteness(Double completeness) {
		this.completeness = completeness;
	}

	public void setAlipayOut(BigDecimal alipayOut) {
		this.alipayOut = alipayOut;
	}

	public void increaseAlipayOut(BigDecimal alipayOut) {
		if (this.alipayOut == null) {
			this.alipayOut = alipayOut;
		} else {
			this.alipayOut = this.alipayOut.add(alipayOut);
		}
	}

	public void setAlipayCompleteness(Double alipayCompleteness) {
		this.alipayCompleteness = alipayCompleteness;
	}

	public BigDecimal getGmv() {
		return gmv;
	}

	public void setGmv(BigDecimal gmv) {
		this.gmv = gmv;
	}

	public void increaseGmv(BigDecimal gmv) {
		if (this.gmv == null) {
			this.gmv = gmv;
		} else {
			this.gmv = this.gmv.add(gmv);
		}
	}

	public void decreaseGmv(BigDecimal gmv) {
		this.gmv = this.gmv.subtract(gmv);
	}

	public BigDecimal getTarget() {
		return target;
	}

	public void setTarget(BigDecimal target) {
		if (this.target == null) {
			this.target = target;
		} else {
			this.target = target;
		}
	}

	public void increaseTarget(BigDecimal target) {
		this.target = this.target.add(target);
	}

	public void decreaseTarget(BigDecimal target) {
		this.target = this.target.subtract(target);
	}

	public double getCompleteness() {
		return completeness;
	}

	public void setCompleteness() {

		if (this.target.longValue() != 0) {
			this.completeness = this.gmv.doubleValue()
					/ this.target.doubleValue();
		} else {
			this.completeness = 0.0;
		}
	}

	public BigDecimal getAlipay() {
		return alipay;
	}

	public void setAlipay(BigDecimal alipay) {
		this.alipay = alipay;
	}

	public void increaseAlipay(BigDecimal alipay) {
		this.alipay = this.alipay.add(alipay);
	}

	public void decreaseAlipay(BigDecimal alipay) {
		this.alipay = this.alipay.subtract(alipay);
	}

	public BigDecimal getAlipayTarget() {
		return alipayTarget;
	}

	public void setAlipayTarget(BigDecimal alipayTarget) {
		this.alipayTarget = alipayTarget;
	}

	public void increaseAlipayTarget(BigDecimal alipayTarget) {
		this.alipayTarget = this.alipayTarget.add(alipayTarget);
	}

	public void decreaseAlipayTarget(BigDecimal alipayTarget) {
		this.alipayTarget = this.alipayTarget.add(alipayTarget);
	}

	public double getAlipayCompleteness() {
		return alipayCompleteness;
	}

	public void setAlipayCompleteness() {
		if (this.alipayTarget.doubleValue() != 0) {

			this.alipayCompleteness = this.alipay.doubleValue()
					/ this.alipayTarget.doubleValue();
		} else {
			this.alipayCompleteness = 0d;
		}
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	@Override
	public int compareTo(RedisPojo o) {
		int time1 = Integer.parseInt(this.datetime);
		int time2 = Integer.parseInt(o.getDatetime());
		return time1 - time2;
	}

	public void init() {
		this.gmv = new BigDecimal(0);
		this.target = new BigDecimal(0);
		this.alipay = new BigDecimal(0);
		this.alipayTarget = new BigDecimal(0);

		// this.datetime = null;
	}

}
