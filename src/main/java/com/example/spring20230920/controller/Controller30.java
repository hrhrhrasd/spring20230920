package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao4;
import com.example.spring20230920.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main30")
public class Controller30 {

    private final MyDao4 dao4;

    @GetMapping("/sub1")
    public void method1(Integer id) {
        String name = dao4.select1(id);
        System.out.println(name);

    }

    @GetMapping("/sub3")
    public void method3(LocalDate from, LocalDate to) {
        List<String> list = dao4.select3(from, to);
        list.forEach(System.out::println);
        System.out.println(list.size());
    }

    @GetMapping("/sub4")
    public void method4(MyDto25 dto) {
        List<String> select = dao4.select(dto);
        select.forEach(System.out::println);
        System.out.println(select.size());
    }

    @GetMapping("/sub5")
    public void method5(MyDto26 dto) {
        List<String> select = dao4.select5(dto);
        select.forEach(System.out::println);
        System.out.println(select.size());
    }

    @GetMapping("/sub6")
    public void method6(MyDto27 dto1, MyDto28 dto2) {
        List<String> select = dao4.select6(dto1, dto2);
        select.forEach(System.out::println);
        System.out.println(select.size());
    }

    @GetMapping("/sub7")
    public void method7(MyDto29 dto1, MyDto30 dto2) {
//        dto1.setFrom((dto1.getPage()-1)*dto1.getRows());
//        dto2.setKeyword('%'+dto2.getKeyword()+'%');

        List<String> select = dao4.select7(dto1, dto2);
        select.forEach(System.out::println);
        System.out.println(select.size());
    }

    @GetMapping("/sub8")
    public void method8(MyDto31 dto) {
        dao4.insert1(dto);
    }

    @GetMapping("sub9")
    public void method9() {

    }

    @PostMapping("sub10")
    public String method10(MyDto32 emp, RedirectAttributes rttr) {
        int row = dao4.insert2(emp);
        System.out.println(row + "행이 입력됨");
        rttr.addFlashAttribute("row", row);
        return "redirect:/main30/sub9";
    }

    @GetMapping("sub11")
    public void method11(Integer id) {
        int rows = dao4.delete1(id);
        System.out.println(rows + "개의 행 지워짐");
    }

    @GetMapping("sub12")
    public void method12(Integer pid) {
        int rows = dao4.delete2(pid);
        System.out.println(rows + "개의 행 지워짐");
    }

    @GetMapping("sub13")
    public void method13(Integer id, Model model) {
        //직원 조회
        MyDto33 employee = dao4.select8(id);
        model.addAttribute("employee", employee);
    }

    @PostMapping("sub14")
    public String method14(MyDto33 employee, RedirectAttributes rttr) {
        // 직원 수정
        int rows = dao4.update1(employee);

        if (rows == 1) {
            rttr.addFlashAttribute("msg", "수정완료");
        } else {
            rttr.addFlashAttribute("msg", "수정실패");
        }
        rttr.addAttribute("id", employee.getId());
        return "redirect:/main30/sub13";
    }

    @GetMapping("/sub15")
    public void method15(Integer id, Model model) {
        MyDto34 customers = dao4.select9(id);
        model.addAttribute("customers", customers);
    }

    @PostMapping("/sub16")
    public String method16(MyDto34 customers, RedirectAttributes rttr) {
        int rows = dao4.update2(customers);

        if (rows == 1) {
            rttr.addFlashAttribute("msg", "수정완료");
        } else {
            rttr.addFlashAttribute("msg", "수정실패");
        }
        rttr.addAttribute("id", customers.getCustomerID());
        return "redirect:/main30/sub15";
    }
}
