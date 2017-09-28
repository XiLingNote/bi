package bi.baiqiu.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="shop")
public class Shop implements Serializable {
	
    private Integer id;

    /**
     * 是否为正在做的店铺:1:是;2:否
     */
    @Column(name = "ex")
    private Byte ex;

    /**
     * erp_session_key:拉取支付宝记录
     */
    @Column(name = "erp_session_key")
    private String erpSessionKey;

    /**
     * crm_session_key:暂时不用
     */
    @Column(name = "crm_session_key")
    private String crmSessionKey;

    /**
     * 0:忽略；1：第一次，拉最近三个月；2：拉取前一天
     */
    @Column(name = "is_search_alipay")
    private Byte isSearchAlipay;

    private String name;

    private String namePlat;

    /**
     * sale_cate表id:部门id
     */
    @Column(name = "sc_id")
    private Integer scId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getEx() {
        return ex;
    }

    public void setEx(Byte ex) {
        this.ex = ex;
    }

    public String getErpSessionKey() {
        return erpSessionKey;
    }

    public void setErpSessionKey(String erpSessionKey) {
        this.erpSessionKey = erpSessionKey == null ? null : erpSessionKey.trim();
    }

    public String getCrmSessionKey() {
        return crmSessionKey;
    }

    public void setCrmSessionKey(String crmSessionKey) {
        this.crmSessionKey = crmSessionKey == null ? null : crmSessionKey.trim();
    }

    public Byte getIsSearchAlipay() {
        return isSearchAlipay;
    }

    public void setIsSearchAlipay(Byte isSearchAlipay) {
        this.isSearchAlipay = isSearchAlipay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNamePlat() {
        return namePlat;
    }

    public void setNamePlat(String namePlat) {
        this.namePlat = namePlat == null ? null : namePlat.trim();
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ex=").append(ex);
        sb.append(", erpSessionKey=").append(erpSessionKey);
        sb.append(", crmSessionKey=").append(crmSessionKey);
        sb.append(", isSearchAlipay=").append(isSearchAlipay);
        sb.append(", name=").append(name);
        sb.append(", namePlat=").append(namePlat);
        sb.append(", scId=").append(scId);
        sb.append("]");
        return sb.toString();
    }
}