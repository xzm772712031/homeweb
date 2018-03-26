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

	function info(){
	 var bespeakId = $("#bespeak_Id").val();
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
<form >
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>添加订单</legend>
	</fieldset>
	
	<div class="layui-form-item">
	<input type="text"  name= "user_Id" value="${bespeak.user_Id }" hidden="hidden" id="user_Id" >
		<div class="layui-inline">
			<label class="layui-form-label">客户姓名：</label>
			<div class="layui-input-inline">
				<input type="text"  value="${bespeak.bespeakAtten }" readonly="readonly"
					class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">预约编号：</label>
			<div class="layui-input-inline">
				<input type="text"  name="bespeak_Id" id="bespeak_Id" value="${bespeak.bespeakId }" readonly="readonly" id="bespeak_Id"
					 class="layui-input">
					 
			</div>
			 <input class="layui-btn layui-btn-primary" onclick="info()" Type="button" value="预约详情">
		</div>
	</div>
	
	<div style=" width:70%; max-height:300px;overflow :auto">
		<label class="layui-form-label">订单分配：</label>
	<div class="layui-tab">
  <ul class="layui-tab-title">
    <li class="layui-this">人员安排</li>
    <li>车辆安排</li>
  
  </ul>
  <div class="layui-tab-content">
    <div class="layui-tab-item layui-show">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend></legend>
</fieldset>
 
<div class="layui-form">
 <table class="layui-table">
    <colgroup>
      <col width="150">
      <col width="150">
      <col width="200">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th>人员编号</th>
        <th>人员姓名</th>
        <th>工作岗位</th>
        <th>人员性别</th>
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${EpolyeeMsg.lists}" var="e">
      <tr>
        <td><input type="checkbox" name="epolyeeId" value=${e.epolyeeId}  >${e.epolyeeId}</td>
        <td>${e.epolyeeName }</td>
        <td>${e.job.jobName}</td>
        <td>${e.epolyeeSex }</td>
      </tr>
   </c:forEach>
   
     
    </tbody>
  </table>
</div>
    </div>
  <div class="layui-tab-item layui-form">
 <table class="layui-table">
    <colgroup>
      <col width="150">
      <col width="150">
      <col width="200">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th>车辆编号</th>
        <th>车辆名称</th>
        <th>车辆类型</th>
        <th>车辆牌照</th>
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${ CarMsg.lists}" var="c">
      <tr>
        <td><input type="checkbox" name="carId" value=${c.carId}>${c.carId}</td>
        <td>${c.carName }</td>
        <td>${c.cartype.carTypeName}</td>
        <td>${c.carClient }</td>
      </tr>
   </c:forEach>
  
    </tbody>
  </table>
</div>
  </div>
</div>
</div>
<br>
<br>
<br>
<br>
   <div class="layui-inline">
      <label class="layui-form-label">订单金额：</label>
      <div class="layui-input-inline">
        <input type="text"  name="orderPrice"  class="layui-input" id="orderPrice" ><div></div>
      </div> 
    </div>
    <br>
    <br>
    <br>
	<div style=" width:70%; max-height:200px">
 <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">订单备注：</label>
    <div class="layui-input-block">
      <textarea placeholder="请输入内容" class="layui-textarea" name="orderComment" style="display: none;" id="content"></textarea>
    </div>
  </div>
 </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit="" lay-filter="demo1" type="button" id="btn" value="立即提交">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
 </form>
	<script src="layui.all.js"></script>
	<script type="text/javascript">	
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
                   height:160
               }
           );      
         $("#btn").click(function(){
          layedit.sync(editIndex);          
          var carId = new Array(); 
          $("input[name='carId']:checked").each(function(){ 
　                         　carId.push($(this).val());
          }); 
         
         var epolyeeId = new Array(); 
          $("input[name='epolyeeId']:checked").each(function(){     
　                         　epolyeeId.push($(this).val());
          }); 
        var user_Id = $("#user_Id").val();
        var bespeak_Id = $("#bespeak_Id").val();
        var orderPrice = $("#orderPrice").val();
        var orderComment = $('#content').val();  
        var re = /^[0-9]+$/ ;
        if(orderPrice.length==0||orderComment.length==0){
         layer.msg("关键字段不能为空",function(){
         return false;
         })   
         return false;
        }
        else if(!re.test(orderPrice)){
         layer.msg("请输入正确的金额。",function(){
         return false;
         })   
         return false;
        } 
        else{
            $.ajax({
                type:'post',
                url:'addOrder',
                dataType:"json",
                data:{
                carId:carId,
                epolyeeId:epolyeeId,
                orderPrice:orderPrice,
                user_Id:user_Id,
                bespeak_Id:bespeak_Id,
                orderComment:orderComment,
                },
                traditional:true,
                success:function(data){
                 if(data==true){
                    alert("订单创建成功");
                    }                                 
              }    
              
            }) 
            }
             }); 
      
      }     
      );
           
</script>


</body>
</html>
