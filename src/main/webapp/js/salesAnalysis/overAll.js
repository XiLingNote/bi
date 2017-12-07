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
	$("#storeAnalysis").css("background", "#578EBE");

	// pandora潘多拉官方旗舰店
	var datetype = $("input[name='datetype']:checked").val();
	$("input[name='datetype']:last").attr("checked", true);
	// json.series[1].tooltip.valueSuffix = 'k';
	// json.series[2].tooltip.valueSuffix = 'k';
	var end = new Date();
	var day = end.getDate();
	var year = end.getFullYear();
	var month = end.getMonth();

	// 天 ,月 ,年:开始日期
	var dayBegin = new Date(year, month, day - 29);
	var monthBegin = new Date(year, month - 5);
	var yearBegin = new Date(year - 2, month);

	// 天 ,月 ,年：结束日期格式化
	var _dayEnd = (day > 9) ? day : "0" + day;
	var _monthEnd = (month > 8) ? (month + 1) : "0" + (month + 1);
	var _yearEnd = year;
	var _endYMD = _yearEnd + "/" + _monthEnd + "/" + _dayEnd;
	var _endYM = _yearEnd + "/" + _monthEnd;
	var _endY = _yearEnd;

	// 天：开始日期格式化
	var dayBeginDay = dayBegin.getDate();
	var dayBeginMonth = dayBegin.getMonth();
	var _dayDayBegin = (dayBeginDay > 9) ? dayBeginDay : "0" + dayBeginDay;
	var _dayMonthBegin = (dayBeginMonth > 8) ? (dayBeginMonth + 1) : "0"
			+ (dayBeginMonth + 1);
	var _dayBeginYear = dayBegin.getFullYear();
	var _beginYMD = _dayBeginYear + "/" + _dayMonthBegin + "/" + _dayDayBegin;

	// 月:开始日期格式化
	var monthBeginMonth = monthBegin.getMonth();
	var _monthBeginMonth = (monthBeginMonth > 8) ? (monthBeginMonth + 1) : "0"
			+ (monthBeginMonth + 1);
	var _monthBeginYear = monthBegin.getFullYear();
	var _beginYM = _monthBeginYear + "/" + _monthBeginMonth;
	// 年：开始日期格式化
	var _beginY = yearBegin.getFullYear();
	// 默认查询时间
	beginStr = _beginYMD;
	endStr = _endYMD;

	// 日
	$('#s3>input[name = begin ]').val(_beginYMD);
	$('#s3>input[name = end ]').val(_endYMD);
	// 月
	$('#s2>input[name = begin ]').val(_beginYM);
	$('#s2>input[name = end ]').val(_endYM);
	// 年
	$('#s1>input[name = begin ]').val(_beginY);
	$('#s1>input[name = end ]').val(_endY);
	getData();
	/* 年日期选项 */
	options.minView = 4;
	options.startView = 4;
	options.format = "yyyy";
	$('#s1>input[name = begin ]').datetimepicker(options);
	$('#s1>input[name = end ]').datetimepicker(options);
	/* 月日期选项 */
	options.minView = 3;
	options.startView = 3;
	options.format = "yyyy/MM";
	$('#s2>input[name = begin ]').datetimepicker(options);
	$('#s2>input[name = end ]').datetimepicker(options);
	/* 日日期选项 */
	options.minView = 2;
	options.startView = 2;
	options.format = "yyyy/MM/dd";
	$('#s3>input[name = begin ]').datetimepicker(options);
	$('#s3>input[name = end ]').datetimepicker(options);

	// 后台数据
	$('#s3>input[name = begin ]').change(function() {
		beginStr = this.value;
		getDataByChange();

	});
	$('#s3>input[name = end ]').change(function() {
		endStr = this.value;
		getDataByChange();
	});

	$('#s2>input[name = begin ]').change(function() {
		beginStr = this.value + "/01";
		getDataByChange();

	});
	$('#s2>input[name = end ]').change(function() {
		endStr = this.value + "/01";
		getDataByChange();

	});

	$('#s1>input[name = begin ]').change(function() {
		beginStr = this.value + '/01/01';
		getDataByChange();

	});

	$('#s1>input[name = end ]').change(function() {
		endStr = this.value + '/01/01';
		getDataByChange();

	});

	$("input[name='datetype']").change(function() {
		getDataByChange();
	});

	$('#dowebok').fullpage(
			{
				// 背景色
				sectionsColor : [ '', '#4BBFC3', '', '', "", '', '',
						'', ],
				// 滚动回调函数
				onLeave : function(index, nextIndex, direction) {
					// 刷新将要到达的页面的数据
					getDataByChange();
				},
				anchors : [ 'page1', 'page2', 'page3', 'page4', 'page5',
						'page6', 'page7', 'page8' ],
				menu : '#fullPage-nav',
				showActiveTooltip : true,
				keyboardScrolling : true,
			});
	d3.select(self.frameElement).style("height", "700px");
	d3.select(self.frameElement).style("height", "700px");
	getData();
});
// 查询条件改变时更改变化
function getDataByChange() {
	dateType = $("input[name='datetype']:checked").val();
	if (dateType == "YEAR") {
		$("#s1").removeAttr("hidden");
		$("#s2").attr("hidden", true);
		$("#s3").attr("hidden", true);
		beginStr = $('#s1>input[name = begin ]').val() + "/01/01";
		endStr = $('#s1>input[name = end ]').val() + "/01/01";
	}
	if (dateType == "MONTH") {
		$("#s2").removeAttr("hidden");
		$("#s1").attr("hidden", true);
		$("#s3").attr("hidden", true);
		beginStr = $('#s2>input[name = begin ]').val() + "/01";
		endStr = $('#s2>input[name = end ]').val() + "/01";
	}
	if (dateType == "DAY") {
		$("#s3").removeAttr("hidden");
		$("#s2").attr("hidden", true);
		$("#s1").attr("hidden", true);
		beginStr = $('#s3>input[name = begin ]').val();
		endStr = $('#s3>input[name = end ]').val();
	}
	var path = $('#dowebok')[0].baseURI;
	if (path.indexOf("#page1") > -1) {
		getData();
	} else if (path.indexOf("#page2") > -1) {

	} else if (path.indexOf("#page2") > -1) {

	} else if (path.indexOf("#page3") > -1) {

	} else if (path.indexOf("#page4") > -1) {
	} else if (path.indexOf("#page5") > -1) {
		getDiscountData();
	} else if (path.indexOf("#page6") > -1) {
		getPriceRangeList();
	} else if (path.indexOf("#page7") > -1) {
		
	} else if (path.indexOf("#page8") > -1) {
		getStoreCompare();
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
	if (dateType == "DAY") {
		unit = 1000;
		unitE = 'K';
		json.series[0].tooltip.valueSuffix = 'K';
	} else {
		unit = 1000000;
		unitE = 'M';
		json.series[0].tooltip.valueSuffix = 'M';
	}
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
						toastr.success(response);
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
					$("#numsValue").text(formatNum(atvSum));
					$("#gmvValue").text(formatNum(gmvSum));
					$("#atvValue").text(
							atvSum == 0 ? 0 : (gmvSum / atvSum).toFixed(2));
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
					$("#viewBottomRight").highcharts(atvjson);
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
					toastr.success("error");
				}
			});
}

