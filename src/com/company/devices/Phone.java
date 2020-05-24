package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable {
    public final Double screenSize;
    public final String color;
    public Double value;


    public Phone(String model, String producer, Double screenSize, Integer yearOfProduction, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.value = 200.0;

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

    @Override
    public void Sell(Human seller, Human buyer, Double prize) {

        if (buyer.getCash() >= prize) {
            if (seller.getPhone() == this) {
                buyer.setPhone(seller.getPhone());
                seller.setCash(seller.getCash() + prize);
                buyer.setCash(buyer.getCash() - prize);
                System.out.println("Current cash of " + buyer.firstName + " is now: " + buyer.getCash() + "\n" + "Current cash of " + seller.firstName + " is now: " + seller.getCash());
            } else {
                System.out.println(seller.firstName + " doesn't have this phone ");
            }
        } else {
            System.out.println(buyer.firstName + " doesn't have the amount of money");
        }

    }
}
