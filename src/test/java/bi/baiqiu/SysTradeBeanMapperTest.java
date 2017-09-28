package bi.baiqiu;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bi.baiqiu.mapper.WareHouseMapper;
import bi.baiqiu.mapper2.OrderInfoMapper;
import bi.baiqiu.pojo.RedisPojo;
import bi.baiqiu.pojo.WareHouse;
import bi.baiqiu.pojo.WareHouseExample;
import bi.baiqiu.task.GetDateTread;
import bi.baiqiu.task.GetDateTread.RunGetDateTread;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.GsonUtils;
import bi.baiqiu.utils.KeyUtils;
import bi.baiqiu.utils.UtilTool;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SysTradeBeanMapperTest {

	@Autowired
	OrderInfoMapper order;
	@Autowired
	WareHouseMapper wareHouse;
	@Autowired
	@Qualifier("sqlSessionTemplate1")
	private SqlSessionTemplate sqlSessionTemplateSys;
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	@Autowired
	private JedisPool jedisPool;
	@org.junit.Test
	public void test() {
		WareHouseExample wareHouseExample=new WareHouseExample();
		wareHouseExample.createCriteria().andFacetEqualTo(true);
		wareHouseExample.setOrderByClause("sort");
		List<WareHouse> list=wareHouse.selectByExample(wareHouseExample);
		for(WareHouse w:list){
			GetDateTread get= new GetDateTread(sqlSessionTemplateSys,sqlSessionTemplate,w);	
			RunGetDateTread run=get.new RunGetDateTread();
			run.run();
		}
	}
	@org.junit.Test
	public void test2() {
		WareHouseExample wareHouseExample=new WareHouseExample();
		wareHouseExample.createCriteria().andFacetEqualTo(true).andVisibleEqualTo(true);
		wareHouseExample.setOrderByClause("sort");
		
		List<WareHouse> list=wareHouse.selectByExample(wareHouseExample);
		for(WareHouse w:list){
			System.out.println(w.getId());
			w.setDistributionAmount(order.queryDistributionAmount(w));
			System.out.println("=====配货中==========");
			w.setLastMonthShippedAmount(order.queryLastMonthShipmentAmount(w));
			System.out.println("=====上月发货==========");
			w.setPresentMonthShippedAmount(order.queryMonthShipmentAmount(w));
			System.out.println(order.queryMonthShipmentAmount(w)+"=====本月==========");
			w.setNotPrintAmount(order.queryNotPrintAmount(w));
			System.out.println(order.queryNotPrintAmount(w)+"=====未打印==========");
			w.setNotTurnAmount(order.queryNotTurnAmount(w));
			System.out.println(order.queryNotTurnAmount(w)+"====未转单==========");
			
			w.setTodayShippedAmount(order.queryTodayShippedAmount(w));
			System.out.println(order.queryTodayShippedAmount(w)+"=====总发货==========");
			w.setTodayShippedGeneralAmount(order.queryTodayShippedGeneralAmount(w));
			System.out.println(order.queryTodayShippedGeneralAmount(w)+"=====非预售==========");
			w.setTodayShippedPresellAmount(order.queryTodayShippedPresellAmount(w));
			System.out.println(order.queryTodayShippedPresellAmount(w)+"=====预售==========");
			w.setTodayShippedAmount(order.queryTotalSingleAmount(w));
			System.out.println(order.queryTotalSingleAmount(w)+"=====总单量==========");
			w.setTrunAmount(order.queryTurnAmount(w));
			System.out.println(order.queryTurnAmount(w)+"=====转单==========");
			w.setModifyTime(new Date());
		}
	}
	@Test
	public void test3(){
		Gson gson = new GsonBuilder().serializeNulls().create();

		WareHouseExample example=new WareHouseExample();
		example.createCriteria().andFacetEqualTo(false).andVisibleEqualTo(false);
		example.setOrderByClause("sort");
		List<WareHouse> list=wareHouse.selectByExample(example);
		WareHouse totalWareHouse=new WareHouse();
		for(WareHouse war:list){
			if(totalWareHouse!=null){
				totalWareHouse.setNotTurnAmount(war.getNotTurnAmount()+totalWareHouse.getNotTurnAmount());
				totalWareHouse.setTrunAmount(war.getTrunAmount()+totalWareHouse.getTrunAmount());
				totalWareHouse.setNotPrintAmount(war.getNotPrintAmount()+totalWareHouse.getNotPrintAmount());
				totalWareHouse.setDistributionAmount(war.getDistributionAmount()+totalWareHouse.getDistributionAmount());
				totalWareHouse.setTotalSingleAmount(war.getTotalSingleAmount()+totalWareHouse.getTotalSingleAmount());
				totalWareHouse.setTodayShippedAmount(war.getTodayShippedAmount()+totalWareHouse.getTodayShippedAmount());
				totalWareHouse.setTodayShippedGeneralAmount(war.getTodayShippedGeneralAmount()+totalWareHouse.getTodayShippedGeneralAmount());
				totalWareHouse.setTodayShippedPresellAmount(war.getTodayShippedPresellAmount()+totalWareHouse.getTodayShippedPresellAmount());
				totalWareHouse.setLastMonthShippedAmount(war.getLastMonthShippedAmount()+totalWareHouse.getLastMonthShippedAmount());
				totalWareHouse.setPresentMonthShippedAmount(war.getPresentMonthShippedAmount()+totalWareHouse.getPresentMonthShippedAmount());
				
			}
			}
		String json = "{\"total\":" + gson.toJson(totalWareHouse)+ ",\"rows\":" + gson.toJson(list) + "}";
		System.out.println(json);
	}
	@Test
	public void test4() throws ParseException{
		Date nowDate = new Date();
		nowDate=DateUtils.yyyyMMddHHmmss.parse("2017-04-04 23:10:10");
		String business="Bag";
		Jedis jedis = jedisPool.getResource();
		 Map<String, BigDecimal> businessMap=new HashMap<String, BigDecimal>();
		// 目标销售额
			Calendar canlendar = Calendar.getInstance();
			canlendar.setTime(nowDate);
			String businessMonth = jedis.hget(business + KeyUtils.MONTH,
					canlendar.get(Calendar.YEAR) + UtilTool.monthAddZero(canlendar.get(Calendar.MONTH) + 1));
			RedisPojo redisBusinessMonth=new RedisPojo();
			if(!StringUtils.isEmpty(businessMonth)){
				redisBusinessMonth= GsonUtils.gson.fromJson(businessMonth, RedisPojo.class);
			}
			String businessToday = jedis.hget(business + KeyUtils.DAY,
					canlendar.get(Calendar.YEAR) + UtilTool.monthAddZero(canlendar.get(Calendar.MONTH) + 1)+UtilTool.monthAddZero(canlendar.get(Calendar.DAY_OF_MONTH)));
			@SuppressWarnings("unused")
			RedisPojo redisBusinessToday;
			if(!StringUtils.isEmpty(businessToday)){
				redisBusinessToday= GsonUtils.gson.fromJson(businessToday, RedisPojo.class);
			}else{
				redisBusinessToday=new RedisPojo();
			}
			//昨日的数据
			canlendar.set(Calendar.DAY_OF_MONTH,canlendar.get(Calendar.DAY_OF_MONTH));
			String businessYesterday = jedis.hget(business + KeyUtils.DAY,
					canlendar.get(Calendar.YEAR) + UtilTool.monthAddZero(canlendar.get(Calendar.MONTH) + 1));
			@SuppressWarnings("unused")
			RedisPojo redisBusinessYesterday;
			if(!StringUtils.isEmpty(businessYesterday)){
				redisBusinessYesterday= GsonUtils.gson.fromJson(businessYesterday, RedisPojo.class);
			}else{
				redisBusinessYesterday=new RedisPojo();
			}
			businessMap.put("business"+KeyUtils.GMV+KeyUtils.TARGET, redisBusinessMonth.getTarget());
			businessMap.put("business"+KeyUtils.GMV,redisBusinessMonth.getAlipay());
			businessMap.put("business"+KeyUtils.ALIPAY, redisBusinessMonth.getAlipay());
			businessMap.put("business"+KeyUtils.ALIPAY+KeyUtils.TARGET,redisBusinessMonth.getAlipayTarget());
			System.out.println(JSON.toJSONString(businessMap));
	jedis.close();
	}

}
