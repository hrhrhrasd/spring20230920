package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao7;
import com.example.spring20230920.domain.MyDto39;
import com.example.spring20230920.domain.MyDto40;
import com.example.spring20230920.domain.MyDto41;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main36")
public class Controller36 {

    private final MyDao7 dao;

    @GetMapping("/sub1")
    public void method1() {

    }

    // axios.get("/main36/sub2", {params: {id: 5}});

    // main36/sub2?id=5
    @GetMapping("/sub2")
    public void method2(Integer id) {
        Map<String, Object> data = dao.selectByCustomerId(id);
        System.out.println("data = " + data);
    }

    @GetMapping("/sub3")
    public void method3(Integer id) {
        Map<String, Object> data = dao.selectByEmployeeId(id);
        System.out.println("data = " + data);
    }

    /*
    axios.post("/main36/sub4", {
        lastName: "손",
        firstName: "흥민",
        birthDate: "2020-02-02"
    }, {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })
     */
    @PostMapping("/sub4")
    public void method4(String lastName, String firstName, LocalDate birthDate) {
        dao.insertEmployee(lastName, firstName, birthDate);
    }

    /*
    axios.post("/main36/sub5", {
        name: "라면",
        price: 1.11,
        category: 1
    }, {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })
     */
    @PostMapping("/sub5")
    public void method5(String name, Double price, Integer category) {
        int r = dao.insertproduct(name, price, category);
    }

    /*
    axios.delete("/main36/sub6")
     */
    @DeleteMapping("/sub6")
    public void method6() {
        System.out.println("Controller36.method6");
    }

    @DeleteMapping("/sub7")
    public void method7() {
        System.out.println("Controller36.method7");
    }

    /*
    axios.delete("/main36/sub8?name=son")
     */
    @DeleteMapping("/sub8")
    public void method8(String name) {
        System.out.println("Controller36.method8");
    }

    // pathVariable : 경로에 포함된 데이터
    // axios.delete("/main36/sub9/son")
    @DeleteMapping("/sub9/{name}")
    public void method9(@PathVariable("name") String n) {
        System.out.println("n = " + n);
    }

    // axios.delete("/main36/sub10/3")
    // axios.delete("/main36/sub10/5")
    // axios.delete("/main36/sub10/7")
    @DeleteMapping("/sub10/{num}")
    public void method10(@PathVariable("num") Integer n) {
        System.out.println("n = " + n);
    }

    @DeleteMapping("/sub11/{pid}")
    public void method11(@PathVariable("pid") Integer pid) {
        int c = dao.deleteByProductId(pid);
        System.out.println(c + "개의 항목 삭제");
    }
    // n번 고객 삭제

    @DeleteMapping("/sub12/{eid}")
    public void method12(@PathVariable("eid") Integer cid) {
        int i = dao.deleteByCustomerId(cid);
        System.out.println(i + "번 고객 삭제 완료");
    }

    /*
    axios.put("/main36/sub13")
    put /main36/sub13
     */
    @PutMapping("/sub13")
    public void method13() {
    }

    /*
    axios.put("/main36/sub14", {
        name: "son",
        address: "korea"
    }, {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })
     */
    @PutMapping("/sub14")
    public void method14(String name, String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    /*
    axios.put("/main36/sub15", {
        city: "seoul",
        age: 77,
        score: 15.15
    }, {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })
     */
    @PutMapping("/sub15")
    public void method15(MyDto39 dto) {
        System.out.println("city = " + dto.getCity());
        System.out.println("age = " + dto.getAge());
        System.out.println("score = " + dto.getScore());
    }

    /*
    axios.put("/main36/sub16", {
        id: 3,
        name: "햄버거",
        category: 2,
        price: 500.00
    } , {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })
     */

    @PutMapping("/sub16")
    public void method16(MyDto40 dto) {
        int rows = dao.updateProduct(dto);
        System.out.println(rows + "개의 데이터 수정됨");
    }

    /*
    axios.put("/main36/sub17", {
        lastName: "lee",
        firstName: "kang",
        birthDate: "2002-02-20",
        id: 5
    } , {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })
     */
    @PutMapping("/sub17")
    public void method17(MyDto41 dto) {
        int i = dao.updateEmployee(dto);
        System.out.println("i = " + i);
    }
}
