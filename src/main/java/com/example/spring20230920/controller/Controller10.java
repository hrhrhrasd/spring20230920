package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto10;
import com.example.spring20230920.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main10")
public class Controller10 {

    @RequestMapping("/sub1")
    public void method1(Model model) {
        MyDto9 o1 = new MyDto9();
        MyDto9 o2 = new MyDto9();
        MyDto9 o3 = new MyDto9();

        o1.setFirstName("son");
        o2.setFirstName("lee");
        o3.setFirstName("kim");


        model.addAttribute("students", List.of(o1, o2, o3));
    }

    @RequestMapping("/sub2")
    public void method2(Model model) {
        MyDto9 o1 = new MyDto9();
        MyDto9 o2 = new MyDto9();

        o1.setLastName("두식");
        o2.setLastName("봉석");

        model.addAttribute("personMap", Map.of("person1", o1, "person2", o2));

        model.addAttribute("people", Map.of("1st", o1, "2nd", o2));
    }

    @RequestMapping("/sub3")
    public void method3(Model model) {
        MyDto10 o1 = new MyDto10();
        o1.setName("doosik");
        o1.setId(3);
        o1.setFoods(List.of("pizza", "burger", "milk"));
        o1.setCars(List.of("bmw", "benz", "audi"));

        model.addAttribute("person1", o1);
    }

    @RequestMapping("/sub4")
    public void method4(Model model) {
        model.addAttribute("myList", List.of("tesla", "kia", "benz"));
    }

    @RequestMapping("/sub5")
    public void method5(Model model) {
        model.addAttribute("foodList", List.of("pizza", "burger", "bob", "mul"));
        model.addAttribute("names", List.of("kim", "lee", "park", "choi"));
    }

    @RequestMapping("/sub6")
    public void method(Model model) {
        List<MyDto9> list = new ArrayList<>();
        list.add(new MyDto9("31", "son", "hm", "football", "010"));
        list.add(new MyDto9("32", "lee", "ki", "football", "020"));
        list.add(new MyDto9("45", "kim", "ds", "java", "030"));
        list.add(new MyDto9("64", "park", "gr", "seoul", "040"));
        list.add(new MyDto9("12", "choi", "fe", "spring", "050"));
        model.addAttribute("people", list);
    }
}
