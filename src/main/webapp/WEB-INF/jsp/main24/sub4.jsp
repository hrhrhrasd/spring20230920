<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-10
  Time: 오후 3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>새 직원 등록</h3>
<form action="/main24/sub4" method="post">
<div>
  firstName
  <input type="text" name="firstName">
</div>
<div>
  lastName
  <input type="text" name="lastName">
</div>
<div>
  birthDate
  <input type="date" name="birthDate">
</div>
<div>
  Photo
  <input type="text" name="photo">
</div>
<div>
  notes
  <input type="text" name="notes">
</div>
<div>
  <input type="submit" value="등록">
</div>
</form>
<script>
  window.onload = function () {
    if (${i == 1}) {
      alert("성공")
    }
  }
</script>
</body>
</html>
