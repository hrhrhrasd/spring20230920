<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오전 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>jstl if tag</h1>
<c:if test="true">
    <p>출력</p>
</c:if>

<c:if test="false">
    <p>출력x</p>
</c:if>

<hr>
<c:if test="${param.name == 'son'}">
    <p>hello son</p>
</c:if>

<hr>
<h3>var 속성 : test 의 연산결과 저장</h3>
<c:if test="${param.name == 'son'}" var="isSon">
    <p>hello son</p>
</c:if>
<c:if test="${!isSon}" >
    <p>son이 아님</p>
</c:if>
</body>
</html>
