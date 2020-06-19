
package service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class CarService {

    @Autowired
    Car car;

    List<Car> allCars = new ArrayList<>();

    public List<Car> getAllCars() {
        return allCars;
    }

    public void addCars() {
        allCars.add(car.newCar(1, "bmw", "A777AAA"));
        allCars.add(car.newCar(2, "toyota", "B888BBB"));
        allCars.add(car.newCar(3, "mazda", "C111AAA"));
    }

    public void clearCars(){
        allCars.clear();
    }

    public void addCar(Car car) {
        allCars.add(car);
    }

    public void deleteCar(Car car) {
        allCars.remove(car);
    }

}