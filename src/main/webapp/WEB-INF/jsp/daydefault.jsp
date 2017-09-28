<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>index</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<link rel="stylesheet"
	href="/css/bootstrap/bootstrap-datetimepicker.min.css">
<jsp:include page="/page/left.do"></jsp:include>
<link rel="stylesheet" href="/css/bi.css">
<script src="/js/jquery-1.8.3.min.js"></script>
<script src="/js/bootstrap/bootstrap.min.js"></script>
<script src="/js/bootstrap/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="/js/bootstrap/bootstrap-datetimepicker.js"></script>
<script type="text/javascript">
	/*js全局参数*/
	var beginStr;
	var endStr;
	/* datetimepicker时间 默认样式 */
	var dateOption = {
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		minView : 2,
		language : 'zh-CN',
		format : 'dd/MM/yyyy'
	/* clearBtn : true  清空按钮    带有默认日期 清空按钮不用*/
	}

	/* 如果需要查询按钮触发查询效果，所有事件中不用调用本方法 */
	function getDate() {
		/* beginStr，endStr：yyyy/mm/dd */
		alert("beginStr:" + beginStr + ",endStr:" + endStr);
	}

	function dafault() {
		// 天 ,月 ,年:日期准备
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
	}

	$(function() {
		/* 日日期选项 */
		dateOption.minView = 2;
		dateOption.startView = 2;
		dateOption.format = "yyyy/MM/dd";
		$('#s3>input[name = begin ]').datetimepicker(dateOption);
		$('#s3>input[name = end ]').datetimepicker(dateOption);

		// 天 ,月 ,年:日期准备
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

		// 后台数据
		$('#s3>input[name = begin ]').change(function() {
			beginStr = this.value;
			getDate();
		});
		$('#s3>input[name = end ]').change(function() {
			endStr = this.value;
			getDate();
		});
		/* 查询按钮触发时间  */
		$('.query').click(function() {
			getDate();
		});
	});
</script>
</head>
<body>
	<div class="page">
		<!-- 查询列表 -->
		<form class="queryCriteria" action="" method="post">
			<div class="queryCriteriaDiv">

				<div class="dateRemind">
					<span class="remind">date：</span>

				</div>
				<div class="date">
					<div class="dateView" id="s3">
						<input class="begin form-control" name="begin" readonly="readonly"
							style="float: left" />
						<div
							style="position: relative; width: 36px; top: 20%; float: left; text-align: center">
							to</div>
						<input class="end form-control" name="end" readonly="readonly"
							style="float: left" />
					</div>
				</div>
				<input class="query form-control" type="button" value="search" />
			</div>

		</form>
		<!-- view列表 -->
		<div class="view"></div>
	</div>
</body>
</html>