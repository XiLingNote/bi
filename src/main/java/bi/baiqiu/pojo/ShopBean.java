package bi.baiqiu.pojo;

import java.util.Date;

public class ShopBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.ex
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Byte ex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.erp_session_key
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private String erpSessionKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.crm_session_key
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private String crmSessionKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.is_search_alipay
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Byte isSearchAlipay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.token
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.name
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.name_plat
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private String namePlat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.sc_id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Integer scId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.plat_id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Integer platId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.plat_sid
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Integer platSid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.start
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Date start;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.stop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Date stop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.url
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.statistic
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Byte statistic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.display_state
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private Byte displayState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.display_name
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    private String displayName;
    
    // @Fields  shopTvShowTablePojo : TODO显示电视上的实体
    private ShopTvShowTablePojo shopTvShowTablePojo;
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.id
     *
     * @return the value of shop.id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.id
     *
     * @param id the value for shop.id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.ex
     *
     * @return the value of shop.ex
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Byte getEx() {
        return ex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.ex
     *
     * @param ex the value for shop.ex
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setEx(Byte ex) {
        this.ex = ex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.erp_session_key
     *
     * @return the value of shop.erp_session_key
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public String getErpSessionKey() {
        return erpSessionKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.erp_session_key
     *
     * @param erpSessionKey the value for shop.erp_session_key
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setErpSessionKey(String erpSessionKey) {
        this.erpSessionKey = erpSessionKey == null ? null : erpSessionKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.crm_session_key
     *
     * @return the value of shop.crm_session_key
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public String getCrmSessionKey() {
        return crmSessionKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.crm_session_key
     *
     * @param crmSessionKey the value for shop.crm_session_key
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setCrmSessionKey(String crmSessionKey) {
        this.crmSessionKey = crmSessionKey == null ? null : crmSessionKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.is_search_alipay
     *
     * @return the value of shop.is_search_alipay
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Byte getIsSearchAlipay() {
        return isSearchAlipay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.is_search_alipay
     *
     * @param isSearchAlipay the value for shop.is_search_alipay
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setIsSearchAlipay(Byte isSearchAlipay) {
        this.isSearchAlipay = isSearchAlipay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.token
     *
     * @return the value of shop.token
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.token
     *
     * @param token the value for shop.token
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.name
     *
     * @return the value of shop.name
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.name
     *
     * @param name the value for shop.name
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.name_plat
     *
     * @return the value of shop.name_plat
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public String getNamePlat() {
        return namePlat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.name_plat
     *
     * @param namePlat the value for shop.name_plat
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setNamePlat(String namePlat) {
        this.namePlat = namePlat == null ? null : namePlat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.sc_id
     *
     * @return the value of shop.sc_id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Integer getScId() {
        return scId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.sc_id
     *
     * @param scId the value for shop.sc_id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setScId(Integer scId) {
        this.scId = scId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.plat_id
     *
     * @return the value of shop.plat_id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Integer getPlatId() {
        return platId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.plat_id
     *
     * @param platId the value for shop.plat_id
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.plat_sid
     *
     * @return the value of shop.plat_sid
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Integer getPlatSid() {
        return platSid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.plat_sid
     *
     * @param platSid the value for shop.plat_sid
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setPlatSid(Integer platSid) {
        this.platSid = platSid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.start
     *
     * @return the value of shop.start
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Date getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.start
     *
     * @param start the value for shop.start
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.stop
     *
     * @return the value of shop.stop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Date getStop() {
        return stop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.stop
     *
     * @param stop the value for shop.stop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setStop(Date stop) {
        this.stop = stop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.url
     *
     * @return the value of shop.url
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.url
     *
     * @param url the value for shop.url
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.statistic
     *
     * @return the value of shop.statistic
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Byte getStatistic() {
        return statistic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.statistic
     *
     * @param statistic the value for shop.statistic
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setStatistic(Byte statistic) {
        this.statistic = statistic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.display_state
     *
     * @return the value of shop.display_state
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public Byte getDisplayState() {
        return displayState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.display_state
     *
     * @param displayState the value for shop.display_state
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setDisplayState(Byte displayState) {
        this.displayState = displayState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.display_name
     *
     * @return the value of shop.display_name
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.display_name
     *
     * @param displayName the value for shop.display_name
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

	public ShopTvShowTablePojo getShopTvShowTablePojo() {
		return shopTvShowTablePojo;
	}

	public void setShopTvShowTablePojo(ShopTvShowTablePojo shopTvShowTablePojo) {
		this.shopTvShowTablePojo = shopTvShowTablePojo;
	}
}