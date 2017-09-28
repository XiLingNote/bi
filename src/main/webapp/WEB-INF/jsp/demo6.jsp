<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	var _percent = 0.03;
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

			_fontUnit = _unit;
			_percent = 0.7;
			conversion();
		} else if (window.orientation == 0 || window.orientation == 180) {
			//ipad、iphone横屏；Andriod竖屏
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
		
		/* alert($(".js-slide-list li").length); */
		/* rem */
		$(document).scrollTop(0,0);
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
				_titleDivHeight.length - 2));

		$(".slide-title li").css("line-height", _titleDivHeight + _unit);

		$(".title").css("height", _titleDivHeight + _unit);

		$('.title').css("font-size", (_titleDivHeight) * _percent + _fontUnit);
		$('.title span').css("height", _titleDivHeight - 2 + _unit);
		
		var size = $(".js-slide-list li").length;
		$(".js-slide-list li").css("height", _titleDivHeight -2 + _unit);
		$(".js-slide-list li").css("line-height", _titleDivHeight -2 + _unit);
		$(".js-slide-list li span").css("height", _titleDivHeight -2 + _unit);
		$(".slide-container").css("height", _titleDivHeight * size + _unit);
		$(".slide-container ul").css("height", _titleDivHeight  * size + _unit);
		$('.slide-container ul span').css("font-size", (_titleDivHeight) * _percent + _fontUnit);
	}

	$(function() {
		orient();
		window.scrollTo(0, 0);
		/* scrollTo(0,0); */
	/* 	setTimeout("location.reload();",2000);  */
	});
</script>
</head>
<!-- onload="window.scroll(0,0)" -->
<body >
	<div class="un-move">
		<div class="screenHeader">
			<div class="headline">仓库作业统计</div>
			<div class="date"></div>
		</div>
		<div class="screenTop">
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;今日总单量</div>
				<div class="num">9999</div>
			</div>
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;今日发货</div>
				<div class="num">9999</div>
			</div>
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;本月发货</div>
				<div class="num">9999</div>
			</div>
			<div class="collect">
				<div class="explain">&nbsp;&nbsp;上月发货</div>
				<div class="num">9999</div>
			</div>
		</div>

		<div class="slide-title">
			<ul class="slide-list">
				<li class="title"><span class="brand">品牌</span> <span
					class="transfer">未转单</span> <span class="print">待打印</span> <span
					class="distribution">配货中</span> <span class="send">已发货</span> <span
					class="preSend">预售发货</span> <span class="totalSend">总发货</span></li>
			</ul>
		</div>
	</div>
	<div class="slide-container">
			<ul class="slide-list js-slide-list">
			<li class="even"><span class="brand">Yellow earth(YE)</span> <span
				class="transfer">5</span> <span class="print">999988</span> <span
				class="distribution">222a2</span> <span class="send">2asd</span> <span
				class="preSend">0</span> <span class="totalSend">0asd</span></li>

			<li class="odd"><span class="brand">Kipling</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">DELSEY</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">why</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">salad</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">fossil</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">CPU</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">achette</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">Clarks_w</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">Clarks_m</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">Clarks_k</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">TOMS</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">SMCP</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">liujo</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>
			<li class="even"><span class="brand">Clarks_kid</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">TOMS</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">SMCP</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">liujo</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>
			<li class="even"><span class="brand">Clarks_k</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">TOMS</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">SMCP</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">liujo</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>
			<li class="even"><span class="brand">Clarks_kid</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">TOMS</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">SMCP</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">liujo</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>
			<li class="even"><span class="brand">Clarks_k</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">TOMS</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">SMCP</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">liujo</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>
			<li class="even"><span class="brand">Clarks_k</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">TOMS</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">SMCP</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">liujo</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>
			<li class="even"><span class="brand">Clarks_k</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">TOMS</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>

			<li class="even"><span class="brand">SMCP</span> <span
				class="transfer">0</span> <span class="print">2</span> <span
				class="distribution">433</span> <span class="send">0</span> <span
				class="preSend">0</span> <span class="totalSend">5</span></li>

			<li class="odd"><span class="brand">liujo</span> <span
				class="transfer">5</span> <span class="print">4</span> <span
				class="distribution">111</span> <span class="send">2</span> <span
				class="preSend">0</span> <span class="totalSend">0</span></li>
		</ul>
	</div>
</body>
</html>