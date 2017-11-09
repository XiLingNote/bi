	var relation = {
		ACC : "配饰",
		All : "百秋到帐",
		Bag : "箱包",
		Shoes : "鞋履",
		Dress : "服饰"
	};
	var _class = ["panel-danger","panel-primary","panel-success","panel-warning","panel-info"];

	function sort(field) {
		$.post("/alipay/inAmountJson.do", {
			field : field
		}, function(data) {
			LabelName(data);
		});

		if (field == "todaySale") {
			$(".img1").attr("src", "/img/label/dayOn.png");
			$(".img2").attr("src", "/img/label/monthOff.png");
			$(".img3").attr("src", "/img/label/rateOff.png");
		} else if (field == "gmv") {
			$(".img1").attr("src", "/img/label/dayOff.png");
			$(".img2").attr("src", "/img/label/monthOn.png");
			$(".img3").attr("src", "/img/label/rateOff.png");
		} else if (field == "alipayRate") {
			$(".img1").attr("src", "/img/label/dayOff.png");
			$(".img2").attr("src", "/img/label/monthOff.png");
			$(".img3").attr("src", "/img/label/rateOn.png");
		}
		;
	}
	function LabelName(data) {
		console.log(data);
		/* 部门，公司统计 按照当日alipay到账排序 */
		
			/* 显示名称 value.showName*/
			/* 本月alipay value.gmv*/
			/* 本月alipay 完成率  value.gmvRate*/
			/* 今日alipay value.todaySale*/
			
			/* 昨日alipay value.yesterdaySale*/
			
			/* 上月alipay  value.lastMonthGmv*/
			
			
		$(".c_div_salip_11").empty();
		var topHtml = "";
		/* console.log(data.depart); */
		$.each(data.depart, function(i, value) {
			var aaa = value.showName;
			var num = i;
			while(num>4){
				num = i-3;
			}
			var c = _class[num];
			if(value.showName == 'All'){
				topHtml = topHtml
				+"<div class='panel "+ c+ "'>"
				+"<div class='panel-heading'><h3 class='panel-title'>"
		 		+ relation[aaa] +"&nbsp;&nbsp;("+value.gmvRate.toFixed(1)+"%)"
		 		+ "</h3></div><div class='panel-body panel-body1'><table class='table table-condensed'>"
		 		+ "<thead><tr><th class='c_g_left' style='width: 50%;'>今日:</th><th class='c_g_left' style='width: 50%;'>本月:</th>"
		 		+ "</tr><tr><th class='c_g_right'>"
		 		+ formatNum(value.todaySale.toFixed(0))
		 		+ "</th><th class='c_g_right'>"
		 		+ formatNum(value.gmv.toFixed(0)) 
		 		+ "</th></tr></thead><tr><td>昨日:</td><td>上月:</td></tr><tr><td class='c_g_right'>"
		 		+ formatNum(value.yesterdaySale.toFixed(0))
		 		+ "</td><td class='c_g_right'>"
		 		+ formatNum(value.lastMonthGmv.toFixed(0)) 
		 		+ "</td></tr></table></div></div>";
			}else{
				topHtml = topHtml
				+ "<div class='panel "+ c+ "'>"
				+ "<div class='panel-heading'><h3 class='panel-title'>"
				+ relation[aaa] +"&nbsp;&nbsp;("+value.gmvRate.toFixed(1)+"%)"
				+ "</h3></div><div class='panel-body'>"
				+ "<table class='table table-condensed'><thead><tr>"
				+ "<th class='c_g_right' style='width:50%;'>"
				+ "<span class='c_g_right1'>今日:</span>"+formatNum(value.todaySale.toFixed(0))+"</th>"
				+ "<th class='c_g_right' style='width:50%;'>"
				+ "<span class='c_g_right2'>本月:</span>"+formatNum(value.gmv.toFixed(0))+"</th>"
				+ "</tr></thead><tr>"
				+ "<td class='c_g_right'><span class='c_g_right1'>昨日:</span>"+formatNum(value.yesterdaySale.toFixed(0))+"</td>"
				+ "<td class='c_g_right'><span class='c_g_right2'>上月:</span>"+formatNum(value.lastMonthGmv.toFixed(0))+"</td>"
				+ "</tr></table></div></div>";
			}
		});
		/* alert(topHtml); */
		$(".c_div_salip_11").append(topHtml);
		/* 店铺数据 按照要求排序*/
		var shopHtml = "";
		   $('.table-striped1 tbody tr').remove();
		$.each(data.shopSet, function(name, value) {
			shopHtml = shopHtml 
			+	"<tr class='shop_nm'>"
			+	"<td colspan='2'> "+value.showName+"&nbsp;&nbsp;("+value.gmvRate.toFixed(1)+"%)</td>"
			+	"</tr><tr>"
			+	"<th class='c_g_right' style='width:50%;'><span class='c_g_right1'>今日:</span>"+formatNum(value.todaySale.toFixed(0))+"</th>"
			+	"<th class='c_g_right' style='width:50%;'><span class='c_g_right2'>本月:</span>"+formatNum(value.gmv.toFixed(0))+"</th>"
			+	"</tr><tr>"
			+	"<td class='c_g_right'><span class='c_g_right1'>昨日:</span>"+formatNum(value.yesterdaySale.toFixed(0))+"</td>"
			+	"<td class='c_g_right'><span class='c_g_right2'>上月:</span>"+formatNum(value.lastMonthGmv.toFixed(0))+"</td>"
			+	"</tr>";			
		});
		$('.table-striped1 tbody').append(shopHtml);	
	}
	
	$(function(){
		sort('todaySale');
	});