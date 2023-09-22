<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-22
  Time: 오후 2:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>forEach tag</h1>
<p>콘텐츠 반복 출력</p>
<p>주요 attribute : begin, end, var, items, varStatus</p>
<%-- begin과 end 모두 포함
     end > begin
     begin > 0 --%>
<c:forEach begin="1" end="3">
    <li>Lorem ipsum.</li>

</c:forEach>
<c:forEach begin="0" end="2" var="num">
    <li>num : ${num}</li>

</c:forEach>
<c:forEach begin="0" end="2" var="num">
    <li>num : ${myList[num]}</li>

</c:forEach>
<c:forEach items="${myList}" var="car">
    <li>car : ${car}</li>
</c:forEach>
</body>
</html>
