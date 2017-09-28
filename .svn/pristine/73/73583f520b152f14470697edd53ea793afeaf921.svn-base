package bi.baiqiu.pojo;

import java.math.BigInteger;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *商品属性表
 */
@Table(name="bi_commodity_property")
public  class CommodityPropertyBean  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private BigInteger id;
     private String feature;
     private String sku;
     private String spu;
     private String goodsId;
     private Integer shopId;
     private String property;
     private Date createTime;
     private String remark;
 	@Transient
 	private String sortName;
 	@Transient
 	private String sortOrder;


    public CommodityPropertyBean() {
    }

    public CommodityPropertyBean( String sku, String spu,String goodsId,String feature, String property, Integer shopId
			) {
		super();
		this.feature = feature;
		this.sku = sku;
		this.spu = spu;
		this.goodsId = goodsId;
		this.shopId = shopId;
		this.property = property;
	}

	public BigInteger getId() {
        return this.id;
    }
    
    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getFeature() {
        return this.feature;
    }
    
    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getSku() {
        return this.sku;
    }
    
    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSpu() {
        return this.spu;
    }
    
    public void setSpu(String spu) {
        this.spu = spu;
    }

    public String getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getShopId() {
        return this.shopId;
    }
    
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getProperty() {
        return this.property;
    }
    
    public void setProperty(String property) {
        this.property = property;
    }

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
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
}