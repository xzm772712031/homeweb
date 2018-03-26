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
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title></title>
<link rel="stylesheet" href="css/layui.css">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
  function update(bespeak_Id,bespeakAtten,user_Id){
	
  layer.confirm('确认预约?', {icon: 3, title:'提示'}, function(index){
  location.href="confirmBespeak?bespeakId="+bespeak_Id+"&bespeakAtten="+bespeakAtten+"&user_Id="+user_Id;
  layer.close(index);
});    
	}
	function info(bespeakId){
	 layer.open({
     title: '用户修改',
     area: ['60%', '80%'],
     type: 2,
     content: 'showBespeakDetail?bespeakId='+bespeakId
      });    
     layer.iframeAuto(index);
       
	}
	
	</script>
	
</head>
<body>
<div style=" width:auto">
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>预约列表</legend>
	</fieldset>
	
    	
    	
    	
	</div>
	<script src="layui.all.js"></script>
	<script>
var table = layui.table;
//转换静态表格
table.init('demo', {
 height:450,
 border:0,
 width:auto
 
  //支持所有基础参数
}); 

</script>
</body>
</html>
