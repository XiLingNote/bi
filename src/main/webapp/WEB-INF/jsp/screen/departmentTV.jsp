<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<!-- saved from url=(0051)http://121.199.172.239/index.php/Ssale/vscgp?scid=5 -->
<html lang="zh-cmn-Hans">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<title>BQ</title>
<!-- Bootstrap core CSS -->
<link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/css/jquery.flipcountdown.css">
<link href="/css/screen/departmentTv.css" rel="stylesheet">
<!-- Custom styles for this template -->
<style type="text/css">
#think_page_trace_tab_tit {
	-webkit-box-sizing: content-box;
	-moz-box-sizing: content-box;
	box-sizing: content-box;
}
body {
	/*background: url(/Public/i/bg_unvs_1920_1080.png);*/
	/*background-color: #ffd9d9;*/
	background: url(/css/img/background.jpg);
 }

.c_div_body {
	width: 100%;
	height: 100%;
	min-height: 768px;
	font-size: 26px;
	font-family: 'SimHei', 'tahoma', 'Microsoft YaHei';
	/*
color: #f78338;
*/
	color: #ffffff;
}

.c_div_ss_11 {
	margin: 0 auto;
	padding-top: 15px;
	/*
1366
width: 1248px;
1920
*/
	width: 1224px;
	height: 666px;
	opacity: 0.8;
	/*
background: red;
*/
}

.c_div_ss_12 {
	margin: 6px;
	padding: 0 12px 0 12px;
	/*
1366
width: 300px;
1920
*/
	width: 274px;
	height: 624px;
	/*background: #0789d7;*/
	float: left;
	/*border: 2px solid #FFF;*/
	border-radius: 10px;
	/*
background: #0754B3;
*/
}

.c_div_ss_12 span {
	display: inline-block;
}

.c_div_ss_12 .c_span_cate_tt {
	padding: 20px 0 0 0;
	font-size: 32px;
	font-weight: 700;
}

.c_div_ss_12 .c_span_cate_td_in {
	padding: 10px 0 0 0;
	float: right;
	font-size: 45px;
}

.c_div_ss_12 .c_span_cate_ld_in, .c_div_ss_12 .c_span_cate_tm_in {
	float: right;
}

.c_div_ss_12 hr {
	border-width: 3px;
}

.c_div_ss_12 .c_span_smy_tt {
	padding: 10px 0 0 0;
}

.c_div_ss_12 .c_span_smy_td_in {
	float: right;
	font-size: 45px;
	padding-top: 10px;
}

.c_div_ss_12 .c_span_cate_ld, .c_div_ss_12 .c_span_cate_ld_in,
	.c_div_ss_12 .c_span_cate_tm, .c_div_ss_12 .c_span_cate_tm_in {
	font-size: 24px;
}

.c_div_ss_12 .c_span_smy_ld_in, .c_div_ss_12 .c_span_smy_tm_in {
	float: right;
}

.c_div_ss_12 .c_span_smy_ld, .c_div_ss_12 .c_span_smy_ld_in,
	.c_div_ss_12 .c_span_smy_tm, .c_div_ss_12 .c_span_smy_tm_in {
	font-size: 24px;
}

#colee {
	width: 918px;
	height: 636px;
}

#colee2 {
	width: 918px;
	height: 636px;
	float: right;
	overflow: hidden;
}

.c_div_ss_22 {
	float: left;
	/*
1366
width: 936px;
1920
*/
	width: 918px;
	height: 636px;
}

.c_div_ss_23 {
	float: left;
	margin: 6px;
	padding: 12px 6px;
	/*
1366
width: 300px;
1920
*/
	width: 294px;
	height: 200px;
	/*border: 2px solid #FFF;*/
	border-radius: 10px;
	/*
background: green;
*/
}

.c_div_ss_23 span {
	display: inline-block;
	vertical-align: top;
}

.c_div_ss_23 .c_span_list_tt {
	font-weight: 700;
}

.c_div_ss_23 .c_span_list_td_in {
	font-size: 54px;
}

.c_div_ss_23 .c_span_list_ppo, .c_div_ss_23 .c_span_list_td_in,
	.c_div_ss_23 .c_span_list_ld_in, .c_div_ss_23 .c_span_list_tm_in {
	float: right;
}

.c_div_ss_23 .c_span_list_ppo, .c_div_ss_23 .c_span_list_ld_in,
	.c_div_ss_23 .c_span_list_tm, .c_div_ss_23 .c_span_list_tm_in {
	height: 30px;
	font-size: 24px;
}

