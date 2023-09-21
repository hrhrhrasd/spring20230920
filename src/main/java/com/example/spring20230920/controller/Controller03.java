package com.example.spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/main2")
public class Controller03 {

    //  /main2/sub1?address=seoul       /main2/sub1?address -> ""       /main2/sub1 -> null
    @RequestMapping("/sub1")
    public void method1(WebRequest webRequest) {
        System.out.println(webRequest.getParameter("address")); //seoul 출력
    }

    //  /main2/sub2?name=hr&address=seoul
    @RequestMapping("/sub2")
    public void method2(WebRequest webRequest) {
        String name = webRequest.getParameter("name");
        String address = webRequest.getParameter("address");

        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    @RequestMapping("/sub3")
    public void method3(@RequestParam("name") String name) {
        System.out.println("name = " + name);
    }

    @RequestMapping("/sub4")
    public void method4(@RequestParam("name") String name,
                        @RequestParam("address") String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    @RequestMapping("/sub5")
    public void method5(@RequestParam("email") String email,
                        @RequestParam("gender") String gender,
                        @RequestParam("number") String number) {
        System.out.println("email = " + email);
        System.out.println("gender = " + gender);
        System.out.println("number = " + number);
    }

    @RequestMapping("/sub6")
    public void method6(@RequestParam("name") String name,
                        @RequestParam("age") String age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        Integer a = Integer.valueOf(age);
    }

    @RequestMapping("/sub7")
    public void method7(@RequestParam("name") String name,
                        @RequestParam("age") int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

    }

    @RequestMapping("/sub8")
    public void method8(@RequestParam(value = "address", required = false)String address,
                        @RequestParam("married")boolean marry,
                        @RequestParam("age")int age) {
        System.out.println("address = " + address);
        String a;
        if (marry) {
            a = "기혼";
        } else {
            a = "미혼";
        }
        System.out.println("married = " + a);
        System.out.println("age = " + age);
    }

    @RequestMapping("/sub9")
    public void method9(@RequestParam(value = "name", required = false) String name) {
        System.out.println("name = " + name);
    }

    @RequestMapping("/sub10")
    public void method10(@RequestParam(value = "address", required = false)String address,
                        @RequestParam(value = "age", required = false)Integer age) {
        System.out.println("address = " + address);
        System.out.println("age = " + age);
    }
}
