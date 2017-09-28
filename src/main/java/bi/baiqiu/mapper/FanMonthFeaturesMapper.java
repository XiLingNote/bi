package bi.baiqiu.mapper;

import java.util.List;

import com.github.abel533.mapper.Mapper;

import bi.baiqiu.page.PageBean;
import bi.baiqiu.pojo.FansMonthFeaturesBean;

/**
 * 粉丝特征月报
 * @author Administrator
 *
 */
public interface FanMonthFeaturesMapper  extends Mapper<FansMonthFeaturesBean>{
	/**分页查询默认十条记录
	 * @param bean
	 * @param page
	 * @return
	 */
	public List<FansMonthFeaturesBean> queryByPage(FansMonthFeaturesBean bean,PageBean page);
	
	
	/**批量增加
	 * @param pcFlowStructureBeans
	 * @return
	 */
	public int insertByBatch(List<FansMonthFeaturesBean> Beans);
}
