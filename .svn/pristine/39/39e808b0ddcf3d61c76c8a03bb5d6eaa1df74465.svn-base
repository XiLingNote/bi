<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="en">
<head>
<title>storeAdmin</title>
<link rel="stylesheet" href="/css/bootstrap/bootstrap.css">
<link rel="stylesheet"
	href="/css/bootstrap/bootstrap-datetimepicker.min.css">
<jsp:include page="/page/left.do"></jsp:include>
<link href="/css/bi.css" rel="stylesheet" rel="stylesheet">
<link href="/css/bootstrap/bootstrap-select.css" rel="stylesheet">
<script src="<%=basePath%>/js/jquery-1.12.3.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap.min.js"></script>
<script src="<%=basePath%>/js/knockout-3.4.2.js"></script>
<script type="text/javascript">
	/* js全局参数 */
	
	var _function = "<c:forEach items='${functionSet}' var='function'><input id='updateFunction' name='functionIds' type='checkbox'value='${function.id}'>${function.UExplain}</c:forEach>";

	function fillDate(userid, name, username, phone, functionIds) {

		$('#functionDiv').empty();
		$('#functionDiv').append(_function);

		/* 	<c:forEach items="${functionSet}" var="function">
		 	$("#updateFunction[value='" + ${function.id} + "']").removeAttr("checked");
		</c:forEach>  */

		var functionId = functionIds.split(",");
		$('#updateid').val(userid);
		$('#updateName').val(name);
		$('#updateusername').val(username);
		$('#updatephone').val(phone);
		/* $('#updatefunctionIds').val(functionIds); */

		if (functionIds) {
			alert("functionId:" + functionId);
			$.each($(functionId), function(i, n) {
				$("#updateFunction[value='" + n + "']").attr("checked", true);
			});
		}

	}
	function initTable() {
		//先销毁表格
		$('#userTable').bootstrapTable('destroy');
		//初始化表格,动态从服务器加载数据
		$("#userTable").bootstrapTable({
			method : "post", //使用get请求到服务器获取数据
			contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			//获取数据的Servlet地址
			url : "/user/manageUser.do",
			striped : true, //表格显示条纹
			pagination : true, //启动分页
			pageSize : 15, //每页显示的记录数
			pageNumber : 1, //当前第几页
			pageList : [ 10, 25, 50, 100 ], //记录数可选列表
			search : false, //是否启用查询
			showColumns : false, //显示下拉框勾选要显示的列
			showRefresh : false, //显示刷新按钮
			showExport : false,
			paginationPreText : 'PreText',
			paginationNextText : 'NextText',
			paginationDetailHAlign : 'left',
			sidePagination : "server", //表示服务端请求
			exportDataType : "all",
			//设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder
			//设置为limit可以获取limit, offset, search, sort, order
			queryParamsType : "undefined",
			columns : tableTitle,
			onEditableSave : function(field, row, oldValue, $el) {
				$.ajax({
					type : "post",
					url : "/user/manageUser.do",
					data : row,
					dataType : 'JSON',
					success : function(data, status) {
						if (status == "success") {

						}
					},
					error : function() {
					},
					complete : function() {

					}
				});
			},
			queryParams : function queryParams(param) { //设置查询参数
				param = {
					pageNum : this.pageNumber,
					pageSize : this.pageSize,
					sortName : this.sortName,
					sortOrder : this.sortOrder,
					startDate : $("#userTable").val(),
					endDate : $("#userTable").val()
				};
				return param;

			},
			onLoadError : function() { //加载失败时执行
				showTip("wait", 100);
			},
			onLoadSuccess : function() {
				$(".th-inner").each(function(index, element) {
					$(this).attr("data-toggle", "tooltip");
					$(this).attr("data-placement", "top");
					$(this).attr("title", $(this).text());
				});
				$("[data-toggle='tooltip']").tooltip();
			}
		});
		$('#userTable').bootstrapTable('hideColumn', 'id');
	}
	$(function() {

		/* 左侧菜单选中效果 */
		$("#leftStoreAdmin").css("background", "#578EBE");

		/* 后台报错 */
		if ('${msg}') {
			alert("${msg}");
		}
		/* 	$('#userTable').bootstrapTable({
			    columns: [{
			        field: 'id',
			        title: 'Item ID'
			    }, {
			        field: 'name',
			        title: 'Item Name'
			    }, {
			        field: 'price',
			        title: 'Item Price'
			    }],
			    data: [{
			        id: 1,
			        name: 'Item 1',
			        price: '$1'
			    }, {
			        id: 2,
			        name: 'Item 2',
			        price: '$2'
			    }]
			}); */
		/* initTable(); */
		var mySelect = $('#first-disabled2');

		<c:forEach items="${userList}" var="user" varStatus="status">

		$('#update${status.index}').on('click', function() {

			/* 	var _tds = $(this).parent().parent().children(); */
			var userid = $('.userid${status.index}').html();
			var name = $('.name${status.index}').html();
			var username = $('.username${status.index}').html();
			var phone = $('.phone${status.index}').html();
			var functionIds = $('.functionIds${status.index}').html();

			/* 填充表单数据*/
			fillDate(userid, name, username, phone, functionIds);
		});

		</c:forEach>

		$('#special').on('click', function() {
			mySelect.find('option:selected').prop('disabled', true);
			mySelect.selectpicker('refresh');
		});

		$('#special2').on('click', function() {
			mySelect.find('option:disabled').prop('disabled', false);
			mySelect.selectpicker('refresh');
		});

		$('#basic2').selectpicker({
			liveSearch : true,
			maxOptions : 1
		});

		$("#updateFunction").change(function() {
		});
	});
