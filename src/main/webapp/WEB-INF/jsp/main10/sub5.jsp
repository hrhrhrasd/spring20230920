<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-22
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
<c:forEach begin="0" end="3" var="i">
    <p>${foodList[i]}</p>
</c:forEach>
<c:forEach items="${names}" var="i">
    <p>${i}</p>
</c:forEach>
<hr>

<style>
    .box {
        border: 1px solid black;
        margin: 5px;
        padding: 10px;
        display: flex;
        gap : 10px;
    }
    .box > div {
        border: 2px solid red;
    }

    .ull {
        border: 1px solid black;
        margin: 5px;
        padding: 10px;
        display: flex;
        gap: 10px;
        list-style: none;
    }

    .ull li {
        border: 2px solid red;
        width: 100px;
    }
</style>
<%--varStatus : 반복문의 상태--%>
<c:forEach begin="0" end="3" var="n" varStatus="status">
    <div class="box">
        <div class="content1">n : ${n}</div>
        <div class="content2">
            <div>count : ${status.count}</div>
            <div>index : ${status.index}</div>
            <div>first : ${status.first}</div>
            <div>last : ${status.last}</div>
        </div>
    </div>
</c:forEach>
<hr>
<c:forEach items="${names}" var = "name" varStatus="status">
    <div class="box">
        <div class="content1">names : ${name}</div>
        <div class="content2">
            <div>count : ${status.count}</div>
            <div>index : ${status.index}</div>
            <div>first : ${status.first}</div>
            <div>last : ${status.last}</div>
        </div>
    </div>
</c:forEach>
<hr>
<ul class="ull">
    <c:forEach items="${foodList}" var="foods" varStatus="status">
        <li>
            <div>${status.count} : ${foods}</div>
            <div>
                <div>index : ${status.index}</div>
                <div>first : ${status.first}</div>
                <div>last : ${status.last}</div>
            </div>
        </li>
    </c:forEach>
</ul>
</body>
</html>
