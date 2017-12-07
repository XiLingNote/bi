<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="en">
<head>
<title>index</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<link rel="stylesheet"
	href="/css/bootstrap/bootstrap-datetimepicker.min.css">
<jsp:include page="/page/left.do"></jsp:include>
<link rel="stylesheet" href="/css/bi.css">
<link rel="stylesheet" href="/css/salesAnalysis/overAll.css">
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
			<div class="queryCriteriaDiv">
				<!--  -->
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
				<!-- <button id="query" type="button" class=" query  btn btn-default">
					Search</button> -->
			</div>
		</form>

		<!-- view列表 -->
		<div class="view">
			<!-- 全屏效果 -->
			<div id="dowebok">
				<!-- 第一屏 -->
				<div class="section">
					<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">overAll</span>

					</div>
					<div class="viewTop">
						<div class="viewTopFont">
							<div class="viewTopFontTop">GMV</div>
							<div class="viewTopFontBottom" id="gmvValue">1234</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">Nums</div>
							<div class="viewTopFontBottom" id="numsValue">123</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">ATV</div>
							<div class="viewTopFontBottom" id="atvValue">1234</div>
						</div>
					</div>
					<div class="viewBottom">
						<div class="viewBottomLeft" id="viewBottomLeft"></div>
						<div class="viewBottomRight" id="viewBottomRight"></div>
					</div>
				</div>
				<!-- 第二屏幕 -->
				<div class="section">
					<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder"> Provence/City</span>
					</div>
					<div id="container" style="height: 450px;"></div>
				</div>
				<!-- 第三屏幕 -->
				<div class="section">
					<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">PC Traffic source</span>
					</div>
					<div id="skills">
						<div id="skillmap">
							<div class="skills-wrapper" style="background: #ffffff">
								<div class="skills-sunburst"></div>
								<div class="skills-chart">
									<div id="skills-chart-breadcrumb"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- 第四屏幕 -->
				<div class="section">
					<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">WirelessTrafficSource</span>
					</div>
					<div id="skills">
						<div id="skillmap">
							<div class="skills-wrapper" style="background: #ffffff">
								<div class="skills-sunburst"></div>
								<div class="skills-chart">
									<div id="skills-chart-breadcrumb"></div>
								</div>
							</div>
						</div>
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
							<div class="viewTopFontBottom" id="discountTotal">1234</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">实付金额</div>
							<div class="viewTopFontBottom" id="discountPayment">123</div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">折扣率</div>
							<div class="viewTopFontBottom" id="discountValue">1234</div>
						</div>
					</div>
					<div class="viewBottom">
						<div class="viewBottomBottom" id="viewBottomDiscount"></div>
					</div>
				</div>
				<!-- 第六屏幕 -->
				<div class="section">
				<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">PriceRange</span>
					</div>
				<div class="viewPriceBottom">
						<div class="viewBottomLeft" id="priceRangeLeft"></div>
						<div class="viewBottomRight" id="priceRangeRight"></div>
					</div>
				</div>
				<!--第七屏幕  -->
				<div class="section">
				<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">FundsFlow</span>
					</div>
				<div class="viewPriceBottom">
					</div>
				</div>
				<!--第八屏幕  -->
				<div class="section">
				<div class="viewHeader">
						<span class="viewHeaderFont"></span> <span
							class="viewHeaderFontBorder">StoreCompare</span>
								<span class=""style="float: right"  >
								<select class="form-control queryConditions" name="departmentId"
					id="querySaleCate" style="float: left" ></select> 
						<input  id="queryStore" class=" form-control"
							style="float: left" />
							</span>
					</div>
					<div class="viewTop">
						<div class="viewTopFont">
							<div class="viewTopFontTop">店铺销售额</div>
							<div class="viewTopFontBottom" id="storeGmvTotal"></div>
						</div>
						<div class="viewTopFont">
							<div class="viewTopFontTop">对比店铺销售额</div>
							<div class="viewTopFontBottom" id="storeComparisonTotal"></div>
						</div>
					</div>
					<div class="viewBottom">
						<div class="viewBottomBottom" id="storeComparison"></div>
					</div>
					</div>
				</div>
				<!-- 导航 -->
				<div id="fullPage-nav" class="right"
					style="color: rgb(0, 0, 0); margin-top: -43.5px;">
					<ul>
						<li data-menuanchor="page1" class="active"><a href="#page1"><span></span></a></li>
						<li data-menuanchor="page2"><a href="#page2"><span></span></a></li>
						<li data-menuanchor="page3"><a href="#page3"><span></span></a></li>
						<li data-menuanchor="page4"><a href="#page4"><span></span></a></li>
						<li data-menuanchor="page5"><a href="#page5"><span></span></a></li>
						<li data-menuanchor="page6"><a href="#page6"><span></span></a></li>
						<li data-menuanchor="page7"><a href="#page7"><span></span></a></li>
						<li data-menuanchor="page8"><a href="#page8"><span></span></a></li>
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
	<script src="/js/salesAnalysis/trafficSource/d3.v3.js"></script>
	<script src="/js/salesAnalysis/trafficSource/skillsdata.js"></script>
	<script src="/js/salesAnalysis/trafficSource/skill.js"></script>
	<script src="/js/salesAnalysis/optionJson.js"></script>
	<script src="/js/salesAnalysis/overAll.js"></script>
	<script src="/js/localTableTitle.js"></script>
	<script src="/js/bootstrap/bootstrap-table.js"></script>
		<script src="<%=basePath%>/js/bootstrap/bootstrap-typeahead.js"></script>
	<!-- 	<script src="/js/salesAnalysis/chinaMap.js"></script>
 -->


</body>
</html>