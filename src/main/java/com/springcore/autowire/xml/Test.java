package com.springcore.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowire-xml.xml");
        Employee employee1 = (Employee)context.getBean("employee");
        System.out.println(employee1);
    }
}
