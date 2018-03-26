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
  <form class="layui-form" method="post" action="feedbackhandle">
   <div class="layui-inline">
      <label class="layui-form-label">反馈编号</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input" readonly="readonly" value="${fb.feedbackId}" name="feedbackId" >
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">客户姓名</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input" value="${fb.user.userName}" readonly="readonly">
      </div>
    </div>
	<br><br>
      <div class="layui-inline">
      <label class="layui-form-label">反馈类型</label>
      <div class="layui-input-inline">
        <input type="text"   autocomplete="off" class="layui-input" value="${fb.feedbacktype.feedbackTypeName}" readonly="readonly" >
      </div>
    </div> 
    <div class="layui-inline">
      <label class="layui-form-label">反馈时间</label>
      <div class="layui-input-inline">
        <input type="text"  autocomplete="off" class="layui-input" value="${fb.strDate}" readonly="readonly" >
      </div>
    </div>
	<br><br>
	  <div class="layui-inline">
      <label class="layui-form-label">反馈标题</label>
      <div class="layui-input-inline">
        <input type="text"  autocomplete="off" class="layui-input" value="${fb.feedbackTitle}" readonly="readonly">
      </div>
    </div>
    	<br><br>
	 <div class="layui-inline">
      <label class="layui-form-label">反馈内容</label>
      <div class="layui-input-inline">
      <textarea placeholder="请输入内容" class="layui-textarea" style="width: 440px" name="insuranceComment" readonly="readonly">
      ${fb.feedbackContent}
      </textarea >
      </div>
    </div>
	<br><br>
	 <div class="layui-inline">
      <label class="layui-form-label">图片附件</label>
      <div class="layui-input-inline"> 
      <img src="/pic/${fb.feedbackImage} " height="300" width="400">  
       </div>
    </div>
	<br><br>	
	<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">回复处理</label>
    <div class="layui-input-block" style="width: 50%" >
      <textarea placeholder="请输入内容" class="layui-textarea" style="width: 440px" name="feedback" >${fb.feedback}</textarea >
    </div>
  </div>
    <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="submit" value="回复处理" id="btn2">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>  
  </form>
  <script src="layui.all.js"></script>
  </body>
</html>
