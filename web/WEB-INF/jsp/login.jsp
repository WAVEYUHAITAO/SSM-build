<%--
  Created by IntelliJ IDEA.
  User: HT
  Date: 2021-9-27
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<%--在web-inf下的所有页面或者资源，只能通过controller，或者servlet进行访问--%>
<h1>登录页面</h1>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="提交">
</form>



</body>
</html>
