<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>monthSales</title>

<script src="/js/d3.v3.min.js" language="JavaScript"></script>
<script src="/js/shuiqiu.js" language="JavaScript"></script>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<link rel="stylesheet" href="/css/bi.css">
<link rel="stylesheet"
	href="/css/bootstrap/bootstrap-datetimepicker.min.css">
<script src="/js/jquery-1.12.3.js"></script>
<script src="/js/echarts.js"></script>


<jsp:include page="/page/left.do"></jsp:include>
<style>
.show {
	background-color: #2c343c;
	color: white;
	text-align: center;
	padding: 5px;
}

td {
	position: relative;
	width: 20%;
}

.shuiqiu{
position: relative;
	width: 100%;
	height: 100%
}
</style>
<script type="text/javascript">
	function shuiqiu(a,b) {

		var gauge1 = loadLiquidFillGauge("fillgauge1", a);
		var config1 = liquidFillGaugeDefaultSettings();
		config1.circleColor = "#FF7777";
		config1.textColor = "#FF4444";
		config1.waveTextColor = "#FFAAAA";
		config1.waveColor = "#FFDDDD";
		config1.circleThickness = 0.2;
		config1.textVertPosition = 0.2;
		config1.waveAnimateTime = 1000;
		
		var gauge2 = loadLiquidFillGauge("fillgauge2", b);
		var config2 = liquidFillGaugeDefaultSettings();
		config2.circleColor = "#FF7777";
		config2.textColor = "#FF4444";
		config2.waveTextColor = "#FFAAAA";
		config2.waveColor = "#FFDDDD";
		config2.circleThickness = 0.2;
		config2.textVertPosition = 0.2;
		config2.waveAnimateTime = 1000;
	}
</script>
</head>

<body>


	<!-- 为ECharts准备一个具备大小（宽高）的Dom -->

	<div class="page">

		<div id="show" class="show" style="height: 15%;">
			<table style="position: relative; width: 100%; height: 100%;z-index:999">
				<tr style="position: relative; width: 100%; height: 20%">
					<td>Yesterday</td>
					<td>MTD_GMV</td>
					<td>MTD_Alipay</td>
					<td>GMV_Complection</td>
					<td>Alipay_Complection</td>
				</tr>
				<tr style="position: relative; width: 100%; height: 60%;">
					<td id="Yesterday_gmv">1</td>
					<td id="gmv">2</td>
					<td id="alipay">3</td>
					<td><svg id="fillgauge1" width="50%" height="40%"></svg></td>
					<td><svg id="fillgauge2" width="50%" height="40%"></svg></td>
				</tr>
			</table>
		</div>

		<div id="main" style="height: 85%;margin-top:-5%"></div>


	</div>

	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var gmvlist;
		var recentlyDate;
		// 指定图表的配置项和数据
		//app.title = '多 X 轴示例';
		var myChart = echarts.init(document.getElementById('main'));
		var colors = [ '#5793f3', '#d14a61', '#675bba' ];
		$(function() {
			$("#leftStoreAnalysis").attr("class", "nav nav-second-level in");
			$("#storeSalesDemonstrate").css("background", "#578EBE");
			var storeName = "c.p.u.";
			var gmv = 0;
			$
					.ajax({
						type : 'POST',
						url : "/store/storeSalesDemonstrate.do",
						data : {
							"storeName" : storeName
						},
						dataType : 'json',
						success : function(data) {
							shuiqiu(data.completeness*100,data.alipayCompleteness*100);

							$("#Yesterday_gmv").html(data.Yesterday_gmv);
							$("#gmv").html(data.gmv);
							$("#alipay").html(data.alipay);
							gmv = data.gmv;
							gmvlist = data.gmvlist;
							recentlyDate = data.recentlyDate;

							myChart
									.setOption({
										color : "red",
										backgroundColor : '#2c343c',

										tooltip : {
											trigger : 'none',
											axisPointer : {
												type : 'cross'
											}
										},
										legend : {
											/*        data:['2015 降水量', '2016 降水量'] */
										
											color : colors[1]
										},
										grid : {
											top : 70,
											bottom : 50
										},
										xAxis : [ {
											type : 'category',
											axisTick : {
												alignWithLabel : true
											},
											axisLine : {
												onZero : false,
												lineStyle : {
													color : colors[1]
												}
											},
											axisPointer : {
												label : {
													formatter : function(params) {
														return 'gmv  '
																+ params.value
																+ (params.seriesData.length ? '：'
																		+ params.seriesData[0].data
																		: '');
													}
												}
											},
											data : data.recentlyDate
										}

										],
										yAxis : [ {
											type : 'value',
											axisLine : {
												onZero : false,
												lineStyle : {
													color : colors[1]
												}
											}

										} ],
										series : [

										{
											name : 'sales',
											type : 'line',
											smooth : true,
											/* color: colors[0], */
											data : data.gmvlist,
											markPoint : {
												data : [ {
													type : 'max',
													name : '最大值'
												}, {
													type : 'min',
													name : '最小值'
												} ]
											},
											markLine : {
												data : [ {
													type : 'average',
													name : '平均值'
												} ]
											}
										} ]
									});
						}
					});

			
		});

	</script>



</body>
</html>