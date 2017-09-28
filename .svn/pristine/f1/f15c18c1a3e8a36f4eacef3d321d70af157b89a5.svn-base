package bi.baiqiu.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.abel533.entity.Example;

import bi.baiqiu.controller.BaseController;
import bi.baiqiu.mapper.WirelessFlowStructureTreasureMapper;
import bi.baiqiu.page.PageHelper;
import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.WirelessFlowStructureBean;

@Service
@Transactional
public class WirelessFlowStructureServiceImpl {
	Logger log=Logger.getLogger(this.getClass());
	@Autowired
	private WirelessFlowStructureTreasureMapper wirelessFlowStructureDao;
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	/**大数据量插入
	 * @param beans
	 * @return
	 */
	public String insertByBatchLarge(List<WirelessFlowStructureBean> beans) {
		Date startDate=new Date();
		SqlSession session = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
		WirelessFlowStructureTreasureMapper mapper = session.getMapper(WirelessFlowStructureTreasureMapper.class);
		String msgEnd="";
		try {
			for (int i = 0; i < beans.size(); i++) {
				msgEnd=beans.get(i).getDate();
				mapper.insertOne(beans.get(i));
				if (i % 4000 == 0 || i == beans.size() - 1) {
					// 手动每4000个一提交，提交后无法回滚
					session.commit();
					// 清理缓存，防止溢出
					session.clearCache();
				}
			}
			log.info("----------------------------insertTime"+(new Date().getTime()-startDate.getTime()));
			return BaseController.commintSuccess+beans.size();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
			return BaseController.savesErroy+" data before "+msgEnd;
		} finally {
			session.close();
		}
	}

	/**
	 * 分页查询方法s
	 * 
	 * @param bean
	 * @param page
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Page<WirelessFlowStructureBean> queryByPage(WirelessFlowStructureBean bean, Integer pageNum, Integer pageSize)
			throws Exception {
		PageHelper.startPage(pageNum, pageSize);
		wirelessFlowStructureDao.queryByPage(bean);
		return PageHelper.endPage();

	}

	/**
	 * 批量增加
	 * 
	 * @param list
	 * @return
	 */
	public int insertByBatch(List<WirelessFlowStructureBean> list) {

		return wirelessFlowStructureDao.insertByBatch(list);

	}

	/**
	 * 更新
	 * 
	 * @param bean
	 * @return
	 */
	public int insertWirelessFlowStructure(WirelessFlowStructureBean bean) {

		return wirelessFlowStructureDao.insert(bean);
	}

	/**
	 * 更新
	 * 
	 * @param bean
	 * @return
	 */
	public int updateWirelessFlowStructure(WirelessFlowStructureBean bean) {

		return wirelessFlowStructureDao.updateByPrimaryKey(bean);
	}

	/**
	 * 删除
	 * 
	 * @param bean
	 * @return
	 */
	public int deleteWirelessFlowStructure(WirelessFlowStructureBean bean,User user) {
			Example ex= new Example(WirelessFlowStructureBean.class);
			ex.createCriteria().andEqualTo("date", bean.getDate()).andEqualTo("shopId", user.getShopId());
		return wirelessFlowStructureDao.deleteByExample(ex);
	}

	/**
	 * 批量删除
	 * 
	 * @param idArray
	 * @return
	 */
	public int deleteWirelessFlowStructureByBatch(int[] idArray) {

		return wirelessFlowStructureDao.deleteByBatch(idArray);
	}
	/**
	 * 批量删除
	 * 
	 * @param idArray
	 * @return
	 */
	public int deleteWirelessFlowStructureByBatchList(WirelessFlowStructureBean bean) {

		return wirelessFlowStructureDao.deleteByBatchList(bean);
	}
}
