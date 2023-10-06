<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-06
  Time: 오전 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>공급자 목록</h1>
<h4>${page} 페이지</h4>
<a href="/main22/sub2?page=${page-1}">이전</a>
<a href="/main22/sub2?page=${page+1}">다음</a>
<div>
    <c:forEach begin="1" end="${lastPageNum}" var="pageNum">
        <a href="/main22/sub2?page=${pageNum}">${pageNum}</a>
    </c:forEach>
</div>
<br>
<c:forEach items="${suppliers}" var="sup">
    id : ${sup.id} , name : ${sup.name}
    <br>
</c:forEach>
</body>
</html>
