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
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title></title>
<link rel="stylesheet" href="css/layui.css">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">

</script>
</head>
<body>


<div style="width: 600px; float: centre">
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>资讯新增</legend>
	</fieldset>	
     	<form class="layui-form">   
    	<div class="layui">
      <label class="layui-form-label">资讯标题</label>
      <div class="layui-input-inline">
        <input autocomplete="off" class="layui-input"  id="newsTitle">
      </div>
    </div>
    
     <br><br>
	 <div class="layui">
      <label class="layui-form-label">资讯类型</label>
      <div class="layui-input-inline">
       <select name="interest" lay-filter="aihao" id="newsType">  
       <option value='news'>新闻</option> 
       <option value='answer'>答疑</option>     
      </select>
     </div>
    </div>
    <br><br>
  	<div style=" width:600; max-height:700px">
 <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">资讯内容：</label>
    
    <div class="layui-input-block">
         <textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="content"></textarea>
    </div>
  </div>
 </div>
 
 
<br><br><br>
   <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="button" value="新增资讯" id="btn">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
    </div>
    </form>
  </div>  
<script src="layui.all.js"></script>
<script>
            layui.use(['form', 'layedit', 'laydate'], function() {
             var form = layui.form
               , layer = layui.layer
               , layedit = layui.layedit
               , laydate = layui.laydate; 
           //上传图片,必须放在 创建一个编辑器前面
           layedit.set({
               uploadImage: {
                    url: '${pageContext.request.contextPath}/uploadFile' //接口url
                   ,type: 'post' //默认post
               }
           });
           //创建一个编辑器
           var editIndex = layedit.build('content',{
                   height:650,
                   width:500
               }
           );
         
             
         $("#btn").click(function(){
          layedit.sync(editIndex);
        var newsTitle = $("#newsTitle").val();   
        var newsType = $("#newsType").val();
        var newsContext = $('#content').val();  
     
        if(newsTitle.length==0||newsContext.length==0){
         layer.msg("关键字段不能为空",function(){
         return false;
         })   
         return false;
        }   
        else{
            $.ajax({
                type:'post',
                url:'addnews',
                dataType:"json",
                data:{
                newsTitle:newsTitle,
                newsType:newsType,
                newsContext:newsContext,
                },
                success:function(data){
                 if(data==true){
                    alert("资讯添加成功");
                    }                                 
              }    
              
            }) 
            }
             }); 
      
      }     
      );
           
           
           
</script>
<script>  
</script>
</body>
</html>
