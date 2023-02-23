package com.springcore.lifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle-xml.xml");
        Samosa samosa1 = (Samosa)context.getBean("samosa1");
        System.out.println(samosa1);
        context.close();
    }
}
