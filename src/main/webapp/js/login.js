$(function(){
    $("#btn").click(function(){
        var name = $("#inputEmail").val();
        var pwd = $("#inputPassword").val();
        if(name===""){
            alert("用户名不能为空！");
            return false;
        }
        else if(pwd===""){
            alert("密码不能为空！");
            return false;
        }
        else
        {
            $.ajax({
                type:'post',
                url:'login',
                dataType:"json",
                async: true,
                data:{admin_Name:name,admin_Password:pwd},
                success:function(data){
                    if(data==null){
                        alert("没有这个用户！")
                    }
                    else{
                      alert("登录成功");
                        window.location.href = "loginstate?uname="+data.admin_Name;
                    }
                }
            });
        }
    });
});
