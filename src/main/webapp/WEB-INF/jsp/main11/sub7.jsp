<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오후 2:01
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
    .T1 {
        border: 1px solid black;
        width: 500px;
        height: 500px;
    }
    .T1 tr:first-child {
        text-align: center;
        font-size: 1.5rem;
    }

    .T1 tr:first-child td {
        height: 80px;
        line-height: 80px;
    }
    tr {
        border: 1px solid red;
    }

    td {
        border: 1px solid red;
    }

    .tr1 td {
        height: 30px;
        background: skyblue;

    }

</style>

<c:choose>
    <c:when test="${param.show}">
        <table class="T1">
            <tr>
                <p><td colspan = "5" span>table 만들기</td></p>
            </tr>
            <tr class ="tr1">
                <td>id</td>
                <td>firstName</td>
                <td>lastName</td>
                <td>className</td>
                <td>phoneNumber</td>
            </tr>
            <c:forEach items="${people}" var="i" varStatus="status">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.firstName}</td>
                    <td>${i.lastName}</td>
                    <td>${i.className}</td>
                    <td>${i.phoneNumber}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:when test="${!param.show}">
        <p>데이터가 없습니다</p>
    </c:when>
</c:choose>
</body>
</html>
