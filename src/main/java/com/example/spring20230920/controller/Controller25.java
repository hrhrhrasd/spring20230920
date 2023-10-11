package com.example.spring20230920.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.sql.Timestamp;

@Controller
@RequestMapping("/main25")
public class Controller25 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/sub1")
    public void method1(@RequestParam(value = "id", required = false) Integer customerId) throws SQLException {
        if (customerId == null) {
            System.out.println("삭제할 Id 입력");
            return;
        }

        String sql = """
                delete from customers
                where customerId = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setInt(1, 1);
            int rows = statement.executeUpdate();

            if (rows == 1) {
                System.out.println(rows + "개의 레코드 삭제");
            } else {
                System.out.println("삭제 실패");
            }
        }
    }

    @GetMapping("/sub2")
    public void method2() {
    }

    @PostMapping("/sub2")
    public void method2(@RequestParam(value = "pid", required = false) Integer productId,
                        Model model) throws SQLException {
        if (productId == null) {
            model.addAttribute("ch", 0);
            return;
        }

        String sql = """
                delete from products
                where ProductID = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        try (connection; statement) {
            statement.setInt(1, productId);
            int rows = statement.executeUpdate();

            if (rows == 1) {
                System.out.println("삭제 완료");
            } else {
                System.out.println("삭제 실패");
            }
        }
        model.addAttribute("ch", 1);
    }

    @GetMapping("/sub4")
    public void method4(String name, String phone, String id) throws SQLException {
        String sql = """
                update  shippers
                set ShipperName = ?, Phone = ?
                where ShipperID = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setString(1, name);
            statement.setString(2, phone);
            statement.setString(3, id);
            int i = statement.executeUpdate();
            if (i == 1) {
                System.out.println("성공");
            } else {
                System.out.println("실패");
            }
        }
    }

    @GetMapping("sub5")
    public void method5(@RequestParam("id") Integer shipperId, Model model) throws SQLException {
        String sql = """
                SELECT * FROM shippers
                WHERE shipperId = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        try (connection; statement) {
            statement.setInt(1, shipperId);

            ResultSet resultSet = statement.executeQuery();

            try (resultSet) {
                if (resultSet.next()) {
                    model.addAttribute("shipper", Map.of("shipperId", resultSet.getInt("shipperId"),
                            "shipperName", resultSet.getString("shipperName"),
                            "phone", resultSet.getString("phone")));
                }

            }

        }

    }

    @PostMapping("sub5")
    public String method6(
            @RequestParam("id") Integer shipperId,
            @RequestParam("name") String shipperName,
            @RequestParam("phone") String phone,
            RedirectAttributes rttr
    ) throws SQLException {
        String sql = """
                UPDATE shippers
                SET shipperName = ?,
                    phone = ?
                WHERE
                    shipperId = ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setString(1, shipperName);
            statement.setString(2, phone);
            statement.setInt(3, shipperId);

            int rows = statement.executeUpdate();

            if (rows == 1) {
                System.out.println("잘 변경됨");
            } else {
                System.out.println("문제 생김");
            }

        }

        rttr.addAttribute("id", shipperId);
        return "redirect:/main25/sub5";
    }

    @GetMapping("/sub7")
    public void method7(@RequestParam(value = "id", required = false) Integer emploteeId,
                        Integer check, Model model) throws SQLException {
        if (emploteeId == null) {
            return;
        }

        String sql = """
                select * from employees
                where EmployeeID = ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        Map<String, Object> map = new HashMap<>();
        try (connection; statement) {
            statement.setInt(1, emploteeId);
            ResultSet resultSet = statement.executeQuery();
            try (resultSet) {
                if (resultSet.next()) {
                    map.put("id", resultSet.getInt("EmployeeID"));
                    map.put("firstName", resultSet.getString("FirstName"));
                    map.put("lastName", resultSet.getString("lastName"));
                    map.put("birthDate", resultSet.getDate("BirthDate"));
                }
            }
        }
        model.addAttribute("employee", map);
        model.addAttribute("check", check);
    }

    @PostMapping("/sub7")
    public String method7(@RequestParam("id") Integer id,
                          @RequestParam("firstName") String firstName,
                          @RequestParam("lastName") String lastName,
                          @RequestParam("birthDate") Date birthDate,
                          RedirectAttributes rttr) throws SQLException {

        String sql = """
                update employees
                set FirstName = ?, LastName = ?, BirthDate = ?
                where EmployeeID = ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setDate(3, birthDate);
            statement.setInt(4, id);
            int i = statement.executeUpdate();

            if (i == 1) {
                rttr.addAttribute("check", 1);
            } else {
                rttr.addAttribute("check, 0");
            }

        }
        rttr.addAttribute("id", id);
        return "redirect:/main25/sub7";
    }

    @GetMapping("sub9")
    public String method9(RedirectAttributes rttr) {
        // Controller의 request handler 메소드의 리턴이
        // void(또는 null 리턴)이면 view의 이름으로 해석

        // String 이면 view의 이름으로 해석
        // "redirect:" 접두어가 붙으면
        // 응답코드가 302이고 location 응답헤더의 값이 접두어 이후의 값으로 셋팅

        // 쿼리스트링에 request parameter로 붙음
        rttr.addAttribute("abc", "def");
        rttr.addAttribute("address", "seoul");

        // 모델에 붙임 (session을 잠깐 거침)
        rttr.addFlashAttribute("email", "abc@gmail.com");

        return "redirect:/main25/sub10";
    }

    @GetMapping("sub10")
    public void method10(Model model) {
        Object email = model.getAttribute("email");
        System.out.println("email = " + email);
        System.out.println("Controller25.method10");
    }
}
