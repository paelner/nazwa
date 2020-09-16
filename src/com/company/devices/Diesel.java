package com.company.devices;

public class Diesel extends Car {

    public Diesel(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color, Double value) {
        super(model, producer, engineCapacity, yearOFProduction, color, value);

    }

    @Override
    public void refuel(Double fuel) {
        System.out.println("Napelniles bak samochodu " + this.model + " o " + fuel + " litrow paliwa");
    }


}