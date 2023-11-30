<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/11/30
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String BookID = request.getParameter("BookID");
%>
<form action="DeleteBookHandle.jsp" method="post" id="deleteForm">
    <input type="hidden" name="BookID" value="<%=BookID%>">

</form>
<script>
    var result = confirm("你确定要删除吗？");
    if(result){
        alert("删除成功！");

        document.getElementById("deleteForm").submit();
        // window.document.location.href = "ChangeRegister.jsp";

    }else{
        window.document.location.href = "ChangeBook.jsp";
    }
</script>
</body>
</html>
