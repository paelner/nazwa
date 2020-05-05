package com.company;

public class Car {
    final String model;
    final String producer;
    final Double engineCapacity;
    final Integer yearOfProduction;
    final String color;
    Double value;


    public Car(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color) {
        this.model = model;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOFProduction;
        this.color = color;
        this.value = 10000.0;
    }
}
