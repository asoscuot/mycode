<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/28
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="conn.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.time.LocalDateTime" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String BookName = (String) session.getAttribute("BookName");//获取书名
    String userName = (String) session.getAttribute("user");//获取用户名
    Integer userID = (Integer) session.getAttribute("userID");//获取用户ID
    String BookID = (String) session.getAttribute("BookID");//获取书的id
    LocalDateTime time = LocalDateTime.now();//获取当前时间

    Dao dao = new Dao();//创建Dao对象
    Connection con = dao.connection();//获得连接对象


//    String sql = "SELECT * FROM borrow";//定义一个查询语句
//    //ResultSet rs = statement.executeQuery(sql);//执行查询语句

    Statement stat = con.createStatement();
    request.setCharacterEncoding("utf-8");

    String sql2 = "SELECT * FROM users";
    ResultSet rs = stat.executeQuery(sql2);

    while (rs.next()) {
        int count = rs.getInt("count");
        int id = rs.getInt("userID");

        if (id == userID) {
            if (count < 2) {
                count++;

                String sql1 = "INSERT INTO borrow(userID,userName,bookName,bookID,beginDate) VALUES(" + userID + ",'" + userName + "','" + BookName + "','" + BookID + "','" + time + "')";
                stat.executeUpdate(sql1);

                String sql = "UPDATE users SET count = " + count + " WHERE userID = " + id + "";
                stat.executeUpdate(sql);
                out.print("借阅成功");
                break;
            } else {
                out.print("已经达到借阅上限，无法借阅！！！");
            }
        }
    }
%>
<div>

</div>
</body>
</html>
