package bi.baiqiu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.order.OrderSearchRequest;

import bi.baiqiu.mapper.JdOrderInfoMapper;
import bi.baiqiu.pojo.PromotionDetailShowPojo;
import bi.baiqiu.pojo.ShopBean;
import bi.baiqiu.pojo.jd.JdToken;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.UtilTool;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ScanResult;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RedisTest {
	Logger logger=Logger.getLogger(RedisTest.class);
	int EVERTIME=1;
	@Autowired
	JedisPool jedisPool;
	@org.junit.Test
	public void test2(){
		Jedis jedis=jedisPool.getResource();
		Date startDate = DateUtils.stringToDate("2016-01-10");
		Date endDate = DateUtils.stringToDate("2016-01-12");
		int EVERTIME=1;
		//中间状态
		Date midDate = DateUtils.dateAddDay(startDate,EVERTIME);
		midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
	//	List<PromotionDetailShowPojo> list=new ArrayList<PromotionDetailShowPojo>();
		PromotionDetailShowPojo pojoTotal=new PromotionDetailShowPojo();
		do {
			System.out.println(DateUtils.YMDSin1.format(startDate));
			String str=jedis.hget("achettePromotionDetailDAY",DateUtils.YMDSin1.format(startDate));
			PromotionDetailShowPojo pojo=JSON.parseObject(str,PromotionDetailShowPojo.class);
			//list.add(pojo);
			pojoTotal.addPromotionName(pojo);
			startDate = midDate;
			midDate = DateUtils.dateAddDay(startDate,EVERTIME);
			midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
		} while (startDate.compareTo(endDate) < 0);
		//排序排序后的集合
		 List<Map.Entry<String,String>> list1 = new ArrayList<Map.Entry<String,String>>(pojoTotal.getOrderPromotionNameAndFee().entrySet());  
	        //然后通过比较器来实现排序  
	        Collections.sort(list1,new Comparator<Map.Entry<String,String>>() {  
	            //升序排序  
	            public int compare(Entry<String, String> o1,  
	                    Entry<String, String> o2) {  
	                return new BigDecimal(o2.getValue()).compareTo(new BigDecimal(o1.getValue()));  
	            }  
	        }); 
	     //将大于指定数量的数据去除
	        int userSize=5;
	        String tempEntry=null;
	      for(int i=0;i<list1.size();i++){
	    	  if(i>=userSize){
	    		  tempEntry=UtilTool.stringNumAdd(tempEntry,list1.remove(i).getValue());
	    		  i--;
	    	  }
	      }
	      Map< String,String> tempMap=new HashMap<String, String>();
	      tempMap.put("其他", tempEntry);
	      list1.addAll(tempMap.entrySet()); 
	      pojoTotal.setPromotionName(new String[list1.size()+1]);
	      pojoTotal.setDetailDiscountFee(new String[list1.size()+1]);
	      pojoTotal.setDetailDiscountFeeSection(new String[list1.size()+1][2]);
	      String midDetailSumDiscountFee=pojoTotal.getDetailSumDiscountFee();
	      pojoTotal.getDetailDiscountFeeSection()[0][0]=midDetailSumDiscountFee;
	      pojoTotal.getDetailDiscountFeeSection()[0][1]="0";
	      pojoTotal.getPromotionName()[0]="支付金额";
	      pojoTotal.getDetailDiscountFee()[0]=midDetailSumDiscountFee;
	      for(int i=0;i<list1.size();i++){
	    	  pojoTotal.getDetailDiscountFee()[i+1]=list1.get(i).getValue();
	    	  pojoTotal.getPromotionName()[i+1]=list1.get(i).getKey();
	    	  pojoTotal.getDetailDiscountFeeSection()[i+1][0]=midDetailSumDiscountFee;//优惠金额
	    	  midDetailSumDiscountFee=UtilTool.stringNumSubtract(midDetailSumDiscountFee, list1.get(i).getValue());
	    	  pojoTotal.getDetailDiscountFeeSection()[i+1][1]=midDetailSumDiscountFee;
	      }
		logger.info(JSON.toJSONString(pojoTotal));
		jedis.close();
	}
}
