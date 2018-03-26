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
	
	
	function cancle(id){
  layer.confirm('订单终止?', {icon: 3, title:'提示'}, function(index){
   $.ajax({
                type:'post',
                url:'cancleorder',
                dataType:"json",
                data:{orderId:id,
                orderState:3},
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
	
	
	
function price(id,price){
 $("#price").hide();
 $("#orderid").val(id);
  $("#priceinfo").val(price);
 layer.open({
  type: 1,
  title :'收费确认',
  content: $('#price'),
  cancel: function(){ 
   $("#price").hide();
  }
   //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
});
}
  function confirm(){
  var id = $("#orderid").val();
  var price =  $("#priceinfo").val();
  var re = /^[0-9]+$/ ;
  if(!re.test(price)){
         layer.msg("请输入正确的金额。",function(){
         return false;
         })   
         return false;
        } 
        else{
  layer.confirm('订单完成?', {icon: 3, title:'提示'}, function(index){
  location.href="completeOrder?orderID="+id+"&&orderPrice="+price;
  layer.close(index);
}); 
  }   
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
  <legend>订单列表</legend>
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
        <th>订单金额</th>
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
         <td>${ord.orderPrice}元</td>
        <c:if test="${ord.orderState==2 }">
        <td>进行中</td>
        </c:if>
         <c:if test="${ord.orderState==1 }">
        <td>已完成</td>
        </c:if>
          <c:if test="${ord.orderState==3 }">
        <td>已终止</td>
        </c:if>
        <td>
        <button class="layui-btn" onclick="cancle(${ord.orderId})" >终止</button>
        <input type="button"class="layui-btn" onclick="info(${ord.user_Id},${ord.bespeak_Id},${ord.orderId})" value="详情查看">
        <button class="layui-btn" onclick="price(${ord.orderId},${ord.orderPrice})">订单完成</button>
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
           <a href="${pageContext.request.contextPath }/showOrderListIng?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/showOrderListIng?currentPage=${requestScope.OrderMsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.OrderMsg.currPage != requestScope.OrderMsg.totalPage}">
           <a href="${pageContext.request.contextPath }/showOrderListIng?currentPage=${requestScope.OrderMsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/showOrderListIng?currentPage=${requestScope.OrderMsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
   </span>
        </td>
    </tr>
    </table>
   <div class="layui-inline" style="display:none;" id="price">
   <input type="text"  name="orderPrice"  class="layui-input" id ='orderid' style="display:none;"><div></div>
   <label class="layui-form-label">实际收费（元）：</label>
      <div class="layui-input-inline">
        <input type="text"  name="orderPrice"  class="layui-input" id="priceinfo"><div></div>
      </div>
       <div class="layui-form-item">
    <div class="layui-input-block">
     <button class="layui-btn" onclick="confirm()" >完成</button>
    </div>
  </div>
  </div>
  </div>
  
<script src="layui.all.js"></script>
<script>
</script>
  </body>
</html>
