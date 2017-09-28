$(function(){
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
   	  	var viewmonth =(month>8)?(month+1):"0"+(month+1);
   	  	$('#queryStartDate').val(year + "-" + viewmonth+ "-" + day);
   	   
     $("#queryStartDate").datetimepicker(options).on('changeDate',
 			function(ev) {
		});
     $("#queryEndDate").datetimepicker(options).on('changeDate',
 			function(ev) {
		});
})
   

/**obj转换string
 * @param obj
 */
function objToString(obj){
	var txt='';
for (x in obj)  
 
  {  

   txt=txt + obj[x];  

  }
	return txt
}
/**array 转String
 * @returns {String}
 * JSON.parse(jsonstr)字符串转json
 */
function arrayToString(arr){
	var text='';
	jQuery.each(arr, function(i, val) {  

	    text = text + " Index:" + i + ":" + JSON.stringify(val);  

	});  
	return text;
}
