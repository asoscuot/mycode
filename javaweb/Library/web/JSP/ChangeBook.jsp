<%@ page import="conn.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/30
  Time: 9:53
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
    String sql = "SELECT * FROM books";//定义一个查询语句
    ResultSet rs = statement.executeQuery(sql);//执行查询语句
%>
<body>
<div class="title">
    <h2>图书列表如下：</h2>
</div>

<div class="table-container">
    <table border="1">
        <tr>
            <th>书本编号</th>
            <th>书名</th>
            <th>作者</th>
            <th>状态</th>
            <th>更改</th>

        </tr>
        <%
            while (rs.next()) {

        %>

        <tr>
            <td><%= rs.getString("BookID")%>
            </td>
            <td><%= rs.getString("Title")%>
            </td>
            <td><%= rs.getString("Author")%>
            </td>
            <td><%= rs.getString("remark")%>
            </td>
            <td>
            <form action="DeleteBook.jsp" method="get">
                <input type="submit" value="删除">
                <input type="hidden" value="<%=rs.getString("BookID")%>" name="BookID">
            </form>
            </td>
        </tr>

        <%
            }
        %>
    </table>
</div>
</body>
</html>
