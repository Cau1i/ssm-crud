<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
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
            margin: 100px auto;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <h3>
        <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>
    </h3>
    <h3>
        <a href="${pageContext.request.contextPath}/user/loginPage">登陆页面</a>
    </h3>

</div>
</body>
</html>