<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<title>事业部图表</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="/css/jquery.vm-carousel.css">
<link rel="stylesheet" href="/css/screen/department-screen.css">

<script src="/js/d3.v3.min.js"></script>
<script src="/js/shuiqiu.js"></script>
<script src="/js/modernizr.js"></script>
<script src="/js/jquery-1.12.3.js"></script>
<script src="/js/bootstrap/bootstrap.min.js"></script>
<script src="/js/jquery.vm-carousel.js"></script>
<script src="/js/Highchartstheme.js"></script>
<script src="/js/highcharts2.js"></script>
<script src="/js/scientific.js"></script>
<script type="text/javascript">
	/* 全局参数 */
	var chartsseriesList;
	var businessShopData;
	var doscroll = function() {
		var $parent = $('.js-slide-list');
		var $first = $parent.find('li:first');
		var height = $first.height();
		$first.animate({
			height : 0
		}, 500, function() {
			$first.css('height', 68.4).appendTo($parent);
		});
	};
	var charts = {
		chart : {
			type : 'spline',
			//背景色background-color: rgba(70, 100, 123, 0.8);
			backgroundColor: 'rgba(70, 100, 123, 0.6)',
		},
		xAxis : {
			categories : [ '0:00', '1:00', '2:00', '3:00', '4:00', '5:00', '6:00', '7:00', '8:00', '9:00',
							'10:00', '11:00', '12:00', '13:00', '14:00', '15:00', '16:00', '17:00', '18:00', '19:00',
							'20:00', '21:00', '22:00', '23:00' ],
							/* 隔几个显示一个 */
							tickInterval : 3,
							labels : {
								style:{
									/* 横坐标字体颜色 */
									color:"#ffffff"
								}
							}
							
						
		},
		yAxis : {
			title : {
				text : 'amount',
			},
			labels : {
				formatter : function() {
					return this.value + '';
				},
			style:{
				/* 纵坐标字体颜色 */
				color:"#ffffff"
			}
			}
		},
		tooltip : {
			crosshairs : true,
			shared : true,
			//数据提示框样式
			/* style:{
				color:"red"
			} */
		},
		legend : { layout : 'vertical', align : 'left', x : 350, verticalAlign :
			  'top', floating : true, y : 0, floating : true, 
			  /* 图例文字样式 */
			  itemStyle:{
					color:"#ffffff"
			  } },
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
							name : 'Today',
							data : [],
							lineColor:'rgb(215, 255, 0)'
						},
						{
							name : 'Yesterday',
							data : [],
							dashStyle: 'longdash',
							lineColor : 'rgba(0, 243, 255, 1)'
						} 
							]
	};
	var chartsShop = {
			chart : {
				type : 'spline',
				//背景色
				backgroundColor: 'rgba(70, 100, 123, 0.6)',

			},
			title : {
				text : '店铺销售对比',
				style:{
					/* 横坐标字体颜色 */
					
				}
			},
			xAxis : {
				/* categories : [ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
						'10', '11', '12', '13', '14', '15', '16', '17', '18', '19',
						'20', '21', '22', '23' ] */
			categories : [ '0:00', '1:00', '2:00', '3:00', '4:00', '5:00', '6:00', '7:00', '8:00', '9:00',
							'10:00', '11:00', '12:00', '13:00', '14:00', '15:00', '16:00', '17:00', '18:00', '19:00',
							'20:00', '21:00', '22:00', '23:00' ],
							tickInterval : 3,
							labels : {
								style:{
									/* 横坐标字体颜色 */
									color:"#ffffff"
								}
							}
			},
			yAxis : {
				title : {
					text : 'amount'
				},
				labels : {
					formatter : function() {
						return this.value + '';
					},
					style:{
						/* 纵坐标字体颜色 */
						color:"#ffffff"
					}
				}
			},
			tooltip : {
				crosshairs : true,
				shared : true
			},
			legend : { layout : 'vertical', align : 'left', x : 800, verticalAlign :
				  'top', floating : true, y : 0, floating : true ,
				  /* 图例文字样式 */
				  itemStyle:{
						color:"#ffffff"
				  }},
				            

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
						name : 'Today',
						data : [],
						lineColor:'rgb(215, 255, 0)'
					},
					{
						name : 'Yesterday',
						data : [],
						dashStyle: 'longdash',
						lineColor : 'rgba(0, 243, 255, 1)'
					} 
					]
		};
	//图片轮播时更改内容
	var change = function() {
		/*  preventDefault(); */
		that.slide_relative(1);
		showShopHour();
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
			start_item : 0,
			autoplay : false,
			infinite : true
		});
		charts.title={
				text : '部门销售对比',
				/* 部门标题样式 */
				style:{
			        color:"#ffffff"
			    }
			}

		//获取数据
		 businessShopData=getShopHourData($("#businessName").val());
		$('#store-chart').highcharts(charts);
		//店铺展示数据
		showShopHour();
		//logo图片轮播
		setInterval("change()", 4000);
		//时间展示的刷新
		setInterval(function() {
		    var now = (new Date()).toLocaleString();
		    $('#current-time').text(now);
		}, 1000);
		//水球
		getBusinessWaterPolo($("#businessName").val())
		getBusinessHourData($("#businessName").val());
		//滚动表格
		setInterval(doscroll, 4000); 
		
	});
	//店铺分时数据
	function getShopHourData(business){
		var data1
		$.ajax({
			//同步设置数据
			 async:false,
            type: "post",
            url: "<%=basePath%>overall/getShopData.do",
			data : {
				"business" : business
			},
			dataType : 'JSON',
			success : function(data, status) {
				data1 = data.data;
			}
		});
		console.log(data1);
		return data1;
	}
	//水球数据
	function getBusinessWaterPolo(business){
		$.ajax({
			//同步设置数据
			 async:false,
            type: "post",
            url: "<%=basePath%>overall/getBusinessWaterPolo.do",
			data : {
				"business" : business
			},
			dataType : 'JSON',
			success : function(data, status) {
				console.log(data.data);
				var json=data.data;
				var alipay=json.businessAlipay;
				var aliTarget=json.businessAlipayTarget;
				var gmv=json.businessGmv;
				var gmvTarget=json.businessGmvTarget;
				var ali=Number(alipay/aliTarget)*100;
				var gm=Number(gmv/gmvTarget)*100;
				
				shuiqiu((gm-gm%0.1),(ali-ali%0.1));
			}
		});
	}
	//事业部分时数据
	function getBusinessHourData(business){
		var data1
		$.ajax({
			//同步设置数据
			 async:false,
            type: "post",
            url: "<%=basePath%>overall/getBusinessHour.do",
			data : {
				"business" : business
			},
			dataType : 'JSON',
			success : function(data, status) {
				var  business=data.data;
				charts.series[0].data=business.today;
				charts.series[1].data=business.yesterday;
				$('#depart-chart').highcharts(charts);
			}
		});
		return data1;
	}
	//展示shopHour数据数据少于5个时有问题
	function showShopHour(){
		 var shopName=$(".vmc_active img").attr("alt");
		 chartsShop.series[0].data =businessShopData[$(".vmc_active img").attr("alt")];
		 chartsShop.series[1].data=businessShopData[$(".vmc_active img").attr("alt")+"Yesterday"];
		 chartsShop.title={
					text :shopName+'销售对比',
					/* 标题样式 */
					style:{
				        color:"#ffffff"
				    }
			};
		$('#store-chart').highcharts(chartsShop);
		var total=businessShopData[$(".vmc_active img").attr("alt")+"Total"];
		//舍去小数位
		$("#total").text(formatNum(parseInt(total)));
		var yesterdayTotal=businessShopData[$(".vmc_active img").attr("alt")+"YesterdayTotal"];
		$("#yesterdayTotal").text(formatNum(parseInt(yesterdayTotal)));
		var shopMonthGmv=parseInt(businessShopData[$(".vmc_active img").attr("alt")+"Gmv"]);
		$("#shopMonthGmv").text(formatNum(shopMonthGmv));
		var gmvTarget=businessShopData[$(".vmc_active img").attr("alt")+"GmvTarget"]
		var gmvTargetRate=(Number(shopMonthGmv)/gmvTarget)*100;
		if(gmvTargetRate=="Infinity"){
			$("#gmvTargetRate").text("-%");
		}else{
			$("#gmvTargetRate").text((gmvTargetRate-gmvTargetRate%0.1).toFixed(1) + "%");
		}
	}		
