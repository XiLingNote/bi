<%@page import="bi.baiqiu.pojo.User"%>
<%@page import="org.apache.shiro.subject.Subject"%>
<%@page import="org.apache.shiro.SecurityUtils"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("basePath", basePath);
%>
<!-- shiro标签库 -->
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="<%=basePath%>/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="<%=basePath%>/css/top.css">
<%-- <link href="<%=basePath%>/assets/css/checkbox3.min.css" rel="stylesheet" >
 --%>
<link href="<%=basePath%>css/assets/css/custom-styles.css"
	rel="stylesheet" />
<link href="<%=basePath%>css/assets/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet" href="<%=basePath%>/css/localRightTable.css">

<link rel="stylesheet" href="<%=basePath%>/css/toastr.css">

<%--     <link href="<%=basePath%>assets/css/select2.min.css" rel="stylesheet" >
 --%>
<!--        <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
 -->

</head>
<body>

	<div>
		<nav class="navbar navbar-default top-navbar" role="navigation">
			<div class="navbar-header">
				<div class="bqtop">
					<div class="logo">
						<img src="<%=basePath%>/img/logo.png">
						<p>BUY QUICKLY</p>
					</div>
					<!-- <div class="loginInformation"> -->
					<h1>
						<c:if test="${empty user.shopList}">${user.shopNamePlat}</c:if>
						${user.name} <a href="<%=basePath%>user/logout.do">logout</a>
					</h1>

					<c:if test="${not empty user.shopList}">
						<select id="shopName" name="shop">
							<c:forEach items="${user.shopList}" var="shop">
								<option value="${shop.id}">${shop.namePlat}</option>
							</c:forEach>
						</select>
					</c:if>
					<!-- </div> -->
				</div>
			</div>
		</nav>

		<!--/. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<!-- 店铺管理员 -->
					<shiro:hasAnyRoles name="admin,store_admin">
						<li><a href="<%=basePath%>user/shopadmin.do"
							id="leftStoreAdmin"><i class="fa fa-tachometer"></i> store
								admin </a></li>
					</shiro:hasAnyRoles>
					<shiro:hasRole name="admin">
						<li><a href="<%=basePath%>user/admin.do" id="leftAdmin"><i
								class="fa fa-tachometer"></i> admin </a></li>

						<li><a href="<%=basePath%>storeManage/storeView.do"
							id="storeManage"><i class="fa fa-tachometer"></i> storeManage
						</a></li>
					</shiro:hasRole>
					<!-- bi第一阶段功能 经理及以上能看 -->
					<shiro:hasAnyRoles name="admin,director">
						<%-- <li><a href="<%=basePath%>alipay/inAmount.do"
							id="leftAdmin"><i class="fa fa-tachometer"></i> alipay
						</a></li> --%>
						<li><a href="<%=basePath%>page/index.do"
							id="leftSalesOverall"><i class="fa fa-home"></i> Sales
								Overall</a></li>
						<li><a href="#" class=""><i class="fa fa-dashboard"></i>
								Shop Sales<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level" id="ShopSales">
								<li><a href="<%=basePath%>page/monthlySales.do"
									id="leftMonthlysales">Monthly sales</a></li>
								<li><a href="<%=basePath%>page/dailySales.do"
									id="leftDailysales">Daily sales</a></li>
								<li><a href="<%=basePath%>page/salesTrend.do"
									id="leftStoresales">Storesales</a></li>
							</ul></li>
						<%-- 	<li><a href="#" class=""><i class="fa fa-sitemap"></i>
								Industry Data<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>page/saleContribution.do">Sale
										Contribution</a></li>
								<li><a href="<%=basePath%>page/topStore.do">TOP Store</a></li>
								<li><a href="<%=basePath%>page/topBrand.do">TOP Brand</a></li>
							</ul></li> --%>
						<%-- 	<li><a href="#" class=""><i class="fa fa-sitemap"></i>
							Store Analysis<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="<%=basePath%>page/storeSalesDemonstrate.do">Store
									Overall</a></li>
							<li><a href="<%=basePath%>page/dailySales.do">Real Time</a>
							</li>
							<li><a href="<%=basePath%>page/salesTrend.do">Storesales</a>
							</li>
						</ul></li> --%>
					</shiro:hasAnyRoles>

					<shiro:hasAnyRoles name="admin,store_admin">
						<li><a href="#"><i class="fa   fa-upload"></i> upload
								Data<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level" id="importData">

								<!-- target权限可以看 -->
								<shiro:hasPermission name="target">
									<li><a href="<%=basePath%>/page/target.do" id="leftTarget"><i
											class="fa fa-crosshairs"></i> Target </a></li>
								</shiro:hasPermission>

								<!-- flow权限可以看 -->
								<shiro:hasPermission name="flow">
									<li><a href="#"><i class="fa  fa-signal"></i> Flow
											Structure<span class="fa arrow"></span></a>
										<ul class="nav nav-third-level" id="leftFlowStructure">
											<li><a href="<%=basePath%>/page/pcFlowStructure.do"
												id="leftPc">pc</a></li>
											<li><a
												href="<%=basePath%>/page/wirelessFlowStructure.do"
												id="leftwirless">wireless</a></li>
										</ul></li>
								</shiro:hasPermission>

								<!-- fans_data权限可以看-->
								<shiro:hasPermission name="fans_data">
									<li><a href="#"><i class="fa fa-users"></i> Fan data<span
											class="fa arrow"></span></a>
										<ul class="nav nav-third-level" id="leftfansData">
											<li><a href="<%=basePath%>/page/fansDaily.do"
												id="leftfansDaily">fansDaily</a></li>
											<li><a href="<%=basePath%>/page/fansMonthFeatures.do"
												id="leftfansMonthFeatures">fans Month Features</a></li>
											<li><a href="<%=basePath%>/page/visitorMonthFeatures.do"
												id="leftvisitorMonthFeatures">visitor Month Features</a></li>
										</ul></li>
								</shiro:hasPermission>

								<!-- pay_data权限可以看 -->
								<shiro:hasPermission name="pay_data">
									<li><a href="#"><i class="fa  fa-jpy"></i> Pay data<span
											class="fa arrow"></span></a>
										<ul class="nav nav-third-level" id="leftPayData">
											<li><a href="<%=basePath%>/page/saleProductsTreasure.do"
												id="leftSaleProductsTreasure">Sale Products Treasure</a></li>
											<li><a href="<%=basePath%>/page/drillShow.do"
												id="leftDrillShow">Drill Show </a></li>
											<li><a href="<%=basePath%>/page/througTrain.do"
												id="leftThrougTrain">Throug Train</a></li>
										</ul></li>
								</shiro:hasPermission>

								<!-- pay_data权限可以看 -->
								<shiro:hasPermission name="commodity_property">
									<li><a href="<%=basePath%>/page/commodityProperty.do"
										id="leftCommodityProperty"><i class="fa  fa-suitcase"></i>Commodity
											Property</a></li>
								</shiro:hasPermission>

							</ul></li>
					</shiro:hasAnyRoles>
					<shiro:hasAnyRoles name="admin">
						<li><a href="#"><i class="fa   fa-upload"></i> business
								TV<span class="fa arrow"></span></a>

							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>wareHouse/screen.do"
									id="leftTarget"><i class="fa fa-crosshairs"></i>wareHourdeScreen</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/Bag.do" id="leftTarget"><i
										class="fa fa-crosshairs"></i>Bag</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/Shoes.do" id="leftTarget"><i
										class="fa fa-crosshairs"></i>Shoes</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/Dress.do" id="leftTarget"><i
										class="fa fa-crosshairs"></i>Dress</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/ACC.do" id="leftTarget"><i
										class="fa fa-crosshairs"></i>ACC</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/department/Bag.do"
									id="leftTarget"><i class="fa fa-crosshairs"></i>Bag</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/department/Shoes.do"
									id="leftTarget"><i class="fa fa-crosshairs"></i>Shoes</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/department/Dress.do"
									id="leftTarget"><i class="fa fa-crosshairs"></i>Dress</a></li>
							</ul>
							<ul class="nav nav-second-level">
								<li><a href="<%=basePath%>overall/department/ACC.do"
									id="leftTarget"><i class="fa fa-crosshairs"></i>ACC</a></li>
							</ul></li>
					</shiro:hasAnyRoles>
					<shiro:hasRole name="store_sub_role">

						<!-- target权限可以看 -->
						<shiro:hasPermission name="target">
							<li><a href="<%=basePath%>/page/target.do" id="leftTarget"><i
									class="fa fa-crosshairs"></i> Target </a></li>
						</shiro:hasPermission>

						<!-- flow权限可以看 -->
						<shiro:hasPermission name="flow">
							<li><a href="#"><i class="fa  fa-signal"></i> Flow
									Structure<span class="fa arrow"></span></a>
								<ul class="nav nav-third-level" id="leftFlowStructure">
									<li><a href="<%=basePath%>/page/pcFlowStructure.do"
										id="leftPc">pc</a></li>
									<li><a href="<%=basePath%>/page/wirelessFlowStructure.do"
										id="leftwirless">wireless</a></li>
								</ul></li>
						</shiro:hasPermission>

						<!-- fans_data权限可以看-->
						<shiro:hasPermission name="fans_data">
							<li><a href="#"><i class="fa fa-users"></i> Fan data<span
									class="fa arrow"></span></a>
								<ul class="nav nav-third-level" id="leftfansData">
									<li><a href="<%=basePath%>/page/fansDaily.do"
										id="leftfansDaily">fansDaily</a></li>
									<li><a href="<%=basePath%>/page/fansMonthFeatures.do"
										id="leftfansMonthFeatures">fans Month Features</a></li>
									<li><a href="<%=basePath%>/page/visitorMonthFeatures.do"
										id="leftvisitorMonthFeatures">visitor Month Features</a></li>
								</ul></li>
						</shiro:hasPermission>

						<!-- pay_data权限可以看 -->
						<shiro:hasPermission name="pay_data">
							<li><a href="#"><i class="fa  fa-jpy"></i> Pay data<span
									class="fa arrow"></span></a>
								<ul class="nav nav-third-level" id="leftPayData">
									<li><a href="<%=basePath%>/page/saleProductsTreasure.do"
										id="leftSaleProductsTreasure">Sale Products Treasure</a></li>
									<li><a href="<%=basePath%>/page/drillShow.do"
										id="leftDrillShow">Drill Show </a></li>
									<li><a href="<%=basePath%>/page/througTrain.do"
										id="leftThrougTrain">Throug Train</a></li>
								</ul></li>
						</shiro:hasPermission>

						<!-- pay_data权限可以看 -->
						<shiro:hasPermission name="commodity_property">
							<li><a href="<%=basePath%>/page/commodityProperty.do"
								id="leftCommodityProperty"><i class="fa  fa-suitcase"></i>Commodity
									Property</a></li>
						</shiro:hasPermission>
					</shiro:hasRole>
				</ul>
			</div>

		</nav>
	</div>
	<div id="com-alert" class="modal fade"
		style="z-index: 9999; display: none;">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
					<h5 class="modal-title">
						<i class="fa fa-exclamation-circle"></i> [Title]
					</h5>
				</div>
				<div class="modal-body small">
					<p>[Message]</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary ok"
						data-dismiss="modal">[BtnOk]</button>
					<button type="button" class="btn btn-default cancel"
						data-dismiss="modal">[BtnCancel]</button>
				</div>
			</div>
		</div>
	</div>
	<script src="<%=basePath%>/js/jquery-1.8.3.min.js"></script>
	<script src="<%=basePath%>/js/bootstrap/bootstrap.min.js"></script>

	<script src="<%=basePath%>/js/alert.js"></script>
	<script src="<%=basePath%>js/jquery.metisMenu.js"></script>
	<%--     <script type="text/javascript" src="<%=basePath%>/assets/js/chart.min.js"></script>  
