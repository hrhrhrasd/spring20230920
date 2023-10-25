package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao7;
import com.example.spring20230920.dao.MyDao8;
import com.example.spring20230920.domain.MyDto33;
import com.example.spring20230920.domain.MyDto45;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main38")
public class Controller38 {

    private final MyDao8 dao;

    @GetMapping("/sub0")
    public void method0() {
    }


    /*
    axios.get("/main38/sub1")
     */
    @GetMapping("/sub1")
    @ResponseBody
    public String method() {

        return "/main38/sub1";
    }

    @GetMapping("/sub2")
    @ResponseBody
    public String method2() throws InterruptedException {

        Thread.sleep(1000);

        return "hello world!";
    }

    @GetMapping("/sub3")
    @ResponseBody
    public Map<String, Object> method3() {

        return Map.of("name", "son", "age", 30);
    }

    @GetMapping("/sub4")
    @ResponseBody
    public Map<String, Object> method4() {
        return Map.of("city", "seoul", "price", 3000,
                "list", List.of("son", "kim", "lee"), "birth", "1999-03-03");
    }

    /*
    axios.get("/main38/sub5?id=8")
     */
    @GetMapping("/sub5")
    @ResponseBody
    public Map<String, Object> method5(Integer id) {
        return dao.selectProductById(id);
    }

    /*
    axios.get("/main38/sub6?id=4")
     */
    @GetMapping("/sub6")
    @ResponseBody
    public MyDto33 method6(Integer id) {
        return dao.selectEmployeeById(id);
    }

    /*
    axios.get("/main38/sub7?id=33")
     */
    @GetMapping("/sub7")
    @ResponseBody
    public MyDto45 method7(Integer id) {
        return dao.selectProdById2(id);
    }
}
