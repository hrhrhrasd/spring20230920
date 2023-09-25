<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-25
  Time: 오후 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>form 요소</h1>

<form action="">
    <input type="text" name="param1">
    <br>
    <input type="text" name="param2">
    <br>
    <button type="submit">확인</button>
</form>

<hr>

<form action="">
    <input type="text" name="name">
    <br>
    <input type="text" name="age">
    <br>
    <input type="text" name="address">
    <br>
    <input type="text" name="email">
    <br>
    <button type="submit">확인</button>
</form>
<hr>
<h3>action 속성 : request 파라미터들을 어디로 보낼지 결정</h3>
<p>action속성이 없거나 빈 문자열의 경우 현재 경로</p>
<form action="https://search.naver.com/search.naver">
    <input type="text" name="query" placeholder="네이버 검색">
    <br>
    <button type="submit">확인</button>
</form>

<form action="https://www.google.com/search">
    <input type="text" name="q" placeholder="구글 검색">
    <br>
    <button type="submit">확인</button>
</form>

<form action="https://search.daum.net/search">
    <input type="text" name="q" placeholder="다음 검색">
    <br>
    <button type="submit">확인</button>
</form>

<hr>
<h1>action 속성값 : / 로 시작하는 경우 path가 결정됨</h1>
<form action="/main12/sub2">
    <input type="text" name="age">
    <br>
    <button type="submit">확인</button>
</form>
<h1>action 속성값 : scheme, / 이 아니면 현재 페이지의 상대 경로</h1>
<form action="sub3">
    <input type="text" name="age">
    <br>
    <button type="submit">확인</button>
</form>
<h1>.. : 한경로 위</h1>
<form action="..">
    <input type="text" name="age">
    <br>
    <button type="submit">확인</button>
</form>

</body>
</html>
