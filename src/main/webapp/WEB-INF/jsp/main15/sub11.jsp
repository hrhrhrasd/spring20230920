<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-27
  Time: 오전 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${items}</h1>
<h1>${sessionScope.items}</h1>
<h1>${sessionScope.items[0]}</h1>
</body>
</html>
