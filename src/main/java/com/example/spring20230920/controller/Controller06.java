package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto3;
import com.example.spring20230920.domain.MyDto4;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main6")
public class Controller06 {
    @RequestMapping("/sub1")
    public void method1(MyDto3 myDto3) {
        System.out.println(myDto3);
    }

    @RequestMapping("/sub2")
    public void method2(MyDto4 myDto4) {
        System.out.println(myDto4);
    }
}
