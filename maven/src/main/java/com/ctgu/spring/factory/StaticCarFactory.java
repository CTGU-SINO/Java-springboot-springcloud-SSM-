package com.ctgu.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    private static Map<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("audi", new Car("Audi",300000));
        cars.put("bmw", new Car("BMW",400000));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