.c_div_time {
	position: relative;
	left: 78%;
	width: 300px;
}

.c_span_opening {
	font-size: 40px;
	padding: 25px 17px;
}
</style>
<script src="/js/jquery-1.12.3.js"></script>
<script src="/js/bootstrap/bootstrap.min.js"></script>
</head>
<body>
<div class="c_div_body">
		<div style="height: 715px; width: 1264px; overflow: hidden;">
			<div class="c_div_ss_11">
			
				<div class="c_div_ss_12" style="background: ${departmentName eq 'Bag'?'#ee4f55':departmentName eq 'Shoes'?'#f78338':departmentName eq 'Dress'?'#399e99':departmentName eq 'ACC'?'#08699e':'#08699e'};">
					<span class="c_span_cate_tt">${departmentData.showName}</span>
					<div class="c_g_c_b"></div>
					<span class="c_span_cate_td_in"><fmt:formatNumber  type="number" value="${departmentData.todaySale-departmentData.todaySale%1}"  maxFractionDigits="0"/></span>
					<div class="c_g_c_b"></div>
					<span class="c_span_cate_ld">昨日:</span>
					<div class="c_g_c_b"></div>
					<span class="c_span_cate_ld_in">
										<fmt:formatNumber  type="number" value="${departmentData.yesterdaySale-departmentData.yesterdaySale%1}"  maxFractionDigits="0"/></span>
					<div class="c_g_c_b"></div>
					<span class="c_span_cate_tm">本月(<fmt:formatNumber type="percent" value="${departmentData.gmvRate-departmentData.gmvRate%0.001}"  maxFractionDigits="1"/>):</span>
					<div class="c_g_c_b"></div>
					<span class="c_span_cate_tm_in">
					<fmt:formatNumber  type="number" value="${departmentData.gmv-departmentData.gmv%1}"  maxFractionDigits="0"/></span>
					<div class="c_g_c_b"></div>
					<hr class="border-top: 1px solid #08699e;">
					<span class="c_span_smy_tt">总业绩:</span>
					<div class="c_g_c_b"></div>
					<span class="c_span_smy_td_in">
					<fmt:formatNumber  type="number" value="${allDepartmentData.todaySale-allDepartmentData.todaySale%1}"  maxFractionDigits="0"/>
					</span>
					
					<div class="c_g_c_b"></div>
					<span class="c_span_smy_ld">昨日:</span>
					<div class="c_g_c_b"></div>
					<span class="c_span_smy_ld_in">
									    <fmt:formatNumber  type="number" value="${allDepartmentData.yesterdaySale-allDepartmentData.yesterdaySale%1}"  maxFractionDigits="0"/>
					</span>
					<div class="c_g_c_b"></div>
					<span class="c_span_smy_tm">本月(<fmt:formatNumber type="percent" value="${allDepartmentData.gmvRate-allDepartmentData.gmvRate%0.001}"  maxFractionDigits="1"/>):</span>
					<div class="c_g_c_b"></div>
					<span class="c_span_smy_tm_in">
				    <fmt:formatNumber  type="number" value="${allDepartmentData.gmv-allDepartmentData.gmv%1}"  maxFractionDigits="0"/>
					</span>
				</div>
				<div id="colee" style="overflow: hidden;">
					<div class="c_div_ss_22" id="colee1">
						<!-- 
                <div class="c_div_ss_23" style="background:rgba(4,44,73,0.6);border: 3px solid #08699e;">
                  <span class="c_span_list_tt_ing">PANDORA</span><div class="c_g_c_b"></div><span class="c_span_opening">opening soon</span>
                </div>
                 -->
                 						<c:forEach items="${shopBeans}" var="shop">
            
							<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid ${departmentName eq 'Bag'?'#ee4f55':departmentName eq 'Shoes'?'#f78338':departmentName eq 'Dress'?'#399e99':departmentName eq 'ACC'?'#08699e':'#08699e'};">
							<span class="c_span_list_tt">${shop.displayName}</span> <span
								class="c_span_list_ppo">
															<fmt:formatNumber  type="number" value="${shop.shopTvShowTablePojo.orderNum!=0?((shop.shopTvShowTablePojo.todaySale/shop.shopTvShowTablePojo.orderNum)-(shop.shopTvShowTablePojo.todaySale/shop.shopTvShowTablePojo.orderNum)%1):0}"  maxFractionDigits="0"/>/单</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">
														<fmt:formatNumber  type="number" value="${shop.shopTvShowTablePojo.todaySale-shop.shopTvShowTablePojo.todaySale%1}"  maxFractionDigits="0"/>
							</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_ld_in">
							<fmt:formatNumber  type="number" value="${shop.shopTvShowTablePojo.yesterdaySale-shop.shopTvShowTablePojo.yesterdaySale%1}"  maxFractionDigits="0"/>
							</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_tm">本月(<fmt:formatNumber type="percent" value="${shop.shopTvShowTablePojo.gmvRate}"  maxFractionDigits="0"/>):</span> <span
								class="c_span_list_tm_in">
								<fmt:formatNumber  type="number" value="${shop.shopTvShowTablePojo.gmv-shop.shopTvShowTablePojo.gmv%1}"  maxFractionDigits="0"/>
								</span>
							<div class="c_g_c_b"></div>
						</div>
						 </c:forEach>
						<!-- 
                <div class="c_div_ss_23" style="background:rgba(4,44,73,0.6);border: 3px solid #08699e;">
                  <span class="c_span_list_tt_ing">Tissot</span><div class="c_g_c_b"></div><span class="c_span_opening">opening soon</span>
                </div>
                 -->
						<!-- <div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #08699e;">
							<span class="c_span_list_tt">Tissot</span> <span
								class="c_span_list_ppo">3,168/单</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">161,550</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_ld_in">269,700</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_tm">本月(49%):</span> <span
								class="c_span_list_tm_in">2,789,400</span>
							<div class="c_g_c_b"></div>
						</div>
						
                <div class="c_div_ss_23" style="background:rgba(4,44,73,0.6);border: 3px solid #08699e;">
                  <span class="c_span_list_tt_ing">swatch</span><div class="c_g_c_b"></div><span class="c_span_opening">opening soon</span>
                </div>
                
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #08699e;">
							<span class="c_span_list_tt">swatch</span> <span
								class="c_span_list_ppo">617/单</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">56,170</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_ld_in">81,816</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_tm">本月(63%):</span> <span
								class="c_span_list_tm_in">1,146,096</span>
							<div class="c_g_c_b"></div>
						</div>
						
                <div class="c_div_ss_23" style="background:rgba(4,44,73,0.6);border: 3px solid #08699e;">
                  <span class="c_span_list_tt_ing">ADP</span><div class="c_g_c_b"></div><span class="c_span_opening">opening soon</span>
                </div>
                
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #08699e;">
							<span class="c_span_list_tt">ADP</span> <span
								class="c_span_list_ppo">569/单</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">6,258</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_ld_in">6,470</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_tm">本月(13%):</span> <span
								class="c_span_list_tm_in">83,684</span>
							<div class="c_g_c_b"></div>
						</div>
						
                <div class="c_div_ss_23" style="background:rgba(4,44,73,0.6);border: 3px solid #08699e;">
                  <span class="c_span_list_tt_ing">FOSSIL</span><div class="c_g_c_b"></div><span class="c_span_opening">opening soon</span>
                </div>
                
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #08699e;">
							<span class="c_span_list_tt">FOSSIL</span> <span
								class="c_span_list_ppo">105/单</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">1,361</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_ld_in">22,831</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_tm">本月(23%):</span> <span
								class="c_span_list_tm_in">399,157</span>
							<div class="c_g_c_b"></div>
						</div>
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #999;">
							<span class="c_span_list_tt_ing">暂定官方旗舰店</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">ing</span>
						</div>
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #999;">
							<span class="c_span_list_tt_ing">暂定官方旗舰店</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">ing</span>
						</div>
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #999;">
							<span class="c_span_list_tt_ing">暂定官方旗舰店</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">ing</span>
						</div>
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #999;">
							<span class="c_span_list_tt_ing">暂定官方旗舰店</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">ing</span>
						</div>
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #999;">
							<span class="c_span_list_tt_ing">暂定官方旗舰店</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">ing</span>
						</div>
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #999;">
							<span class="c_span_list_tt_ing">暂定官方旗舰店</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">ing</span>
						</div>
						<div class="c_div_ss_23"
							style="background: rgba(4, 44, 73, 0.6); border: 3px solid #999;">
							<span class="c_span_list_tt_ing">暂定官方旗舰店</span>
							<div class="c_g_c_b"></div>
							<span class="c_span_list_td_in">ing</span>
						</div> -->
					</div>
				</div>

				<div class="c_div_time">
					<div id="flipcountdownbox1">
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript"
			src="<%=basePath%>/js/jquery.flipcountdown.js"></script>

		<script type="text/javascript">
			$(function() {
			var business='Bag';
		 <%-- 	$.ajax({
					//同步设置数据
		            type: "post",
		            url: "<%=basePath%>overall/department/getDayDataByBusiness.do",
					data : {
						"business" : business
					},
					dataType : 'JSON',
					success : function(data, status) {
						console.log(data);
					}
				});  --%>
				//console.log(list);
				/*
				 **/
				//window.setTimeout("location.href='http://121.199.172.239/index.php/ad/index'",30000);
				window.setTimeout(function() {
					var vQtyIng = 7;
					if (12 - vQtyIng > 9) {
						var speed = 50;
						var colee2 = document.getElementById("colee2");
						var colee1 = document.getElementById("colee1");
						var colee = document.getElementById("colee");

						colee2.innerHTML = colee1.innerHTML; //克隆colee1为colee2
						function Marquee1() {
							//当滚动至colee1与colee2交界时
							if (colee2.offsetTop - colee.scrollTop <= 0) {
								colee.scrollTop -= colee1.offsetHeight; //colee跳到最顶端
							} else {
								colee.scrollTop++
							}
						}
						var MyMar1 = setInterval(Marquee1, speed)//设置定时器
						//鼠标移上时清除定时器达到滚动停止的目的
						colee.onmouseover = function() {
							clearInterval(MyMar1);
						}
						//鼠标移开时重设定时器
						colee.onmouseout = function() {
							MyMar1 = setInterval(Marquee1, speed);
						}

					}

				}, 12000);

				// var vQtyIng = 7;
				// if(12-vQtyIng>9){
				// var speed=50;
				// var colee2=document.getElementById("colee2");
				// var colee1=document.getElementById("colee1");
				// var colee=document.getElementById("colee");

				// colee2.innerHTML=colee1.innerHTML; //克隆colee1为colee2
				// function Marquee1(){
				// //当滚动至colee1与colee2交界时
				// if(colee2.offsetTop-colee.scrollTop<=0){
				// colee.scrollTop-=colee1.offsetHeight; //colee跳到最顶端
				// }else{
				// colee.scrollTop++
				// }
				// }
				// var MyMar1=setInterval(Marquee1,speed)//设置定时器
				// //鼠标移上时清除定时器达到滚动停止的目的
				// colee.onmouseover=function() {clearInterval(MyMar1)}
				// //鼠标移开时重设定时器
				// colee.onmouseout=function(){MyMar1=setInterval(Marquee1,speed)}

				// }

				var vQtyIng = 7;
				var vDivSs23 = '<div class="c_div_ss_23" style="background:rgba(4,44,73,0.6);border: 3px solid #999;"><span class="c_span_list_tt_ing">暂定官方旗舰店</span><div class="c_g_c_b"></div><span class="c_span_list_td_in">ing</span></div>';
				var vHtml = '';
				var vDivIng = '';

				for (var i = 0; i < vQtyIng; i++) {
					vDivIng += vDivSs23;
				}
				vHtml = $('.c_div_ss_22').html();
				vHtml += vDivIng;
				$('.c_div_ss_22').html(vHtml);

				/*
				 **/
				$('#flipcountdownbox1').flipcountdown({
					size : "md"
				});

				var vScid = '';
				var vLHUrl = '';

				var vDate = new Date();
				var vS = vDate.getSeconds();
				//切换时间
				var vLHT = 30000;

				function GetQueryString(name) {
					var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
					var r = window.location.search.substr(1).match(reg);
					if (r != null)
						return unescape(r[2]);
					return null;
				}
				var path=window.location.pathname;
				var vLHUrl="/overall/department/Bag.do";
				if(path.indexOf("Bag.do")>-1){
					vLHUrl = '/overall/department/Shoes.do';
				}else if(path.indexOf("Shoes.do")>-1){
					vLHUrl = '/overall/department/Dress.do';
				}
				else if(path.indexOf("Dress.do")>-1){
					vLHUrl = '/overall/department/ACC.do';
				}
				else if(path.indexOf("ACC.do")>-1){
					vLHUrl = '/overall/department/Bag.do';
				}
				setTimeout(function() {
					location.href = vLHUrl
				}, vLHT);

			})
		</script>
	</div>

</body>
</html>
