<%@ page pageEncoding="utf-8" %>

<html>
    <head>
        <meta charset="utf-8">
        <title>用户订票系统</title>
    </head>
    <script>
    	if(window.top!==window){
    		window.top.location.href=window.location.href;
    	}
    </script>

    <style>
        strong,form{
            text-align: center;
        }
    </style>
	
<body>
    <strong>${message}</strong>
    <form action="login.do" method="post">
        <p>
            <label>Phone:<input name="uphone" value="15726952116"></label>
        </p>
        <p>
            <label>Password:<input name="upassword" type="password" value="123456"></label>
        </p>
        <p>
            <button type="submit">Login</button>
            <a href="adminlogin.do" methods="get">管理员登录</a>
            <a href="register.do" methods="get">新用户注册</a>
        </p>
    </form>
    <%session.removeAttribute("message"); %>
</body>
</html>

