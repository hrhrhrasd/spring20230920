<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오후 4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${!empty message}">
    <p>${message}</p>
</c:if>

<a href="/main12/sub3">새 계정 등록</a>
</body>
</html>
