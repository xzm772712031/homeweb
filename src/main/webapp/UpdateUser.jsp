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
    <script type="text/javascript"></script>
  </head>
  <body>
 <form class="layui-form" action="updateUser" method="post">
 <div class="layui-form-item">
    <label class="layui-form-label">用户编号</label>
    <div class="layui-input-block">
      <input type="text" name="userId" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.userId } " readonly >
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">登陆帐号</label>
    <div class="layui-input-block">
      <input type="text" name="userAccount" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.userAccount }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">登陆密码</label>
    <div class="layui-input-block">
      <input type="text" name="userPassword" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.userPassword }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">姓名</label>
    <div class="layui-input-block">
      <input type="text" name="userName" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input" value="${user.userName }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">电话</label>
    <div class="layui-input-block">
      <input type="text" name="userTel" required  lay-verify="required" placeholder="请输入电话" autocomplete="off" class="layui-input" value="${user.userTel }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-block">
      <input type="text" name="userEmail" required  lay-verify="required" placeholder="请输入邮箱" autocomplete="off" class="layui-input" value="${user.userEmail }">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-block">
      <input type="text" name="USerSex" required  lay-verify="required" placeholder="性别" autocomplete="off" class="layui-input" value="${user.USerSex }" readonly="readonly">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">身份证</label>
    <div class="layui-input-block">
      <input type="text" name="user_PersonId" required  lay-verify="identity" placeholder="请输入身份证号" autocomplete="off" class="layui-input" value="${user.userPersonId }" readonly="readonly">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">当前地址</label>
    <div class="layui-input-block">
      <input type="text" name="userAddress" required  lay-verify="required" placeholder="请输入身份证号" autocomplete="off" class="layui-input" value="${user.userAddress }" readonly="readonly">
    </div>
  </div>
       <c:if test="${admin.adminRole==0}">
  <div class="layui-form-item">
  
    <label class="layui-form-label">修改地址</label>
    <div class="layui-input-inline">
      <select name="province" lay-filter="province" >
                        <option value="">请选择省</option>
                    </select>
    </div>
    <div class="layui-input-inline">
       <select name="city" lay-filter="city">
                        <option value="">请选择市</option>
                    </select>
    </div>
    <div class="layui-input-inline">
       <select name="area" lay-filter="area">
                        <option value="">请选择县/区</option>
                    </select>
    </div>  
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
   
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
     
    </div>
  </div>
   </c:if>
</form>
 <script type="text/javascript" src="js/area.js"></script>
  <script type="text/javascript" src="layui/layui.js"></script>
<script>
        //初始数据
        var areaData = Area;
        var $form;
        var form;
        var $;
        layui.use(['jquery', 'form'], function() {
            $ = layui.jquery;
            form = layui.form();
            $form = $('form');
            loadProvince();
        });
         //加载省数据
        function loadProvince() {
            var proHtml = '';
            for (var i = 0; i < areaData.length; i++) {
                proHtml += '<option value="' + areaData[i].provinceName + '_' + areaData[i].mallCityList.length + '_' + i + '">' + areaData[i].provinceName + '</option>';
            }
            //初始化省数据
            $form.find('select[name=province]').append(proHtml);
            form.render();
            form.on('select(province)', function(data) {
                var value = data.value;
                var d = value.split('_');
                var code = d[0];
                var count = d[1];
                var index = d[2];
                if (count > 0) {
                    loadCity(areaData[index].mallCityList);
                } else {
                    $form.find('select[name=city]').parent().hide();
                }
            });
        }
         //加载市数据
        function loadCity(citys) {
            var cityHtml = '';
            for (var i = 0; i < citys.length; i++) {
                cityHtml += '<option value="' + citys[i].cityName + '_' + citys[i].mallAreaList.length + '_' + i + '">' + citys[i].cityName + '</option>';
            }
            $form.find('select[name=city]').html(cityHtml).parent().show();
            form.render();
            loadArea(citys[0].mallAreaList);
            form.on('select(city)', function(data) {
                var value = data.value;
                var d = value.split('_');
                var code = d[0];
                var count = d[1];
                var index = d[2];
                if (count > 0) {
                    loadArea(citys[index].mallAreaList);
                } else {
                    $form.find('select[name=area]').parent().hide();
                }
            });
        }
         //加载县/区数据
        function loadArea(areas) {
            var areaHtml = '';
            for (var i = 0; i < areas.length; i++) {
                areaHtml += '<option value="' + areas[i].areaName + '">' + areas[i].areaName + '</option>';
            }
            $form.find('select[name=area]').html(areaHtml).parent().show();
            form.render();
            form.on('select(area)', function(data) {
                //console.log(data);
            });
        }

        //设置省市区
        function setArea(area){
            var p = '';
            var c = '';
            var a = '';
            for (var i = 0; i < areaData.length; i++) {
                var provinceName = areaData[i].provinceName;
                var provinceCode = areaData[i].provinceCode;
                var mallCityList = areaData[i].mallCityList;
                for(var j=0;j<mallCityList.length;j++){
                    var cityName = mallCityList[j].cityName;
                    var cityCode = mallCityList[j].cityCode;
                    var mallAreaList = mallCityList[j].mallAreaList;
                    for(var k=0;k<mallAreaList.length;k++){
                        if(area == mallAreaList[k].areaName){
                            var areaCode = mallAreaList[k].areaCode;
                            a = areaCode;
                            c = cityCode+'_'+mallAreaList.length+"_"+j;
                            p = provinceCode+"_"+mallCityList.length+"_"+i;
                        }
                    }
                }
            }
            console.log('p:'+p+"====c:"+c+"=====a:"+a);
            $('select[name=province]')[0].value = p;
            $('select[name=city]').val(c);
            $('select[name=area]').val(a);
            layui.use('form',function(){
                var form = layui.form();
                form.render();
            });
        }
        setArea('丰台区');
    </script>
  </body>
</html>
