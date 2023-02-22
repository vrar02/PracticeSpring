package com.springcore.constructorInjection;

public class Addition{
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("in int constructor");
    }

    public Addition(String a, String b){
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("in string constructor");
    }

    public void doSum(){
        System.out.println("a:value" + a);
        System.out.println("b:value"+b);
        System.out.println("sum: "+(a+b));
    }
}
