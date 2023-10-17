package com.example.spring20230920;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class MyApp11 {
}

interface MyInterface2 {
    public void method();
}

@Component
class MyClass21 implements MyInterface2 {

    @Override
    public void method() {

    }
}
//@COmponent  << 컴포넌트만 옮겨주면 내용변경없이 메소드를 바꿀수 있음
class MyClass22 implements MyInterface2 {
    @Override
    public void method() {

    }
}

@Component
@RequiredArgsConstructor
class MyClass20 {

    private final MyInterface2 field;

    public void method20() {
        field.method();
    }
}