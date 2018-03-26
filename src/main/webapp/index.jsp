<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8">
	<title>搬家网-管理登录</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
	<link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
		$(function(){
        $("#btn").click(function(){
        var name = $("#adminName").val();
        var pwd = $("#adminPassword").val();
            $.ajax({
                type:'post',
                url:'login',
                dataType:"json",
                data:{adminName:name,adminPassword:pwd},
                success:function (data){  
                if(data.adminRole==1){
                    alert("登录成功");
                    window.location.href="bespeakAdmin.jsp";   
                     } else if(data.adminRole==2){
                     
                       window.location.href="serviceAdmin.jsp";   
                     
                     }else if(data.adminRole==3){
                     
                     
                       window.location.href="webAdmin.jsp";   
                     }
                     
                     
                     
                     else{
                      alert("登录成功");
                    window.location.href="superAdmin.jsp"; 
                     }                             
              },       
              error:function(data){
               alert("登录失败");
              }
            })
             });
             
}); 
</script>
</head>
<body class="login-bg">
    <div class="login">
        <div class="message">搬家网-管理登录</div>
        <div id="darkbannerwrap"></div>  
        <form method="post" class="layui-form" >
            <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" id="adminName">
            <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input" id="adminPassword">
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="button" id="btn">
            <hr class="hr20" >
        </form>
    </div>
</body>