</script>
</head>
<body>
	<div class="page" style="color: black; background-color: #ffffff;">
		<!-- 查询列表 -->
		<div
			style="position: absolute; background-color: #fff; height: 10%; width: 100%">
			<!-- 			<h2>创建模态框（Modal）</h2>
 -->
			<!-- 按钮触发模态框 -->
			<button class="btn btn-primary btn-lg" data-toggle="modal"
				data-target="#myModal"
				style="float: right; margin-top: 12px; font-size: 16px;">添加账号</button>
		</div>
		<!-- 新建账号模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<form method="post" action="/user/regist.do">
					<input hidden name="page" value="shopadmin">

					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel"
								style="text-align: center">添加账号与授权</h4>
						</div>
						<div class="form-group">
							<!-- <i class="fa fa-user fa-lg"></i> -->
							<input name="name" class="form-control required" type="text"
								placeholder="name" autofocus="autofocus" />
						</div>
						<div class="form-group">
							<!-- <i class="fa fa-user fa-lg"></i> -->
							<input name="username" class="form-control required" type="text"
								placeholder="username" autofocus="autofocus" />
						</div>
						<div class="form-group">
							<!-- <i class="fa fa-lock fa-lg"></i> -->
							<input name="password" class="form-control required"
								type="password" placeholder="Password" id="register_password" />
						</div>

						<!-- <div class="form-group">
							<i class="fa fa-check fa-lg"></i>
							<input name="rpassword" class="form-control required"
								type="password" placeholder="Re-type Your Password" />
						</div> -->

						<div class="form-group">
							<!-- <i class="fa fa-lock fa-lg"></i> -->
							<input name="phone" class="form-control required" type="phone"
								placeholder="phone" />
						</div>
						<div class="form-group">
							<c:forEach items="${functionSet}" var="function">
								<input name="functionIds" type="checkbox" value="${function.id}">${function.UExplain}
						</c:forEach>
						</div>

						<div class="form-group">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button id="regist_button" type="submit" class="btn btn-primary">确定</button>
						</div>

					</div>
				</form>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal -->
		</div>
		<!-- view列表 -->
		<div class="view" style="background-color: #ffffff">
			<table id="userTable" style="width: 80%; margin-left: 10%;"
				border="1px" bordercolor="#ffffff">
				<tr border="1px"
					style="height: 40px; text-align: center; background-color: #63a2d8; color: #ffffff;; border-color: #cdd8e4">
					<th style="width: 50px; text-align: center">name</th>
					<th style="width: 50px; text-align: center">username</th>
					<th style="width: 50px; text-align: center">phone</th>
					<th style="width: 50px; text-align: center">shopNamePlat</th>
					<th style="width: 50px; text-align: center">shopName</th>
					<th style="width: 50px; text-align: center;">update</th>
				</tr>
				<c:forEach items="${userList}" var="user" varStatus="status">

					<tr style="height: 30px; text-align: center; border-color: #cdd8e4">
						<td class="userid${status.index}" hidden>${user.id}</td>
						<td class="name${status.index}" >${user.name}</td>
						<td class="username${status.index}">${user.username}</td>
						<td class="phone${status.index}">${user.phone}</td>
						<td class="shopNamePlat${status.index}">${user.shopNamePlat}</td>
						<td class="shopName${status.index}">${user.shopName}</td>
						<td class="functionIds${status.index}" hidden>${user.functionIds}</td>
						<%-- <td>${status.index}</td> --%>
						<td>
							<button id="update${status.index}" class="btn btn-primary btn-lg"
								data-toggle="modal" data-target="#updateModal"
								style="width: 80px; font-size: 14px; padding: 6px 12px">修改信息</button>
						</td>
						<!-- <td><button>作废</button></td> -->
					</tr>
				</c:forEach>
			</table>
		</div>
		<!-- update修改用户信息模态框（Modal） -->
		<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<form method="post" action="/user/update.do">
					<input hidden name="page" value="shopadmin"> <input
						id="updateid" hidden name="id">
					<!-- <input hidden
						id="updatefunctionIds" name="asdasd"> -->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel"
								style="text-align: center">update user information</h4>
						</div>
						<div class="form-group">
							<!-- <i class="fa fa-user fa-lg"></i> -->
							<input id="updateName" name="name" class="form-control required"
								type="text" placeholder="name" autofocus="autofocus" />
						</div>
						<div class="form-group">
							<!-- <i class="fa fa-user fa-lg"></i> -->
							<input id="updateusername" name="username"
								class="form-control required" type="text" placeholder="username"
								autofocus="autofocus" />
						</div>

						<div class="form-group">
							<!-- <i class="fa fa-lock fa-lg"></i> -->
							<input id="updatephone" name="phone"
								class="form-control required" type="phone" placeholder="phone" />
						</div>
						<!-- 	<div class="form-group">
									<i class="fa fa-lock fa-lg"></i>
									<input id="updatepassword" name="password"
										class="form-control required" type="password"
										placeholder="Password"  />
								</div> -->

						<div class="form-group" id="functionDiv">
							<c:forEach items="${functionSet}" var="function">
								<input id="updateFunction" name="functionIds" type="checkbox"
									value="${function.id}">${function.UExplain}
									</c:forEach>
						</div>

						<div class="form-group">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">close</button>
							<button id="regist_button" type="submit" class="btn btn-primary">modify</button>
						</div>


					</div>
				</form>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal -->
		</div>

	</div>

</body>
</html>