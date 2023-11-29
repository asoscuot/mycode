<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/27
  Time: 13:28
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
<body>
<%
    String usersName = request.getParameter("name");
    String password = request.getParameter("password");

    if(usersName != null && password != null && !usersName.isEmpty() && !password.isEmpty()){
        Dao dao = new Dao();//创建Dao对象
        Connection con = dao.connection();//获得连接对象
        String tableName = "users";//数据库中的一个表的表名

        Statement stat = con.createStatement();
        request.setCharacterEncoding("utf-8");

        //获取数据库中用户数量
        String countQuery = "SELECT MAX(userID) AS maxID FROM users";
        ResultSet maxIDResult = stat.executeQuery(countQuery);
        int newUserID = 0;

        if (maxIDResult.next()) {
            int maxID = maxIDResult.getInt("maxID");
            newUserID = maxID + 1;//将最ID+1 赋给newUserID
        }

        String sql = "INSERT INTO users(userID,name,password) VALUES('"+newUserID+"','"+usersName+"','"+password+"')";

        stat.executeUpdate(sql);
        out.println("注册成功！");
        stat.close();
        con.close();

    }else{
        System.out.println("注册失败！请填写完整的用户名和密码");
    }
%>
<a href ="../HTML/main.html">返回登录界面</a>
</body>
</html>
