<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/29
  Time: 20:30
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
<%
    String userID = request.getParameter("userID");

    Dao dao = new Dao();//创建Dao对象
    Connection con = dao.connection();//获得连接对象

    String sql = "SELECT * FROM users";//定义一个查询语句
    Statement stat = con.createStatement();
    ResultSet rs = stat.executeQuery(sql);//执行查询语句

    while(rs.next()){
        String ID = rs.getString("userID");

        if(userID.equals(ID)){
            String sql1 = "DELETE FROM users WHERE userID="+userID+"";
            Statement stat1 = con.createStatement();
            stat1.executeUpdate(sql1);
            stat1.close();
        }
    }

    rs.close();


    String sql1 = "SELECT * FROM borrow";//定义一个查询语句
    Statement stat1 = con.createStatement();
    ResultSet rs1 = stat1.executeQuery(sql1);//执行查询语句

    while(rs1.next()){
        String ID = rs1.getString("userID");

        if(userID.equals(ID)){
            String sql2 = "DELETE FROM borrow WHERE userID="+userID+"";
            Statement stat2 = con.createStatement();
            stat2.executeUpdate(sql2);
            stat2.close();
        }
    }

    rs1.close();
%>
<body>
<a href="ChangeRegister.jsp">返回</a>
</body>
</html>
