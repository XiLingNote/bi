package bi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.apache.poi.util.PackageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.abel533.entity.Example;
import com.google.gson.Gson;

import bi.baiqiu.mapper.DailyTargetMapper;
import bi.baiqiu.mapper.GoalMonthAlipMapper;
import bi.baiqiu.mapper.GoalMonthSaleMapper;
import bi.baiqiu.mapper.PcFlowStructureTreasureMapper;
import bi.baiqiu.mapper.WirelessFlowStructureTreasureMapper;
import bi.baiqiu.page.PageBean;
import bi.baiqiu.page.PageHelper;
import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo.DailyTarget;
import bi.baiqiu.pojo.GoalMonthAlip;
import bi.baiqiu.pojo.GoalMonthsale;
import bi.baiqiu.pojo.PcFlowStructureBean;
import bi.baiqiu.pojo.WirelessFlowStructureBean;
import bi.baiqiu.service.impl.GoalMonthAlipServiceImpl;
import bi.baiqiu.service.impl.GoalMonthSaleServiceImpl;
import bi.baiqiu.service.impl.TableTitleServiceImpl;

/**无限流量和pc流量结构表
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FlowMapperTest {
	Logger log = Logger.getLogger(FlowMapperTest.class);
	@Autowired
	private PcFlowStructureTreasureMapper pcFlowStructureTreasureDao;
	@Autowired 
	private WirelessFlowStructureTreasureMapper wirelessFlowStructureDao;
	@Autowired
	private TableTitleServiceImpl tableService;
	/**
	 * 日计划分页查询
	 */
	@Test
	public void run() {
		PageBean page = new PageBean();
		PcFlowStructureBean pcFlowStructureBean = new PcFlowStructureBean();
		pcFlowStructureBean.setSortName("createTime");
		pcFlowStructureBean.setSortOrder("desc");
				// 使用page插件
		List<PcFlowStructureBean> pcFlowStructureBeans = pcFlowStructureTreasureDao.queryByPage(pcFlowStructureBean);
		for (PcFlowStructureBean pf : pcFlowStructureBeans) {
			System.out.println("流量结构id：" + pf.getFlowId()+"---"+pf.getDate());
		}
	}
	@Test
	public void run1() {
		PcFlowStructureBean pcFlowStructureBean = new PcFlowStructureBean();
		pcFlowStructureBean.setShopId("");
		pcFlowStructureBean.setShopId("");
		List<PcFlowStructureBean> pcFlowStructureBeans=new ArrayList<>();
		pcFlowStructureBeans.add(pcFlowStructureBean);
		pcFlowStructureBeans.add(pcFlowStructureBean);
				// 使用page插件
		int insertReturn= pcFlowStructureTreasureDao.insertByBatch(pcFlowStructureBeans);
	log.info("-------------------------"+insertReturn);
	}
	@Test
	public void rundeltetById() {
		PcFlowStructureBean pcFlowStructureBean = new PcFlowStructureBean();
		PcFlowStructureBean pcFlowStructureBean2 = new PcFlowStructureBean();
		PcFlowStructureBean pcFlowStructureBean3 = new PcFlowStructureBean();

		List<PcFlowStructureBean> pcFlowStructureBeans=new ArrayList<>();
		pcFlowStructureBean2.setFlowId(2814);
		pcFlowStructureBeans.add(pcFlowStructureBean2);
		pcFlowStructureBean3.setFlowId(2813);
		pcFlowStructureBeans.add(pcFlowStructureBean3);
		pcFlowStructureBean.setDeleteHistory(true);
		int [] idarr={2815,2816};
		pcFlowStructureBean.setPcFlowStructureBeans(pcFlowStructureBeans);
		pcFlowStructureBean.setIdArray(idarr);
				// 使用page插件
		int insertReturn= pcFlowStructureTreasureDao.deleteByBatchList(pcFlowStructureBean);
	log.info("-------------------------"+insertReturn);
	}
	@Test
	public void run2() {
		PageBean page = new PageBean();
		WirelessFlowStructureBean pcFlowStructureBean = new WirelessFlowStructureBean();
				// 使用page插件
		List<WirelessFlowStructureBean> pcFlowStructureBeans = wirelessFlowStructureDao.queryByPage(pcFlowStructureBean);
		for (WirelessFlowStructureBean pf : pcFlowStructureBeans) {
			System.out.println("无线流量结构id：" + pf.getFlowId());
		}
	}
	@Test
	public void run3() {
		WirelessFlowStructureBean pcFlowStructureBean = new WirelessFlowStructureBean();
		pcFlowStructureBean.setShopId(1);
		pcFlowStructureBean.setShopId(1);
		List<WirelessFlowStructureBean> pcFlowStructureBeans=new ArrayList<>();
		pcFlowStructureBeans.add(pcFlowStructureBean);
		pcFlowStructureBeans.add(pcFlowStructureBean);
				// 使用page插件
		int insertReturn= wirelessFlowStructureDao.insertByBatch(pcFlowStructureBeans);
	log.info("-------------------------"+insertReturn);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void deleteTest(){
		PcFlowStructureBean pcFlowStructureBean = new PcFlowStructureBean();
	 Example ex=new Example(PcFlowStructureBean.class);
	PageHelper.startPage(1, 99);
	
	 pcFlowStructureTreasureDao.queryByPage(pcFlowStructureBean);
	 @SuppressWarnings("unchecked")
	Page<PcFlowStructureBean> page=	PageHelper.endPage();
	 System.out.println(page.getTotal());
		for (PcFlowStructureBean pf :page.getResult() ) {
			System.out.println("流量结构id：" + pf.getFlowId()+"---"+pf.getDate()+pf.getFlowSourceDetails());
		}
		
	}
	@Test
	public void queryTest() throws Exception{
		tableService.queryTableTitle("PcFlowStructure");
		
		
	}
}
