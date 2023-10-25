<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-25
  Time: 오후 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<div>
    <button onclick="ajax1()">button1</button>
    <script>
        function ajax1() {
            axios.get("/main39/sub1")
                .then(() => console.log("성공"))
                .catch(() => console.log("실패"));
        }
    </script>
</div>
<div>
    <button onclick="ajax2()">button2</button>
    <script>
        function ajax2() {
            axios.get("/main39/sub2")
                .then(() => console.log("성공"))
                .catch(() => console.log("실패"))
        }
    </script>
</div>
<div>
    <button onclick="ajax3()">button3</button>
    <script>
        function ajax3() {
            axios.get("/main39/sub2")
                .catch(function (error) {
                    console.log(error);
                    console.log(error.response.status);
                    let status = error.response.status;
                    if (status >= 400 && status <500) {
                        console.log("요청이 잘못되었습니다");
                    } else if (status >= 500 && status <= 599) {
                        console.log("서버에 오류 발생");
                    }
                });
        }
    </script>
</div>
<div>
    <button onclick="ajax4()">button4</button>
    <p id="result1"></p>
    <script>
        function ajax4() {
            axios.get("/main39/sub3")
                .catch(error => {
                    let status = error.response.status;
                    let msg = "";
                    if (status >=400 && status <500) {
                        msg = "잘못된 요청";
                    } else if (status >=500 && status <600) {
                        msg = "서버 에러";
                    }
                    document.querySelector("#result1").textContent = msg
                });
        }
    </script>
</div>
<div>
    <input type="text" id="input1">
    <button onclick="ajax5()">btton5</button>
    <script>
        function ajax5() {
            const pid = document.querySelector("#input1").value;
            axios.get("/main39/sub4?id=" + pid)
                .then(response => response.data)
                .then(data => console.log(data))
                .catch(error => console.log(error));
        }
    </script>
</div>
<div>
    <button onclick="ajax6()">button6</button>
    <script>
        function ajax6() {
            axios.get("/main39/sub5")
                .then(() => console.log("성공"))
                .catch(() => console.log("실패"))
                .finally(() => console.log("항상 실행"))
        }
    </script>
</div>
<div>
    <h3>직원 등록</h3>
    <div>
        <input type="text" id="firstNameInput" placeholder="first name">
    </div>
    <div>
        <input type="text" id="lastNameInput" placeholder="last name">
    </div>
    <div>
        <input type="date" id="birthDateInput">
    </div>
    <div>
        <textarea name="" id="notesTextarea" cols="30" rows="10" placeholder="notes"></textarea>
    </div>
    <div>
        <button onclick="ajax7AddEmployee()" id="button1">등록</button>
    </div>
    <p id="result2"></p>
    <script>
        function ajax7AddEmployee() {
            const button1 = document.querySelector("#button1");
            button1.setAttribute("disabled", "disabled");

            const lastName = document.querySelector("#lastNameInput").value;
            const firstName = document.querySelector("#firstNameInput").value;
            const birthDate = document.querySelector("#birthDateInput").value;
            const notes = document.querySelector("#notesTextarea").value;

            axios.post("/main39/sub6", {
                lastName, firstName, birthDate, notes
            })
                .then(() => {
                    document.querySelector("#result2").textContent= "등록 성공";
                })
                .catch((error) => {
                    const code = error.response.status;
                    if (code >= 400 && code <500) {
                        document.querySelector("#result2").textContent= "잘못된 입력";
                    } else if (code >= 500) {
                        document.querySelector("#result2").textContent= "서버 오류";
                    }
                })
                .finally(() => {
                    button1.removeAttribute("disabled");
                })
        }
    </script>
</div>


</body>
</html>
