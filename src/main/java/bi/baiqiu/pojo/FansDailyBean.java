package bi.baiqiu.pojo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 */
@Table(name = "bi_fans_daliy")
public class FansDailyBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String date;
	private Integer fansTotal;
	private Integer newFans;
	private Integer newMembership;
	private Integer activeFans;
	private Integer fansTurnover;
	private Integer cancelFans;
	private Integer shopId;
	private String createTime;
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
	private Boolean deleteHistory;
	@Transient
	private int[]idArray;

	/** default constructor */
	public FansDailyBean() {
	}

	
	// Property accessors

	public Integer getId() {
		return this.id;
	}
public FansDailyBean(String date, Integer fansTotal, Integer newFans, Integer newMembership, Integer activeFans,
		Integer fansTurnover, Integer cancelFans, Integer shopId) {
		super();
		this.date = date;
		this.fansTotal = fansTotal;
		this.newFans = newFans;
		this.newMembership = newMembership;
		this.activeFans = activeFans;
		this.fansTurnover = fansTurnover;
		this.cancelFans = cancelFans;
		this.shopId = shopId;
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


	public Integer getFansTotal() {
		return fansTotal;
	}


	public void setFansTotal(Integer fansTotal) {
		this.fansTotal = fansTotal;
	}


	public Integer getNewFans() {
		return newFans;
	}


	public void setNewFans(Integer newFans) {
		this.newFans = newFans;
	}


	public Integer getNewMembership() {
		return newMembership;
	}


	public void setNewMembership(Integer newMembership) {
		this.newMembership = newMembership;
	}


	public Integer getActiveFans() {
		return activeFans;
	}


	public void setActiveFans(Integer activeFans) {
		this.activeFans = activeFans;
	}


	public Integer getFansTurnover() {
		return fansTurnover;
	}


	public void setFansTurnover(Integer fansTurnover) {
		this.fansTurnover = fansTurnover;
	}


	public Integer getCancelFans() {
		return cancelFans;
	}


	public void setCancelFans(Integer cancelFans) {
		this.cancelFans = cancelFans;
	}


	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		// 通过逆向驼峰转换进而排序
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