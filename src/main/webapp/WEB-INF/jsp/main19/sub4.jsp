<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-04
  Time: 오후 3:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>CITY</th>
        <th>COUNTRY</th>
    </tr>
    <c:forEach items="${customers}" var="cust">
        <tr>
            <td>${cust.id}</td>
            <td>${cust.name}</td>
            <td>${cust.city}</td>
            <td>${cust.country}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
