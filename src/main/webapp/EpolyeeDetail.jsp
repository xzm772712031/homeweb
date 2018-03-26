<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">  
    <title>My JSP 'UpdateInsurance.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="css/layui.css">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
  </head>
  <body>
  
  <form class="layui-form" method="post" action="updateEpolyee">
   <div class="layui-inline">
      <label class="layui-form-label">员工编号</label>
      <div class="layui-input-inline">
        <input type="text" name="epolyeeId"  autocomplete="off" class="layui-input"  value="${e.epolyeeId}" >
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">员工姓名</label>
      <div class="layui-input-inline">
        <input type="text" name="epolyeeName"  autocomplete="off" class="layui-input" value="${e.epolyeeName}" >
      </div>
    </div>
	<br><br>
      <div class="layui-inline">
      <label class="layui-form-label">员工职位</label>
      <div class="layui-input-inline">
       <select  lay-filter="aihao" name="job_Id">
        <option value=${e.job_Id }>${e.job.jobName }</option>
        <c:forEach items="${job}" var="job"> 
        <option value='${job.jobId}' > ${job.jobName} </option>
       </c:forEach>
      </select> 
      </div>
    </div> 
    <div class="layui-inline">
      <label class="layui-form-label">员工性别</label>
      <div class="layui-input-inline">
       <select  lay-filter="aihao" name="epolyeeSex">
        <option value="${e.epolyeeSex}">${e.epolyeeSex}</option>
        <option value="男">男</option> 
        <option value="女">女</option> 
      </select> 
      </div>
    </div>
	<br><br>
	  <div class="layui-inline">
      <label class="layui-form-label">员工年龄</label>
      <div class="layui-input-inline">
        <input type="text" name="epolyeeAge"  autocomplete="off" class="layui-input" value="${e.epolyeeAge}" >
      </div>
    </div>
	 <div class="layui-inline">
      <label class="layui-form-label">员工电话</label>
      <div class="layui-input-inline">
        <input type="text" name="epolyeeTel"  autocomplete="off" class="layui-input" id="epolyeeTel" value="${e.epolyeeTel}" >
      </div>
    </div>
	<br><br>
	 <div class="layui-inline">
      <label class="layui-form-label">员工状态</label>
      <div class="layui-input-inline">   
        <select name="interest" lay-filter="aihao" id="insuranceState">
        <c:if test="${e.epolyeeState}==0">
        <option value=0>待命</option>
        </c:if>
        <c:if test="${e.epolyeeState}==1">
        <option value=1>任务中</option>
        </c:if>
         <c:if test="${e.epolyeeState}==2">
        <option value=1>离职</option>
        </c:if>
        <option value=0>待命</option>
        <option value=1>任务中</option> 
         <option value=1>离职</option> 
      </select> 
      </div>
    </div>
	<br><br>
    <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="submit" value="立即提交" id="btn2">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>  
  </form>
  <script src="layui.all.js"></script>
  </body>
</html>
