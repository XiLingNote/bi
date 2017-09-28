package bi.baiqiu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.github.abel533.mapper.Mapper;
import bi.baiqiu.pojo.CommodityPropertyBean;

/**
 * 商品属性
 * 
 * @author Administrator
 *
 */
public interface CommodityPropertyMapper extends Mapper<CommodityPropertyBean> {
	
	/**查询属性分类
	 * @return
	 */
	
	public List<Map<String, String []>>queryFeatureAndProperty(Integer shopId);
	/**查询属性分类
	 * @return
	 */
	
	public List<Map<String, String[]>>queryFeatureAndProperty2(@Param(value="shopId")Integer shopId,@Param(value="feature")String feature);
	/**
	 * 分页查询默认十条记录
	 * 
	 * @param bean
	 * @param page
	 * @return
	 */
	public List<CommodityPropertyBean> queryByPage(CommodityPropertyBean bean);

	/**
	 * 批量增加
	 * 
	 * @param pcFlowStructureBeans
	 * @return
	 */
	public int insertByBatch(List<CommodityPropertyBean> Beans);
	/**
	 * 单个增加
	 * 
	 * @param pcFlowStructureBeans
	 * @return
	 */
	public int insertOne(CommodityPropertyBean Bean);

	/**
	 * 批量删除
	 * 
	 * @param idArray
	 * @return
	 */
	public int deleteByBatch(int[] idArray);
}
