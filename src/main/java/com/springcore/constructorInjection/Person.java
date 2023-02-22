package com.springcore.constructorInjection;

import java.util.List;

public class Person {

    private String name;
    private int personId;
    private Certificate certificate;
    private List<String> friends;

    public Person(){}

    public Person(String name, int personId, Certificate certificate, List<String> friends) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
        this.friends=friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", friends=" + friends +
                '}';
    }
}
