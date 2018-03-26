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
     area: ['780px', '600px'],
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
	
	
		function deletenews(id){
  layer.confirm('删除资讯?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'delnews',
                dataType:"json",
                data:{newsId:id},
                success:function (data){  
                 if(data==true){  
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
  <legend>新闻列表</legend>
</fieldset>
<div class="layui-form">
<table class="layui-table"  lay-size="lg" >
  <thead>
    <tr>
      <th >答疑编号</th>
      <th >答疑标题</th>
      <th >发布时间</th>
      <th width="100">相关操作</th>
    </tr> 
  </thead>
  <tbody>
    <c:forEach items="${aklist }" var="a">
    <tr>
      <td lay-data="sort: true">${a.newsId }</td>
      <td>${a.newsTitle }</td>
      <td>${a.strDate }</td>
      <td>
    <button class="layui-btn layui-btn-primary layui-btn-small"><i class="layui-icon" onclick="deletenews(${a.newsId }  )" ></i></button>
   </td>
      </tr>
    </c:forEach>
  </tbody>
</table> 
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
