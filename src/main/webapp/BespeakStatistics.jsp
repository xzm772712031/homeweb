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
<script src="js/echarts.js"></script>
</head>
<body>
	 <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 600px;height:400px;"></div>
    
    <div id="chart" style="width: 600px;height:400px;"></div>   
    <script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '预约类型热度统计'
            },
            tooltip: {},
            legend: {
                data:['次数']
            },
            xAxis: {
                data: []
            },
            yAxis: {},
            series: [{
                name: '次数',
                type: 'bar',
                data:[]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);

        myChart.showLoading();

        var count=[];    //收入数组（实际用来盛放X轴坐标值）
        var type=[];    //年月数组（实际用来盛放Y坐标值）
        

        $.ajax({
        	
            type : "post",
            async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
            url : "countstatistics",    //请求发送到TestServlet处
            data : {},
            dataType : "json",        //返回数据形式为json
            success : function(result) {
                //请求成功时执行该函数内容，result即为服务器返回的json对象
                if (result) {
                       for(var i=0;i<result.length;i++){       
                    	   count.push(result[i].count);    //挨个取出收入并填入类别数组
                        }
                       for(var i=0;i<result.length;i++){       
                           type.push(result[i].servicetype.serviceTypeName);    //挨个取出年月并填入销量数组
                         }
                       myChart.hideLoading();    //隐藏加载动画
                       myChart.setOption({        //加载数据图表
                           xAxis: {
                               data: type
                           },
                           series: [{
                               // 根据名字对应到相应的系列
                               name: '次数',
                               data: count
                           }]
                       });
       
                }
            
           },
            error : function(errorMsg) {
                //请求失败时执行该函数
            alert("图表请求数据失败!");
            myChart.hideLoading();
            }
       })
        
    </script>
    <script type="text/javascript">
      var myChart2 = echarts.init(document.getElementById('chart'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '预约月度图'
            },
            tooltip: {},
            legend: {
                data:['次数']
            },
            xAxis: {
                data: []
            },
            yAxis: {},
            series: [{
                name: '次数',
                type: 'bar',
                data:[]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart2.setOption(option);

        myChart2.showLoading();

        var count2=[];    //收入数组（实际用来盛放X轴坐标值）
        var months=[];    //年月数组（实际用来盛放Y坐标值）
        

        $.ajax({
            type : "post",
            async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
            url : "monthschart",    //请求发送到TestServlet处
            data : {},
            dataType : "json",        //返回数据形式为json
            success : function(result) {
                //请求成功时执行该函数内容，result即为服务器返回的json对象
                if (result) {
                       for(var i=0;i<result.length;i++){       
                    	   count2.push(result[i].count);    //挨个取出收入并填入类别数组
                        }
                       for(var i=0;i<result.length;i++){       
                           months.push(result[i].months);    //挨个取出年月并填入销量数组
                         }
                       myChart2.hideLoading();    //隐藏加载动画
                       myChart2.setOption({        //加载数据图表
                           xAxis: {
                               data: months
                           },
                           series: [{
                               // 根据名字对应到相应的系列
                               name: '次数',
                               data: count2
                           }]
                       });
                }
            
           },
            error : function(errorMsg) {
                //请求失败时执行该函数
            alert("图表请求数据失败!");
            myChart2.hideLoading();
            }
       })
        
    
    
    </script>
	<script src="layui.all.js"></script>
</body>
</html>
