<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//Dspan HTML 4.01 liansitional//EN" "http://www.w3.org/li/html4/loose.dspan">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BI-Screen-Demo</title>

<style type="text/css">
.slide-title {
	background: rgba(0, 0, 0, .5);
	color: #fff;
	height: 34px;
	line-height: 34px;
	padding: 0 10px;
	font-size: 12px;
	font-weight: bold;
	list-style: none;
}

.slide-title span {
	float: left;
	margin-right: 14px;
}

.slide-title span:nth-child(1), .slide-list li span:nth-child(1) {
	width: 60px;
}

.slide-title span:nth-child(2), .slide-list li span:nth-child(2) {
	width: 90px;
}

.slide-title span:nth-child(3), .slide-list li span:nth-child(3) {
	width: 90px;
	margin-right: 0px;
}

.slide-container {
	position: relative;
	overflow: hidden;
	height: 90px;
}

.slide-list {
	position: absolute;
	width: 100%;
	left: 0;
	top: 0;
	color: #000;
	margin: 0;
	padding: 0;
}

.slide-list li {
	height: 30px;
	line-height: 30px;
	list-style: none;
	margin: 0;
	padding: 0 10px;
}

.slide-list li span {
	display: inline-block;
	margin-right: 14px;
	font-size: 12px;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
}

.slide-list li.odd {
	background: #66cdaa;
}

.slide-list li.even {
	background: rgba(51, 79, 109, .1);
}
</style>
<script src="/js/jquery-1.12.3.js"></script>
<script type="text/javascript">
	function doscroll() {
		var $parent = $('.js-slide-list');
		var $first = $parent.find('li:first');
		var height = $first.height();
		$first.animate({
			height : 0
		}, 500, function() {
			$first.css('height', height).appendTo($parent);
		});
	};
	/* setInterval(doscroll, 2000); */
</script>
</head>
<body>
	<div class="slide-title">
		<ul>
			<li><span>title1</span> <span>title2</span> <span>title3</span>
			</li>
		</ul>
	</div>
	<div class="slide-container">
		<ul class="slide-list js-slide-list">
			<li class="odd"><span>item1</span><span>item1</span><span>item1</span></li>
			<li class="even"><span>item2</span><span>item2</span><span>item2</span></li>
			<li class="odd"><span>item3</span><span>item3</span><span>item3</span></li>
			<li class="even"><span>item4</span><span>item4</span><span>item4</span></li>
			<li class="odd"><span>item5</span><span>item5</span><span>item5</span></li>
			<li class="even"><span>item6</span><span>item6</span><span>item6</span></li>
		</ul>
	</div>
</body>
</html>