package com.springcore.lifecycle.annotate;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("lifecycle-annotate.xml");
         Samosa samosa1 = (Samosa) applicationContext.getBean("samosa1");
         System.out.println(samosa1);
         applicationContext.close();
    }
}
