package com.example.spring20230920.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class MyDto5 {
    private String name;
    private Integer age;
    private final String home;
}
