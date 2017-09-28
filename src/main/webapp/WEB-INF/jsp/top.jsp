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
<link rel="stylesheet" href="<%=basePath%>css/top.css">
</head>
<body>
	<div class="top">
		<div class="logo">
			<img src="/img/logo.png">
			<p>BUY QUICKLY</p>
		</div>
		<h1>
			<a href="#" style="text-decoration: none;">logout</a>
		</h1>
	</div>
</body>
</html>