package bi.baiqiu;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.order.OrderSearchRequest;

import bi.baiqiu.mapper.JdOrderInfoMapper;
import bi.baiqiu.pojo.jd.JdToken;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JdTest {
	@Autowired
	JdOrderInfoMapper jdOrderInfoDao;
	@Autowired
	 OrderSearchRequest orderSearchRequest;
	@Autowired
	@Qualifier("clarksMan")
	private JdClient clarksMan;
	@Autowired
	private JdToken clarksJd;
	@org.junit.Test
	public void test2(){
		System.out.println(clarksJd.getAppkey());
	}
}
