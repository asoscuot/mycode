<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/29
  Time: 11:46
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
    String ReturnBookName = request.getParameter("ReturnBookName");
    String ReturnNer = (String) session.getAttribute("user");

    Dao dao = new Dao();//创建Dao对象
    Connection con = dao.connection();//获得连接对象

    Statement statement = con.createStatement();

    String sql = "SELECT * FROM borrow";//定义一个查询语句
    ResultSet rs = statement.executeQuery(sql);//执行查询语句

    Statement statement1 = con.createStatement();
    Boolean key = true;
    while(rs.next()){
        String name1 = rs.getString("userName");
        String name2 = rs.getString("bookName");

        if(ReturnBookName.equals(name2) && ReturnNer.equals(name1)){
            key = false;

            String sql1 = "DELETE FROM borrow WHERE userName='"+ReturnNer+"' AND bookName='"+ReturnBookName+"'";
            statement.executeUpdate(sql1);

            String sql2 = "SELECT * FROM users";
            ResultSet rs1 = statement1.executeQuery(sql2);

            while(rs1.next()){
                String name3 = rs1.getString("name");
                int count = rs1.getInt("count");

                if(name3.equals(ReturnNer)){
                    count--;
                    String sql3 = "UPDATE users SET count="+count+" WHERE name='"+ReturnNer+"'";
                    statement.executeUpdate(sql3);
                }
            }
            out.print("还书成功");
            break;
        }
    }

    if(key){
        out.print("还书失败");
    }
%>
<body>

</body>
</html>
