<%@page import="org.apache.shiro.SecurityUtils"%>
<%@page import="org.apache.shiro.subject.Subject"%>
<%@page import="bi.baiqiu.pojo.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Subject sub = SecurityUtils.getSubject();
%>
<html>
<head>
<base href="<%=basePath%>">

</head>

<link href="<%=basePath%>/css/bootstrap/bootstrap-editable.css"
	rel="stylesheet" />
<link rel="stylesheet" href="<%=basePath%>/css/fileinput.min.css">

<link href="<%=basePath%>/css/bootstrap/bootstrap-table.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="<%=basePath%>/css/bootstrap/bootstrap.css">
<link rel="stylesheet"
	href="<%=basePath%>/css/bootstrap/bootstrap-datetimepicker.min.css">

<jsp:include page="/page/left.do"></jsp:include>
<link rel="stylesheet" href="<%=basePath%>/css/bi.css">
<link rel="stylesheet" href="<%=basePath%>/css/localRightTable.css">
<link rel="stylesheet"
	href="<%=basePath%>/css/bootstrap/bootstrap-switch.css">
<link rel="stylesheet" href="<%=basePath%>/css/manage/storeManage.css">

</head>
<body>
	<div class="page">
		<!-- 查询列表 -->
		<!-- 查询列表 -->
		<form id="queryCriteria" class="queryCriteria"
			style="min-width: 1160px">
			<div class="queryCriteriaDiv " id="selectp">
				 StoreStatus:
				<div class=" bootstrap-switch bootstrap-switch-mini  bootstrap-switch-animate state">
					<input type="checkbox" checked="checked"id="queryStoreStatus" />
				</div> 
				StoreName :<input type="text" class="form-control queryConditions"
					name="storeName" id="queryStoreName" placeholder="Alias">
				BU :<select class="form-control queryConditions" name="departmentId"
					id="querySaleCate">
				</select> PlatFrom :<select class="form-control queryConditions"
					name="platId" id="queryPlatFrom">
				</select>

			</div>
			<div class="btn-group">
				<button id="query" type="button" class="queryBtn btn btn-primary">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>Search
				</button>
				<button id="createStore" type="button"
					class="queryBtn btn btn-primary">
					<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>Create
					Store
				</button>
			</div>
		</form>
		<!-- view列表 -->
		<div class="view" style="background: white;">
			<div class="tableBorder">
				<table class="table" id="cusTable" data-pagination="true"
					data-showColumns="true" data-checkbox="true">
				</table>
			</div>
		</div>
	</div>
	<div class="modal fade" id="createStoreModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">operateStore</h4>
				</div>

				<div class="modal-body">
					<form id="storeForm">
						<div class="form-group">

							<div class="onOneLine">
								<label for="txt_des">StoreName</label> <input type="text"
									name="shopId" class="form-control hidden" id="shopId">
								<input type="text" class="form-control" name="storeName"
									id="storeName" placeholder="StoreName">
							</div>
							<div class="onOneLine">
								<label for="txt_des">StoreStatus</label>
								<div
									class=" bootstrap-switch bootstrap-switch-mini  bootstrap-switch-animate state">
									<input type="checkbox" name="storeStatus"
										id="storeStatus" />
								</div>
							</div>
							<div class="onOneLine">
								<label for="txt_des">Alias</label> <input type="text"
									class="form-control" name="storeShortName" id="storeShortName"
									placeholder="Alias">
							</div>
							<div class="onOneLine">
								<label for="txt_des">BU</label> <select class="form-control"
									name="departmentId" id="saleCate">
								</select>
							</div>
							<div class="onOneLine">
								<label for="txt_des">PlatFrom</label> <select
									class="form-control" name="platId" id="platFrom">
								</select>
							</div>
							<div class="onOneLine">
								<label for="txt_des">StartDate</label> <input type="text"
									class="form-control autoDate" name="storeStartDate"
									id="storeStartDate" placeholder="storeStartDate">
							</div>
							<div class="onOneLine">
								<label for="txt_des">StopDate</label> <input type="text"
									class="form-control autoDate" name="storeEndDate"
									id="storeEndDate" placeholder="storeEndDate">
							</div>
							<div class="onOneLine">
								<label for="txt_des">DisplayState-TV</label>
								<div
									class=" bootstrap-switch bootstrap-switch-mini  bootstrap-switch-animate state">
									<input type="checkbox" name="departmentDisplayState"
										 id="departmentDisplayState" />
								</div>
							</div>
							<div class="onOneLine">
								<label for="txt_des">Statistic-TV</label>
								<div
									class=" bootstrap-switch bootstrap-switch-mini  bootstrap-switch-animate state">
									<input type="checkbox" name="departmentStatistic"
										 id="departmentStatistic" />
								</div>
							</div>
							
							<div class="onOneLine">
								<label for="txt_des">DisplayName-TV</label> <input type="text"
									class="form-control" id="departmentDisplayName"
									name="departmentDisplayName" placeholder="DisplayName">
							</div>

							<div class="onOneLine">
								<label for="txt_des">Statistic-Warhouse</label>
								<div
									class=" bootstrap-switch bootstrap-switch-mini  bootstrap-switch-animate state">
									<input type="checkbox" 
										name="warehouseStatistic" id="warehouseStatistic" />
								</div>
							</div>
							<div class="onOneLine">
								<label for="txt_des">DisplayState-Warhouse</label>
								<div
									class=" bootstrap-switch bootstrap-switch-mini  bootstrap-switch-animate state">
									<input type="checkbox" 
										name="warehouseDisplayState" id="warehouseDisplayState" />
								</div>
							</div>
							<div class="onOneLine">
								<label for="txt_des">DisplayName-Warhouse</label> <input
									type="text" class="form-control" id="warehouseDisplayName"
									name="warehouseDisplayName" placeholder="DisplayName">
							</div>
							<div class="onOneLine">
								<label for="txt_des">ErpRepertoryName</label> <input type="text"
									class="form-control" id="erpRepertoryName"
									name="erpRepertoryName" placeholder="ErpRepertoryName">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>close
					</button>
					<button type="button" id="btn_submit" class="btn btn-primary"
						onclick="saveOrUpdateStore()" data-dismiss="modal">
						<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>Save
					</button>
				</div>

			</div>

		</div>
	</div>
