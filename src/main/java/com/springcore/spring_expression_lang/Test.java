package com.springcore.spring_expression_lang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.spring_expression_lang")
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Test.class);
        Demo demo =(Demo) context.getBean("demo");
        System.out.println(demo);

    }
}
