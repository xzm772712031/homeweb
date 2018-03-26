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
	function update(User_id){
	 layer.open({
     title: '用户修改',
     area: ['65%', '80%'],
     type: 2,
     content: 'selectUserById?user_Id='+User_id
      });    
     layer.iframeAuto(index);      
	}
	
	function exp(){
  layer.confirm('进行Excel导出？导出文件位于D根目录下，注意保存备份。', {icon: 3, title:'提示'}, function(index){
  location.href="ExcelExportUser";
  layer.close(index);
});   
	}
	
	
	function deleteUser(User_id){
  layer.confirm('删除用户?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'deleteUser',
                dataType:"json",
                data:{userId:User_id},
                success:function (data){  
                 if(data=="Success"){  
                    alert("删除成功");
                   }                                
              }
            })
  layer.close(index);
});      
	}
	
	</script>
  </head>
  <body>
 <form class="layui-form" action="selectUserByLike" method="post"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
<table>
<tr>
<td><input type="text"  placeholder="请输入搜索条件" autocomplete="off" class="layui-input" name="parameter" ></td>
<td><button class="layui-btn" lay-submit lay-filter="*">搜索</button></td> 
<td>&nbsp;&nbsp;</td><td><input type="button" class="layui-btn layui-btn-normal" lay-submit lay-filter="*" onclick="exp()" value="导出Excel"></td>
</tr>  
</table>
</form>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>客户列表</legend>
</fieldset>
<div class="layui-form">
<table class="layui-table"  lay-size="lg" >
  <thead>
    <tr >
      <th >客户编号</th>
      <th >客户姓名</th>
      <th >客户电话</th>
      <th >客户邮箱</th>
      <th >客户生日</th>
      <th >客户身份证</th>
      <th >客户所在地</th>
      <th width="100">相关操作</th>
    </tr> 
  </thead>
  <tbody>
    <c:forEach items="${userlist }" var="u">
    <tr>
      <td lay-data="sort: true">${u.userId }</td>
      <td>${u.userName }</td>
      <td>${u.userTel }</td>
      <td>${u.userEmail }</td>
      <td>${u.strDate }</td>
      <td>${u.userPersonId }</td>
      <td>${u.userAddress }</td>
      <td>
    <button class="layui-btn layui-btn-primary layui-btn-small" onclick="update(${u.userId })" ><i class="layui-icon">&#xe642</i></button>

 </td>
      </tr>
    </c:forEach>
  </tbody>
</table> 

	<c:if test="${!empty requestScope.UserAllMsg}">
	  <table class="layui-table"   border="0" cellspacing="0" cellpadding="0"  width="900px">
  
       <tr>
        <td class="td2">
            <span>第${requestScope.UserAllMsg.currPage }/ ${requestScope.UserAllMsg.totalPage}页</span>&nbsp;&nbsp;
            <span>总记录数：${requestScope.BespeakAllMsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.UserAllMsg.pageSize}</span>&nbsp;&nbsp;
            <span>
       <c:if test="${requestScope.UserAllMsg.currPage != 1}">
           <a href="${pageContext.request.contextPath }/selectAllUser?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/selectAllUser?currentPage=${requestScope.UserAllMsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.UserAllMsg.currPage != requestScope.BespeakAllMsg.totalPage}">
           <a href="${pageContext.request.contextPath }/selectAllUser?currentPage=${requestScope.UserAllMsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/selectAllUser?currentPage=${requestScope.UserAllMsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
   </span>
        </td>
    </tr>
    </table>   	
   </c:if>
</div>               
<script src="layui.all.js"></script>
<script>
var table = layui.table;
//转换静态表格
table.init('demo', {
 height:500,

  //支持所有基础参数
}); 
    
</script>
  </body>
</html>
