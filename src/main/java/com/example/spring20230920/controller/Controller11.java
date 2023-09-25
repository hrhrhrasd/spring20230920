package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main11")
public class Controller11 {
    @RequestMapping("/sub1")
    private void method(Model model) {
    }

    @RequestMapping("/sub2")
    private void method2(Model model) {
    }

    @RequestMapping("/sub3")
    private void method3(Model model) {
    }

    @RequestMapping({"/sub4", "/sub5", "/sub6"})
    private void method4(Model model) {
    }

    @RequestMapping("/sub7")
    private void method7(@RequestParam(value = "show", defaultValue = "false") boolean show,
                         Model model) {
        if (show) {
            List<MyDto9> list = new ArrayList<>();
            list.add(new MyDto9("31", "son", "hm", "football", "010"));
            list.add(new MyDto9("32", "lee", "ki", "football", "020"));
            list.add(new MyDto9("45", "kim", "ds", "java", "030"));
            list.add(new MyDto9("64", "park", "gr", "seoul", "040"));
            list.add(new MyDto9("12", "choi", "fe", "spring", "050"));
            model.addAttribute("people", list);
        }
    }

}
