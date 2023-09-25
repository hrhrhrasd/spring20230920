package com.example.spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main12")
public class Controller12 {
    @RequestMapping("/sub1")
    public void method1() {

    }

    @RequestMapping("/asub2/bsub2/csub2/dsub2/esub2")
    public void method2() {

    }

    @RequestMapping("/sub3")
    public void method3() {

    }

    @RequestMapping("/sub4")
    public void method4(String name, Integer age, Model model) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        model.addAttribute("message", name + "," + age);
    }

    @RequestMapping("/sub5")
    public void method5() {

    }

    @RequestMapping("/sub6")
    public void method6(String q, Model model) {
        model.addAttribute("q", q);
    }
}
