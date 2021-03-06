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
	function update(bespeak_Id){
	
  layer.confirm('确认预约?', {icon: 3, title:'提示'}, function(index){
  
  location.href="confirmBespeak?bespeak_State=1&&bespeak_Id="+bespeak_Id;
  layer.close(index);
});
        
	}
	
	function add(bespeak_Id){
	
     layer.open({
     title: '新增订单',
     moveOut: true,
     area: ['90%', '80%'],
     type: 2,
     content: 'add'
      });    
        
	}
	
	</script>
</head>
<body>

<form class="layui-form" action="selectBespeakByLike" method="post"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
<table>
<tr>
<td><button class="layui-btn" lay-submit lay-filter="*">搜索</button></td> 
<td><input type="text"  placeholder="请输入搜索条件" autocomplete="off" class="layui-input" name="bespeak" ></td>
</tr>  
</table>
</form>


	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>预约列表</legend>
	</fieldset>
	<div class="layui-form">
		<table class="layui-table" lay-size="lg" lay-filter="demo" lay-skin="line">
		<colgroup>
       <col width="150">
       <col width="200">
       <col>
  </colgroup>
			<thead>
				<tr>
					<th lay-data="{field:'1', width:120,sort:true}">客户编号</th>
					<th lay-data="{field:'2', width:120}">客户姓名</th>
					<th lay-data="{field:'3', width:120}">服务类型</th>
					<th lay-data="{field:'4', width:200}">预约时间</th>
					<th lay-data="{field:'5', width:150}">联系电话</th>
					<th lay-data="{field:'6', width:200}">用户Id</th>
					<th lay-data="{field:'7', width:150}">预约状态</th>
					<th lay-data="{field:'8', width:170}"></th>
				</tr>
			</thead>
			<tbody>
<c:if test="${empty requestScope.Bespeak}">
    <c:forEach items="${bklist }" var="b" >
						
							<tr>
								<td lay-data="sort: true">${b.bespeak_Id }</td>
							    <td>${b.customer }</td>
								<td>${b.serviceType.service_Name }</td>
							    <td>${b.strDate }</td>
								<td>${b.tel }</td>
								<td>${b.user_Id }</td>
								
								<c:if test="${b.bespeak_State==1}">
								<td>已处理</td>
								</c:if>
								<c:if test="${b.bespeak_State==0}">
								<td>未处理</td>
								</c:if>
								<td>
									<div class="layui-btn-group">
										<button class="layui-btn layui-btn-primary layui-btn-small"
											onclick="update(${b.bespeak_Id })">
											<i class="layui-icon"></i>
										</button>
										<button class="layui-btn layui-btn-primary layui-btn-small">
											<i class="layui-icon"></i>
										</button>
										<button class="layui-btn layui-btn-primary layui-btn-small">
											<i class="layui-icon"></i>
										</button>
									</div>
								</td>
							</tr>
						</c:forEach>
				
</c:if>
<c:if test="${!empty requestScope.Bespeak}">
					
						<c:forEach items="${BespeakList2 }" var="b" >
						
							<tr>
								<td lay-data="sort: true">${b.bespeak_Id }</td>
							    <td>${b.customer }</td>
								<td>${b.serviceType.service_Name }</td>
							    <td>${b.strDate }</td>
								<td>${b.tel }</td>
								<td>${b.user_Id }</td>
								
								<c:if test="${b.bespeak_State==1}">
								<td>已处理</td>
								</c:if>
								<c:if test="${b.bespeak_State==0}">
								<td>未处理</td>
								</c:if>
								<td>
									<div class="layui-btn-group">
										<button class="layui-btn layui-btn-primary layui-btn-small"
											onclick="update(${b.bespeak_Id })">
											<i class="layui-icon"></i>
										</button>
										<button class="layui-btn layui-btn-primary layui-btn-small"
										onclick="add()" >
											<i class="layui-icon"></i>
										</button>
										<button class="layui-btn layui-btn-primary layui-btn-small">
											<i class="layui-icon"></i>
										</button>
									</div>
								</td>
							</tr>
						</c:forEach>
				
</c:if>					
					
			</tbody>
			
		</table>
		<c:if test="${!empty requestScope.Bespeak}">
		<table  border="0" cellspacing="0" cellpadding="0"  width="900px">
    <tr>
        <td class="td2">
            <span>第${requestScope.Bespeak.currPage }/ ${requestScope.Bespeak.totalPage}页</span>&nbsp;&nbsp;
            <span>总记录数：${requestScope.BespeakMsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.Bespeak.pageSize}</span>&nbsp;&nbsp;
            <span>
       <c:if test="${requestScope.Bespeak.currPage != 1}">
           <a href="${pageContext.request.contextPath }/selectReadyBespeak?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/selectReadyBespeak?currentPage=${requestScope.Bespeak.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.Bespeak.currPage != requestScope.Bespeak.totalPage}">
           <a href="${pageContext.request.contextPath }/selectReadyBespeak?currentPage=${requestScope.Bespeak.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/selectReadyBespeak?currentPage=${requestScope.Bespeak.totalPage}">[尾页]</a>&nbsp;&nbsp;
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

<script>
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  //执行一个laydate实例
  laydate.render({
    elem: '#test1' //指定元素
  });
});
</script>

</body>
</html>
