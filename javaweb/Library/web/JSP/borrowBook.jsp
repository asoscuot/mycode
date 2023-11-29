<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/28
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="conn.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .title {
        text-align: center;
    }

    .table-container {
        margin: 0 auto;
        width: 80%;
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid #000;
        padding: 8px;
    }
</style>
<body>
<%
    String BorrowBookName = request.getParameter("borrowBookName");
    session.setAttribute("BookName", BorrowBookName);

    Dao dao = new Dao();//创建Dao对象
    Connection con = dao.connection();//获得连接对象
    String tableName = "books";//数据库中的一个表的表名

    Statement statement = con.createStatement();
    String sql = "SELECT * FROM books";//定义一个查询语句
    ResultSet rs = statement.executeQuery(sql);//执行查询语句

    Boolean key = true;
    while (rs.next()) {//循环数据库

        String bookName = rs.getString("Title");//bookName是数据库中列名为Title的值
        String id = rs.getString("bookID");
        String author = rs.getString("AUTHOR");
        String remark = rs.getString("remark");

        //只要输入的值和数据库中的Title对上了，就证明图书存在
        if (bookName.equals(BorrowBookName)) {
            session.setAttribute("BookID",id);
            key = false;
%>
<div class="title table-container">
    <h3>您要借阅的书是：<%=BorrowBookName %>
    </h3>

    <table border="1" cellspacing="0" width=300px>
        <tr>
            <th>图书编号</th>
            <th>作者</th>
            <th>状态</th>
        </tr>

        <tr>
            <td><%=id %>
            </td>
            <td><%=author %>
            </td>
            <td><%=remark %>
            </td>
        </tr>
    </table>
    <form action="borrowHandle.jsp" method="get">
        <input type="submit" value="确定借阅">
    </form>
</div>
<%
            break;
        }
    }

    if (key) {
%>

<script>
    window.alert("借阅图书不存在！！！");
    window.document.location.href = "borrow.jsp";
</script>
<%
    }
%>
</body>
</html>
