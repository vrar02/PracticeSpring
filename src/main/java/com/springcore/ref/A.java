package com.springcore.ref;

public class A {

    private int x;

    private B object;

    public A() {

    }

    public A(int x, B object) {
        this.x = x;
        this.object = object;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getObject() {
        return object;
    }

    public void setObject(B object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", object=" + object +
                '}';
    }
}
