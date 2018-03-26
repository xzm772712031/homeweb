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
	function del(id){
  layer.confirm('删除用户?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'delOrder',
                dataType:"json",
                data:{orderId:id},
                success:function (data){  
                 if(data==true){  
                    alert("删除成功");
                    location.reload(true);      
                   }                                
              }
            })
  layer.close(index);
});      
	}
	
	 function confirm(orderId){
  layer.confirm('订单完成?', {icon: 3, title:'提示'}, function(index){
  location.href="completeOrder?orderID="+orderId;
  
  layer.close(index);
});      
	}; 		
	</script>
	<script type="text/javascript">
	 function info(userId,bespeakId,orderID){
	 layer.open({
     title: '订单服务详情',
     area: ['60%', '80%'],
     type: 2,
     content: 'showOrderDetail?userId='+userId+' &bespeakId='+bespeakId+'&orderID='+orderID
      });    
     layer.iframeAuto(index);   
	}
	</script>
  </head>
  <body>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>已完成订单</legend>
</fieldset>
  <div class="layui-form">
  <table class="layui-table">
   <colgroup>
      
      <col>
    </colgroup>
    <thead>
      <tr>
        <th>订单编号</th>
        <th>预约编号</th>
        <th>创建时间</th>
        <th>订单状态</th>
        <th>操作</th>
      </tr> 
    </thead>
    <tbody>
    <c:forEach items="${OrderMsg.lists}" var="ord">
      <tr>
        <td>${ord.orderId}</td>
        <td>${ord.bespeak_Id }</td>
        <td>${ord.strDate}</td>
        <c:if test="${ord.orderState==0 }">
        <td>进行中</td>
        </c:if>
         <c:if test="${ord.orderState==1 }">
        <td>已完成</td>
        </c:if>
        <td>
          <input type="button"class="layui-btn" onclick="info(${ord.user_Id},${ord.bespeak_Id},${ord.orderId})" value="详情查看">
      
         <button class="layui-btn" onclick="del(${ord.orderId})" >删除</button>
        </td> 
      </tr>
   </c:forEach>  
    </tbody>
  </table>
    <table class="layui-table"   border="0" cellspacing="0" cellpadding="0"  width="900px">
  
       <tr>
        <td class="td2">
            <span>第${requestScope.OrderMsg.currPage }/ ${requestScope.OrderMsg.totalPage}页</span>&nbsp;&nbsp;
            <span>总记录数：${requestScope.OrderMsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.OrderMsg.pageSize}</span>&nbsp;&nbsp;
            <span>
       <c:if test="${requestScope.OrderMsg.currPage != 1}">
           <a href="${pageContext.request.contextPath }/showOrderListOK?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/showOrderListOK?currentPage=${requestScope.OrderMsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.OrderMsg.currPage != requestScope.OrderMsg.totalPage}">
           <a href="${pageContext.request.contextPath }/showOrderListOK?currentPage=${requestScope.OrderMsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/showOrderListOK?currentPage=${requestScope.OrderMsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
   </span>
        </td>
    </tr>
    </table>
  </div>  
  <div>
  
  
  </div>
<script src="layui.all.js"></script>
<script>
</script>
  </body>
</html>
