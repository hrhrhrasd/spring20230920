<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-26
  Time: 오전 9:13
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
  div {
    margin-top: 5px;
  }
</style>
<h3>input 요소</h3>
<form action="/main13/sub2">
  <div>
    <input type="text" name="param1" placeholder="text">
  </div>
  <div>
    <input type="password" name="param2" placeholder="password">
  </div>
  <div>
    <input type="date" name="param3">
  </div>
  <div>
    <input type="button" name="param4" value="button">
  </div>
  <div>
    <input type="number" name="param5" placeholder="number">
  </div>
  <div>
    <input type="submit" name="param6">
  </div>
  <div>
    <input type="radio" name="param7">
    <input type="radio" name="param7">
    <input type="radio" name="param7">
  </div>
  <div>
    <input type="checkbox" name="param8">
    <input type="checkbox" name="param8">
    <input type="checkbox" name="param8">
  </div>
  <div>
    <input type="hidden" name="param9" value="some value">
  </div>
  <div>
    <input type="" name="param10">
  </div>
  <button>전송</button>
</form>
<hr>
<form action="main13/sub2">
  <div>
    <input type="text" name="param1" value="son" placeholder="이름 입력">
  </div>
  <div>
    <input type="text" maxlength="5" required>
  </div>
  <div>
    <input type="text" name="param3" readonly value="son">
  </div>
  <div>
    <input type="text" name="param4" value="son" disabled>
  </div>
  <div>
    <input type="text" name="param5" pattern="\d{3}">
  </div>
  <div>
    <input type="checkbox" name="param6" checked id="">
    <input type="checkbox" name="param6" id="">
  </div>
  <div>
    <input type="radio" name="param7" checked id="">
    <input type="radio" name="param7" id="">
  </div>
  <div>
    <input type="file" multiple>
  </div>
  <button>전송</button>
</form>

<hr>

<form action="/main13/sub2">
  <label for="input1">주소</label>
  <input type="text" id="input1">
  <br>
  <div>
    <div>
      <label for="check1">Lorem.</label>
      <input type="checkbox" name="param1" id="check1">
    </div>
    <div>
      <label for="check2">ads</label>
      <input type="checkbox" name="param2" id="check2">
    </div>
    <div>
      <label for="check3">qwe</label>
      <input type="checkbox" name="param3" id="check3">
    </div>
  </div>
  <input type="submit">
</form>
</body>
</html>
