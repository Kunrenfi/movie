<%--
  Created by IntelliJ IDEA.
  User: 林力克
  Date: 2018/7/13
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<strong>${message}</strong>
<form action="/addmovie.do" method="post">
    <p>
        <label>电影名称:<input name="mname"></label>
    </p>
    <p>
        <label>价格:<input name="mprice"></label>
    </p>

    <p>
        <button type="submit">确定</button>
        <a href="/welcome.do">返回</a>

    </p>
</form>
</body>
</html>
