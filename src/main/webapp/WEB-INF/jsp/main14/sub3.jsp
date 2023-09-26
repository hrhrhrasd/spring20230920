<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-26
  Time: 오후 3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main14/sub4", method="post">
    <label for="input1">제목</label>
    <br>
    <input type="text" name="title" id="input1">
    <br>
    <label for="texta1">내용</label>
    <br>
    <textarea name="content" id="texta1" cols="30" rows="10"></textarea>
    <br>
    <input type="submit">
</form>

</body>
</html>
