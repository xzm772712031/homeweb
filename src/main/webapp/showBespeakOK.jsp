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
 function update(bespeak_Id,bespeakAtten,user_Id){
	
  layer.confirm('确认预约?', {icon: 3, title:'提示'}, function(index){
  location.href="confirmBespeak?bespeakId="+bespeak_Id;
  layer.close(index);
});
        
	}		
	 function add(bespeak_Id,bespeakAtten,user_Id){
  layer.confirm('建立订单?', {icon: 3, title:'提示'}, function(index){
  location.href="createOrder?bespeakId="+bespeak_Id+"&bespeakAtten="+bespeakAtten+"&user_Id="+user_Id;
  layer.close(index);
});
      
	}
	
  function exp(bespeak_Id,bespeakAtten,user_Id){
  layer.confirm('进行Excel导出？导出文件位于D根目录下，注意保存备份。', {icon: 3, title:'提示'}, function(index){
  location.href="ExcelExport";
  layer.close(index);
});   
	}
	
	function info(bespeakId){
	 layer.open({
     title: '预约详情',
     area: ['60%', '80%'],
     type: 2,
     content: 'showBespeakDetail?bespeakId='+bespeakId
      });    
     layer.iframeAuto(index);     
	}
function del(bespeakId){
  layer.confirm('确认预约?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'deleteBespeak',
                dataType:"json",
                data:{bespeakId:bespeakId},
                success:function (data){  
                 if(data==true){  
                    alert("删除成功");
                    window.location.href="selectAllbespeak";
                   }                                
              }
            })
  layer.close(index);
});	
}
	</script>
	
</head>
<body>
<div style=" width:auto">
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>预约列表</legend>
	</fieldset>
	<div class="layui-form">
		<table class="layui-table" lay-size="lg" lay-filter="demo" lay-skin="line"  >
		<colgroup>
     
       <col>
  </colgroup>
			<thead>
				<tr>
					<th lay-data="{field:'1', width:120,sort:true}">预约编号</th>
					<th lay-data="{field:'2', width:120}">客户姓名</th>
					<th lay-data="{field:'3', width:120}">服务类型</th>
					<th lay-data="{field:'4', width:200}">预约时间</th>
					<th lay-data="{field:'5', width:150}">联系电话</th>
					<th lay-data="{field:'7', width:150,sort:true}">预约状态</th>
					<th lay-data="{field:'8', width:170}"></th>
				</tr>
			</thead>
			<tbody>
			<c:if test="${empty requestScope.BespeakAllMsg}">
    没有任何用户信息！
</c:if>
<c:if test="${!empty requestScope.BespeakAllMsg}">
						<c:forEach items="${BespeakAllMsg.lists }" var="b">
							<tr>
								<td lay-data="sort: true">${b.bespeakId }</td>
							    <td>${b.bespeakAtten }</td>
								<td>${b.servicetype.serviceTypeName }</td>
							    <td>${b.strDate }</td>
								<td>${b.bespeakTel }</td>	
								<c:if test="${b.bespeakState==1}">
								<td>已处理</td>
								</c:if>
								<c:if test="${b.bespeakState==0}">
								<td>未处理</td>
								</c:if>
							    <c:if test="${b.bespeakState==2}">
								<td>问题预约</td>
								</c:if>
								<td>
										<div class="layui-btn-group">
										<div class="layui-btn-group">
										<c:if test="${b.bespeakState==0}">
                                   <button class="layui-btn" onclick="update(${b.bespeakId })" >确认</button>
                                   </c:if>
                                   <button class="layui-btn " onclick="info(${b.bespeakId })" >详情</button>
                                   <button class="layui-btn" onclick="del(${b.bespeakId })">取消</button>
                                    </div>
									</div>
								</td>
							</tr>
						</c:forEach>
					</c:if>
			</tbody>
		</table>
		</div>
	  <table class="layui-table"   border="0" cellspacing="0" cellpadding="0"  width="900px">
  
       <tr>
        <td class="td2">
            <span>第${requestScope.BespeakAllMsg.currPage }/ ${requestScope.BespeakAllMsg.totalPage}页</span>&nbsp;&nbsp;
            <span>总记录数：${requestScope.BespeakAllMsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.BespeakAllMsg.pageSize}</span>&nbsp;&nbsp;
            <span>
       <c:if test="${requestScope.BespeakAllMsg.currPage != 1}">
           <a href="${pageContext.request.contextPath }/showbespeakOK?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/showbespeakOK?currentPage=${requestScope.BespeakAllMsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.BespeakAllMsg.currPage != requestScope.BespeakAllMsg.totalPage}">
           <a href="${pageContext.request.contextPath }/showbespeakOK?currentPage=${requestScope.BespeakAllMsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/showbespeakOK?currentPage=${requestScope.BespeakAllMsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
   </span>
        </td>
    </tr>
    </table>
	</div>
	<script src="layui.all.js"></script>
	<script>
var table = layui.table;
//转换静态表格
table.init('demo', {
 height:450,
 border:0,
 width:auto
 
  //支持所有基础参数
}); 

</script>
</body>
</html>
