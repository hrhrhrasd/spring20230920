<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-19
  Time: 오전 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객 조회</h3>
<form action="/main30/sub15">
    <input type="text" name="id">
    <button>조회</button>
</form>
<h3>고객 정보 수정</h3>
<div>${msg}</div>
<form action="/main30/sub16" method="post">
    <div>
        <input type="text" name="customerID" value="${customers.customerID}" readonly>
    </div>
    <div>
        <input type="text" name="customerName" value="${customers.customerName}">
    </div>
    <div>
        <input type="text" name="contactName" value="${customers.contactName}">
    </div>
    <div>
        <input type="text" name="address" value="${customers.address}">
    </div>
    <div>
        <input type="text" name="city" value="${customers.city}">
    </div>
    <div>
        <input type="text" name="postalCode" value="${customers.postalCode}">
    </div>
    <div>
        <input type="text" name="country" value="${customers.country}">
    </div>
    <div>
        <button>수정</button>
    </div>
</form>
</body>
</html>
