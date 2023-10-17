package com.example.spring20230920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp2 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp2.class, args);
        Object bean1 = context.getBean("myInstance2");
        System.out.println(bean1 instanceof MyClass2);
        MyClass2 o1 = (MyClass2) bean1;


        Object bean3 = context.getBean("myBean3");
        System.out.println(bean3 instanceof MyClass3);
        MyClass3 o3 = (MyClass3) bean3;

        System.out.println(System.identityHashCode(context.getBean("myBean3")));
        System.out.println(System.identityHashCode(context.getBean("myBean3")));
        System.out.println(System.identityHashCode(context.getBean("myBean3")));

        System.out.println(System.identityHashCode(context.getBean("myInstance2")));
        System.out.println(System.identityHashCode(context.getBean("myInstance2")));
        System.out.println(System.identityHashCode(context.getBean("myInstance2")));

        context.getBean("myInstance2", MyClass2.class);
        context.getBean("myBean3", MyClass3.class);
    }
}

@Component("myBean3")
class MyClass3 {

}

@Component("myInstance2")
class MyClass2 {
    public void method2() {
        System.out.println("MyClass2.method2");
    }
}