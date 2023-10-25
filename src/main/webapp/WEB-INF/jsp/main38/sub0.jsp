<%--
  Created by IntelliJ IDEA.
  User: admin2
  Date: 2023-10-24
  Time: 오후 4:11
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
      axios.get("/main38/sub1");
    }
  </script>
</div>
<div>
  <button onclick="ajax2()">button2</button>
  <script>
    function ajax2() {
      axios.get("/main38/sub2")
              .then(function (response) {
                console.log("응답 받은 후 할 일");
                console.log(response);
                console.log(response.data);
                console.log(response.status);
                console.log(response.statusText);
                console.log(response.headers);
                console.log(response.config);
              });
    }
  </script>
</div>
<div>
  <button onclick="ajax3()">button3</button>
  <script>
    function ajax3() {
      axios.get("/main38/sub3")
              .then(function (res) {
                console.log(res.data);
                console.log(res.data.age);
                console.log(res.data.name);
              });
    }
  </script>
</div>
<div>
  <button onclick="ajax4()">button4</button>
  <script>
    function ajax4() {
      const data = response.data
      axios.get("/main38/sub4")
              .then(function (response) {
                console.log(data.city);
                console.log(data.price);
                console.log(data.list[0]);
                console.log(data.birth);
              });
    }
  </script>
</div>
<div>
  <input type="text" name="id" id="input1">
  <button onclick="ajax5()">button5</button>
  <script>
    function ajax5() {
      const pid = document.querySelector("#input1").value;
      axios.get("/main38/sub5?id="+pid)
              .then(function (response) {
                console.log(response.data.ProductID);
                console.log(response.data.ProductName);
                console.log(response.data.Unit);
                console.log(response.data.Price);
              });
    }
  </script>
</div>
<div>
  <button onclick="ajax6()">button6</button>
  <script>
    function ajax6() {
      axios.get("/main38/sub2")
              .then(function () {
                console.log("응답 완료 후 실행")
              })
              .then(function () {
                console.log("그 다음 실행")
              })
              .then(function () {
                console.log("그 다음 실행2")
              })
    }
  </script>
</div>
<div>
  <button onclick="ajax7()">button7</button>
  <script>
    function ajax7() {
      axios.get("/main38/sub2")
              .then(function () {
                console.log("첫 함수")
                return "asd";
              })
              .then(function (param) {
                console.log("두번째 함수")
                console.log(param)
                return 123;
              })
              .then(function (param) {
                console.log("3 함수")
                console.log(param)
              });
    }
  </script>
</div>
<div>
  <button onclick="ajax8()">button8</button>
  <script>
    function ajax8() {
      axios.get("/main38/sub2")
              .then(function (param) {
                console.log("첫 함수")
                return param.data;
              })
              .then(function (data) {
                console.log("둘 함수")
                console.log(data)
              })
    }
  </script>
</div>
<div>
  <button onclick="ajax9()">button9</button>
  <script>
    function ajax9() {
      axios.get("/main38/sub2")
              .then(response => response.data)
              .then(data => console.log(data));
    }
  </script>
</div>
<div>
  <button onclick="ajax10()">button10</button>
  <script>
    function ajax10() {
      axios.get("/main38/sub4")
              .then(response => response.data)
              .then(data => console.log(data.list[2]));
    }
  </script>
</div>
<div>
  <button onclick="ajax11()">button11</button>
  <script>
    function ajax11() {
      axios.get("/main38/sub4")
              .then(response => response.data)
              .then(({price, birth, list, city}) => console.log(price)); // 3000
    }
  </script>
</div>
<div>
  <button onclick="ajax12()">button12</button>
  <script>
    function ajax12() {
      axios.get("/main38/sub4")
              .then(({data}) => console.log(data.price))
    }
  </script>
</div>
<div>
  <button onclick="ajax13()">button13</button>
  <script>
    function ajax13() {
      axios.get("/main38/sub4")
              .then(response => response.data)
              .then(({price, city, country = "korea"}) => {
                console.log(price);
                console.log(city);
                console.log(country);
              });
    }
  </script>
</div>




<script>
  // 구조 분해 할당
  // destructuring assignment
  let a = {
    name: "son",
    age: 30
  };

  console.log(a.name);
  console.log(a.age);

  let myName = a.name;
  let myAge = a.age;

  console.log(myName);
  console.log(myAge);

  let {name, age} = a;  // destructuring assignment
  console.log(name);
  console.log(age);

  let b = {
    city: "seoul",
    country: "korea"
  }

  let {city, country} = b;
  console.log(city);
  console.log(country);

  let c = {
    email: "abc@gmail.com",
    price: 300
  }
  let {email} = c;
  console.log(email)

  let e = {
    city2: "seoul",
    country2: "korea"
  }
  let {city2, country2, category} = e
  //    seluol  korea     undefined

  let f = {
    city3: "seoul",
    country3: "korea"
  }
  let {city3, country3, address3 = "신촌"} = f  //없으면 기본값 할당, 덮어쓰기 안됨

  let g = [30, 40, 50]
  let [h, i, j] = g;
  console.log(h);
  console.log(i);
  console.log(j);

  let [k, l] = g; // k=30 , l=40
  let [m, ...n] = g;  // m=30, n=[40, 50]
  let [...o] = g; // o=[30,40,50]
</script>


</body>
</html>
