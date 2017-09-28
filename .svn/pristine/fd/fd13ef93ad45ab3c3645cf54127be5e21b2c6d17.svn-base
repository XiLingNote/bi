    //动态表头
    function   getTitle(tableName,role){
    	var date ={"tableName":tableName}
    	$.ajax({
            url: "/table/getTableTitle.do",
			type : "post",
			data : date,
			success : function(data, status) {
				var arr = new Array();
				if(tableName!="commodityProperty"){
				arr.push({
					title : '全选',
					field : 'select',
					checkbox : true,
					width : 50,
					align : 'center',
					valign : 'middle',
					
					formatter : function(value, row, index) {
						var nowdate=new Date();
						nowdate.setMonth(nowdate.getMonth()-2);
						if(new Date(row.date)<nowdate&&!role){
						        return {
						            disabled : true
						        };
							}
						}
						
				});
				}
				var jsonData = JSON.parse(data);
				for (a in jsonData) {
					if (jsonData[a].formatter == "percent") {
						arr.push({
							title : jsonData[a].title,
							field : jsonData[a].field,
							width : jsonData[a].width,
							sortable : true,
							formatter : function(value, row, index) {
								return (Number(value) * 100).toFixed(2) + "%";
							}

						});
					}else if (jsonData[a].formatter == "amount") {
						arr.push({
							title : jsonData[a].title,
							field : jsonData[a].field,
							width : jsonData[a].width,
							sortable : true,
							formatter : function(value, row, index) {
								return (Number(value)).toFixed(2);
							}

						});
					}else if (jsonData[a].formatter == "totalAmount") {
						arr.push({
							title : jsonData[a].title,
							field : jsonData[a].field,
							width : jsonData[a].width,
							sortable : true,
							formatter : function(value, row, index) {
								return Math.floor(Number(value));
							}

						});
					}
					else if (jsonData[a].formatter == "integer") {
						arr.push({
							title : jsonData[a].title,
							field : jsonData[a].field,
							width : jsonData[a].width,
							sortable : true,
							formatter : function(value, row, index) {
								return (Number(value)).toFixed(0);
							}

						});
					}else if (jsonData[a].formatter == "integerAndPercent") {
						arr.push({
							title : jsonData[a].title,
							field : jsonData[a].field,
							width : jsonData[a].width,
							sortable : true,
							formatter : function(value, row, index) {
								if(Number(value>=1))
									return (Number(value).toFixed(0));
									else
									return (Number(value) * 100).toFixed(2) + "%";
							}

						});
					} else if (jsonData[a].formatter == "hidden") {
						arr.push({
							title : jsonData[a].title,
							field : jsonData[a].field,
							width : jsonData[a].width,
							sortable : true,
							class:"hidden",
						});
					} 
					else {
						arr.push({
							title : jsonData[a].title,
							field : jsonData[a].field,
							width : jsonData[a].width,
							sortable : true,
							formatter : function(value, row, index) {
								return value;
							}

						});

					}

				}
				initTable(arr);
			}
		});

	}
/**
 * 日期插件初始化:只能初始化默认
 * 
 */
    function initDate(){
    	 //日期插件初始化
        var options = {
    			weekStart : 1,
    			todayBtn : 1,
    			autoclose : 1,
    			todayHighlight : 1,
    			startView : 2,
    			minView : 2,
    			format : 'yyyy-mm-dd',
    			forceParse : 0,
    			todayButton:true
    		};
  	  $("#queryStartDate").datetimepicker(options);
  	  $("#queryEndDate").datetimepicker(options);
  	     var  end = new Date();
  	  	var day = end.getDate();
  	  	var year = end.getFullYear();
  	  	var month = end.getMonth();
  	    }
    /**
     * 日期格式化
     * 使用方式：
     * end.format("yyyy-MM-dd")
     */
	Date.prototype.format = function(format) {
		var o = {
			"M+" : this.getMonth() + 1, //month \
			"d+" : this.getDate(), //day 
			"h+" : this.getHours(), //hour 
			"m+" : this.getMinutes(), //minute 
			"s+" : this.getSeconds(), //second 
			"q+" : Math.floor((this.getMonth() + 3) / 3), //quarter 
			"S" : this.getMilliseconds()
		//millisecond 
		}

		if (/(y+)/.test(format)) {
			format = format.replace(RegExp.$1, (this.getFullYear() + "")
					.substr(4 - RegExp.$1.length));
		}

		for ( var k in o) {
			if (new RegExp("(" + k + ")").test(format)) {
				format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k]
						: ("00" + o[k]).substr(("" + o[k]).length));
			}
		}
		return format;
	}