<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/29
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.setAttribute("userID",request.getParameter("userID"));
%>
<html>
<head>
    <title>Title</title>
    <style>
        .title{
            text-align: center;
            margin: 30% auto;
        }
    </style>
</head>
<body>
<div class="title">
    <form action="ChangeCodeHandle.jsp" method="get">
        请输入修改后的密码：<input type="text" name="ChangeCode">
        <input type="submit" value="修改">
    </form>
</div>
</body>
</html>
