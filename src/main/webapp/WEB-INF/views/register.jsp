<%--
  Created by IntelliJ IDEA.
  User: 林力克
  Date: 2018/7/12
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" %>

<html>
<head>
    <meta charset="utf-8">
    <title>用户注册</title>
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
<form action="register.do" method="post">
    <p>
        <label>Phone:<input name="uphone" ></label>
    </p>
    <p>
        <label>Name:<input name="uname" ></label>
    </p>
    <p>
        <label>Password:<input name="upassword" ></label>
    </p>
    <p>
        <button type="submit">注册</button>
        <a href="/returnlogin.do">返回</a>
    </p>
</form>
<%session.removeAttribute("message"); %>
</body>
</html>
