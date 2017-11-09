<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Alipay</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<script src="/js/jquery-1.12.3.js"></script>
<script src="/js/scientific.js"></script>
<script src="/js/bootstrap/bootstrap.min.js"></script>
<script src="/js/page/inAmount.js"></script>
<style type="text/css">
#think_page_trace_tab_tit {
	-webkit-box-sizing: content-box;
	-moz-box-sizing: content-box;
	box-sizing: content-box;
}

.c_div_body {
	margin-top: 12px;
}

.c_g_right span {
	float: left;
}

.c_g_right1 {
	padding-right: 5px;
}

.c_g_right2 {
	padding-left: 5px;
}

.c_t_left {
	float: left;
}

.c_t_right {
	float: right;
}

.c_t_right span {
	margin-right: 20px;
}

.img_right {
	margin-right: 0px !important;
}

.shop_nm {
	border-top: 2px solid #ddd;
}

.table {
	margin-bottom: 0 !important;
}

.panel-body1 {
	padding: 0 15px 0 15px;
}

.panel-body1 tr {
	height: 40px;
}

.panel-body1 tr td, .panel-body1 tr th, .c_g_right {
	line-height: 28px !important;
}

.c_g_left {
	border-bottom: 0 !important;
}

.panel-body1 .c_g_right {
	padding-right: 5px;
}

/*
 * general
 */
.c_g_c_b {
	clear: both;
}

.c_g_left {
	text-align: left;
}

.c_g_center {
	text-align: center;
}

.c_g_right {
	text-align: right;
}

/*
 * bootstrap
 */
.pagination>.active>a, .pagination>.active>a:focus, .pagination>.active>a:hover,
	.pagination>.active>span, .pagination>.active>span:focus, .pagination>.active>span:hover
	{
	background-color: #f0ad4e;
	border-color: #f0ad4e;
}

.table-striped1 tbody tr:nth-child(3n+1) {
	background: #f9f9f9 !important;
}

/*
 * adminlte
 */
.modal-content {
	border-radius: 6px;
}
</style>
</head>
<body>
	<div class="c_div_body container">
		<div class="c_div_salip_11">
		</div>

		<table class="table table-striped1">
			<thead>
				<tr>
					<th colspan="2">
						<div class="c_t_left">店铺排名</div>
						<div class="c_t_right">
							<span><a href="javascript:sort('todaySale');"><img
									src="/img/label/dayOn.png" width="30px" height="30px"
									class="img1"></a></span> <span><a
								href="javascript:sort('gmv');"><img
									src="/img/label/monthOff.png" width="30px" height="30px"
									class="img2"></a></span> <span class="img_right"><a
								href="javascript:sort('alipayRate');"><img
									src="/img/label/rateOff.png" width="30px" height="30px"
									class="img3"></a></span>
						</div>
					</th>
				</tr>
			</thead>
			<tbody>
				<tr class="shop_nm">
					<td colspan="2">kipling官方旗舰店&nbsp;&nbsp;(47.9%)</td>
				</tr>
				<tr>
					<th class="c_g_right" style="width: 50%;"><span
						class="c_g_right1">今日:</span>125,704</th>
					<th class="c_g_right" style="width: 50%;"><span
						class="c_g_right2">本月:</span>2,265,925</th>
				</tr>
				<tr>
					<td class="c_g_right"><span class="c_g_right1">昨日:</span>195,696</td>
					<td class="c_g_right"><span class="c_g_right2">上月:</span>6,449,215</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>