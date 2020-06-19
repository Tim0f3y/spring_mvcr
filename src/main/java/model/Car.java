package model;


import org.springframework.stereotype.Component;

@Component
public class Car {

    int id;

    String model;

    String number;


    public Car() {
    }

    public Car(int id, String model, String number) {
        this.id = id;
        this.model = model;
        this.number = number;
    }


    public Car newCar(int id, String model, String number) {
        return new Car(id,model,number);
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }
}