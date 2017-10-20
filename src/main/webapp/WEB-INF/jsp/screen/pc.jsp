<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//Dspan HTML 4.01 liansitional//EN" "http://www.w3.org/li/html4/loose.dspan">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BI-仓库-Screen</title>
<link rel="stylesheet" href="/css/jquery.flipcountdown.css">
<link rel="stylesheet" href="/css/screen.css">
<!-- <link rel="stylesheet" href="/css/fliptimer.css"> -->
<script src="/js/jquery-1.8.3.min.js"></script>
<!-- <script src="/js/jquery.fliptimer.js"></script> -->
<script src="/js/jquery.flipcountdown.js"></script>
<script type="text/javascript">
	/* 全局参数 */
	var _windowHeight;
	var _windowWidth;
	var _percent = 0.7;
	var _unit = "px";
	var _viewNum = 15;

	var doscroll = function() {
		var $parent = $('.js-slide-list');
		var $first = $parent.find('li:first');
		var height = $first.height();
		$first.animate({
			height : 0
		}, 500, function() {
			$first.css('height', height).appendTo($parent);
		});
	};

	function IsPC() {
		var userAgentInfo = navigator.userAgent;
		var Agents = [ "Android", "iPhone", "SymbianOS", "Windows Phone",
				"iPad", "iPod" ];
		var flag = true;
		for (var v = 0; v < Agents.length; v++) {
			if (userAgentInfo.indexOf(Agents[v]) > 0) {
				flag = false;
				break;
			}
		}
		return flag;
	};

	$(function() {
		/* 页面定时刷新 */
		setTimeout("location.reload();", 10*1000);

		/* 可视化窗口大小 */
		/* 		_windowHeight = $(window).height();
		 _windowWidth = $(window).width(); */
		/* 时间插件 */
		$('.date').flipcountdown({
			size : "sm"
		});

		/* $('.dowebok').flipTimer({
		seconds : liue
		}); */

		/*屏幕滚动  */
		setInterval(doscroll, 2000);

		/* pc 为 true */
		/* alert(IsPC());  */

		/* js确定字体大小  手机 px → rem */
		var screen = $(".screenHeader").css("height");
		screen = parseInt(screen.substring(0, screen.length - 2));
		$('.headline').css("font-size", screen * _percent + _unit);

		var _collectHeight = $(".collect").css("height");
		_collectHeight = parseInt(_collectHeight.substring(0,
				_collectHeight.length - 2));

		$('.explain').css("font-size", _collectHeight * 0.4 * _percent + _unit);

		$('.num').css("font-size", _collectHeight * 0.6 * _percent + _unit);

		var _titleDivHeight = $(".slide-title").css("height");
		_titleDivHeight = parseInt(_titleDivHeight.substring(0,
				_titleDivHeight.length - 2));

		$(".slide-title li").css("line-height", _titleDivHeight - 2 + _unit);

		$(".title").css("height", _titleDivHeight + _unit);
		/* $(".title").css("line-height",_titleDivHeight-2+ _unit); */

		$('.title').css("font-size", (_titleDivHeight) * _percent + _unit);
		$('.title span').css("height", _titleDivHeight - 2 + _unit);

		/* 展现表格的高度，由titleDiv 确定 */
		$(".slide-container").css("height",
				(_titleDivHeight - 1) * _viewNum + _unit);
		$(".slide-container ul").css("height",
				(_titleDivHeight - 1) * _viewNum + _unit);

		$(".slide-container li").css("height", _titleDivHeight - 2 + _unit);
		$(".slide-container li span")
				.css("height", _titleDivHeight - 2 + _unit);
		$(".slide-container li")
				.css("line-height", _titleDivHeight - 2 + _unit);
		$(".slide-container li").css("font-size",
				(_titleDivHeight - 2) * _percent + _unit);
	});
</script>
</head>
<style>
body{
 background: url("/img/beijing.jpg");
}
.collect{
background:none;
border:1px solid #ffffff;
margin-left:2.3%;
margin-right:2.3%;
}
.screenTop{
width:85%;
margin:0 auto;
}
.slide-list li{
border-top:0;
}
.date{
margin-top:-3%;
}

</style>
<body>
	<div class="screenHeader">

		<div class="headline">仓库作业统计</div>

		<!-- 翻牌计时插件 -->
		<div class="date"></div>
		<!-- <div class="dowebok">
			<div class="hours"></div>
			<div class="minutes"></div>
			<div class="seconds"></div>
		</div> -->
	</div>

	<div class="screenTop">
		<div class="collect" >
			<div class="explain">今日总单量</div>
			<div class="num">${total.totalSingleAmount}</div>
		</div>

		<div class="collect">
			<div class="explain">今日发货</div>
			<div class="num">${total.todayShippedAmount}</div>
		</div>
		<div class="collect">
			<div class="explain">本月发货</div>
			<div class="num">${total.presentMonthShippedAmount}</div>
		</div>
		<div class="collect">
			<div class="explain">上月发货</div>
			<div class="num">${total.lastMonthShippedAmount}</div>
		</div>
	</div>

	<div class="slide-title">
		<ul class="slide-list">
			<li class="title"><span class="brand">品牌</span> <span
				class="transfer">未转单</span> <span class="print">待打印</span> <span
				class="distribution">配货中</span> <span class="send">已发货</span> <span
				class="preSend">预售发货</span> <span class="totalSend">总计发货</span></li>
		</ul>
	</div>

	<div class="slide-container">
		<ul class="slide-list js-slide-list">
			<c:forEach items="${list}" var="item" varStatus="status">
				<c:if test="${status.index%2==0}">
					<li class="odd">
				</c:if>
				<c:if test="${status.index%2==1}">
					<li class="even">
				</c:if>
				<span class="brand">${item.showName}</span>
				<span class="transfer">${item.notTurnAmount}</span>
				<span class="print">${item.notPrintAmount}</span>
				<span class="distribution">${item.distributionAmount}</span>
				<span class="send">${item.todayShippedGeneralAmount}</span>
				<span class="preSend">${item.todayShippedPresellAmount}</span>
				<span class="totalSend">${item.todayShippedGeneralAmount+item.todayShippedPresellAmount}</span>
				</li>
			</c:forEach>
		</ul>

	</div>
</body>
</html>