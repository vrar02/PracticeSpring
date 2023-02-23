package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.springcore.javaconfig"})
public class Test {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(Test.class);
        Student student =(Student) context.getBean("getStudent");
        System.out.println(student);

        Course course=(Course) context.getBean("getCourse");

        System.out.println(student.getCourse().hashCode());
        System.out.println(course.hashCode());

    }
}
