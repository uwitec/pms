/**
 * Created by YM10181 on 2017/8/9.
 */

$(function() {

    $("#login_form").validate({
        rules: {
            username: "required",
            password: {
                required: true,
                minlength: 5
            },
        },
        messages: {
            username: "请输入姓名",
            password: {
                required: "请输入密码",
                minlength: jQuery.format("密码不能小于{0}个字 符")
            },
        }
    });
    $("#register_form").validate({
        rules: {
            username: "required",
            password: {
                required: true,
                minlength: 5
            },
            rpassword: {
                equalTo: "#register_password"
            },
            email: {
                required: true,
                email: true
            }
        },
        messages: {
            username: "请输入姓名",
            password: {
                required: "请输入密码",
                minlength: jQuery.format("密码不能小于{0}个字 符")
            },
            rpassword: {
                equalTo: "两次密码不一样"
            },
            email: {
                required: "请输入邮箱",
                email: "请输入有效邮箱"
            }
        }
    });
});

//登录
$("#login_form_btn").click(function login() {
    var username = $('#login_form_username').val();
    var password = $('#login_form_password').val();
    $.ajax({
        type:"POST",
        url: "index/login",
        data:{username: username, password: password},
        success:function(data){
            if ("SUCCESS" == data.type){
                alert("登陆成功！！");
            }else{
                alert("账号或密码错误！！");
            }
        }
    });

});

$(function() {
    $("#register_btn").click(function() {
        $("#register_form").css("display", "block");
        $("#login_form").css("display", "none");
    });
    $("#back_btn").click(function() {
        $("#register_form").css("display", "none");
        $("#login_form").css("display", "block");
    });
});
