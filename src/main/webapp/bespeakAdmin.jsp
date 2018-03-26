<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">  
	<title>后台管理系统</title>
	<meta name="renderer" content="webkit">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="css/global.css" media="all">
	<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<script src="layui.all.js"></script>
	<script type="text/javascript">
	var timer;
$(document).ready(function(){
    if (timer == undefined)     
  timer = window.setInterval(count, 1000);
  timer = window.setInterval(count2, 1000);
});
	function count(){	
		$.ajax({
        url: "bespeakcount", 
        type: "post",
        dataType: "json",
        success: function (data) {
           $("#count1").text(data);
        }
    });
   } 
   function count2(){	
		$.ajax({
        url: "bespeakcount1", 
        type: "post",
        dataType: "json",
        success: function (data) {
           $("#count2").text(data);
        }
    });
		}
		
	function currentTime(){ 
    var d=new Date(),str=''; 
    str+=d.getFullYear()+'年'; 
    str+=d.getMonth() + 1+'月'; 
    str+=d.getDate()+'日'; 
    str+=d.getHours()+'时'; 
    str+=d.getMinutes()+'分'; 
    str+= d.getSeconds()+'秒'; 
    return str; 
    } 
    setInterval(function(){$('#time').html(currentTime)},1000);     
function changeSrc(url)
{
document.getElementById("myframe").src=url;
}
	</script>
  </head>
  <body onload="count()">
    <div class="layui-layout layui-layout-admin" style="border-bottom: solid 5px #1aa094;">
			<div class="layui-header header header-demo">
				<div class="layui-main">
					<div class="admin-login-box">
						<a class="logo" style="left: 0;" href="http://beginner.zhengjinfan.cn/demo/beginner_admin/">
							<span style="font-size: 22px;">业务部门系统</span>
						</a>
						<div class="admin-side-toggle">
							<i class="fa fa-bars" aria-hidden="true"></i>
						</div>			
					</div>
					<ul class="layui-nav admin-header-item">   
					
					<li class="layui-nav-item">
							<a href="javascript:;" class="admin-header-user">
								<span>当前未处理事务 </span>
							</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="javascript:void(0);" onclick="changeSrc('showbespeakBefore')" >  当前未处理预约：<span id="count1"></span></a>
								</dd>
								<dd>
									<a a href="javascript:void(0);" onclick="changeSrc('showOrderBefore')"  >当前待分配订单 : <span id="count2"></span></a>
								</dd>
							</dl>
						</li>
                         <li class="layui-nav-item">
							<span id="time"></span>						
							</li>						
						<li class="layui-nav-item">
							<a href="javascript:;" class="admin-header-user">
								<span>${admin.adminName }欢迎你！ </span>
							</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="javascript:;"><i class="fa fa-user-circle" aria-hidden="true"></i> 个人信息</a>
								</dd>
								<dd>
									<a href="javascript:;"><i class="fa fa-gear" aria-hidden="true"></i> 设置</a>
								</dd>
								<dd>
									<a href="loginout"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a>
								</dd>
							</dl>
						</li>
					</ul>
					<ul class="layui-nav admin-header-item-mobile">
						<li class="layui-nav-item">
							<a href="loginout"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="layui-side layui-bg-black" id="admin-side">
				<div class="layui-side-scroll" id="admin-navbar-side" lay-filter="side"></div>
			</div>
			<div class="layui-body" style="bottom: 0;border-left: solid 2px #1AA094;" id="admin-body">
				<div class="layui-tab admin-nav-card layui-tab-brief" lay-filter="admin-tab">
					<ul class="layui-tab-title">
						<li class="layui-this">
							<i class="fa fa-dashboard" aria-hidden="true"></i>
							<cite>系统信息</cite>
						</li>
					</ul>
					<div class="layui-tab-content" style="min-height: 150px; padding: 5px 0 0 0;">
						<div class="layui-tab-item layui-show" >
							<iframe src="BespeakStatistics.jsp" id="myframe"></iframe>
						</div>
					</div>
				</div>
			</div>
			<div class="layui-footer footer footer-demo" id="admin-footer">
				<div class="layui-main">
					<p>2017 &copy;
						<a href="#">/系统管理后台</a> 版权所有
					</p>
				</div>
			</div>
			<div class="site-tree-mobile layui-hide">
				<i class="layui-icon">&#xe602;</i>
			</div>
			<div class="site-mobile-shade"></div>
					
			<script type="text/javascript" src="plugins/layui/layui.js"></script>
			<script type="text/javascript" src="datas/nav2.js"></script>
			<script src="js/index.js"></script>
			<script>
				layui.use('layer', function() {
					var $ = layui.jquery,
						layer = layui.layer;

					$('#video1').on('click', function() {
						layer.open({
							title: 'YouTube',
							maxmin: true,
							type: 2,
							content: 'video.html',
							area: ['800px', '500px']
						});
                    });
                    $('#pay').on('click', function () {
                        layer.open({
                            title: false,
                            type: 1,
                            content: '<img src="images/xx.png" />',
                            area: ['500px', '250px'],
                            shadeClose: true
                        });
                    });
				});	
		</script>
		</div>
		</body>
</html>
