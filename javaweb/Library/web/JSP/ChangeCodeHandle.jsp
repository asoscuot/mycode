<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/29
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="conn.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String NewCode = request.getParameter("ChangeCode");
    String userID = (String) session.getAttribute("userID");

    Dao dao = new Dao();//创建Dao对象
    Connection con = dao.connection();//获得连接对象
    String sql = "SELECT * FROM users";//定义一个查询语句
    Statement stat = con.createStatement();
    ResultSet rs = stat.executeQuery(sql);//执行查询语句

    if((rs.next())){
        String sql1 = "UPDATE users SET password="+NewCode+" WHERE userID="+userID+"";
        stat.executeUpdate(sql1);

%>
<script type="text/javascript">
    window.alert("修改成功");
    window.document.location.href = "ChangeRegister.jsp";
</script>
<%
    }
%>
</body>
</html>
