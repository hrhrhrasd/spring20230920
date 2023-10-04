<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-04
  Time: 오후 2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>공급자 목록</h3>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>PHONE</th>
    </tr>
    <c:forEach items="${shippers}" var="sup">
        <tr>
            <td>${sup.id}</td>
            <td>${sup.name}</td>
            <td>${sup.phone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>