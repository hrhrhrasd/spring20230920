<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-11
  Time: 오전 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>${as}</h4>
<form action="" method="post">
    번호
    <input type="text" name="pid" placeholder="상품번호 입력">
    <button>삭제</button>
</form>
</body>
<script>
    window.onload = function () {
        if (${ch == 0}) {
            alert("번호 입력")
        }
    }
</script>
</html>
