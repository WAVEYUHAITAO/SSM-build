<%--
  Created by IntelliJ IDEA.
  User: HT
  Date: 2021-8-27
  Time: 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      h3, a{
        width: 180px;
        height: 38px;
        text-decoration: none;
        color:black;
        font-size: 18px;
        margin: 100px auto;
        text-align: center;
        line-height: 38px;
        background: aqua;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>

    <h3>
        <a href="${pageContext.request.contextPath}/book/allBook">进入书籍展示页面</a>
    </h3>

  <h1><a href="${pageContext.request.contextPath}/goLogin">登录页面</a></h1>

  </body>
</html>
