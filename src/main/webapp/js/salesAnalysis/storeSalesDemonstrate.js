var unit = 1000;
var unitE = 'K';
var beginStr;
var endStr;
var dateType = 'DAY';
var store;

var b = true;
var time = 10000;
var options = {
	weekStart : 1,
	todayBtn : 1,
	autoclose : 1,
	defaultDate : 1,
	todayHighlight : 1,
	startView : 2,
	minView : 2,
	language : 'zh-CN',
	format : 'dd/MM/yyyy',
	forceParse : 0
}

var names = [ "aa", "bb" ];

$(function() {

	$("#leftStoreAnalysis").attr("class", "nav nav-second-level in");
	$("#storeSalesDemonstrate").css("background", "#578EBE");
	getData();
	$('#dowebok').fullpage(
			{
				// 背景色
				sectionsColor : [ '', ''],
				// 滚动回调函数
				onLeave : function(index, nextIndex, direction) {
					// 刷新将要到达的页面的数据
					getDataByChange();
				},
				anchors : [ 'page1', 'page5'
						],
				menu : '#fullPage-nav',
				showActiveTooltip : true,
				keyboardScrolling : true,
			});
});
// 查询条件改变时更改变化
function getDataByChange() {
	var path = $('#dowebok')[0].baseURI;
	if (path.indexOf("#page1") > -1) {
		getData();
	}else if (path.indexOf("#page5") > -1) {
		getDiscountData();
	} 
}
// 求平均值
function getAve(array) {
	var ave = 0;
	for (var i = 0; i < array.length; i++) {
		ave = ave + array[i];
	}
	if (i > 0)
		ave /= i;
	return ave;
}
// 求和数组
function getArraySum(array) {
	var sum = 0;
	for (var i = 0; i < array.length; i++) {
		sum = sum + array[i];
	}
	return sum;
}
// 获取更改json第一屏
function getData() {
	getSalesData();
	var dateType = 'DAY';
	if (dateType == "DAY") {
		unit = 1000;
		unitE = 'K';
		json.series[0].tooltip.valueSuffix = 'K';
	} else {
		unit = 1000000;
		unitE = 'M';
		json.series[0].tooltip.valueSuffix = 'M';
	}
	//测试日期
	var endStr=new Date("2017-01-01")
	var beginStr=new Date(endStr-1000 * 60 * 60 * 24*31);
	beginStr=beginStr.format("yyyy/MM/dd");
	endStr=endStr.format("yyyy/MM/dd");
	$("#gmv").html(null);
	$("#alipay").html(null);
	$("#gmv").html(null);
	$("#cpl").html(null);

	$.post("/salesAnalysis/storeSale.do", {
		"dateType" : dateType,
		"beginStr" : beginStr,
		"endStr" : endStr,
	},
			function(data) {
				if (data) {
					try {
						var obj = eval('(' + data + ')');
					} catch (e) {
						var response = decodeURI(data);
						alert(response);
						return;
					}
					var obj = eval('(' + data + ')');
					var treeSet = obj.treeSet;

					var categories = [];
					var rates = [];

					var gmvs = [];
					var atvs = [];
					var alipays = [];
					var totalGmv = 0.00;
					var totalTarget = 0.00;
					var totalAlipay = 0.00;
					var totalCplR;
					// redis取出数据
					$.each(treeSet,
							function(i, value) {
								totalGmv = totalGmv + value.gmv;
								totalTarget = totalTarget + value.target;
								totalAlipay = totalAlipay + value.alipay;
								// gmv
								var gmv = value.gmv;
								var viewGmv = eval('(' + (value.gmv).toFixed(0)
										+ ')');
								gmvs.push(viewGmv);
								// atv
								var atvForOne = eval('('
										+ (value.orderNum != 0 ? value.gmv
												/ value.orderNum : 0)
												.toFixed(0) + ')');

								atvs.push(atvForOne);
								categories.push(value.datetime);
							});
					// 求平均值
					var gmvAve = getAve(gmvs);
					json.yAxis[0].plotLines[0].value = gmvAve;
					var atvAve = getAve(atvs)
					atvjson.yAxis[0].plotLines[0].value = atvAve;
					// 求和金额
					var gmvSum = getArraySum(gmvs);
					// 数量
					var atvSum = getArraySum(atvs);
					if (categories.length > 60) {
						json.xAxis[0].tickInterval = 6;
						atvjson.xAxis[0].tickInterval = 6;
					} else if (categories.length > 30) {
						json.xAxis[0].tickInterval = 3;
						atvjson.xAxis[0].tickInterval = 3;
					} else if (categories.length > 15) {
						json.xAxis[0].tickInterval = 2;
						atvjson.xAxis[0].tickInterval = 2;
					}

					json.xAxis[0].categories = categories;
					atvjson.xAxis[0].categories = categories;
					json.series[0].data = gmvs;
					atvjson.series[0].data = atvs;
					$("#viewBottomLeft").highcharts(json);
					if (totalTarget) {
						totalCplR = (totalGmv / totalTarget * 100).toFixed(2);
					} else {
						totalCplR = 0;
					}
					// gmv alipay target cpl
					totalGmv = totalGmv.toFixed(0);
					totalAlipay = totalAlipay.toFixed(0);
					totalTarget = totalTarget.toFixed(0);
					var _totalGmv = formatNum(totalGmv);
					var _totalAlipay = formatNum(totalAlipay);
					var _totalTarget = formatNum(totalTarget);
					$("#gmv").html(_totalGmv);
					$("#alipay").html(_totalAlipay);
					$("#target").html(_totalTarget);
					$("#cpl").html(totalCplR + "%");
				} else {
					alert("查询失败");
				}
			});
}
//水球方法
function shuiqiu(a, b) {
	var config1 = liquidFillGaugeDefaultSettings();
	config1.textColor = "#FFFFFF";
	$("#waterPoloLeft").empty();
	$("#waterPoloRight").empty();
	var gauge1 = loadLiquidFillGauge("waterPoloLeft", a,config1);
	var gauge2 = loadLiquidFillGauge("waterPoloRight", b,config1);

	config1.circleColor = "#FF7777";
	config1.textColor = "#FF4444";
	config1.waveTextColor = "#FFAAAA";
	config1.waveColor = "red";
	config1.circleThickness = 0.2;
	config1.textVertPosition = 0.2;
	config1.waveAnimateTime = 1000;
	var config2 = liquidFillGaugeDefaultSettings();
	config2.textColor = "#FFFFFF";
};
//获取更改json第一屏幕头部数据
function getSalesData() {
	//测试日期昨日销售
	var dateType="DAY";
	var endStr=new Date("2017-01-01")
	var monthBegin=endStr.format("yyyy/MM/dd");
	var beginStr=new Date(endStr-1000 * 60 * 60 * 24);
	beginStr=beginStr.format("yyyy/MM/dd");
	endStr=beginStr;
	$.ajax({
		url : "/salesAnalysis/storeSale.do",
		type : "post",
		data : {
			"dateType" : dateType,
			"beginStr" : beginStr,
			"endStr" : endStr,
		},
		dataType : "json",
		success : function(data, status) {
			console.log(data);
			if (data) {
				$("#yesterdaySales").text(formatNum(Number(data.treeSet[0].gmv).toFixed(0)));
			} else {
				toastr.success("error");
			}

		}
	});
	//本月销售 
	var dateType="MONTH";
	var beginStr=monthBegin;
	var endStr=monthBegin;
	$.ajax({
		url : "/salesAnalysis/storeSale.do",
		type : "post",
		data : {
			"dateType" : dateType,
			"beginStr" : beginStr,
			"endStr" : endStr,
		},
		dataType : "json",
		success : function(data, status) {
			if (data) {
				console.log(data);
				var monthSale=Number(data.treeSet[0].gmv);
				var monthAlipay=Number(data.treeSet[0].alipay);
				$("#monthSales").text(formatNum(monthSale.toFixed(0)));
				$("#monthAlipay").text(formatNum(monthAlipay.toFixed(0)));
				var gmvRate=monthSale/data.treeSet[0].target
				Number(data.treeSet[0].completeness).toFixed(3);
				Number(data.treeSet[0].alipayCompleteness).toFixed(3);
				
				shuiqiu(Number(data.treeSet[0].completeness).toFixed(3)*100, Number(data.treeSet[0].alipayCompleteness).toFixed(3)*100);
			} else {
				toastr.success("error");
			}
		}
	});


}
// 获取更改json第五屏幕
function getDiscountData() {
	$.ajax({
		url : "/salesAnalysis/storePromotion.do",
		type : "post",
		data : {
			"dateType" : dateType,
			"beginStr" : beginStr,
			"endStr" : endStr,
		},
		dataType : "json",
		success : function(data, status) {
			if (data) {
				discount.series[0].data = data.detailDiscountFeeSection;
				discount.xAxis.categories = data.promotionName;
				console.log(data);
				$("#viewBottomDiscount").highcharts(discount);
				$("#discountTotal").text(
						formatNum(Number(data.sumTotalFee).toFixed(0)));
				$("#discountPayment").text(
						formatNum(Number(data.sumPayment).toFixed(0)));
				$("#discountValue").text(
						((data.sumPayment / data.sumTotalFee) * 100).toFixed(2)
								+ "%");
			} else {
				toastr.success("error");
			}

		}
	});

}
