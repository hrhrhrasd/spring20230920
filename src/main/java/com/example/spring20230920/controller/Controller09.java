package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto7;
import com.example.spring20230920.domain.MyDto8;
import com.example.spring20230920.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("/sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "son");
        model.addAttribute("attr2", 300);
        model.addAttribute("attr3", true);
        model.addAttribute("attr4", 3.14);

        //모델 속성이 배열일 경우
        model.addAttribute("attr5", new String[]{"asd", "qwe", "zxc"});

        String[] myArr1 = {"kor", "seoul", "jeju"};
        model.addAttribute("yourArr6", myArr1);
    }

    @RequestMapping("/sub2")
    public void method2(Model model) {
        model.addAttribute("myName", new String[]{"홍길동", "아무개"});
        model.addAttribute("yourEmail", new String[]{"qwe@qwe", "asd@asd", "zxc@zxc"});
        model.addAttribute("herAddress", new String[]{"seoul", "jeju"});

    }

    @RequestMapping("/sub3")
    public void method3(Model model) {
        model.addAttribute("names", List.of("두식", "봉석", "희수"));
        model.addAttribute("list1", List.of("l1", "l2"));
        model.addAttribute("mapList1", List.of("m1", "m2", "m3"));
        model.addAttribute("cities", new String[]{"seoul", "jeju", "busan", "ulsan"});
    }

    @RequestMapping("/sub4")
    public void method4(Model model) {
        var map1 = Map.of("son", 7, "lee", 19, "kim", 30);
        model.addAttribute("myMap", map1);

        model.addAttribute("cityMap", Map.of("seoul", "서울", "busan", "부산"));
        model.addAttribute("color", Map.of("red", "빨강", "blue", "파랑", "black", "검정"));


        var map3 = Map.of(
                "name", "두식",
                "my name", "봉석",
                "your-name", "희수"
        );
        model.addAttribute("attr3", map3);
    }

    @RequestMapping("/sub5")
    public void method5(Model model) {
        var map1 = Map.of("phone1", "iphone", "phone2", "galaxy");
        var map2 = Map.of("korea", "seoul", "us", "ny");
        var map3 = Map.of("1st", "hamburger", "2nd", "pizza");

        model.addAttribute("phones", map1);
        model.addAttribute("caps", map2);
        model.addAttribute("foods", map3);

    }

    @RequestMapping("/sub6")
    public void method6(Model model) {
        model.addAttribute("attr", new Object());
        model.addAttribute("attr2", new Scanner(System.in));
        model.addAttribute("attr3", new MyDto7());
    }

    @RequestMapping("/sub7")
    public void method7(Model model) {
        MyDto8 o1 = new MyDto8();
        o1.setFood("pizza");
        o1.setComputer("intel");
        o1.setBirthdate("2020-01-01");
        model.addAttribute("person1", o1);
    }

    @RequestMapping("/sub8")
    public void method8(Model model) {
        MyDto9 o1 = new MyDto9();
        o1.setId("hr");
        o1.setFirstName("hee");
        o1.setLastName("Y");
        o1.setClassName("java");
        o1.setPhoneNumber("010");
        model.addAttribute("student", o1);
    }
}
