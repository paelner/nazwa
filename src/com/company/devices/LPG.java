package com.company.devices;

public class LPG extends Car {

    public LPG(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color, Double value) {
        super(model, producer, engineCapacity, yearOFProduction, color, value);
    }


    @Override
    public void refuel(Double gas) {

        System.out.println("Napelniles butle " + this.model + " o " + gas + " litrow gazu");
    }


}