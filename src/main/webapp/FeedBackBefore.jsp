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
	function reply(id){
	 layer.open({
     title: '客户反馈处理',
     area: ['60%', '80%'],
     type: 2,
     content: 'showFeedbackbyId?feedbackId='+id
      });    
     layer.iframeAuto(index);        
	}	
	function del(id){
	  layer.confirm('删除客户反馈?', {icon: 3, title:'提示'}, function(index){
      $.ajax({
                type:'post',
                url:'deleteFeedBack',
                dataType:"json",
                data:{feedbackId:id},
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
	</script>
  </head>
  <body>
  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>反馈列表</legend>
</fieldset>
  <div class="layui-form">
  <table class="layui-table" lay-size="lg" lay-filter="demo" lay-skin="line">
   <colgroup>
      
      
    </colgroup>
    <thead>
      <tr>
        <th>反馈编号</th>
        <th>客户姓名</th>
        <th>反馈类型</th>
        <th>反馈时间</th>
        <th>反馈标题</th>
        <th>附件图片</th>
        <th>状态</th>
        <th >操作</th>
      </tr> 
    </thead>
    <tbody>
    
    
    <c:forEach items="${fklist}" var="i">
      <tr>
        <td>${i.feedbackId }</td>
        <td>${i.user.userName}</td>
        <td>${i.feedbacktype.feedbackTypeName}</td>
        <td>${i.strDate }</td>
        <td>${i.feedbackTitle }</td>
      
        <td><img src="/pic/${i.feedbackImage }"></td>
         <c:if test="${i.feedbackState==0}">
         <td>未回复</td>
         </c:if>
         <c:if test="${i.feedbackState==1}">
         <td>已回复</td>
         </c:if>
        <td>
        <button class="layui-btn"onclick="reply(${i.feedbackId })" >回复</button>
        <button class="layui-btn" onclick="del(${i.feedbackId })">删除</button>
        </td>
      </tr>
   </c:forEach>  
    </tbody>
  </table>
  
  
  <c:if test="${!empty requestScope.FeedBackAllMsg}">
	  <table class="layui-table"   border="0" cellspacing="0" cellpadding="0"  width="900px">
       <tr>
        <td class="td2">
            <span>第${requestScope.FeedBackAllMsg.currPage }/ ${requestScope.FeedBackAllMsg.totalPage}页</span>&nbsp;&nbsp;
            <span>总记录数：${requestScope.FeedBackAllMsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.FeedBackAllMsg.pageSize}</span>&nbsp;&nbsp;
            <span>
       <c:if test="${requestScope.FeedBackAllMsg.currPage != 1}">
           <a href="${pageContext.request.contextPath }/selectBeforeFeedBack?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/selectBeforeFeedBack?currentPage=${requestScope.FeedBackAllMsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.FeedBackAllMsg.currPage != requestScope.FeedBackAllMsg.totalPage}">
           <a href="${pageContext.request.contextPath }/selectBeforeFeedBack?currentPage=${requestScope.FeedBackAllMsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/selectBeforeFeedBack?currentPage=${requestScope.FeedBackAllMsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
   </span>
        </td>
    </tr>
    </table>   	
   </c:if>
  </div>
<script src="layui.all.js"></script>
<script>
</script>
  </body>
</html>