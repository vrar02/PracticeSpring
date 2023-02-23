package com.springcore.scopes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//creates the bean with name starting with first small letter and follows camelcase of class name...
@Component
@Scope(scopeName = "singleton")
public class Student {

    @Value("vivek")
    private  String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
