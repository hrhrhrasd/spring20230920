<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-26
  Time: 오후 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main13/sub8">
    <div>
        <label for="input1">아이디</label>
        <input type="text" id="input1" name="id" pattern="\d+" placeholder="숫자만 입력">
    </div>
    <div>
        <label for="input7">이름</label>
        <input type="text" id="input7" name="name">
    </div>
    <div>
        <label for="input2">주소</label>
        <input type="text" id="input2" name="address">
    </div>
    <div>
        <label for="input3">스케쥴</label>
        <input type="datetime-local" id="input3" name="schedule">
    </div>
    <div>
        <p>할일</p>
        <label for="input4">java</label>
        <input type="checkbox" id="input4" name="todos" value="java">
        <label for="input5">spring</label>
        <input type="checkbox" id="input5" name="todos" value="spring">
        <label for="input6">jsp</label>
        <input type="checkbox" id="input6" name="todos" value="jsp">
    </div>
    <button>전송</button>
</form>
</body>
</html>
