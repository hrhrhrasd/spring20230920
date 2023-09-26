<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-26
  Time: 오후 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1></h1>
<form action="/main13/sub10">
    <div>
        <label for="input1">제목</label>
        <input type="text" id="input1" name="title">
    </div>
    <div>
        <label for="input2">내용</label>
        <textarea name="inside" id="input2" cols="30" rows="10"></textarea>
    </div>
    <input type="submit">
</form>
</body>
</html>
