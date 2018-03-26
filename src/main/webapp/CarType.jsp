<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
   <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title></title>
    <link rel="stylesheet" href="css/layui.css">
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">
	function del(Id){
  layer.confirm('删除该类型?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'delCarType',
                dataType:"json",
                data:{carTypeId:Id},
                success:function (data){
                 if(data==true){  
                  layer.msg("删除成功",function(){
                   location.reload(true);    
                });
                   }                                
              }
            })
  layer.close(index);
});	
}

function add(){
	 layer.open({
     title: '新增类别',
     area: ['35%', '50%'],
     type: 2,
     content: 'AddCarType.jsp'
     }); 
     layer.iframeAuto(index);
	}
	</script>
  </head>
  <body>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>车辆列表</legend>
</fieldset>
  <div class="layui-form">
  <table class="layui-table">
   <colgroup>
      <col width="150">
      <col width="150">
      <col width="200">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th>车辆类型编号</th>
        <th>车辆类型名称</th>
        <th>操作</th>
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${cartype}" var="type">
      <tr>
        <td>${type.carTypeId}</td>
        <td>${type.carTypeName }</td>
        <td>
        <button class="layui-btn" onclick="del(${type.carTypeId})">修改</button>
        </td>
      </tr>
   </c:forEach>  
    </tbody>
  </table>
  </div>
<script src="layui.all.js"></script>
<script>
</script>
  </body>
</html>
