package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{

    public static void main( String[] args ) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(
                new String[]{"config.xml"});
        Student student1= (Student) applicationContext.getBean("student1");
        System.out.println( student1 );


        Student student2 = (Student)applicationContext.getBean("student2");
        System.out.println(student2);

        Student student3 = (Student)applicationContext.getBean("student3");
        System.out.println(student3);

    }
}
