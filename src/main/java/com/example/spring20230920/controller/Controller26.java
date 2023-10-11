package com.example.spring20230920.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/main26")
public class Controller26 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/sub1")
    public void method1() throws SQLException {
        String sql = """
                insert into mydb1.my_table12
                    (int_col, dec_col, str_col, date_col, date_col_time)
                    VALUE (?, ?, ?, ?, ?)
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setInt(1, 124);
            statement.setDouble(2, 3.14);
            statement.setString(3, "asd");
            statement.setTimestamp(4, Timestamp.valueOf(LocalDate.now().atStartOfDay()));
            statement.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
            statement.executeUpdate();
        }
    }

    @GetMapping("/sub2")
    public void method2() throws SQLException {
        String sql = """
                    select * from mydb1.my_table12
                    LIMIT 1
""";

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        try (connection;statement;resultSet){
            if (resultSet.next()) {
                int intCol = resultSet.getInt(1);
                double doubleCol = resultSet.getDouble(2);
                String strCol = resultSet.getString(3);
                LocalDate dateCol = resultSet.getTimestamp(4).toLocalDateTime().toLocalDate();
                LocalDateTime timeCol = resultSet.getTimestamp(5).toLocalDateTime();

                System.out.println("intCol = " + intCol);
                System.out.println("doubleCol = " + doubleCol);
                System.out.println("strCol = " + strCol);
                System.out.println("dateCol = " + dateCol);
                System.out.println("timeCol = " + timeCol);
            }
        }
    }
}
