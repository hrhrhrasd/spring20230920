package com.example.spring20230920.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main23")
public class Controller23 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/sub1")
    public void method1(String ch) throws SQLException {
        String sql = """
                select * from products
                where productName like ?;
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + ch + "%");
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                System.out.println("resultSet = " + resultSet.getString("productName"));
            }
        }

    }

    // /main23/sub2?k=erd 고객명 조회
    @GetMapping("/sub2")
    public void method2(@RequestParam(value = "k", defaultValue = "") String keyword, Model model) throws SQLException {
        String sql = """
                select * from customers
                where customerName like ?   
                """;    // ""가 들어가면 %% >> 모든 문자열

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + keyword + "%");
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", resultSet.getString("customerId"));
                map.put("name", resultSet.getString("customerName"));

                list.add(map);
            }
        }
        model.addAttribute("keyword", keyword);
        model.addAttribute("customers", list);
    }

    @GetMapping("/sub3")
    public void method3(@RequestParam(value = "k", defaultValue = "") String keyword,
                        @RequestParam(value = "op", defaultValue = "customerName") String option,
                        Model model) throws SQLException {
        String sql;

        if (option.equals("customerName")) {
            sql = """
                                    
                        select * from customers
                    where CustomerName like ?
                    """;
        } else {
            sql = """
                                    
                        select * from customers
                    where ContactName like ?
                    """;
        }

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + keyword + "%");
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", resultSet.getString("customerId"));
                map.put("customerName", resultSet.getString("customerName"));
                map.put("contactName", resultSet.getString("contactName"));

                list.add(map);
            }
        }
        model.addAttribute("option", option);
        model.addAttribute("keyword", keyword);
        model.addAttribute("customers", list);
    }

    @GetMapping("/sub4")
    public void method(@RequestParam(value = "k", defaultValue = "") String keyword,
                       @RequestParam(value = "t", defaultValue = "lname") String type,
                       Model model) throws SQLException {

        String sql;

        if (type.equals("lname")) {
            sql = """
                    select * from employees
                    where LastName like ?
                    """;
        } else if (type.equals("fname")) {
            sql = """
                    select * from employees
                    where FirstName like ?
                    """;
        } else {
            sql = """
                    select * from employees
                    where Notes like ?
                    """;
        }

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"%"+keyword+"%");
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", resultSet.getString("EmployeeID"));
                map.put("lname", resultSet.getString("LastName"));
                map.put("fname", resultSet.getString("FirstName"));
                map.put("note", resultSet.getString("Notes"));

                list.add(map);
            }
        }
        model.addAttribute("employees", list);
        model.addAttribute("keyword", keyword);
        model.addAttribute("type", type);
    }
}
