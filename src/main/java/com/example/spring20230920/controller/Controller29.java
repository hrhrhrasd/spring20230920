package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao3;
import com.example.spring20230920.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main29")
public class Controller29 {
    private final MyDao3 dao3;

    @GetMapping("/sub1")
    public void method1() {
        String name = dao3.select1();
        System.out.println("name = " + name);
    }

    @GetMapping("/sub2")
    public void method2() {
        Double price = dao3.select2();
        System.out.println("price = " + price);
    }

    @GetMapping("/sub3")
    public void method3() {
        String lName = dao3.select3();
        System.out.println("lName = " + lName);
    }

    @GetMapping("/sub4")
    public void method4() {
        LocalDate birtDate = dao3.select4();
        System.out.println("birtDate = " + birtDate);
    }

    @GetMapping("/sub5")
    public void method5() {
        List<String> list = dao3.select5();
        list.forEach(System.out::println);
    }

    @GetMapping("/sub6")
    public void method6() {
        List<LocalDate> localDates = dao3.select6();
        localDates.forEach(System.out::println);
    }

    @GetMapping("/sub7")
    public void method7() {
        List<Double> doubles = dao3.select7();
        doubles.forEach(System.out::println);
    }

    @GetMapping("/sub8")
    public void method8() {
        Map<String, Object> stringObjectMap = dao3.select8();
        System.out.println(stringObjectMap);
    }

    @GetMapping("/sub9")
    public void method9() {
        Map<String, Object> stringObjectMap = dao3.select9();
        System.out.println(stringObjectMap);
    }

    @GetMapping("/sub10")
    public void method10() {
        MyDto19 myDto19 = dao3.select10();
        System.out.println(myDto19);
    }

    @GetMapping("/sub11")
    public void method11() {
        MyDto20 dto = dao3.select11();
        System.out.println(dto);
    }

    @GetMapping("/sub12")
    public void method12() {
        MyDto21 dto = dao3.select12();
        System.out.println(dto);
    }

    @GetMapping("/sub13")
    public void method13() {
        List<Map<String, Object>> maps = dao3.select13();
        maps.forEach(System.out::println);
    }

    @GetMapping("/sub14")
    public void method14() {
        List<Map<String, Object>> maps = dao3.select14();
        maps.forEach(System.out::println);
    }

    @GetMapping("/sub15")
    public void method15() {
        List<MyDto22> myDto22s = dao3.select15();
        myDto22s.forEach(System.out::println);
    }

    @GetMapping("/sub16")
    public void method16() {
        List<MyDto23> myDto23s = dao3.select16();
        myDto23s.forEach(System.out::println);
    }

}
