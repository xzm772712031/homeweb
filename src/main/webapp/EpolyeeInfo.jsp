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
	
	function update(epolyeeId){

	 layer.open({
     title: '员工信息修改',
     area: ['55%', '80%'],
     type: 2,
     content: 'showEpolyeeById?epolyeeId='+epolyeeId
      });    
     layer.iframeAuto(index);
         
	}
		
  function exp(){
  layer.confirm('进行Excel导出？导出文件位于D根目录下，注意保存备份。', {icon: 3, title:'提示'}, function(index){
  location.href="ExcelExportEpolyee";
  layer.close(index);
});   
	}
	
	function del(id){
	  layer.confirm('删除改员工信息?', {icon: 3, title:'提示'}, function(index){
      $.ajax({
                type:'post',
                url:'delEpolyee',
                dataType:"json",
                data:{epolyeeId:id},
                success:function (data){  
                 if(data==true){  
                  layer.msg("删除成功",function(){
                   location.reload(true);         
                });
                   }                                
              }
            })
  layer.close(index);
});	    
	}
	
	function cancle(id){
  layer.confirm('员工离职?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'updateEpolyeeState',
                dataType:"json",
                data:{epolyeeId:id,
                epolyeeState:2},
                success:function (data){  
                 if(data==true){  
                    alert("操作成功");
                      location.reload(true);      
                   }                                
              }
            })
  layer.close(index);
});      
	}
	
	
	
	
	</script>
  </head>
  <body>
<form class="layui-form" action="selectEpolyeeByLike" method="post"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
<table>
<tr>
<td><input type="text"  placeholder="请输入搜索条件" autocomplete="off" class="layui-input" name="parameter" ></td><td>&nbsp;</td>
<td><button class="layui-btn" lay-submit lay-filter="*">搜索</button></td> <td>&nbsp;&nbsp;</td>
<td><input type="button" class="layui-btn layui-btn-normal" lay-submit lay-filter="*" onclick="exp()" value="导出Excel"></td>
</tr>  
</table>
</form>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>人员列表</legend>
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
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>员工职位</th>
        <th>员工性别</th>
        <th>联系电话</th>
        <th>联系状态</th>
        <th>操作</th>
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${Epolyee}" var="e">
      <tr>
        <td>${e.epolyeeId}</td>
        <td>${e.epolyeeName }</td>
        <td>${e.job.jobName}</td>
        <td>${e.epolyeeSex }</td>
         <td>${e.epolyeeTel }</td>
         <c:if test="${e.epolyeeState==0 }">
          <td>待命</td>
          </c:if>
          <c:if test="${e.epolyeeState==1 }">
          <td>任务中</td>
          </c:if>
          <c:if test="${e.epolyeeState==2 }">
          <td>离职</td>
          </c:if>
          <c:if test="${e.epolyeeState==0 }">
        <td>
        <button class="layui-btn" onclick="update(${e.epolyeeId})" >详情修改</button>
        <button class="layui-btn" onclick="cancle(${e.epolyeeId})">离职</button>
        </td>
        </c:if>
         <c:if test="${e.epolyeeState==1||e.epolyeeState==2 }">
        <td>
        <button class="layui-btn" onclick="update(${e.epolyeeId})" >详情修改</button>
        </td>
        </c:if>
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
