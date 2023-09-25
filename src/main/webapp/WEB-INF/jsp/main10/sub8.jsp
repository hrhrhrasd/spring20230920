<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오전 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>el 비교 연산자</h3>
<p> <, > , <=, >=, ==, != </p>
<p> lt, gt, le, ge, eq, ne</p>
<h4> <, lt </h4>
<p>${a} < ${b} = ${a < b} = ${a lt b}</p>
<p>${c} < ${d} = ${c < d} = ${c lt d}</p>
<h4> >, gt </h4>
<p>${a} > ${b} = ${a > b} = ${a gt b}</p>
<p>${c} > ${d} = ${c > d} = ${c gt d}</p>
<h4> <=, le </h4>
<p>${a} <= ${b} = ${a <= b} = ${a le b}</p>
<h4> >=, ge </h4>
<p>${a} >= ${b} = ${a >= b} = ${a ge b}</p>
<h4> ==, eq </h4>
<p>${a} == ${b} = ${a == b} = ${a eq b}</p>
<h4> !=, ne </h4>
<p>${a} != ${b} = ${a != b} = ${a ne b}</p>

<hr>
<p>${e} < ${f} = ${e < f} = ${e lt f}</p>
<p>${e} < ${g} = ${e < g} = ${e lt g}</p>
<hr>

<h4> &&(and), ||(or), !(not)</h4>

</body>
</html>
