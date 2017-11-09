package bi.baiqiu.pojo.management;

import java.util.Date;

/**@version: v1.0.0
 * @author Jared
 *@date  Creat Time : 2017年10月23日 下午6:12:57
 * @Description: 
 */
public class StoreManagerPojo {

	//请求路径
    private String erpSessionKey;
    private String crmSessionKey;
    private String appKey;
    private String token;
    private String serviceUrl;
    private String appSecret;
    //店铺id
    private String shopId;
    //店铺状态
    private String storeStatus;
    //店铺名称简称
    private String storeShortName;
    //店铺名称
    private String storeName;
    //店铺logo
    private String logoUrl;
    //店铺开始时间
    private String storeStartDate;
    //店铺结束时间
    private String storeEndDate;
    //部门id
    private Integer departmentId;
    //部门全称
    private String departmentName;
    //部门简称
    private String departmenShortName;
    //部门状态
    private String departmentStatus;
    //平台id
    private Integer platId;
    //平台简称
    private String platShortName;
    //平台全称
    private String platName;
    //平台状态
    private String platStatus;
    //事业部大屏幕是否统计
    private String departmentStatistic;
    //是否显示
    private String departmentDisplayState;
    //显示名称
    private String departmentDisplayName;
    //仓库大屏幕是否统计
    private String warehouseStatistic;
    //是否显示
    private String warehouseDisplayState;
    //显示名称
    private String warehouseDisplayName;
    //erp库名
    private String  erpRepertoryName;
   //oms库名
    private String omsRepertoryName;
    
    private String sortOrder;
    
    private String sortName;
    
	public String getErpSessionKey() {
		return erpSessionKey;
	}
	public void setErpSessionKey(String erpSessionKey) {
		this.erpSessionKey = erpSessionKey;
	}
	public String getCrmSessionKey() {
		return crmSessionKey;
	}
	public void setCrmSessionKey(String crmSessionKey) {
		this.crmSessionKey = crmSessionKey;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getServiceUrl() {
		return serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getStoreShortName() {
		return storeShortName;
	}
	public void setStoreShortName(String storeShortName) {
		this.storeShortName = storeShortName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getStoreStartDate() {
		return storeStartDate;
	}
	public void setStoreStartDate(String storeStartDate) {
		this.storeStartDate = storeStartDate;
	}
	public String getStoreEndDate() {
		return storeEndDate;
	}
	public void setStoreEndDate(String storeEndDate) {
		this.storeEndDate = storeEndDate;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmenShortName() {
		return departmenShortName;
	}
	public void setDepartmenShortName(String departmenShortName) {
		this.departmenShortName = departmenShortName;
	}
	public Integer getPlatId() {
		return platId;
	}
	public void setPlatId(Integer platId) {
		this.platId = platId;
	}
	public String getPlatShortName() {
		return platShortName;
	}
	public void setPlatShortName(String platShortName) {
		this.platShortName = platShortName;
	}
	public String getPlatName() {
		return platName;
	}
	public void setPlatName(String platName) {
		this.platName = platName;
	}
	public String getPlatStatus() {
		return platStatus;
	}
	public void setPlatStatus(String platStatus) {
		this.platStatus = platStatus;
	}
	public String getDepartmentDisplayName() {
		return departmentDisplayName;
	}
	public void setDepartmentDisplayName(String departmentDisplayName) {
		this.departmentDisplayName = departmentDisplayName;
	}
	public String getStoreStatus() {
		return storeStatus;
	}
	public void setStoreStatus(String storeStatus) {
		this.storeStatus = storeStatus;
	}
	public String getWarehouseStatistic() {
		return warehouseStatistic;
	}
	public void setWarehouseStatistic(String warehouseStatistic) {
		this.warehouseStatistic = warehouseStatistic;
	}
	public String getWarehouseDisplayState() {
		return warehouseDisplayState;
	}
	public void setWarehouseDisplayState(String warehouseDisplayState) {
		this.warehouseDisplayState = warehouseDisplayState;
	}
	public String getWarehouseDisplayName() {
		return warehouseDisplayName;
	}
	public void setWarehouseDisplayName(String warehouseDisplayName) {
		this.warehouseDisplayName = warehouseDisplayName;
	}
	/** 
	 * @Function: getSortName 
	 * @Description:适合shopBeanMapper queryStoreManagerList方法的排序规则
	 * @return    
	 * @return String 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月24日      Jared           v1.0.0              
	*/
	public String getSortName() {
		if(sortName!=null)
		return sortName.equals("storeStartDate")?"shop.start":
			sortName.equals("storeEndDate")?"shop.stop":
				sortName.equals("storeName")?"shop.name_plat":
					sortName.equals("storeShortName")?"shop.name":
						sortName.equals("storeStatus")?"shop.ex":
							sortName.equals("departmenShortName")?"saleCate.name_en":
								sortName.equals("departmentDisplayState")?"shop.display_state":
									sortName.equals("departmentDisplayName")?"shop.display_name":
										sortName.equals("warehouseDisplayState")?"warehouse.visible":
											sortName.equals("warehouseDisplayName")?"warehouse.show_name":
								sortName.equals("platShortName")?"plat.name_en":null;	
		else
			return "";
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
	public String getErpRepertoryName() {
		return erpRepertoryName;
	}
	public void setErpRepertoryName(String erpRepertoryName) {
		this.erpRepertoryName = erpRepertoryName;
	}
	public String getOmsRepertoryName() {
		return omsRepertoryName;
	}
	public void setOmsRepertoryName(String omsRepertoryName) {
		this.omsRepertoryName = omsRepertoryName;
	}
	public String getDepartmentStatus() {
		return departmentStatus;
	}
	public void setDepartmentStatus(String departmentStatus) {
		this.departmentStatus = departmentStatus;
	}
	public String getDepartmentStatistic() {
		return departmentStatistic;
	}
	public void setDepartmentStatistic(String departmentStatistic) {
		this.departmentStatistic = departmentStatistic;
	}
	public String getDepartmentDisplayState() {
		return departmentDisplayState;
	}
	public void setDepartmentDisplayState(String departmentDisplayState) {
		this.departmentDisplayState = departmentDisplayState;
	}
	
}