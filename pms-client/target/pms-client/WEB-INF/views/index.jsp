 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
 
 
<html>
    <head>
    <title>登陆</title>
        <!-- 引入 Bootstrap -->
        <script src="thirdparty/jquery/jquery.min.js"></script>
        <link href="thirdparty/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <script src="thirdparty/bootstrap/js/bootstrap.min.js"></script>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <style type="text/css">
            body{background: url("images/logback1.jpg") no-repeat;background-size:cover;font-size: 16px;}
            .form{background: rgba(255,255,255,0.2);width:400px;margin:100px auto;}
            #login_form{display: block;}
            #register_form{display: none;}
            .fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}
            input[type="text"],input[type="password"]{padding-left:26px;}
            .checkbox{padding-left:21px;}
        </style>
    </head>
    <body>

    <div class="container">
        <div class="form row">
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" onsubmit = "return checkUser();">
                <h3 class="form-title">Login to your account</h3>
                <div class="col-sm-9 col-md-9">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="	glyphicon glyphicon-user"></i></span>
                        <input class="form-control required" type="text" id="login_form_username" placeholder="Username" name="username" autofocus="autofocus" maxlength="20"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="	glyphicon glyphicon-lock"></i></span>
                        <input class="form-control required" type="password" id="login_form_password" placeholder="Password" name="password" maxlength="8"/>
                    </div>
                    <div class="input-group">
                        <label class="checkbox">
                            <input type="checkbox" name="remember" value="1"/> Remember me
                        </label>
                        <hr />
                        <a href="javascript:;" id="register_btn" class="">Create an account</a>
                    </div>
                    <div class="form-group">
                        <input type="button" class="btn btn-success pull-right" value="Login" id="login_form_btn"/>
                    </div>
                </div>
            </form>
        </div>

        <div class="form row">
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="register_form">
                <h3 class="form-title">Login to your account</h3>
                <div class="col-sm-9 col-md-9">
                    <div class="form-group">
                        <i class="fa fa-user fa-lg"></i>
                        <input class="form-control required" type="text" placeholder="Username" name="username" autofocus="autofocus"/>
                    </div>
                    <div class="input-group">
                        <i class="fa fa-lock fa-lg"></i>
                        <input class="form-control required" type="password" placeholder="Password" id="register_password" name="password"/>
                    </div>
                    <div class="input-group">
                        <i class="fa fa-check fa-lg"></i>
                        <input class="form-control required" type="password" placeholder="Re-type Your Password" name="rpassword"/>
                    </div>
                    <div class="form-group">
                        <i class="fa fa-envelope fa-lg"></i>
                        <input class="form-control eamil" type="text" placeholder="Email" name="email"/>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-success pull-right" value="Sign Up "/>
                        <input type="submit" class="btn btn-info pull-left" id="back_btn" value="Back"/>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <script type="text/javascript" src="js/index.js" ></script>
    </body>
</html>
