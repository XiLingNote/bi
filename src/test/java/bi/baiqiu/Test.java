package bi.baiqiu;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

import bi.baiqiu.pojo.test.OrderTemplate;
import bi.baiqiu.pojo.test.TradeTemplate;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.KeyUtils;
import bi.baiqiu.utils.UtilTool;
import redis.clients.jedis.Jedis;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Calendar c=Calendar.getInstance();
		

	}
	
	
	public void testForeach(){

		int INSERTSIZE=200;
		List<TradeTemplate> tradeList=new ArrayList<TradeTemplate>(800);
		List<OrderTemplate> goodsList=new ArrayList<OrderTemplate>(800);
		for(int i=0;i<1005;i++){
			tradeList.add(new TradeTemplate());
			goodsList.add(new OrderTemplate());
		}
		System.out.println(goodsList.size());
		System.out.println(tradeList.size());

		int goodsSize=0;
		for(int i=0;i<goodsList.size();i=i+INSERTSIZE){
			goodsSize=(i+INSERTSIZE)>=goodsList.size()?goodsList.size():(i+INSERTSIZE);
			System.out.println(i+"-"+goodsSize);
		}
		int tradeSize=0;
		for(int i=0;i<tradeList.size();i=i+INSERTSIZE){
			tradeSize=(i+INSERTSIZE)>=tradeList.size()?tradeList.size():(i+INSERTSIZE);
			System.out.println(i+"-"+tradeSize);

		}
			
	
	}
