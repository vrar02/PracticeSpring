package com.springcore.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.springcore.scopes")
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Test.class);
        Student student1 =(Student) context.getBean("student",Student.class);

        Student student2 =(Student) context.getBean("student",Student.class);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1);
        System.out.println(student2);
    }
}
