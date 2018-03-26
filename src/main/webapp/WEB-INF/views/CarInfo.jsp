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
    <title>My JSP 'CarInfo.jsp' starting page</title>   
	 <base href="<%=basePath%>">
   <title>layui</title>
   <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title></title>
    <link rel="stylesheet" href="css/layui.css">
    <script src="layui.all.js"></script>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
  </head>
  <body>
   <c:forEach items="${carmsg.lists}" var="c">
   ${c.car_Id} <br>
   ${c.carType.carType_Name} <br>
   
   </c:forEach>
  </body>
</html>
