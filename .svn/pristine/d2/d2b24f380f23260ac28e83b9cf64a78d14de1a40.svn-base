package bi.baiqiu.mapper;

import java.util.List;

import com.github.abel533.mapper.Mapper;
import bi.baiqiu.pojo.WirelessFlowStructureBean;

/**
 * pc流量结构操作
 * @author Administrator
 *
 */
public interface WirelessFlowStructureTreasureMapper  extends Mapper<WirelessFlowStructureBean>{
	/**分页查询默认十条记录
	 * @param bean
	 * @param page
	 * @return
	 */
	public List<WirelessFlowStructureBean> queryByPage(WirelessFlowStructureBean bean);
	
	
	/**批量增加
	 * @param pcFlowStructureBeans
	 * @return
	 */
	public int insertByBatch(List<WirelessFlowStructureBean> wirelessFlowStructureBean);
	/**单条
	 * @param pcFlowStructureBeans
	 * @return
	 */
	public int insertOne(WirelessFlowStructureBean wirelessFlowStructureBean);
	
	/**批量删除
	 * @param idArray
	 * @return
	 */
	public int deleteByBatch(int[]idArray);
	/**批量删除
	 * @param bean
	 * @return
	 */
	public int deleteByBatchList(WirelessFlowStructureBean bean);
}
