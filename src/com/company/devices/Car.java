package com.company.devices;


import com.company.Human;

public abstract class Car extends Device {
    public final Double engineCapacity;
    public final String color;
    public Double value;


    public Car(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color) {
        this.model = model;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOFProduction;
        this.color = color;
        this.value = 10000.0;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    public abstract void refuel(Double fuel);

    public static class Electric extends Car {

        public Electric(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color) {
            super(model, producer, engineCapacity, yearOFProduction, color);

        }


        @Override
        public void refuel(Double charge) {

            System.out.println("Naladowales elektryczny samochod  " + this.model + " o " + charge + " MJ");
        }


    }

    public static class Disel extends Car {

        public Disel(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color) {
            super(model, producer, engineCapacity, yearOFProduction, color);
        }

        @Override
        public void refuel(Double fuel) {
            System.out.println("Napelniles bak samochodu " + this.model + " o " + fuel + " litrow paliwa");
        }


    }

    public static class LPG extends Car {

        public LPG(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color) {
            super(model, producer, engineCapacity, yearOFProduction, color);
        }

        @Override
        public void refuel(Double gas) {

            System.out.println("Napelniles butle " + this.model + " o " + gas + " litrow gazu");
        }


    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof Car) {
            Car o = (Car) object;
            if (model.equals(o.model) && producer.equals(o.producer) && engineCapacity.equals(o.engineCapacity) && yearOfProduction.equals(o.yearOfProduction) && color.equals(o.color) && value.equals(o.value)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + model.hashCode();
        result = 31 * result + producer.hashCode();
        result = 31 * result + engineCapacity.hashCode();
        result = 31 * result + yearOfProduction.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public void turnOn() {
        System.out.println("Device " + model + " is turned on");

    }


    @Override
    public void Sell(Human seller, Human buyer, Double prize) {

        if (buyer.getCash() >= prize) {
            if (seller.getCar() == this) {
                buyer.setCar(seller.getCar());
                seller.setCash(seller.getCash() + prize);
                buyer.setCash(buyer.getCash() - prize);
                System.out.println("Current cash of " + buyer.firstName + " is now: " + buyer.getCash() + "\n" + "Current cash of " + seller.firstName + " is now: " + seller.getCash());
            } else {
                System.out.println(seller.firstName + " doesn't have this car ");
            }
        } else {
            System.out.println(buyer.firstName + " doesn't have the amount of money");
        }

    }
}
