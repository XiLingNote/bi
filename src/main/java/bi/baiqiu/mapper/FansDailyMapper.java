package bi.baiqiu.mapper;

import java.util.List;

import com.github.abel533.mapper.Mapper;

import bi.baiqiu.pojo.FansDailyBean;

/**
 * pc流量结构操作
 * @author Administrator
 *
 */
public interface FansDailyMapper  extends Mapper<FansDailyBean>{
	/**分页查询默认十条记录
	 * @param bean
	 * @param page
	 * @return
	 */
	public List<FansDailyBean> queryByPage(FansDailyBean bean);
	
	
	/**批量增加
	 * @param pcFlowStructureBeans
	 * @return
	 */
	public int insertByBatch(List<FansDailyBean> Beans);
	/**批量单条增加
	 * @param pcFlowStructureBeans
	 * @return
	 */
	public int insertOne(FansDailyBean Bean);
	/**批量删除
	 * @param idArray
	 * @return
	 */
	public int deleteByBatch(int[]idArray);
	/**批量删除权限判定
	 * @param 
	 * @return
	 */
	public int deleteByBatchList(FansDailyBean bean);
}