<%--  --%>
	<%-- <script src="<%=basePath%>/assets/js/morris/raphael-2.1.0.min.js"></script> --%>
	<script src="<%=basePath%>js/custom-scripts.js"></script>
	<script src="<%=basePath%>/js/toastr.min.js"></script>
	<%--     <script src="<%=basePath%>assets/js/morris/morris.js"></script>
	<script src="<%=basePath%>assets/js/easypiechart.js"></script>
	<script src="<%=basePath%>assets/js/easypiechart-data.js"></script>
	 <script src="<%=basePath%>assets/js/Lightweight-Chart/jquery.chart.js"></script>
    <script type="text/javascript" src="<%=basePath%>assets/js/chart.min.js"></script>  
    <script type="text/javascript" src="<%=basePath%>assets/js/chartjs.js"></script>  --%>
	<script type="text/javascript">
		/* 提示框 */
		toastr.options = {
			"closeButton" : false,
			"debug" : false,
			"newestOnTop" : true,
			"progressBar" : false,
			"positionClass" : "toast-top-right",
			"preventDuplicates" : false,
			"onclick" : null,
			"showDuration" : "300",
			"hideDuration" : "1000",
			"timeOut" : "2000",
			"extendedTimeOut" : "1000",
			"showEasing" : "swing",
			"hideEasing" : "linear",
			"showMethod" : "fadeIn",
			"hideMethod" : "fadeOut"
		}
		function goToPage() {
			$('#cusTable').bootstrapTable("selectPage",
					Number($("#toPage").val()));
		}
		$(function() {
			var _shopNamePlat = "${user.shopNamePlat}";
			var _shopId = "${user.shopId}";
			if (_shopNamePlat) {
				$("#shopName option[value =" + _shopId + "]").attr("selected",
						true);
			} else {
				alert("当前");
			}

			$('#shopName').change(function() {
				/*店铺id*/
				shopId = this.value;
				$.post("/user/changeName.do", {
					shopId : shopId
				}, function(data) {
					if ("true" == data) {
						location.reload();
					} else {
						alert(data);
					}
				});

			});

		});
	</script>
</body>
</html>