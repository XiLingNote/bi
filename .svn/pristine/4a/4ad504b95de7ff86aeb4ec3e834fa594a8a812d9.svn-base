$(function(){
    initForm();
})
 

//选中事件
function changeState(dom){
    if($(dom).prop("checked")){
        $('#Form').parent().parent().css('height','400px');
        $('#Form').parent().css('height','366px');
        $("#divEndTime").show();
    }else{
        $('#Form').parent().parent().css('height','330px');
        $('#Form').parent().css('height','296px');
        $("#divEndTime").hide();
    }
}
var addIndex;
//打开弹出层
function openLayer(date){
    $("#id").val("");
    $("#del").hide();
    $('#Form')[0].reset();
    $('#endTimeChk').prop("checked",false);
    changeState('#endTimeChk');
    $('#startTime').val(new Date(date).Format("yyyy-MM-dd hh:mm:ss"));
    addIndex=layer.open({
        title : '<i class="fa fa-plus"></i>&nbsp;新增日程',
        type : 1,
        fix : false,
        skin : 'layui-layer-rim',
        // 加上边框
        area : [ '470px', '330px' ],
        // 宽高
        content : $('#Form')
    });
}
function openEditLayer(data){
    $("#del").show();
    $('#Form')[0].reset();
    $('#endTimeChk').prop("checked",false);
    changeState('#endTimeChk');
    $('#Form').autofill(data);
    $('#startTime').val(data.start.Format("yyyy-MM-dd hh:mm:ss"));
    $('#endTime').val(data.start.Format("yyyy-MM-dd hh:mm:ss"));
    /*$('#startTime').val(new Date(date).Format("yyyy-MM-dd hh:mm:ss"));*/
    addIndex=layer.open({
        title : '<i class="fa fa-plus"></i>&nbsp;编辑日程',
        type : 1,
        fix : false,
        skin : 'layui-layer-rim',
        // 加上边框
        area : [ '470px', '330px' ],
        // 宽高
        content : $('#Form')
    });
}
//关闭弹出层
function closeLayer(){
    layer.close(addIndex);
}
//初始化日程视图
//进入下一个月视图
//初始化表单
function initForm(){
    $("#Form").mvalidate({
        type: 1,
        onKeyup: true,
        sendForm: false,
        autoFocus: true,
        firstInvalidFocus: true,
        // 点击提交按钮时,表单通过验证触发函数
        valid: function(event, options) {

            //根据自己的编辑添加业务保存数据，不需要参考一下方法，只需要参考我标注的两个方法；
            if($('#endTimeChk').prop("checked")){
                if($('#endTime').val()==null||$('#endTime').val()==''){
                    layer.msg('<i class="spl-icon-volume-1"></i>&nbsp;请选择结束时间');
                    return;
                }
            }
            var obj=$('#Form').serializeObject();
            if($('#wholeChk').prop("checked")){
                obj.allDay=true;
                delete obj.end;
            }else{
                obj.allDay=false;
            }

            /////////////////////////////////////////
            //方法二 编辑添加
            if(obj.id==null||obj.id==''){
                dataSource.push(obj);
            }else{
                for (var i = 0; i < dataSource.length; i++) {
                    if(dataSource[i].id==obj.id){
                        dataSource.splice(i,1,obj);
                    }
                }
            }

            //自己写提交数据库数据，我这里是模拟提交数据
            //读取的也是本地数据
            var jsonStr=JSON.stringify(dataSource);
            $.ajax({//获取数据
                type : "POST",
                url : urlRootContext + '/demo/addData.do',
                data:{jsonStr:jsonStr},
                dataType : 'json',
                success : function(data) {
//                  方法一
//                  if(obj.id==null||obj.id==''){
//                      //数据入库之后调用一下方法
//                      $('#calendar').fullCalendar('renderEvent', obj, true);
//                  }else{
//                      //数据入库之后调用一下方法
//                      $('#calendar').fullCalendar('updateEvent', obj);
//                  }
//                  方法二
                    $('#calendar').fullCalendar('refetchEvents'); 
                    closeLayer();
                    layer.msg("获取数据成功", { time : 2000});
                }
            });

        },
        // 点击提交按钮时,表单未通过验证触发函数
        invalid: function(event, status, options) {

        },
        // 点击提交按钮时,表单每个输入域触发这个函数 this 执向当前表单输入域，是jquery对象
        eachField: function(event, status, options) {

        },
        eachValidField: function(val) {},
        eachInvalidField: function(event, status, options) {},
        conditional: {

        },
        descriptions : {
        content : {
            required : '<i class="spl-icon-volume-1"></i>&nbsp;请填写日程内容'
        },
        startTime : {
            required : '<i class="spl-icon-volume-1"></i>&nbsp;请选择开始时间'
        }
        }
    });
}



function del(){
    var id=$("#id").val();
    for (var i = 0; i < dataSource.length; i++) {
        if(dataSource[i].id==id){
            dataSource.splice(i,1);
            break;
        }
    }
    var jsonStr=JSON.stringify(dataSource);

    layer.confirm('您确定删除该日程吗?', function(){ 
        $.ajax({//获取数据
            type : "POST",
            url : urlRootContext + '/demo/addData.do',
            data:jsonStr,
            dataType : 'json',
            success : function(data) {
                closeLayer();
                layer.msg("获取数据成功", { time : 2000});
                /////////////////////////////////////////
                //方法一
                 //$('#calendar').fullCalendar('removeEvents', id);
                /////////////////////////////////////////
                //方法二
                $('#calendar').fullCalendar('refetchEvents'); 
            }
        });
    });
}