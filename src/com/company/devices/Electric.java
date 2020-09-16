package com.company.devices;

public class Electric extends Car {

    public Electric(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color, Double value) {
        super(model, producer, engineCapacity, yearOFProduction, color, value);

    }


    @Override
    public void refuel(Double charge) {

        System.out.println("Naladowales elektryczny samochod  " + this.model + " o " + charge + " MJ");
    }


}