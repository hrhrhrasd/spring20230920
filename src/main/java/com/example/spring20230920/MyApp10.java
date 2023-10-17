package com.example.spring20230920;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp10 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp10.class,args);

    }
}

interface MyInterface1 {

}
@Component
class MyClass18 implements MyInterface1 {

}

@Component
class MyClass19 implements MyInterface1 {

}

@Component
class MyClass17 {
    private final MyInterface1 FIELD;

    public MyClass17(@Qualifier("myClass18") MyInterface1 FIELD) {
        this.FIELD = FIELD;
    }
}