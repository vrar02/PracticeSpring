package com.springcore.lifecycle.interfaceimpl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean, DisposableBean {

    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("in init method");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("in destroy method ");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price='" + price + '\'' +
                '}';
    }
}

