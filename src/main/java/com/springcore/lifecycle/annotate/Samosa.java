package com.springcore.lifecycle.annotate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
    private String price;

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    @PostConstruct
    public void hey(){
        System.out.println("in init-hey method");
    }

    @PreDestroy
    public  void bye(){
        System.out.println("in destroy-bye method");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price='" + price + '\'' +
                '}';
    }
}
