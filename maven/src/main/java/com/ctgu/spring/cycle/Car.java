package com.ctgu.spring.cycle;

public class Car {

    private String brand;

    public Car(){
        System.out.println("Car's constructor...");
    }

    public void setBrand(String brand){
        System.out.println("Car's setBrand");
        this.brand = brand;
    }

    public void init(){
        System.out.println("Car's init...");
    }

    public void destroy(){
        System.out.println("Car's destroy...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
