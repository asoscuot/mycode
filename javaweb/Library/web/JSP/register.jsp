<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/27
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .box{
            width:500px;
            height:300px;
            border: 1px solid blue;
            margin:10px auto;
            text-align: center;
            background-color: aqua;
        }
    </style>
</head>
<body>
<div class="box">欢迎注册
<form action="NewRegister.jsp" method="get">
    姓名：
    <input type="text" name="name">
    <br> <br> <br>

    密码：
    <input type="password" name="password">
    <br> <br> <br>

    <input type="reset" value="重置">
    <input type="submit" value="注册">

</form>
</div>
</body>
</html>
