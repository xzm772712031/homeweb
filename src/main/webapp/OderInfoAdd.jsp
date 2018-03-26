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
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" readonly="readonly" value="${b.bespeakId}">
      </div>
    </div>
     <div class="layui-inline">
      <label class="layui-form-label">客户姓名</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakAtten} ">
      </div>
    </div>
    <br> <br> 
    
    
    	<div class="layui-inline">
      <label class="layui-form-label">联系电话</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakTel}">
      </div>
    </div>
    
    
    <div class="layui-inline">
      <label class="layui-form-label">物品类型</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.goodsType}">
      </div>
    </div>
	<br><br>
     <div class="layui-inline">
      <label class="layui-form-label">服务类型</label>
      <div class="layui-input-inline">
      <select name="interest" lay-filter="aihao">
         
        <option >${b.servicetype.serviceTypeName}</option>
        <c:forEach items="">
        <option value="1">已处理</option>
        </c:forEach> 
      
      </select>
      </div>
    </div>
    
    <div class="layui-inline">
      <label class="layui-form-label">搬迁城市</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakCity }">
      </div>
    </div>
    <br> <br>
      <div class="layui-inline">
      <label class="layui-form-label">搬出地</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakOut }">
      </div>
    </div>
    
     <div class="layui-inline">
      <label class="layui-form-label">搬人地</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakIn}">
        
      </div>
    </div>
    <br><br>
    
    <div class="layui-inline">
      <label class="layui-form-label">搬人时间</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.strDate }">
      </div>
    </div>
    
    
    <div class="layui-inline">
      <label class="layui-form-label">下单时间</label>
      <div class="layui-input-inline">
        <input type="tel"   autocomplete="off" class="layui-input" value="${b.bespeakState}">
      </div>
    </div>
	<br><br>
	
	 <div class="layui-inline">
      <label class="layui-form-label">订单状态</label>
      <div class="layui-input-inline">
   
       <select name="interest" lay-filter="aihao">
      
        <c:if test="${b.bespeakState==0} ">
        <option value=null>未处理</option>
        </c:if>
        <c:if test="${b.bespeakState==1}">
        <option value=null>已处理</option>
        </c:if>
        <c:if test="${b.bespeakState==2}">
        <option>问题</option>
        </c:if>
         <c:if test="${b.bespeakState==3}">
        <option>其他</option>
        </c:if>
        <option value="0">未处理</option>
        <option value="1">已处理</option> 
        <option value="2">问题</option>
        <option value="3">其他</option>
      </select>
     </div>
     
    </div>
	<br><br>
	
	
	<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">预约说明</label>
    <div class="layui-input-block" style="width: 50%" >
      <textarea placeholder="请输入内容" class="layui-textarea" style="width: 440px" >
      ${b.bespeakAdd} 
      </textarea>
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
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" readonly="readonly" value="${i.insuranceId}">
      </div>
    </div>
    
    
    <div class="layui-inline">
      <label class="layui-form-label">创建时间</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.strDate}">
      </div>
    </div>
	<br><br>
	
	  
      <div class="layui-inline">
      <label class="layui-form-label">受益人</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.insuranceOwner}">
      </div>
    </div> 
    <div class="layui-inline">
      <label class="layui-form-label">身份证</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.ownerIdentify}">
      </div>
    </div>
	<br><br>
	  <div class="layui-inline">
      <label class="layui-form-label">保额(万)</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input" value="${i.insurancePrice}">
      </div>
    </div>
	 <div class="layui-inline">
      <label class="layui-form-label">需付保费(元)</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone"  autocomplete="off" class="layui-input">
      </div>
    </div>
	<br><br>	
	<div class="layui-form-item layui-form-text">
    <label class="layui-form-label">保险说明</label>
    <div class="layui-input-block" style="width: 50%" >
      <textarea placeholder="请输入内容" class="layui-textarea" style="width: 440px"></textarea>
    </div>
  </div>
 
    </c:if>
    </div> 
  </div>
</div>
</from>
 </div>	
<script src="layui.all.js"></script>
</body>
</html>
