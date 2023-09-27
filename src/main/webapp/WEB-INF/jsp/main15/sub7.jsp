<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-27
  Time: 오전 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>좋아하는 음식 고르기</h1>
<form action="/main15/sub8" method="post">
  <div>
    <label for="input1">피자</label>
    <input type="checkbox" name="foods" id="input1" value="pizza">
  </div>
  <div>
    <label for="input2">도넛</label>
    <input type="checkbox" name="foods" id="input2" value="donut">
  </div>
  <div>
    <label for="input3">사과</label>
    <input type="checkbox" name="foods" id="input3" value="apple">
  </div>
  <div>
    <label for="input4">우유</label>
    <input type="checkbox" name="foods" id="input4" value="milk">
  </div>
  <div>
    <label for="input5">버거</label>
    <input type="checkbox" name="foods" id="input5" value="burger">
  </div>
  <input type="submit">
</form>
</body>
</html>
