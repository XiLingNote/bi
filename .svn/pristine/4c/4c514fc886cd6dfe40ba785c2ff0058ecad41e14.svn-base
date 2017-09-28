<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo5</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<link rel="stylesheet"
	href="/css/bootstrap/bootstrap-datetimepicker.min.css">
<script src="/js/jquery-1.12.3.js"></script>
<script src="/js/bootstrap/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="/js/bootstrap/bootstrap-datetimepicker.js"></script>
<style type="text/css">
#a {
	position: relative;
	left: 20px;
	width: 80px;
	font-size: 14px;
	width: 80px;
	top: 20px;
	left: 20px;
	text-align: center;
}
</style>
<script>
	var options = {
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		minView : 2,
		language : 'zh-CN',
		format : 'dd/MM/yyyy',
		/* initialDate : new Date() */
	}
	$(function() {
		/* var end = new Date(2017, 1, 12);
		var aa  ="07/06/2017"
		options.initialDate = aa; */
		$('#a').datetimepicker(options);

		$('#a').datetimepicker().on('changeDate', function(ev) {
			alert(ev.date);
		});
		/* alert(new Date()); */
	});
</script>
</head>
<body>
	<input type="text" value="26/08/2013" id="a">
</body>
</html>