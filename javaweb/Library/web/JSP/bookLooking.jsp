<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/28
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="conn.Dao" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<head>
    <title>图书查询结果</title>
    <style>
        .title {
            text-align: center;
        }

        .table-container{
            margin: 0 auto;
            width:80%;
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
            <th>书名</th>
            <th>作者</th>
            <th>价格</th>
            <th>备注</th>
        </tr>
        <%
            while (rs.next()) {
        %>

        <tr>
            <td><%= rs.getString("Title")%>
            </td>
            <td><%= rs.getString("Author")%>
            </td>
            <td><%= rs.getString("price")%>
            </td>
            <td><%= rs.getString("remark")%>
            </td>
        </tr>

        <%
            }
        %>
    </table>
</div>
</body>
</html>
