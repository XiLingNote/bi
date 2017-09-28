package bi.baiqiu.pojo;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**每日计划实体类
 * @author Administrator
 *
 */
@Table(name = "bi_daily_target")
@Entity
public class DailyTarget {
	@Id
	private Integer id;
	private String date;
	private BigInteger payment;
	private Integer shopId;
	@Transient
	private String startDate;
	@Transient
	private String endDate;
	@Transient
	private String sortName;
	@Transient 
	private String sortOrder;
	
	private List<DailyTarget> dailyTargets;
	public DailyTarget() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigInteger getPayment() {
		return payment;
	}
	public void setPayment(BigInteger payment) {
		this.payment = payment;
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
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public List<DailyTarget> getDailyTargets() {
		return dailyTargets;
	}
	public void setDailyTargets(List<DailyTarget> dailyTargets) {
		this.dailyTargets = dailyTargets;
	}
	

}
