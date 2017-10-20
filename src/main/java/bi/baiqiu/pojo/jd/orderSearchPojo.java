package bi.baiqiu.pojo.jd;

import java.util.List;

import com.jd.open.api.sdk.domain.order.OrderSearchInfo;

public class orderSearchPojo {
	
 private   Integer 	order_total;
 private   List<OrderSearchInfo> order_info_list;

public Integer getOrder_total() {
	return order_total;
}

public void setOrder_total(Integer order_total) {
	this.order_total = order_total;
}

public List<OrderSearchInfo> getOrder_info_list() {
	return order_info_list;
}

public void setOrder_info_list(List<OrderSearchInfo> order_info_list) {
	this.order_info_list = order_info_list;
}

}
