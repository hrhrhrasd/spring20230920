package com.example.spring20230920.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main15")
public class Controller15 {
    @GetMapping("/sub1")
    public void method1() {

    }

    @GetMapping("/sub2")
    public void method2(HttpSession session,
                        HttpServletRequest request) {
        System.out.println();
        System.out.println("request = " + request.getRemoteHost());
        System.out.println("session.getId() = " + session.getId());
        System.out.println();
    }

    @GetMapping("/sub3")
    public void method3(HttpSession session, HttpServletRequest request,
                        @RequestParam(value = "name", defaultValue = "") String name) {

        if (!name.isBlank()) {
            session.setAttribute("username", name);
        }
        Object username = session.getAttribute("username");

        if (username != null) {
            System.out.println();
            System.out.println("request = " + request.getRemoteHost());
            System.out.println("username = " + username);
            System.out.println();
        }
    }
}
