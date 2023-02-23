package com.springcore.autowire.xml;

public class Employee {

    private Company company;
    private String name;
    private Address address;

    public Employee() {
    }

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

    public void setCompany(Company company) {
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
