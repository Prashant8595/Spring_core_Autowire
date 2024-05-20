package com.Main;

public class A {
    B b;
    String  Name;
    A(){
        System.out.println("a is created");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
    void print(){
        System.out.println("hello a");
    }
    void display(){
        print();
        System.out.println("Name : "+Name);
        b.print();
    }
}
