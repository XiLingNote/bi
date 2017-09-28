<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=basePath%>css/style.css">
<script src="<%=basePath%>/js/jquery-1.8.3.min.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="<%=basePath%>/css/bootstrap/bootstrap.min.css">
	<script src="<%=basePath%>/js/alert.js"></script>
<script type="text/javascript">
	window.onload = function() {
		$('.list ul li p').clickdown();
		$('.list-se p[class=title]').clickup();
		$('.list>ul>li').ad();
	}
</script>
<style type="text/css">
.title_1 {
	color: #ffffff;
}
</style>
</head>
<body>
	<div class="list">
		<ul>
			<li>
				<p class="title" style="background: #c12e2a;">
					<a href="/page/index.do" style="color: #ffffff"> <img
						src="/img/index.png"> Sales Overall
					</a>
				</p>
			</li>

			<li class="list-see">
				<p class="title">
					<a href="/page/monthlySales.do" class='title_1'> <img
						src="/img/shopsale.png"> Shop Sales
					</a><span style="color: #ffffff; z-index: 10">+</span>
				</p>

				<ul class='list-se' style="padding-top: 10px;">
					<p class="title" style="color: #e9f2ff">
						<a href="/page/monthlySales.do">Shop Sales</a><span
							style="color: #2a6496; z-index: 10">-</span>
					</p>
					<li><p>
							<a href="/page/monthlySales.do" class='title_1'>Monthly sales</a>
						</p></li>
					<li><p>
							<a href="/page/dailySales.do" class='title_1'>Daily sales</a>
						</p></li>
					<li><p>
							<a href="/page/salesTrend.do" class='title_1'>Storesales
								Trend</a>
						</p></li>
				</ul>
			</li>

			<li class="list-see">

				<p class="title">
					<!-- /page/industry.do -->
					<a href="/page/topStore.do" class='title_1'> <img
						src="/img/marketcondition.png"> Industry Data
					</a><span style="color: #ffffff; z-index: 10">+</span>
				</p>
				<ul class='list-se' style="padding-top: 10px;">
					<p class="title" style="color: #e9f2ff">
						<a href="/page/saleContribution.do" class='title_1'>Industry
							Data</a><span style="color: #2a6496; z-index: 10">-</span>
					</p>
					<li><p>
							<a href="/page/saleContribution.do" class='title_1'>Sale
								Contribution</a>
						</p></li>
					<li><p>
							<a href="/page/topStore.do" class='title_1'>TOP Store</a>
						</p></li>
					<li><p>
							<a href="/page/topBrand.do" class='title_1'>TOP Brand</a>
						</p></li>
				</ul>
			</li>
			<li>
				<p class="title">
					<a href="店铺分析（运营）.html" class='title_1'> <img
						src="/img/shopAnalysis.png"> 店铺分析
					</a><span style="color: #ffffff; z-index: 10">+</span>
				</p>
				<ul class='list-se'>
					<p class="title" style="color: #e9f2ff">
						<a href="店铺分析（运营）.html" class='title_1'>店铺分析</a><span
							style="color: #2a6496; z-index: 10">-</span>
					</p>
					<li><p>
							<a href="店铺分析（运营）.html" class='title_1'>运营</a>
						</p></li>
					<li><p>
							<a href="粉丝.html" class='title_1'>粉丝</a>
						</p></li>
				</ul>
			</li>
			<li>
				<p class="title">
					<a href="商品分析.html" class='title_1'> <img
						src="/img/commercialAnalysis.png"> 商品分析
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="#" class='title_1'> <img src="/img/dataFilling.png">
						数据填报
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="<%=basePath%>/page/inputExcel.do" class='title_1'> <img
						src="/img/dataFilling.png"> 数据导入导出
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="../jsp/index.jsp" class='title_1'> <img
						src="/img/dataFilling.png">ceshi
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="../dstp_28_P2/index.jsp" class='title_1'> <img
						src="/img/dataFilling.png">ceshi2
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="<%=basePath%>/page/target.do" class='title_1'> <img
						src="/img/dataFilling.png"> 业绩目标
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="<%=basePath%>/page/pcFlowStructure.do" class='title_1'> <img
						src="/img/dataFilling.png"> pc流量结构
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="<%=basePath%>/page/wirelessFlowStructure.do" class='title_1'> <img
						src="/img/dataFilling.png"> 无线流量结构
					</a>
				</p>
			</li>
			<li>
				<p class="title">
					<a href="<%=basePath%>/page/fansDaily.do" class='title_1'> <img
						src="/img/dataFilling.png">粉丝日报
					</a>
				</p>
			</li>
			
		</ul>
	</div>
	 <div id="com-alert" class="modal fade" style="z-index:9999;display: none;" >  
      <div class="modal-dialog modal-sm">  
        <div class="modal-content">  
          <div class="modal-header">  
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>  
            <h5 class="modal-title"><i class="fa fa-exclamation-circle"></i> [Title]</h5>  
          </div>  
          <div class="modal-body small">  
            <p>[Message]</p>  
          </div>  
          <div class="modal-footer" >  
            <button type="button" class="btn btn-primary ok" data-dismiss="modal">[BtnOk]</button>  
            <button type="button" class="btn btn-default cancel" data-dismiss="modal">[BtnCancel]</button>  
          </div>  
        </div>  
      </div>  
    </div>  
</body>
</html>