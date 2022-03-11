<%--
  Created by IntelliJ IDEA.
  User: ManGO
  Date: 2022/3/11
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>

<%--    <script>--%>
<%--        function userNameOnBlur() {--%>
<%--            $.post({--%>
<%--                url: "${pageContext.request.contextPath}/user/login",--%>
<%--                data: {"userName": $("#username").val()},--%>
<%--                success: function (data, status) {--%>
<%--                    $("#userNameInfo").css("color", "red");--%>
<%--                    if (data.toString() === 'ok') {--%>
<%--                        $("#userNameInfo").css("color", "green");--%>
<%--                    }--%>
<%--                    $("#userNameInfo").html(data);--%>
<%--                }--%>
<%--            })--%>
<%--        }--%>

<%--        function passwordOnBlur() {--%>
<%--            $.post({--%>
<%--                url: "${pageContext.request.contextPath}/user/login",--%>
<%--                data: {"password": $("#password").val()},--%>
<%--                success: function (data, status) {--%>
<%--                    $("#passwordInfo").css("color", "red");--%>
<%--                    if (data.toString() === 'ok') {--%>
<%--                        $("#passwordInfo").css("color", "green");--%>
<%--                    }--%>
<%--                    $("#passwordInfo").html(data);--%>
<%--                }--%>
<%--            })--%>
<%--        }--%>
<%--    </script>--%>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    <p>账号<input type="text" id="username" name="userName" onblur="userNameOnBlur()" required></p>
    <span id="userNameInfo"></span>
    <p>密码<input type="text" id="password" name="password" onblur="passwordOnBlur()" required></p>
    <span id="passwordInfo"></span>
    <p>
        <input type="submit" value="登录">
        <input href="${pageContext.request.contextPath}/user/register" type="button" value="注册">
    </p>

</form>
</body>
</html>
