<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html lang="en">
<head>
<title>index</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<link rel="stylesheet"
	href="/css/bootstrap/bootstrap-datetimepicker.min.css">
<jsp:include page="/page/left.do"></jsp:include>
<link rel="stylesheet" href="/css/bi.css">
<link rel="stylesheet" href="/css/salesAnalysis/overAll.css">
<link rel="stylesheet" href="/css/salesAnalysis/storeSalesDemonstrate.css">
<!--  全屏插件-->
<link rel="stylesheet" href="/css/salesAnalysis/jquery.fullPage.css">
<!-- <link rel="stylesheet"
	href="/css/salesAnalysis//trafficSource/skill.css"> -->

<style type="text/css">
</style>
</head>
<body>
	<div class="page">
		<!-- 查询列表 -->
		<form class="queryCriteria queryAllHeader" action="" method="post">
			<!-- 	
			<div class="queryCriteriaDiv">
				<div class="dateType">
					<div>
						<input type="radio" name="datetype" value="YEAR" />YEAR
						&nbsp;&nbsp;<input type="radio" name="datetype" value="MONTH" />
						MONTH&nbsp;&nbsp; <input type="radio" name="datetype" value="DAY" />
						DAY
					</div>
				</div>
				<div class="dateRemind">
					<span class="remind">date：</span>

				</div>
				<div class="date">
					<div class="dateView" id="s1" hidden="true">
						<input class="begin form-control" name="begin" readonly="readonly"
							style="float: left" />
						<div class="queryDateFont">to</div>
						<input class="end form-control" name="end" readonly="readonly"
							style="float: left" />
					</div>
					<div class="dateView" id="s2" hidden="true">
						<input class="begin form-control" name="begin" readonly="readonly"
							style="float: left" />
						<div class="queryDateFont">to</div>
						<input class="end form-control" name="end" readonly="readonly"
							style="float: left" />
					</div>

					<div class="dateView" id="s3">
						<input class="begin form-control" name="begin" readonly="readonly"
							style="float: left" />
						<div class="queryDateFont">to</div>
						<input class="end form-control" name="end" readonly="readonly"
							style="float: left" />
					</div>
				</div>
				<button id="query" type="button" class=" query  btn btn-default">
					Search</button>
			</div> -->
		</form>

		<!-- view列表 -->
		<div class="view">
			<!-- 全屏效果 -->
			<div id="dowebok">
				<!-- 第一屏 -->
				<div class="section">
					<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">sales</span>

					</div>
					<div class="viewTop">
						<div class="viewTopFont">
							<div class="viewTopFontTop">Yesterday</div>
							<div class="viewTopFontBottom" id="yesterdaySales">0</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">MTD_GMV</div>
							<div class="viewTopFontBottom" id="monthSales">0</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">MTD_Alipay</div>
							<div class="viewTopFontBottom" id="monthAlipay">0</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">GMV_Complection</div>
							<svg id="waterPoloLeft"  class="viewTopFontBottom" style="width: 80%"></svg>
						</div>
							<div class="viewTopFont">
							<div class="viewTopFontTop">Alipay_Complection</div>
							<svg id="waterPoloRight" class="viewTopFontBottom" style="width: 80%"></svg>
						</div>
					<!-- 	<div style='width:10%;float: right; margin-right: 10%'>
						<div class="viewTopFontTop">ATV</div>
							<div class="viewTopFontBottom" id="atvValue">1234
							<svg id="waterPoloLeft" style='height: 50%;width:50%;float: left;'></svg>
							<svg id="waterPoloRight" style='height: 50%;width:50%;float: right;'></svg>
						</div> -->
					</div>
					<div class="viewBottom">
						<div class="" id="viewBottomLeft"></div>
					</div>
				</div>
				<!-- 第五屏幕 -->
				<div class="section">
					<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">Discount</span>
					</div>
					<div class="viewTop">
						<div class="viewTopFont">
							<div class="viewTopFontTop">商品总金额</div>
							<div class="viewTopFontBottom" id="discountTotal">0</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">实付金额</div>
							<div class="viewTopFontBottom" id="discountPayment">0</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">折扣率</div>
							<div class="viewTopFontBottom" id="discountValue">0</div>
						</div>
					</div>
					<div class="viewBottom">
						<div class="viewBottomBottom" id="viewBottomDiscount"></div>
					</div>
				</div>
				<div id="fullPage-nav" class="right"
					style="color: rgb(0, 0, 0); margin-top: -43.5px;">
					<ul>
						<li data-menuanchor="page1" class="active"><a href="#page1"><span></span></a></li>
						<li data-menuanchor="page5"><a href="#page5"><span></span></a></li>
					</ul>
				</div>
			</div>

		</div>
	</div>

	<script src="/js/salesAnalysis/optionJson.js"></script>
	<script src="/js/jquery-1.8.3.min.js"></script>
	<script src="/js/util.js"></script>
	<script src="/js/bootstrap/bootstrap.min.js"></script>
	<script src="/js/bootstrap/bootstrap-datetimepicker.zh-CN.js"></script>
	<script src="/js/bootstrap/bootstrap-datetimepicker.js"></script>
	<script src="/js/highcharts2.js"></script>
	<script src="/js/Highchartstheme.js"></script>
	<script src="/js/salesAnalysis/highcharts-more.js"></script>
	<script src="/js/salesAnalysis/highcharts-more.src.js"></script>
	<script src="/js/salesAnalysis/jquery.fullPage.min.js"></script>
	<script src="/js/salesAnalysis/optionJson.js"></script>
	<script src="/js/salesAnalysis/storeSalesDemonstrate.js"></script>
	<script src="/js/localTableTitle.js"></script>
	<script src="/js/bootstrap/bootstrap-table.js"></script>
	<script src="/js/d3.v3.min.js"></script>
	<script src="/js/shuiqiu.js"></script>
	<!-- 	<script src="/js/salesAnalysis/chinaMap.js"></script>
 -->


</body>
</html>