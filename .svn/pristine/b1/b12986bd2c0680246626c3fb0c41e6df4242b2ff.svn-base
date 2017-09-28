package bi.baiqiu.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bi.baiqiu.page.PageBean;
import bi.baiqiu.pojo.FansDailyBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FansDailyMapperTest {

	@Autowired
	private FansDailyMapper fansDailyDao;

	@Test
	public void test() {
		List<FansDailyBean> list= fansDailyDao.queryByPage(null);
		
		for(FansDailyBean fa:list){
			System.out.println("粉丝日报=============================="+fa.getId());
		}
		}
	@Test
	public void test2(){
		List<FansDailyBean> list= new ArrayList<>();
		FansDailyBean fans=new FansDailyBean();
		fans.setShopId(1);
		list.add(fans);
		list.add(fans);
		System.out.println("------------------------------------------"+fansDailyDao.insertByBatch(list));
		
		
		
	}

}
