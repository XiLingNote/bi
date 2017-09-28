<%@page import="org.apache.shiro.SecurityUtils"%>
<%@page import="org.apache.shiro.subject.Subject"%>
<%@page import="bi.baiqiu.pojo.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Subject sub=SecurityUtils.getSubject();

%>
<html>
<head>
<base href="<%=basePath%>">

</head>
<link href="<%=basePath%>/css/bootstrap/bootstrap-editable.css"
	rel="stylesheet" />

<link rel="stylesheet"
	href="<%=basePath%>/css/bootstrap/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="<%=basePath%>/css/fileinput.min.css">
<link rel="stylesheet"
	href="<%=basePath%>/css/bootstrap/bootstrap.min.css">
<link href="<%=basePath%>/css/bootstrap/bootstrap-table.css"
	rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/bi.css" rel="stylesheet" type="text/css">
<jsp:include page="/page/left.do"></jsp:include>
<link rel="stylesheet" href="<%=basePath%>/css/localRightTable.css">
<style>
/* 行内编辑 */
.tabledit-toolbar-column {
	width:120;
}
.tabledit-delete-button {
	background-color: #e0e0e0;
	border-left: 1px white solid;
}

.tabledit-edit-button {
	background-color: #e0e0e0;
}
</style>
</head>

<body>
<div class="page">
		<!-- 查询列表 -->
		<form class="queryCriteria" style="min-width: 1160px">
			<div class="queryCriteriaDiv " id="selectp">
				Sku：<input id="sku" class="form-controller queryConditions"/> 
					Spu： <input id="spu" class="form-controller queryConditions"/> 
					goodsId： <input id="goodsId" class="form-controller queryConditions"/> 
					feature： <input id="feature"class="form-controller queryConditions"
						data-provide="typeahead" /> 
					property： <input id="property" class="form-controller queryConditions"
						data-provide="typeahead" />
				
			</div>
			<div class="btn-group" >
						<button id="query" type="button" class=" queryBtn btn btn-primary">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>Search
					</button>
					<button id="btn_imput" type="button" class="imputBtn btn btn-primary">
						<span class="glyphicon  glyphicon-import" aria-hidden="true"></span>IMPORT
						DATA
					</button>
					</div>
		</form>

		<!-- view列表 -->
		<div class="view" style="background: white;">
		<div class="tableBorder">
				<table class="table" id="cusTable" data-pagination="true" data-showColumns="true"
					data-checkbox="true">
				</table>
			</div>
	</div>
	</div>
	<!-- <div class="localRightpage">
		<div class="localRightview">
			<div class="queryCondition" >

				<div id="selectp">
					Sku: <input id="sku" class="form-controller queryConditions"/> 
					Spu: <input id="spu" class="form-controller queryConditions"/> 
					goodsId: <input id="shopId" class="form-controller queryConditions"/> 
					feature: <input id="feature"class="form-controller queryConditions"
						data-provide="typeahead" /> 
					property: <input id="property" class="form-controller queryConditions"
						data-provide="typeahead" />
				
				<div  class="btn-group" >
					<button id="query" type="button" class=" queryBtn btn btn-primary">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>Search
					</button>
					<button id="btn_imput" type="button" class="imputBtn btn btn-primary">
						<span class="glyphicon  glyphicon-import" aria-hidden="true"></span>IMPORT
						DATA
					</button>
				</div>
				</div>
			</div>
		<div class="tableBorder">
			<table class="table" id="cusTable" data-pagination="true" data-showColumns="true"
				data-checkbox="true">
			</table>
		</div>
		</div>
		

	</div> -->

	<!--  导入modle-->
	<form>
		<div class="modal fade" id="myModalImoprt" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content ">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Please select a
							file(Excel)</h4>
					</div>
					<div id="uploadRemark"></div>
					<div class="modal-body">
						<a id="downloadTemplate"
							href="<%=basePath%>download/downloadTemplate.do?fileName=pcFlow"
							class="form-control" style="border: none;">Download the
							import template <button id="btn_imput" type="button" class="imputBtn btn btn-primary" style="float: right;">
							<span class="glyphicon  glyphicon-import" aria-hidden="true" ></span>
						</button></a> <input type="file" name="txt_file" id="txt_file"
							multiple class="file-loading" />
					</div>
				</div>
			</div>
		</div>
	</form>
	<!-- 信息删除确认 -->
	<div class="modal fade" id="delcfmModel">
		<div class="modal-dialog">
			<div class="modal-content message_align">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">Prompt Message</h4>
				</div>
				<div class="modal-body">
					<p>Are you sure you want to delete?</p>
				</div>
				<div class="modal-footer">
					<input type="hidden" id="url" />
					<button type="button" class="btn btn-primary" data-dismiss="modal">Cancel</button>
					<a onclick="deleteByArray()" class="btn btn-success"
						data-dismiss="modal">Confirm</a>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
