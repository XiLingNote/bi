package bi.baiqiu.pojo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**每日计划实体类
 * @author Administrator
 *
 */
@Table(name = "bi_daily_schedule")
@Entity
public class DailyScheduleBean {
	@Id
	private Integer id;
	private Integer shopId;
	private String title;
	private String scheduleDesc;
	private String startDate;
	private String endDate;
	
	public DailyScheduleBean() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getScheduleDesc() {
		return scheduleDesc;
	}
	public void setScheduleDesc(String scheduleDesc) {
		this.scheduleDesc = scheduleDesc;
	}

}
