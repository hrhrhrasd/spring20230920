<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오후 3:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>..  : 한 path 올라감</h3>
<form action="..">
    <input type="text" name="name" placeholder="..">
    <br>
    <button type="submit">확인</button>
</form>

<form action="../dsub3">
    <input type="text" name="name" placeholder="../dsub3">
    <br>
    <button type="submit">확인</button>
</form>

<form action="../..">
    <input type="text" name="name" placeholder="../..">
    <br>
    <button type="submit">확인</button>
</form>
</body>
</html>
