<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-06
  Time: 오후 2:30
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
    table {
        width: 700px;
    }

    td {
        border-bottom: 1px solid black;
    }

    tr th:first-child {
        width: 100px;
    }

    tr td:first-child {
        width: 100px;
    }

    tr th:last-child {
        width: 600px;
    }

    tr td:last-child {
        width: 600px;
    }

    .active {
        color: red;
    }


</style>
<h1>고객 목록</h1>
<h4>${page}페이지</h4>
<div>
    <c:if test="${prev >= 1}">
        <a href="/main22/sub3?page=1">처음</a>
    </c:if>
<c:if test="${prev >= 1}">
    <a href="/main22/sub3?page=${prev}">이전</a>
</c:if>
<c:forEach begin="${left}" end="${right}" var="i">
    <a
            <c:if test="${i==page}">class="active"</c:if>
            href="/main22/sub3?page=${i}" id="btn${i}"><span>${i}</span></a>
</c:forEach>
    <c:if test="${next <= lastPageNum}">
<a href="/main22/sub3?page=${next}">다음</a>
    </c:if>
    <c:if test="${next <= lastPageNum}">
        <a href="/main22/sub3?page=${lastPageNum}">마지막</a>
    </c:if>
</div>
<br>

<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
    </tr>
    <c:forEach items="${customers}" var="cus">
        <tr>
            <td>${cus.id}</td>
            <td>${cus.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
