package com.company.devices;


public abstract class Device {
    public String model;
    public String producer;
    public Integer yearOfProduction;

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void turnOn();
}
