package com.example.spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {
    @RequestMapping("/")
    public String method1() {
        return "home";
    }

    @RequestMapping("/path")
    public void method2() {
    }

    @RequestMapping("/path2")
    public void method3() {
    }



}
