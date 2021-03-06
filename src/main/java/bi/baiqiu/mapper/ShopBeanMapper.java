package bi.baiqiu.mapper;

import bi.baiqiu.pojo.ShopBean;
import bi.baiqiu.pojo.ShopBeanExample;
import bi.baiqiu.pojo.management.StoreManagerPojo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ShopBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int countByExample(ShopBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int deleteByExample(ShopBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int insert(ShopBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int insertSelective(ShopBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    List<ShopBean> selectByExample(ShopBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    ShopBean selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int updateByExampleSelective(@Param("record") ShopBean record, @Param("example") ShopBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int updateByExample(@Param("record") ShopBean record, @Param("example") ShopBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int updateByPrimaryKeySelective(ShopBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Oct 12 16:27:25 CST 2017
     */
    int updateByPrimaryKey(ShopBean record);
    
 
    List<Map<String, String>>querySellerNick(ShopBean record);
    
    /** 
     * @Function: queryShopByScId 
     * @Description:根据部门简称查询店铺部门和店铺都在做的
     * @param scShort
     * @return    
     * @return List<ShopBean> 
     * @throws 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------
     * 2017年9月25日      Jared           v1.0.0              
    */
    List<ShopBean> queryShopByscShort(@Param("scShort")String scShort);
    
    
    /** 
     * @Function: queryStoreManagerList 
     * @Description:查询店铺关联部门平台<if test="scId != null">
			and shop.sc_id = #{scId}
		</if>
		<if test="platId != null">
			and shop.plat_id = #{platId}
		</if>
		<if test="shopId != null">
			and shop.id = #{shopId}
		</if>
		<if test="storeStatus != null">
			and shop.ex = #{storeStatus}
		</if>
		<if test="departmentStatus != null">
			and saleCate.ex = #{departmentStatus}
		</if>
     * @param managerPojo
     * @return    
     * @return List<StoreManagerPojo> 
     * @throws 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------
     * 2017年10月24日      Jared           v1.0.0              
    */
    List<StoreManagerPojo> queryStoreManagerList(StoreManagerPojo managerPojo);
}