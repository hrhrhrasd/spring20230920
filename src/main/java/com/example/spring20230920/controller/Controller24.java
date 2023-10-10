package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto18Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main24")
public class Controller24 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/sub1")
    public void method1() throws SQLException {
        String sql = """
                insert into products (ProductName, SupplierID, CategoryID, Unit, Price)
                            value (?, ?, ?, ?, ?);
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        try (connection; statement) {
            statement.setString(1, "돈가스");
            statement.setInt(2, 2);
            statement.setInt(3, 3);
            statement.setString(4, "한 장");
            statement.setDouble(5, 50.00);
            int count = statement.executeUpdate();

            if (count == 1) {
                System.out.println("입력완료");
            } else {
                System.out.println("입력 에러");
            }
        }
    }

    @RequestMapping("sub2")
    public void method2(@RequestParam(value = "sname", defaultValue = "") String sname,
                        @RequestParam(value = "cname", defaultValue = "") String cname,
                        @RequestParam(value = "add", defaultValue = "") String address,
                        @RequestParam(value = "city", defaultValue = "") String city,
                        @RequestParam(value = "code", defaultValue = "") String postalCode,
                        @RequestParam(value = "country", defaultValue = "") String country,
                        @RequestParam(value = "phone", defaultValue = "") String phone, Model model) throws SQLException {

        if (!sname.equals("")) {

            String sql = """
                                    
                        insert into suppliers (SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
                    value (?, ?, ?, ?, ?, ?, ?)
                       
                    """;
            int i;

            Connection connection = dataSource.
                    getConnection();
            PreparedStatement statement = connection.
                    prepareStatement(sql);
            try (
                    connection; statement) {
                statement.setString(1, sname);
                statement.setString(2, cname);
                statement.setString(3, address);
                statement.setString(4, city);
                statement.setString(5, postalCode);
                statement.setString(6, country);
                statement.setString(7, phone);

                int count =

                        statement.executeUpdate();

            }

        }


        String sql1 = """
                select * from suppliers
                order by SupplierID desc
                """;

        Connection connection1 = dataSource.getConnection();
        Statement statement1 = connection1.createStatement();
        ResultSet resultSet = statement1.executeQuery(sql1);

        List<Map<String, String>> list = new ArrayList<>();

        try (connection1; statement1; resultSet) {
            while (resultSet.next()) {
                Map<String, String> map = new HashMap<>();
                map.put("id", resultSet.getString(1));
                map.put("sname", resultSet.getString(2));
                map.put("cname", resultSet.getString(3));
                map.put("address", resultSet.getString(4));
                map.put("city", resultSet.getString(5));
                map.put("postalCode", resultSet.getString(6));
                map.put("country", resultSet.getString(7));
                map.put("phone", resultSet.getString(8));

                list.add(map);

            }
        }

        model.addAttribute("suppliers", list);
    }

    @GetMapping("sub4")
    public void method4() {

    }

    @PostMapping("/sub4")
    public void method4(MyDto18Employee employee, Model model) throws SQLException {
        String sql = """
                insert into employees (LastName, FirstName, BirthDate, Photo, Notes)
                value (?, ?, ?, ?, ?)
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        int i;
        try (connection; statement) {
            statement.setString(1, employee.getLastName());
            statement.setString(2, employee.getFirstName());
            statement.setString(3, employee.getBirthDate());
            statement.setString(4, employee.getPhoto());
            statement.setString(5, employee.getNote());
            i = statement.executeUpdate();
        }
        model.addAttribute("i", i);
    }

    @GetMapping("/sub5")
    @PostMapping("/sub5")
    public void method5() {
    }
}
