package bi.baiqiu.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "user")
public class User implements Serializable {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
	private Integer id;
	

	/**
	 * 用户名称
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 登录用户名
	 */
	@Column(name = "username")
	private String username;

	/**
	 * 密码
	 */
	@Column(name = "password")
	private String password;

	/**
	 * 多个店铺，用英文逗隔开
	 */
	@Column(name = "shop_id")
	private Integer shopId;

	/**
	 * 手机号码
	 */
	@Column(name = "phone")
	private String phone;

	/**
	 * 角色id,多个id用英文逗号隔开
	 */
	@Column(name = "role_ids")
	private String roleIds;

	private String shopNamePlat;

	private String shopName;
	
	@Transient
	private boolean hasDeleteHistoryAuthority=false;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds == null ? null : roleIds.trim();
	}

	public String getShopNamePlat() {
		return shopNamePlat;
	}

	public void setShopNamePlat(String shopNamePlat) {
		this.shopNamePlat = shopNamePlat;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	public boolean isHasDeleteHistoryAuthority() {
		return hasDeleteHistoryAuthority;
	}

	public void setHasDeleteHistoryAuthority(boolean hasDeleteHistoryAuthority) {
		this.hasDeleteHistoryAuthority = hasDeleteHistoryAuthority;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", username=").append(username);
		sb.append(", password=").append(password);
		sb.append(", shopId=").append(shopId);
		sb.append(", phone=").append(phone);
		sb.append(", roleIds=").append(roleIds);
		sb.append(", shopNamePlat=").append(shopNamePlat);
		sb.append(", shopName=").append(shopName);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}