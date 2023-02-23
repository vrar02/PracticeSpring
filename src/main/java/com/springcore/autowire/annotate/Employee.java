package com.springcore.autowire.annotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.net.SocketOption;
import java.sql.SQLOutput;

public class Employee {

    /* Autowired annotation on variables makes spring container to inject directly by converting the private
     variables permission to public and assign them like employee.company=comp..searching happens byType */

    private Company company;

    private String name;

    @Autowired
    private Address address;

    public Employee() {
    }


    public Employee(Address address){
        System.out.println("address is set via autowired on constructor");
        this.address=address;
    }


    public Employee(Company company){
        System.out.println("company is set via autowired on contructor");
        this.company=company;
    }

    // The injection happens during the employee
    // object creation when autowired is used..so all the variables which needs
    //to be autowired should present within one constructor only....

    //to Solve unique bean problem we use @Qualifier
    public Employee(Company company, Address address) {
        this.address = address;
        this.company = company;
    }


    public Employee(String name, Address address, Company company) {
        this.name = name;
        this.address = address;
        this.company=company;
    }

    public Company getCompany() {
        return company;
    }

    @Autowired
    @Qualifier("comp2")
    public void setCompany(Company company) {
        System.out.println("autowired on set company method");
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("int set address method");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company=" + company +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
