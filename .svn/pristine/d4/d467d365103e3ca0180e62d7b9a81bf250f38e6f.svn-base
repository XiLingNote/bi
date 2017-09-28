package bi.baiqiu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class SortAmountByDate implements Comparable<RedisPojo>, Serializable {

	private String date;

	private BigDecimal amount;

	private double target;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}

	@Override
	public int compareTo(RedisPojo o) {
		int time1 = Integer.parseInt(this.date);
		int time2 = Integer.parseInt(o.getDatetime());
		return time1 - time2;
	}

}
