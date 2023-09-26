<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-09-26
  Time: 오전 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>회원 가입</h1>
<form action="/main13/sub5">
    <%--div*6>label[for=input$]+input#input$[name][type]--%>
    <div>
        <label for="input1">아이디</label>
        <input type="text" id="input1" name="userId">
    </div>
    <div>
        <label for="input2">이메일</label>
        <input type="email" id="input2" name="userEmail">
    </div>
    <div>
        <label for="input3">생년월일</label>
        <input type="date" id="input3" name="birthDate">
    </div>

    <h3>취미</h3>
    <div>
        <label for="input4">영화</label>
        <input type="checkbox" id="input4" name="hobby" value="movie">
    </div>
    <div>
        <label for="input5">음악감상</label>
        <input type="checkbox" id="input5" name="hobby" value="music">
    </div>
    <div>
        <label for="input6">독서</label>
        <input type="checkbox" id="input6" name="hobby" value="reading">
    </div>
    <button>회원가입</button>
</form>
<hr>
<form action="/main13/sub6">
    <%--div*6>label[for=input$]+input#input$[name][type]--%>
    <div>
        <label for="input11">아이디</label>
        <input type="text" id="input11" name="userId">
    </div>
    <div>
        <label for="input22">이메일</label>
        <input type="email" id="input22" name="userEmail">
    </div>
    <div>
        <label for="input33">생년월일</label>
        <input type="date" id="input33" name="birthDate">
    </div>

    <h3>취미</h3>
    <div>
        <label for="input44">영화</label>
        <input type="checkbox" id="input44" name="hobby" value="movie">
    </div>
    <div>
        <label for="input55">음악감상</label>
        <input type="checkbox" id="input55" name="hobby" value="music">
    </div>
    <div>
        <label for="input66">독서</label>
        <input type="checkbox" id="input66" name="hobby" value="reading">
    </div>
    <button>회원가입</button>
</form>
</body>
</html>
