<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="full-screen" content="yes">
<meta name="x5-fullscreen" content="true">
<title>BI-仓库-Screen</title>
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1"> -->
<link rel="stylesheet" href="/css/jquery.flipcountdown.css">
<link rel="stylesheet" href="/css/screen.css">
<!-- <link rel="stylesheet" href="/css/fliptimer.css"> -->
<script src="/js/jquery-1.8.3.min.js"></script>
<!-- <script src="/js/jquery.fliptimer.js"></script> -->
<script src="/js/jquery.flipcountdown.js"></script>
<script src="/js/scientific.js"></script>
<script type="text/javascript">
	/* 全局参数 */
	var _windowHeight;
	var _windowWidth;
	var _percent = 0.7;
	var _unit = "px";
	var _viewNum = 9;

	var doscroll = function() {
		var $parent = $('.js-slide-list');
		var $first = $parent.find('li:first');
		var $next = $first.next();
		var $next2 = $next.next();
		var $next3 = $next2.next();
		var $next4 = $next3.next();
		var $next5 = $next4.next();
		var $next6 = $next5.next();
		var $next7 = $next6.next();
		var $next8 = $next7.next();
		var height = $first.height();
		$first.remove();
		$next.remove();
		$next2.remove();
		$next3.remove();
		$next4.remove();
		$next5.remove();
		$next6.remove();
		$next7.remove();
		$next8.remove();
	/* 	$first.animate({
			height : 0
		}, 1, function() {
			$first.css('height', height).appendTo($parent);
			$next.css('height', height).appendTo($parent);
			$next2.css('height', height).appendTo($parent);
			$next3.css('height', height).appendTo($parent);
			$next4.css('height', height).appendTo($parent);
			$next5.css('height', height).appendTo($parent);
			$next6.css('height', height).appendTo($parent);
			$next7.css('height', height).appendTo($parent);
			$next8.css('height', height).appendTo($parent);
		}); */
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
		setTimeout("location.reload();",40*1000);

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
		 setInterval(doscroll, 20000); 

		/* pc 为 true */
		/* alert(IsPC());  */

		/* js确定字体大小  手机 px → rem */
		var screen = $(".screenHeader").css("height");
		screen = parseInt(screen.substring(0, screen.length - 2));
		$('.headline').css("font-size", screen * _percent + _unit);

		var _collectHeight = $(".collect").css("height");
		_collectHeight = parseInt(_collectHeight.substring(0,
				_collectHeight.length - 2));

		$('.explain').css("font-size", _collectHeight * 0.5 * _percent + _unit);

		$('.num').css("font-size", _collectHeight * 0.6 * _percent + _unit);

		var _titleDivHeight = $(".slide-title").css("height");
		_titleDivHeight = parseInt(_titleDivHeight.substring(0,
				_titleDivHeight.length - 2))/2;

		$(".slide-title li").css("line-height", _titleDivHeight  + _unit);

		$(".title").css("height", _titleDivHeight + _unit);
		$(".title").css("line-height",_titleDivHeight-1+ _unit);

		$('.title').css("font-size", (_titleDivHeight) * _percent + _unit);
		$('.title span').css("height", _titleDivHeight + _unit);

		/* 展现表格的高度，由titleDiv 确定 */
		$(".slide-container").css("height",
				(_titleDivHeight ) * _viewNum + _unit);
		$(".slide-container ul").css("height",
				(_titleDivHeight) * _viewNum + _unit);

		$(".slide-container li").css("height", _titleDivHeight  + _unit);
		$(".slide-container li span")
				.css("height", _titleDivHeight + _unit);
		$(".slide-container li")
				.css("line-height", _titleDivHeight  + _unit);
		$(".slide-container li").css("font-size",
				(_titleDivHeight - 2) * _percent + _unit);
		
		/* 数据汇总 科学计数法 */
		$(".todayNum").text(formatNum("${total.totalSingleAmount}"));
		$(".todaySend").text(formatNum("${total.todayShippedAmount}"));
		$(".thisMonth").text(formatNum("${total.presentMonthShippedAmount}"));
		$(".lastMonth").text(formatNum("${total.lastMonthShippedAmount}"));
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
.slide-list li{
border-top:0;
}
.date{
margin-top:-3%;
}
.title span{
text-align: center;
}

</style>
<body>
	<div class="screenHeader">

		<div class="headline">百秋物流作业统计</div>

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
			<div class="explain">今日单量</div>
			<div class="num todayNum">formatNum(${total.totalSingleAmount})</div>
		</div>

		<div class="collect">
			<div class="explain">今日发货</div>
			<div class="num todaySend">${total.todayShippedAmount}</div>
		</div>
		<div class="collect">
			<div class="explain">本月发货</div>
			<div class="num thisMonth">
			${total.presentMonthShippedAmount}</div>
		</div>
		<div class="collect">
			<div class="explain">上月发货</div>
			<div class="num lastMonth">${total.lastMonthShippedAmount}</div>
		</div>
	</div>

	<div class="slide-title">
		<ul class="slide-list">
				<ul class="slide-list">
			<li class="title"><span>品牌</span> <span>未转单&nbsp;&nbsp;</span> <span>待打印&nbsp;&nbsp;</span>
				<span>配货中&nbsp;&nbsp;</span> <span>已发货&nbsp;&nbsp;</span> <span>预单量&nbsp;&nbsp;</span> <span>预发货&nbsp;&nbsp;</span>
				<span>总发货&nbsp;&nbsp;</span></li>
			<li class="title"><span>统计</span> <span>${total.notTurnAmount}&nbsp;</span>
				<span>${total.notPrintAmount}&nbsp;</span> <span>${total.distributionAmount}&nbsp;</span>
				<span>${total.todayShippedGeneralAmount}&nbsp;</span> <span>${total.preOrderQuantity}&nbsp;</span>
				<span>${total.todayShippedPresellAmount}&nbsp;</span> <span>${total.todayShippedGeneralAmount+item.todayShippedPresellAmount}&nbsp;</span>
			</li>
		</ul>
		</ul>
	</div>

	<div class="slide-container">
		<ul class="slide-list js-slide-list">
			<c:forEach items="${list}" var="item" varStatus="status">
				<li >
					<span >${item.showName}&nbsp;</span>
					<span >${item.notTurnAmount}&nbsp;</span>
					<span >${item.notPrintAmount}&nbsp;</span>
					<span >${item.distributionAmount}&nbsp;</span>
					<span >${item.todayShippedGeneralAmount}&nbsp;</span>
					<!-- 预售单量  -->
					<span >${item.preOrderQuantity}&nbsp;</span>
					<span >${item.todayShippedPresellAmount}&nbsp;</span>
					<span >${item.todayShippedGeneralAmount+item.todayShippedPresellAmount}&nbsp;</span>
				</li>
			</c:forEach>
		</ul>

	</div>
</body>
</html>