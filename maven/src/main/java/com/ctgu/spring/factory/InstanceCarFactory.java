package com.ctgu.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private Map<String, Car> cars = null;

    public InstanceCarFactory(){
        cars = new HashMap<String, Car>();
        cars.put("audi", new Car("Audi",300000));
        cars.put("bmw", new Car("BMW",400000));
    }

    public Car getCar(String brand){
        return cars.get(brand);
    }
}
