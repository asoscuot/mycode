<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/27
  Time: 12:53
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
    <%
        String str = (String)session.getAttribute("user");
        if (str == null) {
            response.sendRedirect("../HTML/main.html");
        }
    %>
<h1>尊敬的<%=str %> <br>
    欢迎访问图书借阅系统</h1>
    <p>您可以在这里进行以下操作：</p>
        <li><a href="bookLooking.jsp">查阅图书</a></li>
        <li><a href="borrow.jsp">借阅图书</a></li>
        <li><a href="return.jsp">还书</a></li>
<%--        <li><a href="bookReservation.jsp">预约图书</a></li>--%>
<%--        <li><a href="myBooks.jsp">我的资料</a></li>--%>
</div>
</body>
</html>
