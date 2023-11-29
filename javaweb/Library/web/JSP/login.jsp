<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/27
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="conn.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>

<html>
<head>
    <title>login</title>
</head>
<body>
<%
    Dao dao = new Dao();
    Connection con = dao.connection();

    String userName = request.getParameter("name");
    String password = request.getParameter("password");

    session.setAttribute("user",userName);//储存用户名字
    Statement stat = con.createStatement();

    String sql =
            "SELECT name,password,type ,userID FROM users";
    ResultSet rs = stat.executeQuery(sql);
    while (rs.next()) {
        String text1 = rs.getString("name");
        String password1 = rs.getString("password");
        String type1 = rs.getString("type");
        int ID = rs.getInt("userID");

        if (text1.equals(userName) && password1.equals(password)) {
            session.setAttribute("userID",ID);
            if(type1.equals("normal")) {
                response.sendRedirect("books.jsp");
            }
            if(type1.equals("manage")){
                response.sendRedirect("manager.jsp");
            }
        }
    }
%>
<script type="text/javascript">
    window.alert("账号或者密码错误");
    window.document.location.href = "../HTML/main.html";
</script>
</body>
</html>
