package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("constructor-injection-config.xml");

        Person person1 = (Person)applicationContext.getBean("person1");
        System.out.println(person1);

        Addition addition=(Addition) applicationContext.getBean("add2");
        addition.doSum();
    }
}
