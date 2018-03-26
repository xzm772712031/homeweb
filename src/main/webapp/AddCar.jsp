<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'BespeakInfo.jsp' starting page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title></title>
<link rel="stylesheet" href="css/layui.css">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(function(){
        $("#btn").click(function(){
        var carName = $("#carName").val();
        var carClient = $("#carClient").val();
        var carType = $("#carType").val();  
        if(carName.length==0||carClient.length==0){
         layer.msg("关键字段不能为空",function(){
         return false;
         })   
         return false;
        }     
else{
            $.ajax({
                type:'post',
                url:'addCar',
                dataType:"json",
                data:{
                carName:carName,
                carClient:carClient,
                carType:carType,
                },
                success:function(data){
                 if(data==true){
                    alert("车辆添加成功");
                    }                                 
              }    
              
            })
            
            
            }
             });              
}); 
</script>

</head>
<body>
<div style="width: 600px; float: centre">

	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>车辆新增</legend>
	</fieldset>	
     	<form class="layui-form">   
    	<div class="layui-inline">
      <label class="layui-form-label">车辆名称</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input"  id="carName">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">车辆牌照</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input"  id="carClient">
      </div>
    </div>
	<br><br>

	 <div class="layui-inline">
      <label class="layui-form-label">车辆型号</label>
      <div class="layui-input-inline">
       
       <select name="interest" lay-filter="aihao" id="carType">
         <c:forEach items="${cartype}" var="c"> 
        <option value=${c.carTypeId }>${c.carTypeName }</option> 
        </c:forEach>
      </select>
     
     </div>
    </div>
<br><br>
   <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="button" value="新增车辆" id="btn">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
    </div>
    </form>
  </div>  
<script src="layui.all.js"></script>
</body>
</html>