public void redisTest() throws ParseException{
	  int []a={1,3,4};
	    int []b={1,3,4};
	   int []c =ArrayUtils.addAll(a,b);
	    for(int i:c){
	    	System.out.println(i);
	    }
		System.arraycopy(a, 0, b, 0, 24);
		 for(int i:a){
		    	System.out.println(i);
		    }
		 for(int i:b){
		    	System.out.println(i);
		    }
		
	Calendar instance = Calendar.getInstance();
	instance.setTime(DateUtils.stringToDate("2017-04-04"));
	instance.get(Calendar.YEAR);
	instance.get(Calendar.MONTH);
	instance.get(Calendar.DAY_OF_MONTH);
	Calendar instanceEnd = Calendar.getInstance();
	instanceEnd.setTime(DateUtils.yyyyMMddHHmmss.parse("2017-04-04 10:10:10"));
			System.out.println(instanceEnd.get(Calendar.YEAR)+UtilTool.monthAddZero(instanceEnd.get(Calendar.MONTH)+1)+UtilTool.monthAddZero(instanceEnd.get(Calendar.DAY_OF_MONTH))+UtilTool.monthAddZero(instanceEnd.get(Calendar.HOUR_OF_DAY)));
			
			Jedis jedis = new Jedis("192.168.0.60", 6379);
			int endHour=instanceEnd.get(Calendar.HOUR_OF_DAY);
			System.out.println(endHour);
			for(int i=0;i<=endHour;i++){
				instanceEnd.setTime(instance.getTime());
				String jedisTestData=jedis.hget("c.p.u.HOUR", instanceEnd.get(Calendar.YEAR)+UtilTool.monthAddZero(instanceEnd.get(Calendar.MONTH)+1)+UtilTool.monthAddZero(instanceEnd.get(Calendar.DAY_OF_MONTH))+UtilTool.monthAddZero(instanceEnd.get(Calendar.HOUR_OF_DAY)));
				System.out.println(jedisTestData);
				System.out.println("c.p.u.HOUR"+instanceEnd.get(Calendar.YEAR)+UtilTool.monthAddZero(instanceEnd.get(Calendar.MONTH)+1)+UtilTool.monthAddZero(instanceEnd.get(Calendar.DAY_OF_MONTH))+UtilTool.monthAddZero(instanceEnd.get(Calendar.HOUR_OF_DAY)));
				instance.add(Calendar.HOUR_OF_DAY, 1);
			}
			
			

}
	public static void getTest(int a, int b) {
		if (b > 20000) {

			int size = b / 2;

			System.out.println("0" + "size" + size);
			getTest(a,size);
			System.out.println("modify" + a + size + "size" + size);
			getTest(a+size,size);
		} else {
			System.out.println("commit" + a + "b" + b);
		}

	}
	public static List<Object> addNull(List<Object> list,int index){
		for(int i=0;i<=index;i++){
			list.add(null);
		}
		return list;
	}
	public Map<String, String[]> getBusinessHour(String shopName) throws Exception {
		Jedis jedis = new Jedis("192.168.0.60", 6379);
		Date nowDate=new Date();
		Calendar canlendar = Calendar.getInstance();
		Calendar canlendarYesterday = Calendar.getInstance();
		//当前时间小时数设0
		canlendar.setTime(nowDate);
		canlendar.set(Calendar.HOUR_OF_DAY, 0);
//		昨天日期小时数设零
		canlendarYesterday.setTime(nowDate);
		canlendarYesterday.set(Calendar.HOUR_OF_DAY, 0);
		canlendarYesterday.set(Calendar.DAY_OF_MONTH, (canlendarYesterday.get(Calendar.DAY_OF_MONTH)-1));
//		测试的时间今日.昨日零点
		canlendar.setTime(DateUtils.stringToDate("2017-04-04"));
		canlendarYesterday.setTime(DateUtils.stringToDate("2017-04-04"));
		canlendarYesterday.set(Calendar.HOUR_OF_DAY, 0);
		canlendarYesterday.set(Calendar.DAY_OF_MONTH, (canlendarYesterday.get(Calendar.DAY_OF_MONTH)-1));
		Calendar canlendarEnd = Calendar.getInstance();
		Calendar canlendarEndYesterday = Calendar.getInstance();
		canlendarEndYesterday.setTime(nowDate);
		canlendarEndYesterday.set(Calendar.HOUR_OF_DAY, 0);
		canlendarEnd.setTime(nowDate);
//		测试的当前日期
		canlendarEnd.setTime(DateUtils.yyyyMMddHHmmss.parse("2017-04-04 23:10:10"));
		canlendarEndYesterday.setTime(nowDate);
		canlendarEndYesterday.set(Calendar.HOUR_OF_DAY, 0);
		//当前的小时数,查询从零点到当前小时的数据
		int endHour = canlendarEnd.get(Calendar.HOUR_OF_DAY);
		String [] redisArray=new String[24];
		String [] redisArrayYesterday=new String[24];
		Map<String, String[]> map = new HashMap<String, String[]>();

		for (int i = 0; i <= endHour; i++) {
//			今天数据
			canlendarEnd.setTime(canlendar.getTime());
			String jedisHgetData = jedis.hget(shopName+KeyUtils.HOUR,
					canlendarEnd.get(Calendar.YEAR) + UtilTool.monthAddZero(canlendarEnd.get(Calendar.MONTH) + 1)
							+ UtilTool.monthAddZero(canlendarEnd.get(Calendar.DAY_OF_MONTH))
							+ UtilTool.monthAddZero(canlendarEnd.get(Calendar.HOUR_OF_DAY)));	
			redisArray[i]=jedisHgetData;
			canlendar.add(Calendar.HOUR_OF_DAY, 1);
//			昨日数据
			canlendarEndYesterday.setTime(canlendarYesterday.getTime());
			String jedisHgetDataYesterday = jedis.hget(shopName+KeyUtils.HOUR,
					canlendarEnd.get(Calendar.YEAR) + UtilTool.monthAddZero(canlendarEndYesterday.get(Calendar.MONTH) + 1)
							+ UtilTool.monthAddZero(canlendarEndYesterday.get(Calendar.DAY_OF_MONTH))
							+ UtilTool.monthAddZero(canlendarEndYesterday.get(Calendar.HOUR_OF_DAY)));
			redisArrayYesterday[i]=jedisHgetDataYesterday;
			canlendarYesterday.add(Calendar.HOUR_OF_DAY, 1);
		}
		map.put(shopName, redisArray);
		map.put(shopName+"yesterday", redisArrayYesterday);
		jedis.close();
		return map;
	
	}
}