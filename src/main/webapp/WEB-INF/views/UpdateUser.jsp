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
  <body>
 <form class="layui-form" action="updateUser" method="post">
 <div class="layui-form-item">
    <label class="layui-form-label">用户编号</label>
    <div class="layui-input-block">
      <input type="text" name="user_Id" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.user_Id } " readonly >
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">登陆帐号</label>
    <div class="layui-input-block">
      <input type="text" name="user_Username" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.user_Username }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">登陆密码</label>
    <div class="layui-input-block">
      <input type="text" name="user_Password" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.user_Password }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">姓名</label>
    <div class="layui-input-block">
      <input type="text" name="user_Name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.user_Name }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">电话</label>
    <div class="layui-input-block">
      <input type="text" name="user_Tel" required  lay-verify="required" placeholder="请输入电话" autocomplete="off" class="layui-input" value="${user.user_Tel }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-block">
      <input type="text" name="user_Email" required  lay-verify="required" placeholder="请输入邮箱" autocomplete="off" class="layui-input" value="${user.user_Email }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">QQ</label>
    <div class="layui-input-block">
      <input type="text" name="user_QQ" required  lay-verify="required" placeholder="请输入QQ" autocomplete="off" class="layui-input" value="${user.user_QQ }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">身份证</label>
    <div class="layui-input-block">
      <input type="text" name="user_PersonId" required  lay-verify="identity" placeholder="请输入身份证号" autocomplete="off" class="layui-input" value="${user.user_PersonId }" readonly="readonly">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">当前地址</label>
    <div class="layui-input-block">
      <input type="text" name="" required  lay-verify="required" placeholder="请输入身份证号" autocomplete="off" class="layui-input" value="${user.user_Address }" readonly="readonly">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">修改地址</label>
    <div class="layui-input-inline">
      <select name="add1">
        <option value="">请选择省</option>
        <option value="浙江" selected="">浙江省</option>
        <option value="江西省">江西省</option>
        <option value="福建省">福建省</option>
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="add2">
        <option value="">请选择市</option>
        <option value="杭州">杭州</option>
        <option value="宁波" disabled="">宁波</option>
        <option value="温州">温州</option>
        <option value="台州">台州</option>
        <option value="绍兴">绍兴</option>
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="add3">
        <option value="">请选择县/区</option>
        <option value="西湖区">西湖区</option>
        <option value="余杭区">余杭区</option>
        <option value="临安市">临安市</option>
      </select>
    </div>  
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
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
    layer.closeAll();
   
  });
});
</script>

  </body>
</html>
