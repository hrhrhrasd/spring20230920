package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao7;
import com.example.spring20230920.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main37")
public class Controller37 {

    private final MyDao7 dao;

    /*
    axios.post("/main37/sub1", '{"name":"jone"}',{
        headers: {
            "content-type": "application/json"
        }
    })

    axios.post("/main37/sub1", {name: "jone"})

    js(java) object > json text
    serialize (직렬화)     <> parse 파싱
     */
    @PostMapping("/sub1")
    public void method1(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    /*
    axios.post("/main37/sub2", {name: "lee", age:33, score: 9.5})
     */
    /*
    {name: "lee", age:33, score: 9.5}
    >>(직렬화) '{"name": "lee", "age":33, "score": 9.5}'
    >>(파싱) java map
    {name: "lee", age:33, score: 9.5}
     */
    @PostMapping("/sub2")
    public void method2(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    /*
    axios.put("/main37/sub3", {city:"seoul", name:"son", email:"asd@asd"})
     */
    @PutMapping("/sub3")
    public void method3(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    /*
    axios.post("/main37/sub4", {
       city: "paris",
       age: 30,
       married: true,
       car: null,
       home: {
            address: "seoul",
            price: 1000
       },
       foods: [
            "pizza",
            "burger",
            "water"
       ]
    });
     */
    @PostMapping("/sub4")
    public void method4(@RequestBody MyDto42 dto) {
        System.out.println("dto = " + dto);
    }

    /*
    axios.post("/main37/sub5", {
        country: "kor",
        score: 33.33,
        skills: [
            "sleep",
            "eating"
        ],
        phone: "010"
    })
     */
    @PostMapping("/sub5")
    public void method(@RequestBody MyDto43 dto) {
        System.out.println("dto.getCountry() = " + dto.getCountry());
        System.out.println("dto.getScore() = " + dto.getScore());
        System.out.println("dto.getSkills() = " + dto.getSkills());
        System.out.println("dto.getPhone() = " + dto.getPhone());
    }

    /*
    axios.post("/main37/sub6", {
        name: "son",
        email: ["son@g", "hm@g"],
        home: {
            first: "seoul",
            second: "london"
        },
        price: 35.11,
        weight: 77.6,
        married: true
    })
     */

    @PostMapping("/sub6")
    public void method6(@RequestBody MyDto44 dto) {
        System.out.println("dto = " + dto);
    }

    /*
    axios.put("/main37/sub7", {
        id: 3,
        lastName: "kim",
        firstName: "minjae",
        birthDate: "2002-02-02"
    })
     */
    @PutMapping("/sub7")
    public void method7(@RequestBody MyDto41 dto) {
        int i = dao.updateEmployee(dto);
        System.out.println(dto.getId()+"번 직원 수정됨");
    }
}
