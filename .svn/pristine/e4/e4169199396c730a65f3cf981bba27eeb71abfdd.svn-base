package bi;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.Jedis;
import bi.baiqiu.service.IndustryTrendService;
import bi.baiqiu.utils.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Ssm {
	@Autowired
	private IndustryTrendService industryTrendServiceImpl;

	@Test
	public void run() {
		Set<String> set = industryTrendServiceImpl.queryIndustryBrandName();
		String name = null;
		for (String string : set) {
			try {
				String decode = URLDecoder.decode(string, "utf-8");
				System.out.println(decode);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			// System.out.println(string);
		}
	}
}
