package com.ctgu.spring.beans;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private Car car;
    private List<Son> sons;

    public List<Son> getSons() {
        return sons;
    }

    public void setSons(List<Son> sons) {
        this.sons = sons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person() {
    }

    public Person(String name, int age, Car car, List<Son> sons) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.sons = sons;
    }

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", sons=" + sons +
                '}';
    }
}
