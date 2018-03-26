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
  <form class="layui-form" method="post" action="updateInsurance">
   <div class="layui-inline">
      <label class="layui-form-label">保单编号</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input" readonly="readonly" value="${i.insuranceId}" name="insuranceId" >
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">创建时间</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input" value="${i.strDate}" readonly="readonly">
      </div>
    </div>
	<br><br>
      <div class="layui-inline">
      <label class="layui-form-label">受益人</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input" value="${i.insuranceOwner}" name="insuranceOwner">
      </div>
    </div> 
    <div class="layui-inline">
      <label class="layui-form-label">身份证</label>
      <div class="layui-input-inline">
        <input type="text"  autocomplete="off" class="layui-input" value="${i.ownerIdentify}" name="ownerIdentify">
      </div>
    </div>
	<br><br>
	  <div class="layui-inline">
      <label class="layui-form-label">保额(万元)</label>
      <div class="layui-input-inline">
        <input type="text"  autocomplete="off" class="layui-input" value="${i.insurancePrice}" name="insurancePrice">
      </div>
    </div>
	 <div class="layui-inline">
      <label class="layui-form-label">需付保费(元)</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input" name="insuranceCost" value="${i.insuranceCost}"  >
      </div>
    </div>
	<br><br>
	 <div class="layui-inline">
      <label class="layui-form-label">保险状态</label>
      <div class="layui-input-inline">   
        <select lay-filter="aihao" name="insuranceState">
        <c:if test="${i.insuranceState==0} ">
        <option value=0>未确认</option>
        </c:if>
        <c:if test="${i.insuranceState==1}">
        <option value=1>已确认</option>
        </c:if>
         <c:if test="${i.insuranceState==2}">
        <option value=2>客户申保</option>
        </c:if>
         <c:if test="${i.insuranceState==3}">
        <option value=3>已受理</option>
        </c:if>
         <c:if test="${i.insuranceState==4}">
        <option value=4>已驳回</option>
        </c:if>
        <option value=0>未确认</option>
        <option value=1>已确认</option> 
        <option value=2>客户申保</option>
        <option value=3>已受理</option> 
        <option value=4>已驳回</option>    
      </select> 
      </div>
    </div>
	<br><br>	
	<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">保险说明</label>
    <div class="layui-input-block" style="width: 50%" >
      <textarea placeholder="请输入内容" class="layui-textarea" style="width: 440px" name="insuranceComment"></textarea >
    </div>
  </div>
  <c:if test="${admin.adminRole!=2}">
    <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="submit" value="立即提交" id="btn2">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
    
  </div> 
  </c:if> 
  </form>
  <script src="layui.all.js"></script>
  </body>
</html>
