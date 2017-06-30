package com.example.demo.controllers;

import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Adrian on 30.06.2017.
 */
@RestController
public class CarController {

    static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
        cars.add(new Car("Suzuki", "GrandVitara", 2015, "SK22222"));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Car> getCarList() {
        return cars;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public Car editCar(@PathVariable("id") String id, @RequestBody Car car) {
        List<Car> collect = cars.stream().filter(x -> x.getId().equalsIgnoreCase(car.getId())).collect(Collectors.toList());
        if (collect.size() == 1) {
            //todo: edycja samochodu
        } else {
            throw new RuntimeException("nie wiadomo ktory samochod edytowac");
        }
        return cars.get(0);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public Car addCar(@RequestBody Car car) {
        cars.add(car);
        return car;
    }
}
