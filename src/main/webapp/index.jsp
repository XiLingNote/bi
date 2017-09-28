<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<title>事业部图表</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="/css/jquery.vm-carousel.css">
<link rel="stylesheet" href="/css/screen/department-screen.css">

<script src="/js/d3.v3.min.js"></script>
<script src="/js/shuiqiu.js"></script>
<script src="js/modernizr.js"></script>
<script src="js/jquery-1.12.3.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<script src="js/jquery.vm-carousel.js"></script>
<script src="/js/Highchartstheme.js"></script>
<script src="/js/highcharts2.js"></script>
<script src="/js/scientific.js"></script>
<script type="text/javascript">
	/* 全局参数 */
	var chartsseriesList;
	var charts = {
		chart : {
			type : 'spline'
		},
		title : {
			text : '部门销售对比'
		},
		subtitle : {
			text : 'bi'
		},
		xAxis : {
			categories : [ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'10', '11', '12', '13', '14', '15', '16', '17', '18', '19',
					'20', '21', '22', '23' ]
		},
		yAxis : {
			title : {
				text : 'amount'
			},
			labels : {
				formatter : function() {
					return this.value + '';
				}
			}
		},
		tooltip : {
			crosshairs : true,
			shared : true
		},
		plotOptions : {
			spline : {
				marker : {
					radius : 0,
					lineColor : '#666666',
					lineWidth : 0
				}
			}
		},
		series : [
				{
					name : '今日',
					data : [ 100, 200, 300, 800, 500, 6, 7, 5, 9, 10, 11, 12, 5, 14, 15,
							16, 17, 8, 19, 20, 2100, 1200, 23, 24 ]
				},
				{
					name : '对比日',
					data : [ 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13,
							12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 200, 100 ]
				} ]
	};

	var change = function() {
		/*  preventDefault(); */
		that.slide_relative(1);
		/* alert($(".vmc_active img").attr("id")); */
	};

	var chartsValue = function(brand) {

	};

	function shuiqiu(a, b) {

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
	};

	$(function() {
		$('.vmcarousel-centered-infitine').vmcarousel({
			centered : true,
			start_item : 1,
			autoplay : false,
			infinite : true
		});
		
		shuiqiu(80.25, 70.5);
		
		$('#depart-chart').highcharts(charts);

		$('#store-chart').highcharts(charts);
		/* setInterval("change()", 2000); */
	});
</script>
</head>
<body>
	<div class="screen">
		<div class="screen-top" style="">

			<div class="screen-top-data">
				<table style="position: relative; width: 100%; height: 100%;">
					<tr style="font-size: 20px; text-align: left;">
						<td>Yesterday</td>
					</tr>
					<tr style="font-size: 30px;">
						<td style="right: 5px; text-align: right;">12341234123</td>
					</tr>
					<tr style="font-size: 20px; text-align: left;">
						<td>Real time</td>
					</tr>
					<tr style="font-size: 30px;">
						<td style="right: 5px; text-align: right;">12341234123</td>
					</tr>
				</table>
			</div>
			<!-- 部门图 -->
			<div id="depart-chart" class="screen-top-chart" style=""></div>
			<div class="screen-top-title">
				<div
					style="width: 100%; text-align: center; color: #ffffff; font-size: 40px;">百秋电商某个部门月度销售数据</div>

				<div class="date"
					style="width: 100%; text-align: center; color: #e2d4d4; font-size: 20px;">2017-05-01
					00:00:00</div>
				<div class="mtd"
					style="width: 100%; text-align: center; color: #e2d4d4; font-size: 20px;">Mtd</div>
				<div
					style="width: 100%; text-align: center; color: #e2d4d4; font-size: 20px;">
					1231234134</div>
			</div>

			<div class="screen-top-liquid">
				<div style="width: 50%; height: 20%; float: left;">gmv</div>
				<div style="width: 50%; height: 20%; float: right;">alipay</div>
				<div class="gmv-liquid"
					style="width: 50%; height: 80%; float: left;">
					<svg id="fillgauge1" width="100%" height="80%"></svg>
				</div>
				<div class="ali-liquid"
					style="width: 50%; height: 80%; float: right;">
					<svg id="fillgauge2" width="100%" height="80%"></svg>
				</div>
			</div>
		</div>
		<div class="screen-left">
			<div class="slide-title">
				<ul class="slide-list">
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
				</ul>
			</div>

			<div class="slide-container">
				<ul class="slide-list js-slide-list">
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
					<li class="title"><span class="store">店铺</span> <span
						class="mtd">当月销售</span> <span class="gmv-rate">销售完成率</span> <span
						class="ali-rate">收账完成率</span> <span class="yesterday-gmv">昨日销售</span>
						<span class="dtd">实时销售</span></li>
				</ul>
			</div>
		</div>

		<div class="screen-right">
			<div class="screen-right-brand">
				<div class="brand-list" style="position: relative; width: 100%">
					<ul class="vmcarousel-centered-infitine vmc-centered"
						style="position: relative; width: 100%">
						<li style="position: relative; width: 20%"><img id="1"
							src="images/01.png" alt=""></li>
						<li style="position: relative; width: 20%"><img id="2"
							src="images/02.png" alt=""></li>
						<li style="position: relative; width: 20%"><img id="3"
							src="images/03.png" alt=""></li>
						<li style="position: relative; width: 20%"><img id="4"
							src="images/04.png" alt=""></li>
						<li style="position: relative; width: 20%"><img id="5"
							src="images/05.png" alt=""></li>
						<li style="position: relative; width: 20%"><img id="6"
							src="images/06.png" alt=""></li>
					</ul>

				</div>
			</div>
			<div class="screen-right-data">
				<table
					style="position: relative; width: 100%; height: 100%; text-align: center;">
					<tr style="">
						<td rowspan="2" style="font-size: 40px; width: 25%;">Mtd</td>
						<td style="font-size: 50px; width: 25%; text-align: right;">123123</td>
						<td style="font-size: 40px; width: 25%; text-align: right;">real
							time</td>
						<td style="font-size: 40px; width: 25%; text-align: right;">yesterday</td>
					</tr>

					<tr style="font-size: 30px;">
						<td style="text-align: right;">50%</td>
						<td style="text-align: right;">1231223</td>
						<td style="text-align: right;">3123123</td>
					</tr>

				</table>
			</div>
			<!-- 店铺图 -->
			<div id="store-chart" class="right-chart"></div>
		</div>
	</div>
</body>
</html>