<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-04
  Time: 오후 3:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
  table {
    border-collapse: collapse;
    width: 100%;
  }

  th, td {
    border: 1px solid black;
  }

  th {
    background-color: aqua;
  }
</style>
<body>
<table>
  <tr>
    <th>번호</th>
    <th>상품명</th>
    <th>단위</th>
    <th>가격($)</th>
  </tr>
  <c:forEach items="${products}" var="cust">
    <tr>
      <td>${cust.id}</td>
      <td>${cust.name}</td>
      <td>${cust.unit}</td>
      <td>${cust.price}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
