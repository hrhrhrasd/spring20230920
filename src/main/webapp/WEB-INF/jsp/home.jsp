<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-22
  Time: 오후 6:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
  * {
    text-decoration: none;
  }
  .container a {
    border: 1px solid black;
  }
</style>
<div class = "container">
  <div>
    <h1>Hello Spring</h1>
    <p>회원 기능</p>
    <p>
      <a href="/members/new">회원 가입</a>
      <a href="/members">회원 목록</a>
    </p>
  </div>
</div>
</body>
</html>
