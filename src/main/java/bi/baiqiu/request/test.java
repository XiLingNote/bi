package bi.baiqiu.request;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.domain.order.OrderInfo;
import com.jd.open.api.sdk.domain.order.OrderSearchInfo;
import com.jd.open.api.sdk.domain.order.OrderQueryJsfService.OrderListResult;
import com.jd.open.api.sdk.request.order.OrderFbpSearchRequest;
import com.jd.open.api.sdk.request.order.OrderSearchRequest;
import com.jd.open.api.sdk.request.order.PopOrderSearchRequest;
import com.jd.open.api.sdk.response.order.OrderFbpSearchResponse;
import com.jd.open.api.sdk.response.order.OrderSearchResponse;
import com.jd.open.api.sdk.response.order.PopOrderSearchResponse;

import bi.baiqiu.mapper.ShopBeanMapper;
import bi.baiqiu.pojo.ShopBean;
import bi.baiqiu.pojo.jd.JdBorderPojo;
import bi.baiqiu.pojo.jd.SearchOrdersPojo;
import bi.baiqiu.utils.DateUtils;

@SuppressWarnings("unused")
public class test {
	public static Logger log = Logger.getLogger(test.class);

	public static void main(String[] args) throws Exception {
		Date startDate = DateUtils.stringToDate("2017-1-1");
		Date nowDate = new Date();
		
		int EVERTIME=1;
		//中间状态
		Date endDate = DateUtils.dateAddDay(startDate,EVERTIME);
		endDate = nowDate.compareTo(endDate) > 0 ? endDate : nowDate;
		do {
			System.out.println(DateUtils.YMDSin1.format(startDate));
			startDate = endDate;
			endDate = DateUtils.dateAddDay(startDate,EVERTIME);
			endDate = nowDate.compareTo(endDate) > 0 ? endDate : nowDate;
		} while (startDate.compareTo(nowDate) < 0);
		
		
	}
	public void testInsert(){
		int INSERTSIZE=200;
		int goodsSize=0;
		int size =10001;
		for(int i=0;i<size;i=i+INSERTSIZE){
			goodsSize=(i+INSERTSIZE)>=size?size:(i+INSERTSIZE);
			System.out.println("插入次数>="+i+"到<"+goodsSize);

			if(goodsSize%(INSERTSIZE*4)==0||goodsSize==size){
				Date d2 = new Date();
				Date d6 = new Date();
				System.out.println("提交 次数"+"1");
			}

		}
	
	
	}
	private void getJDDataFrom() throws JsonParseException, JsonMappingException, IOException, ParseException {
		SearchOrdersPojo searchOrdersPojo = new SearchOrdersPojo();
		//man
		searchOrdersPojo.setAccessToken("87ee28ed-1f06-45ac-94f0-bfeb22a1ddda");
		searchOrdersPojo.setToken("87ee28ed-1f06-45ac-94f0-bfeb22a1ddda");
		searchOrdersPojo.setAppkey("1DCE541099905A7EFDB0FF2922572DDA");
		searchOrdersPojo.setSecretKey("6b4f0eab6f4549d581ffb5f7619e6567");
		searchOrdersPojo.setJdPage("1");
		searchOrdersPojo.setJdPageSize("100");
		Calendar canlendar = Calendar.getInstance();
		Calendar canlendarYesterday = Calendar.getInstance();
		DateUtils.firstTimeOfDay(canlendar.getTime()).getTime();
		canlendarYesterday.setTime(canlendar.getTime());
		canlendarYesterday.set(Calendar.DAY_OF_MONTH, (canlendar.get(Calendar.DAY_OF_MONTH) - 1));
		searchOrdersPojo.setStartDate("2017-10-18 00:00:00");
		searchOrdersPojo.setEndDate("2017-10-18 16:50:00");
		String parameter = JSON.toJSONString(searchOrdersPojo);
		System.out.println(parameter);
		List<NameValuePair> param = new ArrayList<NameValuePair>();
		param.add(new BasicNameValuePair("data", parameter));

		/*
		 * //log.info(orr.getOrderTotal()); ObjectMapper mapper = new
		 * ObjectMapper(); mapper.setPropertyNamingStrategy(new
		 * MyCamemlToUnderlineCaseStrategy()); //JdBorderPojo o = (JdBorderPojo)
		 * mapper.readValue(
		 * "orr.getOrder_search_response().getOrder_search().getOrder_info_list()"
		 * ,JdBorderPojo.class); OrderListResult list=
		 * mapper.readValue(orr.getOrder_search_response().getOrder_search().
		 * getOrderInfoList(),OrderListResult.class);
		 * System.out.println(list.getOrderInfoList().size());
		 */
	}

