<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-10
  Time: 오전 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main23/sub2">
    <input type="text" name="k" value="${keyword}">
    <button>조회</button>
</form>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>
    <c:forEach items="${customers}" var="customers">
        <tr>
            <th>${customers.id}</th>
            <th>${customers.name}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
