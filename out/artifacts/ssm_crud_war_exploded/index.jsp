<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
        function username() {
            $.post({
                url: "${pageContext.request.contextPath}}/login",
                data: {"username": $("#username").val},
                success: function (data, status) {
                    console.log("data" + data);
                    console.log("status" + status);
                }
            })
        }

        function password() {
            $.post({
                url: "${pageContext.request.contextPath}}/login",
                data: {"password": $("#password").val},
                success: function (data, status) {
                    console.log("data" + data);
                    console.log("status" + status);
                }
            })
        }
    </script>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            text-align: center;
            line-height: 38px;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <h3>
        <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>
    </h3>

    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <p>账号<input type="text" id="username" onblur="username()" required></p>
        <p>密码<input type="text" id="password" onblur="password()" required></p>
        <p><input type="submit" value="登录"></p>
    </form>
</div>
</body>
</html>