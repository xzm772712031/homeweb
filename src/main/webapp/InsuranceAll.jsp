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
	
	function update(id){
	 layer.open({
     title: '保险修改',
     area: ['60%', '80%'],
     type: 2,
     content: 'showInsuranceDetail?insuranceId='+id
      });
     layer.iframeAuto(index);       
	}
	
	
	function exp(){
  layer.confirm('进行Excel导出？导出文件位于D根目录下，注意保存备份。', {icon: 3, title:'提示'}, function(index){
  location.href="ExcelExportInsurance";
  layer.close(index);
});   
	}
	
	function comfire(id,state){
	  layer.confirm('通过?', {icon: 3, title:'提示'}, function(index){
      $.ajax({
                type:'post',
                url:'updateinsuranceState',
                dataType:"json",
                data:{insuranceId:id,
                insuranceState:state
                },
                success:function (data){  
                 if(data==true){  
                  layer.msg("操作成功",function(){
                   location.reload(true);         
                });
                   }                                
              }
            })
  layer.close(index);
});	    
	}
	function refuse(id,state){
	  layer.confirm('驳回?', {icon: 3, title:'提示'}, function(index){
      $.ajax({
                type:'post',
                url:'updateinsuranceState',
                dataType:"json",
                data:{insuranceId:id,
                insuranceState:state
                },
                success:function (data){  
                 if(data==true){  
                  layer.msg("操作成功",function(){
                   location.reload(true);         
                });
                   }                                
              }
            })
  layer.close(index);
});	    
	}
	</script>
  </head>
  <body>
  <form class="layui-form" action="selectInsuranceByLike" method="post"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
<table>
<tr>
<td><input type="text"  placeholder="请输入搜索条件" autocomplete="off" class="layui-input" name="parameter" ></td><td>&nbsp;</td>
<td><button class="layui-btn" lay-submit lay-filter="*">搜索</button></td> <td>&nbsp;&nbsp;</td>
<td><input type="button" class="layui-btn layui-btn-normal" lay-submit lay-filter="*" onclick="exp()" value="导出Excel"></td>
</tr>  
</table>
</form>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>保险列表</legend>
</fieldset>
  <div class="layui-form">
  <table class="layui-table">
   <colgroup>
     
      <col>
    </colgroup>
    <thead>
      <tr>
        <th>保险编号</th>
        <th>客户姓名</th>
        <th>受益人</th>
        <th>保额</th>
        <th>相关收费</th>
        <th>创建时间</th>
        <th>状态</th>
        <th>操作</th>
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${iklist}" var="i">
      <tr>
        <td>${i.insuranceId }</td>
         <td>${i.user.userName}</td>
        <td>${i.insuranceOwner}</td>
        <td>${i.insurancePrice }</td>
        <td>${i.insuranceCost }</td>
        <td>${i.strDate }</td>
        <c:if test="${i.insuranceState==0}">
         <td>未确认</td>
         </c:if>
         <c:if test="${i.insuranceState==1}">
         <td>已确认</td>
         </c:if>
          <c:if test="${i.insuranceState==2}">
         <td>客户申保</td>
         </c:if>
           <c:if test="${i.insuranceState==3}">
         <td>已受理</td>
          </c:if>
           <c:if test="${i.insuranceState==4}">
         <td>已驳回</td>
         </c:if>
       
     
       <td> <button class="layui-btn" onclick="update(${i.insuranceId })">详情</button>
       <c:if test="${i.insuranceState==2&&admin.adminRole==2}">
        <button class="layui-btn" onclick="comfire(${i.insuranceId },3)">通过</button>
        <button class="layui-btn" onclick="refuse(${i.insuranceId},4)">驳回</button> 
         </c:if>
        </td> 
        
        </tr>
   </c:forEach>  
    </tbody>
    </table>
  </div>
  
<script src="layui.all.js"></script>
<script>
</script>
  </body>
</html>