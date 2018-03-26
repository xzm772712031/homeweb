<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'OrderPerson.jsp' starting page</title>
<base href="<%=basePath%>">
<title>My JSP 'BespeakInfo.jsp' starting page</title>
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="css/layui.css">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script src="layui.all.js"></script>
</head>
<body >
<form action="epolyeeOrder" method="post">
<table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
   
      <th>姓名</th>
      <th>职位</th>
      <th>联系方式</th>
    </tr> 
  </thead>
  <tbody>
  
  <c:forEach items="${epolyee }" var="e">
    <tr>
      <td><input type="checkbox" value="${e.eployee_Id}" name="eployee_Id" >${e.eployee_Name}</td>
      <td>${e.branch.branch_Name}</td>
      <td>${e.tel}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
 <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
</div>
</form>
</body>
</html>
