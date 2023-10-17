package com.example.spring20230920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp14 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp14.class,args);
        Object bean1 = context.getBean("myBean1");
        System.out.println("bean1 = " + bean1);

        Object bean2 = context.getBean("myBean2");
        System.out.println("bean2 = " + bean2);

        Configuration1 conf = context.getBean("configuration1",Configuration1.class);
        System.out.println(conf.myBean1());
        System.out.println(conf.myBean2());


    }
}

// configuration 클래스(빈)
// spring bean 을 만드는 메소드를 가진 클래스
@Configuration
class Configuration1 {
    @Bean   //빈 이름 : 메소드병
    public MyClass27 myBean1() {
        return new MyClass27();
    }

    @Bean   //빈 이름 : 메소드병
    public MyClass27 myBean2() {
        return new MyClass27();
    }
}

class MyClass27 {

}