<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  </head>
  <script type="text/javascript">
	
	
	function addPerson(bespeak_Id){
	
     layer.open({
     title: '新增订单-人员安排',
     area: ['60%', '60%'],
     type: 2,
     content: 'epolyeebyOrder'
    
      });    
     
	}
	
	</script>
  <body>
  
  <input type="hidden" name="user_Id" value="${bespeak.user_Id} }">
  
  <input type="hidden" name="bespeak_Id" value="${bespeak.bespeak_Id}">
  
 <form class="layui-form" action="updateUser" method="post">
 <div class="layui-form-item">
    <label class="layui-form-label">客户姓名</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
    </div>
</div>

<div class="layui-form-item">
    <label class="layui-form-label">联系电话</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入联系电话" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
    </div>
</div>  

<div class="layui-form-item">
    <label class="layui-form-label">客户所在地</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入搬入地址" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
</div>
</div>

<div class="layui-form-item">
    <label class="layui-form-label">搬出地</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入搬出地址" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
    </div>
</div>  

<div class="layui-form-item">
    <label class="layui-form-label">搬出地</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入搬出地址" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
    </div>
</div> 

<div class="layui-form-item">
    <label class="layui-form-label">服务类型</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入搬入地址" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
</div>
</div>


<div class="layui-form-item">
    <label class="layui-form-label">车辆与人员安排</label>
    <div class="layui-input-block">
<button class="layui-btn" type="button" onclick="addPerson()" >
  <i class="layui-icon">&#xe608;</i> 添加人员
</button>
<button class="layui-btn" onclick="">
  <i class="layui-icon">&#xe608;</i> 添加车辆
</button>
</div>
</div>



<div class="layui-form-item">
    <label class="layui-form-label">说明</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入搬入地址" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
</div> 


<div class="layui-form-item">
    <label class="layui-form-label">订单金额</label>
    <div class="layui-input-block">
      <input type="text" name="Customer" required  lay-verify="required" placeholder="请输入搬入地址" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
</div> 


</div>  
</form>
<script src="layui.all.js">
//Demo
layui.use('form', function(){
  //监听提交
  form.on('submit(formDemo)', function(data){
   /*  layer.msg(JSON.stringify(data.field));
    layer.closeAll('page'); //关闭所有页面层 */
    window.close();
    return false;
  });
});
</script>

<script src="layui.all.js">
//Demo
layui.use('form', function(){
  //监听提交
  form.on('submit(formDemo)', function(data){
   /*  layer.msg(JSON.stringify(data.field));
    layer.closeAll('page'); //关闭所有页面层 */
    window.close();
    return false;
  });
});
</script>


  </body>
</html>
