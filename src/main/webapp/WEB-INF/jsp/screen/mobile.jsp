<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>百秋BI--屏幕</title>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no, minimal-ui"> -->
<meta name="robots" content="noindex, nofollow">
<link rel="stylesheet" href="/css/jquery.flipcountdown.css">
<link rel="stylesheet" href="/css/screen.css">
<!-- <link rel="stylesheet" href="/css/fliptimer.css"> -->
<script src="/js/jquery-1.8.3.min.js"></script>
<!-- <script src="/js/jquery.fliptimer.js"></script> -->
<script src="/js/jquery.flipcountdown.js"></script>
<script src="/js/scientific.js"></script>
<script type="text/javascript">
	var _windowHeight;
	var _windowWidth;
	var _percent = 0.06;
	var _unit = "px";
	var _fontUnit = "rem";
	var _viewNum = 9;

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

	function orient() {

		var a = 0;
		if (window.orientation == 90 || window.orientation == -90) {
			//ipad、iphone竖屏；Andriod横屏
			/* 	$("body").attr("class", "landscape");
				orientation = 'landscape'; */
			/* 	alert("Andriod横屏"); */
			_fontUnit = _unit;
			_percent = 0.7; 
			conversion();
		} else if (window.orientation == 0 || window.orientation == 180) {
			//ipad、iphone横屏；Andriod竖屏
			/* alert("Andriod竖屏"); */
			/* $("body").attr("class", "portrait");
			orientation = 'portrait'; */
			_fontUnit = "rem";
			_percent = 0.025;
			conversion();
		} else {
			
			_fontUnit = _unit;
			_percent = 0.7;
			conversion();
		}
	}

	//用户变化屏幕方向时调用
	$(window).bind('orientationchange', function(e) {
		orient();
	});

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
		$first.remove();
		$next.remove();
		$next2.remove();
		$next3.remove();
		$next4.remove();
		$next5.remove();
		$next6.remove();
		$next7.remove();
		$next8.remove();
		var height = $first.height();
		/* $first.animate({
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

	function conversion() {
		/* location.reload(); */
		_windowHeight = $(window).height();
		_windowWidth = $(window).width();
		/* 		 alert(_windowHeight);
		 alert(_windowWidth); */
		/* alert($(".js-slide-list li").length); */
		/* rem */
		/* js确定字体大小  手机 px → rem */
		var screen = $(".screenHeader").css("height");
		screen = parseInt(screen.substring(0, screen.length - 2));
		$('.headline').css("font-size", screen * _percent * 0.8 + _fontUnit);
		var _collectHeight = $(".collect").css("height");
		_collectHeight = parseInt(_collectHeight.substring(0,
				_collectHeight.length - 2));

		$('.explain').css("font-size",
				_collectHeight * 0.4 * _percent + _fontUnit);

		$('.num').css("font-size", _collectHeight * 0.5 * _percent + _fontUnit);

		var _titleDivHeight = $(".slide-title").css("height");
		_titleDivHeight = parseInt(_titleDivHeight.substring(0,
				_titleDivHeight.length - 2)) / 2;

		$(".slide-title li").css("line-height", _titleDivHeight + _unit);

		$(".title").css("height", _titleDivHeight + _unit);
		/* $(".title").css("line-height",_titleDivHeight-2+ _unit); */

		$('.title').css("font-size",
				(_titleDivHeight) * _percent * 0.8 + _fontUnit);
		$('.title span').css("height", _titleDivHeight + _unit);

		var size = $(".js-slide-list li").length;
		$(".js-slide-list li").css("height", _titleDivHeight + _unit);

		$(".js-slide-list li").css("line-height", _titleDivHeight + _unit);

		$(".js-slide-list li span").css("height", _titleDivHeight + _unit);
		$(".slide-container").css("height", _titleDivHeight * _viewNum + _unit);
		$(".slide-container ul").css("height", _titleDivHeight * size + _unit);

		$('.slide-container ul span').css("font-size",
				(_titleDivHeight) * _percent * 0.8 + _fontUnit);
	}

	$(function() {
		/*屏幕滚动  */
		setInterval(doscroll, 20000);
		orient();
		/* alert($(window).height()); */
		window.scrollTo(0, 0);
		/* setTimeout("location.reload();",40000); */

		$('.date').flipcountdown({
			size : "sm"
		});
		/* 数据汇总 科学计数法 */
		$(".todayNum").text(formatNum("${total.totalSingleAmount}"));
		$(".todaySend").text(formatNum("${total.todayShippedAmount}"));
		$(".thisMonth").text(formatNum("${total.presentMonthShippedAmount}"));
		$(".lastMonth").text(formatNum("${total.lastMonthShippedAmount}"));
	});
</script>
</head>

<style>
body {
	background: url("/img/beijing.jpg");
}

.collect {
	background: none;
	border: 1px solid #ffffff;
	margin-left: 2.3%;
	margin-right: 2.3%;
}

.slide-list li {
	border-top: 0;
}

.date {
	margin-top: -3%;
}

.title span {
	text-align: center;
}
</style>
<body>
	<div class="screenHeader">
		<div class="headline">百秋物流作业统计</div>
		<div class="date"></div>
	</div>
	<div class="screenTop">
		<div class="collect">
			<div class="explain">今日单量</div>
			<div class="num todayNum">formatNum(${total.totalSingleAmount})</div>
		</div>

		<div class="collect">
			<div class="explain">今日发货</div>
			<div class="num todaySend">${total.todayShippedAmount}</div>
		</div>
		<div class="collect">
			<div class="explain">本月发货</div>
			<div class="num thisMonth">${total.presentMonthShippedAmount}</div>
		</div>
		<div class="collect">
			<div class="explain">上月发货</div>
			<div class="num lastMonth">${total.lastMonthShippedAmount}</div>
		</div>
	</div>

	<div class="slide-title">
		<ul class="slide-list">
			<li class="title"><span>品牌</span> <span>未转单&nbsp;&nbsp;</span> <span>待打印&nbsp;&nbsp;</span>
				<span>配货中&nbsp;&nbsp;</span> <span>已发货&nbsp;&nbsp;</span> <span>预单量&nbsp;&nbsp;</span>
				<span>预发货&nbsp;&nbsp;</span> <span>总发货&nbsp;&nbsp;</span></li>
			<li class="title"><span>统计</span> <span>${total.notTurnAmount}&nbsp;</span>
				<span>${total.notPrintAmount}&nbsp;</span> <span>${total.distributionAmount}&nbsp;</span>
				<span>${total.todayShippedGeneralAmount}&nbsp;</span> <span>${total.preOrderQuantity}&nbsp;</span>
				<span>${total.todayShippedPresellAmount}&nbsp;</span> <span>${total.todayShippedGeneralAmount+item.todayShippedPresellAmount}&nbsp;</span>
			</li>
		</ul>
	</div>
	<div class="slide-container">
		<ul class="slide-list js-slide-list">
			<c:forEach items="${list}" var="item" varStatus="status">
				<li><span>${item.showName}</span> <span>${item.notTurnAmount}&nbsp;</span>
					<span>${item.notPrintAmount}&nbsp;</span> <span>${item.distributionAmount}&nbsp;</span>
					<span>${item.todayShippedGeneralAmount}&nbsp;</span> <!-- 预售单量  -->
					<span>${item.preOrderQuantity}&nbsp;</span> <span>${item.todayShippedPresellAmount}&nbsp;</span>
					<span>${item.todayShippedGeneralAmount+item.todayShippedPresellAmount}&nbsp;</span>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>