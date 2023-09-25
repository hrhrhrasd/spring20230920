<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${param.age >= 20}" var="vote">
    <p>투표 가능</p>
</c:if>
<c:if test="${!vote}">
    <p>투표 불가</p>
</c:if>
</body>
</html>
