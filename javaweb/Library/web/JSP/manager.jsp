<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/28
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .title{
            text-align: center;
            color: red;
        }
    </style>
</head>
<%
    String userName = (String) session.getAttribute("user");
%>
<body>
<div class="title">
    <h2>亲爱的<%=userName%></h2>
    <h1>您是本馆至高无上的管理员</h1>
    <h2>您可以做任何事</h2>

    <form>
        <li><a href="ChangeRegister.jsp">老子要看看哪些人注册了这个nt系统</a></li>
        <li><a href="ChangeBook.jsp">闲的无聊修改一下图书</a></li>
    </form>
</div>
</body>
</html>
