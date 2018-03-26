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
$(function(){
        $("#btn").click(function(){
        var bespeakId = $("#bespeakId").val();
        var bespeakAtten = $("#bespeakAtten").val();
        var bespeakTel = $("#bespeakTel").val();
        var goodsType = $("#goodsType").val();
        var serviceType_Id = $("#serviceType_Id option:selected").val();
        var bespeakCity = $("#bespeakCity").val();
        var bespeakOut = $("#bespeakOut").val();
        var bespeakIn = $("#bespeakIn").val();
        var bespeakState = $("#bespeakState option:selected").val();
        var bespeakDate = $("#bespeakDate").val();
        var bespeakAdd = $("#bespeakAdd").val();
            $.ajax({
                type:'post',
                url:'updateBespeak',
                dataType:"json",
                data:{
                bespeakId:bespeakId,
                bespeakAtten:bespeakAtten,
                bespeakTel:bespeakTel,
                goodsType:goodsType,
                serviceType_Id:serviceType_Id,
                bespeakCity:bespeakCity,
                bespeakOut:bespeakOut,
                bespeakIn:bespeakIn,
                bespeakState:bespeakState,
                bespeakDate:bespeakDate,
                bespeakAdd:bespeakAdd
                },
                success:function (data){
                 if(data==true){
                    alert("预约完善成功");
                    }                                 
              }    
              
            })
             });      
             
             
                
        $("#btn2").click(function(){
        var insuranceId = $("#insuranceId").val();
        var insurancePrice = $("#insurancePrice").val();  
        var insuranceCost = $("#insuranceCost").val();
        var insuranceOwner = $("#insuranceOwner").val();
        var ownerIdentify = $("#ownerIdentify").val();
        var insuranceComment = $("#insuranceComment").val();
         var re = /^[0-9]+$/ ;
         
         if(!re.test(insuranceCost)){
         layer.msg("请输入正确的金额。",function(){
         return false;
         })   
         return false;
        } 
        else{
            $.ajax({
                type:'post',
                url:'InsuranceAdd',
                dataType:"json",
                data:{insuranceId:insuranceId,
                insurancePrice:insurancePrice,
                insuranceCost:insuranceCost,
                insuranceOwner:insuranceOwner,
                ownerIdentify:ownerIdentify,
                insuranceComment:insuranceComment},
                success:function (data){  
                 if(data==true){  
                    alert("保险信息完善与确认成功");
                   }                                
              }
            })}
             });          
}); 


</script>

</head>
<body>
<div style="width: 600px; float: centre">

	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>预约详情</legend>
	</fieldset>	

