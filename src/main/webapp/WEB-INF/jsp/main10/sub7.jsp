<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오전 9:15
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
    span {
        display: inline-block;
        width: 32px;
        text-align: right;
    }
</style>
<h3>el에서 사용 할 수 있는 연산자</h3>
<h4>산술 연산자</h4>
<h4>+,-,*,/,%</h4>
<hr>
<h5>+</h5>
<p>${a} + ${b} = ${a + b}</p>
<p>${c} + ${d} = ${c + d}  el에서 +는 산술연산으로만 사용(연결연산x)</p>
<hr>
<h5>-</h5>
<p>${a} - ${b} = ${a - b}</p>
<p>${c} - ${d} = ${c - d}</p>
<h5>-</h5>
<p>${a} * ${b} = ${a * b}</p>
<p>${c} * ${d} = ${c * d}</p>
<h5>-</h5>
<p>${a} / ${b} = ${a / b} = ${a div b}</p>
<p>${c} / ${d} = ${c / d} = ${c div d}</p>
<h5>% (mod)</h5>
<p>${a} % ${b} = ${a % b} = ${a mod b}</p>
<p>${c} % ${a} = ${c % a} = ${c mod a}</p>
<h5>() : 우선순위</h5>
<p>${a * b - c}</p>
<p>${a * (b - c)}</p>
<p>${(a * b) - c}</p>


<hr>
<c:forEach begin="1" end="9" var="i">
    2 x ${i} = <span>${2 * i}&nbsp;&nbsp;</span>
</c:forEach>
<hr>
<c:forEach begin="1" end="9" var="i">
    <c:forEach begin="2" end="9" var="j">
        ${j} x ${i} = <span>${j*i}&nbsp;&nbsp;   </span>
    </c:forEach>
    <br>
</c:forEach>
<hr>

<c:forEach begin="1" end="9" var="i">
    <c:forEach begin="2" end="9" var="j">
        ${11 - j} x ${i} = <span>${(11 - j)*(i)}&nbsp;&nbsp;</span>
    </c:forEach>
    <br>
</c:forEach>
</body>
</html>