// 获取更改json第五屏幕
function getDiscountData() {
	if (dateType == "DAY") {
		unit = 1000;
		unitE = 'K';
		json.series[0].tooltip.valueSuffix = 'K';
	} else {
		unit = 1000000;
		unitE = 'M';
		json.series[0].tooltip.valueSuffix = 'M';
	}
	$("#gmv").html(null);
	$("#alipay").html(null);
	$("#gmv").html(null);
	$("#cpl").html(null);
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
				$("#viewBottomDiscount").highcharts(discount);
				$("#discountTotal").text(
						formatNum(Number(data.sumTotalFee).toFixed(0))=="NaN"?0:formatNum(Number(data.sumTotalFee).toFixed(0)));
				$("#discountPayment").text(
						formatNum(Number(data.sumPayment).toFixed(0))=='NaN'?0:formatNum(Number(data.sumPayment).toFixed(0)));
				$("#discountValue").text(
						((data.sumPayment / data.sumTotalFee) * 100).toFixed(2)=="NaN"?0:((data.sumPayment / data.sumTotalFee) * 100).toFixed(2)
								+ "%");
			} else {
				toastr.success("error");
			}

		}
	});

}
//第六屏幕
function getPriceRangeList(){
	var tableTitleName = "priceRange";
	getTitle(tableTitleName, "");
	getpriceRangeData()
}
function getpriceRangeData(priceRange) {
	if(!priceRange){
		return;
	}

	$.ajax({
		url : "/salesAnalysis/getStorePriceRangeString.do",
		type : "post",
		data : {
			"dateType" : dateType,
			"beginStr" : beginStr,
			"endStr" : endStr,
			"priceRange":priceRange
		},
		dataType : "json",
		success : function(data, status) {
			if (data) {
				var jsonArray = new Array();
				var jsonData = data.data;
				for ( var p in jsonData) {//遍历json对象的每个key/value对,p为key
					var arr = new Array();
					var date = new Date(p)
					arr.push(Date.UTC(date.getUTCFullYear(),
							date.getUTCMonth(), date.getUTCDate()));
					arr.push(jsonData[p]);
					jsonArray.push(arr)
				}
				priceRangeJson.series[0].data = jsonArray;
				$("#priceRangeRight").highcharts(priceRangeJson);
			} else {
				toastr.success("error");
			}
		}
	});
}
function initTable(tableTitle) {
	// 先销毁表格
    $('#priceRangeLeft').bootstrapTable('destroy');
	// 初始化表格,动态从服务器加载数据
	$("#priceRangeLeft").bootstrapTable({
		method : "post", // 使用get请求到服务器获取数据
		contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		url : "/salesAnalysis/getStroeList.do", // 获取数据的Servlet地址
		striped : false, // 表格显示条纹
		pagination : false, // 启动分页
		pageSize : 15, // 每页显示的记录数
		pageNumber : 1, // 当前第几页
		pageList : [ 2, 10, 25, 50, 100 ], // 记录数可选列表
		search : false, // 是否启用查询
		showColumns : false, // 显示下拉框勾选要显示的列
		showRefresh : false, // 显示刷新按钮
		showExport : false,
		clickToSelect : true, //点击选中行
		paginationPreText : 'PreText',
		paginationNextText : 'NextText',
		paginationDetailHAlign : 'left',
		sidePagination : "server", // 表示服务端请求
		exportDataType : "all",
		// 设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder
		// 设置为limit可以获取limit, offset, search, sort, order
		queryParamsType : "undefined",
		columns : tableTitle,
		onClickCell : function(field, vaslue, row, $element) {
			getpriceRangeData(row.priceRange);
			return false;
		},
		queryParams : function queryParams(param) { // 设置查询参数
			param = {
				"beginStr" : beginStr,
				"endStr" : endStr,
			};
			return param;

		},
	});
}
//第六屏幕

