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
		function update(carId){
	 layer.open({
     title: '车辆详情',
     area: ['60%', '80%'],
     type: 2,
     content: 'selectCarById?carId='+carId
      });    
     layer.iframeAuto(index);
	}
	function del(carId){
  layer.confirm('删除车辆?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'delCar',
                dataType:"json",
                data:{carId:carId},
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

function exp(){
  layer.confirm('进行Excel导出？导出文件位于D根目录下，注意保存备份。', {icon: 3, title:'提示'}, function(index){
  location.href="ExcelExportCar";
  layer.close(index);
});   
	}
	</script>
  </head>
  <body>
<form class="layui-form" action="selectCarByLike" method="post"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
<table>
<tr>
<td><input type="text"  placeholder="请输入搜索条件" autocomplete="off" class="layui-input" name="parameter" ></td><td>&nbsp;</td>
<td><button class="layui-btn" lay-submit lay-filter="*">搜索</button></td> <td>&nbsp;&nbsp;</td>
<td><input type="button" class="layui-btn layui-btn-normal" lay-submit lay-filter="*" onclick="exp()" value="导出Excel"></td>
</tr>  
</table>
</form>
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
        <th>车辆编号</th>
        <th>车辆名称</th>
        <th>车辆类型</th>
        <th>车辆牌照</th>
        <th>车辆状态</th>
        <th>操作</th>
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${car}" var="car">
      <tr>
        <td>${car.carId}</td>
        <td>${car.carName }</td>
        <td>${car.cartype.carTypeName}</td>
        <td>${car.carClient }</td>
        <td>
        <c:if test="${car.carState==0 }">
                             待命
        </c:if>
         <c:if test="${car.carState==1 }">
                             使用中
        </c:if>
        </td>
        <td>
        <c:if test="${car.carState==0 }">
        <button class="layui-btn" onclick="update(${car.carId})">详情修改</button>
        </c:if>
          <c:if test="${car.carState==1 }">
        <button class="layui-btn" onclick="update(${car.carId})">详情修改</button>
        </c:if>
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
