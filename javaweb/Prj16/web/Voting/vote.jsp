<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/10/31
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>

<html>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<body>
<%@ page import="Dao.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String teacherNo = request.getParameter("teacherNo");
    if (teacherNo != null && !teacherNo.isEmpty()) {
        Dao dao = new Dao();
        Connection conn = dao.connection();
        String updateSql = "UPDATE T_VOTE SET VOTE = VOTE + 1 WHERE TEACHERNO = '" + teacherNo + "'";
        Statement updateStat = conn.createStatement();
        updateStat.executeUpdate(updateSql);
        updateStat.close();
        conn.close();
    }
    response.sendRedirect("display.jsp");

%>

</body>
</html>

