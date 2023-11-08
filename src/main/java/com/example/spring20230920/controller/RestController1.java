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
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/main1")
@RestController   // Controller + ResponseBody
public class RestController1 {

    private final MyDao10 dao;

    @GetMapping("/sub1")
    public String method1() {
        return "hello boot app!!";
    }

    @GetMapping("/sub2")
    public String method2() {
        return dao.getCustomerNameById(5);
    }

    @GetMapping("/sub3")
    public MyDto34 method3() {
        return dao.getCustomerById(5);
    }

    @GetMapping("/sub4")
    public ResponseEntity<MyDto34> method4(int id) {
        MyDto34 customer = dao.getCustomerById(id);

        if (customer == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(customer);
    }

    @GetMapping("/sub5")
    public ResponseEntity<String> method5(int id) {
        String employee = dao.getEmployeeById(id);

        if (employee == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(employee);
    }

    @GetMapping("/sub6")
    public List<Integer> method6() {
        return dao.getCustomerIdList();
    }

    @GetMapping("/sub7")
    public List<Integer> method7() {
        return dao.getEmployeeIdList();
    }
}
