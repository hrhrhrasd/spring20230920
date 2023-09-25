<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오후 5:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div>
        <thead>
        <tr>
            <th>#</th>
            <th>이름</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="members" var="member">
            <td>${member.id}</td>
            <td>${member.name}</td>
        </c:forEach>
        </tbody>
    </div>
</div>

</body>
</html>
