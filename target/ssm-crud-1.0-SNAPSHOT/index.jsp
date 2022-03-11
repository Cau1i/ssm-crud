<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<h3>
    <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表�?</a>
</h3>
<div class="container-fluid">
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        账号<input type="text" name="userName">
        密码<input type="text" name="password">
        <input type="submit" value="登录">
        <a href="${pageContext.request.contextPath}/user/register">注册</a>
    </form>
</div>
</body>
</html>