<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="/page/left.do"></jsp:include>
<html lang="en">
<head>
<title>saleContribution</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<link rel="stylesheet"
	href="/css/bootstrap/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="/css/bi.css">
<script src="/js/jquery-1.12.3.js"></script>
<script src="/js/highcharts.js"></script>
<script src="/js/style.js"></script>
<script src="/js/scientific.js"></script>
<script src="/js/bootstrap/bootstrap.min.js"></script>
<script src="/js/bootstrap/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="/js/bootstrap/bootstrap-datetimepicker.js"></script>
<script src="/js/Highchartstheme.js"></script>
<script>
	var option = {
		title : {
			text : 'Sale Contribution'
		},
		xAxis : {
			categories : [ '201701', '201702', '201703', '201704', '201705',
					'201706' ]
		},
		yAxis : {
			min : 0,
			title : {
				text : 'Amount'
			},
			stackLabels : {
				enabled : true,
				formatter : function() {
					pie(this.x);
					return this.total;
				},
				style : {
					fontWeight : 'bold',
					color : (Highcharts.theme && Highcharts.theme.textColor)
							|| 'gray'
				}
			}
		},
		tooltip : {
			formatter : function() {
				//		pie(this.point.x);
				return '<b>' + this.x + '</b><br/>' + this.series.name + ': '
						+ this.y + '<br/>' + '总量: ' + this.point.stackTotal;
			}
		},
		plotOptions : {
			column : {
				stacking : 'normal',
				dataLabels : {
					enabled : true,
					color : (Highcharts.theme && Highcharts.theme.dataLabelsColor)
							|| 'white',
					style : {
						textShadow : '0 0 3px black'
					}
				}
			},
			series : {
				events : {
					click : function() {
						alert(this.x);
						//pie(this.index);
					}
				}
			}
		},
		series : [ {
			type : 'column',
			name : '配件',
			color : '#a4a4a4',
			data : [ 3, 4, 4, 2, 5, 8 ]
		}, {
			type : 'column',
			name : '欧美腕表',
			color : '#616161',
			data : [ 3, 4, 4, 2, 5, 7 ]
		}, {
			type : 'column',
			name : '日韩腕表',
			color : '#515151',
			data : [ 3, 4, 4, 2, 5, 6 ]
		}, {
			type : 'column',
			name : '瑞士腕表',
			color : '#414141',
			data : [ 3, 4, 4, 2, 5, 8 ]
		}, {
			type : 'column',
			name : '国产腕表',
			color : '#303030',
			data : [ 3, 4, 4, 2, 5, 9 ]
		} ]
	};

	var pieOption = {
		chart : {
			plotBackgroundColor : null,
			plotBorderWidth : null,
			plotShadow : false
		},
		title : {
			text : '2014 某网站各浏览器浏览量占比'
		},
		tooltip : {
			headerFormat : '{series.name}<br>',
			pointFormat : '{point.name}: <b>{point.percentage:.1f}%</b>'
		},
		plotOptions : {
			pie : {
				allowPointSelect : true,
				cursor : 'pointer',
				dataLabels : {
					enabled : true,
					format : '<b>{point.name}</b>: {point.percentage:.1f} %',
					style : {
						color : (Highcharts.theme && Highcharts.theme.contrastTextColor)
								|| 'black'
					}
				}
			}
		},
		series : [ {
			type : 'pie',
			name : '浏览器访问量占比',
			data : []
		} ]
	}

	function pie(num) {
		var _series = option.series;
		pieOption.series[0].data.length = 0;
		$.each(_series, function(name, value) {
			var _pieData = {
				name : '国产腕表',
				color : '#303030',
				y : 12
			}
			_pieData.name = value.name;
			_pieData.color = value.color;
			_pieData.y = value.data[num];
			pieOption.series[0].data.push(_pieData);
		});
		$('.pie').highcharts(pieOption);
	}

	$(function() {
		$('.report').highcharts(option);
	});
</script>
</head>
<body>
	<div class="page">
		<!-- 查询列表 -->
		<form class="queryCriteria" action="" method="post">

			<div class="queryCriteriaDiv">
				<div class="dateType">
					<input type="radio" name="datetype" value="YEAR" />YEAR
					&nbsp;&nbsp;<input type="radio" name="datetype" value="MONTH" />
					MONTH&nbsp;&nbsp; <input type="radio" name="datetype" value="DAY" />
					DAY
				</div>
				<div class="dateRemind">
					<span class="dateView">date：</span>
				</div>
				<div class="date">
					<div class="dateView" id="s1" hidden="true">
						<input class="begin form-control" name="begin" readonly="readonly"
							style="float: left" />
						<div
							style="position: relative; width: 12%; top: 20%; float: left; height: 50%; text-align: center">
							to</div>
						<input class="end form-control" name="end" readonly="readonly"
							style="float: left" />
					</div>

					<div class="dateView" id="s2" hidden="true">
						<input class="begin form-control" name="begin" readonly="readonly"
							style="float: left" />
						<div
							style="position: relative; width: 12%; top: 20%; float: left; height: 50%; text-align: center">
							to</div>
						<input class="end form-control" name="end" readonly="readonly"
							style="float: left" />
					</div>

					<div class="dateView" id="s3">
						<input class="begin form-control" name="begin" readonly="readonly"
							style="float: left" />
						<div
							style="position: relative; width: 12%; top: 20%; float: left; height: 50%; text-align: center">
							to</div>
						<input class="end form-control" name="end" readonly="readonly"
							style="float: left" />
					</div>
				</div>
				<div class="categoryRemind">
					<span class="dateView">category：</span>
				</div>
				<select class="department form-control">
					<option value="All">All</option>
					<option value="Bag">Bag</option>
					<option value="Shoes">Shoes</option>
					<option value="Dress">Dress</option>
					<option value="TMhk">TMhk</option>
					<option value="ACC">ACC</option>
				</select> </select> <input class="query form-control" type="button" value="query" />
			</div>

		</form>

		<!-- view列表 -->
		<div class="view">
			<div class="saleContributionLeft">
				<div style="position: relative; width: 100%; height: 40%"></div>
				<div class="pie"
					style="position: relative; width: 100%; height: 60%"></div>
			</div>
			<div class="report"
				style="position: relative; background-color: black; width: 70%; height: 100%; float: left"></div>
		</div>
	</div>
</body>
</html>