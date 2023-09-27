package com.example.spring20230920.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main16")
public class Controller16 {

    @Autowired
    private ServletContext application;

    @GetMapping("/sub1")
    public void method1(Model model, HttpSession session) {
        model.addAttribute("modelAttr1", "추석");
        session.setAttribute("sessionAttr1", "ㄹㅇ");
        application.setAttribute("appAttr1", "zz");
    }

    @GetMapping("/sub2")
    public void method2(HttpSession session) {
        Object count = session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 0);
        } else {
            Integer countInt = (Integer) count;
            session.setAttribute("count", ++countInt);
        }

        Object count1 = application.getAttribute("count");
        if (count1 == null) {
            application.setAttribute("count", 0);
        } else {
            Integer countInt = (Integer) count1;
            application.setAttribute("count", ++countInt);
        }
    }

    @GetMapping("/sub3")
    public void method3(Model model, HttpSession session) {
        model.addAttribute("modelattr1", "보름달");
        session.setAttribute("sessionAttr1", "송편");
    }

    @GetMapping("/sub4")
    public void method(Model model, HttpSession session) {
        Object modelattr1 = model.getAttribute("modelattr1");
        Object sessionAttr1 = session.getAttribute("sessionAttr1");
        System.out.println("modelattr1 = " + modelattr1);
        System.out.println("sessionAttr1 = " + sessionAttr1);
    }

    @GetMapping("/sub5")
    public String method5() {

        return "main16/sub5";
    }

    @GetMapping("/sub6")
    public String method6() {

        // redirection
        return "redirect:/main16/sub5";
    }

    @GetMapping("/sub7")
    public String method7() {
        return "redirect:https://www.naver.com";
    }
}
