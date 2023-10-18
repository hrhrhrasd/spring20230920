package com.example.spring20230920;

import java.util.Arrays;

public class Prec {
    public static void main(String[] args) {
        String x = "a101001000a";
        String[] split = x.split("0");
        System.out.println(split.length);
        String string = Arrays.toString(split);
        System.out.println(string);
        System.out.println(x);
    }
}
