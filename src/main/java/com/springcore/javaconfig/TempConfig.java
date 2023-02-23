package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TempConfig {

    //This creates bean with name "getCourse" and stored in spring container...
    @Bean
    public Course getCourse(){
        Course c= new Course();
        c.setName("spring_by_vivek");
        return c;
    }

    @Bean
    public Student getStudent(){
        Student s= new Student(getCourse());
        s.setName("vivek");
        return s;
    }

//    This pattern of injecting beans is used when we use third party classes and want to
//            inject bean of one class to other class..with some primitive data variables as well
}
