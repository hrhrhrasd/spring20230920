package com.example.spring20230920;


public class MyApp5 {
    public static void main(String[] args) {

    }
}

class MyClass8 {
    public void method8() {
        System.out.println("com.example.spring20230920.MyClass8.method8");
    }
}

class MyClass7 {
    private MyClass8 field1;    //dependency (의존성)

    public MyClass7() {

    }

    public MyClass7(MyClass8 field1) {
        this.field1 = field1;
    }

    public void setField1(MyClass8 field1) {
        this.field1 = field1;
    }

    public void method7() {
        field1.method8();
    }
}