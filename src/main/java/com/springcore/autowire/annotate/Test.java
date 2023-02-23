package com.springcore.autowire.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowire-annotate.xml");
        Employee employee1 = (Employee)context.getBean("employee",Employee.class);
        System.out.println(employee1);
    }
}
