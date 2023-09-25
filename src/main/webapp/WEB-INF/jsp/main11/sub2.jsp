<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오전 11:31
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

</style>
<c:if test="${param.dan >= 2}" var="okDan">
<c:forEach begin="1" end="9" var="i">
    ${param.dan} * ${i} = ${param.dan * i}&nbsp;&nbsp;
</c:forEach>
</c:if>
<c:if test="${!okDan}">
    2이상 입력 요망
</c:if>
</body>

</html>
