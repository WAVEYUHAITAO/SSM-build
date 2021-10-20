<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddBook</title>
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%--BootStrap美化页面--%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--这里使用隐藏域把bookID加入到表单数据中--%>
        <div class="form-group">
            <label>书籍编号：
                <input type="text" name="bookID" class="form-control" value="${books.bookID}" required>
            </label>
        </div>
        <div class="form-group">
            <label>书籍名称：
                <input type="text" name="bookName" class="form-control" value="${books.bookName}" required>
            </label>
        </div>
        <div class="form-group">
            <label>书籍数量：</label>
            <input type="text" name="bookCounts" class="form-control" value="${books.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述：</label>
            <input type="text" name="detail" class="form-control" value="${books.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control btn-primary" value="修改">
        </div>
    </form>
</div>
</body>
</html>
