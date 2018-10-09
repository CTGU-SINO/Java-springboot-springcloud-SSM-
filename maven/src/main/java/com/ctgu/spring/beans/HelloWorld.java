package com.ctgu.spring.beans;

public class HelloWorld {

    private String name;

    public void setName(String name) {
        System.out.println("setName...");
        this.name = name;
    }

    public void hello(){
        System.out.println("hello:" + name);
    }

    public HelloWorld(String name) {
        this.name = name;
    }

    public HelloWorld() {
        System.out.println("Constructor...");
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }
}
