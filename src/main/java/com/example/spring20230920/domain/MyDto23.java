package com.example.spring20230920.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MyDto23 {
    private LocalDate OrderDate;
    private String ProductName;
    private String CategoryName;
    private Integer Quantity;
    private Double Price;
}
