<%@ page import="conn.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/29
  Time: 16:22
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

        .table-container{
            margin: 0 auto;
            width:30%;
        }

        table{
            width:100%;
            border-collapse: collapse;
        }

        th,td{
            border:1px solid #000;
            padding: 8px;
        }
    </style>

</head>
<%
    String booksName = request.getParameter("booksName");

    Dao dao = new Dao();//创建Dao对象
    Connection con = dao.connection();//获得连接对象
    String tableName = "books";//数据库中的一个表的表名

    Statement statement = con.createStatement();
    String sql = "SELECT * FROM users";//定义一个查询语句
    ResultSet rs = statement.executeQuery(sql);//执行查询语句
%>
<body>
<div class="title">
    <h2>已经注册的同学如下：</h2>
</div>

<div class="table-container">
    <table border="1">
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>密码</th>
            <th>已借书籍</th>
            <th>更改</th>
        </tr>
        <%
            while (rs.next()) {

        %>

        <tr>
            <td><%= rs.getString("userID")%>
            </td>
            <td><%= rs.getString("name")%>
            </td>
            <td><%= rs.getString("password")%>&nbsp&nbsp&nbsp&nbsp<a href="ChangeCode.jsp?userID=<%= rs.getString("userID")%>">修改</a>
            </td>
            <td><%= rs.getString("count")%>
            </td>
            <td><form action="Delete.jsp" method="get">
                <input type="submit" value="删除">
                <input type="hidden" value="<%=rs.getString("userID")%>" name="userID">
            </form></td>
        </tr>

        <%
            }
        %>
    </table>
</div>
</body>
</html>
