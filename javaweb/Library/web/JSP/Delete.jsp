<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/29
  Time: 19:09
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
    String userID = request.getParameter("userID");
%>
<form action="DeleteHandle.jsp" method="post" id="deleteForm">
    <input type="hidden" name="userID" value="<%= userID%>">

</form>
<script>
    var result = confirm("你确定要删除吗？");
    if(result){
        alert("删除成功！");

        document.getElementById("deleteForm").submit();
       // window.document.location.href = "ChangeRegister.jsp";

    }else{
        window.document.location.href = "ChangeRegister.jsp";
    }
</script>
</body>
</html>
