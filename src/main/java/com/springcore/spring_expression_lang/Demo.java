package com.springcore.spring_expression_lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("10")
    private  int x;

    @Value("#{12+22}")
    private  int y;

    @Value("#{ T(Math).sqrt(144) }")
    private double z;

    @Value("#{new java.lang.String('vivek')}")
    private String name;

    @Value("#{ 2<3 }")
    private boolean test;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name='" + name + '\'' +
                ", test=" + test +
                '}';
    }
}
