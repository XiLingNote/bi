<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>百秋BI--屏幕</title>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no, minimal-ui"> -->
<meta name="robots" content="noindex, nofollow">
<link rel="stylesheet" href="/css/mobile-screen.css">
<script src="/js/jquery-1.12.3.js"></script>
<script type="text/javascript">
	var _windowHeight;
	var _windowWidth;
	var _percent = 0.06;
	var _unit = "px";
	var _fontUnit = "rem";
	var _viewNum = 13;

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
			$("body").attr("class", "landscape");
			orientation = 'landscape';
		/* 	alert("Andriod横屏"); */
			_fontUnit = _unit;
			_percent = 0.7;
			 conversion(); 
		} else if (window.orientation == 0 || window.orientation == 180) {
			//ipad、iphone横屏；Andriod竖屏
			/* alert("Andriod竖屏"); */
			$("body").attr("class", "portrait");
			orientation = 'portrait';
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
		$('.headline').css("font-size", screen * _percent + _fontUnit);

		var _collectHeight = $(".collect").css("height");
		_collectHeight = parseInt(_collectHeight.substring(0,
				_collectHeight.length - 2));

		$('.explain').css("font-size",
				_collectHeight * 0.4 * _percent + _fontUnit);

		$('.num').css("font-size", _collectHeight * 0.6 * _percent + _fontUnit);

		var _titleDivHeight = $(".slide-title").css("height");
		_titleDivHeight = parseInt(_titleDivHeight.substring(0,
				_titleDivHeight.length - 2))/2;

		$(".slide-title li").css("line-height", _titleDivHeight - 2 + _unit);

		$(".title").css("height", _titleDivHeight + _unit);
		/* $(".title").css("line-height",_titleDivHeight-2+ _unit); */

		$('.title').css("font-size", (_titleDivHeight) * _percent + _fontUnit);
		$('.title span').css("height", _titleDivHeight - 2 + _unit);

		var size = $(".js-slide-list li").length;
		$(".js-slide-list li").css("height", _titleDivHeight -2 + _unit);
		
		$(".js-slide-list li").css("line-height", _titleDivHeight -2 + _unit);
		
		$(".js-slide-list li span").css("height", _titleDivHeight -2 + _unit);
		$(".slide-container").css("height", _titleDivHeight * size + _unit);
		$(".slide-container ul").css("height", _titleDivHeight * size + _unit);
		
		$('.slide-container ul span').css("font-size", (_titleDivHeight) * _percent + _fontUnit);
	}

	$(function() {
		orient();
		/* alert($(window).height()); */
		window.scrollTo(0, 0);
		/* 	setTimeout("location.reload();",2000);  */
	});
</script>
</head>
<body>
	<div class="un-move">
		<div class="screenHeader">
			<div class="headline">百秋物流作业统计</div>
			<div class="date"></div>
		</div>
		<div class="screenTop">
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;今日总单量</div>
				<div class="num">${total.totalSingleAmount}</div>
			</div>
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;今日发货</div>
				<div class="num">${total.todayShippedAmount}</div>
			</div>
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;本月发货</div>
				<div class="num">${total.presentMonthShippedAmount}</div>
			</div>
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;上月发货</div>
				<div class="num">${total.lastMonthShippedAmount}</div>
			</div>
		</div>

		<div class="slide-title">
			<ul class="slide-list">
					<li class="title">
				<span >品牌</span>
				<span >未转单</span>
				<span >待打印</span> 
				<span >配货中</span> 
				<span >已发货</span>
				<span >预单量</span>
				<span >预发货</span> 
				<span >总发货</span>
			</li>
			<li class="title">
				<span >统计</span>
				<span >${total.notTurnAmount}</span>
				<span >${total.notPrintAmount}</span> 
				<span >${total.distributionAmount}</span> 
				<span >${total.todayShippedGeneralAmount}</span>
				<span >${total.preOrderQuantity}</span>
				<span >${total.todayShippedPresellAmount}</span> 
				<span >${total.todayShippedGeneralAmount+item.todayShippedPresellAmount}</span>
			</li>
			</ul>
		</div>
	</div>
	<div class="slide-container">
		<ul class="slide-list js-slide-list">
			<c:forEach items="${list}" var="item" varStatus="status">
				<li >
					<span >${item.showName}</span>
					<span >${item.notTurnAmount}</span>
					<span >${item.notPrintAmount}</span>
					<span >${item.distributionAmount}</span>
					<span >${item.todayShippedGeneralAmount}</span>
					<!-- 预售单量  -->
					<span >${item.preOrderQuantity}</span>
					<span >${item.todayShippedPresellAmount}</span>
					<span >${item.todayShippedGeneralAmount+item.todayShippedPresellAmount}</span>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>