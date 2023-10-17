package com.example.spring20230920;

public class MyApp1 {
    public static void main(String[] args) {
        System.out.println("abcd");
        MyClass myClass = new MyClass();
        myClass.method1();
    }
}

class MyClass {
    public void method1() {
        System.out.println("MyClass.method1");;
    }
}