function getStoreCompare(){
	//当前登录的用户店铺所在的部门
	getSaleCateByShop("#querySaleCate",-1);
	autoCompletion("#queryStore",$("#querySaleCate").val());
	getStoreConptarChare();
}
//根据部门查询店铺
function autoCompletion(id,queryId) {
	$.ajax({
		url : "/storeManage/getShopBeanByDepartMent.do",
		type : "post",
		data : {
			"scId" :queryId
		},
		dataType : "json",
		success : function(data
				, status) {
			var storenames=[];
			$.each(data, function(i, value) {
				var name = decodeURI(value.namePlat);
				storenames.push(name);
			});
			$(id).typeahead({
				source : function(query, process) {
					return storenames;
				},
				updater: function(item) {
					getStoreConptarChare();
					return item;
				}
			});	
		}
	});
}
//店铺拍比较视图
function getStoreConptarChare(){
	storeComparisonJson.series[1].data = [];

	if (dateType == "DAY") {
		unit = 1000;
		unitE = 'K';
		storeComparisonJson.series[0].tooltip.valueSuffix = 'K';
		storeComparisonJson.series[1].tooltip.valueSuffix = 'K';

	} else {
		unit = 1000000;
		unitE = 'M';
		storeComparisonJson.series[1].tooltip.valueSuffix = 'M';
		storeComparisonJson.series[0].tooltip.valueSuffix = 'M';
	}

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
						toastr.success(response);
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
					//storeComparisonJson.yAxis[0].plotLines[0].value = gmvAve;
					// 求和金额
					var gmvSum = getArraySum(gmvs);
					// 数量
					var atvSum = getArraySum(atvs);
					if (categories.length > 60) {
						storeComparisonJson.xAxis[0].tickInterval = 6;
					} else if (categories.length > 30) {
						storeComparisonJson.xAxis[0].tickInterval = 3;
					} else if (categories.length > 15) {
						storeComparisonJson.xAxis[0].tickInterval = 2;
					}else {
						storeComparisonJson.xAxis[0].tickInterval = 1;
					}
					storeComparisonJson.xAxis[0].categories = categories;
					storeComparisonJson.series[0].data = gmvs;
					
					$("#storeGmvTotal").html(
							formatNum(Number(gmvSum).toFixed(0))=="NaN"?0:formatNum(Number(gmvSum).toFixed(0))
							);
						if($("#queryStore").val()){
							storeComparisonJson.series[1].name = $("#queryStore").val();
							$.post("/salesAnalysis/storeSale.do", {
								"dateType" : dateType,
								"beginStr" : beginStr,
								"endStr" : endStr,
								"store":$("#queryStore").val()
							},function(data) {
								if (data) {
									try {
										var obj = eval('(' + data + ')');
									} catch (e) {
										var response = decodeURI(data);
										toastr.success(response);
										return;
									}
									var obj = eval('(' + data + ')');
									var treeSet2 = obj.treeSet;
									var gmvs2 = [];
									// redis取出数据
									$.each(treeSet2,
											function(i, value) {
												// gmv
												var gmv2 = value.gmv;
												var viewGmv = eval('(' + (gmv2).toFixed(0)
														+ ')');
												gmvs2.push(viewGmv);
									});
									var gmvSum2= getArraySum(gmvs2);
									$("#storeComparisonTotal").html(
											formatNum(Number(gmvSum2).toFixed(0))=="NaN"?0:formatNum(Number(gmvSum2).toFixed(0))
										);
									storeComparisonJson.series[1].data = gmvs2;
									$("#storeComparison").highcharts(storeComparisonJson);

								}
							});
						}else{
							$("#storeComparison").highcharts(storeComparisonJson);
						}
						console.log(storeComparisonJson);
				}
			});


	
}