package com.company.devices;

public class Phone extends Device {
    public final Double screenSize;
    public final String color;
    public Double value;


    public Phone(String model, String producer, Double screenSize, Integer yearOfProduction, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.value = 2.000;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", screenSize=" + screenSize +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Device " + model + " is turned on");

    }
}