</body>
<script src="<%=basePath%>/js/jquery-1.8.3.min.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap.min.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-table.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-editable.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-table-editable.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap-datetimepicker.js"></script>
<script src="<%=basePath%>/js/fileinput.min.js"></script>
<script src="<%=basePath%>/js/knockout-3.4.2.js"></script>
<script src="<%=basePath%>/js/jquery.tabledit.min.js"></script>
<script src="<%=basePath%>/js/bootstrap/bootstrap3-typeahead.js"></script>
<script src="<%=basePath%>/js/localTableTitle.js"></script>

<script>
        var tableTitleName="commodityProperty";
        var role=<%=sub.isPermitted("all")||sub.isPermitted("delete_history")%>;

        function initTable(tableTitle) {
            //先销毁表格
            $('#cusTable').bootstrapTable('destroy');
            //初始化表格,动态从服务器加载数据
            $("#cusTable").bootstrapTable({
                 method: "post",  //使用get请求到服务器获取数据
                contentType:"application/x-www-form-urlencoded; charset=UTF-8",
                url: "<%=basePath%>commodityProperty/queryCommodityPropertyByPage.do", //获取数据的Servlet地址
                striped: true,  //表格显示条纹
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
                uniqueId:'id',
                onEditableSave: function (field, row, oldValue, $el) {
                    $.ajax({
                        type: "post",
                        url: "<%=basePath%>commodityProperty/updateCommodityProperty.do",
                        data: row,
                        dataType: 'JSON',
                        success: function (data, status) {
                            if (status == "success") {
                                
                            }
                        },
                        error: function () {
                        },
                        complete: function () {

                        }
                    });
                    },
                queryParams: function queryParams(param) {   //设置查询参数
                     param = {
                        pageNum:this.pageNumber,
                        pageSize:this.pageSize,
                        sortName:this.sortName,
                        sortOrder:this.sortOrder,
                        sku:$("#sku").val(),
                        spu:$("#spu").val(),
                        goodsId:$("#goodsId").val(),
                        feature:$("#feature").val(),
                        property:$("#property").val(),
                    };
                    return param;
                    
                },
                onLoadError: function(){  //加载失败时执行
                	showTip("wait",500);
                },
                onLoadSuccess:function(data){
                	if(data.total>0){
                		$("#cusTable").css("table-layout","fixed");
                		/* 行内编辑，jquery tableedit插件启动 */
                		$(".th-inner").each(function (index,element){
                			$(this).attr("data-toggle","tooltip");
                			$(this).attr("data-placement","top");
                			$(this).attr("title",$(this).text());
                			
                		});
                    	$("[data-toggle='tooltip']").tooltip();
                    	$('#cusTable').Tabledit({
                    		restoreButton: false,
                    		url:"commodityProperty/postCommodityProper.do",
                		    columns: {
                		    	hideIdentifier: true,
                		        identifier: [0, 'id'],
                		        editable: [[1, 'sku'],[2, 'spu'],[3, 'goodsId'],[4, 'feature'],[5, 'property']]
                    		
                		    },
                		    onSuccess: function(data, textStatus, jqXHR) {
                		    	if(data)
                		    	toastr.success(data.data);
                		    	getTitle(tableTitleName,role);
                		    }
                		});
                	}else{
                		$("#cusTable").css("table-layout","auto");
                	}
                }
            });
        }
      var operate = {
          //初始化按钮事件
          operateInit: function () {
              this.operateDelete();
              this.operateImput();
              this.operateExput();
              this.DepartmentModel = {
            				  };
              ko.applyBindings(this.myViewModel, document.getElementById("tb_dept"));

          },
          //删除
          operateDelete: function () {
              $('#btn_delete').on("click", function () {
            	  var arrselectedData =  $('#cusTable').bootstrapTable("getAllSelections");
            	
            	  if (arrselectedData.length <= 0) {
            		  showTip("unselected",1000);
                      return ;
                  }
            	  $("#delcfmModel").modal().on("shown.bs.modal", function () {});
       
              });
          },
        //导入
          operateImput: function () {
              $('#btn_imput').on("click", function () {
            	  $("#downloadTemplate").attr("href","<%=basePath%>download/downloadTemplate.do?fileName="+tableTitleName+"Template"); 
            	  $("#myModalImoprt").modal().on("shown.bs.modal", function () {
 
                  }).on('hidden.bs.modal', function () {
                      //关闭弹出框的时候清除绑定(这个清空包括清空绑定和清空注册事件)
                  });
              });
          },
        //导出
          operateExput: function () {
              $('#btn_export').on("click", function () {
            	  $("#form2").submit();
              });
          },

      }
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
              maxFileCount: 5, //表示允许同时上传的最大文件个数
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
    
    	  $("#txt_file").on("fileuploaded", function (event, data, previewId, index) {
 			 $("#uploadRemark").append("<p>"+data.filenames.pop()+":"+data.response.data+"</p>");
 			getTitle(tableTitleName,role);
 			});
      $(function() { 
   $('#feature').typeahead({
         	   
         	   source: function (query, process) {
                    return $.ajax({
                        url: "<%=basePath%>commodityProperty/queryFeatureAndProperty.do",
                        type: 'post',
                        success: function (result) {
                     	   var featuresArray=new Array();
                     	   var  resultDa=JSON.parse(JSON.parse(result).data);
                     	   for(var a in resultDa){
                     		   featuresArray.push(resultDa[a].featuerKey);	
                     	   	}
                            return process(featuresArray);
                        },
                    });
                },
                showHintOnFocus:"all",
                items:"all",
                minLength:0,
         	   	updater: function(item) {
         	   		
         	   	$('#property').remove();
         	   	
				$("#selectp").append("<input id='property' data-provide='typeahead' class='form-controller queryConditions' >");
         	   		$('#property').typeahead({
         	   		
         	   		source: function (query, process) {
                   	   	return $.ajax({
         	                url: "<%=basePath%>commodityProperty/queryFeatureAndProperty2.do",
         	                type: 'post',
         	               cache:true,
         	                data:{"feature":item},
         	                success: function (result) {
         	             	   var propertyArray=new Array();
         	             	var  resultDa=JSON.parse(JSON.parse(result).data);
                       	   	for(var a in resultDa){
                       	   	propertyArray.push(resultDa[a].propertyArray);	
                       	   	}
                       	   	console.log(propertyArray);
         	                    return process(propertyArray);
         	                },
         	            });
         	        },
         	        items:"all",
         	        showHintOnFocus:"all",
         	        minLength:0
         	   		}); 
         		 return item;
         	}
            });
  //初始化左侧菜单栏
      	  $("#importData").attr("class", "nav nav-second-level in"); 

    	  $("#leftCommodityProperty").css("background","#578EBE");
    	getTitle(tableTitleName,role);
    	//初始化表格
      
      	//初始化增删查改
      	operate.operateInit();
      	//初始化上传文件
           inportInit("txt_file", "<%=basePath%>commodityProperty/uploadCommodityProperty.do");
  	//	pandora潘多拉官方旗舰店
  		var datetype = $("input[name='datetype']:checked").val();
  		$("input[name='datetype']:last").attr("checked", true);
  		//	json.series[1].tooltip.valueSuffix = 'k';
  		//		json.series[2].tooltip.valueSuffix = 'k';

  		$("#query").click(function() {
  		
  			getTitle(tableTitleName,role);
  		});


  	});
      function goToPage(){
    	  $('#cusTable').bootstrapTable("selectPage",Number($("#toPage").val()));
      }
          function deleteByArray(){
    	  var idArray=new Array();
    	  var arrselectedData =  $('#cusTable').bootstrapTable("getAllSelections");
    	  console.log("选择",arrselectedData);
    	  jQuery.each(arrselectedData, function(i, val) {  

    		    idArray[i]=val.id;  

    		});
    	var a=  {"idArray":idArray};
          $.ajax({
              url: "<%=basePath%>commodityProperty/deleteCommodityPropertyByBatch.do",
              type: "post",
              data:a,
              success: function (data, status) {
            	  $('#cusTable').bootstrapTable('remove', {field: 'id', values: idArray})
            	  if($('#cusTable').bootstrapTable('getData').length==0)
                      getTitle(tableTitleName,role);
              }
          });
    	  
      }
      function getFeaturesAndPropertys(){
    		 
    		 var a
    	     $.ajax({
    	         url: "<%=basePath%>commodityProperty/queryFeatureAndProperty.do",
    	         type: "post",
    	         data:a,
    	         success: function (data, status) {
    	      return JSON.parse(data).data;
    	         }
    	     });
    		 return a;
    	 }
 //单条删除
 function cpRowDelete(id){
	 
	 var a=  {"idArray":[id]};
	 
     $.ajax({
         url: "<%=basePath%>commodityProperty/deleteCommodityPropertyByBatch.do",
         type: "post",
         data:a,
         success: function (data, status) {
       	  toastr.success(JSON.parse(data).data);
        	 $('#cusTable').bootstrapTable('remove', {field: 'id',values:[id]});
       	  if($('#cusTable').bootstrapTable('getData').length==0)
                 getTitle(tableTitleName);
         }
     });
 }
</script>
</html>
