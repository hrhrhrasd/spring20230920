package com.example.spring20230920;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp9 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp9.class, args);
        System.out.println(context.getBean("myClass16"));
        System.out.println(context.getBean("myClass15", MyClass15.class).getFIELD());
    }
}
@Component
class MyClass16 {

}
@Component
@RequiredArgsConstructor
class MyClass15 {
    private final MyClass16 FIELD;

    public MyClass16 getFIELD() {
        return FIELD;
    }
}