</script>
</head>
<body>
	<div class="screen">
	<input type="text" id="businessName" value="${businessName}" style="display: none">
		<div class="screen-top" style="">

			<div class="screen-top-data">
				<table style="position: relative; width: 100%; height: 100%;">
					<tr style="font-size: 20px; text-align: left;">
						<td>Yesterday</td>
					</tr>
					<tr style="font-size: 30px;">
						<td style="right: 5px; text-align: right;">
						<fmt:formatNumber   type="number" value="${businessYesterday.gmv-businessYesterday.gmv%1}" maxFractionDigits="0" />
						</td>
					</tr>
					<tr style="font-size: 20px; text-align: left;">
						<td>Real time</td>
					</tr>
					<tr style="font-size: 30px;">
						<td style="right: 5px; text-align: right;">
						<fmt:formatNumber  type="number" value="${businessToday.gmv-businessToday.gmv%1}"  maxFractionDigits="0"/>
						</td>
					</tr>
				</table>
			</div>
			<!-- 部门图 -->
			<div id="depart-chart" class="screen-top-chart" style=""></div>
			<div class="screen-top-title">
				<div
					style="width: 100%; text-align: center; color: #ffffff; font-size: 40px;">百秋电商${businessName}部门月度销售数据</div>

				<div class="date"
					style="width: 100%; text-align: center; color: #e2d4d4; font-size: 20px;" id="current-time">
					</div>
				<div class="mtd"
					style="width: 100%; text-align: center; color: #e2d4d4; font-size: 20px;">Mtd</div>
				<div
					style="width: 100%; text-align: center; color: #e2d4d4; font-size: 20px;">
					
					<fmt:formatNumber  type="number" value="${businessMonth.gmv}"  maxFractionDigits="0"/>
					</div>
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
						<c:forEach items="${shopBeans}" var="shop">
							<li class="title"><span class="store">${shop.name}</span> <span
						class="mtd">
						<fmt:formatNumber  type="number" value="${shop.shopTvShowTablePojo.gmv-shop.shopTvShowTablePojo.gmv%1}"  maxFractionDigits="0"/>
						</span> <span class="gmv-rate">
						<fmt:formatNumber type="percent" value="${shop.shopTvShowTablePojo.gmvRate-shop.shopTvShowTablePojo.gmvRate%0.001}"  maxFractionDigits="1"/> 
						</span> <span class="ali-rate">
						<fmt:formatNumber type="percent" value="${shop.shopTvShowTablePojo.alipayRate-shop.shopTvShowTablePojo.alipayRate%0.001}"  maxFractionDigits="1"/> 
						
						</span> <span class="yesterday-gmv">
						<fmt:formatNumber type="number" value="${shop.shopTvShowTablePojo.yesterdaySale-shop.shopTvShowTablePojo.yesterdaySale%1}"  maxFractionDigits="0"/>
						</span>
						<span class="dtd">		
					<fmt:formatNumber type="number" value="${shop.shopTvShowTablePojo.todaySale-shop.shopTvShowTablePojo.todaySale%1}"  maxFractionDigits="0"/>
										
						
						</span></li>
					</c:forEach> 
				</ul>
			</div>
		</div>
		<div class="screen-right">
			<div class="screen-right-brand">
				<div class="brand-list" style="position: relative; width: 100%;">
					<ul class="vmcarousel-centered-infitine vmc-centered"
						style="position: relative; width: 100%">
							<c:forEach items="${shopBeans}" var="shop">
						<li style="position: relative; color:#fff;width: 20% ;text-align: center; top:30%" ><img 
							src="${shop.url}" alt="${shop.name}" style="background-color:#ffffff;width: 80%"></li>
					</c:forEach> 
					</ul>
				</div>
			</div>
			<div class="screen-right-data">
				<table
					style="position: relative; width: 100%; height: 100%; text-align: center;">
					<tr style="">
						<td rowspan="2" style="font-size: 40px; width: 25%;">Mtd</td>
						<td style="font-size: 50px; width: 25%; text-align: right;" id="shopMonthGmv">123123</td>
						<td style="font-size: 40px; width: 25%; text-align: right;">real
							time</td>
						<td style="font-size: 40px; width: 25%; text-align: right;">yesterday</td>
					</tr>

					<tr style="font-size: 30px;">
						<td style="text-align: right;" id="gmvTargetRate">50%</td>
						<td style="text-align: right;" id="total">1231223</td>
						<td style="text-align: right;" id="yesterdayTotal">3123123</td>
					</tr>

				</table>
			</div>
			<!-- 店铺图 -->
			<div id="store-chart" class="right-chart"></div>
		</div>
	</div>
</body>
</html>