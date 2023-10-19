package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao5;
import com.example.spring20230920.domain.MyDto34;
import com.example.spring20230920.domain.MyDto36;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main31")
public class Controller31 {
    private final MyDao5 dao;

    @GetMapping("/sub1")
    public void method1(String country) {
        int res1 = dao.select1(country);
        System.out.println("res1 = " + res1);
        int res2 = dao.select1(null);
        System.out.println("res2 = " + res2);
    }

    @GetMapping("/sub2")
    public void method2(Integer number) {
        dao.select2(number);
    }

    // sub3?code=1&k=ro
    // sub3?code=2&k=ro
    @GetMapping("/sub3")
    public void method3(Integer code, String k, Model model) {
        List<Map<String, Object>> rows = dao.select3(code, "%" + k + "%");
        model.addAttribute("names", rows);
    }

    @GetMapping("/sub4")
    public void method4() {
        dao.select4(30);
    }

    @GetMapping("/sub5")
    public void method5(Model model, MyDto36 dto) {
        model.addAttribute("cityList", dao.listCustomerCity());
        model.addAttribute("countryList", dao.listCustomerCountry());
        model.addAttribute("customerList", dao.listCustomer(dto));
    }
}
