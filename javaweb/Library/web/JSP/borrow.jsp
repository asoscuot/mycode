<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/28
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .title{
            text-align: center;
        }
    </style>
</head>
<body>
<div class="title">
    <h2>请输入您要借阅的书籍的名字：</h2>
    <form action="borrowBook.jsp" method="get">
        <input type="text" name="borrowBookName">
        <input type="submit" value="查询">
    </form>
</div>
</body>
</html>
