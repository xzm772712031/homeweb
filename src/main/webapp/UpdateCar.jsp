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
</script>
</head>
<body>
<div style="width: 600px; float: centre">
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>车辆信息修改</legend>
	</fieldset>	
     	<form class="layui-form" action="updateCar" method="post">   
    	<div class="layui-inline">
      <label class="layui-form-label">车辆名称</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input"  name="carName" value="${car.carName}" >
         <input type="hidden"   autocomplete="off" class="layui-input"  name="carId" value="${car.carId}"  >
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">车辆牌照</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input"  name="carClient" value="${car.carClient}">
      </div>
    </div>
	<br><br>
	 <div class="layui-inline">
      <label class="layui-form-label">车辆型号</label>
      <div class="layui-input-inline">  
       <select name="carType" lay-filter="aihao" id="carType"> 
       <option value=${car.carType }>${car.cartype.carTypeName }</option> 
         <c:forEach items="${cartype}" var="c"> 
        <option value=${c.carTypeId }>${c.carTypeName }</option> 
        </c:forEach>
      </select>  
     </div>
    </div>
<br><br>
   <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="submit" value="车辆信息修改" id="btn">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
    </div>
    </form>
  </div>
<script src="layui.all.js"></script>
</body>
</html>
