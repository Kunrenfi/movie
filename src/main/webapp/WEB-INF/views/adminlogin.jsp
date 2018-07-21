<%--
  Created by IntelliJ IDEA.
  User: 林力克
  Date: 2018/7/12
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" %>

<html>
<head>
    <meta charset="utf-8">
    <title>管理员登录</title>
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
<form action="adminlogin.do" method="post">
    <p>
        <label>name:<input name="aname" value="0001"></label>
    </p>
    <p>
        <label>Password:<input name="apassword" type="password" value="123456"></label>
    </p>
    <p>
        <button type="submit">登录</button>
        <a href="/returnlogin.do">用户登录</a>
    </p>
</form>
<%session.removeAttribute("message"); %>
</body>
</html>
