<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오후 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
  <c:when test="${param.age >= 20}">
    투표 가능
  </c:when>
  <c:when test="${param.age <20}">
    투표 불가
  </c:when>
  <c:otherwise>
    age 입력 요망
  </c:otherwise>
</c:choose>
</body>
</html>
