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
	function update(User_id){
	
	 layer.open({
     title: '用户修改',
     area: ['780px', '600px'],
     type: 2,
     content: 'selectUserById?user_Id='+User_id

      });    
     layer.iframeAuto(index);
     
      
	}
	
	</script>
  </head>
  <body>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>客户列表</legend>
</fieldset>
<div class="layui-form">
<table class="layui-table"  lay-size="lg" lay-filter="demo">
  <thead>
    <tr >
      <th lay-data="{field:'user_ID', width:120,sort:true}">客户编号</th>
      <th lay-data="{field:'user_Name', width:120}">客户姓名</th>
      <th lay-data="{field:'user_Tel', width:120}">客户电话</th>
      <th lay-data="{field:'user_Email', width:200}">客户邮箱</th>
      <th lay-data="{field:'user_QQ', width:150}">客户QQ</th>
      <th lay-data="{field:'user_PersonId', width:200}">客户身份证</th>
      <th lay-data="{field:'user_Address', width:150}">客户所在地</th>
      <th lay-data="{field:'add', width:170}"></th>
    </tr> 
  </thead>
  <tbody>
    <c:forEach items="${userlist }" var="u">
    <tr>
      <td lay-data="sort: true">${u.user_Id }</td>
      <td>${u.user_Name }</td>
      <td>${u.user_Tel }</td>
      <td>${u.user_Email }</td>
      <td>${u.user_QQ }</td>
      <td>${u.user_PersonId }</td>
      <td>${u.user_Address }</td>
       <td>
     <div class="layui-btn-group">
    <button class="layui-btn layui-btn-primary layui-btn-small" onclick="update(${u.user_Id })" ><i class="layui-icon"></i></button>
    <button class="layui-btn layui-btn-primary layui-btn-small" onclick="add(${u.user_Id })" ><i class="layui-icon"></i></button>
    <button class="layui-btn layui-btn-primary layui-btn-small"><i class="layui-icon"></i></button>
  </div></td>
      </tr>
    </c:forEach>
  </tbody>
</table> 
</div>               
<script src="layui.all.js"></script>
<script>
var table = layui.table;
//转换静态表格
table.init('demo', {
 height:500,

  //支持所有基础参数
}); 
    
</script>
  </body>
</html>
