package bi.baiqiu.task;

import java.util.Date;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

import com.alibaba.druid.util.StringUtils;

import bi.baiqiu.mapper.WareHouseMapper;
import bi.baiqiu.mapper2.OrderInfoMapper;
import bi.baiqiu.pojo.WareHouse;


public class GetDateTread {
	Logger log = Logger.getLogger(this.getClass());
	private SqlSessionTemplate sqlSessionTemplateSys;
	private SqlSessionTemplate sqlSessionTemplate;
	private WareHouse w;

	public GetDateTread(SqlSessionTemplate sqlSessionTemplateSys, SqlSessionTemplate sqlSessionTemplate, WareHouse w) {
		super();
		this.sqlSessionTemplateSys = sqlSessionTemplateSys;
		this.sqlSessionTemplate = sqlSessionTemplate;
		this.w = w;
	}

	public SqlSessionTemplate getSqlSessionTemplateSys() {
		return sqlSessionTemplateSys;
	}

	public void setSqlSessionTemplateSys(SqlSessionTemplate sqlSessionTemplateSys) {
		this.sqlSessionTemplateSys = sqlSessionTemplateSys;
	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	/**从erp拉取数据
	 * 	@author Jared
	 *	@time 2017年9月13日下午3:41:20
	 */
	public class RunGetDateTread implements Runnable {
		@Override
		public void run() {
			SqlSession sessionlocal = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, true);
			SqlSession session = sqlSessionTemplateSys.getSqlSessionFactory().openSession(ExecutorType.BATCH, true);
			try {					
				if(!StringUtils.isEmpty(w.getRepertoryName())){
					OrderInfoMapper order = session.getMapper(OrderInfoMapper.class);
					WareHouseMapper wareHouse=sessionlocal.getMapper(WareHouseMapper.class);
					w.setDistributionAmount(order.queryDistributionAmount(w));
					w.setLastMonthShippedAmount(order.queryLastMonthShipmentAmount(w));
					w.setPresentMonthShippedAmount(order.queryMonthShipmentAmount(w));
					w.setNotPrintAmount(order.queryNotPrintAmount(w));
					w.setNotTurnAmount(order.queryNotTurnAmount(w));
					w.setTodayShippedAmount(order.queryTodayShippedAmount(w));
					w.setTodayShippedGeneralAmount(order.queryTodayShippedGeneralAmount(w));
					w.setTodayShippedPresellAmount(order.queryTodayShippedPresellAmount(w));
					w.setTotalSingleAmount(order.queryTotalSingleAmount(w));
					w.setTrunAmount(order.queryTurnAmount(w));
					w.setModifyTime(new Date());
					wareHouse.updateByPrimaryKeySelective(w);
					sessionlocal.commit();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
				sessionlocal.close();
			}
		}
	}

}
