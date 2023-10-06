package com.example.spring20230920.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

@Controller
@RequestMapping("/main22")
public class Controller22 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/sub1")
    public void method1(Integer page) throws SQLException {

        String sql = """
                select customerId id,
                customerName name
                from customers
                order by id
                limit ?, 10
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, (page - 1) * 10);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                System.out.println(id + " : " + name);
            }
        }
    }

    @GetMapping("/sub2")
    public void method(@RequestParam(value = "page", defaultValue = "1") Integer page,
                       Model model) throws SQLException {
        if (page <= 0) {
            page = 1;
        }
        String sql = """
                select * from suppliers order by SupplierID
                limit ?, 7
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, (page - 1) * 7);
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, String>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                Map<String, String> map = new HashMap<>();
                map.put("id", resultSet.getString("SupplierID"));
                map.put("name", resultSet.getString("SupplierName"));

                list.add(map);
            }
        }


        String sql1 = """
                select count(*) from suppliers
                """;

        Connection connection1 = dataSource.getConnection();
        Statement statement1 = connection1.createStatement();
        ResultSet resultSet1 = statement1.executeQuery(sql1);

        try (connection1; statement1; resultSet1) {
            if (resultSet1.next()) {
                int count = resultSet1.getInt(1);
                int lastPageNum = (count - 1) / 7 + 1;

                model.addAttribute("lastPageNum", lastPageNum);
            }
        }

        model.addAttribute("page", page);
        model.addAttribute("suppliers", list);
    }

    @GetMapping("/sub3")
    public void method3(Model model,
                        @RequestParam(value = "page", defaultValue = "1") Integer page) throws SQLException {

        if (page <= 0) {
            page = 1;
        }
        String sql1 = """
                select count(*) from customers
                """;

        // ---------- 페이지 수 정하기
        Connection connection1 = dataSource.getConnection();
        Statement statement1 = connection1.createStatement();
        ResultSet resultSet1 = statement1.executeQuery(sql1);

        try (connection1; statement1; resultSet1){
            if (resultSet1.next()) {
                int count = resultSet1.getInt(1);
                int lastPageNum = (count-1) / 5 +1;

                if (page > lastPageNum) {
                    page = lastPageNum;
                }

                int leftPage = (page-1)/5*5+1;
                int rightPage = leftPage+4;
                if (rightPage > lastPageNum) {
                    rightPage = lastPageNum;
                }
                int prevPage = leftPage-5;
                int nextPage = rightPage+1;

                model.addAttribute("left", leftPage);
                model.addAttribute("right", rightPage);
                model.addAttribute("prev", prevPage);
                model.addAttribute("next", nextPage);

                model.addAttribute("lastPageNum", lastPageNum);
            }
        }


        // ------------------------------------

        String sql = """
                select customerId, customerName from customers
                order by customerId limit ?, 5
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, (page-1) * 5);
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();

        try (connection; statement; resultSet){
            while (resultSet.next()) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", resultSet.getString(1));
                map.put("name", resultSet.getString(2));

                list.add(map);
            }
        }




        model.addAttribute("customers", list);
        model.addAttribute("page", page);

    }
}
