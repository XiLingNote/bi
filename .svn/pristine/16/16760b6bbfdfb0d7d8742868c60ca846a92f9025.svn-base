package bi.baiqiu.mapper;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bi.baiqiu.page.PageBean;
import bi.baiqiu.pojo.VisitorMonthFeaturesBean;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class VisitorMonthFeaturesMapperTest {
	@Autowired 
	private VisitorMonthFeaturesMapper visitoryMonthFeaturesDao;
	@Test
	public void testQueryByPage() {

		List<VisitorMonthFeaturesBean> list=
				visitoryMonthFeaturesDao.queryByPage(null);
			for(VisitorMonthFeaturesBean fans:list){
				System.out.println("------------------------访客月特征-"+fans.getId());
			}
	
	}
	@Test 
	public void run(){
		List<VisitorMonthFeaturesBean> list= new ArrayList<>();
		VisitorMonthFeaturesBean fans=new VisitorMonthFeaturesBean();
		fans.setShopId(1);
		list.add(fans);
		list.add(fans);
		System.out.println("------------------------------------------"+visitoryMonthFeaturesDao.insertByBatch(list));
		
	}
}
