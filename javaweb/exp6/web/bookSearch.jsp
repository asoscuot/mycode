<%--
  Created by IntelliJ IDEA.
  User: 刘赤鸣1
  Date: 2023/12/7
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <script>
    function searchBooks() {
      var bookName = document.getElementById("bookName").value;

      // 检查文本框是否为空
      if (bookName.trim() === "") {
        alert("文本框不能为空");
        return;
      }

      var xhttp = new XMLHttpRequest();
      xhttp.onreadystatechange = function() {
        if (this.readyState == 4) {
          var searchResultsContainer = document.getElementById("searchResults");

          // 清空现有搜索结果
          searchResultsContainer.innerHTML = "";

          // 处理未找到书籍的情况
          if (this.status == 200) {
            // 创建新的 div 元素用于包装每次查询的结果
            var resultDiv = document.createElement("div");
            resultDiv.innerHTML = this.responseText;

            // 将新的结果追加到容器中
            searchResultsContainer.appendChild(resultDiv);
          } else {
            // 显示未找到书籍的提示信息
            searchResultsContainer.innerHTML = "抱歉，本店没有此书";
          }
        }
      };
      xhttp.open("POST", "BookSearchServlet", true);
      xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
      xhttp.send("bookName=" + bookName);
    }
  </script>
</head>
<body>
<h2>图书查询</h2>
<label for="bookName">输入图书名字：</label>
<input type="text" id="bookName" name="bookName" required>
<button type="button" onclick="searchBooks()">查询</button>

<div id="searchResults"></div>
<a href="ViewCartServlet">查看购物车</a>

</body>
</html>