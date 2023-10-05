package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto15;
import com.example.spring20230920.domain.MyDto16;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

@Controller
@RequestMapping("/main20")
public class Controller20 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/sub1")
    public void method1() {

    }

    @GetMapping("/sub2")
    public String method2(Model model, String id) throws SQLException {
        String sql = """
                SELECT CustomerID, CustomerName, Address, Country
                FROM customers
                WHERE CustomerID = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();


        List<MyDto15> list = new ArrayList<>();

        try (connection; preparedStatement; resultSet) {
            resultSet.next();
            MyDto15 dto = new MyDto15();
            dto.setId(resultSet.getString(1));
            dto.setName(resultSet.getString(2));
            dto.setAddress(resultSet.getString(3));
            dto.setCountry(resultSet.getString(4));

            list.add(dto);
        }

        model.addAttribute("customers", list);
        return "/main19/sub6";
    }

    @GetMapping("sub3")
    public void method3(String id) throws SQLException {
        String sql = """
                SELECT customerId, customerName, country
                FROM customers
                WHERE customerId = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, id);
//        statement.setInt(1, 3);

        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                System.out.println();
                System.out.println("고객 정보");
                System.out.println("id = " + resultSet.getString(1));
                System.out.println("name = " + resultSet.getString(2));
            }
        }

    }

    @GetMapping("/sub4")
    public void method4(String pid) throws SQLException {
        String sql = """
                SELECT ProductID, ProductName
                FROM products
                WHERE ProductID = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, pid);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                System.out.println();
                System.out.println("상품 정보");
                System.out.println("id = " + resultSet.getString(1));
                System.out.println("name = " + resultSet.getString(2));
            }
        }
    }

    @GetMapping("/sub5")
    public void method5(String country) throws SQLException {
        String sql = """
                SELECT CustomerName
                FROM customers
                WHERE Country = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, country);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            System.out.println(country + "거주 고객");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        }

    }

    @GetMapping("sub6")
    public void method6(String c1, String c2) throws SQLException {
        String sql = """
                SELECT customerName, country
                FROM customers
                WHERE country = ? OR country = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, c1);
        statement.setString(2, c2);

        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {

            System.out.println();
            System.out.println("고객 목록");
            while (resultSet.next()) {
                String country = resultSet.getString(2);
                String name = resultSet.getString(1);
                System.out.println(country + ":" + name);
            }
        }

    }

    @GetMapping("sub7")
    public void method7() {

    }

    @GetMapping("sub8")
    public String method8(Double min, Double max, Model model) throws SQLException {
        String sql = """
                SELECT productId, productName, unit, price
                FROM products
                WHERE price <= ? AND price >= ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDouble(1, max);
        statement.setDouble(2, min);

        ResultSet resultSet = statement.executeQuery();

        List<MyDto16> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                MyDto16 dto = new MyDto16();
                dto.setId(resultSet.getString(1));
                dto.setName(resultSet.getString(2));
                dto.setUnit(resultSet.getString(3));
                dto.setPrice(resultSet.getString(4));

                list.add(dto);
            }
        }

        model.addAttribute("productList", list);

        return "/main19/sub5";

    }






    @GetMapping("/sub9")
    public void method9(@RequestParam("country") List<String> countryList) throws SQLException {
        String que = "";
        for (int i = 0; i < countryList.size(); i++) {
            que += "?";
            if (i < (countryList.size() - 1)) {
                que += ", ";
            }
        }
        String sql = """
                SELECT *
                FROM customers
                WHERE country IN ("""
                + que + ")";
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        for (int i = 0; i < countryList.size(); i++) {
            statement.setString(i + 1, countryList.get(i));
        }
        ResultSet resultSet = statement.executeQuery();
        System.out.println(sql);

        try (connection; resultSet; statement) {
            while (resultSet.next()) {
                String name = resultSet.getString(2);
                String country = resultSet.getString(7);

                System.out.println("name = " + name);
                System.out.println("country = " + country);
            }
        }
    }

    @GetMapping("/sub10")
    public void method10(Model model) throws SQLException {
        String sql = """
                SELECT DISTINCT country
                FROM suppliers
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<String> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                list.add(resultSet.getString(1));
            }
        }
        model.addAttribute("countryList", list);
    }

    @GetMapping("/sub11")
    public void method11(@RequestParam("country") List<String> countryList) throws SQLException {
        String ques = "";

        for (int i = 0; i < countryList.size(); i++) {
            ques += "?";

            if (i != countryList.size() - 1) {
                ques += ", ";
            }
        }

        String sql = """
                select * from suppliers
                where Country in (""" + ques + ")";

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        for (int i = 0; i < countryList.size(); i++) {
            statement.setString(i+1, countryList.get(i));
        }
        ResultSet resultSet = statement.executeQuery();
        try (connection; statement; resultSet){
            while (resultSet.next()) {
                System.out.print(resultSet.getString(7));
                System.out.print(", ");
                System.out.println(resultSet.getString(2));
            }

        }


    }

}
