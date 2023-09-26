package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto10;
import com.example.spring20230920.domain.MyDto11;
import com.example.spring20230920.domain.MyDto12;
import com.example.spring20230920.domain.MyDto13;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/main13")
public class Controller13 {
    @RequestMapping({"/sub1", "/sub2"})
    public void method1() {

    }

    @RequestMapping("sub3")
    public void method3(
            @RequestParam("param1") String param1,
            @RequestParam(value = "param2", defaultValue = "0") Integer param2,
            @RequestParam("param3") String param3,
            @RequestParam(value = "param4", defaultValue = "2023-09-26") LocalDate param4, // 날짜
            @RequestParam(value = "param5", defaultValue = "2023-09-26T11:15:30") LocalDateTime param5, // 날짜시간
            String param6, String[] param8,
            @RequestParam("param8") List<String> param9
    ) {
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        System.out.println("param3 = " + param3);
        System.out.println("param4 = " + param4);
        System.out.println("param5 = " + param5);
        System.out.println("param6 = " + param6);
        if (param8 != null)
            Arrays.stream(param8).forEach(System.out::println);

        if (param9 != null)
            param9.forEach(System.out::println);
    }

    @RequestMapping("/sub4")
    public void method4() {

    }

    @RequestMapping("/sub5")
    public void method5(String userId, String userEmail, LocalDate birthDate,
                        String[] hobby) {

        System.out.println("userId = " + userId);
        System.out.println("userEmail = " + userEmail);
        System.out.println("birthDate = " + birthDate);
        Arrays.stream(hobby).forEach(System.out::println);

    }

    @RequestMapping("/sub6")
    public void method6(MyDto11 user) {
        System.out.println("user = " + user);
    }

    @RequestMapping("/sub7")
    public void method7() {

    }

    @RequestMapping("/sub8")
    public void method8(MyDto12 info) {
        System.out.println("info = " + info);
    }

    @RequestMapping("/sub9")
    public void method9() {
    }

    @RequestMapping("/sub10")
    public void method10(String title, String inside) {
        System.out.println("title = " + title);
        System.out.println("inside = " + inside);
    }

    @RequestMapping("/sub11")
    public void method11() {

    }

    @RequestMapping("/sub12")
    public void method12(MyDto13 myDto13) {
        System.out.println("myDto13 = " + myDto13);
    }

    @RequestMapping("/sub13")
    public void method() {
    }

    @RequestMapping("/sub14")
    public void method(String hobby, String[] food) {
        System.out.println("hobby = " + hobby);
        System.out.println(Arrays.toString(food));
        System.out.println("food[0] = " + food[0]);
    }
}
