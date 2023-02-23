package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Course {

    private String name;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
