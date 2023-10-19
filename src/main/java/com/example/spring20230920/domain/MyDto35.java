package com.example.spring20230920.domain;


public class MyDto35 {
    private String id;
    private String uRL;

    public String getId() { // 프로퍼티명 : id
        return id;
    }

    public String getuRL() {    //lombok은 getURL로 만들어줌 >> 프로퍼티명을 URL로 해석
        return uRL;
    }
}
