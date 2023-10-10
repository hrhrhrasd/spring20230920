<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-10
  Time: 오전 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    th {
        background: skyblue;
    }
</style>
<body>
<h4>직원 조회</h4>
<form action="">
    <div>
        검색조건
        <select name="t" id="">
            <option value="lname" ${type == 'lname' ? 'selected' : ''}>Last Name</option>
            <option value="fname" ${type == 'fname' ? 'selected' : ''}>First Name</option>
            <option value="note" ${type == 'note' ? 'selected' : ''}>Notes</option>
        </select>
    </div>
    <div>
        <input type="text" placeholder="검색어 입력" name="k" value="${keyword}"></div>
    <div>
        <button>조회</button>
    </div>
</form>
<table>
    <tr>
        <th>Id</th>
        <th>LastName</th>
        <th>FirstName</th>
        <th>Notes</th>
    </tr>
    <c:forEach items="${employees}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.lname}</td>
            <td>${emp.fname}</td>
            <td>${emp.note}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
