<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-10
  Time: 오후 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <div>
        SupplierName
        <input type="text" name="sname">
    </div>
    <div>
        ContactName
        <input type="text" name="cname">
    </div>
    <div>
        Address
        <input type="text" name="add">
    </div>
    <div>
        City
        <input type="text" name="city">
    </div>
    <div>
        PostalCode
        <input type="text" name="code">
    </div>
    <div>
        Country
        <input type="text" name="country">
    </div>
    <div>
        Phone
        <input type="text" name="phone">
    </div>
    <button>입력</button>
</form>

<table>
    <tr>
        <th>ID</th>
        <th>sName</th>
        <th>cName</th>
        <th>Address</th>
        <th>City</th>
        <th>PostalCode</th>
        <th>Phone</th>
    </tr>
    <c:forEach items="${suppliers}" var="sup" >
        <tr>
            <td>${sup.id}</td>
            <td>${sup.sname}</td>
            <td>${sup.cname}</td>
            <td>${sup.address}</td>
            <td>${sup.city}</td>
            <td>${sup.postalCode}</td>
            <td>${sup.phone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
