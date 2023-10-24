package com.example.spring20230920;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prec {
    public static void main(String[] args) {
        String[] callings = {"", ""};
        String[] players = {"", ""};
        List<String> list = Arrays.asList(players);

        for (String call : callings) {
            int index = list.indexOf(call);
            String temp = list.get(index-1);
            list.set(index-1, call);
            list.set(index, temp);
        }
        list.toArray(new String[0]);
    }
}
