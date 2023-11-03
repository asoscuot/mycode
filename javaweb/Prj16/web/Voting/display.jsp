<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/10/31
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Dao.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<body>
<table align = "center">
    <caption>欢迎给老师投票</caption>
    <tr bgcolor="yellow">
        <td>编号</td>
        <td>姓名</td>
        <td>得票数</td>
        <td>投票</td>
    </tr>

    <%
        Dao dao = new Dao();//创建Dao对象
        Connection conn = dao.connection();//获得连接对象
            String tableName = "t_vote";//数据库中的一个表的表名

        Statement stat = conn.createStatement();
        String sql = "SELECT TEACHERNO,TEACHERNAME,VOTE FROM T_VOTE";
        ResultSet rs = stat.executeQuery(sql);

        while(rs.next()){
            String teacherNo = rs.getString("TEACHERNO");
            String teacherName = rs.getString("TEACHERNAME");
            int vote = rs.getInt("VOTE");
            %>
    <tr bgcolor="pink">
        <td><%= teacherNo %><td>
            <%= teacherName %>
        <td><img src ="../img/bar.jpg"  width="<%=vote%>" height = "10"><%= vote%></td>
        <td><a href="vote.jsp?teacherNo=<%=teacherNo%>">投票</a></td>
    </tr>
    <%
        }
        stat.close();
        conn.close();
    %>
</table>
</body>
</html>
