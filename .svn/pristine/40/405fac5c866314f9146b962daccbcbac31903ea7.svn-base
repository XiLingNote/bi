package bi.baiqiu.pojo;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 *访客特征月报
 */
@Table(name="bi_visitor_month_features")
public  class VisitorMonthFeaturesBean  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String date;
     private String feature;
     private String property;
     private Float proportion;
     private Integer shopId;
     private String startDate;
     private String endDate;
     @Transient
     private String sortName;
     @Transient
     private String sortOrder;
     @Transient
     private String createTime;
     @Transient
     private String remark;
     @Transient
 	private Boolean deleteHistory;
 	@Transient
 	private int[]idArray;


    // Constructors

    /** default constructor */
    public VisitorMonthFeaturesBean() {
    }


	public VisitorMonthFeaturesBean(String date, String feature, String property, Float proportion, Integer shopId) {
		super();
		this.setDate(date);
		this.feature = feature;
		this.property = property;
		this.proportion = proportion;
		this.shopId = shopId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}



	public String getFeature() {
		return feature;
	}


	public void setFeature(String feature) {
		this.feature = feature;
	}


	public String getProperty() {
		return property;
	}


	public void setProperty(String property) {
		this.property = property;
	}


	public Float getProportion() {
		return proportion;
	}


	public void setProportion(Float proportion) {
		this.proportion = proportion;
	}


	public Integer getShopId() {
		return shopId;
	}


	public void setShopId(Integer shopId) {
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


	public String getSortName() {
		return sortName;
	}


	public void setSortName(String sortName) {
		this.sortName = sortName;
	}


	public String getSortOrder() {
		return sortOrder;
	}


	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
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


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
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