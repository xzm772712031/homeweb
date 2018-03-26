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
<script type="text/javascript">
</script>
</head>
<body>
<div style="width: 600px; float: centre">
	<fieldset class="layui-elem-field layui-field-title"
				style="margin-top: 30px;">
				<legend>订单详情</legend>
			</fieldset>
			<div class="layui-tab">
				<ul class="layui-tab-title">
					<li>个人信息</li>
					<li>预约信息</li>
					<li class="layui-this">订单信息</li>
					<li>保险信息</li>
				</ul>
				<div class="layui-tab-content">
					<div class="layui-tab-item">
						<table class="am-table">
							<thead>
								<tr>
									<td>姓名</td>
									<td>${userme.userName }</td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>您的邮箱</td>
									<td>${userme.userEmail }</td>
								</tr>
								<tr>
									<td>您的电话</td>
									<td>${userme.userTel }</td>

								</tr>
								<tr>
									<td>您的地址</td>
									<td>${userme.userAddress }</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="layui-tab-item">
						<table class="am-table">
							<thead>
								<tr>
									<td>预约编号</td>
									<td>${bespeak.bespeakId }</td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>客户姓名</td>
									<td>${bespeak.bespeakAtten }</td>
								</tr>
								<tr>
									<td>搬迁城市</td>
									<td>${bespeak.bespeakCity }</td>
								</tr>
								<tr>
									<td>搬出地</td>
									<td>${bespeak.bespeakOut }</td>
								</tr>
								<tr>
									<td>搬入地</td>
									<td>${bespeak.bespeakIn }</td>
								</tr>
								<tr>
									<td>搬运时间</td>
									<td>${bespeak.strDate }</td>
								</tr>
								<tr>
									<td>提交时间</td>
									<td>${bespeak.strDate2 }</td>
								</tr>
								<tr>
									<td>联系电话</td>
									<td>${bespeak.bespeakTel }</td>
								</tr>
								<tr>
									<td>服务类型</td>
									<td>${bespeak.servicetype.serviceTypeName }</td>
								</tr>
								<tr>
									<td>物品类型</td>
									<td>${bespeak.goodsType }</td>

								</tr>
								<tr>
									<td>预约状态</td>
									<td>${bespeak.bespeakId }</td>
								</tr>
								<tr>
									<td>其他说明</td>
									<td>${bespeak.bespeakAdd }</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="layui-tab-item layui-show">
					<table class="am-table">
							<thead>
								<tr>
									<td>订单编号</td>
									<td>${order.orderId }</td>
								</tr>
							</thead>
							<tbody>
			 				<tr>
									<td>订单创建时间</td>
									<td>${order.strDate }</td>
								</tr>
								<tr>
									<td>订单金额</td>
									<td>${order.orderPrice }</td>
								</tr>					
								<tr>
									<td>订单状态</td>
									<td>								
									<c:if test="${order.orderState==0 }">
									服务分配完成，等待进行服务.<br>
									</c:if>	
									<c:if test="${order.orderState==1}">
									服务完成.<br>
									</c:if>	
									<c:if test="${order.orderState==2}">
									服务进行中.<br>
									</c:if>	
									<c:if test="${order.orderState==3}">
									订单终止.<br>
									</c:if>		
									<c:if test="${order.orderState==5}">
									完成反馈.<br>
									</c:if>									
								</tr>		
								<tr>		
               						<td>任务分配</td>
               						<td>
									车辆安排：<br>
									<c:forEach items="${carlist}" var="c">
				                    ${c.car.carId}, ${c.car.carName},类型： ${c.car.cartype.carTypeName},${c.car.carClient}<br>
					                </c:forEach>
					                                                         人员安排：<br>
						            <c:forEach items="${epolyeelist}" var="e">
				                    ${e.epolyee.epolyeeName},  ${e.epolyee.job.jobName}, ${e.epolyee.epolyeeSex}<br>
				                	</c:forEach>   				
									</td>					
								</tr>													
								<tr>
									<td>订单说明</td>
									<td>${order.orderComment }</td>
								</tr>		
							</tbody>
						</table>	
					</div>
					<div class="layui-tab-item">
						<table class="am-table">
							<thead>
								<tr>
									<td>保险编号</td>
									<td>${insurance.orderId }</td>
								</tr>
							</thead>
							<tbody>
			 				<tr>
									<td>保单创建时间</td>
									<td>${insurance.strDate }</td>
								</tr>
								<tr>
									<td>收益人</td>
									<td>${insurance.insuranceOwner }</td>
								</tr>
								<tr>
									<td>身份证</td>
									<td>								
	                                  ${insurance.ownerIdentify }		
									</td>
								</tr>	
								<tr>
									<td>保单费用</td>
									<td>${insurance.insuranceCost }</td>
								</tr>	
								<tr>
									<td>保额</td>
									<td>${insurance.insurancePrice }</td>
								</tr>
								<tr>
									<td>状态</td>
									<c:if test="${insurance.insuranceState==0 }">
									<td>未确认</td>
									</c:if>
									<c:if test="${insurance.insuranceState==1 }">
									<td>已确认</td>
									</c:if>
								</tr>			
								<tr>
									<td>保险说明</td>
									<td>${insurance.insuranceComment }</td>
								</tr>		
							</tbody>
						</table>
					</div>
				  </div>
			</div>
		</div>
<script src="layui.all.js"></script>
</body>
</html>
