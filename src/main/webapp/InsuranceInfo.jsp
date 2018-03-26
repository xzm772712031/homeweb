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
	</script>
  </head>
  <body>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>保险列表</legend>
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
        <th>保险编号</th>
        <th>受益人</th>
        <th>保额</th>
        <th>相关收费</th>
        <th>创建时间</th>
        
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${carlist.lists}" var="car">
      <tr>
        <td>${car.carId}</td>
        <td>${car.carName }</td>
        <td>${car.cartype.carTypeName}</td>
        <td>${car.carClient }</td>
        <td>
       
        <button class="layui-btn">详情修改</button>
        <button class="layui-btn">删除</button>
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