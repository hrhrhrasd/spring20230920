<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-10
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main23/sub3">
    <select name="op">
        <option value="customerName" ${option == 'customerName' ? 'selected' : ''}>고객명</option>
        <option value="contactName" ${option == 'contactName' ? 'selected' : ''}>계약명</option>
    </select>
    <input type="text" name="k" value="${keyword}">
    <button>조회</button>
</form>
<table>
    <tr>
        <th>Id</th>
        <th>customerName</th>
        <th>contactName</th>
    </tr>
    <c:forEach items="${customers}" var="customers">
        <tr>
            <th>${customers.id}</th>
            <th>${customers.customerName}</th>
            <th>${customers.contactName}</th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
