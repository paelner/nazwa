package com.company.devices;


import com.company.Saleable;

public abstract class Device implements Saleable {
    public String model;
    public String producer;
    public Integer yearOfProduction;
    public Double value;


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
