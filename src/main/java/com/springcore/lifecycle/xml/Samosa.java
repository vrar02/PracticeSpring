package com.springcore.lifecycle.xml;

public class Samosa {

    private  String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void hey(){
        System.out.println("inside init method");
    }

    public void bye(){
        System.out.println("inside destroy method");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price='" + price + '\'' +
                '}';
    }
}
