<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-27
  Time: 오전 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>${modelAttr1}</div>
<div>${sessionAttr1}</div>
<div>${attr}</div>
<%-- 돈가스 나옴--%>
<div>${sessionScope.attr}</div>
</body>
</html>
