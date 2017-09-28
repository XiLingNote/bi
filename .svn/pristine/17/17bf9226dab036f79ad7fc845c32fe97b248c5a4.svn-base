<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="/page/left.do"></jsp:include>
<html lang="en">
<head>
<title>template</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.min.css">
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
	
</script>
</head>
<body>
	<div class="page">
		<!-- 查询列表 -->
		<form class="queryCriteria" action="" method="post">

			<div class="queryCriteriaDiv">
				<div class="dateType">
					&nbsp; <input type="radio" name="datetype" value="YEAR" />&nbsp;YEAR
					&nbsp;&nbsp;<input type="radio" name="datetype" value="MONTH" />
					MONTH&nbsp;&nbsp; <input type="radio" name="datetype" value="DAY" />
					DAY
				</div>
				<div class="dateRemind">
					<span class="dateView">请选择起止日期：</span>
				</div>
				<div class="date">
					<div class="dateView" id="s1" hidden="true">
						<input class="begin" name="begin" readonly="readonly"
							style="float: left" />
						<div
							style="position: relative; width: 10%; float: left; height: 50%; bottom: 10%">
							<hr
								style="height: 1px; border: none; border-top: 1px double #000000;" />
						</div>
						<input class="end" name="end" readonly="readonly"
							style="float: left" />
					</div>

					<div class="dateView" id="s2" hidden="true">
						<input class="begin" name="begin" readonly="readonly"
							style="float: left" />
						<div
							style="position: relative; width: 10%; float: left; height: 50%; bottom: 10%">
							<hr
								style="height: 1px; border: none; border-top: 1px double #000000;" />
						</div>
						<input class="end" name="end" readonly="readonly"
							style="float: left" />
					</div>

					<div class="dateView" id="s3">
						<input class="begin" name="begin" readonly="readonly"
							style="float: left" />
						<div
							style="position: relative; width: 10%; float: left; height: 50%; bottom: 10%">
							<hr
								style="height: 1px; border: none; border-top: 1px double #000000;" />
						</div>
						<input class="end" name="end" readonly="readonly"
							style="float: left" />
					</div>
				</div>
				<div class="dateRemind">
					<span class="dateView">department：</span>
				</div>
				<select class="department">
					<option value="All">All</option>
					<option value="Bag">Bag</option>
					<option value="Shoes">Shoes</option>
					<option value="Dress">Dress</option>
					<option value="TMhk">TMhk</option>
					<option value="ACC">ACC</option>
				</select>
				<div class="dateRemind">
					<span class="dateView">amountType：</span>
				</div>
				<select class="amountType">
					<option value="GMV">GMV</option>
					<option value="Alipay">Alipay</option>
				</select> <input class="query" type="button" value="查询" />
			</div>

		</form>

		<!-- view列表 -->
		<div class="view">
			<div class="left"></div>
			<div class="report"
				style="position: relative; background-color: black; width: 80%; height: 100%; float: right"></div>
		</div>
	</div>
</body>
</html>