<div class="layui-tab">
  <ul class="layui-tab-title">
    <li class="layui-this">预约信息</li>
    <li>保险信息</li>

  </ul>
  <div class="layui-tab-content">
    <div class="layui-tab-item layui-show">
     	<form class="layui-form">
	 <div class="layui-inline">
      <label class="layui-form-label">预约编号</label>
        <input type="hidden" value="${admin.adminRole}" id="role">
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" readonly="readonly" value="${b.bespeakId}" id="bespeakId">
      </div>
    </div>
     <div class="layui-inline">
      <label class="layui-form-label">客户姓名</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakAtten} " id="bespeakAtten">
      </div>
    </div>
    <br> <br> 
    
    	<div class="layui-inline">
      <label class="layui-form-label">联系电话</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakTel}" id="bespeakTel">
      </div>
    </div>
    
    
    <div class="layui-inline">
      <label class="layui-form-label">物品类型</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.goodsType}" id="goodsType">
      </div>
    </div>
	<br><br>
     <div class="layui-inline">
      <label class="layui-form-label">服务类型</label>
      <div class="layui-input-inline">
      <select name="interest" lay-filter="aihao" id="serviceType_Id"> 
       <c:forEach items="${l}"  var="l"> 
        <c:if test="${b.servicetype.serviceTypeName==l.serviceTypeName}"> 
        <option value=${l.serviceTypeId }>${b.servicetype.serviceTypeName}</option>  
        </c:if>
        </c:forEach>   
        <c:forEach items="${l}"  var="l">
        <option value=${l.serviceTypeId }> ${l.serviceTypeName }</option>
        </c:forEach> 
      
      </select>
      </div>
    </div>
    
    <div class="layui-inline">
      <label class="layui-form-label">搬迁城市</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakCity }" id="bespeakCity">
      </div>
    </div>
    <br> <br>
      <div class="layui-inline">
      <label class="layui-form-label">搬出地</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakOut }" id="bespeakOut">
      </div>
    </div>
    
     <div class="layui-inline">
      <label class="layui-form-label">搬人地</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakIn}" id="bespeakIn">
        
      </div>
    </div>
    <br><br>
    
   <div class="layui-form">
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">搬运时间</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="test17" placeholder="yyyy-MM-dd" value="${b.strDate}" id="bespeakInDate">
      </div>
    </div>
    </div>
    </div>
    
    <div class="layui-inline">
      <label class="layui-form-label">下单时间</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.strDate2}" readonly="readonly">
      </div>
    </div>
	<br><br>
	
	 <div class="layui-inline">
      <label class="layui-form-label">订单状态</label>
      <div class="layui-input-inline">
   
       <select name="interest" lay-filter="aihao" id="bespeakState">
      
        <c:if test="${b.bespeakState==0} ">
        <option value=0>未处理</option>
        </c:if>
        <c:if test="${b.bespeakState==1}">
        <option value=1>已处理</option>
        </c:if>
        <c:if test="${b.bespeakState==2}">
        <option value=2>已分配</option>
        </c:if>
         <c:if test="${b.bespeakState==3}">
        <option value=3>其他</option>
        </c:if>
        <option value=0>未处理</option>
        <option value=1>已处理</option> 
        <option value=2>已分配</option>
        <option value=3>其他</option>
      </select>
     </div>

    </div>
	<br><br>
	<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">预约说明</label>
    <div class="layui-input-block" style="width: 50%" >
      <textarea placeholder="请输入内容" class="layui-textarea" style="width: 440px" id="bespeakAdd">
      ${b.bespeakAdd} 
      </textarea>
    </div>
  </div>
   <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="button" value="立即提交" id="btn">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
	</form>

</div>

     <div class="layui-tab-item">
     
     <c:if test="${i==null}">
                  客户没有选择购买保险。
     </c:if>
     <c:if test="${i!=null}">
  
        <div class="layui-inline">
      <label class="layui-form-label">保单编号</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" readonly="readonly" value="${i.insuranceId}" id="insuranceId">
      </div>
    </div>
    
    
    <div class="layui-inline">
      <label class="layui-form-label">创建时间</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.strDate}" readonly="readonly">
      </div>
    </div>
	<br><br>
	
	  
      <div class="layui-inline">
      <label class="layui-form-label">受益人</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.insuranceOwner}" id="insuranceOwner">
      </div>
    </div> 
    <div class="layui-inline">
      <label class="layui-form-label">身份证</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.ownerIdentify}" id="ownerIdentify">
      </div>
    </div>
	<br><br>
	  <div class="layui-inline">
      <label class="layui-form-label">保额(万)</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.insurancePrice}" id="insurancePrice">
      </div>
    </div>
	 <div class="layui-inline">
      <label class="layui-form-label">需付保费(元)</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" id="insuranceCost" value="${i.insuranceCost}">
      </div>
    </div>
	<br><br>	
	<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">保险说明</label>
    <div class="layui-input-block" style="width: 50%" >
      <textarea placeholder="请输入内容" class="layui-textarea" style="width: 440px" id="insuranceComment"  > ${i.insuranceComment}</textarea >
    </div>
  </div>
    <div class="layui-form-item">
    <div class="layui-input-block">
      <input class="layui-btn" lay-submit lay-filter="formDemo" type="button" value="立即提交" id="btn2">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>  
    </c:if>
   
    </div> 
  </div>
</div>

 </div>	
<script src="layui.all.js"></script>
</body>
</html>
