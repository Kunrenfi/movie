<%--
  Created by IntelliJ IDEA.
  User: 林力克
  Date: 2018/7/14
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="utf-8"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>电影查询</title>
</head>
<body>
<header>
    <p>
        <a>查询</a>
    </p>
    <p>
    <form action="" method="post">
        <input name="key"><button type="button"></button>
    </form>
    </p>
</header>
<main>
    <table>
        <thead>
        <tr>

            <th>电影名</th>
            <th>价格</th>
            <th>开始时间</th>
            <th>结束时间</th>

        </tr>
        </thead>

        <tbody>
        <tr>
            <td>1</td>
            <td><a href="#">查看/修改</a></td>
            <td>电影名称</td>
            <td>电影价格</td>
            <td>开始时间</td>
            <td>结束时间</td>
        </tr>
        </tbody>
    </table>

    <p>
				<span>
				共<b>100</b>条记录
				每页<b>100</b>条
				共<b>10</b>页
				</span>
        <span>
					<a>上一页</a>
					<b>1</b>
					<a>下一页</a>
				</span>


    </p>
</main>
</body>
</html>