</body>
<script src="<%=basePath%>/js/jquery-1.8.3.min.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap.min.js"></script>

<script src="<%=basePath%>/js/bootstrap/bootstrap-table.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-editable.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-table-editable.js"></script>
<script
	src="<%=basePath%>/js/bootstrap/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-datetimepicker.js"></script>
<script src="<%=basePath%>/js/fileinput.min.js"></script>
<script src="<%=basePath%>/js/knockout-3.4.2.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-typeahead.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-switch.js"></script>
<script src="<%=basePath%>/js/localTableTitle.js"></script>
<script src="<%=basePath%>/js/util.js"></script>
<script>
/* 提示框 */
        var tableTitleName="storeManage";
        var role=<%=sub.isPermitted("all") || sub.isPermitted("delete_history")%>;
        function initTable(tableTitle) {
            //先销毁表格
            $('#cusTable').bootstrapTable('destroy');
            //初始化表格,动态从服务器加载数据
            $("#cusTable").bootstrapTable({
                 method: "post",  //使用get请求到服务器获取数据
                contentType:"application/x-www-form-urlencoded; charset=UTF-8",
                url: "<%=basePath%>storeManage/getStroeList.do", //获取数据的Servlet地址
                striped: false,  //表格显示条纹
                pagination: true, //启动分页
                pageSize: 15,  //每页显示的记录数
                pageNumber:1, //当前第几页
                pageList: [2,10, 25, 50, 100],  //记录数可选列表
                search: false,  //是否启用查询
                showColumns: false,  //显示下拉框勾选要显示的列
                showRefresh: false,  //显示刷新按钮
                showExport: false,
                paginationPreText:'PreText',
                paginationNextText:'NextText',
                paginationDetailHAlign:'left',
                sidePagination: "server", //表示服务端请求
                exportDataType: "all",
                //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder
                //设置为limit可以获取limit, offset, search, sort, order
                queryParamsType : "undefined",
                columns:tableTitle,
                onEditableSave: function (field, row, oldValue, $el) {
                    $.ajax({
                        type: "post",
                        url: "",
                        data: row,
                        dataType: 'JSON',
                        success: function (data, status) {
                            if (status == "success") {
                                toastr.success('提交数据成功');
                            }
                        },
                        error: function () {
                            alert('编辑失败');
                        },
                        complete: function () {

                        }
                    });
                    },
                queryParams: function queryParams(param) {   //设置查询参数
                     param = {
                        pageNum:this.pageNumber,
                        pageSize:this.pageSize,
                        sortOrder:this.sortName?this.sortOrder:"desc",
                        sortName:this.sortName?this.sortName:"",
                       	storeStatus:$("#queryStoreStatus").attr('checked')?1:"", 
          		                    platId:$("#queryPlatFrom").val(),
          		                    departmentId:$("#querySaleCate").val(),
          		                    storeName:$("#queryStoreName").val()
                    };
                    return param;
                    
                },
                onLoadError: function(){  //加载失败时执行
                },
                onLoadSuccess:function(){
                	/*初始查询条数用以删除显示提示用 */
               	 $(".deleteRows").text(this.totalRows+" pieces of data on "+$("#queryStartDate").val());
            		/*初始化表头提示框  */
                	$(".th-inner").each(function (index,element){
            			$(this).attr("data-toggle","tooltip");
            			$(this).attr("data-placement","top");
            			$(this).attr("title",$(this).text());
            			
            		});
                	$("[data-toggle='tooltip']").tooltip();
                }
            });
            $('#cusTable').bootstrapTable('hideColumn', 'shopId');
            $('#cusTable').bootstrapTable('hideColumn', 'select');
        }
      var operate = {
          //初始化按钮事件
          operateInit: function () {
              this.operateDelete();
              this.createStore();
              this.operateExput();
              this.DepartmentModel = {
            				  };
              ko.applyBindings(this.myViewModel, document.getElementById("tb_dept"));

          },
          //删除
          operateDelete: function () {
              $('#btn_delete').on("click", function () {
            	  var arrselectedData =  $('#cusTable').bootstrapTable("getAllSelections");
            	  if(!$("#queryStartDate").val()){
            		  toastr.warning("Please select the date");
              		  return;  
              	  }
        	    	getTitle(tableTitleName,role);
            	  if($('#cusTable').bootstrapTable('getData').length == 0){
            		  toastr.warning("no Data");
            		  return;
            	  }
            	  // toastr.info('Are you sure you want to delete?<br /><br /><button onclick="deleteByDate()" type="button" class="btn clear">Yes</button>');
            	  $("#delcfmModel").modal().on("shown.bs.modal", function () {});
       
              });
          },
        //添加
          createStore: function () {
              $('#createStore').on("click", function () {
            	  var json={departmentDisplayState
            			  :
            				  "1"
            				  ,
            				  departmentStatistic
            				  :
            				  "1",
            				  warehouseDisplayState
            				  :
            				  "1",
            				  warehouseStatistic
            				  :
            				  "1",
            				  storeStatus
            				  :
            				  "1"};
            	  initAndsetStore(json);
              });
              
          },
        //导出
          operateExput: function () {
              $('#btn_export').on("click", function () {
            	  $("#form2").submit();
              });
          },

      }
    //日期插件初始化
    var options = {
    		
			weekStart : 1,
			todayBtn : true,
			clearBtn:true,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			format : 'yyyy-mm-dd',
			forceParse : 0,
			 language:"zh-CN",
		};
      $(function() {
    	  $("#storeManage").css("background","#578EBE");
    		getSaleCate("#querySaleCate", -1);
    		//平台
    		getPlat("#queryPlatFrom", -1)
    	getTitle(tableTitleName,role);
    	//初始化表格
      	//日期初始化
      	initDate();
      	//初始化增删查改
      	operate.operateInit();
      	//初始化上传文件
           inportInit("txt_file", "<%=basePath%>pcFlowStructure/uploadPcFlowStructure.do");
  	//	pandora潘多拉官方旗舰店
  		var datetype = $("input[name='datetype']:checked").val();
  		$("input[name='datetype']:last").attr("checked", true);
  		//	json.series[1].tooltip.valueSuffix = 'k';
  		//		json.series[2].tooltip.valueSuffix = 'k';

  		$("#query").click(function() {
  			var json={
  						storeStatus:$("#queryStoreStatus").attr('checked')?1:'',
  		                    platId:$("#queryPlatFrom").val(),
  		                    departmentId:$("#querySaleCate").val(),
  		                    storeName:$("#queryStoreName").val()
  			};
  			console.log(json);
  	    	getTitle(tableTitleName,role);
  		});
  		
  		$.fn.typeahead.Constructor.prototype.blur = function() {
  			var that = this;
  			setTimeout(function() {
  				that.hide()
  			}, 250);

  		};

  		/* $(".selectstore").on('input', function() {
  			var name = this.value;
  			var storename = [];
  			storename.push(this.value);
  			names = storename;
  		}); */

  		$('.selectstore').typeahead({
  			source : function(query, process) {
  				return names;
  			}
  		});
  		$('.selectstore2').typeahead({
  			source : function(query, process) {
  				return names;
  			}
  		});
  		  $('#warehouseDisplayState').bootstrapSwitch(); 
		  $('#departmentDisplayState').bootstrapSwitch(); 
		  $('#departmentStatistic').bootstrapSwitch(); 
  		  $('#warehouseStatistic').bootstrapSwitch(); 
		  $('#storeStatus').bootstrapSwitch(); 
		  $('#queryStoreStatus').bootstrapSwitch();
		  


  	});
      function initDate(){
    	  $("#datetimeStart>input[name = date ]").datetimepicker(options);
    	  $("#date").datetimepicker(options);
    	  $("#storeStartDate").datetimepicker(options);
    	  $("#storeEndDate").datetimepicker(options);

    	     var  end = new Date();
    	  	var day = end.getDate();
    	  	var year = end.getFullYear();
    	  	var month = end.getMonth();
    	  	var viewmonth =(month>8)?(month+1):"0"+(month+1);
    	  	$('#datetimeStart>input[name = date ]').val(year + "-" + viewmonth+ "-" + day);
    	    }

      $("#datetimeStart>input[name = date ]").datetimepicker(options).on('changeDate',
  			function(ev) {
		});
      $("#date").datetimepicker(options).on('changeDate',
    			function(ev) {
  		});
      $("#storeStartDate").datetimepicker(options).on('changeDate',
  			function(ev) {
    	  $('#storeEndDate').datetimepicker('setStartDate',ev.date);
		});
      $("#storeEndDate").datetimepicker(options).on('changeDate',
  			function(ev) {
    	  $('#storeStartDate').datetimepicker('setEndDate',ev.date);
		});
    //初始化fileinput
 
      function inportInit(ctrlName, uploadUrl) {
          var control = $('#' + ctrlName);

          //初始化上传控件的样式
          control.fileinput({
              language: 'zh', //设置语言
              uploadUrl: uploadUrl, //上传的地址
              allowedFileExtensions: ['xlsx','xls'],//接收的文件后缀
              showPreview :true,//是否显示预览
              showUpload: true, //是否显示上传按钮
              showCaption: true,//是否显示标题
              dropZoneEnabled: false,//是否显示拖拽区域
              browseClass: "btn btn-primary", //按钮样式     
              //dropZoneEnabled: false,//是否显示拖拽区域
              //minImageWidth: 50, //图片的最小宽度
              //minImageHeight: 50,//图片的最小高度
              //maxImageWidth: 1000,//图片的最大宽度
              //maxImageHeight: 1000,//图片的最大高度
              //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
              //minFileCount: 0,
              maxFileCount: 10, //表示允许同时上传的最大文件个数
              enctype: 'multipart/form-data',
              validateInitialCount:true,
              previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
              previewFileIconSettings: {
            	    'doc': '<i class="fa fa-file-word-o text-primary"></i>',
            	    'xls': '<i class="fa fa-file-excel-o text-success"></i>',
            	    'ppt': '<i class="fa fa-file-powerpoint-o text-danger"></i>',
            	    'jpg': '<i class="fa fa-file-photo-o text-warning"></i>',
            	    'pdf': '<i class="fa fa-file-pdf-o text-danger"></i>',
            	    'zip': '<i class="fa fa-file-archive-o text-muted"></i>',
            	},
                msgFilesTooMany: "Select the number of files to upload ({n}) over the maximum allowed value {m}！",

          });
          $("#div_startimport").show();

          //导入文件上传完成之后的事件
      }
    //新增或者修改店铺
     function saveOrUpdateStore(){
    	var  dataJson= $("#storeForm").serializeJson()
    	  $.ajax({
              type: "post",
              url: "<%=basePath%>storeManage/saveOrUpdateStore.do",
			data : dataJson,
			dataType : 'JSON',
			success : function(data, status) {
	            $('#cusTable').bootstrapTable('refresh');
				toastr.success(data.data);
			},
			error: function(){
				toastr.success("error");
			}
		});
	}
    //根据店铺id查询
     function getStore(shopId){
     	  $.ajax({
               type: "post",
               url: "<%=basePath%>storeManage/getStroeList.do",
 			data : {"shopId":shopId},
 			dataType : 'JSON',
 			success : function(data, status) {
 				initAndsetStore(data.rows[0]);
 			}
 		});

 	}//提交form表单查询
     function getStoreByJson(json){
    	  $.ajax({
              type: "post",
              url: "<%=basePath%>storeManage/getStroeList.do",
			data : json,
			dataType : 'JSON',
			success : function(data, status) {
				initAndsetStore(data.rows[0]);
			}
		});

	}
	//绑定店铺数据
	function initAndsetStore(json) {
		//部门
		getSaleCate("#saleCate", -1);
		//平台
		getPlat("#platFrom", -1)
		
		console.log(json);
		if (json)
			setForm("#storeForm",json);
		$("#createStoreModal").modal().on("shown.bs.modal", function() {

		}).on('hidden.bs.modal', function() {
			//关闭弹出框的时候清除绑定(这个清空包括清空绑定和清空注册事件)
		});
	}
	//弹出修改窗口
	function edit(index) {
		getStore(index);
	}
</script>
</html>
