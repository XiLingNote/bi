var unit = 1000;
	var unitE = 'K';
	var beginStr;
	var endStr;
	var dateType='DAY';
	var store;
	
	var b = true;
	var time = 10000;
//左侧销售量
	var json = {
		chart : {
			zoomType : 'xy'
		},
		title : {
			text : ''
		},
		subtitle : {
			text : ''
		},
		xAxis : [ {
			categories : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
					'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ],
			crosshair : true,
			tickInterval : 0
		} ],
		yAxis : [ { // Primary yAxis
			labels : {
				formatter : function() {
					return this.value / unit + unitE;
				},
				style : {
					color : "#707073"
				}
			},
			
			plotLines:[{
				color:'#707073',           //线的颜色，定义为红色
				dashStyle:'longdash',     //默认值，这里定义为实线solid
				value:0,               //定义在那个值上显示标示线，这里是在x轴上刻度为3的值处垂直化一条线
				width:1                //标示线的宽度，2px
			}],
			//网格线
			gridLineWidth: 0.1,
			title : {
				text : 'GMV',
				style : {
					color : "#707073"
				}
			}
		} ],
		legend:{
			enabled :false
		},
		tooltip : {
			shared : true,
			style : { // 提示框内容的样式
				color : 'pink',
				padding : '10px', // 内边距 (这个会常用到)
				fontSize : '9pt'
			} ,
			formatter : function() {
				var s = '<b style="float:right;color:#ffffff" >' + this.x + '</b>';
				$.each(
						this.points,
						function(i, value) {
							var _value = value.y;
							if (i != 4) {
								if (dateType == "MONTH") {
									_value = _value / unit;
									_value = _value.toFixed(1);
									_value = formatNum(_value);
								} else {
									_value = _value / unit;
									_value = _value.toFixed(0);
									_value = formatNum(_value);
								}
							}
							s += '<br/>'
									+ '<span style="float:right;color:'
					+ value.series.color + '">'
									+ value.series.name
									+ ' : </span>'
									+ '<span style="float:left;color:'
					+ value.series.color + '">'
									+ _value
									+ value.series.tooltipOptions.valueSuffix
									+ '</span>';
						});
				return s;
			} 
		},
		/* legend : {
			layout : 'vertical',
			align : 'left',
			x : 0,
			verticalAlign : 'top',
			y : 0,
			floating : true,
			backgroundColor : (Highcharts.theme && Highcharts.theme.legendBackgroundColor)
					|| '#FFFFFF'
		}, */
		plotOptions : {
			areaspline : {
				marker : {
					enabled : false,
					symbol : 'circle',
					radius : 2,
					states : {
						hover : {
							enabled : true
						}
					}
				}
			},
			spline : {
				marker : {
					enabled : false,
					symbol : 'circle',
					radius : 2,
					states : {
						hover : {
							enabled : true
						}
					}
				}
			}
		},
		series : [ {
			name : 'GMV',
			type : 'spline',
			color : '#FF9933',
			data : [],
			tooltip : {
				valueSuffix : ''
			}
		}]
	};
	//客单量曲线
	var atvjson = {
			chart : {
				zoomType : 'xy'
			},
			title : {
				text : ''
			},
			subtitle : {
				text : ''
			},
			xAxis : [ {
				categories : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
						'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ],
				crosshair : true,
				tickInterval : 0
			} ],
			yAxis : [ { // Primary yAxis
				labels : {
					style : {
						color : "#707073"
					}
				},
				
				plotLines:[{
					color:'#707073',           //线的颜色，定义为红色
					dashStyle:'longdash',     //默认值，这里定义为实线solid
					width:1                //标示线的宽度，2px
				}],
				//网格线
				gridLineWidth: 0.1,
				title : {
					text : 'ATV',
					style : {
						color : "#707073"
					}
				}
			} ],
			legend:{
				enabled :false
			},
			tooltip : {
				shared : true,
				style : { // 提示框内容的样式
					color : '#ffffff',
					padding : '10px', // 内边距 (这个会常用到)
					fontSize : '9pt'
				} ,
				formatter : function() {
					var s = '<b>' + this.x + '</b>';
					$.each(
							this.points,
							function(i, value) {
								var _value = value.y;
								s += '<br/>'
										+ '<span style="float:right;color:'
						+ value.series.color + '">'
										+ value.series.name
										+ ' : </span>'
										+ '<span style="float:left;color:'
						+ value.series.color + '">'
										+ _value
										+ value.series.tooltipOptions.valueSuffix
										+ '</span>';
							});
					return s;
				} 
			},
			/* legend : {
				layout : 'vertical',
				align : 'left',
				x : 0,
				verticalAlign : 'top',
				y : 0,
				floating : true,
				backgroundColor : (Highcharts.theme && Highcharts.theme.legendBackgroundColor)
						|| '#FFFFFF'
			}, */
			plotOptions : {
				areaspline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				},
				spline : {
					marker : {
						enabled : false,
						symbol : 'circle',
						radius : 2,
						states : {
							hover : {
								enabled : true
							}
						}
					}
				}
			},
			series : [ {
				name : 'ATV',
				type : 'spline',
				color : '#FF9933',
				tooltip : {
					valueSuffix : ''
				}
			}]
		};
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
		
		$("#ShopSales").attr("class", "nav nav-second-level in");
		$("#leftStoresales").css("background", "#578EBE");
		
		//	pandora潘多拉官方旗舰店
		var datetype = $("input[name='datetype']:checked").val();
		$("input[name='datetype']:last").attr("checked", true);
		//	json.series[1].tooltip.valueSuffix = 'k';
		//	json.series[2].tooltip.valueSuffix = 'k';
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
		var _beginYMD = _dayBeginYear + "/" + _dayMonthBegin + "/"
				+ _dayDayBegin;

		// 月:开始日期格式化
		var monthBeginMonth = monthBegin.getMonth();
		var _monthBeginMonth = (monthBeginMonth > 8) ? (monthBeginMonth + 1)
				: "0" + (monthBeginMonth + 1);
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
		/*年日期选项   */
		options.minView = 4;
		options.startView = 4;
		options.format = "yyyy";
		$('#s1>input[name = begin ]').datetimepicker(options);
		$('#s1>input[name = end ]').datetimepicker(options);
		/*月日期选项   */
		options.minView = 3;
		options.startView = 3;
		options.format = "yyyy/MM";
		$('#s2>input[name = begin ]').datetimepicker(options);
		$('#s2>input[name = end ]').datetimepicker(options);
		/*日日期选项   */
		options.minView = 2;
		options.startView = 2;
		options.format = "yyyy/MM/dd";
		$('#s3>input[name = begin ]').datetimepicker(options);
		$('#s3>input[name = end ]').datetimepicker(options);

		// 后台数据
		$('#s3>input[name = begin ]').change(function() {
			beginStr = this.value;
			 getDataByChange()

		});
		$('#s3>input[name = end ]').change(function() {
			endStr = this.value;
			 getDataByChange()
		});

		$('#s2>input[name = begin ]').change(function() {
			beginStr = this.value + "/01";
			 getDataByChange()

		});
		$('#s2>input[name = end ]').change(function() {
			endStr = this.value + "/01";
			 getDataByChange()

		});

		$('#s1>input[name = begin ]').change(function() {
			beginStr = this.value + '/01/01';
			 getDataByChange()

		});

		$('#s1>input[name = end ]').change(function() {
			endStr = this.value + '/01/01';
			 getDataByChange()

		});

		$("input[name='datetype']").change(function() {
			 getDataByChange()
		});
		

			$('#dowebok').fullpage({
				//背景色
				sectionsColor: ['', '#4BBFC3', '', '',"",'#4BBFC3', '#7BAABE', '#f90',],
				//滚动回调函数 
				onLeave: function(index, nextIndex, direction){
					//刷新将要到达的页面的数据
					switch (nextIndex) {
					case 1:
						getData();
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						getDiscountData();
						break;
					case 6:
						break;
					case 7:
						break;
					case 8:
						break;

					default:
						break;
					}
				 },
				 anchors: ['page1', 'page2', 'page3', 'page4','page5', 'page6', 'page7', 'page8'],
				 menu: '#fullPage-nav',
				 showActiveTooltip:true,
				 keyboardScrolling:true,
			});
		      d3.select(self.frameElement).style("height", "700px");
		      d3.select(self.frameElement).style("height", "700px");

	});
	//查询条件改变时更改变化
	function getDataByChange(){
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
		getData();
	}
	//求平均值
	function getAve(array){
	    var ave=0;
	    for(var i=0;i<array.length;i++){
	        ave=ave+array[i];
	    }
	    if(i>0)ave/=i;
	    return ave;
	}
	//求和数组
	function getArraySum(array){
	    var sum=0;
	    for(var i=0;i<array.length;i++){
	    	sum=sum+array[i];
	    }
	    return sum;
	}
	//获取更改json
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
		
		
		$.post("/store/storeSale.do", {
			"dateType" : dateType,
			"beginStr" : beginStr,
			"endStr" : endStr,
		}, function(data) {
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
				//redis取出数据
				$.each(treeSet,
						function(i, value) {
							totalGmv = totalGmv + value.gmv;
							totalTarget = totalTarget + value.target;
							totalAlipay = totalAlipay + value.alipay;
							//gmv
							var gmv = value.gmv;
							var viewGmv = eval('(' + (value.gmv).toFixed(0)
									+ ')');
							gmvs.push(viewGmv);
							//atv
							var atvForOne = eval('('
									+ (value.orderNum!=0?value.gmv/value.orderNum:0).toFixed(0) + ')');
							
							atvs.push(atvForOne);
							categories.push(value.datetime);
						});
				//求平均值
				var gmvAve=getAve(gmvs);
				json.yAxis[0].plotLines[0].value = gmvAve;
				var atvAve=getAve(atvs)
				atvjson.yAxis[0].plotLines[0].value=atvAve;
				//求和金额
				var gmvSum=getArraySum(gmvs);
				//数量
				var atvSum=getArraySum(atvs);
				$("#numsValue").text(formatNum(atvSum));
				$("#gmvValue").text(formatNum(gmvSum));
				$("#atvValue").text(atvSum==0?0:(gmvSum/atvSum).toFixed(2));
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
				$("#viewBottomDiscount").highcharts(discount);
				if (totalTarget) {
					totalCplR = (totalGmv / totalTarget * 100).toFixed(2);
				} else {
					totalCplR = 0;
				}
				//gmv alipay target cpl
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
	
	//获取更改json
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
		
		alert(beginStr)
			alert(endStr)
		$.post("/store/storePromotion.do", {
			"dateType" : dateType,
			"beginStr" : beginStr,
			"endStr" : endStr,
		}, function(data) {
			console.log(data);
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
				//redis取出数据
				$.each(treeSet,
						function(i, value) {
							totalGmv = totalGmv + value.gmv;
							totalTarget = totalTarget + value.target;
							totalAlipay = totalAlipay + value.alipay;
							//gmv
							var gmv = value.gmv;
							var viewGmv = eval('(' + (value.gmv).toFixed(0)
									+ ')');
							gmvs.push(viewGmv);
							//atv
							var atvForOne = eval('('
									+ (value.orderNum!=0?value.gmv/value.orderNum:0).toFixed(0) + ')');
							
							atvs.push(atvForOne);
							categories.push(value.datetime);
						});
				//求平均值
				var gmvAve=getAve(gmvs);
				json.yAxis[0].plotLines[0].value = gmvAve;
				var atvAve=getAve(atvs)
				atvjson.yAxis[0].plotLines[0].value=atvAve;
				//求和金额
				var gmvSum=getArraySum(gmvs);
				//数量
				var atvSum=getArraySum(atvs);
				$("#numsValue").text(formatNum(atvSum));
				$("#gmvValue").text(formatNum(gmvSum));
				$("#atvValue").text(atvSum==0?0:(gmvSum/atvSum).toFixed(2));
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
				$("#viewBottomDiscount").highcharts(discount);
				if (totalTarget) {
					totalCplR = (totalGmv / totalTarget * 100).toFixed(2);
				} else {
					totalCplR = 0;
				}
				//gmv alipay target cpl
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