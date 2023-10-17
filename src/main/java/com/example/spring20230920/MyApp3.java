package com.example.spring20230920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp3 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp3.class, args);
        MyClass4 bean4 = context.getBean("myBean4", MyClass4.class);
        MyClass5 bean5 = context.getBean("myClass5", MyClass5.class);
        System.out.println("bean4 = " + bean4);
        System.out.println("bean5 = " + bean5);

    }
}

@Component
class MyClass5 {    // bean 이름 : myClass5

}

@Component("myBean4")   // 이름을 명시하지 않으면  클래스 이름을 lowerCamelCase 로 빈의 이름
class MyClass4 {

}