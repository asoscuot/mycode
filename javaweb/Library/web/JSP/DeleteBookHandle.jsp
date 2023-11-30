<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/30
  Time: 18:56
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
    String BookID = request.getParameter("BookID");

    Dao dao = new Dao();//创建Dao对象
    Connection con = dao.connection();//获得连接对象

    String sql = "SELECT * FROM books";//定义一个查询语句
    Statement stat = con.createStatement();
    ResultSet rs = stat.executeQuery(sql);//执行查询语句

    String sql1 = "SELECT * FROM borrow";//定义一个查询语句
    Statement stat1 = con.createStatement();
    ResultSet rs1 = stat1.executeQuery(sql1);//执行查询语句

    while(rs.next()){
        String ID = rs.getString("BookID");

        if(BookID.equals(ID)){
            String sql2 = "DELETE FROM books WHERE BookID="+BookID+"";
            Statement stat2 = con.createStatement();
            stat2.executeUpdate(sql2);
        }
    }

    String sql3 = "SELECT * FROM users";
    Statement stat3 = con.createStatement();
    ResultSet rs2 = stat3.executeQuery(sql3);

    while(rs1.next()){
        String ID = rs1.getString("bookID");
        String userID = rs1.getString("userID");

        if(BookID.equals(ID)){

            while(rs2.next()){
                String userID1 = rs2.getString("userID");
                int count = rs2.getInt("count");

                if(userID1.equals(userID)){
                    count--;
                    String sql4 = "UPDATE users SET count="+count+" WHERE userID='"+userID+"'";
                    Statement stat4 = con.createStatement();
                    stat4.executeUpdate(sql4);
                }
            }

            String sql5 = "DELETE FROM borrow WHERE bookID="+BookID+"";
            Statement stat5 = con.createStatement();
            stat5.executeUpdate(sql5);
            stat5.close();
        }
    }


%>
<body>
<a href="ChangeBook.jsp">返回</a>
</body>
</html>
