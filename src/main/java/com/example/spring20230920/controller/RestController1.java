package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao10;
import com.example.spring20230920.domain.MyDto34;
import com.example.spring20230920.service.MyService2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/main1")
public class RestController1 {

    private final MyDao10 dao;

    @GetMapping("/sub1")
    @ResponseBody
    public String method1() {
        return "hello boot app!!";
    }

    @GetMapping("/sub2")
    @ResponseBody
    public String method2() {
        return dao.getCustomerNameById(5);
    }

    @GetMapping("/sub3")
    @ResponseBody
    public MyDto34 method3() {
        return dao.getCustomerById(5);
    }

    @GetMapping("/sub4")
    @ResponseBody
    public ResponseEntity<MyDto34> method4(int id) {
        MyDto34 customer = dao.getCustomerById(id);

        if ( customer == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(customer);
    }
}