	private void getJD() {
		JdClient client = new DefaultJdClient("https://api.jd.com/routerjson",
				"87ee28ed-1f06-45ac-94f0-bfeb22a1ddda", "1DCE541099905A7EFDB0FF2922572DDA",
				"6b4f0eab6f4549d581ffb5f7619e6567");
		OrderSearchRequest request = new OrderSearchRequest();
		request.setPage("1");
		request.setPageSize("100");
		request.setStartDate("");
		request.setEndDate("");
		request.setOrderState("WAIT_SELLER_STOCK_OUT,WAIT_GOODS_RECEIVE_CONFIRM,FINISHED_L,TRADE_CANCELED,LOCKED");
		try {
			OrderSearchResponse response = client.execute(request);
			log.info(response.getMsg());
		} catch (JdException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @Function: getJdDataByStartAndEndDate
	 * @Description:根据startDate,请求条件调用PHP接口返回集合
	 * @param searchOrdersPojo
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return String
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年10月16日 Jared v1.0.0
	 */
	public String getJdDataByStartAndEndDate(SearchOrdersPojo searchOrdersPojo, String startDate, String endDate) {

		String parameter = JSON.toJSONString(searchOrdersPojo);
		System.out.println(parameter);
		List<NameValuePair> param = new ArrayList<NameValuePair>();
		param.add(new BasicNameValuePair("data", parameter));
		return null;
	}

	public void getJdDataByShopBean(ShopBean shop) throws JdException, ParseException {

		// 数据库取出key
		SearchOrdersPojo searchOrdersPojo = new SearchOrdersPojo();
		JdClient client = new DefaultJdClient("http://gw.api.360buy.com/routerjson",
				"87ee28ed-1f06-45ac-94f0-bfeb22a1ddda", "1DCE541099905A7EFDB0FF2922572DDA",
				"6b4f0eab6f4549d581ffb5f7619e6567");
		/*JdClient client = new DefaultJdClient("http://gw.api.360buy.com/routerjson",
				"87ee28ed-1f06-45ac-94f0-bfeb22a1ddda", "1DCE541099905A7EFDB0FF2922572DDA",
				"6b4f0eab6f4549d581ffb5f7619e6567");*/
		OrderSearchRequest request = new OrderSearchRequest();
		request.setPageSize("100");
		request.setOptionalFields("order_id,pay_type,order_total_price,order_payment,freight_price,seller_discount,order_state,order_remark,order_start_time,order_end_time,consignee_info,item_info_list,vender_remark,pin,modified,payment_confirm_time,coupon_detail_list");
		request.setOrderState("WAIT_SELLER_STOCK_OUT,WAIT_GOODS_RECEIVE_CONFIRM,FINISHED_L,TRADE_CANCELED,LOCKED");
		request.setPage("1");
		Calendar calendar = Calendar.getInstance();
		Calendar calendarYesterday = Calendar.getInstance();
		calendarYesterday.setTime(calendar.getTime());
		calendarYesterday.set(Calendar.DAY_OF_MONTH, (calendar.get(Calendar.DAY_OF_MONTH) - 1));
		Calendar canlendarLastMonth = Calendar.getInstance();
		canlendarLastMonth.setTime(calendar.getTime());
		canlendarLastMonth.set(Calendar.MONTH,(calendar.get(Calendar.MONTH)-1));
		// 今日
		request.setStartDate(DateUtils.dateToString(DateUtils.firstTimeOfDay(calendar.getTime())));
		request.setEndDate(DateUtils.dateToString(calendar.getTime()));
		//List<OrderSearchInfo> orderInfoListOfToday=getJdDataByClientAndRequest(client,request);
		// 昨日
		request.setStartDate(DateUtils.dateToString(DateUtils.firstTimeOfDay(calendarYesterday.getTime())));
		request.setEndDate(DateUtils.dateToString(DateUtils.firstTimeOfDay(calendar.getTime())));
	//	List<OrderSearchInfo> orderInfoListOfYesterday=getJdDataByClientAndRequest(client,request);
		// 本月
		request.setStartDate(DateUtils.dateToString(DateUtils.firstDayOfMonth(calendar.getTime())));
		request.setEndDate(DateUtils.dateToString(calendar.getTime()));
		//List<OrderSearchInfo> orderInfoListOfThisMonth=getJdDataByClientAndRequest(client,request);
		//上月
		request.setStartDate(DateUtils.dateToString(DateUtils.firstDayOfMonth(canlendarLastMonth.getTime())));
		request.setEndDate(DateUtils.dateToString(DateUtils.firstDayOfMonth(calendar.getTime())));
		
		request.setStartDate("2017-10-17 00:00:00");
		request.setEndDate("2017-10-17 23:59:59 999");
		List<OrderSearchInfo> test=getJdDataByClientAndRequest(client,request);

	//	List<OrderSearchInfo> orderInfoListOfLastMonth=getJdDataByClientAndRequest(client,request);
		//log.info("last"+orderInfoListOfLastMonth.size());
		//log.info(orderInfoListOfThisMonth.size());
		//log.info(orderInfoListOfYesterday.size());
		//log.info(orderInfoListOfToday.size());

	}
	/** 
	 * @Function: getJdDataByClientAndRequest 
	 * @Description:获取总条数
	 * @param client
	 * @param request
	 * @return
	 * @throws JdException    
	 * @return List<OrderSearchInfo> 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月17日      Jared           v1.0.0              
	*/
	public List<OrderSearchInfo>getJdDataByClientAndRequest(JdClient client, OrderSearchRequest request) throws JdException{
		// 调用接口第一次取 1,100条的数据	
		OrderSearchResponse responseToday = client.execute(request);
		int total = responseToday.getOrderInfoResult().getOrderTotal();
		int page = total % Integer.valueOf(request.getPageSize()) + 1;
		//基础100条
		List<OrderSearchInfo> orderInfoList = getJdDataByClientAndRequestBase(client, request);
		log.info(responseToday.getMsg());
		//orderInfoList递增
		getJdDataByPage(page, orderInfoList, client, request);
		return orderInfoList;
	}
	/** 
	 * @Function: getJdDataByPage 
	 * @Description:根据总页数循环调用数据
	 * @param page
	 * @param orderInfoList
	 * @param client
	 * @param request
	 * @throws JdException    
	 * @return void 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月17日      Jared           v1.0.0              
	*/
	public void getJdDataByPage(int page, List<OrderSearchInfo> orderInfoList, JdClient client,
			OrderSearchRequest request) throws JdException {
		for (int i = 1; i <= page; i++) {
			request.setPage(String.valueOf(i));
			orderInfoList.addAll(getJdDataByClientAndRequestBase(client, request));
		}
	}

	/**
	 * @Function: getJdDataByClientAndRequestBase
	 * @Description:根据链接调用数据
	 * @param client
	 * @param request
	 * @return
	 * @throws JdException
	 * @return List<OrderSearchInfo>
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年10月17日 Jared v1.0.0
	 */
	public List<OrderSearchInfo> getJdDataByClientAndRequestBase(JdClient client, OrderSearchRequest request) throws JdException {
		return client.execute(request).getOrderInfoResult().getOrderInfoList();
	}

}
