<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<strong>${message}</strong>
	 <form action="updatepassword.do" method="post">
        <p>
            <label>旧密码:<input name="oldPassword"></label>
        </p>
        <p>
            <label>新密码:<input name="newPassword"></label>
        </p>
        <p>
            <label>新密码确认:<input name="newPasswordConfirm"></label>
        </p>
        <p>
            <button type="submit">确定</button>
            <a href="welcome.jsp">返回</a>	
            
        </p>
    </form>
</body>
</html>