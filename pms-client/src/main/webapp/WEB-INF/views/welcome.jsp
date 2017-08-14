    <%@ page language="java"  pageEncoding="UTF-8"%>  
    <%  
    String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
    %>  
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
    <html>  
    <head>  
    <base href="<%=basePath%>">  
    <title>My JSP 'hello.jsp' starting page</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    </head>  
    <body>  
      
<div class="container">
   <div class="jumbotron">
        <h1>欢迎登陆页面！</h1>
        <p>这是一个超大屏幕（Jumbotron）的实例。</p>
        <p><a class="btn btn-primary btn-lg" role="button">
        学习更多</a>
      </p>
   </div>
</div>

    </body>  
    </html>  