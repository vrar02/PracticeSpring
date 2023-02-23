package com.springcore.standalone.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Employee {

    //We can also autowired and use qualifier to inject the list values
    @Autowired
    @Qualifier("friends_list")
    private List<String> friends;

    public Employee() {
    }

    public Employee(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "friends=" + friends +
                '}';
    }
}
