<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/29
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .title {
            text-align: center;
        }

    </style>
</head>

<body>
<div class="title">
    <h2>您要归还的书是：</h2>
    <form action="ReturnBook.jsp" method="get">
        <input type="text" name="ReturnBookName">
        <input type="submit" value="查询">
    </form>
</div>
</body>
</html>
